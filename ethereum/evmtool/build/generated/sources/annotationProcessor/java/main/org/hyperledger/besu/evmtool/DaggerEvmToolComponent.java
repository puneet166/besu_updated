package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.function.Function;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.apache.tuweni.bytes.Bytes32;
import org.hyperledger.besu.config.GenesisConfigFile;
import org.hyperledger.besu.config.GenesisConfigOptions;
import org.hyperledger.besu.ethereum.chain.Blockchain;
import org.hyperledger.besu.ethereum.chain.BlockchainStorage;
import org.hyperledger.besu.ethereum.chain.GenesisState;
import org.hyperledger.besu.ethereum.core.Block;
import org.hyperledger.besu.ethereum.core.BlockHeaderFunctions;
import org.hyperledger.besu.ethereum.mainnet.ProtocolSchedule;
import org.hyperledger.besu.ethereum.mainnet.ProtocolSpec;
import org.hyperledger.besu.ethereum.worldstate.WorldStatePreimageStorage;
import org.hyperledger.besu.ethereum.worldstate.WorldStateStorage;
import org.hyperledger.besu.evm.worldstate.MutableWorldView;
import org.hyperledger.besu.evm.worldstate.WorldUpdater;
import org.hyperledger.besu.plugin.services.BesuConfiguration;
import org.hyperledger.besu.plugin.services.MetricsSystem;
import org.hyperledger.besu.plugin.services.storage.KeyValueStorage;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerEvmToolComponent {
  private DaggerEvmToolComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ProtocolModule protocolModule;

    private GenesisFileModule genesisFileModule;

    private DataStoreModule dataStoreModule;

    private BlockchainModule blockchainModule;

    private EvmToolCommandOptionsModule evmToolCommandOptionsModule;

    private MetricsSystemModule metricsSystemModule;

    private Builder() {
    }

    public Builder protocolModule(ProtocolModule protocolModule) {
      this.protocolModule = Preconditions.checkNotNull(protocolModule);
      return this;
    }

    public Builder genesisFileModule(GenesisFileModule genesisFileModule) {
      this.genesisFileModule = Preconditions.checkNotNull(genesisFileModule);
      return this;
    }

    public Builder dataStoreModule(DataStoreModule dataStoreModule) {
      this.dataStoreModule = Preconditions.checkNotNull(dataStoreModule);
      return this;
    }

    public Builder blockchainModule(BlockchainModule blockchainModule) {
      this.blockchainModule = Preconditions.checkNotNull(blockchainModule);
      return this;
    }

    public Builder evmToolCommandOptionsModule(
        EvmToolCommandOptionsModule evmToolCommandOptionsModule) {
      this.evmToolCommandOptionsModule = Preconditions.checkNotNull(evmToolCommandOptionsModule);
      return this;
    }

    public Builder metricsSystemModule(MetricsSystemModule metricsSystemModule) {
      this.metricsSystemModule = Preconditions.checkNotNull(metricsSystemModule);
      return this;
    }

    public EvmToolComponent build() {
      if (protocolModule == null) {
        this.protocolModule = new ProtocolModule();
      }
      Preconditions.checkBuilderRequirement(genesisFileModule, GenesisFileModule.class);
      if (dataStoreModule == null) {
        this.dataStoreModule = new DataStoreModule();
      }
      if (blockchainModule == null) {
        this.blockchainModule = new BlockchainModule();
      }
      if (evmToolCommandOptionsModule == null) {
        this.evmToolCommandOptionsModule = new EvmToolCommandOptionsModule();
      }
      if (metricsSystemModule == null) {
        this.metricsSystemModule = new MetricsSystemModule();
      }
      return new EvmToolComponentImpl(protocolModule, genesisFileModule, dataStoreModule, blockchainModule, evmToolCommandOptionsModule, metricsSystemModule);
    }
  }

  private static final class EvmToolComponentImpl implements EvmToolComponent {
    private final ProtocolModule protocolModule;

    private final BlockchainModule blockchainModule;

    private final EvmToolCommandOptionsModule evmToolCommandOptionsModule;

    private final EvmToolComponentImpl evmToolComponentImpl = this;

    private Provider<GenesisConfigFile> providesGenesisConfigFileProvider;

    private Provider<GenesisConfigOptions> provideGenesisConfigOptionsProvider;

    private Provider<Boolean> provideRevertReasonEnabledProvider;

    private Provider<ProtocolSchedule> provideProtocolScheduleProvider;

    private Provider<GenesisState> provideGenesisStateProvider;

    private Provider<Block> provideGenesisBlockProvider;

    private Provider<String> provideKeyValueStorageNameProvider;

    private Provider<BesuConfiguration> provideBesuConfigurationProvider;

    private Provider<MetricsSystem> getMetricsSystemProvider;

    private Provider<KeyValueStorage> provideBlockchainKeyValueStorageProvider;

    private Provider<BlockHeaderFunctions> blockHashFunctionProvider;

    private Provider<BlockchainStorage> provideBlockchainStorageProvider;

    private Provider<Blockchain> provideBlockchainProvider;

    private Provider<KeyValueStorage> provideWorldStateKeyValueStorageProvider;

    private Provider<KeyValueStorage> provideWorldStatePreimageKeyValueStorageProvider;

    private EvmToolComponentImpl(ProtocolModule protocolModuleParam,
        GenesisFileModule genesisFileModuleParam, DataStoreModule dataStoreModuleParam,
        BlockchainModule blockchainModuleParam,
        EvmToolCommandOptionsModule evmToolCommandOptionsModuleParam,
        MetricsSystemModule metricsSystemModuleParam) {
      this.protocolModule = protocolModuleParam;
      this.blockchainModule = blockchainModuleParam;
      this.evmToolCommandOptionsModule = evmToolCommandOptionsModuleParam;
      initialize(protocolModuleParam, genesisFileModuleParam, dataStoreModuleParam, blockchainModuleParam, evmToolCommandOptionsModuleParam, metricsSystemModuleParam);

    }

    private Bytes32 namedBytes32() {
      return BlockchainModule_ProvideStateRootFactory.provideStateRoot(blockchainModule, EvmToolCommandOptionsModule_ProvideBlockParameterFactory.provideBlockParameter(evmToolCommandOptionsModule), provideBlockchainProvider.get());
    }

    private WorldStateStorage worldStateStorage() {
      return BlockchainModule_ProvideWorldStateStorageFactory.provideWorldStateStorage(blockchainModule, provideWorldStateKeyValueStorageProvider.get());
    }

    private WorldStatePreimageStorage worldStatePreimageStorage() {
      return BlockchainModule_ProvideWorldStatePreimageStorageFactory.provideWorldStatePreimageStorage(blockchainModule, provideWorldStatePreimageKeyValueStorageProvider.get());
    }

    private MutableWorldView mutableWorldView() {
      return BlockchainModule_GetMutableWorldViewFactory.getMutableWorldView(blockchainModule, namedBytes32(), worldStateStorage(), worldStatePreimageStorage(), provideGenesisStateProvider.get(), EvmToolCommandOptionsModule_ProvideKeyValueStorageNameFactory.provideKeyValueStorageName(evmToolCommandOptionsModule));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ProtocolModule protocolModuleParam,
        final GenesisFileModule genesisFileModuleParam, final DataStoreModule dataStoreModuleParam,
        final BlockchainModule blockchainModuleParam,
        final EvmToolCommandOptionsModule evmToolCommandOptionsModuleParam,
        final MetricsSystemModule metricsSystemModuleParam) {
      this.providesGenesisConfigFileProvider = DoubleCheck.provider(GenesisFileModule_ProvidesGenesisConfigFileFactory.create(genesisFileModuleParam));
      this.provideGenesisConfigOptionsProvider = DoubleCheck.provider(GenesisFileModule_ProvideGenesisConfigOptionsFactory.create(genesisFileModuleParam, providesGenesisConfigFileProvider));
      this.provideRevertReasonEnabledProvider = EvmToolCommandOptionsModule_ProvideRevertReasonEnabledFactory.create(evmToolCommandOptionsModuleParam);
      this.provideProtocolScheduleProvider = DoubleCheck.provider(GenesisFileModule_ProvideProtocolScheduleFactory.create(genesisFileModuleParam, provideGenesisConfigOptionsProvider, provideRevertReasonEnabledProvider));
      this.provideGenesisStateProvider = DoubleCheck.provider(GenesisFileModule_ProvideGenesisStateFactory.create(genesisFileModuleParam, providesGenesisConfigFileProvider, provideProtocolScheduleProvider));
      this.provideGenesisBlockProvider = DoubleCheck.provider(GenesisFileModule_ProvideGenesisBlockFactory.create(genesisFileModuleParam, provideGenesisStateProvider));
      this.provideKeyValueStorageNameProvider = EvmToolCommandOptionsModule_ProvideKeyValueStorageNameFactory.create(evmToolCommandOptionsModuleParam);
      this.provideBesuConfigurationProvider = EvmToolCommandOptionsModule_ProvideBesuConfigurationFactory.create(evmToolCommandOptionsModuleParam);
      this.getMetricsSystemProvider = MetricsSystemModule_GetMetricsSystemFactory.create(metricsSystemModuleParam);
      this.provideBlockchainKeyValueStorageProvider = DoubleCheck.provider(DataStoreModule_ProvideBlockchainKeyValueStorageFactory.create(dataStoreModuleParam, provideKeyValueStorageNameProvider, provideBesuConfigurationProvider, getMetricsSystemProvider));
      this.blockHashFunctionProvider = DoubleCheck.provider(GenesisFileModule_BlockHashFunctionFactory.create(genesisFileModuleParam));
      this.provideBlockchainStorageProvider = DoubleCheck.provider(DataStoreModule_ProvideBlockchainStorageFactory.create(provideBlockchainKeyValueStorageProvider, blockHashFunctionProvider));
      this.provideBlockchainProvider = DoubleCheck.provider(BlockchainModule_ProvideBlockchainFactory.create(blockchainModuleParam, provideGenesisBlockProvider, provideBlockchainStorageProvider, getMetricsSystemProvider));
      this.provideWorldStateKeyValueStorageProvider = DoubleCheck.provider(DataStoreModule_ProvideWorldStateKeyValueStorageFactory.create(dataStoreModuleParam, provideKeyValueStorageNameProvider, provideBesuConfigurationProvider, getMetricsSystemProvider));
      this.provideWorldStatePreimageKeyValueStorageProvider = DoubleCheck.provider(DataStoreModule_ProvideWorldStatePreimageKeyValueStorageFactory.create(dataStoreModuleParam, provideKeyValueStorageNameProvider, provideBesuConfigurationProvider, getMetricsSystemProvider));
    }

    @Override
    public Function<Integer, ProtocolSpec> getProtocolSpec() {
      return ProtocolModule_GetProtocolSpecFactory.getProtocolSpec(protocolModule, provideProtocolScheduleProvider.get());
    }

    @Override
    public WorldUpdater getWorldUpdater() {
      return BlockchainModule_ProvideWorldUpdaterFactory.provideWorldUpdater(blockchainModule, mutableWorldView());
    }

    @Override
    public Blockchain getBlockchain() {
      return provideBlockchainProvider.get();
    }
  }
}
