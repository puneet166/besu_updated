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
import kotlin.collections.ArrayDeque;
import org.apache.tuweni.bytes.Bytes32;
import org.hyperledger.besu.datatypes.Hash;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link GetStorageRangeMessage.StorageRange}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStorageRange.builder()}.
 */
@Generated(from = "GetStorageRangeMessage.StorageRange", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableStorageRange
    implements GetStorageRangeMessage.StorageRange {
  private final Hash worldStateRootHash;
  private final ArrayDeque<Bytes32> hashes;
  private final Hash startKeyHash;
  private final @Nullable Hash endKeyHash;
  private final BigInteger responseBytes;

  private ImmutableStorageRange(
      Hash worldStateRootHash,
      ArrayDeque<Bytes32> hashes,
      Hash startKeyHash,
      @Nullable Hash endKeyHash,
      BigInteger responseBytes) {
    this.worldStateRootHash = worldStateRootHash;
    this.hashes = hashes;
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
   * @return The value of the {@code hashes} attribute
   */
  @Override
  public ArrayDeque<Bytes32> hashes() {
    return hashes;
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
  public @Nullable Hash endKeyHash() {
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
   * Copy the current immutable object by setting a value for the {@link GetStorageRangeMessage.StorageRange#worldStateRootHash() worldStateRootHash} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for worldStateRootHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStorageRange withWorldStateRootHash(Hash value) {
    if (this.worldStateRootHash == value) return this;
    Hash newValue = Objects.requireNonNull(value, "worldStateRootHash");
    return new ImmutableStorageRange(newValue, this.hashes, this.startKeyHash, this.endKeyHash, this.responseBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetStorageRangeMessage.StorageRange#hashes() hashes} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hashes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStorageRange withHashes(ArrayDeque<Bytes32> value) {
    if (this.hashes == value) return this;
    ArrayDeque<Bytes32> newValue = Objects.requireNonNull(value, "hashes");
    return new ImmutableStorageRange(this.worldStateRootHash, newValue, this.startKeyHash, this.endKeyHash, this.responseBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetStorageRangeMessage.StorageRange#startKeyHash() startKeyHash} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for startKeyHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStorageRange withStartKeyHash(Hash value) {
    if (this.startKeyHash == value) return this;
    Hash newValue = Objects.requireNonNull(value, "startKeyHash");
    return new ImmutableStorageRange(this.worldStateRootHash, this.hashes, newValue, this.endKeyHash, this.responseBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetStorageRangeMessage.StorageRange#endKeyHash() endKeyHash} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for endKeyHash (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStorageRange withEndKeyHash(@Nullable Hash value) {
    if (this.endKeyHash == value) return this;
    return new ImmutableStorageRange(this.worldStateRootHash, this.hashes, this.startKeyHash, value, this.responseBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetStorageRangeMessage.StorageRange#responseBytes() responseBytes} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for responseBytes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStorageRange withResponseBytes(BigInteger value) {
    BigInteger newValue = Objects.requireNonNull(value, "responseBytes");
    if (this.responseBytes.equals(newValue)) return this;
    return new ImmutableStorageRange(this.worldStateRootHash, this.hashes, this.startKeyHash, this.endKeyHash, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStorageRange} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStorageRange
        && equalTo(0, (ImmutableStorageRange) another);
  }

  private boolean equalTo(int synthetic, ImmutableStorageRange another) {
    return worldStateRootHash.equals(another.worldStateRootHash)
        && hashes.equals(another.hashes)
        && startKeyHash.equals(another.startKeyHash)
        && Objects.equals(endKeyHash, another.endKeyHash)
        && responseBytes.equals(another.responseBytes);
  }

  /**
   * Computes a hash code from attributes: {@code worldStateRootHash}, {@code hashes}, {@code startKeyHash}, {@code endKeyHash}, {@code responseBytes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + worldStateRootHash.hashCode();
    h += (h << 5) + hashes.hashCode();
    h += (h << 5) + startKeyHash.hashCode();
    h += (h << 5) + Objects.hashCode(endKeyHash);
    h += (h << 5) + responseBytes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code StorageRange} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("StorageRange")
        .omitNullValues()
        .add("worldStateRootHash", worldStateRootHash)
        .add("hashes", hashes)
        .add("startKeyHash", startKeyHash)
        .add("endKeyHash", endKeyHash)
        .add("responseBytes", responseBytes)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link GetStorageRangeMessage.StorageRange} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StorageRange instance
   */
  public static ImmutableStorageRange copyOf(GetStorageRangeMessage.StorageRange instance) {
    if (instance instanceof ImmutableStorageRange) {
      return (ImmutableStorageRange) instance;
    }
    return ImmutableStorageRange.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableStorageRange ImmutableStorageRange}.
   * <pre>
   * ImmutableStorageRange.builder()
   *    .worldStateRootHash(org.hyperledger.besu.datatypes.Hash) // required {@link GetStorageRangeMessage.StorageRange#worldStateRootHash() worldStateRootHash}
   *    .hashes(kotlin.collections.ArrayDeque&amp;lt;org.apache.tuweni.bytes.Bytes32&amp;gt;) // required {@link GetStorageRangeMessage.StorageRange#hashes() hashes}
   *    .startKeyHash(org.hyperledger.besu.datatypes.Hash) // required {@link GetStorageRangeMessage.StorageRange#startKeyHash() startKeyHash}
   *    .endKeyHash(org.hyperledger.besu.datatypes.Hash | null) // nullable {@link GetStorageRangeMessage.StorageRange#endKeyHash() endKeyHash}
   *    .responseBytes(java.math.BigInteger) // required {@link GetStorageRangeMessage.StorageRange#responseBytes() responseBytes}
   *    .build();
   * </pre>
   * @return A new ImmutableStorageRange builder
   */
  public static ImmutableStorageRange.Builder builder() {
    return new ImmutableStorageRange.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableStorageRange ImmutableStorageRange}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GetStorageRangeMessage.StorageRange", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_WORLD_STATE_ROOT_HASH = 0x1L;
    private static final long INIT_BIT_HASHES = 0x2L;
    private static final long INIT_BIT_START_KEY_HASH = 0x4L;
    private static final long INIT_BIT_RESPONSE_BYTES = 0x8L;
    private long initBits = 0xfL;

    private @Nullable Hash worldStateRootHash;
    private @Nullable ArrayDeque<Bytes32> hashes;
    private @Nullable Hash startKeyHash;
    private @Nullable Hash endKeyHash;
    private @Nullable BigInteger responseBytes;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code StorageRange} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GetStorageRangeMessage.StorageRange instance) {
      Objects.requireNonNull(instance, "instance");
      worldStateRootHash(instance.worldStateRootHash());
      hashes(instance.hashes());
      startKeyHash(instance.startKeyHash());
      @Nullable Hash endKeyHashValue = instance.endKeyHash();
      if (endKeyHashValue != null) {
        endKeyHash(endKeyHashValue);
      }
      responseBytes(instance.responseBytes());
      return this;
    }

    /**
     * Initializes the value for the {@link GetStorageRangeMessage.StorageRange#worldStateRootHash() worldStateRootHash} attribute.
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
     * Initializes the value for the {@link GetStorageRangeMessage.StorageRange#hashes() hashes} attribute.
     * @param hashes The value for hashes 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder hashes(ArrayDeque<Bytes32> hashes) {
      this.hashes = Objects.requireNonNull(hashes, "hashes");
      initBits &= ~INIT_BIT_HASHES;
      return this;
    }

    /**
     * Initializes the value for the {@link GetStorageRangeMessage.StorageRange#startKeyHash() startKeyHash} attribute.
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
     * Initializes the value for the {@link GetStorageRangeMessage.StorageRange#endKeyHash() endKeyHash} attribute.
     * @param endKeyHash The value for endKeyHash (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder endKeyHash(@Nullable Hash endKeyHash) {
      this.endKeyHash = endKeyHash;
      return this;
    }

    /**
     * Initializes the value for the {@link GetStorageRangeMessage.StorageRange#responseBytes() responseBytes} attribute.
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
     * Builds a new {@link ImmutableStorageRange ImmutableStorageRange}.
     * @return An immutable instance of StorageRange
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableStorageRange build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableStorageRange(worldStateRootHash, hashes, startKeyHash, endKeyHash, responseBytes);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_WORLD_STATE_ROOT_HASH) != 0) attributes.add("worldStateRootHash");
      if ((initBits & INIT_BIT_HASHES) != 0) attributes.add("hashes");
      if ((initBits & INIT_BIT_START_KEY_HASH) != 0) attributes.add("startKeyHash");
      if ((initBits & INIT_BIT_RESPONSE_BYTES) != 0) attributes.add("responseBytes");
      return "Cannot build StorageRange, some of required attributes are not set " + attributes;
    }
  }
}
