package org.hyperledger.besu.evmtool;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.function.Function;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hyperledger.besu.ethereum.mainnet.ProtocolSchedule;
import org.hyperledger.besu.ethereum.mainnet.ProtocolSpec;

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
public final class ProtocolModule_GetProtocolSpecFactory implements Factory<Function<Integer, ProtocolSpec>> {
  private final ProtocolModule module;

  private final Provider<ProtocolSchedule> protocolScheduleProvider;

  public ProtocolModule_GetProtocolSpecFactory(ProtocolModule module,
      Provider<ProtocolSchedule> protocolScheduleProvider) {
    this.module = module;
    this.protocolScheduleProvider = protocolScheduleProvider;
  }

  @Override
  public Function<Integer, ProtocolSpec> get() {
    return getProtocolSpec(module, protocolScheduleProvider.get());
  }

  public static ProtocolModule_GetProtocolSpecFactory create(ProtocolModule module,
      Provider<ProtocolSchedule> protocolScheduleProvider) {
    return new ProtocolModule_GetProtocolSpecFactory(module, protocolScheduleProvider);
  }

  public static Function<Integer, ProtocolSpec> getProtocolSpec(ProtocolModule instance,
      ProtocolSchedule protocolSchedule) {
    return Preconditions.checkNotNullFromProvides(instance.getProtocolSpec(protocolSchedule));
  }
}
