package org.hyperledger.besu.ethereum.worldstate;

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
 * Immutable implementation of {@link DataStorageConfiguration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDataStorageConfiguration.builder()}.
 */
@Generated(from = "DataStorageConfiguration", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableDataStorageConfiguration
    implements DataStorageConfiguration {
  private final DataStorageFormat dataStorageFormat;
  private final Long bonsaiMaxLayersToLoad;

  private ImmutableDataStorageConfiguration(
      DataStorageFormat dataStorageFormat,
      Long bonsaiMaxLayersToLoad) {
    this.dataStorageFormat = dataStorageFormat;
    this.bonsaiMaxLayersToLoad = bonsaiMaxLayersToLoad;
  }

  /**
   * @return The value of the {@code dataStorageFormat} attribute
   */
  @Override
  public DataStorageFormat getDataStorageFormat() {
    return dataStorageFormat;
  }

  /**
   * @return The value of the {@code bonsaiMaxLayersToLoad} attribute
   */
  @Override
  public Long getBonsaiMaxLayersToLoad() {
    return bonsaiMaxLayersToLoad;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataStorageConfiguration#getDataStorageFormat() dataStorageFormat} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataStorageFormat
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataStorageConfiguration withDataStorageFormat(DataStorageFormat value) {
    DataStorageFormat newValue = Objects.requireNonNull(value, "dataStorageFormat");
    if (this.dataStorageFormat == newValue) return this;
    return new ImmutableDataStorageConfiguration(newValue, this.bonsaiMaxLayersToLoad);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataStorageConfiguration#getBonsaiMaxLayersToLoad() bonsaiMaxLayersToLoad} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bonsaiMaxLayersToLoad
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataStorageConfiguration withBonsaiMaxLayersToLoad(Long value) {
    Long newValue = Objects.requireNonNull(value, "bonsaiMaxLayersToLoad");
    if (this.bonsaiMaxLayersToLoad.equals(newValue)) return this;
    return new ImmutableDataStorageConfiguration(this.dataStorageFormat, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDataStorageConfiguration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDataStorageConfiguration
        && equalTo(0, (ImmutableDataStorageConfiguration) another);
  }

  private boolean equalTo(int synthetic, ImmutableDataStorageConfiguration another) {
    return dataStorageFormat.equals(another.dataStorageFormat)
        && bonsaiMaxLayersToLoad.equals(another.bonsaiMaxLayersToLoad);
  }

  /**
   * Computes a hash code from attributes: {@code dataStorageFormat}, {@code bonsaiMaxLayersToLoad}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + dataStorageFormat.hashCode();
    h += (h << 5) + bonsaiMaxLayersToLoad.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DataStorageConfiguration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DataStorageConfiguration")
        .omitNullValues()
        .add("dataStorageFormat", dataStorageFormat)
        .add("bonsaiMaxLayersToLoad", bonsaiMaxLayersToLoad)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link DataStorageConfiguration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DataStorageConfiguration instance
   */
  public static ImmutableDataStorageConfiguration copyOf(DataStorageConfiguration instance) {
    if (instance instanceof ImmutableDataStorageConfiguration) {
      return (ImmutableDataStorageConfiguration) instance;
    }
    return ImmutableDataStorageConfiguration.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDataStorageConfiguration ImmutableDataStorageConfiguration}.
   * <pre>
   * ImmutableDataStorageConfiguration.builder()
   *    .dataStorageFormat(org.hyperledger.besu.ethereum.worldstate.DataStorageFormat) // required {@link DataStorageConfiguration#getDataStorageFormat() dataStorageFormat}
   *    .bonsaiMaxLayersToLoad(Long) // required {@link DataStorageConfiguration#getBonsaiMaxLayersToLoad() bonsaiMaxLayersToLoad}
   *    .build();
   * </pre>
   * @return A new ImmutableDataStorageConfiguration builder
   */
  public static ImmutableDataStorageConfiguration.Builder builder() {
    return new ImmutableDataStorageConfiguration.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDataStorageConfiguration ImmutableDataStorageConfiguration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DataStorageConfiguration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DATA_STORAGE_FORMAT = 0x1L;
    private static final long INIT_BIT_BONSAI_MAX_LAYERS_TO_LOAD = 0x2L;
    private long initBits = 0x3L;

    private @Nullable DataStorageFormat dataStorageFormat;
    private @Nullable Long bonsaiMaxLayersToLoad;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DataStorageConfiguration} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(DataStorageConfiguration instance) {
      Objects.requireNonNull(instance, "instance");
      dataStorageFormat(instance.getDataStorageFormat());
      bonsaiMaxLayersToLoad(instance.getBonsaiMaxLayersToLoad());
      return this;
    }

    /**
     * Initializes the value for the {@link DataStorageConfiguration#getDataStorageFormat() dataStorageFormat} attribute.
     * @param dataStorageFormat The value for dataStorageFormat 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder dataStorageFormat(DataStorageFormat dataStorageFormat) {
      this.dataStorageFormat = Objects.requireNonNull(dataStorageFormat, "dataStorageFormat");
      initBits &= ~INIT_BIT_DATA_STORAGE_FORMAT;
      return this;
    }

    /**
     * Initializes the value for the {@link DataStorageConfiguration#getBonsaiMaxLayersToLoad() bonsaiMaxLayersToLoad} attribute.
     * @param bonsaiMaxLayersToLoad The value for bonsaiMaxLayersToLoad 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder bonsaiMaxLayersToLoad(Long bonsaiMaxLayersToLoad) {
      this.bonsaiMaxLayersToLoad = Objects.requireNonNull(bonsaiMaxLayersToLoad, "bonsaiMaxLayersToLoad");
      initBits &= ~INIT_BIT_BONSAI_MAX_LAYERS_TO_LOAD;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDataStorageConfiguration ImmutableDataStorageConfiguration}.
     * @return An immutable instance of DataStorageConfiguration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDataStorageConfiguration build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDataStorageConfiguration(dataStorageFormat, bonsaiMaxLayersToLoad);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_DATA_STORAGE_FORMAT) != 0) attributes.add("dataStorageFormat");
      if ((initBits & INIT_BIT_BONSAI_MAX_LAYERS_TO_LOAD) != 0) attributes.add("bonsaiMaxLayersToLoad");
      return "Cannot build DataStorageConfiguration, some of required attributes are not set " + attributes;
    }
  }
}
