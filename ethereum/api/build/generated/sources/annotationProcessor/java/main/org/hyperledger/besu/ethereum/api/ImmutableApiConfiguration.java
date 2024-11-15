package org.hyperledger.besu.ethereum.api;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Longs;
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
 * Immutable implementation of {@link ApiConfiguration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableApiConfiguration.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableApiConfiguration.of()}.
 */
@Generated(from = "ApiConfiguration", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableApiConfiguration extends ApiConfiguration {
  private final long gasPriceBlocks;
  private final double gasPricePercentile;
  private final long gasPriceMin;
  private final long gasPriceMax;
  private transient final double gasPriceFraction;

  private ImmutableApiConfiguration(ImmutableApiConfiguration.Builder builder) {
    if (builder.gasPriceBlocksIsSet()) {
      initShim.gasPriceBlocks(builder.gasPriceBlocks);
    }
    if (builder.gasPricePercentileIsSet()) {
      initShim.gasPricePercentile(builder.gasPricePercentile);
    }
    if (builder.gasPriceMinIsSet()) {
      initShim.gasPriceMin(builder.gasPriceMin);
    }
    if (builder.gasPriceMaxIsSet()) {
      initShim.gasPriceMax(builder.gasPriceMax);
    }
    this.gasPriceBlocks = initShim.getGasPriceBlocks();
    this.gasPricePercentile = initShim.getGasPricePercentile();
    this.gasPriceMin = initShim.getGasPriceMin();
    this.gasPriceMax = initShim.getGasPriceMax();
    this.gasPriceFraction = initShim.getGasPriceFraction();
    this.initShim = null;
  }

  private ImmutableApiConfiguration(long gasPriceBlocks, double gasPricePercentile, long gasPriceMin, long gasPriceMax) {
    initShim.gasPriceBlocks(gasPriceBlocks);
    initShim.gasPricePercentile(gasPricePercentile);
    initShim.gasPriceMin(gasPriceMin);
    initShim.gasPriceMax(gasPriceMax);
    this.gasPriceBlocks = initShim.getGasPriceBlocks();
    this.gasPricePercentile = initShim.getGasPricePercentile();
    this.gasPriceMin = initShim.getGasPriceMin();
    this.gasPriceMax = initShim.getGasPriceMax();
    this.gasPriceFraction = initShim.getGasPriceFraction();
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "ApiConfiguration", generator = "Immutables")
  private final class InitShim {
    private byte gasPriceBlocksBuildStage = STAGE_UNINITIALIZED;
    private long gasPriceBlocks;

    long getGasPriceBlocks() {
      if (gasPriceBlocksBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (gasPriceBlocksBuildStage == STAGE_UNINITIALIZED) {
        gasPriceBlocksBuildStage = STAGE_INITIALIZING;
        this.gasPriceBlocks = ImmutableApiConfiguration.super.getGasPriceBlocks();
        gasPriceBlocksBuildStage = STAGE_INITIALIZED;
      }
      return this.gasPriceBlocks;
    }

    void gasPriceBlocks(long gasPriceBlocks) {
      this.gasPriceBlocks = gasPriceBlocks;
      gasPriceBlocksBuildStage = STAGE_INITIALIZED;
    }

    private byte gasPricePercentileBuildStage = STAGE_UNINITIALIZED;
    private double gasPricePercentile;

    double getGasPricePercentile() {
      if (gasPricePercentileBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (gasPricePercentileBuildStage == STAGE_UNINITIALIZED) {
        gasPricePercentileBuildStage = STAGE_INITIALIZING;
        this.gasPricePercentile = ImmutableApiConfiguration.super.getGasPricePercentile();
        gasPricePercentileBuildStage = STAGE_INITIALIZED;
      }
      return this.gasPricePercentile;
    }

    void gasPricePercentile(double gasPricePercentile) {
      this.gasPricePercentile = gasPricePercentile;
      gasPricePercentileBuildStage = STAGE_INITIALIZED;
    }

    private byte gasPriceMinBuildStage = STAGE_UNINITIALIZED;
    private long gasPriceMin;

    long getGasPriceMin() {
      if (gasPriceMinBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (gasPriceMinBuildStage == STAGE_UNINITIALIZED) {
        gasPriceMinBuildStage = STAGE_INITIALIZING;
        this.gasPriceMin = ImmutableApiConfiguration.super.getGasPriceMin();
        gasPriceMinBuildStage = STAGE_INITIALIZED;
      }
      return this.gasPriceMin;
    }

    void gasPriceMin(long gasPriceMin) {
      this.gasPriceMin = gasPriceMin;
      gasPriceMinBuildStage = STAGE_INITIALIZED;
    }

    private byte gasPriceMaxBuildStage = STAGE_UNINITIALIZED;
    private long gasPriceMax;

    long getGasPriceMax() {
      if (gasPriceMaxBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (gasPriceMaxBuildStage == STAGE_UNINITIALIZED) {
        gasPriceMaxBuildStage = STAGE_INITIALIZING;
        this.gasPriceMax = ImmutableApiConfiguration.super.getGasPriceMax();
        gasPriceMaxBuildStage = STAGE_INITIALIZED;
      }
      return this.gasPriceMax;
    }

    void gasPriceMax(long gasPriceMax) {
      this.gasPriceMax = gasPriceMax;
      gasPriceMaxBuildStage = STAGE_INITIALIZED;
    }

    private byte gasPriceFractionBuildStage = STAGE_UNINITIALIZED;
    private double gasPriceFraction;

    double getGasPriceFraction() {
      if (gasPriceFractionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (gasPriceFractionBuildStage == STAGE_UNINITIALIZED) {
        gasPriceFractionBuildStage = STAGE_INITIALIZING;
        this.gasPriceFraction = ImmutableApiConfiguration.super.getGasPriceFraction();
        gasPriceFractionBuildStage = STAGE_INITIALIZED;
      }
      return this.gasPriceFraction;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (gasPriceBlocksBuildStage == STAGE_INITIALIZING) attributes.add("gasPriceBlocks");
      if (gasPricePercentileBuildStage == STAGE_INITIALIZING) attributes.add("gasPricePercentile");
      if (gasPriceMinBuildStage == STAGE_INITIALIZING) attributes.add("gasPriceMin");
      if (gasPriceMaxBuildStage == STAGE_INITIALIZING) attributes.add("gasPriceMax");
      if (gasPriceFractionBuildStage == STAGE_INITIALIZING) attributes.add("gasPriceFraction");
      return "Cannot build ApiConfiguration, attribute initializers form cycle " + attributes;
    }
  }

  /**
   * @return The value of the {@code gasPriceBlocks} attribute
   */
  @Override
  public long getGasPriceBlocks() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getGasPriceBlocks()
        : this.gasPriceBlocks;
  }

  /**
   * @return The value of the {@code gasPricePercentile} attribute
   */
  @Override
  public double getGasPricePercentile() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getGasPricePercentile()
        : this.gasPricePercentile;
  }

  /**
   * @return The value of the {@code gasPriceMin} attribute
   */
  @Override
  public long getGasPriceMin() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getGasPriceMin()
        : this.gasPriceMin;
  }

  /**
   * @return The value of the {@code gasPriceMax} attribute
   */
  @Override
  public long getGasPriceMax() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getGasPriceMax()
        : this.gasPriceMax;
  }

  /**
   * @return The computed-at-construction value of the {@code gasPriceFraction} attribute
   */
  @Override
  public double getGasPriceFraction() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getGasPriceFraction()
        : this.gasPriceFraction;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ApiConfiguration#getGasPriceBlocks() gasPriceBlocks} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gasPriceBlocks
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApiConfiguration withGasPriceBlocks(long value) {
    if (this.gasPriceBlocks == value) return this;
    return new ImmutableApiConfiguration(value, this.gasPricePercentile, this.gasPriceMin, this.gasPriceMax);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ApiConfiguration#getGasPricePercentile() gasPricePercentile} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gasPricePercentile
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApiConfiguration withGasPricePercentile(double value) {
    if (Double.doubleToLongBits(this.gasPricePercentile) == Double.doubleToLongBits(value)) return this;
    return new ImmutableApiConfiguration(this.gasPriceBlocks, value, this.gasPriceMin, this.gasPriceMax);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ApiConfiguration#getGasPriceMin() gasPriceMin} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gasPriceMin
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApiConfiguration withGasPriceMin(long value) {
    if (this.gasPriceMin == value) return this;
    return new ImmutableApiConfiguration(this.gasPriceBlocks, this.gasPricePercentile, value, this.gasPriceMax);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ApiConfiguration#getGasPriceMax() gasPriceMax} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gasPriceMax
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApiConfiguration withGasPriceMax(long value) {
    if (this.gasPriceMax == value) return this;
    return new ImmutableApiConfiguration(this.gasPriceBlocks, this.gasPricePercentile, this.gasPriceMin, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableApiConfiguration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableApiConfiguration
        && equalTo(0, (ImmutableApiConfiguration) another);
  }

  private boolean equalTo(int synthetic, ImmutableApiConfiguration another) {
    return gasPriceBlocks == another.gasPriceBlocks
        && Double.doubleToLongBits(gasPricePercentile) == Double.doubleToLongBits(another.gasPricePercentile)
        && gasPriceMin == another.gasPriceMin
        && gasPriceMax == another.gasPriceMax
        && Double.doubleToLongBits(gasPriceFraction) == Double.doubleToLongBits(another.gasPriceFraction);
  }

  /**
   * Computes a hash code from attributes: {@code gasPriceBlocks}, {@code gasPricePercentile}, {@code gasPriceMin}, {@code gasPriceMax}, {@code gasPriceFraction}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Longs.hashCode(gasPriceBlocks);
    h += (h << 5) + Doubles.hashCode(gasPricePercentile);
    h += (h << 5) + Longs.hashCode(gasPriceMin);
    h += (h << 5) + Longs.hashCode(gasPriceMax);
    h += (h << 5) + Doubles.hashCode(gasPriceFraction);
    return h;
  }

  /**
   * Prints the immutable value {@code ApiConfiguration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ApiConfiguration")
        .omitNullValues()
        .add("gasPriceBlocks", gasPriceBlocks)
        .add("gasPricePercentile", gasPricePercentile)
        .add("gasPriceMin", gasPriceMin)
        .add("gasPriceMax", gasPriceMax)
        .add("gasPriceFraction", gasPriceFraction)
        .toString();
  }

  /**
   * Construct a new immutable {@code ApiConfiguration} instance.
   * @param gasPriceBlocks The value for the {@code gasPriceBlocks} attribute
   * @param gasPricePercentile The value for the {@code gasPricePercentile} attribute
   * @param gasPriceMin The value for the {@code gasPriceMin} attribute
   * @param gasPriceMax The value for the {@code gasPriceMax} attribute
   * @return An immutable ApiConfiguration instance
   */
  public static ImmutableApiConfiguration of(long gasPriceBlocks, double gasPricePercentile, long gasPriceMin, long gasPriceMax) {
    return new ImmutableApiConfiguration(gasPriceBlocks, gasPricePercentile, gasPriceMin, gasPriceMax);
  }

  /**
   * Creates an immutable copy of a {@link ApiConfiguration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ApiConfiguration instance
   */
  public static ImmutableApiConfiguration copyOf(ApiConfiguration instance) {
    if (instance instanceof ImmutableApiConfiguration) {
      return (ImmutableApiConfiguration) instance;
    }
    return ImmutableApiConfiguration.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableApiConfiguration ImmutableApiConfiguration}.
   * <pre>
   * ImmutableApiConfiguration.builder()
   *    .gasPriceBlocks(long) // optional {@link ApiConfiguration#getGasPriceBlocks() gasPriceBlocks}
   *    .gasPricePercentile(double) // optional {@link ApiConfiguration#getGasPricePercentile() gasPricePercentile}
   *    .gasPriceMin(long) // optional {@link ApiConfiguration#getGasPriceMin() gasPriceMin}
   *    .gasPriceMax(long) // optional {@link ApiConfiguration#getGasPriceMax() gasPriceMax}
   *    .build();
   * </pre>
   * @return A new ImmutableApiConfiguration builder
   */
  public static ImmutableApiConfiguration.Builder builder() {
    return new ImmutableApiConfiguration.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableApiConfiguration ImmutableApiConfiguration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ApiConfiguration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_GAS_PRICE_BLOCKS = 0x1L;
    private static final long OPT_BIT_GAS_PRICE_PERCENTILE = 0x2L;
    private static final long OPT_BIT_GAS_PRICE_MIN = 0x4L;
    private static final long OPT_BIT_GAS_PRICE_MAX = 0x8L;
    private long optBits;

    private long gasPriceBlocks;
    private double gasPricePercentile;
    private long gasPriceMin;
    private long gasPriceMax;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ApiConfiguration} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ApiConfiguration instance) {
      Objects.requireNonNull(instance, "instance");
      gasPriceBlocks(instance.getGasPriceBlocks());
      gasPricePercentile(instance.getGasPricePercentile());
      gasPriceMin(instance.getGasPriceMin());
      gasPriceMax(instance.getGasPriceMax());
      return this;
    }

    /**
     * Initializes the value for the {@link ApiConfiguration#getGasPriceBlocks() gasPriceBlocks} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ApiConfiguration#getGasPriceBlocks() gasPriceBlocks}.</em>
     * @param gasPriceBlocks The value for gasPriceBlocks 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder gasPriceBlocks(long gasPriceBlocks) {
      this.gasPriceBlocks = gasPriceBlocks;
      optBits |= OPT_BIT_GAS_PRICE_BLOCKS;
      return this;
    }

    /**
     * Initializes the value for the {@link ApiConfiguration#getGasPricePercentile() gasPricePercentile} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ApiConfiguration#getGasPricePercentile() gasPricePercentile}.</em>
     * @param gasPricePercentile The value for gasPricePercentile 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder gasPricePercentile(double gasPricePercentile) {
      this.gasPricePercentile = gasPricePercentile;
      optBits |= OPT_BIT_GAS_PRICE_PERCENTILE;
      return this;
    }

    /**
     * Initializes the value for the {@link ApiConfiguration#getGasPriceMin() gasPriceMin} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ApiConfiguration#getGasPriceMin() gasPriceMin}.</em>
     * @param gasPriceMin The value for gasPriceMin 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder gasPriceMin(long gasPriceMin) {
      this.gasPriceMin = gasPriceMin;
      optBits |= OPT_BIT_GAS_PRICE_MIN;
      return this;
    }

    /**
     * Initializes the value for the {@link ApiConfiguration#getGasPriceMax() gasPriceMax} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ApiConfiguration#getGasPriceMax() gasPriceMax}.</em>
     * @param gasPriceMax The value for gasPriceMax 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder gasPriceMax(long gasPriceMax) {
      this.gasPriceMax = gasPriceMax;
      optBits |= OPT_BIT_GAS_PRICE_MAX;
      return this;
    }

    /**
     * Builds a new {@link ImmutableApiConfiguration ImmutableApiConfiguration}.
     * @return An immutable instance of ApiConfiguration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableApiConfiguration build() {
      return new ImmutableApiConfiguration(this);
    }

    private boolean gasPriceBlocksIsSet() {
      return (optBits & OPT_BIT_GAS_PRICE_BLOCKS) != 0;
    }

    private boolean gasPricePercentileIsSet() {
      return (optBits & OPT_BIT_GAS_PRICE_PERCENTILE) != 0;
    }

    private boolean gasPriceMinIsSet() {
      return (optBits & OPT_BIT_GAS_PRICE_MIN) != 0;
    }

    private boolean gasPriceMaxIsSet() {
      return (optBits & OPT_BIT_GAS_PRICE_MAX) != 0;
    }
  }
}
