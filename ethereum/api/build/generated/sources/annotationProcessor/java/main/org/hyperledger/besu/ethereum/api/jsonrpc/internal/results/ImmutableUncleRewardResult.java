package org.hyperledger.besu.ethereum.api.jsonrpc.internal.results;

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
 * Immutable implementation of {@link MinerDataResult.UncleRewardResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUncleRewardResult.builder()}.
 */
@Generated(from = "MinerDataResult.UncleRewardResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableUncleRewardResult
    implements MinerDataResult.UncleRewardResult {
  private final String hash;
  private final String coinbase;

  private ImmutableUncleRewardResult(String hash, String coinbase) {
    this.hash = hash;
    this.coinbase = coinbase;
  }

  /**
   * @return The value of the {@code hash} attribute
   */
  @Override
  public String getHash() {
    return hash;
  }

  /**
   * @return The value of the {@code coinbase} attribute
   */
  @Override
  public String getCoinbase() {
    return coinbase;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult.UncleRewardResult#getHash() hash} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUncleRewardResult withHash(String value) {
    String newValue = Objects.requireNonNull(value, "hash");
    if (this.hash.equals(newValue)) return this;
    return new ImmutableUncleRewardResult(newValue, this.coinbase);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult.UncleRewardResult#getCoinbase() coinbase} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for coinbase
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUncleRewardResult withCoinbase(String value) {
    String newValue = Objects.requireNonNull(value, "coinbase");
    if (this.coinbase.equals(newValue)) return this;
    return new ImmutableUncleRewardResult(this.hash, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUncleRewardResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUncleRewardResult
        && equalTo(0, (ImmutableUncleRewardResult) another);
  }

  private boolean equalTo(int synthetic, ImmutableUncleRewardResult another) {
    return hash.equals(another.hash)
        && coinbase.equals(another.coinbase);
  }

  /**
   * Computes a hash code from attributes: {@code hash}, {@code coinbase}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + hash.hashCode();
    h += (h << 5) + coinbase.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UncleRewardResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UncleRewardResult")
        .omitNullValues()
        .add("hash", hash)
        .add("coinbase", coinbase)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link MinerDataResult.UncleRewardResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UncleRewardResult instance
   */
  public static ImmutableUncleRewardResult copyOf(MinerDataResult.UncleRewardResult instance) {
    if (instance instanceof ImmutableUncleRewardResult) {
      return (ImmutableUncleRewardResult) instance;
    }
    return ImmutableUncleRewardResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUncleRewardResult ImmutableUncleRewardResult}.
   * <pre>
   * ImmutableUncleRewardResult.builder()
   *    .hash(String) // required {@link MinerDataResult.UncleRewardResult#getHash() hash}
   *    .coinbase(String) // required {@link MinerDataResult.UncleRewardResult#getCoinbase() coinbase}
   *    .build();
   * </pre>
   * @return A new ImmutableUncleRewardResult builder
   */
  public static ImmutableUncleRewardResult.Builder builder() {
    return new ImmutableUncleRewardResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUncleRewardResult ImmutableUncleRewardResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MinerDataResult.UncleRewardResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_HASH = 0x1L;
    private static final long INIT_BIT_COINBASE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String hash;
    private @Nullable String coinbase;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UncleRewardResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(MinerDataResult.UncleRewardResult instance) {
      Objects.requireNonNull(instance, "instance");
      hash(instance.getHash());
      coinbase(instance.getCoinbase());
      return this;
    }

    /**
     * Initializes the value for the {@link MinerDataResult.UncleRewardResult#getHash() hash} attribute.
     * @param hash The value for hash 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder hash(String hash) {
      this.hash = Objects.requireNonNull(hash, "hash");
      initBits &= ~INIT_BIT_HASH;
      return this;
    }

    /**
     * Initializes the value for the {@link MinerDataResult.UncleRewardResult#getCoinbase() coinbase} attribute.
     * @param coinbase The value for coinbase 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder coinbase(String coinbase) {
      this.coinbase = Objects.requireNonNull(coinbase, "coinbase");
      initBits &= ~INIT_BIT_COINBASE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUncleRewardResult ImmutableUncleRewardResult}.
     * @return An immutable instance of UncleRewardResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUncleRewardResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUncleRewardResult(hash, coinbase);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_HASH) != 0) attributes.add("hash");
      if ((initBits & INIT_BIT_COINBASE) != 0) attributes.add("coinbase");
      return "Cannot build UncleRewardResult, some of required attributes are not set " + attributes;
    }
  }
}
