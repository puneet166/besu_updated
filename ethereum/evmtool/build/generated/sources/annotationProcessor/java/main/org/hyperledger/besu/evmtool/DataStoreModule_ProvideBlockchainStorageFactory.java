package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.ethereum.chain.BlockchainStorage;
import org.hyperledger.besu.ethereum.core.BlockHeaderFunctions;
import org.hyperledger.besu.plugin.services.storage.KeyValueStorage;

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
public final class DataStoreModule_ProvideBlockchainStorageFactory implements Factory<BlockchainStorage> {
  private final Provider<KeyValueStorage> keyValueStorageProvider;

  private final Provider<BlockHeaderFunctions> blockHashFunctionProvider;

  public DataStoreModule_ProvideBlockchainStorageFactory(
      Provider<KeyValueStorage> keyValueStorageProvider,
      Provider<BlockHeaderFunctions> blockHashFunctionProvider) {
    this.keyValueStorageProvider = keyValueStorageProvider;
    this.blockHashFunctionProvider = blockHashFunctionProvider;
  }

  @Override
  public BlockchainStorage get() {
    return provideBlockchainStorage(keyValueStorageProvider.get(), blockHashFunctionProvider.get());
  }

  public static DataStoreModule_ProvideBlockchainStorageFactory create(
      Provider<KeyValueStorage> keyValueStorageProvider,
      Provider<BlockHeaderFunctions> blockHashFunctionProvider) {
    return new DataStoreModule_ProvideBlockchainStorageFactory(keyValueStorageProvider, blockHashFunctionProvider);
  }

  public static BlockchainStorage provideBlockchainStorage(KeyValueStorage keyValueStorage,
      BlockHeaderFunctions blockHashFunction) {
    return Preconditions.checkNotNullFromProvides(DataStoreModule.provideBlockchainStorage(keyValueStorage, blockHashFunction));
  }
}
