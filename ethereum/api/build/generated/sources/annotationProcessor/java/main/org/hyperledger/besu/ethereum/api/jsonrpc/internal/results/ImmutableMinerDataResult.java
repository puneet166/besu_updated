package org.hyperledger.besu.ethereum.api.jsonrpc.internal.results;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
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
 * Immutable implementation of {@link MinerDataResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMinerDataResult.builder()}.
 */
@Generated(from = "MinerDataResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableMinerDataResult
    extends MinerDataResult {
  private final String netBlockReward;
  private final String staticBlockReward;
  private final String transactionFee;
  private final String uncleInclusionReward;
  private final ImmutableList<MinerDataResult.UncleRewardResult> uncleRewards;
  private final String coinbase;
  private final String extraData;
  private final String difficulty;
  private final String totalDifficulty;

  private ImmutableMinerDataResult(
      String netBlockReward,
      String staticBlockReward,
      String transactionFee,
      String uncleInclusionReward,
      ImmutableList<MinerDataResult.UncleRewardResult> uncleRewards,
      String coinbase,
      String extraData,
      String difficulty,
      String totalDifficulty) {
    this.netBlockReward = netBlockReward;
    this.staticBlockReward = staticBlockReward;
    this.transactionFee = transactionFee;
    this.uncleInclusionReward = uncleInclusionReward;
    this.uncleRewards = uncleRewards;
    this.coinbase = coinbase;
    this.extraData = extraData;
    this.difficulty = difficulty;
    this.totalDifficulty = totalDifficulty;
  }

  /**
   * @return The value of the {@code netBlockReward} attribute
   */
  @Override
  public String getNetBlockReward() {
    return netBlockReward;
  }

  /**
   * @return The value of the {@code staticBlockReward} attribute
   */
  @Override
  public String getStaticBlockReward() {
    return staticBlockReward;
  }

  /**
   * @return The value of the {@code transactionFee} attribute
   */
  @Override
  public String getTransactionFee() {
    return transactionFee;
  }

  /**
   * @return The value of the {@code uncleInclusionReward} attribute
   */
  @Override
  public String getUncleInclusionReward() {
    return uncleInclusionReward;
  }

  /**
   * @return The value of the {@code uncleRewards} attribute
   */
  @Override
  public ImmutableList<MinerDataResult.UncleRewardResult> getUncleRewards() {
    return uncleRewards;
  }

  /**
   * @return The value of the {@code coinbase} attribute
   */
  @Override
  public String getCoinbase() {
    return coinbase;
  }

  /**
   * @return The value of the {@code extraData} attribute
   */
  @Override
  public String getExtraData() {
    return extraData;
  }

  /**
   * @return The value of the {@code difficulty} attribute
   */
  @Override
  public String getDifficulty() {
    return difficulty;
  }

  /**
   * @return The value of the {@code totalDifficulty} attribute
   */
  @Override
  public String getTotalDifficulty() {
    return totalDifficulty;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult#getNetBlockReward() netBlockReward} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for netBlockReward
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMinerDataResult withNetBlockReward(String value) {
    String newValue = Objects.requireNonNull(value, "netBlockReward");
    if (this.netBlockReward.equals(newValue)) return this;
    return new ImmutableMinerDataResult(
        newValue,
        this.staticBlockReward,
        this.transactionFee,
        this.uncleInclusionReward,
        this.uncleRewards,
        this.coinbase,
        this.extraData,
        this.difficulty,
        this.totalDifficulty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult#getStaticBlockReward() staticBlockReward} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for staticBlockReward
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMinerDataResult withStaticBlockReward(String value) {
    String newValue = Objects.requireNonNull(value, "staticBlockReward");
    if (this.staticBlockReward.equals(newValue)) return this;
    return new ImmutableMinerDataResult(
        this.netBlockReward,
        newValue,
        this.transactionFee,
        this.uncleInclusionReward,
        this.uncleRewards,
        this.coinbase,
        this.extraData,
        this.difficulty,
        this.totalDifficulty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult#getTransactionFee() transactionFee} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionFee
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMinerDataResult withTransactionFee(String value) {
    String newValue = Objects.requireNonNull(value, "transactionFee");
    if (this.transactionFee.equals(newValue)) return this;
    return new ImmutableMinerDataResult(
        this.netBlockReward,
        this.staticBlockReward,
        newValue,
        this.uncleInclusionReward,
        this.uncleRewards,
        this.coinbase,
        this.extraData,
        this.difficulty,
        this.totalDifficulty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult#getUncleInclusionReward() uncleInclusionReward} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for uncleInclusionReward
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMinerDataResult withUncleInclusionReward(String value) {
    String newValue = Objects.requireNonNull(value, "uncleInclusionReward");
    if (this.uncleInclusionReward.equals(newValue)) return this;
    return new ImmutableMinerDataResult(
        this.netBlockReward,
        this.staticBlockReward,
        this.transactionFee,
        newValue,
        this.uncleRewards,
        this.coinbase,
        this.extraData,
        this.difficulty,
        this.totalDifficulty);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MinerDataResult#getUncleRewards() uncleRewards}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMinerDataResult withUncleRewards(MinerDataResult.UncleRewardResult... elements) {
    ImmutableList<MinerDataResult.UncleRewardResult> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMinerDataResult(
        this.netBlockReward,
        this.staticBlockReward,
        this.transactionFee,
        this.uncleInclusionReward,
        newValue,
        this.coinbase,
        this.extraData,
        this.difficulty,
        this.totalDifficulty);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MinerDataResult#getUncleRewards() uncleRewards}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of uncleRewards elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMinerDataResult withUncleRewards(Iterable<? extends MinerDataResult.UncleRewardResult> elements) {
    if (this.uncleRewards == elements) return this;
    ImmutableList<MinerDataResult.UncleRewardResult> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMinerDataResult(
        this.netBlockReward,
        this.staticBlockReward,
        this.transactionFee,
        this.uncleInclusionReward,
        newValue,
        this.coinbase,
        this.extraData,
        this.difficulty,
        this.totalDifficulty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult#getCoinbase() coinbase} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for coinbase
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMinerDataResult withCoinbase(String value) {
    String newValue = Objects.requireNonNull(value, "coinbase");
    if (this.coinbase.equals(newValue)) return this;
    return new ImmutableMinerDataResult(
        this.netBlockReward,
        this.staticBlockReward,
        this.transactionFee,
        this.uncleInclusionReward,
        this.uncleRewards,
        newValue,
        this.extraData,
        this.difficulty,
        this.totalDifficulty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult#getExtraData() extraData} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for extraData
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMinerDataResult withExtraData(String value) {
    String newValue = Objects.requireNonNull(value, "extraData");
    if (this.extraData.equals(newValue)) return this;
    return new ImmutableMinerDataResult(
        this.netBlockReward,
        this.staticBlockReward,
        this.transactionFee,
        this.uncleInclusionReward,
        this.uncleRewards,
        this.coinbase,
        newValue,
        this.difficulty,
        this.totalDifficulty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult#getDifficulty() difficulty} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for difficulty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMinerDataResult withDifficulty(String value) {
    String newValue = Objects.requireNonNull(value, "difficulty");
    if (this.difficulty.equals(newValue)) return this;
    return new ImmutableMinerDataResult(
        this.netBlockReward,
        this.staticBlockReward,
        this.transactionFee,
        this.uncleInclusionReward,
        this.uncleRewards,
        this.coinbase,
        this.extraData,
        newValue,
        this.totalDifficulty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MinerDataResult#getTotalDifficulty() totalDifficulty} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDifficulty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMinerDataResult withTotalDifficulty(String value) {
    String newValue = Objects.requireNonNull(value, "totalDifficulty");
    if (this.totalDifficulty.equals(newValue)) return this;
    return new ImmutableMinerDataResult(
        this.netBlockReward,
        this.staticBlockReward,
        this.transactionFee,
        this.uncleInclusionReward,
        this.uncleRewards,
        this.coinbase,
        this.extraData,
        this.difficulty,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMinerDataResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMinerDataResult
        && equalTo(0, (ImmutableMinerDataResult) another);
  }

  private boolean equalTo(int synthetic, ImmutableMinerDataResult another) {
    return netBlockReward.equals(another.netBlockReward)
        && staticBlockReward.equals(another.staticBlockReward)
        && transactionFee.equals(another.transactionFee)
        && uncleInclusionReward.equals(another.uncleInclusionReward)
        && uncleRewards.equals(another.uncleRewards)
        && coinbase.equals(another.coinbase)
        && extraData.equals(another.extraData)
        && difficulty.equals(another.difficulty)
        && totalDifficulty.equals(another.totalDifficulty);
  }

  /**
   * Computes a hash code from attributes: {@code netBlockReward}, {@code staticBlockReward}, {@code transactionFee}, {@code uncleInclusionReward}, {@code uncleRewards}, {@code coinbase}, {@code extraData}, {@code difficulty}, {@code totalDifficulty}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + netBlockReward.hashCode();
    h += (h << 5) + staticBlockReward.hashCode();
    h += (h << 5) + transactionFee.hashCode();
    h += (h << 5) + uncleInclusionReward.hashCode();
    h += (h << 5) + uncleRewards.hashCode();
    h += (h << 5) + coinbase.hashCode();
    h += (h << 5) + extraData.hashCode();
    h += (h << 5) + difficulty.hashCode();
    h += (h << 5) + totalDifficulty.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MinerDataResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MinerDataResult")
        .omitNullValues()
        .add("netBlockReward", netBlockReward)
        .add("staticBlockReward", staticBlockReward)
        .add("transactionFee", transactionFee)
        .add("uncleInclusionReward", uncleInclusionReward)
        .add("uncleRewards", uncleRewards)
        .add("coinbase", coinbase)
        .add("extraData", extraData)
        .add("difficulty", difficulty)
        .add("totalDifficulty", totalDifficulty)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link MinerDataResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MinerDataResult instance
   */
  public static ImmutableMinerDataResult copyOf(MinerDataResult instance) {
    if (instance instanceof ImmutableMinerDataResult) {
      return (ImmutableMinerDataResult) instance;
    }
    return ImmutableMinerDataResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMinerDataResult ImmutableMinerDataResult}.
   * <pre>
   * ImmutableMinerDataResult.builder()
   *    .netBlockReward(String) // required {@link MinerDataResult#getNetBlockReward() netBlockReward}
   *    .staticBlockReward(String) // required {@link MinerDataResult#getStaticBlockReward() staticBlockReward}
   *    .transactionFee(String) // required {@link MinerDataResult#getTransactionFee() transactionFee}
   *    .uncleInclusionReward(String) // required {@link MinerDataResult#getUncleInclusionReward() uncleInclusionReward}
   *    .addUncleRewards|addAllUncleRewards(org.hyperledger.besu.ethereum.api.jsonrpc.internal.results.MinerDataResult.UncleRewardResult) // {@link MinerDataResult#getUncleRewards() uncleRewards} elements
   *    .coinbase(String) // required {@link MinerDataResult#getCoinbase() coinbase}
   *    .extraData(String) // required {@link MinerDataResult#getExtraData() extraData}
   *    .difficulty(String) // required {@link MinerDataResult#getDifficulty() difficulty}
   *    .totalDifficulty(String) // required {@link MinerDataResult#getTotalDifficulty() totalDifficulty}
   *    .build();
   * </pre>
   * @return A new ImmutableMinerDataResult builder
   */
  public static ImmutableMinerDataResult.Builder builder() {
    return new ImmutableMinerDataResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMinerDataResult ImmutableMinerDataResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MinerDataResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NET_BLOCK_REWARD = 0x1L;
    private static final long INIT_BIT_STATIC_BLOCK_REWARD = 0x2L;
    private static final long INIT_BIT_TRANSACTION_FEE = 0x4L;
    private static final long INIT_BIT_UNCLE_INCLUSION_REWARD = 0x8L;
    private static final long INIT_BIT_COINBASE = 0x10L;
    private static final long INIT_BIT_EXTRA_DATA = 0x20L;
    private static final long INIT_BIT_DIFFICULTY = 0x40L;
    private static final long INIT_BIT_TOTAL_DIFFICULTY = 0x80L;
    private long initBits = 0xffL;

    private @Nullable String netBlockReward;
    private @Nullable String staticBlockReward;
    private @Nullable String transactionFee;
    private @Nullable String uncleInclusionReward;
    private ImmutableList.Builder<MinerDataResult.UncleRewardResult> uncleRewards = ImmutableList.builder();
    private @Nullable String coinbase;
    private @Nullable String extraData;
    private @Nullable String difficulty;
    private @Nullable String totalDifficulty;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MinerDataResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(MinerDataResult instance) {
      Objects.requireNonNull(instance, "instance");
      netBlockReward(instance.getNetBlockReward());
      staticBlockReward(instance.getStaticBlockReward());
      transactionFee(instance.getTransactionFee());
      uncleInclusionReward(instance.getUncleInclusionReward());
      addAllUncleRewards(instance.getUncleRewards());
      coinbase(instance.getCoinbase());
      extraData(instance.getExtraData());
      difficulty(instance.getDifficulty());
      totalDifficulty(instance.getTotalDifficulty());
      return this;
    }

    /**
     * Initializes the value for the {@link MinerDataResult#getNetBlockReward() netBlockReward} attribute.
     * @param netBlockReward The value for netBlockReward 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder netBlockReward(String netBlockReward) {
      this.netBlockReward = Objects.requireNonNull(netBlockReward, "netBlockReward");
      initBits &= ~INIT_BIT_NET_BLOCK_REWARD;
      return this;
    }

    /**
     * Initializes the value for the {@link MinerDataResult#getStaticBlockReward() staticBlockReward} attribute.
     * @param staticBlockReward The value for staticBlockReward 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder staticBlockReward(String staticBlockReward) {
      this.staticBlockReward = Objects.requireNonNull(staticBlockReward, "staticBlockReward");
      initBits &= ~INIT_BIT_STATIC_BLOCK_REWARD;
      return this;
    }

    /**
     * Initializes the value for the {@link MinerDataResult#getTransactionFee() transactionFee} attribute.
     * @param transactionFee The value for transactionFee 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder transactionFee(String transactionFee) {
      this.transactionFee = Objects.requireNonNull(transactionFee, "transactionFee");
      initBits &= ~INIT_BIT_TRANSACTION_FEE;
      return this;
    }

    /**
     * Initializes the value for the {@link MinerDataResult#getUncleInclusionReward() uncleInclusionReward} attribute.
     * @param uncleInclusionReward The value for uncleInclusionReward 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder uncleInclusionReward(String uncleInclusionReward) {
      this.uncleInclusionReward = Objects.requireNonNull(uncleInclusionReward, "uncleInclusionReward");
      initBits &= ~INIT_BIT_UNCLE_INCLUSION_REWARD;
      return this;
    }

    /**
     * Adds one element to {@link MinerDataResult#getUncleRewards() uncleRewards} list.
     * @param element A uncleRewards element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addUncleRewards(MinerDataResult.UncleRewardResult element) {
      this.uncleRewards.add(element);
      return this;
    }

    /**
     * Adds elements to {@link MinerDataResult#getUncleRewards() uncleRewards} list.
     * @param elements An array of uncleRewards elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addUncleRewards(MinerDataResult.UncleRewardResult... elements) {
      this.uncleRewards.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link MinerDataResult#getUncleRewards() uncleRewards} list.
     * @param elements An iterable of uncleRewards elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder uncleRewards(Iterable<? extends MinerDataResult.UncleRewardResult> elements) {
      this.uncleRewards = ImmutableList.builder();
      return addAllUncleRewards(elements);
    }

    /**
     * Adds elements to {@link MinerDataResult#getUncleRewards() uncleRewards} list.
     * @param elements An iterable of uncleRewards elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllUncleRewards(Iterable<? extends MinerDataResult.UncleRewardResult> elements) {
      this.uncleRewards.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link MinerDataResult#getCoinbase() coinbase} attribute.
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
     * Initializes the value for the {@link MinerDataResult#getExtraData() extraData} attribute.
     * @param extraData The value for extraData 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder extraData(String extraData) {
      this.extraData = Objects.requireNonNull(extraData, "extraData");
      initBits &= ~INIT_BIT_EXTRA_DATA;
      return this;
    }

    /**
     * Initializes the value for the {@link MinerDataResult#getDifficulty() difficulty} attribute.
     * @param difficulty The value for difficulty 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder difficulty(String difficulty) {
      this.difficulty = Objects.requireNonNull(difficulty, "difficulty");
      initBits &= ~INIT_BIT_DIFFICULTY;
      return this;
    }

    /**
     * Initializes the value for the {@link MinerDataResult#getTotalDifficulty() totalDifficulty} attribute.
     * @param totalDifficulty The value for totalDifficulty 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder totalDifficulty(String totalDifficulty) {
      this.totalDifficulty = Objects.requireNonNull(totalDifficulty, "totalDifficulty");
      initBits &= ~INIT_BIT_TOTAL_DIFFICULTY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMinerDataResult ImmutableMinerDataResult}.
     * @return An immutable instance of MinerDataResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMinerDataResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMinerDataResult(
          netBlockReward,
          staticBlockReward,
          transactionFee,
          uncleInclusionReward,
          uncleRewards.build(),
          coinbase,
          extraData,
          difficulty,
          totalDifficulty);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NET_BLOCK_REWARD) != 0) attributes.add("netBlockReward");
      if ((initBits & INIT_BIT_STATIC_BLOCK_REWARD) != 0) attributes.add("staticBlockReward");
      if ((initBits & INIT_BIT_TRANSACTION_FEE) != 0) attributes.add("transactionFee");
      if ((initBits & INIT_BIT_UNCLE_INCLUSION_REWARD) != 0) attributes.add("uncleInclusionReward");
      if ((initBits & INIT_BIT_COINBASE) != 0) attributes.add("coinbase");
      if ((initBits & INIT_BIT_EXTRA_DATA) != 0) attributes.add("extraData");
      if ((initBits & INIT_BIT_DIFFICULTY) != 0) attributes.add("difficulty");
      if ((initBits & INIT_BIT_TOTAL_DIFFICULTY) != 0) attributes.add("totalDifficulty");
      return "Cannot build MinerDataResult, some of required attributes are not set " + attributes;
    }
  }
}
