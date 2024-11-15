package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.config.GenesisConfigOptions;
import org.hyperledger.besu.ethereum.mainnet.ProtocolSchedule;

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
public final class GenesisFileModule_ProvideProtocolScheduleFactory implements Factory<ProtocolSchedule> {
  private final GenesisFileModule module;

  private final Provider<GenesisConfigOptions> configOptionsProvider;

  private final Provider<Boolean> revertReasonEnabledProvider;

  public GenesisFileModule_ProvideProtocolScheduleFactory(GenesisFileModule module,
      Provider<GenesisConfigOptions> configOptionsProvider,
      Provider<Boolean> revertReasonEnabledProvider) {
    this.module = module;
    this.configOptionsProvider = configOptionsProvider;
    this.revertReasonEnabledProvider = revertReasonEnabledProvider;
  }

  @Override
  public ProtocolSchedule get() {
    return provideProtocolSchedule(module, configOptionsProvider.get(), revertReasonEnabledProvider.get());
  }

  public static GenesisFileModule_ProvideProtocolScheduleFactory create(GenesisFileModule module,
      Provider<GenesisConfigOptions> configOptionsProvider,
      Provider<Boolean> revertReasonEnabledProvider) {
    return new GenesisFileModule_ProvideProtocolScheduleFactory(module, configOptionsProvider, revertReasonEnabledProvider);
  }

  public static ProtocolSchedule provideProtocolSchedule(GenesisFileModule instance,
      GenesisConfigOptions configOptions, boolean revertReasonEnabled) {
    return Preconditions.checkNotNullFromProvides(instance.provideProtocolSchedule(configOptions, revertReasonEnabled));
  }
}
