package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.hyperledger.besu.config.GenesisConfigFile;

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
public final class GenesisFileModule_ProvidesGenesisConfigFileFactory implements Factory<GenesisConfigFile> {
  private final GenesisFileModule module;

  public GenesisFileModule_ProvidesGenesisConfigFileFactory(GenesisFileModule module) {
    this.module = module;
  }

  @Override
  public GenesisConfigFile get() {
    return providesGenesisConfigFile(module);
  }

  public static GenesisFileModule_ProvidesGenesisConfigFileFactory create(
      GenesisFileModule module) {
    return new GenesisFileModule_ProvidesGenesisConfigFileFactory(module);
  }

  public static GenesisConfigFile providesGenesisConfigFile(GenesisFileModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesGenesisConfigFile());
  }
}
