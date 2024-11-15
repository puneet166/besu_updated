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
 * Immutable implementation of {@link PendingTransactionsReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePendingTransactionsReport.builder()}.
 */
@Generated(from = "PendingTransactionsReport", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePendingTransactionsReport
    implements PendingTransactionsReport {
  private final String id;
  private final ImmutablePStats stats;

  private ImmutablePendingTransactionsReport(String id, ImmutablePStats stats) {
    this.id = id;
    this.stats = stats;
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
   * @return The value of the {@code stats} attribute
   */
  @JsonProperty("stats")
  @Override
  public ImmutablePStats getStats() {
    return stats;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PendingTransactionsReport#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePendingTransactionsReport withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutablePendingTransactionsReport(newValue, this.stats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PendingTransactionsReport#getStats() stats} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for stats
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePendingTransactionsReport withStats(PendingTransactionsReport.PStats value) {
    if (this.stats == value) return this;
    ImmutablePStats newValue = ImmutablePStats.copyOf(value);
    return new ImmutablePendingTransactionsReport(this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePendingTransactionsReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePendingTransactionsReport
        && equalTo(0, (ImmutablePendingTransactionsReport) another);
  }

  private boolean equalTo(int synthetic, ImmutablePendingTransactionsReport another) {
    return id.equals(another.id)
        && stats.equals(another.stats);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code stats}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + stats.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PendingTransactionsReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PendingTransactionsReport")
        .omitNullValues()
        .add("id", id)
        .add("stats", stats)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PendingTransactionsReport", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PendingTransactionsReport {
    @Nullable String id;
    @Nullable PendingTransactionsReport.PStats stats;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("stats")
    public void setStats(PendingTransactionsReport.PStats stats) {
      this.stats = stats;
    }
    @Override
    public String getId() { throw new UnsupportedOperationException(); }
    @Override
    public PendingTransactionsReport.PStats getStats() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePendingTransactionsReport fromJson(Json json) {
    ImmutablePendingTransactionsReport.Builder builder = ImmutablePendingTransactionsReport.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.stats != null) {
      builder.stats(json.stats);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PendingTransactionsReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PendingTransactionsReport instance
   */
  public static ImmutablePendingTransactionsReport copyOf(PendingTransactionsReport instance) {
    if (instance instanceof ImmutablePendingTransactionsReport) {
      return (ImmutablePendingTransactionsReport) instance;
    }
    return ImmutablePendingTransactionsReport.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePendingTransactionsReport ImmutablePendingTransactionsReport}.
   * <pre>
   * ImmutablePendingTransactionsReport.builder()
   *    .id(String) // required {@link PendingTransactionsReport#getId() id}
   *    .stats(org.hyperledger.besu.ethstats.report.PendingTransactionsReport.PStats) // required {@link PendingTransactionsReport#getStats() stats}
   *    .build();
   * </pre>
   * @return A new ImmutablePendingTransactionsReport builder
   */
  public static ImmutablePendingTransactionsReport.Builder builder() {
    return new ImmutablePendingTransactionsReport.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePendingTransactionsReport ImmutablePendingTransactionsReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PendingTransactionsReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_STATS = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String id;
    private @Nullable PendingTransactionsReport.PStats stats;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PendingTransactionsReport} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PendingTransactionsReport instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      stats(instance.getStats());
      return this;
    }

    /**
     * Initializes the value for the {@link PendingTransactionsReport#getId() id} attribute.
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
     * Constructs and initializes the value for the {@link PendingTransactionsReport#getStats() stats} attribute.
     * @param pending The value for {@code stats.pending} 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder stats(int pending) {
      return stats(ImmutablePStats.of(pending));
    }

    /**
     * Initializes the value for the {@link PendingTransactionsReport#getStats() stats} attribute.
     * @param stats The value for stats 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("stats")
    public final Builder stats(PendingTransactionsReport.PStats stats) {
      this.stats = ImmutablePStats.copyOf(stats);
      initBits &= ~INIT_BIT_STATS;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePendingTransactionsReport ImmutablePendingTransactionsReport}.
     * @return An immutable instance of PendingTransactionsReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePendingTransactionsReport build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePendingTransactionsReport(id, ImmutablePStats.copyOf(stats));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_STATS) != 0) attributes.add("stats");
      return "Cannot build PendingTransactionsReport, some of required attributes are not set " + attributes;
    }
  }
}
