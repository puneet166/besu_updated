package org.hyperledger.besu.ethereum.eth.messages.snap;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
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
import org.apache.tuweni.bytes.Bytes;
import org.hyperledger.besu.datatypes.Hash;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link GetTrieNodesMessage.TrieNodesPaths}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTrieNodesPaths.builder()}.
 */
@Generated(from = "GetTrieNodesMessage.TrieNodesPaths", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTrieNodesPaths
    implements GetTrieNodesMessage.TrieNodesPaths {
  private final Hash worldStateRootHash;
  private final ImmutableList<List<Bytes>> paths;
  private final BigInteger responseBytes;

  private ImmutableTrieNodesPaths(
      Hash worldStateRootHash,
      ImmutableList<List<Bytes>> paths,
      BigInteger responseBytes) {
    this.worldStateRootHash = worldStateRootHash;
    this.paths = paths;
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
   * @return The value of the {@code paths} attribute
   */
  @Override
  public ImmutableList<List<Bytes>> paths() {
    return paths;
  }

  /**
   * @return The value of the {@code responseBytes} attribute
   */
  @Override
  public BigInteger responseBytes() {
    return responseBytes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetTrieNodesMessage.TrieNodesPaths#worldStateRootHash() worldStateRootHash} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for worldStateRootHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTrieNodesPaths withWorldStateRootHash(Hash value) {
    if (this.worldStateRootHash == value) return this;
    Hash newValue = Objects.requireNonNull(value, "worldStateRootHash");
    return new ImmutableTrieNodesPaths(newValue, this.paths, this.responseBytes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GetTrieNodesMessage.TrieNodesPaths#paths() paths}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final ImmutableTrieNodesPaths withPaths(List<Bytes>... elements) {
    ImmutableList<List<Bytes>> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTrieNodesPaths(this.worldStateRootHash, newValue, this.responseBytes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GetTrieNodesMessage.TrieNodesPaths#paths() paths}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of paths elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTrieNodesPaths withPaths(Iterable<? extends List<Bytes>> elements) {
    if (this.paths == elements) return this;
    ImmutableList<List<Bytes>> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTrieNodesPaths(this.worldStateRootHash, newValue, this.responseBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetTrieNodesMessage.TrieNodesPaths#responseBytes() responseBytes} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for responseBytes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTrieNodesPaths withResponseBytes(BigInteger value) {
    BigInteger newValue = Objects.requireNonNull(value, "responseBytes");
    if (this.responseBytes.equals(newValue)) return this;
    return new ImmutableTrieNodesPaths(this.worldStateRootHash, this.paths, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTrieNodesPaths} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTrieNodesPaths
        && equalTo(0, (ImmutableTrieNodesPaths) another);
  }

  private boolean equalTo(int synthetic, ImmutableTrieNodesPaths another) {
    return worldStateRootHash.equals(another.worldStateRootHash)
        && paths.equals(another.paths)
        && responseBytes.equals(another.responseBytes);
  }

  /**
   * Computes a hash code from attributes: {@code worldStateRootHash}, {@code paths}, {@code responseBytes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + worldStateRootHash.hashCode();
    h += (h << 5) + paths.hashCode();
    h += (h << 5) + responseBytes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TrieNodesPaths} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TrieNodesPaths")
        .omitNullValues()
        .add("worldStateRootHash", worldStateRootHash)
        .add("paths", paths)
        .add("responseBytes", responseBytes)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link GetTrieNodesMessage.TrieNodesPaths} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TrieNodesPaths instance
   */
  public static ImmutableTrieNodesPaths copyOf(GetTrieNodesMessage.TrieNodesPaths instance) {
    if (instance instanceof ImmutableTrieNodesPaths) {
      return (ImmutableTrieNodesPaths) instance;
    }
    return ImmutableTrieNodesPaths.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTrieNodesPaths ImmutableTrieNodesPaths}.
   * <pre>
   * ImmutableTrieNodesPaths.builder()
   *    .worldStateRootHash(org.hyperledger.besu.datatypes.Hash) // required {@link GetTrieNodesMessage.TrieNodesPaths#worldStateRootHash() worldStateRootHash}
   *    .addPaths|addAllPaths(List&amp;lt;org.apache.tuweni.bytes.Bytes&amp;gt;) // {@link GetTrieNodesMessage.TrieNodesPaths#paths() paths} elements
   *    .responseBytes(java.math.BigInteger) // required {@link GetTrieNodesMessage.TrieNodesPaths#responseBytes() responseBytes}
   *    .build();
   * </pre>
   * @return A new ImmutableTrieNodesPaths builder
   */
  public static ImmutableTrieNodesPaths.Builder builder() {
    return new ImmutableTrieNodesPaths.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTrieNodesPaths ImmutableTrieNodesPaths}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GetTrieNodesMessage.TrieNodesPaths", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_WORLD_STATE_ROOT_HASH = 0x1L;
    private static final long INIT_BIT_RESPONSE_BYTES = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Hash worldStateRootHash;
    private ImmutableList.Builder<List<Bytes>> paths = ImmutableList.builder();
    private @Nullable BigInteger responseBytes;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TrieNodesPaths} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GetTrieNodesMessage.TrieNodesPaths instance) {
      Objects.requireNonNull(instance, "instance");
      worldStateRootHash(instance.worldStateRootHash());
      addAllPaths(instance.paths());
      responseBytes(instance.responseBytes());
      return this;
    }

    /**
     * Initializes the value for the {@link GetTrieNodesMessage.TrieNodesPaths#worldStateRootHash() worldStateRootHash} attribute.
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
     * Adds one element to {@link GetTrieNodesMessage.TrieNodesPaths#paths() paths} list.
     * @param element A paths element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addPaths(List<Bytes> element) {
      this.paths.add(element);
      return this;
    }

    /**
     * Adds elements to {@link GetTrieNodesMessage.TrieNodesPaths#paths() paths} list.
     * @param elements An array of paths elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @SafeVarargs @SuppressWarnings("varargs")
    public final Builder addPaths(List<Bytes>... elements) {
      this.paths.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link GetTrieNodesMessage.TrieNodesPaths#paths() paths} list.
     * @param elements An iterable of paths elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder paths(Iterable<? extends List<Bytes>> elements) {
      this.paths = ImmutableList.builder();
      return addAllPaths(elements);
    }

    /**
     * Adds elements to {@link GetTrieNodesMessage.TrieNodesPaths#paths() paths} list.
     * @param elements An iterable of paths elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllPaths(Iterable<? extends List<Bytes>> elements) {
      this.paths.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link GetTrieNodesMessage.TrieNodesPaths#responseBytes() responseBytes} attribute.
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
     * Builds a new {@link ImmutableTrieNodesPaths ImmutableTrieNodesPaths}.
     * @return An immutable instance of TrieNodesPaths
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTrieNodesPaths build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTrieNodesPaths(worldStateRootHash, paths.build(), responseBytes);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_WORLD_STATE_ROOT_HASH) != 0) attributes.add("worldStateRootHash");
      if ((initBits & INIT_BIT_RESPONSE_BYTES) != 0) attributes.add("responseBytes");
      return "Cannot build TrieNodesPaths, some of required attributes are not set " + attributes;
    }
  }
}
