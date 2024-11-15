package org.hyperledger.besu.ethereum.eth.sync.state.cache;

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
import org.apache.tuweni.bytes.Bytes;
import org.hyperledger.besu.ethereum.core.Block;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PendingBlock}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePendingBlock.builder()}.
 */
@Generated(from = "PendingBlock", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePendingBlock
    implements PendingBlock {
  private final Block block;
  private final Bytes nodeId;

  private ImmutablePendingBlock(Block block, Bytes nodeId) {
    this.block = block;
    this.nodeId = nodeId;
  }

  /**
   * @return The value of the {@code block} attribute
   */
  @Override
  public Block block() {
    return block;
  }

  /**
   * @return The value of the {@code nodeId} attribute
   */
  @Override
  public Bytes nodeId() {
    return nodeId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PendingBlock#block() block} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for block
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePendingBlock withBlock(Block value) {
    if (this.block == value) return this;
    Block newValue = Objects.requireNonNull(value, "block");
    return new ImmutablePendingBlock(newValue, this.nodeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PendingBlock#nodeId() nodeId} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nodeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePendingBlock withNodeId(Bytes value) {
    if (this.nodeId == value) return this;
    Bytes newValue = Objects.requireNonNull(value, "nodeId");
    return new ImmutablePendingBlock(this.block, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePendingBlock} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePendingBlock
        && equalTo(0, (ImmutablePendingBlock) another);
  }

  private boolean equalTo(int synthetic, ImmutablePendingBlock another) {
    return block.equals(another.block)
        && nodeId.equals(another.nodeId);
  }

  /**
   * Computes a hash code from attributes: {@code block}, {@code nodeId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + block.hashCode();
    h += (h << 5) + nodeId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PendingBlock} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PendingBlock")
        .omitNullValues()
        .add("block", block)
        .add("nodeId", nodeId)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link PendingBlock} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PendingBlock instance
   */
  public static ImmutablePendingBlock copyOf(PendingBlock instance) {
    if (instance instanceof ImmutablePendingBlock) {
      return (ImmutablePendingBlock) instance;
    }
    return ImmutablePendingBlock.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePendingBlock ImmutablePendingBlock}.
   * <pre>
   * ImmutablePendingBlock.builder()
   *    .block(org.hyperledger.besu.ethereum.core.Block) // required {@link PendingBlock#block() block}
   *    .nodeId(org.apache.tuweni.bytes.Bytes) // required {@link PendingBlock#nodeId() nodeId}
   *    .build();
   * </pre>
   * @return A new ImmutablePendingBlock builder
   */
  public static ImmutablePendingBlock.Builder builder() {
    return new ImmutablePendingBlock.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePendingBlock ImmutablePendingBlock}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PendingBlock", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_BLOCK = 0x1L;
    private static final long INIT_BIT_NODE_ID = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Block block;
    private @Nullable Bytes nodeId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PendingBlock} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PendingBlock instance) {
      Objects.requireNonNull(instance, "instance");
      block(instance.block());
      nodeId(instance.nodeId());
      return this;
    }

    /**
     * Initializes the value for the {@link PendingBlock#block() block} attribute.
     * @param block The value for block 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder block(Block block) {
      this.block = Objects.requireNonNull(block, "block");
      initBits &= ~INIT_BIT_BLOCK;
      return this;
    }

    /**
     * Initializes the value for the {@link PendingBlock#nodeId() nodeId} attribute.
     * @param nodeId The value for nodeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder nodeId(Bytes nodeId) {
      this.nodeId = Objects.requireNonNull(nodeId, "nodeId");
      initBits &= ~INIT_BIT_NODE_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePendingBlock ImmutablePendingBlock}.
     * @return An immutable instance of PendingBlock
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePendingBlock build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePendingBlock(block, nodeId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_BLOCK) != 0) attributes.add("block");
      if ((initBits & INIT_BIT_NODE_ID) != 0) attributes.add("nodeId");
      return "Cannot build PendingBlock, some of required attributes are not set " + attributes;
    }
  }
}
