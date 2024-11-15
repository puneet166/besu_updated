package org.hyperledger.besu.ethereum.eth.sync.snapsync;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link SnapSyncConfiguration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSnapSyncConfiguration.builder()}.
 */
@Generated(from = "SnapSyncConfiguration", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableSnapSyncConfiguration
    extends SnapSyncConfiguration {
  private final int pivotBlockWindowValidity;
  private final int pivotBlockDistanceBeforeCaching;
  private final int storageCountPerRequest;
  private final int bytecodeCountPerRequest;
  private final int trienodeCountPerRequest;

  private ImmutableSnapSyncConfiguration(ImmutableSnapSyncConfiguration.Builder builder) {
    if (builder.pivotBlockWindowValidityIsSet()) {
      initShim.pivotBlockWindowValidity(builder.pivotBlockWindowValidity);
    }
    if (builder.pivotBlockDistanceBeforeCachingIsSet()) {
      initShim.pivotBlockDistanceBeforeCaching(builder.pivotBlockDistanceBeforeCaching);
    }
    if (builder.storageCountPerRequestIsSet()) {
      initShim.storageCountPerRequest(builder.storageCountPerRequest);
    }
    if (builder.bytecodeCountPerRequestIsSet()) {
      initShim.bytecodeCountPerRequest(builder.bytecodeCountPerRequest);
    }
    if (builder.trienodeCountPerRequestIsSet()) {
      initShim.trienodeCountPerRequest(builder.trienodeCountPerRequest);
    }
    this.pivotBlockWindowValidity = initShim.getPivotBlockWindowValidity();
    this.pivotBlockDistanceBeforeCaching = initShim.getPivotBlockDistanceBeforeCaching();
    this.storageCountPerRequest = initShim.getStorageCountPerRequest();
    this.bytecodeCountPerRequest = initShim.getBytecodeCountPerRequest();
    this.trienodeCountPerRequest = initShim.getTrienodeCountPerRequest();
    this.initShim = null;
  }

  private ImmutableSnapSyncConfiguration(
      int pivotBlockWindowValidity,
      int pivotBlockDistanceBeforeCaching,
      int storageCountPerRequest,
      int bytecodeCountPerRequest,
      int trienodeCountPerRequest) {
    this.pivotBlockWindowValidity = pivotBlockWindowValidity;
    this.pivotBlockDistanceBeforeCaching = pivotBlockDistanceBeforeCaching;
    this.storageCountPerRequest = storageCountPerRequest;
    this.bytecodeCountPerRequest = bytecodeCountPerRequest;
    this.trienodeCountPerRequest = trienodeCountPerRequest;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "SnapSyncConfiguration", generator = "Immutables")
  private final class InitShim {
    private byte pivotBlockWindowValidityBuildStage = STAGE_UNINITIALIZED;
    private int pivotBlockWindowValidity;

    int getPivotBlockWindowValidity() {
      if (pivotBlockWindowValidityBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (pivotBlockWindowValidityBuildStage == STAGE_UNINITIALIZED) {
        pivotBlockWindowValidityBuildStage = STAGE_INITIALIZING;
        this.pivotBlockWindowValidity = ImmutableSnapSyncConfiguration.super.getPivotBlockWindowValidity();
        pivotBlockWindowValidityBuildStage = STAGE_INITIALIZED;
      }
      return this.pivotBlockWindowValidity;
    }

    void pivotBlockWindowValidity(int pivotBlockWindowValidity) {
      this.pivotBlockWindowValidity = pivotBlockWindowValidity;
      pivotBlockWindowValidityBuildStage = STAGE_INITIALIZED;
    }

    private byte pivotBlockDistanceBeforeCachingBuildStage = STAGE_UNINITIALIZED;
    private int pivotBlockDistanceBeforeCaching;

    int getPivotBlockDistanceBeforeCaching() {
      if (pivotBlockDistanceBeforeCachingBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (pivotBlockDistanceBeforeCachingBuildStage == STAGE_UNINITIALIZED) {
        pivotBlockDistanceBeforeCachingBuildStage = STAGE_INITIALIZING;
        this.pivotBlockDistanceBeforeCaching = ImmutableSnapSyncConfiguration.super.getPivotBlockDistanceBeforeCaching();
        pivotBlockDistanceBeforeCachingBuildStage = STAGE_INITIALIZED;
      }
      return this.pivotBlockDistanceBeforeCaching;
    }

    void pivotBlockDistanceBeforeCaching(int pivotBlockDistanceBeforeCaching) {
      this.pivotBlockDistanceBeforeCaching = pivotBlockDistanceBeforeCaching;
      pivotBlockDistanceBeforeCachingBuildStage = STAGE_INITIALIZED;
    }

    private byte storageCountPerRequestBuildStage = STAGE_UNINITIALIZED;
    private int storageCountPerRequest;

    int getStorageCountPerRequest() {
      if (storageCountPerRequestBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (storageCountPerRequestBuildStage == STAGE_UNINITIALIZED) {
        storageCountPerRequestBuildStage = STAGE_INITIALIZING;
        this.storageCountPerRequest = ImmutableSnapSyncConfiguration.super.getStorageCountPerRequest();
        storageCountPerRequestBuildStage = STAGE_INITIALIZED;
      }
      return this.storageCountPerRequest;
    }

    void storageCountPerRequest(int storageCountPerRequest) {
      this.storageCountPerRequest = storageCountPerRequest;
      storageCountPerRequestBuildStage = STAGE_INITIALIZED;
    }

    private byte bytecodeCountPerRequestBuildStage = STAGE_UNINITIALIZED;
    private int bytecodeCountPerRequest;

    int getBytecodeCountPerRequest() {
      if (bytecodeCountPerRequestBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (bytecodeCountPerRequestBuildStage == STAGE_UNINITIALIZED) {
        bytecodeCountPerRequestBuildStage = STAGE_INITIALIZING;
        this.bytecodeCountPerRequest = ImmutableSnapSyncConfiguration.super.getBytecodeCountPerRequest();
        bytecodeCountPerRequestBuildStage = STAGE_INITIALIZED;
      }
      return this.bytecodeCountPerRequest;
    }

    void bytecodeCountPerRequest(int bytecodeCountPerRequest) {
      this.bytecodeCountPerRequest = bytecodeCountPerRequest;
      bytecodeCountPerRequestBuildStage = STAGE_INITIALIZED;
    }

    private byte trienodeCountPerRequestBuildStage = STAGE_UNINITIALIZED;
    private int trienodeCountPerRequest;

    int getTrienodeCountPerRequest() {
      if (trienodeCountPerRequestBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (trienodeCountPerRequestBuildStage == STAGE_UNINITIALIZED) {
        trienodeCountPerRequestBuildStage = STAGE_INITIALIZING;
        this.trienodeCountPerRequest = ImmutableSnapSyncConfiguration.super.getTrienodeCountPerRequest();
        trienodeCountPerRequestBuildStage = STAGE_INITIALIZED;
      }
      return this.trienodeCountPerRequest;
    }

    void trienodeCountPerRequest(int trienodeCountPerRequest) {
      this.trienodeCountPerRequest = trienodeCountPerRequest;
      trienodeCountPerRequestBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (pivotBlockWindowValidityBuildStage == STAGE_INITIALIZING) attributes.add("pivotBlockWindowValidity");
      if (pivotBlockDistanceBeforeCachingBuildStage == STAGE_INITIALIZING) attributes.add("pivotBlockDistanceBeforeCaching");
      if (storageCountPerRequestBuildStage == STAGE_INITIALIZING) attributes.add("storageCountPerRequest");
      if (bytecodeCountPerRequestBuildStage == STAGE_INITIALIZING) attributes.add("bytecodeCountPerRequest");
      if (trienodeCountPerRequestBuildStage == STAGE_INITIALIZING) attributes.add("trienodeCountPerRequest");
      return "Cannot build SnapSyncConfiguration, attribute initializers form cycle " + attributes;
    }
  }

  /**
   * @return The value of the {@code pivotBlockWindowValidity} attribute
   */
  @Override
  public int getPivotBlockWindowValidity() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getPivotBlockWindowValidity()
        : this.pivotBlockWindowValidity;
  }

  /**
   * @return The value of the {@code pivotBlockDistanceBeforeCaching} attribute
   */
  @Override
  public int getPivotBlockDistanceBeforeCaching() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getPivotBlockDistanceBeforeCaching()
        : this.pivotBlockDistanceBeforeCaching;
  }

  /**
   * @return The value of the {@code storageCountPerRequest} attribute
   */
  @Override
  public int getStorageCountPerRequest() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getStorageCountPerRequest()
        : this.storageCountPerRequest;
  }

  /**
   * @return The value of the {@code bytecodeCountPerRequest} attribute
   */
  @Override
  public int getBytecodeCountPerRequest() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getBytecodeCountPerRequest()
        : this.bytecodeCountPerRequest;
  }

  /**
   * @return The value of the {@code trienodeCountPerRequest} attribute
   */
  @Override
  public int getTrienodeCountPerRequest() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getTrienodeCountPerRequest()
        : this.trienodeCountPerRequest;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SnapSyncConfiguration#getPivotBlockWindowValidity() pivotBlockWindowValidity} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pivotBlockWindowValidity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSnapSyncConfiguration withPivotBlockWindowValidity(int value) {
    if (this.pivotBlockWindowValidity == value) return this;
    return new ImmutableSnapSyncConfiguration(
        value,
        this.pivotBlockDistanceBeforeCaching,
        this.storageCountPerRequest,
        this.bytecodeCountPerRequest,
        this.trienodeCountPerRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SnapSyncConfiguration#getPivotBlockDistanceBeforeCaching() pivotBlockDistanceBeforeCaching} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pivotBlockDistanceBeforeCaching
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSnapSyncConfiguration withPivotBlockDistanceBeforeCaching(int value) {
    if (this.pivotBlockDistanceBeforeCaching == value) return this;
    return new ImmutableSnapSyncConfiguration(
        this.pivotBlockWindowValidity,
        value,
        this.storageCountPerRequest,
        this.bytecodeCountPerRequest,
        this.trienodeCountPerRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SnapSyncConfiguration#getStorageCountPerRequest() storageCountPerRequest} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for storageCountPerRequest
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSnapSyncConfiguration withStorageCountPerRequest(int value) {
    if (this.storageCountPerRequest == value) return this;
    return new ImmutableSnapSyncConfiguration(
        this.pivotBlockWindowValidity,
        this.pivotBlockDistanceBeforeCaching,
        value,
        this.bytecodeCountPerRequest,
        this.trienodeCountPerRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SnapSyncConfiguration#getBytecodeCountPerRequest() bytecodeCountPerRequest} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bytecodeCountPerRequest
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSnapSyncConfiguration withBytecodeCountPerRequest(int value) {
    if (this.bytecodeCountPerRequest == value) return this;
    return new ImmutableSnapSyncConfiguration(
        this.pivotBlockWindowValidity,
        this.pivotBlockDistanceBeforeCaching,
        this.storageCountPerRequest,
        value,
        this.trienodeCountPerRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SnapSyncConfiguration#getTrienodeCountPerRequest() trienodeCountPerRequest} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for trienodeCountPerRequest
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSnapSyncConfiguration withTrienodeCountPerRequest(int value) {
    if (this.trienodeCountPerRequest == value) return this;
    return new ImmutableSnapSyncConfiguration(
        this.pivotBlockWindowValidity,
        this.pivotBlockDistanceBeforeCaching,
        this.storageCountPerRequest,
        this.bytecodeCountPerRequest,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSnapSyncConfiguration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSnapSyncConfiguration
        && equalTo(0, (ImmutableSnapSyncConfiguration) another);
  }

  private boolean equalTo(int synthetic, ImmutableSnapSyncConfiguration another) {
    return pivotBlockWindowValidity == another.pivotBlockWindowValidity
        && pivotBlockDistanceBeforeCaching == another.pivotBlockDistanceBeforeCaching
        && storageCountPerRequest == another.storageCountPerRequest
        && bytecodeCountPerRequest == another.bytecodeCountPerRequest
        && trienodeCountPerRequest == another.trienodeCountPerRequest;
  }

  /**
   * Computes a hash code from attributes: {@code pivotBlockWindowValidity}, {@code pivotBlockDistanceBeforeCaching}, {@code storageCountPerRequest}, {@code bytecodeCountPerRequest}, {@code trienodeCountPerRequest}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + pivotBlockWindowValidity;
    h += (h << 5) + pivotBlockDistanceBeforeCaching;
    h += (h << 5) + storageCountPerRequest;
    h += (h << 5) + bytecodeCountPerRequest;
    h += (h << 5) + trienodeCountPerRequest;
    return h;
  }

  /**
   * Prints the immutable value {@code SnapSyncConfiguration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SnapSyncConfiguration")
        .omitNullValues()
        .add("pivotBlockWindowValidity", pivotBlockWindowValidity)
        .add("pivotBlockDistanceBeforeCaching", pivotBlockDistanceBeforeCaching)
        .add("storageCountPerRequest", storageCountPerRequest)
        .add("bytecodeCountPerRequest", bytecodeCountPerRequest)
        .add("trienodeCountPerRequest", trienodeCountPerRequest)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link SnapSyncConfiguration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SnapSyncConfiguration instance
   */
  public static ImmutableSnapSyncConfiguration copyOf(SnapSyncConfiguration instance) {
    if (instance instanceof ImmutableSnapSyncConfiguration) {
      return (ImmutableSnapSyncConfiguration) instance;
    }
    return ImmutableSnapSyncConfiguration.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSnapSyncConfiguration ImmutableSnapSyncConfiguration}.
   * <pre>
   * ImmutableSnapSyncConfiguration.builder()
   *    .pivotBlockWindowValidity(int) // optional {@link SnapSyncConfiguration#getPivotBlockWindowValidity() pivotBlockWindowValidity}
   *    .pivotBlockDistanceBeforeCaching(int) // optional {@link SnapSyncConfiguration#getPivotBlockDistanceBeforeCaching() pivotBlockDistanceBeforeCaching}
   *    .storageCountPerRequest(int) // optional {@link SnapSyncConfiguration#getStorageCountPerRequest() storageCountPerRequest}
   *    .bytecodeCountPerRequest(int) // optional {@link SnapSyncConfiguration#getBytecodeCountPerRequest() bytecodeCountPerRequest}
   *    .trienodeCountPerRequest(int) // optional {@link SnapSyncConfiguration#getTrienodeCountPerRequest() trienodeCountPerRequest}
   *    .build();
   * </pre>
   * @return A new ImmutableSnapSyncConfiguration builder
   */
  public static ImmutableSnapSyncConfiguration.Builder builder() {
    return new ImmutableSnapSyncConfiguration.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSnapSyncConfiguration ImmutableSnapSyncConfiguration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SnapSyncConfiguration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PIVOT_BLOCK_WINDOW_VALIDITY = 0x1L;
    private static final long OPT_BIT_PIVOT_BLOCK_DISTANCE_BEFORE_CACHING = 0x2L;
    private static final long OPT_BIT_STORAGE_COUNT_PER_REQUEST = 0x4L;
    private static final long OPT_BIT_BYTECODE_COUNT_PER_REQUEST = 0x8L;
    private static final long OPT_BIT_TRIENODE_COUNT_PER_REQUEST = 0x10L;
    private long optBits;

    private int pivotBlockWindowValidity;
    private int pivotBlockDistanceBeforeCaching;
    private int storageCountPerRequest;
    private int bytecodeCountPerRequest;
    private int trienodeCountPerRequest;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SnapSyncConfiguration} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(SnapSyncConfiguration instance) {
      Objects.requireNonNull(instance, "instance");
      pivotBlockWindowValidity(instance.getPivotBlockWindowValidity());
      pivotBlockDistanceBeforeCaching(instance.getPivotBlockDistanceBeforeCaching());
      storageCountPerRequest(instance.getStorageCountPerRequest());
      bytecodeCountPerRequest(instance.getBytecodeCountPerRequest());
      trienodeCountPerRequest(instance.getTrienodeCountPerRequest());
      return this;
    }

    /**
     * Initializes the value for the {@link SnapSyncConfiguration#getPivotBlockWindowValidity() pivotBlockWindowValidity} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SnapSyncConfiguration#getPivotBlockWindowValidity() pivotBlockWindowValidity}.</em>
     * @param pivotBlockWindowValidity The value for pivotBlockWindowValidity 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder pivotBlockWindowValidity(int pivotBlockWindowValidity) {
      this.pivotBlockWindowValidity = pivotBlockWindowValidity;
      optBits |= OPT_BIT_PIVOT_BLOCK_WINDOW_VALIDITY;
      return this;
    }

    /**
     * Initializes the value for the {@link SnapSyncConfiguration#getPivotBlockDistanceBeforeCaching() pivotBlockDistanceBeforeCaching} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SnapSyncConfiguration#getPivotBlockDistanceBeforeCaching() pivotBlockDistanceBeforeCaching}.</em>
     * @param pivotBlockDistanceBeforeCaching The value for pivotBlockDistanceBeforeCaching 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder pivotBlockDistanceBeforeCaching(int pivotBlockDistanceBeforeCaching) {
      this.pivotBlockDistanceBeforeCaching = pivotBlockDistanceBeforeCaching;
      optBits |= OPT_BIT_PIVOT_BLOCK_DISTANCE_BEFORE_CACHING;
      return this;
    }

    /**
     * Initializes the value for the {@link SnapSyncConfiguration#getStorageCountPerRequest() storageCountPerRequest} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SnapSyncConfiguration#getStorageCountPerRequest() storageCountPerRequest}.</em>
     * @param storageCountPerRequest The value for storageCountPerRequest 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder storageCountPerRequest(int storageCountPerRequest) {
      this.storageCountPerRequest = storageCountPerRequest;
      optBits |= OPT_BIT_STORAGE_COUNT_PER_REQUEST;
      return this;
    }

    /**
     * Initializes the value for the {@link SnapSyncConfiguration#getBytecodeCountPerRequest() bytecodeCountPerRequest} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SnapSyncConfiguration#getBytecodeCountPerRequest() bytecodeCountPerRequest}.</em>
     * @param bytecodeCountPerRequest The value for bytecodeCountPerRequest 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder bytecodeCountPerRequest(int bytecodeCountPerRequest) {
      this.bytecodeCountPerRequest = bytecodeCountPerRequest;
      optBits |= OPT_BIT_BYTECODE_COUNT_PER_REQUEST;
      return this;
    }

    /**
     * Initializes the value for the {@link SnapSyncConfiguration#getTrienodeCountPerRequest() trienodeCountPerRequest} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SnapSyncConfiguration#getTrienodeCountPerRequest() trienodeCountPerRequest}.</em>
     * @param trienodeCountPerRequest The value for trienodeCountPerRequest 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder trienodeCountPerRequest(int trienodeCountPerRequest) {
      this.trienodeCountPerRequest = trienodeCountPerRequest;
      optBits |= OPT_BIT_TRIENODE_COUNT_PER_REQUEST;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSnapSyncConfiguration ImmutableSnapSyncConfiguration}.
     * @return An immutable instance of SnapSyncConfiguration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSnapSyncConfiguration build() {
      return new ImmutableSnapSyncConfiguration(this);
    }

    private boolean pivotBlockWindowValidityIsSet() {
      return (optBits & OPT_BIT_PIVOT_BLOCK_WINDOW_VALIDITY) != 0;
    }

    private boolean pivotBlockDistanceBeforeCachingIsSet() {
      return (optBits & OPT_BIT_PIVOT_BLOCK_DISTANCE_BEFORE_CACHING) != 0;
    }

    private boolean storageCountPerRequestIsSet() {
      return (optBits & OPT_BIT_STORAGE_COUNT_PER_REQUEST) != 0;
    }

    private boolean bytecodeCountPerRequestIsSet() {
      return (optBits & OPT_BIT_BYTECODE_COUNT_PER_REQUEST) != 0;
    }

    private boolean trienodeCountPerRequestIsSet() {
      return (optBits & OPT_BIT_TRIENODE_COUNT_PER_REQUEST) != 0;
    }
  }
}
