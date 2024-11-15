package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class EvmToolCommandOptionsModule_ProvideRevertReasonEnabledFactory implements Factory<Boolean> {
  private final EvmToolCommandOptionsModule module;

  public EvmToolCommandOptionsModule_ProvideRevertReasonEnabledFactory(
      EvmToolCommandOptionsModule module) {
    this.module = module;
  }

  @Override
  public Boolean get() {
    return provideRevertReasonEnabled(module);
  }

  public static EvmToolCommandOptionsModule_ProvideRevertReasonEnabledFactory create(
      EvmToolCommandOptionsModule module) {
    return new EvmToolCommandOptionsModule_ProvideRevertReasonEnabledFactory(module);
  }

  public static boolean provideRevertReasonEnabled(EvmToolCommandOptionsModule instance) {
    return instance.provideRevertReasonEnabled();
  }
}
