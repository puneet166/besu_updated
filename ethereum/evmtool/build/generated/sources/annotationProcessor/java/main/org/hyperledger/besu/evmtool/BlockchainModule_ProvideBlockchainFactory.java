package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.ethereum.chain.Blockchain;
import org.hyperledger.besu.ethereum.chain.BlockchainStorage;
import org.hyperledger.besu.ethereum.core.Block;
import org.hyperledger.besu.plugin.services.MetricsSystem;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BlockchainModule_ProvideBlockchainFactory implements Factory<Blockchain> {
  private final BlockchainModule module;

  private final Provider<Block> genesisBlockProvider;

  private final Provider<BlockchainStorage> blockchainStorageProvider;

  private final Provider<MetricsSystem> metricsSystemProvider;

  public BlockchainModule_ProvideBlockchainFactory(BlockchainModule module,
      Provider<Block> genesisBlockProvider, Provider<BlockchainStorage> blockchainStorageProvider,
      Provider<MetricsSystem> metricsSystemProvider) {
    this.module = module;
    this.genesisBlockProvider = genesisBlockProvider;
    this.blockchainStorageProvider = blockchainStorageProvider;
    this.metricsSystemProvider = metricsSystemProvider;
  }

  @Override
  public Blockchain get() {
    return provideBlockchain(module, genesisBlockProvider.get(), blockchainStorageProvider.get(), metricsSystemProvider.get());
  }

  public static BlockchainModule_ProvideBlockchainFactory create(BlockchainModule module,
      Provider<Block> genesisBlockProvider, Provider<BlockchainStorage> blockchainStorageProvider,
      Provider<MetricsSystem> metricsSystemProvider) {
    return new BlockchainModule_ProvideBlockchainFactory(module, genesisBlockProvider, blockchainStorageProvider, metricsSystemProvider);
  }

  public static Blockchain provideBlockchain(BlockchainModule instance, Block genesisBlock,
      BlockchainStorage blockchainStorage, MetricsSystem metricsSystem) {
    return Preconditions.checkNotNullFromProvides(instance.provideBlockchain(genesisBlock, blockchainStorage, metricsSystem));
  }
}
