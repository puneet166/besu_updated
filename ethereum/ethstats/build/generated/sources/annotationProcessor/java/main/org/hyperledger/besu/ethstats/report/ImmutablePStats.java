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
 * Immutable implementation of {@link PendingTransactionsReport.PStats}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePStats.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutablePStats.of()}.
 */
@Generated(from = "PendingTransactionsReport.PStats", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePStats
    implements PendingTransactionsReport.PStats {
  private final int pending;

  private ImmutablePStats(int pending) {
    this.pending = pending;
  }

  /**
   * @return The value of the {@code pending} attribute
   */
  @JsonProperty("pending")
  @Override
  public int getPending() {
    return pending;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PendingTransactionsReport.PStats#getPending() pending} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pending
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePStats withPending(int value) {
    if (this.pending == value) return this;
    return new ImmutablePStats(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePStats} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePStats
        && equalTo(0, (ImmutablePStats) another);
  }

  private boolean equalTo(int synthetic, ImmutablePStats another) {
    return pending == another.pending;
  }

  /**
   * Computes a hash code from attributes: {@code pending}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + pending;
    return h;
  }

  /**
   * Prints the immutable value {@code PStats} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PStats")
        .omitNullValues()
        .add("pending", pending)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PendingTransactionsReport.PStats", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PendingTransactionsReport.PStats {
    int pending;
    boolean pendingIsSet;
    @JsonProperty("pending")
    public void setPending(int pending) {
      this.pending = pending;
      this.pendingIsSet = true;
    }
    @Override
    public int getPending() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePStats fromJson(Json json) {
    ImmutablePStats.Builder builder = ImmutablePStats.builder();
    if (json.pendingIsSet) {
      builder.pending(json.pending);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code PStats} instance.
   * @param pending The value for the {@code pending} attribute
   * @return An immutable PStats instance
   */
  public static ImmutablePStats of(int pending) {
    return new ImmutablePStats(pending);
  }

  /**
   * Creates an immutable copy of a {@link PendingTransactionsReport.PStats} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PStats instance
   */
  public static ImmutablePStats copyOf(PendingTransactionsReport.PStats instance) {
    if (instance instanceof ImmutablePStats) {
      return (ImmutablePStats) instance;
    }
    return ImmutablePStats.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePStats ImmutablePStats}.
   * <pre>
   * ImmutablePStats.builder()
   *    .pending(int) // required {@link PendingTransactionsReport.PStats#getPending() pending}
   *    .build();
   * </pre>
   * @return A new ImmutablePStats builder
   */
  public static ImmutablePStats.Builder builder() {
    return new ImmutablePStats.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePStats ImmutablePStats}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PendingTransactionsReport.PStats", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PENDING = 0x1L;
    private long initBits = 0x1L;

    private int pending;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PStats} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PendingTransactionsReport.PStats instance) {
      Objects.requireNonNull(instance, "instance");
      pending(instance.getPending());
      return this;
    }

    /**
     * Initializes the value for the {@link PendingTransactionsReport.PStats#getPending() pending} attribute.
     * @param pending The value for pending 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("pending")
    public final Builder pending(int pending) {
      this.pending = pending;
      initBits &= ~INIT_BIT_PENDING;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePStats ImmutablePStats}.
     * @return An immutable instance of PStats
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePStats build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePStats(pending);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_PENDING) != 0) attributes.add("pending");
      return "Cannot build PStats, some of required attributes are not set " + attributes;
    }
  }
}
