package org.hyperledger.besu.ethereum.api.jsonrpc.internal.results;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Doubles;
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
 * Immutable implementation of {@link FeeHistory.FeeHistoryResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFeeHistoryResult.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableFeeHistoryResult.of()}.
 */
@Generated(from = "FeeHistory.FeeHistoryResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableFeeHistoryResult
    implements FeeHistory.FeeHistoryResult {
  private final String oldestBlock;
  private final ImmutableList<String> baseFeePerGas;
  private final ImmutableList<Double> gasUsedRatio;
  private final @Nullable ImmutableList<List<String>> reward;

  private ImmutableFeeHistoryResult(
      String oldestBlock,
      Iterable<String> baseFeePerGas,
      Iterable<Double> gasUsedRatio,
      @Nullable Iterable<? extends List<String>> reward) {
    this.oldestBlock = Objects.requireNonNull(oldestBlock, "oldestBlock");
    this.baseFeePerGas = ImmutableList.copyOf(baseFeePerGas);
    this.gasUsedRatio = ImmutableList.copyOf(gasUsedRatio);
    this.reward = reward == null ? null : ImmutableList.copyOf(reward);
  }

  private ImmutableFeeHistoryResult(
      ImmutableFeeHistoryResult original,
      String oldestBlock,
      ImmutableList<String> baseFeePerGas,
      ImmutableList<Double> gasUsedRatio,
      @Nullable ImmutableList<List<String>> reward) {
    this.oldestBlock = oldestBlock;
    this.baseFeePerGas = baseFeePerGas;
    this.gasUsedRatio = gasUsedRatio;
    this.reward = reward;
  }

  /**
   * @return The value of the {@code oldestBlock} attribute
   */
  @Override
  public String getOldestBlock() {
    return oldestBlock;
  }

  /**
   * @return The value of the {@code baseFeePerGas} attribute
   */
  @Override
  public ImmutableList<String> getBaseFeePerGas() {
    return baseFeePerGas;
  }

  /**
   * @return The value of the {@code gasUsedRatio} attribute
   */
  @Override
  public ImmutableList<Double> getGasUsedRatio() {
    return gasUsedRatio;
  }

  /**
   * @return The value of the {@code reward} attribute
   */
  @Override
  public @Nullable ImmutableList<List<String>> getReward() {
    return reward;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FeeHistory.FeeHistoryResult#getOldestBlock() oldestBlock} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for oldestBlock
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFeeHistoryResult withOldestBlock(String value) {
    String newValue = Objects.requireNonNull(value, "oldestBlock");
    if (this.oldestBlock.equals(newValue)) return this;
    return new ImmutableFeeHistoryResult(this, newValue, this.baseFeePerGas, this.gasUsedRatio, this.reward);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory.FeeHistoryResult#getBaseFeePerGas() baseFeePerGas}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistoryResult withBaseFeePerGas(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFeeHistoryResult(this, this.oldestBlock, newValue, this.gasUsedRatio, this.reward);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory.FeeHistoryResult#getBaseFeePerGas() baseFeePerGas}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of baseFeePerGas elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistoryResult withBaseFeePerGas(Iterable<String> elements) {
    if (this.baseFeePerGas == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFeeHistoryResult(this, this.oldestBlock, newValue, this.gasUsedRatio, this.reward);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory.FeeHistoryResult#getGasUsedRatio() gasUsedRatio}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistoryResult withGasUsedRatio(double... elements) {
    ImmutableList<Double> newValue = ImmutableList.copyOf(Doubles.asList(elements));
    return new ImmutableFeeHistoryResult(this, this.oldestBlock, this.baseFeePerGas, newValue, this.reward);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory.FeeHistoryResult#getGasUsedRatio() gasUsedRatio}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of gasUsedRatio elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistoryResult withGasUsedRatio(Iterable<Double> elements) {
    if (this.gasUsedRatio == elements) return this;
    ImmutableList<Double> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFeeHistoryResult(this, this.oldestBlock, this.baseFeePerGas, newValue, this.reward);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory.FeeHistoryResult#getReward() reward}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final ImmutableFeeHistoryResult withReward(@Nullable List<String>... elements) {
    if (elements == null) {
      return new ImmutableFeeHistoryResult(this, this.oldestBlock, this.baseFeePerGas, this.gasUsedRatio, null);
    }
    @Nullable ImmutableList<List<String>> newValue = elements == null ? null : ImmutableList.copyOf(elements);
    return new ImmutableFeeHistoryResult(this, this.oldestBlock, this.baseFeePerGas, this.gasUsedRatio, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory.FeeHistoryResult#getReward() reward}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of reward elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistoryResult withReward(@Nullable Iterable<? extends List<String>> elements) {
    if (this.reward == elements) return this;
    @Nullable ImmutableList<List<String>> newValue = elements == null ? null : ImmutableList.copyOf(elements);
    return new ImmutableFeeHistoryResult(this, this.oldestBlock, this.baseFeePerGas, this.gasUsedRatio, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFeeHistoryResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFeeHistoryResult
        && equalTo(0, (ImmutableFeeHistoryResult) another);
  }

  private boolean equalTo(int synthetic, ImmutableFeeHistoryResult another) {
    return oldestBlock.equals(another.oldestBlock)
        && baseFeePerGas.equals(another.baseFeePerGas)
        && gasUsedRatio.equals(another.gasUsedRatio)
        && Objects.equals(reward, another.reward);
  }

  /**
   * Computes a hash code from attributes: {@code oldestBlock}, {@code baseFeePerGas}, {@code gasUsedRatio}, {@code reward}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + oldestBlock.hashCode();
    h += (h << 5) + baseFeePerGas.hashCode();
    h += (h << 5) + gasUsedRatio.hashCode();
    h += (h << 5) + Objects.hashCode(reward);
    return h;
  }

  /**
   * Prints the immutable value {@code FeeHistoryResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("FeeHistoryResult")
        .omitNullValues()
        .add("oldestBlock", oldestBlock)
        .add("baseFeePerGas", baseFeePerGas)
        .add("gasUsedRatio", gasUsedRatio)
        .add("reward", reward)
        .toString();
  }

  /**
   * Construct a new immutable {@code FeeHistoryResult} instance.
   * @param oldestBlock The value for the {@code oldestBlock} attribute
   * @param baseFeePerGas The value for the {@code baseFeePerGas} attribute
   * @param gasUsedRatio The value for the {@code gasUsedRatio} attribute
   * @param reward The value for the {@code reward} attribute
   * @return An immutable FeeHistoryResult instance
   */
  public static ImmutableFeeHistoryResult of(String oldestBlock, List<String> baseFeePerGas, List<Double> gasUsedRatio, @Nullable List<List<String>> reward) {
    return of(oldestBlock, (Iterable<String>) baseFeePerGas, (Iterable<Double>) gasUsedRatio, (Iterable<? extends List<String>>) reward);
  }

  /**
   * Construct a new immutable {@code FeeHistoryResult} instance.
   * @param oldestBlock The value for the {@code oldestBlock} attribute
   * @param baseFeePerGas The value for the {@code baseFeePerGas} attribute
   * @param gasUsedRatio The value for the {@code gasUsedRatio} attribute
   * @param reward The value for the {@code reward} attribute
   * @return An immutable FeeHistoryResult instance
   */
  public static ImmutableFeeHistoryResult of(String oldestBlock, Iterable<String> baseFeePerGas, Iterable<Double> gasUsedRatio, @Nullable Iterable<? extends List<String>> reward) {
    return new ImmutableFeeHistoryResult(oldestBlock, baseFeePerGas, gasUsedRatio, reward);
  }

  /**
   * Creates an immutable copy of a {@link FeeHistory.FeeHistoryResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FeeHistoryResult instance
   */
  public static ImmutableFeeHistoryResult copyOf(FeeHistory.FeeHistoryResult instance) {
    if (instance instanceof ImmutableFeeHistoryResult) {
      return (ImmutableFeeHistoryResult) instance;
    }
    return ImmutableFeeHistoryResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFeeHistoryResult ImmutableFeeHistoryResult}.
   * <pre>
   * ImmutableFeeHistoryResult.builder()
   *    .oldestBlock(String) // required {@link FeeHistory.FeeHistoryResult#getOldestBlock() oldestBlock}
   *    .addBaseFeePerGas|addAllBaseFeePerGas(String) // {@link FeeHistory.FeeHistoryResult#getBaseFeePerGas() baseFeePerGas} elements
   *    .addGasUsedRatio|addAllGasUsedRatio(double) // {@link FeeHistory.FeeHistoryResult#getGasUsedRatio() gasUsedRatio} elements
   *    .reward(List&amp;lt;List&amp;lt;String&amp;gt;&amp;gt; | null) // nullable {@link FeeHistory.FeeHistoryResult#getReward() reward}
   *    .build();
   * </pre>
   * @return A new ImmutableFeeHistoryResult builder
   */
  public static ImmutableFeeHistoryResult.Builder builder() {
    return new ImmutableFeeHistoryResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFeeHistoryResult ImmutableFeeHistoryResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "FeeHistory.FeeHistoryResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_OLDEST_BLOCK = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String oldestBlock;
    private ImmutableList.Builder<String> baseFeePerGas = ImmutableList.builder();
    private ImmutableList.Builder<Double> gasUsedRatio = ImmutableList.builder();
    private ImmutableList.Builder<List<String>> reward = null;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FeeHistoryResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(FeeHistory.FeeHistoryResult instance) {
      Objects.requireNonNull(instance, "instance");
      oldestBlock(instance.getOldestBlock());
      addAllBaseFeePerGas(instance.getBaseFeePerGas());
      addAllGasUsedRatio(instance.getGasUsedRatio());
      @Nullable List<List<String>> rewardValue = instance.getReward();
      if (rewardValue != null) {
        addAllReward(rewardValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link FeeHistory.FeeHistoryResult#getOldestBlock() oldestBlock} attribute.
     * @param oldestBlock The value for oldestBlock 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder oldestBlock(String oldestBlock) {
      this.oldestBlock = Objects.requireNonNull(oldestBlock, "oldestBlock");
      initBits &= ~INIT_BIT_OLDEST_BLOCK;
      return this;
    }

    /**
     * Adds one element to {@link FeeHistory.FeeHistoryResult#getBaseFeePerGas() baseFeePerGas} list.
     * @param element A baseFeePerGas element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addBaseFeePerGas(String element) {
      this.baseFeePerGas.add(element);
      return this;
    }

    /**
     * Adds elements to {@link FeeHistory.FeeHistoryResult#getBaseFeePerGas() baseFeePerGas} list.
     * @param elements An array of baseFeePerGas elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addBaseFeePerGas(String... elements) {
      this.baseFeePerGas.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link FeeHistory.FeeHistoryResult#getBaseFeePerGas() baseFeePerGas} list.
     * @param elements An iterable of baseFeePerGas elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder baseFeePerGas(Iterable<String> elements) {
      this.baseFeePerGas = ImmutableList.builder();
      return addAllBaseFeePerGas(elements);
    }

    /**
     * Adds elements to {@link FeeHistory.FeeHistoryResult#getBaseFeePerGas() baseFeePerGas} list.
     * @param elements An iterable of baseFeePerGas elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllBaseFeePerGas(Iterable<String> elements) {
      this.baseFeePerGas.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link FeeHistory.FeeHistoryResult#getGasUsedRatio() gasUsedRatio} list.
     * @param element A gasUsedRatio element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addGasUsedRatio(double element) {
      this.gasUsedRatio.add(element);
      return this;
    }

    /**
     * Adds elements to {@link FeeHistory.FeeHistoryResult#getGasUsedRatio() gasUsedRatio} list.
     * @param elements An array of gasUsedRatio elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addGasUsedRatio(double... elements) {
      this.gasUsedRatio.addAll(Doubles.asList(elements));
      return this;
    }


    /**
     * Sets or replaces all elements for {@link FeeHistory.FeeHistoryResult#getGasUsedRatio() gasUsedRatio} list.
     * @param elements An iterable of gasUsedRatio elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder gasUsedRatio(Iterable<Double> elements) {
      this.gasUsedRatio = ImmutableList.builder();
      return addAllGasUsedRatio(elements);
    }

    /**
     * Adds elements to {@link FeeHistory.FeeHistoryResult#getGasUsedRatio() gasUsedRatio} list.
     * @param elements An iterable of gasUsedRatio elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllGasUsedRatio(Iterable<Double> elements) {
      this.gasUsedRatio.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link FeeHistory.FeeHistoryResult#getReward() reward} list.
     * @param element A reward element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addReward(List<String> element) {
      if (this.reward == null) {
        this.reward = ImmutableList.builder();
      }
      this.reward.add(element);
      return this;
    }

    /**
     * Adds elements to {@link FeeHistory.FeeHistoryResult#getReward() reward} list.
     * @param elements An array of reward elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @SafeVarargs @SuppressWarnings("varargs")
    public final Builder addReward(List<String>... elements) {
      if (this.reward == null) {
        this.reward = ImmutableList.builder();
      }
      this.reward.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link FeeHistory.FeeHistoryResult#getReward() reward} list.
     * @param elements An iterable of reward elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder reward(@Nullable Iterable<? extends List<String>> elements) {
      if (elements == null) {
        this.reward = null;
        return this;
      }
      this.reward = ImmutableList.builder();
      return addAllReward(elements);
    }

    /**
     * Adds elements to {@link FeeHistory.FeeHistoryResult#getReward() reward} list.
     * @param elements An iterable of reward elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllReward(Iterable<? extends List<String>> elements) {
      Objects.requireNonNull(elements, "reward element");
      if (this.reward == null) {
        this.reward = ImmutableList.builder();
      }
      this.reward.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableFeeHistoryResult ImmutableFeeHistoryResult}.
     * @return An immutable instance of FeeHistoryResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFeeHistoryResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFeeHistoryResult(
          null,
          oldestBlock,
          baseFeePerGas.build(),
          gasUsedRatio.build(),
          reward == null ? null : reward.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_OLDEST_BLOCK) != 0) attributes.add("oldestBlock");
      return "Cannot build FeeHistoryResult, some of required attributes are not set " + attributes;
    }
  }
}
