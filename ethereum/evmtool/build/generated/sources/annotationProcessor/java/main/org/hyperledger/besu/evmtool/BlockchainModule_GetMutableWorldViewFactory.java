package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.apache.tuweni.bytes.Bytes32;
import org.hyperledger.besu.ethereum.chain.GenesisState;
import org.hyperledger.besu.ethereum.worldstate.WorldStatePreimageStorage;
import org.hyperledger.besu.ethereum.worldstate.WorldStateStorage;
import org.hyperledger.besu.evm.worldstate.MutableWorldView;

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
public final class BlockchainModule_GetMutableWorldViewFactory implements Factory<MutableWorldView> {
  private final BlockchainModule module;

  private final Provider<Bytes32> stateRootProvider;

  private final Provider<WorldStateStorage> worldStateStorageProvider;

  private final Provider<WorldStatePreimageStorage> worldStatePreimageStorageProvider;

  private final Provider<GenesisState> genesisStateProvider;

  private final Provider<String> keyValueStorageNameProvider;

  public BlockchainModule_GetMutableWorldViewFactory(BlockchainModule module,
      Provider<Bytes32> stateRootProvider, Provider<WorldStateStorage> worldStateStorageProvider,
      Provider<WorldStatePreimageStorage> worldStatePreimageStorageProvider,
      Provider<GenesisState> genesisStateProvider, Provider<String> keyValueStorageNameProvider) {
    this.module = module;
    this.stateRootProvider = stateRootProvider;
    this.worldStateStorageProvider = worldStateStorageProvider;
    this.worldStatePreimageStorageProvider = worldStatePreimageStorageProvider;
    this.genesisStateProvider = genesisStateProvider;
    this.keyValueStorageNameProvider = keyValueStorageNameProvider;
  }

  @Override
  public MutableWorldView get() {
    return getMutableWorldView(module, stateRootProvider.get(), worldStateStorageProvider.get(), worldStatePreimageStorageProvider.get(), genesisStateProvider.get(), keyValueStorageNameProvider.get());
  }

  public static BlockchainModule_GetMutableWorldViewFactory create(BlockchainModule module,
      Provider<Bytes32> stateRootProvider, Provider<WorldStateStorage> worldStateStorageProvider,
      Provider<WorldStatePreimageStorage> worldStatePreimageStorageProvider,
      Provider<GenesisState> genesisStateProvider, Provider<String> keyValueStorageNameProvider) {
    return new BlockchainModule_GetMutableWorldViewFactory(module, stateRootProvider, worldStateStorageProvider, worldStatePreimageStorageProvider, genesisStateProvider, keyValueStorageNameProvider);
  }

  public static MutableWorldView getMutableWorldView(BlockchainModule instance, Bytes32 stateRoot,
      WorldStateStorage worldStateStorage, WorldStatePreimageStorage worldStatePreimageStorage,
      GenesisState genesisState, String keyValueStorageName) {
    return Preconditions.checkNotNullFromProvides(instance.getMutableWorldView(stateRoot, worldStateStorage, worldStatePreimageStorage, genesisState, keyValueStorageName));
  }
}
