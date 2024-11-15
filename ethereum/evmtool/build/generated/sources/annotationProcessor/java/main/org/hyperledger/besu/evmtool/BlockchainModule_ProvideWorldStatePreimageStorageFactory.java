package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.ethereum.worldstate.WorldStatePreimageStorage;
import org.hyperledger.besu.plugin.services.storage.KeyValueStorage;

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
public final class BlockchainModule_ProvideWorldStatePreimageStorageFactory implements Factory<WorldStatePreimageStorage> {
  private final BlockchainModule module;

  private final Provider<KeyValueStorage> keyValueStorageProvider;

  public BlockchainModule_ProvideWorldStatePreimageStorageFactory(BlockchainModule module,
      Provider<KeyValueStorage> keyValueStorageProvider) {
    this.module = module;
    this.keyValueStorageProvider = keyValueStorageProvider;
  }

  @Override
  public WorldStatePreimageStorage get() {
    return provideWorldStatePreimageStorage(module, keyValueStorageProvider.get());
  }

  public static BlockchainModule_ProvideWorldStatePreimageStorageFactory create(
      BlockchainModule module, Provider<KeyValueStorage> keyValueStorageProvider) {
    return new BlockchainModule_ProvideWorldStatePreimageStorageFactory(module, keyValueStorageProvider);
  }

  public static WorldStatePreimageStorage provideWorldStatePreimageStorage(
      BlockchainModule instance, KeyValueStorage keyValueStorage) {
    return Preconditions.checkNotNullFromProvides(instance.provideWorldStatePreimageStorage(keyValueStorage));
  }
}
