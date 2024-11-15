package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.plugin.services.BesuConfiguration;
import org.hyperledger.besu.plugin.services.MetricsSystem;
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
public final class DataStoreModule_ProvideWorldStateKeyValueStorageFactory implements Factory<KeyValueStorage> {
  private final DataStoreModule module;

  private final Provider<String> keyValueStorageNameProvider;

  private final Provider<BesuConfiguration> commonConfigurationProvider;

  private final Provider<MetricsSystem> metricsSystemProvider;

  public DataStoreModule_ProvideWorldStateKeyValueStorageFactory(DataStoreModule module,
      Provider<String> keyValueStorageNameProvider,
      Provider<BesuConfiguration> commonConfigurationProvider,
      Provider<MetricsSystem> metricsSystemProvider) {
    this.module = module;
    this.keyValueStorageNameProvider = keyValueStorageNameProvider;
    this.commonConfigurationProvider = commonConfigurationProvider;
    this.metricsSystemProvider = metricsSystemProvider;
  }

  @Override
  public KeyValueStorage get() {
    return provideWorldStateKeyValueStorage(module, keyValueStorageNameProvider.get(), commonConfigurationProvider.get(), metricsSystemProvider.get());
  }

  public static DataStoreModule_ProvideWorldStateKeyValueStorageFactory create(
      DataStoreModule module, Provider<String> keyValueStorageNameProvider,
      Provider<BesuConfiguration> commonConfigurationProvider,
      Provider<MetricsSystem> metricsSystemProvider) {
    return new DataStoreModule_ProvideWorldStateKeyValueStorageFactory(module, keyValueStorageNameProvider, commonConfigurationProvider, metricsSystemProvider);
  }

  public static KeyValueStorage provideWorldStateKeyValueStorage(DataStoreModule instance,
      String keyValueStorageName, BesuConfiguration commonConfiguration,
      MetricsSystem metricsSystem) {
    return Preconditions.checkNotNullFromProvides(instance.provideWorldStateKeyValueStorage(keyValueStorageName, commonConfiguration, metricsSystem));
  }
}
