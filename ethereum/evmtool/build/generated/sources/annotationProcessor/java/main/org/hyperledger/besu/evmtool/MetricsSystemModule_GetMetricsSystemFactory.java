package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.hyperledger.besu.plugin.services.MetricsSystem;

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
public final class MetricsSystemModule_GetMetricsSystemFactory implements Factory<MetricsSystem> {
  private final MetricsSystemModule module;

  public MetricsSystemModule_GetMetricsSystemFactory(MetricsSystemModule module) {
    this.module = module;
  }

  @Override
  public MetricsSystem get() {
    return getMetricsSystem(module);
  }

  public static MetricsSystemModule_GetMetricsSystemFactory create(MetricsSystemModule module) {
    return new MetricsSystemModule_GetMetricsSystemFactory(module);
  }

  public static MetricsSystem getMetricsSystem(MetricsSystemModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getMetricsSystem());
  }
}
