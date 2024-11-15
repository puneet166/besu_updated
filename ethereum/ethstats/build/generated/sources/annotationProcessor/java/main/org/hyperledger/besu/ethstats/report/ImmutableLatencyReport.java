package org.hyperledger.besu.ethstats.report;

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
 * Immutable implementation of {@link LatencyReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLatencyReport.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableLatencyReport.of()}.
 */
@Generated(from = "LatencyReport", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableLatencyReport implements LatencyReport {
  private final String id;
  private final String latency;

  private ImmutableLatencyReport(String id, String latency) {
    this.id = Objects.requireNonNull(id, "id");
    this.latency = Objects.requireNonNull(latency, "latency");
  }

  private ImmutableLatencyReport(ImmutableLatencyReport original, String id, String latency) {
    this.id = id;
    this.latency = latency;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String getId() {
    return id;
  }

  /**
   * @return The value of the {@code latency} attribute
   */
  @JsonProperty("latency")
  @Override
  public String getLatency() {
    return latency;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LatencyReport#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLatencyReport withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableLatencyReport(this, newValue, this.latency);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LatencyReport#getLatency() latency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for latency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLatencyReport withLatency(String value) {
    String newValue = Objects.requireNonNull(value, "latency");
    if (this.latency.equals(newValue)) return this;
    return new ImmutableLatencyReport(this, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLatencyReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLatencyReport
        && equalTo(0, (ImmutableLatencyReport) another);
  }

  private boolean equalTo(int synthetic, ImmutableLatencyReport another) {
    return id.equals(another.id)
        && latency.equals(another.latency);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code latency}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + latency.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LatencyReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("LatencyReport")
        .omitNullValues()
        .add("id", id)
        .add("latency", latency)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "LatencyReport", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LatencyReport {
    @Nullable String id;
    @Nullable String latency;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("latency")
    public void setLatency(String latency) {
      this.latency = latency;
    }
    @Override
    public String getId() { throw new UnsupportedOperationException(); }
    @Override
    public String getLatency() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLatencyReport fromJson(Json json) {
    ImmutableLatencyReport.Builder builder = ImmutableLatencyReport.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.latency != null) {
      builder.latency(json.latency);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code LatencyReport} instance.
   * @param id The value for the {@code id} attribute
   * @param latency The value for the {@code latency} attribute
   * @return An immutable LatencyReport instance
   */
  public static ImmutableLatencyReport of(String id, String latency) {
    return new ImmutableLatencyReport(id, latency);
  }

  /**
   * Creates an immutable copy of a {@link LatencyReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LatencyReport instance
   */
  public static ImmutableLatencyReport copyOf(LatencyReport instance) {
    if (instance instanceof ImmutableLatencyReport) {
      return (ImmutableLatencyReport) instance;
    }
    return ImmutableLatencyReport.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLatencyReport ImmutableLatencyReport}.
   * <pre>
   * ImmutableLatencyReport.builder()
   *    .id(String) // required {@link LatencyReport#getId() id}
   *    .latency(String) // required {@link LatencyReport#getLatency() latency}
   *    .build();
   * </pre>
   * @return A new ImmutableLatencyReport builder
   */
  public static ImmutableLatencyReport.Builder builder() {
    return new ImmutableLatencyReport.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLatencyReport ImmutableLatencyReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "LatencyReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_LATENCY = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String id;
    private @Nullable String latency;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LatencyReport} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(LatencyReport instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      latency(instance.getLatency());
      return this;
    }

    /**
     * Initializes the value for the {@link LatencyReport#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("id")
    public final Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link LatencyReport#getLatency() latency} attribute.
     * @param latency The value for latency 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("latency")
    public final Builder latency(String latency) {
      this.latency = Objects.requireNonNull(latency, "latency");
      initBits &= ~INIT_BIT_LATENCY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableLatencyReport ImmutableLatencyReport}.
     * @return An immutable instance of LatencyReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLatencyReport build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLatencyReport(null, id, latency);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_LATENCY) != 0) attributes.add("latency");
      return "Cannot build LatencyReport, some of required attributes are not set " + attributes;
    }
  }
}
