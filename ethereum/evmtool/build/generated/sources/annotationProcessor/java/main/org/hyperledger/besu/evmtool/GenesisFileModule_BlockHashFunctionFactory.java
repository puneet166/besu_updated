package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.hyperledger.besu.ethereum.core.BlockHeaderFunctions;

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
public final class GenesisFileModule_BlockHashFunctionFactory implements Factory<BlockHeaderFunctions> {
  private final GenesisFileModule module;

  public GenesisFileModule_BlockHashFunctionFactory(GenesisFileModule module) {
    this.module = module;
  }

  @Override
  public BlockHeaderFunctions get() {
    return blockHashFunction(module);
  }

  public static GenesisFileModule_BlockHashFunctionFactory create(GenesisFileModule module) {
    return new GenesisFileModule_BlockHashFunctionFactory(module);
  }

  public static BlockHeaderFunctions blockHashFunction(GenesisFileModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.blockHashFunction());
  }
}
