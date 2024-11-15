package org.hyperledger.besu.ethereum.eth.messages.snap;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import kotlin.collections.ArrayDeque;
import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link StorageRangeMessage.SlotRangeData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSlotRangeData.builder()}.
 */
@Generated(from = "StorageRangeMessage.SlotRangeData", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableSlotRangeData
    implements StorageRangeMessage.SlotRangeData {
  private final ArrayDeque<TreeMap<Bytes32, Bytes>> slots;
  private final ArrayDeque<Bytes> proofs;

  private ImmutableSlotRangeData(
      ArrayDeque<TreeMap<Bytes32, Bytes>> slots,
      ArrayDeque<Bytes> proofs) {
    this.slots = slots;
    this.proofs = proofs;
  }

  /**
   * @return The value of the {@code slots} attribute
   */
  @Override
  public ArrayDeque<TreeMap<Bytes32, Bytes>> slots() {
    return slots;
  }

  /**
   * @return The value of the {@code proofs} attribute
   */
  @Override
  public ArrayDeque<Bytes> proofs() {
    return proofs;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StorageRangeMessage.SlotRangeData#slots() slots} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for slots
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSlotRangeData withSlots(ArrayDeque<TreeMap<Bytes32, Bytes>> value) {
    if (this.slots == value) return this;
    ArrayDeque<TreeMap<Bytes32, Bytes>> newValue = Objects.requireNonNull(value, "slots");
    return new ImmutableSlotRangeData(newValue, this.proofs);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StorageRangeMessage.SlotRangeData#proofs() proofs} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for proofs
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSlotRangeData withProofs(ArrayDeque<Bytes> value) {
    if (this.proofs == value) return this;
    ArrayDeque<Bytes> newValue = Objects.requireNonNull(value, "proofs");
    return new ImmutableSlotRangeData(this.slots, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSlotRangeData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSlotRangeData
        && equalTo(0, (ImmutableSlotRangeData) another);
  }

  private boolean equalTo(int synthetic, ImmutableSlotRangeData another) {
    return slots.equals(another.slots)
        && proofs.equals(another.proofs);
  }

  /**
   * Computes a hash code from attributes: {@code slots}, {@code proofs}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + slots.hashCode();
    h += (h << 5) + proofs.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SlotRangeData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SlotRangeData")
        .omitNullValues()
        .add("slots", slots)
        .add("proofs", proofs)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link StorageRangeMessage.SlotRangeData} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SlotRangeData instance
   */
  public static ImmutableSlotRangeData copyOf(StorageRangeMessage.SlotRangeData instance) {
    if (instance instanceof ImmutableSlotRangeData) {
      return (ImmutableSlotRangeData) instance;
    }
    return ImmutableSlotRangeData.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSlotRangeData ImmutableSlotRangeData}.
   * <pre>
   * ImmutableSlotRangeData.builder()
   *    .slots(kotlin.collections.ArrayDeque&amp;lt;TreeMap&amp;lt;org.apache.tuweni.bytes.Bytes32, org.apache.tuweni.bytes.Bytes&amp;gt;&amp;gt;) // required {@link StorageRangeMessage.SlotRangeData#slots() slots}
   *    .proofs(kotlin.collections.ArrayDeque&amp;lt;org.apache.tuweni.bytes.Bytes&amp;gt;) // required {@link StorageRangeMessage.SlotRangeData#proofs() proofs}
   *    .build();
   * </pre>
   * @return A new ImmutableSlotRangeData builder
   */
  public static ImmutableSlotRangeData.Builder builder() {
    return new ImmutableSlotRangeData.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSlotRangeData ImmutableSlotRangeData}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StorageRangeMessage.SlotRangeData", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_SLOTS = 0x1L;
    private static final long INIT_BIT_PROOFS = 0x2L;
    private long initBits = 0x3L;

    private @Nullable ArrayDeque<TreeMap<Bytes32, Bytes>> slots;
    private @Nullable ArrayDeque<Bytes> proofs;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SlotRangeData} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(StorageRangeMessage.SlotRangeData instance) {
      Objects.requireNonNull(instance, "instance");
      slots(instance.slots());
      proofs(instance.proofs());
      return this;
    }

    /**
     * Initializes the value for the {@link StorageRangeMessage.SlotRangeData#slots() slots} attribute.
     * @param slots The value for slots 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder slots(ArrayDeque<TreeMap<Bytes32, Bytes>> slots) {
      this.slots = Objects.requireNonNull(slots, "slots");
      initBits &= ~INIT_BIT_SLOTS;
      return this;
    }

    /**
     * Initializes the value for the {@link StorageRangeMessage.SlotRangeData#proofs() proofs} attribute.
     * @param proofs The value for proofs 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder proofs(ArrayDeque<Bytes> proofs) {
      this.proofs = Objects.requireNonNull(proofs, "proofs");
      initBits &= ~INIT_BIT_PROOFS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSlotRangeData ImmutableSlotRangeData}.
     * @return An immutable instance of SlotRangeData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSlotRangeData build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSlotRangeData(slots, proofs);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_SLOTS) != 0) attributes.add("slots");
      if ((initBits & INIT_BIT_PROOFS) != 0) attributes.add("proofs");
      return "Cannot build SlotRangeData, some of required attributes are not set " + attributes;
    }
  }
}
