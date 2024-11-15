package org.hyperledger.besu.ethstats.report;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.results.BlockResult;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link HistoryReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHistoryReport.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableHistoryReport.of()}.
 */
@Generated(from = "HistoryReport", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableHistoryReport implements HistoryReport {
  private final String id;
  private final ImmutableList<BlockResult> history;

  private ImmutableHistoryReport(
      String id,
      Iterable<? extends BlockResult> history) {
    this.id = Objects.requireNonNull(id, "id");
    this.history = ImmutableList.copyOf(history);
  }

  private ImmutableHistoryReport(
      ImmutableHistoryReport original,
      String id,
      ImmutableList<BlockResult> history) {
    this.id = id;
    this.history = history;
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
   * @return The value of the {@code history} attribute
   */
  @JsonProperty("history")
  @Override
  public ImmutableList<BlockResult> getHistory() {
    return history;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HistoryReport#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHistoryReport withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableHistoryReport(this, newValue, this.history);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link HistoryReport#getHistory() history}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHistoryReport withHistory(BlockResult... elements) {
    ImmutableList<BlockResult> newValue = ImmutableList.copyOf(elements);
    return new ImmutableHistoryReport(this, this.id, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link HistoryReport#getHistory() history}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of history elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHistoryReport withHistory(Iterable<? extends BlockResult> elements) {
    if (this.history == elements) return this;
    ImmutableList<BlockResult> newValue = ImmutableList.copyOf(elements);
    return new ImmutableHistoryReport(this, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHistoryReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHistoryReport
        && equalTo(0, (ImmutableHistoryReport) another);
  }

  private boolean equalTo(int synthetic, ImmutableHistoryReport another) {
    return id.equals(another.id)
        && history.equals(another.history);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code history}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + history.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code HistoryReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HistoryReport")
        .omitNullValues()
        .add("id", id)
        .add("history", history)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "HistoryReport", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements HistoryReport {
    @Nullable String id;
    @Nullable List<BlockResult> history = ImmutableList.of();
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("history")
    public void setHistory(List<BlockResult> history) {
      this.history = history;
    }
    @Override
    public String getId() { throw new UnsupportedOperationException(); }
    @Override
    public List<BlockResult> getHistory() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableHistoryReport fromJson(Json json) {
    ImmutableHistoryReport.Builder builder = ImmutableHistoryReport.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.history != null) {
      builder.addAllHistory(json.history);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code HistoryReport} instance.
   * @param id The value for the {@code id} attribute
   * @param history The value for the {@code history} attribute
   * @return An immutable HistoryReport instance
   */
  public static ImmutableHistoryReport of(String id, List<BlockResult> history) {
    return of(id, (Iterable<? extends BlockResult>) history);
  }

  /**
   * Construct a new immutable {@code HistoryReport} instance.
   * @param id The value for the {@code id} attribute
   * @param history The value for the {@code history} attribute
   * @return An immutable HistoryReport instance
   */
  public static ImmutableHistoryReport of(String id, Iterable<? extends BlockResult> history) {
    return new ImmutableHistoryReport(id, history);
  }

  /**
   * Creates an immutable copy of a {@link HistoryReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HistoryReport instance
   */
  public static ImmutableHistoryReport copyOf(HistoryReport instance) {
    if (instance instanceof ImmutableHistoryReport) {
      return (ImmutableHistoryReport) instance;
    }
    return ImmutableHistoryReport.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHistoryReport ImmutableHistoryReport}.
   * <pre>
   * ImmutableHistoryReport.builder()
   *    .id(String) // required {@link HistoryReport#getId() id}
   *    .addHistory|addAllHistory(org.hyperledger.besu.ethereum.api.jsonrpc.internal.results.BlockResult) // {@link HistoryReport#getHistory() history} elements
   *    .build();
   * </pre>
   * @return A new ImmutableHistoryReport builder
   */
  public static ImmutableHistoryReport.Builder builder() {
    return new ImmutableHistoryReport.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHistoryReport ImmutableHistoryReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "HistoryReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String id;
    private ImmutableList.Builder<BlockResult> history = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HistoryReport} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(HistoryReport instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      addAllHistory(instance.getHistory());
      return this;
    }

    /**
     * Initializes the value for the {@link HistoryReport#getId() id} attribute.
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
     * Adds one element to {@link HistoryReport#getHistory() history} list.
     * @param element A history element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addHistory(BlockResult element) {
      this.history.add(element);
      return this;
    }

    /**
     * Adds elements to {@link HistoryReport#getHistory() history} list.
     * @param elements An array of history elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addHistory(BlockResult... elements) {
      this.history.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link HistoryReport#getHistory() history} list.
     * @param elements An iterable of history elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("history")
    public final Builder history(Iterable<? extends BlockResult> elements) {
      this.history = ImmutableList.builder();
      return addAllHistory(elements);
    }

    /**
     * Adds elements to {@link HistoryReport#getHistory() history} list.
     * @param elements An iterable of history elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllHistory(Iterable<? extends BlockResult> elements) {
      this.history.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableHistoryReport ImmutableHistoryReport}.
     * @return An immutable instance of HistoryReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHistoryReport build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHistoryReport(null, id, history.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      return "Cannot build HistoryReport, some of required attributes are not set " + attributes;
    }
  }
}
