package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.config.GenesisConfigFile;
import org.hyperledger.besu.ethereum.chain.GenesisState;
import org.hyperledger.besu.ethereum.mainnet.ProtocolSchedule;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GenesisFileModule_ProvideGenesisStateFactory implements Factory<GenesisState> {
  private final GenesisFileModule module;

  private final Provider<GenesisConfigFile> genesisConfigFileProvider;

  private final Provider<ProtocolSchedule> protocolScheduleProvider;

  public GenesisFileModule_ProvideGenesisStateFactory(GenesisFileModule module,
      Provider<GenesisConfigFile> genesisConfigFileProvider,
      Provider<ProtocolSchedule> protocolScheduleProvider) {
    this.module = module;
    this.genesisConfigFileProvider = genesisConfigFileProvider;
    this.protocolScheduleProvider = protocolScheduleProvider;
  }

  @Override
  public GenesisState get() {
    return provideGenesisState(module, genesisConfigFileProvider.get(), protocolScheduleProvider.get());
  }

  public static GenesisFileModule_ProvideGenesisStateFactory create(GenesisFileModule module,
      Provider<GenesisConfigFile> genesisConfigFileProvider,
      Provider<ProtocolSchedule> protocolScheduleProvider) {
    return new GenesisFileModule_ProvideGenesisStateFactory(module, genesisConfigFileProvider, protocolScheduleProvider);
  }

  public static GenesisState provideGenesisState(GenesisFileModule instance,
      GenesisConfigFile genesisConfigFile, ProtocolSchedule protocolSchedule) {
    return Preconditions.checkNotNullFromProvides(instance.provideGenesisState(genesisConfigFile, protocolSchedule));
  }
}
