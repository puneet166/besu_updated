package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.parameters.BlockParameter;

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
public final class EvmToolCommandOptionsModule_ProvideBlockParameterFactory implements Factory<BlockParameter> {
  private final EvmToolCommandOptionsModule module;

  public EvmToolCommandOptionsModule_ProvideBlockParameterFactory(
      EvmToolCommandOptionsModule module) {
    this.module = module;
  }

  @Override
  public BlockParameter get() {
    return provideBlockParameter(module);
  }

  public static EvmToolCommandOptionsModule_ProvideBlockParameterFactory create(
      EvmToolCommandOptionsModule module) {
    return new EvmToolCommandOptionsModule_ProvideBlockParameterFactory(module);
  }

  public static BlockParameter provideBlockParameter(EvmToolCommandOptionsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBlockParameter());
  }
}
