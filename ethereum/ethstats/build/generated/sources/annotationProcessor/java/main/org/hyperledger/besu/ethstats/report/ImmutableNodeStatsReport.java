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
 * Immutable implementation of {@link NodeStatsReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNodeStatsReport.builder()}.
 */
@Generated(from = "NodeStatsReport", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableNodeStatsReport implements NodeStatsReport {
  private final String id;
  private final ImmutableNStats stats;

  private ImmutableNodeStatsReport(String id, ImmutableNStats stats) {
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
  public ImmutableNStats getStats() {
    return stats;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeStatsReport#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeStatsReport withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableNodeStatsReport(newValue, this.stats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeStatsReport#getStats() stats} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for stats
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeStatsReport withStats(NodeStatsReport.NStats value) {
    if (this.stats == value) return this;
    ImmutableNStats newValue = ImmutableNStats.copyOf(value);
    return new ImmutableNodeStatsReport(this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNodeStatsReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNodeStatsReport
        && equalTo(0, (ImmutableNodeStatsReport) another);
  }

  private boolean equalTo(int synthetic, ImmutableNodeStatsReport another) {
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
   * Prints the immutable value {@code NodeStatsReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("NodeStatsReport")
        .omitNullValues()
        .add("id", id)
        .add("stats", stats)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "NodeStatsReport", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NodeStatsReport {
    @Nullable String id;
    @Nullable NodeStatsReport.NStats stats;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("stats")
    public void setStats(NodeStatsReport.NStats stats) {
      this.stats = stats;
    }
    @Override
    public String getId() { throw new UnsupportedOperationException(); }
    @Override
    public NodeStatsReport.NStats getStats() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNodeStatsReport fromJson(Json json) {
    ImmutableNodeStatsReport.Builder builder = ImmutableNodeStatsReport.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.stats != null) {
      builder.stats(json.stats);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NodeStatsReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NodeStatsReport instance
   */
  public static ImmutableNodeStatsReport copyOf(NodeStatsReport instance) {
    if (instance instanceof ImmutableNodeStatsReport) {
      return (ImmutableNodeStatsReport) instance;
    }
    return ImmutableNodeStatsReport.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableNodeStatsReport ImmutableNodeStatsReport}.
   * <pre>
   * ImmutableNodeStatsReport.builder()
   *    .id(String) // required {@link NodeStatsReport#getId() id}
   *    .stats(org.hyperledger.besu.ethstats.report.NodeStatsReport.NStats) // required {@link NodeStatsReport#getStats() stats}
   *    .build();
   * </pre>
   * @return A new ImmutableNodeStatsReport builder
   */
  public static ImmutableNodeStatsReport.Builder builder() {
    return new ImmutableNodeStatsReport.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableNodeStatsReport ImmutableNodeStatsReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NodeStatsReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_STATS = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String id;
    private @Nullable NodeStatsReport.NStats stats;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code NodeStatsReport} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(NodeStatsReport instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      stats(instance.getStats());
      return this;
    }

    /**
     * Initializes the value for the {@link NodeStatsReport#getId() id} attribute.
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
     * Constructs and initializes the value for the {@link NodeStatsReport#getStats() stats} attribute.
     * @param isActive The value for {@code stats.isActive} 
     * @param isMining The value for {@code stats.isMining} 
     * @param hashrate The value for {@code stats.hashrate} 
     * @param peers The value for {@code stats.peers} 
     * @param gasPrice The value for {@code stats.gasPrice} 
     * @param isSyncing The value for {@code stats.isSyncing} 
     * @param upTime The value for {@code stats.upTime} 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder stats(boolean isActive, boolean isMining, long hashrate, int peers, long gasPrice, boolean isSyncing, int upTime) {
      return stats(ImmutableNStats.of(isActive, isMining, hashrate, peers, gasPrice, isSyncing, upTime));
    }

    /**
     * Initializes the value for the {@link NodeStatsReport#getStats() stats} attribute.
     * @param stats The value for stats 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("stats")
    public final Builder stats(NodeStatsReport.NStats stats) {
      this.stats = ImmutableNStats.copyOf(stats);
      initBits &= ~INIT_BIT_STATS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableNodeStatsReport ImmutableNodeStatsReport}.
     * @return An immutable instance of NodeStatsReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNodeStatsReport build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableNodeStatsReport(id, ImmutableNStats.copyOf(stats));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_STATS) != 0) attributes.add("stats");
      return "Cannot build NodeStatsReport, some of required attributes are not set " + attributes;
    }
  }
}
