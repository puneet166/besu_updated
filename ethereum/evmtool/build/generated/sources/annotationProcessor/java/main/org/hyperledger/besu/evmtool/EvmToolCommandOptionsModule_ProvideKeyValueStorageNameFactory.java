package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class EvmToolCommandOptionsModule_ProvideKeyValueStorageNameFactory implements Factory<String> {
  private final EvmToolCommandOptionsModule module;

  public EvmToolCommandOptionsModule_ProvideKeyValueStorageNameFactory(
      EvmToolCommandOptionsModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideKeyValueStorageName(module);
  }

  public static EvmToolCommandOptionsModule_ProvideKeyValueStorageNameFactory create(
      EvmToolCommandOptionsModule module) {
    return new EvmToolCommandOptionsModule_ProvideKeyValueStorageNameFactory(module);
  }

  public static String provideKeyValueStorageName(EvmToolCommandOptionsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideKeyValueStorageName());
  }
}
