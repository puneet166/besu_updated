package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.config.GenesisConfigFile;
import org.hyperledger.besu.config.GenesisConfigOptions;

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
public final class GenesisFileModule_ProvideGenesisConfigOptionsFactory implements Factory<GenesisConfigOptions> {
  private final GenesisFileModule module;

  private final Provider<GenesisConfigFile> genesisConfigFileProvider;

  public GenesisFileModule_ProvideGenesisConfigOptionsFactory(GenesisFileModule module,
      Provider<GenesisConfigFile> genesisConfigFileProvider) {
    this.module = module;
    this.genesisConfigFileProvider = genesisConfigFileProvider;
  }

  @Override
  public GenesisConfigOptions get() {
    return provideGenesisConfigOptions(module, genesisConfigFileProvider.get());
  }

  public static GenesisFileModule_ProvideGenesisConfigOptionsFactory create(
      GenesisFileModule module, Provider<GenesisConfigFile> genesisConfigFileProvider) {
    return new GenesisFileModule_ProvideGenesisConfigOptionsFactory(module, genesisConfigFileProvider);
  }

  public static GenesisConfigOptions provideGenesisConfigOptions(GenesisFileModule instance,
      GenesisConfigFile genesisConfigFile) {
    return Preconditions.checkNotNullFromProvides(instance.provideGenesisConfigOptions(genesisConfigFile));
  }
}
