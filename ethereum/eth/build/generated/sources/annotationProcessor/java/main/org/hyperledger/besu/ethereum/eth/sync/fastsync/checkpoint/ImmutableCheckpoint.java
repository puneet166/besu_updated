package org.hyperledger.besu.ethereum.eth.sync.fastsync.checkpoint;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Longs;
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
import org.hyperledger.besu.datatypes.Hash;
import org.hyperledger.besu.ethereum.core.Difficulty;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Checkpoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCheckpoint.builder()}.
 */
@Generated(from = "Checkpoint", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableCheckpoint
    implements Checkpoint {
  private final long blockNumber;
  private final Hash blockHash;
  private final Difficulty totalDifficulty;

  private ImmutableCheckpoint(
      long blockNumber,
      Hash blockHash,
      Difficulty totalDifficulty) {
    this.blockNumber = blockNumber;
    this.blockHash = blockHash;
    this.totalDifficulty = totalDifficulty;
  }

  /**
   * @return The value of the {@code blockNumber} attribute
   */
  @Override
  public long blockNumber() {
    return blockNumber;
  }

  /**
   * @return The value of the {@code blockHash} attribute
   */
  @Override
  public Hash blockHash() {
    return blockHash;
  }

  /**
   * @return The value of the {@code totalDifficulty} attribute
   */
  @Override
  public Difficulty totalDifficulty() {
    return totalDifficulty;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Checkpoint#blockNumber() blockNumber} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for blockNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpoint withBlockNumber(long value) {
    if (this.blockNumber == value) return this;
    return new ImmutableCheckpoint(value, this.blockHash, this.totalDifficulty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Checkpoint#blockHash() blockHash} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for blockHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpoint withBlockHash(Hash value) {
    if (this.blockHash == value) return this;
    Hash newValue = Objects.requireNonNull(value, "blockHash");
    return new ImmutableCheckpoint(this.blockNumber, newValue, this.totalDifficulty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Checkpoint#totalDifficulty() totalDifficulty} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDifficulty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpoint withTotalDifficulty(Difficulty value) {
    if (this.totalDifficulty == value) return this;
    Difficulty newValue = Objects.requireNonNull(value, "totalDifficulty");
    return new ImmutableCheckpoint(this.blockNumber, this.blockHash, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCheckpoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCheckpoint
        && equalTo(0, (ImmutableCheckpoint) another);
  }

  private boolean equalTo(int synthetic, ImmutableCheckpoint another) {
    return blockNumber == another.blockNumber
        && blockHash.equals(another.blockHash)
        && totalDifficulty.equals(another.totalDifficulty);
  }

  /**
   * Computes a hash code from attributes: {@code blockNumber}, {@code blockHash}, {@code totalDifficulty}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Longs.hashCode(blockNumber);
    h += (h << 5) + blockHash.hashCode();
    h += (h << 5) + totalDifficulty.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Checkpoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Checkpoint")
        .omitNullValues()
        .add("blockNumber", blockNumber)
        .add("blockHash", blockHash)
        .add("totalDifficulty", totalDifficulty)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Checkpoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Checkpoint instance
   */
  public static ImmutableCheckpoint copyOf(Checkpoint instance) {
    if (instance instanceof ImmutableCheckpoint) {
      return (ImmutableCheckpoint) instance;
    }
    return ImmutableCheckpoint.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCheckpoint ImmutableCheckpoint}.
   * <pre>
   * ImmutableCheckpoint.builder()
   *    .blockNumber(long) // required {@link Checkpoint#blockNumber() blockNumber}
   *    .blockHash(org.hyperledger.besu.datatypes.Hash) // required {@link Checkpoint#blockHash() blockHash}
   *    .totalDifficulty(org.hyperledger.besu.ethereum.core.Difficulty) // required {@link Checkpoint#totalDifficulty() totalDifficulty}
   *    .build();
   * </pre>
   * @return A new ImmutableCheckpoint builder
   */
  public static ImmutableCheckpoint.Builder builder() {
    return new ImmutableCheckpoint.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCheckpoint ImmutableCheckpoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Checkpoint", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_BLOCK_NUMBER = 0x1L;
    private static final long INIT_BIT_BLOCK_HASH = 0x2L;
    private static final long INIT_BIT_TOTAL_DIFFICULTY = 0x4L;
    private long initBits = 0x7L;

    private long blockNumber;
    private @Nullable Hash blockHash;
    private @Nullable Difficulty totalDifficulty;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Checkpoint} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Checkpoint instance) {
      Objects.requireNonNull(instance, "instance");
      blockNumber(instance.blockNumber());
      blockHash(instance.blockHash());
      totalDifficulty(instance.totalDifficulty());
      return this;
    }

    /**
     * Initializes the value for the {@link Checkpoint#blockNumber() blockNumber} attribute.
     * @param blockNumber The value for blockNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder blockNumber(long blockNumber) {
      this.blockNumber = blockNumber;
      initBits &= ~INIT_BIT_BLOCK_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link Checkpoint#blockHash() blockHash} attribute.
     * @param blockHash The value for blockHash 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder blockHash(Hash blockHash) {
      this.blockHash = Objects.requireNonNull(blockHash, "blockHash");
      initBits &= ~INIT_BIT_BLOCK_HASH;
      return this;
    }

    /**
     * Initializes the value for the {@link Checkpoint#totalDifficulty() totalDifficulty} attribute.
     * @param totalDifficulty The value for totalDifficulty 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder totalDifficulty(Difficulty totalDifficulty) {
      this.totalDifficulty = Objects.requireNonNull(totalDifficulty, "totalDifficulty");
      initBits &= ~INIT_BIT_TOTAL_DIFFICULTY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCheckpoint ImmutableCheckpoint}.
     * @return An immutable instance of Checkpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCheckpoint build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCheckpoint(blockNumber, blockHash, totalDifficulty);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_BLOCK_NUMBER) != 0) attributes.add("blockNumber");
      if ((initBits & INIT_BIT_BLOCK_HASH) != 0) attributes.add("blockHash");
      if ((initBits & INIT_BIT_TOTAL_DIFFICULTY) != 0) attributes.add("totalDifficulty");
      return "Cannot build Checkpoint, some of required attributes are not set " + attributes;
    }
  }
}
