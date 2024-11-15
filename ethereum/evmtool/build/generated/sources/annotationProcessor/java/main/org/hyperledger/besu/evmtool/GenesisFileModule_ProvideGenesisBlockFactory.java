package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.ethereum.chain.GenesisState;
import org.hyperledger.besu.ethereum.core.Block;

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
public final class GenesisFileModule_ProvideGenesisBlockFactory implements Factory<Block> {
  private final GenesisFileModule module;

  private final Provider<GenesisState> genesisStateProvider;

  public GenesisFileModule_ProvideGenesisBlockFactory(GenesisFileModule module,
      Provider<GenesisState> genesisStateProvider) {
    this.module = module;
    this.genesisStateProvider = genesisStateProvider;
  }

  @Override
  public Block get() {
    return provideGenesisBlock(module, genesisStateProvider.get());
  }

  public static GenesisFileModule_ProvideGenesisBlockFactory create(GenesisFileModule module,
      Provider<GenesisState> genesisStateProvider) {
    return new GenesisFileModule_ProvideGenesisBlockFactory(module, genesisStateProvider);
  }

  public static Block provideGenesisBlock(GenesisFileModule instance, GenesisState genesisState) {
    return Preconditions.checkNotNullFromProvides(instance.provideGenesisBlock(genesisState));
  }
}
