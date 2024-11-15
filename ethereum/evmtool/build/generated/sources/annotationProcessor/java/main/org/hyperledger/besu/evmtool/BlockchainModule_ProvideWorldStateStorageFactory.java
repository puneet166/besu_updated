package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.ethereum.worldstate.WorldStateStorage;
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
public final class BlockchainModule_ProvideWorldStateStorageFactory implements Factory<WorldStateStorage> {
  private final BlockchainModule module;

  private final Provider<KeyValueStorage> keyValueStorageProvider;

  public BlockchainModule_ProvideWorldStateStorageFactory(BlockchainModule module,
      Provider<KeyValueStorage> keyValueStorageProvider) {
    this.module = module;
    this.keyValueStorageProvider = keyValueStorageProvider;
  }

  @Override
  public WorldStateStorage get() {
    return provideWorldStateStorage(module, keyValueStorageProvider.get());
  }

  public static BlockchainModule_ProvideWorldStateStorageFactory create(BlockchainModule module,
      Provider<KeyValueStorage> keyValueStorageProvider) {
    return new BlockchainModule_ProvideWorldStateStorageFactory(module, keyValueStorageProvider);
  }

  public static WorldStateStorage provideWorldStateStorage(BlockchainModule instance,
      KeyValueStorage keyValueStorage) {
    return Preconditions.checkNotNullFromProvides(instance.provideWorldStateStorage(keyValueStorage));
  }
}
