package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.hyperledger.besu.plugin.services.BesuConfiguration;

@ScopeMetadata
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
public final class EvmToolCommandOptionsModule_ProvideBesuConfigurationFactory implements Factory<BesuConfiguration> {
  private final EvmToolCommandOptionsModule module;

  public EvmToolCommandOptionsModule_ProvideBesuConfigurationFactory(
      EvmToolCommandOptionsModule module) {
    this.module = module;
  }

  @Override
  public BesuConfiguration get() {
    return provideBesuConfiguration(module);
  }

  public static EvmToolCommandOptionsModule_ProvideBesuConfigurationFactory create(
      EvmToolCommandOptionsModule module) {
    return new EvmToolCommandOptionsModule_ProvideBesuConfigurationFactory(module);
  }

  public static BesuConfiguration provideBesuConfiguration(EvmToolCommandOptionsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBesuConfiguration());
  }
}
