package org.hyperledger.besu.ethereum.api.jsonrpc.internal.parameters;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.primitives.Booleans;
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
 * Immutable implementation of {@link TransactionTraceParams}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionTraceParams.builder()}.
 */
@Generated(from = "TransactionTraceParams", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableTransactionTraceParams
    implements TransactionTraceParams {
  private final @Nullable String transactionHash;
  private final boolean disableStorage;
  private final boolean disableMemory;
  private final boolean disableStack;

  private ImmutableTransactionTraceParams(ImmutableTransactionTraceParams.Builder builder) {
    this.transactionHash = builder.transactionHash;
    if (builder.disableStorageIsSet()) {
      initShim.disableStorage(builder.disableStorage);
    }
    if (builder.disableMemoryIsSet()) {
      initShim.disableMemory(builder.disableMemory);
    }
    if (builder.disableStackIsSet()) {
      initShim.disableStack(builder.disableStack);
    }
    this.disableStorage = initShim.disableStorage();
    this.disableMemory = initShim.disableMemory();
    this.disableStack = initShim.disableStack();
    this.initShim = null;
  }

  private ImmutableTransactionTraceParams(
      @Nullable String transactionHash,
      boolean disableStorage,
      boolean disableMemory,
      boolean disableStack) {
    this.transactionHash = transactionHash;
    this.disableStorage = disableStorage;
    this.disableMemory = disableMemory;
    this.disableStack = disableStack;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "TransactionTraceParams", generator = "Immutables")
  private final class InitShim {
    private byte disableStorageBuildStage = STAGE_UNINITIALIZED;
    private boolean disableStorage;

    boolean disableStorage() {
      if (disableStorageBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (disableStorageBuildStage == STAGE_UNINITIALIZED) {
        disableStorageBuildStage = STAGE_INITIALIZING;
        this.disableStorage = disableStorageInitialize();
        disableStorageBuildStage = STAGE_INITIALIZED;
      }
      return this.disableStorage;
    }

    void disableStorage(boolean disableStorage) {
      this.disableStorage = disableStorage;
      disableStorageBuildStage = STAGE_INITIALIZED;
    }

    private byte disableMemoryBuildStage = STAGE_UNINITIALIZED;
    private boolean disableMemory;

    boolean disableMemory() {
      if (disableMemoryBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (disableMemoryBuildStage == STAGE_UNINITIALIZED) {
        disableMemoryBuildStage = STAGE_INITIALIZING;
        this.disableMemory = disableMemoryInitialize();
        disableMemoryBuildStage = STAGE_INITIALIZED;
      }
      return this.disableMemory;
    }

    void disableMemory(boolean disableMemory) {
      this.disableMemory = disableMemory;
      disableMemoryBuildStage = STAGE_INITIALIZED;
    }

    private byte disableStackBuildStage = STAGE_UNINITIALIZED;
    private boolean disableStack;

    boolean disableStack() {
      if (disableStackBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (disableStackBuildStage == STAGE_UNINITIALIZED) {
        disableStackBuildStage = STAGE_INITIALIZING;
        this.disableStack = disableStackInitialize();
        disableStackBuildStage = STAGE_INITIALIZED;
      }
      return this.disableStack;
    }

    void disableStack(boolean disableStack) {
      this.disableStack = disableStack;
      disableStackBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (disableStorageBuildStage == STAGE_INITIALIZING) attributes.add("disableStorage");
      if (disableMemoryBuildStage == STAGE_INITIALIZING) attributes.add("disableMemory");
      if (disableStackBuildStage == STAGE_INITIALIZING) attributes.add("disableStack");
      return "Cannot build TransactionTraceParams, attribute initializers form cycle " + attributes;
    }
  }

  private boolean disableStorageInitialize() {
    return TransactionTraceParams.super.disableStorage();
  }

  private boolean disableMemoryInitialize() {
    return TransactionTraceParams.super.disableMemory();
  }

  private boolean disableStackInitialize() {
    return TransactionTraceParams.super.disableStack();
  }

  /**
   * @return The value of the {@code transactionHash} attribute
   */
  @JsonProperty("txHash")
  @Override
  public @Nullable String getTransactionHash() {
    return transactionHash;
  }

  /**
   * @return The value of the {@code disableStorage} attribute
   */
  @JsonProperty("disableStorage")
  @Override
  public boolean disableStorage() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.disableStorage()
        : this.disableStorage;
  }

  /**
   * @return The value of the {@code disableMemory} attribute
   */
  @JsonProperty("disableMemory")
  @Override
  public boolean disableMemory() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.disableMemory()
        : this.disableMemory;
  }

  /**
   * @return The value of the {@code disableStack} attribute
   */
  @JsonProperty("disableStack")
  @Override
  public boolean disableStack() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.disableStack()
        : this.disableStack;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionTraceParams#getTransactionHash() transactionHash} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionHash (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionTraceParams withTransactionHash(@Nullable String value) {
    if (Objects.equals(this.transactionHash, value)) return this;
    return new ImmutableTransactionTraceParams(value, this.disableStorage, this.disableMemory, this.disableStack);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionTraceParams#disableStorage() disableStorage} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for disableStorage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionTraceParams withDisableStorage(boolean value) {
    if (this.disableStorage == value) return this;
    return new ImmutableTransactionTraceParams(this.transactionHash, value, this.disableMemory, this.disableStack);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionTraceParams#disableMemory() disableMemory} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for disableMemory
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionTraceParams withDisableMemory(boolean value) {
    if (this.disableMemory == value) return this;
    return new ImmutableTransactionTraceParams(this.transactionHash, this.disableStorage, value, this.disableStack);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionTraceParams#disableStack() disableStack} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for disableStack
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionTraceParams withDisableStack(boolean value) {
    if (this.disableStack == value) return this;
    return new ImmutableTransactionTraceParams(this.transactionHash, this.disableStorage, this.disableMemory, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionTraceParams} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionTraceParams
        && equalTo(0, (ImmutableTransactionTraceParams) another);
  }

  private boolean equalTo(int synthetic, ImmutableTransactionTraceParams another) {
    return Objects.equals(transactionHash, another.transactionHash)
        && disableStorage == another.disableStorage
        && disableMemory == another.disableMemory
        && disableStack == another.disableStack;
  }

  /**
   * Computes a hash code from attributes: {@code transactionHash}, {@code disableStorage}, {@code disableMemory}, {@code disableStack}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(transactionHash);
    h += (h << 5) + Booleans.hashCode(disableStorage);
    h += (h << 5) + Booleans.hashCode(disableMemory);
    h += (h << 5) + Booleans.hashCode(disableStack);
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionTraceParams} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionTraceParams")
        .omitNullValues()
        .add("transactionHash", transactionHash)
        .add("disableStorage", disableStorage)
        .add("disableMemory", disableMemory)
        .add("disableStack", disableStack)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TransactionTraceParams", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements TransactionTraceParams {
    @Nullable String transactionHash;
    boolean disableStorage;
    boolean disableStorageIsSet;
    boolean disableMemory;
    boolean disableMemoryIsSet;
    boolean disableStack;
    boolean disableStackIsSet;
    @JsonProperty("txHash")
    public void setTransactionHash(@Nullable String transactionHash) {
      this.transactionHash = transactionHash;
    }
    @JsonProperty("disableStorage")
    public void setDisableStorage(boolean disableStorage) {
      this.disableStorage = disableStorage;
      this.disableStorageIsSet = true;
    }
    @JsonProperty("disableMemory")
    public void setDisableMemory(boolean disableMemory) {
      this.disableMemory = disableMemory;
      this.disableMemoryIsSet = true;
    }
    @JsonProperty("disableStack")
    public void setDisableStack(boolean disableStack) {
      this.disableStack = disableStack;
      this.disableStackIsSet = true;
    }
    @Override
    public String getTransactionHash() { throw new UnsupportedOperationException(); }
    @Override
    public boolean disableStorage() { throw new UnsupportedOperationException(); }
    @Override
    public boolean disableMemory() { throw new UnsupportedOperationException(); }
    @Override
    public boolean disableStack() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTransactionTraceParams fromJson(Json json) {
    ImmutableTransactionTraceParams.Builder builder = ImmutableTransactionTraceParams.builder();
    if (json.transactionHash != null) {
      builder.transactionHash(json.transactionHash);
    }
    if (json.disableStorageIsSet) {
      builder.disableStorage(json.disableStorage);
    }
    if (json.disableMemoryIsSet) {
      builder.disableMemory(json.disableMemory);
    }
    if (json.disableStackIsSet) {
      builder.disableStack(json.disableStack);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TransactionTraceParams} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionTraceParams instance
   */
  public static ImmutableTransactionTraceParams copyOf(TransactionTraceParams instance) {
    if (instance instanceof ImmutableTransactionTraceParams) {
      return (ImmutableTransactionTraceParams) instance;
    }
    return ImmutableTransactionTraceParams.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionTraceParams ImmutableTransactionTraceParams}.
   * <pre>
   * ImmutableTransactionTraceParams.builder()
   *    .transactionHash(String | null) // nullable {@link TransactionTraceParams#getTransactionHash() transactionHash}
   *    .disableStorage(boolean) // optional {@link TransactionTraceParams#disableStorage() disableStorage}
   *    .disableMemory(boolean) // optional {@link TransactionTraceParams#disableMemory() disableMemory}
   *    .disableStack(boolean) // optional {@link TransactionTraceParams#disableStack() disableStack}
   *    .build();
   * </pre>
   * @return A new ImmutableTransactionTraceParams builder
   */
  public static ImmutableTransactionTraceParams.Builder builder() {
    return new ImmutableTransactionTraceParams.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionTraceParams ImmutableTransactionTraceParams}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TransactionTraceParams", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DISABLE_STORAGE = 0x1L;
    private static final long OPT_BIT_DISABLE_MEMORY = 0x2L;
    private static final long OPT_BIT_DISABLE_STACK = 0x4L;
    private long optBits;

    private @Nullable String transactionHash;
    private boolean disableStorage;
    private boolean disableMemory;
    private boolean disableStack;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TransactionTraceParams} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(TransactionTraceParams instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable String transactionHashValue = instance.getTransactionHash();
      if (transactionHashValue != null) {
        transactionHash(transactionHashValue);
      }
      disableStorage(instance.disableStorage());
      disableMemory(instance.disableMemory());
      disableStack(instance.disableStack());
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionTraceParams#getTransactionHash() transactionHash} attribute.
     * @param transactionHash The value for transactionHash (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("txHash")
    public final Builder transactionHash(@Nullable String transactionHash) {
      this.transactionHash = transactionHash;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionTraceParams#disableStorage() disableStorage} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionTraceParams#disableStorage() disableStorage}.</em>
     * @param disableStorage The value for disableStorage 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("disableStorage")
    public final Builder disableStorage(boolean disableStorage) {
      this.disableStorage = disableStorage;
      optBits |= OPT_BIT_DISABLE_STORAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionTraceParams#disableMemory() disableMemory} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionTraceParams#disableMemory() disableMemory}.</em>
     * @param disableMemory The value for disableMemory 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("disableMemory")
    public final Builder disableMemory(boolean disableMemory) {
      this.disableMemory = disableMemory;
      optBits |= OPT_BIT_DISABLE_MEMORY;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionTraceParams#disableStack() disableStack} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionTraceParams#disableStack() disableStack}.</em>
     * @param disableStack The value for disableStack 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("disableStack")
    public final Builder disableStack(boolean disableStack) {
      this.disableStack = disableStack;
      optBits |= OPT_BIT_DISABLE_STACK;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionTraceParams ImmutableTransactionTraceParams}.
     * @return An immutable instance of TransactionTraceParams
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionTraceParams build() {
      return new ImmutableTransactionTraceParams(this);
    }

    private boolean disableStorageIsSet() {
      return (optBits & OPT_BIT_DISABLE_STORAGE) != 0;
    }

    private boolean disableMemoryIsSet() {
      return (optBits & OPT_BIT_DISABLE_MEMORY) != 0;
    }

    private boolean disableStackIsSet() {
      return (optBits & OPT_BIT_DISABLE_STACK) != 0;
    }
  }
}
