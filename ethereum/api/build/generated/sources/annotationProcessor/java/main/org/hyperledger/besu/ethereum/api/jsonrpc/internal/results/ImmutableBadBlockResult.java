package org.hyperledger.besu.ethereum.api.jsonrpc.internal.results;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
 * Immutable implementation of {@link BadBlockResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBadBlockResult.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableBadBlockResult.of()}.
 */
@Generated(from = "BadBlockResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableBadBlockResult
    implements BadBlockResult {
  private final BlockResult blockResult;
  private final String hash;
  private final String rlp;

  private ImmutableBadBlockResult(
      BlockResult blockResult,
      String hash,
      String rlp) {
    this.blockResult = Objects.requireNonNull(blockResult, "blockResult");
    this.hash = Objects.requireNonNull(hash, "hash");
    this.rlp = Objects.requireNonNull(rlp, "rlp");
  }

  private ImmutableBadBlockResult(
      ImmutableBadBlockResult original,
      BlockResult blockResult,
      String hash,
      String rlp) {
    this.blockResult = blockResult;
    this.hash = hash;
    this.rlp = rlp;
  }

  /**
   * @return The value of the {@code blockResult} attribute
   */
  @JsonProperty("block")
  @Override
  public BlockResult getBlockResult() {
    return blockResult;
  }

  /**
   * @return The value of the {@code hash} attribute
   */
  @JsonProperty("hash")
  @Override
  public String getHash() {
    return hash;
  }

  /**
   * @return The value of the {@code rlp} attribute
   */
  @JsonProperty("rlp")
  @Override
  public String getRlp() {
    return rlp;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BadBlockResult#getBlockResult() blockResult} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for blockResult
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBadBlockResult withBlockResult(BlockResult value) {
    if (this.blockResult == value) return this;
    BlockResult newValue = Objects.requireNonNull(value, "blockResult");
    return new ImmutableBadBlockResult(this, newValue, this.hash, this.rlp);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BadBlockResult#getHash() hash} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBadBlockResult withHash(String value) {
    String newValue = Objects.requireNonNull(value, "hash");
    if (this.hash.equals(newValue)) return this;
    return new ImmutableBadBlockResult(this, this.blockResult, newValue, this.rlp);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BadBlockResult#getRlp() rlp} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rlp
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBadBlockResult withRlp(String value) {
    String newValue = Objects.requireNonNull(value, "rlp");
    if (this.rlp.equals(newValue)) return this;
    return new ImmutableBadBlockResult(this, this.blockResult, this.hash, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBadBlockResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBadBlockResult
        && equalTo(0, (ImmutableBadBlockResult) another);
  }

  private boolean equalTo(int synthetic, ImmutableBadBlockResult another) {
    return blockResult.equals(another.blockResult)
        && hash.equals(another.hash)
        && rlp.equals(another.rlp);
  }

  /**
   * Computes a hash code from attributes: {@code blockResult}, {@code hash}, {@code rlp}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + blockResult.hashCode();
    h += (h << 5) + hash.hashCode();
    h += (h << 5) + rlp.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code BadBlockResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("BadBlockResult")
        .omitNullValues()
        .add("blockResult", blockResult)
        .add("hash", hash)
        .add("rlp", rlp)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "BadBlockResult", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements BadBlockResult {
    @Nullable BlockResult blockResult;
    @Nullable String hash;
    @Nullable String rlp;
    @JsonProperty("block")
    public void setBlockResult(BlockResult blockResult) {
      this.blockResult = blockResult;
    }
    @JsonProperty("hash")
    public void setHash(String hash) {
      this.hash = hash;
    }
    @JsonProperty("rlp")
    public void setRlp(String rlp) {
      this.rlp = rlp;
    }
    @Override
    public BlockResult getBlockResult() { throw new UnsupportedOperationException(); }
    @Override
    public String getHash() { throw new UnsupportedOperationException(); }
    @Override
    public String getRlp() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBadBlockResult fromJson(Json json) {
    ImmutableBadBlockResult.Builder builder = ImmutableBadBlockResult.builder();
    if (json.blockResult != null) {
      builder.blockResult(json.blockResult);
    }
    if (json.hash != null) {
      builder.hash(json.hash);
    }
    if (json.rlp != null) {
      builder.rlp(json.rlp);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code BadBlockResult} instance.
   * @param blockResult The value for the {@code blockResult} attribute
   * @param hash The value for the {@code hash} attribute
   * @param rlp The value for the {@code rlp} attribute
   * @return An immutable BadBlockResult instance
   */
  public static ImmutableBadBlockResult of(BlockResult blockResult, String hash, String rlp) {
    return new ImmutableBadBlockResult(blockResult, hash, rlp);
  }

  /**
   * Creates an immutable copy of a {@link BadBlockResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BadBlockResult instance
   */
  public static ImmutableBadBlockResult copyOf(BadBlockResult instance) {
    if (instance instanceof ImmutableBadBlockResult) {
      return (ImmutableBadBlockResult) instance;
    }
    return ImmutableBadBlockResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBadBlockResult ImmutableBadBlockResult}.
   * <pre>
   * ImmutableBadBlockResult.builder()
   *    .blockResult(org.hyperledger.besu.ethereum.api.jsonrpc.internal.results.BlockResult) // required {@link BadBlockResult#getBlockResult() blockResult}
   *    .hash(String) // required {@link BadBlockResult#getHash() hash}
   *    .rlp(String) // required {@link BadBlockResult#getRlp() rlp}
   *    .build();
   * </pre>
   * @return A new ImmutableBadBlockResult builder
   */
  public static ImmutableBadBlockResult.Builder builder() {
    return new ImmutableBadBlockResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBadBlockResult ImmutableBadBlockResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "BadBlockResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_BLOCK_RESULT = 0x1L;
    private static final long INIT_BIT_HASH = 0x2L;
    private static final long INIT_BIT_RLP = 0x4L;
    private long initBits = 0x7L;

    private @Nullable BlockResult blockResult;
    private @Nullable String hash;
    private @Nullable String rlp;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code BadBlockResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(BadBlockResult instance) {
      Objects.requireNonNull(instance, "instance");
      blockResult(instance.getBlockResult());
      hash(instance.getHash());
      rlp(instance.getRlp());
      return this;
    }

    /**
     * Initializes the value for the {@link BadBlockResult#getBlockResult() blockResult} attribute.
     * @param blockResult The value for blockResult 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("block")
    public final Builder blockResult(BlockResult blockResult) {
      this.blockResult = Objects.requireNonNull(blockResult, "blockResult");
      initBits &= ~INIT_BIT_BLOCK_RESULT;
      return this;
    }

    /**
     * Initializes the value for the {@link BadBlockResult#getHash() hash} attribute.
     * @param hash The value for hash 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("hash")
    public final Builder hash(String hash) {
      this.hash = Objects.requireNonNull(hash, "hash");
      initBits &= ~INIT_BIT_HASH;
      return this;
    }

    /**
     * Initializes the value for the {@link BadBlockResult#getRlp() rlp} attribute.
     * @param rlp The value for rlp 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("rlp")
    public final Builder rlp(String rlp) {
      this.rlp = Objects.requireNonNull(rlp, "rlp");
      initBits &= ~INIT_BIT_RLP;
      return this;
    }

    /**
     * Builds a new {@link ImmutableBadBlockResult ImmutableBadBlockResult}.
     * @return An immutable instance of BadBlockResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBadBlockResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBadBlockResult(null, blockResult, hash, rlp);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_BLOCK_RESULT) != 0) attributes.add("blockResult");
      if ((initBits & INIT_BIT_HASH) != 0) attributes.add("hash");
      if ((initBits & INIT_BIT_RLP) != 0) attributes.add("rlp");
      return "Cannot build BadBlockResult, some of required attributes are not set " + attributes;
    }
  }
}
