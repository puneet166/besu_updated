package org.hyperledger.besu.ethereum.eth.messages.snap;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.hyperledger.besu.datatypes.Hash;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link GetAccountRangeMessage.Range}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRange.builder()}.
 */
@Generated(from = "GetAccountRangeMessage.Range", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableRange
    implements GetAccountRangeMessage.Range {
  private final Hash worldStateRootHash;
  private final Hash startKeyHash;
  private final Hash endKeyHash;
  private final BigInteger responseBytes;

  private ImmutableRange(
      Hash worldStateRootHash,
      Hash startKeyHash,
      Hash endKeyHash,
      BigInteger responseBytes) {
    this.worldStateRootHash = worldStateRootHash;
    this.startKeyHash = startKeyHash;
    this.endKeyHash = endKeyHash;
    this.responseBytes = responseBytes;
  }

  /**
   * @return The value of the {@code worldStateRootHash} attribute
   */
  @Override
  public Hash worldStateRootHash() {
    return worldStateRootHash;
  }

  /**
   * @return The value of the {@code startKeyHash} attribute
   */
  @Override
  public Hash startKeyHash() {
    return startKeyHash;
  }

  /**
   * @return The value of the {@code endKeyHash} attribute
   */
  @Override
  public Hash endKeyHash() {
    return endKeyHash;
  }

  /**
   * @return The value of the {@code responseBytes} attribute
   */
  @Override
  public BigInteger responseBytes() {
    return responseBytes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetAccountRangeMessage.Range#worldStateRootHash() worldStateRootHash} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for worldStateRootHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRange withWorldStateRootHash(Hash value) {
    if (this.worldStateRootHash == value) return this;
    Hash newValue = Objects.requireNonNull(value, "worldStateRootHash");
    return new ImmutableRange(newValue, this.startKeyHash, this.endKeyHash, this.responseBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetAccountRangeMessage.Range#startKeyHash() startKeyHash} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for startKeyHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRange withStartKeyHash(Hash value) {
    if (this.startKeyHash == value) return this;
    Hash newValue = Objects.requireNonNull(value, "startKeyHash");
    return new ImmutableRange(this.worldStateRootHash, newValue, this.endKeyHash, this.responseBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetAccountRangeMessage.Range#endKeyHash() endKeyHash} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for endKeyHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRange withEndKeyHash(Hash value) {
    if (this.endKeyHash == value) return this;
    Hash newValue = Objects.requireNonNull(value, "endKeyHash");
    return new ImmutableRange(this.worldStateRootHash, this.startKeyHash, newValue, this.responseBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetAccountRangeMessage.Range#responseBytes() responseBytes} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for responseBytes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRange withResponseBytes(BigInteger value) {
    BigInteger newValue = Objects.requireNonNull(value, "responseBytes");
    if (this.responseBytes.equals(newValue)) return this;
    return new ImmutableRange(this.worldStateRootHash, this.startKeyHash, this.endKeyHash, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRange} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRange
        && equalTo(0, (ImmutableRange) another);
  }

  private boolean equalTo(int synthetic, ImmutableRange another) {
    return worldStateRootHash.equals(another.worldStateRootHash)
        && startKeyHash.equals(another.startKeyHash)
        && endKeyHash.equals(another.endKeyHash)
        && responseBytes.equals(another.responseBytes);
  }

  /**
   * Computes a hash code from attributes: {@code worldStateRootHash}, {@code startKeyHash}, {@code endKeyHash}, {@code responseBytes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + worldStateRootHash.hashCode();
    h += (h << 5) + startKeyHash.hashCode();
    h += (h << 5) + endKeyHash.hashCode();
    h += (h << 5) + responseBytes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Range} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Range")
        .omitNullValues()
        .add("worldStateRootHash", worldStateRootHash)
        .add("startKeyHash", startKeyHash)
        .add("endKeyHash", endKeyHash)
        .add("responseBytes", responseBytes)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link GetAccountRangeMessage.Range} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Range instance
   */
  public static ImmutableRange copyOf(GetAccountRangeMessage.Range instance) {
    if (instance instanceof ImmutableRange) {
      return (ImmutableRange) instance;
    }
    return ImmutableRange.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRange ImmutableRange}.
   * <pre>
   * ImmutableRange.builder()
   *    .worldStateRootHash(org.hyperledger.besu.datatypes.Hash) // required {@link GetAccountRangeMessage.Range#worldStateRootHash() worldStateRootHash}
   *    .startKeyHash(org.hyperledger.besu.datatypes.Hash) // required {@link GetAccountRangeMessage.Range#startKeyHash() startKeyHash}
   *    .endKeyHash(org.hyperledger.besu.datatypes.Hash) // required {@link GetAccountRangeMessage.Range#endKeyHash() endKeyHash}
   *    .responseBytes(java.math.BigInteger) // required {@link GetAccountRangeMessage.Range#responseBytes() responseBytes}
   *    .build();
   * </pre>
   * @return A new ImmutableRange builder
   */
  public static ImmutableRange.Builder builder() {
    return new ImmutableRange.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRange ImmutableRange}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GetAccountRangeMessage.Range", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_WORLD_STATE_ROOT_HASH = 0x1L;
    private static final long INIT_BIT_START_KEY_HASH = 0x2L;
    private static final long INIT_BIT_END_KEY_HASH = 0x4L;
    private static final long INIT_BIT_RESPONSE_BYTES = 0x8L;
    private long initBits = 0xfL;

    private @Nullable Hash worldStateRootHash;
    private @Nullable Hash startKeyHash;
    private @Nullable Hash endKeyHash;
    private @Nullable BigInteger responseBytes;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Range} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GetAccountRangeMessage.Range instance) {
      Objects.requireNonNull(instance, "instance");
      worldStateRootHash(instance.worldStateRootHash());
      startKeyHash(instance.startKeyHash());
      endKeyHash(instance.endKeyHash());
      responseBytes(instance.responseBytes());
      return this;
    }

    /**
     * Initializes the value for the {@link GetAccountRangeMessage.Range#worldStateRootHash() worldStateRootHash} attribute.
     * @param worldStateRootHash The value for worldStateRootHash 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder worldStateRootHash(Hash worldStateRootHash) {
      this.worldStateRootHash = Objects.requireNonNull(worldStateRootHash, "worldStateRootHash");
      initBits &= ~INIT_BIT_WORLD_STATE_ROOT_HASH;
      return this;
    }

    /**
     * Initializes the value for the {@link GetAccountRangeMessage.Range#startKeyHash() startKeyHash} attribute.
     * @param startKeyHash The value for startKeyHash 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder startKeyHash(Hash startKeyHash) {
      this.startKeyHash = Objects.requireNonNull(startKeyHash, "startKeyHash");
      initBits &= ~INIT_BIT_START_KEY_HASH;
      return this;
    }

    /**
     * Initializes the value for the {@link GetAccountRangeMessage.Range#endKeyHash() endKeyHash} attribute.
     * @param endKeyHash The value for endKeyHash 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder endKeyHash(Hash endKeyHash) {
      this.endKeyHash = Objects.requireNonNull(endKeyHash, "endKeyHash");
      initBits &= ~INIT_BIT_END_KEY_HASH;
      return this;
    }

    /**
     * Initializes the value for the {@link GetAccountRangeMessage.Range#responseBytes() responseBytes} attribute.
     * @param responseBytes The value for responseBytes 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder responseBytes(BigInteger responseBytes) {
      this.responseBytes = Objects.requireNonNull(responseBytes, "responseBytes");
      initBits &= ~INIT_BIT_RESPONSE_BYTES;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRange ImmutableRange}.
     * @return An immutable instance of Range
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRange build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRange(worldStateRootHash, startKeyHash, endKeyHash, responseBytes);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_WORLD_STATE_ROOT_HASH) != 0) attributes.add("worldStateRootHash");
      if ((initBits & INIT_BIT_START_KEY_HASH) != 0) attributes.add("startKeyHash");
      if ((initBits & INIT_BIT_END_KEY_HASH) != 0) attributes.add("endKeyHash");
      if ((initBits & INIT_BIT_RESPONSE_BYTES) != 0) attributes.add("responseBytes");
      return "Cannot build Range, some of required attributes are not set " + attributes;
    }
  }
}
