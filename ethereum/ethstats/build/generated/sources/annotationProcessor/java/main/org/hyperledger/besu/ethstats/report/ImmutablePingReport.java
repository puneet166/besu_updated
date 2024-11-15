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
 * Immutable implementation of {@link PingReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePingReport.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutablePingReport.of()}.
 */
@Generated(from = "PingReport", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePingReport implements PingReport {
  private final String id;
  private final String currentTime;

  private ImmutablePingReport(String id, String currentTime) {
    this.id = Objects.requireNonNull(id, "id");
    this.currentTime = Objects.requireNonNull(currentTime, "currentTime");
  }

  private ImmutablePingReport(ImmutablePingReport original, String id, String currentTime) {
    this.id = id;
    this.currentTime = currentTime;
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
   * @return The value of the {@code currentTime} attribute
   */
  @JsonProperty("clientTime")
  @Override
  public String getCurrentTime() {
    return currentTime;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PingReport#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePingReport withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutablePingReport(this, newValue, this.currentTime);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PingReport#getCurrentTime() currentTime} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currentTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePingReport withCurrentTime(String value) {
    String newValue = Objects.requireNonNull(value, "currentTime");
    if (this.currentTime.equals(newValue)) return this;
    return new ImmutablePingReport(this, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePingReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePingReport
        && equalTo(0, (ImmutablePingReport) another);
  }

  private boolean equalTo(int synthetic, ImmutablePingReport another) {
    return id.equals(another.id)
        && currentTime.equals(another.currentTime);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code currentTime}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + currentTime.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PingReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PingReport")
        .omitNullValues()
        .add("id", id)
        .add("currentTime", currentTime)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PingReport", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PingReport {
    @Nullable String id;
    @Nullable String currentTime;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("clientTime")
    public void setCurrentTime(String currentTime) {
      this.currentTime = currentTime;
    }
    @Override
    public String getId() { throw new UnsupportedOperationException(); }
    @Override
    public String getCurrentTime() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePingReport fromJson(Json json) {
    ImmutablePingReport.Builder builder = ImmutablePingReport.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.currentTime != null) {
      builder.currentTime(json.currentTime);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code PingReport} instance.
   * @param id The value for the {@code id} attribute
   * @param currentTime The value for the {@code currentTime} attribute
   * @return An immutable PingReport instance
   */
  public static ImmutablePingReport of(String id, String currentTime) {
    return new ImmutablePingReport(id, currentTime);
  }

  /**
   * Creates an immutable copy of a {@link PingReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PingReport instance
   */
  public static ImmutablePingReport copyOf(PingReport instance) {
    if (instance instanceof ImmutablePingReport) {
      return (ImmutablePingReport) instance;
    }
    return ImmutablePingReport.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePingReport ImmutablePingReport}.
   * <pre>
   * ImmutablePingReport.builder()
   *    .id(String) // required {@link PingReport#getId() id}
   *    .currentTime(String) // required {@link PingReport#getCurrentTime() currentTime}
   *    .build();
   * </pre>
   * @return A new ImmutablePingReport builder
   */
  public static ImmutablePingReport.Builder builder() {
    return new ImmutablePingReport.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePingReport ImmutablePingReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PingReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_CURRENT_TIME = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String id;
    private @Nullable String currentTime;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PingReport} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PingReport instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      currentTime(instance.getCurrentTime());
      return this;
    }

    /**
     * Initializes the value for the {@link PingReport#getId() id} attribute.
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
     * Initializes the value for the {@link PingReport#getCurrentTime() currentTime} attribute.
     * @param currentTime The value for currentTime 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("clientTime")
    public final Builder currentTime(String currentTime) {
      this.currentTime = Objects.requireNonNull(currentTime, "currentTime");
      initBits &= ~INIT_BIT_CURRENT_TIME;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePingReport ImmutablePingReport}.
     * @return An immutable instance of PingReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePingReport build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePingReport(null, id, currentTime);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_CURRENT_TIME) != 0) attributes.add("currentTime");
      return "Cannot build PingReport, some of required attributes are not set " + attributes;
    }
  }
}
