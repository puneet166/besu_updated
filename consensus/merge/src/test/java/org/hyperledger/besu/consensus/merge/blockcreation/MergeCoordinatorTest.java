/*
 * Copyright Hyperledger Besu Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.consensus.merge.blockcreation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.hyperledger.besu.ethereum.core.InMemoryKeyValueStorageProvider.createInMemoryBlockchain;
import static org.hyperledger.besu.ethereum.core.InMemoryKeyValueStorageProvider.createInMemoryWorldStateArchive;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.hyperledger.besu.config.MergeConfigOptions;
import org.hyperledger.besu.consensus.merge.MergeContext;
import org.hyperledger.besu.consensus.merge.blockcreation.MergeMiningCoordinator.ForkchoiceResult;
import org.hyperledger.besu.crypto.KeyPair;
import org.hyperledger.besu.crypto.SECPPrivateKey;
import org.hyperledger.besu.crypto.SignatureAlgorithm;
import org.hyperledger.besu.crypto.SignatureAlgorithmFactory;
import org.hyperledger.besu.datatypes.Address;
import org.hyperledger.besu.datatypes.Hash;
import org.hyperledger.besu.datatypes.Wei;
import org.hyperledger.besu.ethereum.ProtocolContext;
import org.hyperledger.besu.ethereum.chain.BlockAddedEvent;
import org.hyperledger.besu.ethereum.chain.BlockAddedEvent.EventType;
import org.hyperledger.besu.ethereum.chain.BlockAddedObserver;
import org.hyperledger.besu.ethereum.chain.GenesisState;
import org.hyperledger.besu.ethereum.chain.MutableBlockchain;
import org.hyperledger.besu.ethereum.core.Block;
import org.hyperledger.besu.ethereum.core.BlockBody;
import org.hyperledger.besu.ethereum.core.BlockHeader;
import org.hyperledger.besu.ethereum.core.BlockHeaderTestFixture;
import org.hyperledger.besu.ethereum.core.Difficulty;
import org.hyperledger.besu.ethereum.core.MiningParameters;
import org.hyperledger.besu.ethereum.core.Transaction;
import org.hyperledger.besu.ethereum.core.TransactionTestFixture;
import org.hyperledger.besu.ethereum.eth.manager.EthContext;
import org.hyperledger.besu.ethereum.eth.manager.EthScheduler;
import org.hyperledger.besu.ethereum.eth.sync.backwardsync.BackwardSyncContext;
import org.hyperledger.besu.ethereum.eth.transactions.ImmutableTransactionPoolConfiguration;
import org.hyperledger.besu.ethereum.eth.transactions.sorter.BaseFeePendingTransactionsSorter;
import org.hyperledger.besu.ethereum.mainnet.ProtocolSchedule;
import org.hyperledger.besu.ethereum.mainnet.feemarket.BaseFeeMarket;
import org.hyperledger.besu.ethereum.mainnet.feemarket.LondonFeeMarket;
import org.hyperledger.besu.ethereum.worldstate.WorldStateArchive;
import org.hyperledger.besu.metrics.StubMetricsSystem;
import org.hyperledger.besu.plugin.services.exception.StorageException;
import org.hyperledger.besu.testutil.TestClock;

import java.time.ZoneId;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

import com.google.common.base.Suppliers;
import org.apache.tuweni.bytes.Bytes32;
import org.apache.tuweni.units.bigints.UInt256;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(MockitoJUnitRunner.class)
public class MergeCoordinatorTest implements MergeGenesisConfigHelper {

  private static final com.google.common.base.Supplier<SignatureAlgorithm> SIGNATURE_ALGORITHM =
      Suppliers.memoize(SignatureAlgorithmFactory::getInstance);

  private static final Logger LOG = LoggerFactory.getLogger(MergeCoordinatorTest.class);
  private static final SECPPrivateKey PRIVATE_KEY1 =
      SIGNATURE_ALGORITHM
          .get()
          .createPrivateKey(
              Bytes32.fromHexString(
                  "ae6ae8e5ccbfb04590405997ee2d52d2b330726137b875053c36d94e974d162f"));
  private static final KeyPair KEYS1 =
      new KeyPair(PRIVATE_KEY1, SIGNATURE_ALGORITHM.get().createPublicKey(PRIVATE_KEY1));
  @Mock MergeContext mergeContext;
  @Mock BackwardSyncContext backwardSyncContext;
  @Mock EthContext ethContext;
  @Mock EthScheduler ethScheduler;
  private final Address coinbase = genesisAllocations(getPosGenesisConfigFile()).findFirst().get();

  @Spy
  MiningParameters miningParameters = new MiningParameters.Builder().coinbase(coinbase).build();

  private MergeCoordinator coordinator;
  private ProtocolContext protocolContext;

  private final ProtocolSchedule mockProtocolSchedule = getMergeProtocolSchedule();
  private final GenesisState genesisState =
      GenesisState.fromConfig(getPosGenesisConfigFile(), mockProtocolSchedule);

  private final WorldStateArchive worldStateArchive = createInMemoryWorldStateArchive();

  private final MutableBlockchain blockchain =
      spy(createInMemoryBlockchain(genesisState.getBlock()));

  private final Address suggestedFeeRecipient = Address.ZERO;
  private final BlockHeaderTestFixture headerGenerator = new BlockHeaderTestFixture();
  private final BaseFeeMarket feeMarket =
      new LondonFeeMarket(0, genesisState.getBlock().getHeader().getBaseFee());

  private final org.hyperledger.besu.metrics.StubMetricsSystem metricsSystem =
      new StubMetricsSystem();

  private final BaseFeePendingTransactionsSorter transactions =
      new BaseFeePendingTransactionsSorter(
          ImmutableTransactionPoolConfiguration.builder().txPoolMaxSize(10).build(),
          TestClock.system(ZoneId.systemDefault()),
          metricsSystem,
          MergeCoordinatorTest::mockBlockHeader);

  final Transaction localTransaction0 = createTransaction(0);

  @Before
  public void setUp() {
    when(mergeContext.as(MergeContext.class)).thenReturn(mergeContext);
    when(mergeContext.getTerminalTotalDifficulty())
        .thenReturn(genesisState.getBlock().getHeader().getDifficulty().plus(1L));
    when(mergeContext.getTerminalPoWBlock()).thenReturn(Optional.of(terminalPowBlock()));
    protocolContext = new ProtocolContext(blockchain, worldStateArchive, mergeContext);
    var mutable = worldStateArchive.getMutable();
    genesisState.writeStateTo(mutable);
    mutable.persist(null);

    when(ethContext.getScheduler()).thenReturn(ethScheduler);
    when(ethScheduler.scheduleComputationTask(any()))
        .thenAnswer(i -> CompletableFuture.completedFuture(i.getArgument(0, Supplier.class).get()));

    MergeConfigOptions.setMergeEnabled(true);
    this.coordinator =
        new MergeCoordinator(
            protocolContext,
            mockProtocolSchedule,
            ethContext,
            transactions,
            miningParameters,
            backwardSyncContext);
  }

  @Test
  public void coinbaseShouldMatchSuggestedFeeRecipient() {
    when(mergeContext.getFinalized()).thenReturn(Optional.empty());

    var payloadId =
        coordinator.preparePayload(
            genesisState.getBlock().getHeader(),
            System.currentTimeMillis() / 1000,
            Bytes32.ZERO,
            suggestedFeeRecipient);

    ArgumentCaptor<Block> block = ArgumentCaptor.forClass(Block.class);

    verify(mergeContext, atLeastOnce()).putPayloadById(eq(payloadId), block.capture());

    assertThat(block.getValue().getHeader().getCoinbase()).isEqualTo(suggestedFeeRecipient);
  }

  @Test
  public void shouldRetryBlockCreationIfStillHaveTime() {
    when(mergeContext.getFinalized()).thenReturn(Optional.empty());
    reset(ethContext, ethScheduler);
    when(ethContext.getScheduler()).thenReturn(ethScheduler);
    when(ethScheduler.scheduleComputationTask(any()))
        .thenReturn(CompletableFuture.failedFuture(new StorageException("lock")))
        .thenAnswer(i -> CompletableFuture.completedFuture(i.getArgument(0, Supplier.class).get()));

    transactions.addLocalTransaction(localTransaction0, Optional.empty());

    var payloadId =
        coordinator.preparePayload(
            genesisState.getBlock().getHeader(),
            System.currentTimeMillis() / 1000,
            Bytes32.ZERO,
            suggestedFeeRecipient);

    ArgumentCaptor<Block> block = ArgumentCaptor.forClass(Block.class);

    verify(mergeContext, times(2)).putPayloadById(eq(payloadId), block.capture());
    verify(ethScheduler, times(2)).scheduleComputationTask(any());

    assertThat(block.getAllValues().size()).isEqualTo(2);
    assertThat(block.getAllValues().get(0).getBody().getTransactions()).hasSize(0);
    assertThat(block.getAllValues().get(1).getBody().getTransactions()).hasSize(1);
  }

  @Test
  public void shouldStopRetryBlockCreationIfTimeExpired() {
    when(mergeContext.getFinalized()).thenReturn(Optional.empty());
    doReturn(1L).when(miningParameters).getPosBlockCreationTimeout();
    reset(ethContext, ethScheduler);
    when(ethContext.getScheduler()).thenReturn(ethScheduler);
    when(ethScheduler.scheduleComputationTask(any()))
        .thenReturn(
            CompletableFuture.supplyAsync(
                () -> {
                  try {
                    Thread.sleep(1000L);
                  } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                  }
                  return CompletableFuture.failedFuture(new RuntimeException());
                }))
        .thenAnswer(i -> fail("Must not be called twice"));

    var payloadId =
        coordinator.preparePayload(
            genesisState.getBlock().getHeader(),
            System.currentTimeMillis() / 1000,
            Bytes32.ZERO,
            suggestedFeeRecipient);

    ArgumentCaptor<Block> block = ArgumentCaptor.forClass(Block.class);

    verify(mergeContext, times(1)).putPayloadById(eq(payloadId), block.capture());
    verify(ethScheduler, times(1)).scheduleComputationTask(any());
  }

  @Test
  public void childTimestampExceedsParentsFails() {
    BlockHeader terminalHeader = terminalPowBlock();
    sendNewPayloadAndForkchoiceUpdate(
        new Block(terminalHeader, BlockBody.empty()), Optional.empty(), Hash.ZERO);

    BlockHeader parentHeader = nextBlockHeader(terminalHeader);
    Block parent = new Block(parentHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(parent, Optional.empty(), terminalHeader.getHash());

    BlockHeader childHeader = nextBlockHeader(parentHeader, parentHeader.getTimestamp());
    Block child = new Block(childHeader, BlockBody.empty());
    coordinator.rememberBlock(child);

    ForkchoiceResult result =
        coordinator.updateForkChoice(
            childHeader, terminalHeader.getHash(), terminalHeader.getHash(), Optional.empty());

    assertThat(result.isValid()).isFalse();
    assertThat(result.getErrorMessage()).isPresent();
    assertThat(result.getErrorMessage().get())
        .isEqualTo("new head timestamp not greater than parent");

    verify(blockchain, never()).setFinalized(childHeader.getHash());
    verify(mergeContext, never()).setFinalized(childHeader);
    verify(blockchain, never()).setSafeBlock(childHeader.getHash());
    verify(mergeContext, never()).setSafeBlock(childHeader);

    assertThat(this.coordinator.latestValidAncestorDescendsFromTerminal(child.getHeader()))
        .isTrue();
  }

  @Test
  public void latestValidAncestorDescendsFromTerminal() {
    BlockHeader terminalHeader = terminalPowBlock();
    sendNewPayloadAndForkchoiceUpdate(
        new Block(terminalHeader, BlockBody.empty()), Optional.empty(), Hash.ZERO);

    BlockHeader parentHeader = nextBlockHeader(terminalHeader);
    Block parent = new Block(parentHeader, BlockBody.empty());

    // if latest valid ancestor is PoW, then latest valid hash should be Hash.ZERO
    var lvh = this.coordinator.getLatestValidAncestor(parentHeader);
    assertThat(lvh).isPresent();
    assertThat(lvh.get()).isEqualTo(Hash.ZERO);

    sendNewPayloadAndForkchoiceUpdate(parent, Optional.empty(), terminalHeader.getHash());
    BlockHeader childHeader = nextBlockHeader(parentHeader);
    Block child = new Block(childHeader, BlockBody.empty());
    coordinator.validateBlock(child);
    assertThat(this.coordinator.latestValidAncestorDescendsFromTerminal(child.getHeader()))
        .isTrue();
    var nextLvh = this.coordinator.getLatestValidAncestor(childHeader);
    assertThat(nextLvh).isPresent();
    assertThat(nextLvh.get()).isEqualTo(parentHeader.getHash());
  }

  @Test
  public void latestValidAncestorDescendsFromFinalizedBlock() {
    BlockHeader terminalHeader = terminalPowBlock();
    sendNewPayloadAndForkchoiceUpdate(
        new Block(terminalHeader, BlockBody.empty()), Optional.empty(), Hash.ZERO);

    BlockHeader grandParentHeader = nextBlockHeader(terminalHeader);
    Block grandParent = new Block(grandParentHeader, BlockBody.empty());

    // if latest valid ancestor is PoW, then latest valid hash should be Hash.ZERO
    var lvh = this.coordinator.getLatestValidAncestor(grandParentHeader);
    assertThat(lvh).isPresent();
    assertThat(lvh.get()).isEqualTo(Hash.ZERO);

    sendNewPayloadAndForkchoiceUpdate(grandParent, Optional.empty(), terminalHeader.getHash());
    BlockHeader parentHeader = nextBlockHeader(grandParentHeader);
    Block parent = new Block(parentHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(
        parent, Optional.of(grandParentHeader), grandParentHeader.getHash());

    BlockHeader childHeader = nextBlockHeader(parentHeader);
    Block child = new Block(childHeader, BlockBody.empty());
    coordinator.validateBlock(child);

    assertThat(this.coordinator.latestValidAncestorDescendsFromTerminal(child.getHeader()))
        .isTrue();

    var nextLvh = this.coordinator.getLatestValidAncestor(childHeader);
    assertThat(nextLvh).isPresent();
    assertThat(nextLvh.get()).isEqualTo(parentHeader.getHash());

    verify(mergeContext, never()).getTerminalPoWBlock();
  }

  @Test
  public void updateForkChoiceShouldPersistFirstFinalizedBlockHash() {
    BlockHeader terminalHeader = terminalPowBlock();
    sendNewPayloadAndForkchoiceUpdate(
        new Block(terminalHeader, BlockBody.empty()), Optional.empty(), Hash.ZERO);

    BlockHeader firstFinalizedHeader = nextBlockHeader(terminalHeader);
    Block firstFinalizedBlock = new Block(firstFinalizedHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(
        firstFinalizedBlock, Optional.empty(), terminalHeader.getHash());

    BlockHeader headBlockHeader = nextBlockHeader(firstFinalizedHeader);
    Block headBlock = new Block(headBlockHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(
        headBlock, Optional.of(firstFinalizedHeader), firstFinalizedHeader.getHash());

    verify(blockchain).setFinalized(firstFinalizedBlock.getHash());
    verify(mergeContext).setFinalized(firstFinalizedHeader);
    verify(blockchain).setSafeBlock(firstFinalizedBlock.getHash());
    verify(mergeContext).setSafeBlock(firstFinalizedHeader);
  }

  @Test
  public void reorgAroundLogBloomCacheUpdate() {
    // generate 5 blocks, remember them in order, all need to be parented correctly.
    BlockHeader prevParent = genesisState.getBlock().getHeader();

    AtomicReference<BlockAddedEvent> lastBlockAddedEvent = new AtomicReference<>();
    blockchain.observeBlockAdded(
        new BlockAddedObserver() {
          @Override
          public void onBlockAdded(final BlockAddedEvent event) {
            LOG.info(event.toString());
            lastBlockAddedEvent.set(event);
          }
        });
    for (int i = 0; i <= 5; i++) {
      BlockHeader nextBlock =
          nextBlockHeader(
              prevParent, genesisState.getBlock().getHeader().getTimestamp() + i * 1000);
      coordinator.rememberBlock(new Block(nextBlock, BlockBody.empty()));
      prevParent = nextBlock;
    }

    coordinator.updateForkChoice(
        prevParent,
        genesisState.getBlock().getHash(),
        genesisState.getBlock().getHash(),
        Optional.empty());
    Hash expectedCommonAncestor = blockchain.getBlockHeader(2).get().getBlockHash();

    // generate from 3' down to some other head. Remeber those.
    BlockHeader forkPoint = blockchain.getBlockHeader(2).get();
    prevParent = forkPoint;
    for (int i = 3; i <= 5; i++) {
      BlockHeader nextPrime =
          nextBlockHeader(
              prevParent, genesisState.getBlock().getHeader().getTimestamp() + i * 1001);
      coordinator.rememberBlock(new Block(nextPrime, BlockBody.empty()));
      prevParent = nextPrime;
    }
    coordinator.updateForkChoice(
        prevParent,
        genesisState.getBlock().getHash(),
        genesisState.getBlock().getHash(),
        Optional.empty());
    assertThat(lastBlockAddedEvent.get().getCommonAncestorHash()).isEqualTo(expectedCommonAncestor);
    assertThat(lastBlockAddedEvent.get().getEventType()).isEqualTo(EventType.CHAIN_REORG);
    assertThat(lastBlockAddedEvent.get().getBlock().getHash()).isEqualTo(prevParent.getBlockHash());
  }

  @Test
  public void updateForkChoiceShouldPersistLastFinalizedBlockHash() {
    BlockHeader terminalHeader = terminalPowBlock();
    sendNewPayloadAndForkchoiceUpdate(
        new Block(terminalHeader, BlockBody.empty()), Optional.empty(), Hash.ZERO);

    BlockHeader prevFinalizedHeader = nextBlockHeader(terminalHeader);
    Block prevFinalizedBlock = new Block(prevFinalizedHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(
        prevFinalizedBlock, Optional.empty(), terminalHeader.getHash());

    BlockHeader lastFinalizedHeader = nextBlockHeader(prevFinalizedHeader);
    Block lastFinalizedBlock = new Block(lastFinalizedHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(
        lastFinalizedBlock, Optional.of(prevFinalizedHeader), prevFinalizedHeader.getHash());

    BlockHeader headBlockHeader = nextBlockHeader(lastFinalizedHeader);
    Block headBlock = new Block(headBlockHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(
        headBlock, Optional.of(lastFinalizedHeader), lastFinalizedHeader.getHash());

    verify(blockchain).setFinalized(lastFinalizedBlock.getHash());
    verify(mergeContext).setFinalized(lastFinalizedHeader);
    verify(blockchain).setSafeBlock(lastFinalizedBlock.getHash());
    verify(mergeContext).setSafeBlock(lastFinalizedHeader);
  }

  @Test
  public void assertGetOrSyncForBlockAlreadyPresent() {
    BlockHeader mockHeader =
        headerGenerator.parentHash(Hash.fromHexStringLenient("0xdead")).buildHeader();
    when(blockchain.getBlockHeader(mockHeader.getHash())).thenReturn(Optional.of(mockHeader));
    var res = coordinator.getOrSyncHeaderByHash(mockHeader.getHash());

    assertThat(res).isPresent();
  }

  @Test
  public void assertGetOrSyncForBlockNotPresent() {
    BlockHeader mockHeader =
        headerGenerator.parentHash(Hash.fromHexStringLenient("0xbeef")).buildHeader();
    when(backwardSyncContext.syncBackwardsUntil(mockHeader.getBlockHash()))
        .thenReturn(CompletableFuture.completedFuture(null));

    var res = coordinator.getOrSyncHeaderByHash(mockHeader.getHash());

    assertThat(res).isNotPresent();
  }

  @Test
  public void ancestorIsValidTerminalProofOfWork() {
    final long howDeep = 100L;
    assertThat(
            terminalAncestorMock(howDeep, true)
                .ancestorIsValidTerminalProofOfWork(
                    new BlockHeaderTestFixture().number(howDeep).buildHeader()))
        .isTrue();
  }

  @Test
  public void assertCachedUnfinalizedAncestorDescendsFromTTD() {
    final long howDeep = 10;
    var mockBlockHeader = new BlockHeaderTestFixture().number(howDeep).buildHeader();
    var mockCoordinator = terminalAncestorMock(howDeep, true);
    assertThat(
            mockCoordinator.ancestorIsValidTerminalProofOfWork(
                new BlockHeaderTestFixture().number(howDeep).buildHeader()))
        .isTrue();

    // assert that parent block was cached as descending from TTD
    assertThat(
            mockCoordinator.ancestorIsValidTerminalProofOfWork(
                new BlockHeaderTestFixture()
                    .number(howDeep + 1)
                    .parentHash(mockBlockHeader.getHash())
                    .buildHeader()))
        .isTrue();
  }

  @Test
  public void ancestorNotFoundValidTerminalProofOfWork() {
    final long howDeep = 10L;
    assertThat(
            terminalAncestorMock(howDeep, false)
                .ancestorIsValidTerminalProofOfWork(
                    new BlockHeaderTestFixture().number(howDeep).buildHeader()))
        .isFalse();
  }

  @Test
  public void assertNonGenesisTerminalBlockSatisfiesDescendsFromTerminal() {

    var mockConsensusContext = mock(MergeContext.class);
    when(mockConsensusContext.getTerminalTotalDifficulty()).thenReturn(Difficulty.of(1337L));
    var mockBlockchain = mock(MutableBlockchain.class);
    var mockProtocolContext = mock(ProtocolContext.class);
    when(mockProtocolContext.getBlockchain()).thenReturn(mockBlockchain);
    when(mockProtocolContext.getConsensusContext(MergeContext.class))
        .thenReturn(mockConsensusContext);

    var mockHeaderBuilder = new BlockHeaderTestFixture();

    MergeCoordinator mockCoordinator =
        new MergeCoordinator(
            mockProtocolContext,
            mockProtocolSchedule,
            ethContext,
            transactions,
            new MiningParameters.Builder().coinbase(coinbase).build(),
            mock(BackwardSyncContext.class));

    var blockZero = mockHeaderBuilder.number(0L).difficulty(Difficulty.of(1336L)).buildHeader();
    var blockOne =
        mockHeaderBuilder
            .number(1L)
            .difficulty(Difficulty.ONE)
            .parentHash(blockZero.getHash())
            .buildHeader();
    var blockTwo =
        mockHeaderBuilder
            .number(2L)
            .difficulty(Difficulty.ZERO)
            .parentHash(blockOne.getHash())
            .buildHeader();
    var blockThree = mockHeaderBuilder.number(3L).parentHash(blockTwo.getHash()).buildHeader();

    when(mockBlockchain.getTotalDifficultyByHash(any()))
        .thenReturn(Optional.of(Difficulty.of(1337L)));
    when(mockBlockchain.getTotalDifficultyByHash(blockZero.getHash()))
        .thenReturn(Optional.of(Difficulty.of(1336L)));

    when(mockBlockchain.getBlockHeader(blockOne.getHash())).thenReturn(Optional.of(blockOne));
    when(mockBlockchain.getBlockHeader(blockTwo.getHash())).thenReturn(Optional.of(blockTwo));
    when(mockBlockchain.getBlockHeader(blockThree.getHash())).thenReturn(Optional.of(blockThree));

    // assert pre-merge genesis block does not descend from terminal
    assertThat(mockCoordinator.latestValidAncestorDescendsFromTerminal(blockZero)).isFalse();
    assertThat(mockCoordinator.latestDescendsFromTerminal.get()).isNull();
    // assert TTD merge block (1) descends from terminal returns true
    assertThat(mockCoordinator.latestValidAncestorDescendsFromTerminal(blockOne)).isTrue();
    assertThat(mockCoordinator.latestDescendsFromTerminal.get()).isNull();
    // assert post-merge block (2) descends from terminal returns true
    assertThat(mockCoordinator.latestValidAncestorDescendsFromTerminal(blockTwo)).isTrue();
    assertThat(mockCoordinator.latestDescendsFromTerminal.get()).isEqualTo(blockTwo);
    // assert post-merge block (3) descends from terminal returns true
    assertThat(mockCoordinator.latestValidAncestorDescendsFromTerminal(blockThree)).isTrue();
    assertThat(mockCoordinator.latestDescendsFromTerminal.get()).isEqualTo(blockThree);
  }

  @Test
  public void assertMergeAtGenesisSatisifiesTerminalPoW() {
    var mockConsensusContext = mock(MergeContext.class);
    when(mockConsensusContext.getTerminalTotalDifficulty()).thenReturn(Difficulty.of(1337L));
    var mockBlockchain = mock(MutableBlockchain.class);
    when(mockBlockchain.getTotalDifficultyByHash(any(Hash.class)))
        .thenReturn(Optional.of(Difficulty.of(1337L)));
    var mockProtocolContext = mock(ProtocolContext.class);
    when(mockProtocolContext.getBlockchain()).thenReturn(mockBlockchain);
    when(mockProtocolContext.getConsensusContext(MergeContext.class))
        .thenReturn(mockConsensusContext);

    var mockHeaderBuilder = new BlockHeaderTestFixture();

    MergeCoordinator mockCoordinator =
        new MergeCoordinator(
            mockProtocolContext,
            mockProtocolSchedule,
            ethContext,
            transactions,
            new MiningParameters.Builder().coinbase(coinbase).build(),
            mock(BackwardSyncContext.class));

    var blockZero = mockHeaderBuilder.number(0L).buildHeader();
    var blockOne = mockHeaderBuilder.number(1L).parentHash(blockZero.getHash()).buildHeader();

    // assert total difficulty found for block 1 return true if post-merge
    assertThat(mockCoordinator.latestValidAncestorDescendsFromTerminal(blockOne)).isTrue();
    // change mock behavior to not find TTD for block 1 and defer to parent
    when(mockBlockchain.getTotalDifficultyByHash(blockOne.getBlockHash()))
        .thenReturn(Optional.empty());
    // assert total difficulty NOT found for block 1 returns true if parent is post-merge
    assertThat(mockCoordinator.latestValidAncestorDescendsFromTerminal(blockOne)).isTrue();
    // assert true if we send in a merge-at-genesis block
    assertThat(mockCoordinator.latestValidAncestorDescendsFromTerminal(blockZero)).isTrue();

    // change mock TTD so that neither block satisfies TTD condition:
    when(mockConsensusContext.getTerminalTotalDifficulty())
        .thenReturn(Difficulty.of(UInt256.fromHexString("0xdeadbeef")));
    assertThat(mockCoordinator.latestValidAncestorDescendsFromTerminal(blockOne)).isFalse();
    // assert true if we send in a merge-at-genesis block
    assertThat(mockCoordinator.latestValidAncestorDescendsFromTerminal(blockZero)).isFalse();
  }

  @Test
  public void invalidPayloadShouldReturnErrorAndUpdateForkchoiceState() {
    BlockHeader terminalHeader = terminalPowBlock();
    sendNewPayloadAndForkchoiceUpdate(
        new Block(terminalHeader, BlockBody.empty()), Optional.empty(), Hash.ZERO);

    BlockHeader prevFinalizedHeader = nextBlockHeader(terminalHeader);
    Block prevFinalizedBlock = new Block(prevFinalizedHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(
        prevFinalizedBlock, Optional.empty(), terminalHeader.getHash());

    BlockHeader lastFinalizedHeader = nextBlockHeader(prevFinalizedHeader);
    Block lastFinalizedBlock = new Block(lastFinalizedHeader, BlockBody.empty());

    sendNewPayloadAndForkchoiceUpdate(
        lastFinalizedBlock, Optional.of(prevFinalizedHeader), prevFinalizedHeader.getHash());

    BlockHeader headBlockHeader = nextBlockHeader(lastFinalizedHeader);
    Block headBlock = new Block(headBlockHeader, BlockBody.empty());
    assertThat(coordinator.rememberBlock(headBlock).blockProcessingOutputs).isPresent();

    var res =
        coordinator.updateForkChoice(
            headBlockHeader,
            lastFinalizedBlock.getHash(),
            lastFinalizedBlock.getHash(),
            Optional.of(
                new PayloadAttributes(
                    headBlockHeader.getTimestamp() - 1, Hash.ZERO, Address.ZERO)));

    assertThat(res.isValid()).isFalse();
    assertThat(res.getStatus()).isEqualTo(ForkchoiceResult.Status.INVALID_PAYLOAD_ATTRIBUTES);

    verify(blockchain).setFinalized(lastFinalizedBlock.getHash());
    verify(mergeContext).setFinalized(lastFinalizedHeader);
    verify(blockchain).setSafeBlock(lastFinalizedBlock.getHash());
    verify(mergeContext).setSafeBlock(lastFinalizedHeader);
  }

  @Test
  public void forkchoiceUpdateShouldIgnoreAncestorOfChainHead() {
    BlockHeader terminalHeader = terminalPowBlock();
    sendNewPayloadAndForkchoiceUpdate(
        new Block(terminalHeader, BlockBody.empty()), Optional.empty(), Hash.ZERO);

    BlockHeader parentHeader = nextBlockHeader(terminalHeader);
    Block parent = new Block(parentHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(parent, Optional.empty(), terminalHeader.getHash());

    BlockHeader childHeader = nextBlockHeader(parentHeader);
    Block child = new Block(childHeader, BlockBody.empty());
    sendNewPayloadAndForkchoiceUpdate(child, Optional.empty(), parent.getHash());

    ForkchoiceResult res =
        coordinator.updateForkChoice(
            parentHeader,
            Hash.ZERO,
            terminalHeader.getHash(),
            Optional.of(
                new PayloadAttributes(parentHeader.getTimestamp() + 1, Hash.ZERO, Address.ZERO)));

    assertThat(res.getStatus()).isEqualTo(ForkchoiceResult.Status.IGNORE_UPDATE_TO_OLD_HEAD);
    assertThat(res.getNewHead().isEmpty()).isTrue();
    assertThat(res.getLatestValid().isPresent()).isTrue();
    assertThat(res.getLatestValid().get()).isEqualTo(parentHeader.getHash());
    assertThat(res.getErrorMessage().isEmpty()).isTrue();

    verify(blockchain, never()).rewindToBlock(any());
  }

  private void sendNewPayloadAndForkchoiceUpdate(
      final Block block, final Optional<BlockHeader> finalizedHeader, final Hash safeHash) {

    assertThat(coordinator.rememberBlock(block).blockProcessingOutputs).isPresent();
    assertThat(
            coordinator
                .updateForkChoice(
                    block.getHeader(),
                    finalizedHeader.map(BlockHeader::getHash).orElse(Hash.ZERO),
                    safeHash,
                    Optional.empty())
                .isValid())
        .isTrue();

    when(mergeContext.getFinalized()).thenReturn(finalizedHeader);
  }

  private BlockHeader terminalPowBlock() {
    return headerGenerator
        .difficulty(Difficulty.MAX_VALUE)
        .parentHash(genesisState.getBlock().getHash())
        .number(genesisState.getBlock().getHeader().getNumber() + 1)
        .baseFeePerGas(
            feeMarket.computeBaseFee(
                genesisState.getBlock().getHeader().getNumber() + 1,
                genesisState.getBlock().getHeader().getBaseFee().orElse(Wei.of(0x3b9aca00)),
                0,
                15000000l))
        .timestamp(1)
        .gasLimit(genesisState.getBlock().getHeader().getGasLimit())
        .stateRoot(genesisState.getBlock().getHeader().getStateRoot())
        .buildHeader();
  }

  private BlockHeader nextBlockHeader(
      final BlockHeader parentHeader, final long... optionalTimestamp) {

    return headerGenerator
        .difficulty(Difficulty.ZERO)
        .parentHash(parentHeader.getHash())
        .gasLimit(genesisState.getBlock().getHeader().getGasLimit())
        .number(parentHeader.getNumber() + 1)
        .stateRoot(genesisState.getBlock().getHeader().getStateRoot())
        .timestamp(
            optionalTimestamp.length > 0 ? optionalTimestamp[0] : parentHeader.getTimestamp() + 12)
        .baseFeePerGas(
            feeMarket.computeBaseFee(
                genesisState.getBlock().getHeader().getNumber() + 1,
                parentHeader.getBaseFee().orElse(Wei.of(0x3b9aca00)),
                0,
                15000000l))
        .buildHeader();
  }

  MergeCoordinator terminalAncestorMock(final long chainDepth, final boolean hasTerminalPoW) {
    final Difficulty mockTTD = Difficulty.of(1000);
    BlockHeaderTestFixture builder = new BlockHeaderTestFixture().baseFeePerGas(Wei.ONE);
    MutableBlockchain mockBlockchain = mock(MutableBlockchain.class);

    BlockHeader terminal =
        spy(
            builder
                .number(0L)
                .difficulty(hasTerminalPoW ? mockTTD : Difficulty.ZERO)
                .buildHeader());
    when(terminal.getParentHash()).thenReturn(Hash.ZERO);

    // return decreasing numbered blocks:
    final var invocations = new AtomicLong(chainDepth);
    when(mockBlockchain.getBlockHeader(any()))
        .thenAnswer(
            z ->
                Optional.of(
                    (invocations.decrementAndGet() < 1)
                        ? terminal
                        : builder
                            .difficulty(Difficulty.ZERO)
                            .number(invocations.get())
                            .buildHeader()));

    // mock total difficulty for isTerminalProofOfWorkBlock invocation:
    when(mockBlockchain.getTotalDifficultyByHash(any())).thenReturn(Optional.of(Difficulty.ZERO));
    when(mockBlockchain.getBlockHeader(Hash.ZERO)).thenReturn(Optional.empty());

    var mockContext = mock(MergeContext.class);
    when(mockContext.getTerminalTotalDifficulty()).thenReturn(mockTTD);
    ProtocolContext mockProtocolContext = mock(ProtocolContext.class);
    when(mockProtocolContext.getBlockchain()).thenReturn(mockBlockchain);
    when(mockProtocolContext.getConsensusContext(any())).thenReturn(mockContext);

    MergeCoordinator mockCoordinator =
        spy(
            new MergeCoordinator(
                mockProtocolContext,
                mockProtocolSchedule,
                ethContext,
                transactions,
                new MiningParameters.Builder().coinbase(coinbase).build(),
                mock(BackwardSyncContext.class)));

    return mockCoordinator;
  }

  private Transaction createTransaction(final long transactionNumber) {
    return new TransactionTestFixture()
        .value(Wei.of(transactionNumber + 1))
        .to(Optional.of(Address.ZERO))
        .gasLimit(53000L)
        .gasPrice(
            Wei.fromHexString("0x00000000000000000000000000000000000000000000000000000013b9aca00"))
        .maxFeePerGas(
            Optional.of(
                Wei.fromHexString(
                    "0x00000000000000000000000000000000000000000000000000000013b9aca00")))
        .maxPriorityFeePerGas(Optional.of(Wei.of(100_000)))
        .nonce(transactionNumber)
        .createTransaction(KEYS1);
  }

  private static BlockHeader mockBlockHeader() {
    final BlockHeader blockHeader = mock(BlockHeader.class);
    when(blockHeader.getBaseFee()).thenReturn(Optional.of(Wei.ONE));
    return blockHeader;
  }
}