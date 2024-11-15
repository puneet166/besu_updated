package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.apache.tuweni.bytes.Bytes32;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.parameters.BlockParameter;
import org.hyperledger.besu.ethereum.chain.Blockchain;

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
public final class BlockchainModule_ProvideStateRootFactory implements Factory<Bytes32> {
  private final BlockchainModule module;

  private final Provider<BlockParameter> blockParameterProvider;

  private final Provider<Blockchain> blockchainProvider;

  public BlockchainModule_ProvideStateRootFactory(BlockchainModule module,
      Provider<BlockParameter> blockParameterProvider, Provider<Blockchain> blockchainProvider) {
    this.module = module;
    this.blockParameterProvider = blockParameterProvider;
    this.blockchainProvider = blockchainProvider;
  }

  @Override
  public Bytes32 get() {
    return provideStateRoot(module, blockParameterProvider.get(), blockchainProvider.get());
  }

  public static BlockchainModule_ProvideStateRootFactory create(BlockchainModule module,
      Provider<BlockParameter> blockParameterProvider, Provider<Blockchain> blockchainProvider) {
    return new BlockchainModule_ProvideStateRootFactory(module, blockParameterProvider, blockchainProvider);
  }

  public static Bytes32 provideStateRoot(BlockchainModule instance, BlockParameter blockParameter,
      Blockchain blockchain) {
    return Preconditions.checkNotNullFromProvides(instance.provideStateRoot(blockParameter, blockchain));
  }
}
