package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.evm.worldstate.MutableWorldView;
import org.hyperledger.besu.evm.worldstate.WorldUpdater;

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
public final class BlockchainModule_ProvideWorldUpdaterFactory implements Factory<WorldUpdater> {
  private final BlockchainModule module;

  private final Provider<MutableWorldView> mutableWorldViewProvider;

  public BlockchainModule_ProvideWorldUpdaterFactory(BlockchainModule module,
      Provider<MutableWorldView> mutableWorldViewProvider) {
    this.module = module;
    this.mutableWorldViewProvider = mutableWorldViewProvider;
  }

  @Override
  public WorldUpdater get() {
    return provideWorldUpdater(module, mutableWorldViewProvider.get());
  }

  public static BlockchainModule_ProvideWorldUpdaterFactory create(BlockchainModule module,
      Provider<MutableWorldView> mutableWorldViewProvider) {
    return new BlockchainModule_ProvideWorldUpdaterFactory(module, mutableWorldViewProvider);
  }

  public static WorldUpdater provideWorldUpdater(BlockchainModule instance,
      MutableWorldView mutableWorldView) {
    return Preconditions.checkNotNullFromProvides(instance.provideWorldUpdater(mutableWorldView));
  }
}
