package org.hyperledger.besu.ethereum.api.jsonrpc.internal.results;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.hyperledger.besu.datatypes.Wei;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link FeeHistory}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFeeHistory.builder()}.
 */
@Generated(from = "FeeHistory", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableFeeHistory
    implements FeeHistory {
  private final long oldestBlock;
  private final ImmutableList<Wei> baseFeePerGas;
  private final ImmutableList<Double> gasUsedRatio;
  private final @Nullable List<List<Wei>> reward;

  private ImmutableFeeHistory(
      long oldestBlock,
      ImmutableList<Wei> baseFeePerGas,
      ImmutableList<Double> gasUsedRatio,
      @Nullable List<List<Wei>> reward) {
    this.oldestBlock = oldestBlock;
    this.baseFeePerGas = baseFeePerGas;
    this.gasUsedRatio = gasUsedRatio;
    this.reward = reward;
  }

  /**
   * @return The value of the {@code oldestBlock} attribute
   */
  @Override
  public long getOldestBlock() {
    return oldestBlock;
  }

  /**
   * @return The value of the {@code baseFeePerGas} attribute
   */
  @Override
  public ImmutableList<Wei> getBaseFeePerGas() {
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
  public Optional<List<List<Wei>>> getReward() {
    return Optional.ofNullable(reward);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FeeHistory#getOldestBlock() oldestBlock} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for oldestBlock
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFeeHistory withOldestBlock(long value) {
    if (this.oldestBlock == value) return this;
    return new ImmutableFeeHistory(value, this.baseFeePerGas, this.gasUsedRatio, this.reward);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory#getBaseFeePerGas() baseFeePerGas}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistory withBaseFeePerGas(Wei... elements) {
    ImmutableList<Wei> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFeeHistory(this.oldestBlock, newValue, this.gasUsedRatio, this.reward);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory#getBaseFeePerGas() baseFeePerGas}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of baseFeePerGas elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistory withBaseFeePerGas(Iterable<? extends Wei> elements) {
    if (this.baseFeePerGas == elements) return this;
    ImmutableList<Wei> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFeeHistory(this.oldestBlock, newValue, this.gasUsedRatio, this.reward);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory#getGasUsedRatio() gasUsedRatio}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistory withGasUsedRatio(double... elements) {
    ImmutableList<Double> newValue = ImmutableList.copyOf(Doubles.asList(elements));
    return new ImmutableFeeHistory(this.oldestBlock, this.baseFeePerGas, newValue, this.reward);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link FeeHistory#getGasUsedRatio() gasUsedRatio}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of gasUsedRatio elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistory withGasUsedRatio(Iterable<Double> elements) {
    if (this.gasUsedRatio == elements) return this;
    ImmutableList<Double> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFeeHistory(this.oldestBlock, this.baseFeePerGas, newValue, this.reward);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FeeHistory#getReward() reward} attribute.
   * @param value The value for reward
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFeeHistory withReward(List<List<Wei>> value) {
    @Nullable List<List<Wei>> newValue = Objects.requireNonNull(value, "reward");
    if (this.reward == newValue) return this;
    return new ImmutableFeeHistory(this.oldestBlock, this.baseFeePerGas, this.gasUsedRatio, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FeeHistory#getReward() reward} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reward
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFeeHistory withReward(Optional<? extends List<List<Wei>>> optional) {
    @Nullable List<List<Wei>> value = optional.orElse(null);
    if (this.reward == value) return this;
    return new ImmutableFeeHistory(this.oldestBlock, this.baseFeePerGas, this.gasUsedRatio, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFeeHistory} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFeeHistory
        && equalTo(0, (ImmutableFeeHistory) another);
  }

  private boolean equalTo(int synthetic, ImmutableFeeHistory another) {
    return oldestBlock == another.oldestBlock
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
    h += (h << 5) + Longs.hashCode(oldestBlock);
    h += (h << 5) + baseFeePerGas.hashCode();
    h += (h << 5) + gasUsedRatio.hashCode();
    h += (h << 5) + Objects.hashCode(reward);
    return h;
  }

  /**
   * Prints the immutable value {@code FeeHistory} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("FeeHistory")
        .omitNullValues()
        .add("oldestBlock", oldestBlock)
        .add("baseFeePerGas", baseFeePerGas)
        .add("gasUsedRatio", gasUsedRatio)
        .add("reward", reward)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link FeeHistory} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FeeHistory instance
   */
  public static ImmutableFeeHistory copyOf(FeeHistory instance) {
    if (instance instanceof ImmutableFeeHistory) {
      return (ImmutableFeeHistory) instance;
    }
    return ImmutableFeeHistory.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFeeHistory ImmutableFeeHistory}.
   * <pre>
   * ImmutableFeeHistory.builder()
   *    .oldestBlock(long) // required {@link FeeHistory#getOldestBlock() oldestBlock}
   *    .addBaseFeePerGas|addAllBaseFeePerGas(org.hyperledger.besu.datatypes.Wei) // {@link FeeHistory#getBaseFeePerGas() baseFeePerGas} elements
   *    .addGasUsedRatio|addAllGasUsedRatio(double) // {@link FeeHistory#getGasUsedRatio() gasUsedRatio} elements
   *    .reward(List&amp;lt;List&amp;lt;org.hyperledger.besu.datatypes.Wei&amp;gt;&amp;gt;) // optional {@link FeeHistory#getReward() reward}
   *    .build();
   * </pre>
   * @return A new ImmutableFeeHistory builder
   */
  public static ImmutableFeeHistory.Builder builder() {
    return new ImmutableFeeHistory.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFeeHistory ImmutableFeeHistory}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "FeeHistory", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_OLDEST_BLOCK = 0x1L;
    private long initBits = 0x1L;

    private long oldestBlock;
    private ImmutableList.Builder<Wei> baseFeePerGas = ImmutableList.builder();
    private ImmutableList.Builder<Double> gasUsedRatio = ImmutableList.builder();
    private @Nullable List<List<Wei>> reward;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FeeHistory} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(FeeHistory instance) {
      Objects.requireNonNull(instance, "instance");
      oldestBlock(instance.getOldestBlock());
      addAllBaseFeePerGas(instance.getBaseFeePerGas());
      addAllGasUsedRatio(instance.getGasUsedRatio());
      Optional<List<List<Wei>>> rewardOptional = instance.getReward();
      if (rewardOptional.isPresent()) {
        reward(rewardOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link FeeHistory#getOldestBlock() oldestBlock} attribute.
     * @param oldestBlock The value for oldestBlock 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder oldestBlock(long oldestBlock) {
      this.oldestBlock = oldestBlock;
      initBits &= ~INIT_BIT_OLDEST_BLOCK;
      return this;
    }

    /**
     * Adds one element to {@link FeeHistory#getBaseFeePerGas() baseFeePerGas} list.
     * @param element A baseFeePerGas element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addBaseFeePerGas(Wei element) {
      this.baseFeePerGas.add(element);
      return this;
    }

    /**
     * Adds elements to {@link FeeHistory#getBaseFeePerGas() baseFeePerGas} list.
     * @param elements An array of baseFeePerGas elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addBaseFeePerGas(Wei... elements) {
      this.baseFeePerGas.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link FeeHistory#getBaseFeePerGas() baseFeePerGas} list.
     * @param elements An iterable of baseFeePerGas elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder baseFeePerGas(Iterable<? extends Wei> elements) {
      this.baseFeePerGas = ImmutableList.builder();
      return addAllBaseFeePerGas(elements);
    }

    /**
     * Adds elements to {@link FeeHistory#getBaseFeePerGas() baseFeePerGas} list.
     * @param elements An iterable of baseFeePerGas elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllBaseFeePerGas(Iterable<? extends Wei> elements) {
      this.baseFeePerGas.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link FeeHistory#getGasUsedRatio() gasUsedRatio} list.
     * @param element A gasUsedRatio element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addGasUsedRatio(double element) {
      this.gasUsedRatio.add(element);
      return this;
    }

    /**
     * Adds elements to {@link FeeHistory#getGasUsedRatio() gasUsedRatio} list.
     * @param elements An array of gasUsedRatio elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addGasUsedRatio(double... elements) {
      this.gasUsedRatio.addAll(Doubles.asList(elements));
      return this;
    }


    /**
     * Sets or replaces all elements for {@link FeeHistory#getGasUsedRatio() gasUsedRatio} list.
     * @param elements An iterable of gasUsedRatio elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder gasUsedRatio(Iterable<Double> elements) {
      this.gasUsedRatio = ImmutableList.builder();
      return addAllGasUsedRatio(elements);
    }

    /**
     * Adds elements to {@link FeeHistory#getGasUsedRatio() gasUsedRatio} list.
     * @param elements An iterable of gasUsedRatio elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllGasUsedRatio(Iterable<Double> elements) {
      this.gasUsedRatio.addAll(elements);
      return this;
    }

    /**
     * Initializes the optional value {@link FeeHistory#getReward() reward} to reward.
     * @param reward The value for reward
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder reward(List<List<Wei>> reward) {
      this.reward = Objects.requireNonNull(reward, "reward");
      return this;
    }

    /**
     * Initializes the optional value {@link FeeHistory#getReward() reward} to reward.
     * @param reward The value for reward
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder reward(Optional<? extends List<List<Wei>>> reward) {
      this.reward = reward.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableFeeHistory ImmutableFeeHistory}.
     * @return An immutable instance of FeeHistory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFeeHistory build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFeeHistory(oldestBlock, baseFeePerGas.build(), gasUsedRatio.build(), reward);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_OLDEST_BLOCK) != 0) attributes.add("oldestBlock");
      return "Cannot build FeeHistory, some of required attributes are not set " + attributes;
    }
  }
}
