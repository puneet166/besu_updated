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
import org.apache.tuweni.bytes.Bytes32;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link GetByteCodesMessage.CodeHashes}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeHashes.builder()}.
 */
@Generated(from = "GetByteCodesMessage.CodeHashes", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableCodeHashes
    implements GetByteCodesMessage.CodeHashes {
  private final ImmutableList<Bytes32> hashes;
  private final BigInteger responseBytes;

  private ImmutableCodeHashes(
      ImmutableList<Bytes32> hashes,
      BigInteger responseBytes) {
    this.hashes = hashes;
    this.responseBytes = responseBytes;
  }

  /**
   * @return The value of the {@code hashes} attribute
   */
  @Override
  public ImmutableList<Bytes32> hashes() {
    return hashes;
  }

  /**
   * @return The value of the {@code responseBytes} attribute
   */
  @Override
  public BigInteger responseBytes() {
    return responseBytes;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GetByteCodesMessage.CodeHashes#hashes() hashes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeHashes withHashes(Bytes32... elements) {
    ImmutableList<Bytes32> newValue = ImmutableList.copyOf(elements);
    return new ImmutableCodeHashes(newValue, this.responseBytes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GetByteCodesMessage.CodeHashes#hashes() hashes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of hashes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeHashes withHashes(Iterable<? extends Bytes32> elements) {
    if (this.hashes == elements) return this;
    ImmutableList<Bytes32> newValue = ImmutableList.copyOf(elements);
    return new ImmutableCodeHashes(newValue, this.responseBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetByteCodesMessage.CodeHashes#responseBytes() responseBytes} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for responseBytes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCodeHashes withResponseBytes(BigInteger value) {
    BigInteger newValue = Objects.requireNonNull(value, "responseBytes");
    if (this.responseBytes.equals(newValue)) return this;
    return new ImmutableCodeHashes(this.hashes, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeHashes} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeHashes
        && equalTo(0, (ImmutableCodeHashes) another);
  }

  private boolean equalTo(int synthetic, ImmutableCodeHashes another) {
    return hashes.equals(another.hashes)
        && responseBytes.equals(another.responseBytes);
  }

  /**
   * Computes a hash code from attributes: {@code hashes}, {@code responseBytes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + hashes.hashCode();
    h += (h << 5) + responseBytes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CodeHashes} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CodeHashes")
        .omitNullValues()
        .add("hashes", hashes)
        .add("responseBytes", responseBytes)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link GetByteCodesMessage.CodeHashes} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeHashes instance
   */
  public static ImmutableCodeHashes copyOf(GetByteCodesMessage.CodeHashes instance) {
    if (instance instanceof ImmutableCodeHashes) {
      return (ImmutableCodeHashes) instance;
    }
    return ImmutableCodeHashes.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCodeHashes ImmutableCodeHashes}.
   * <pre>
   * ImmutableCodeHashes.builder()
   *    .addHashes|addAllHashes(org.apache.tuweni.bytes.Bytes32) // {@link GetByteCodesMessage.CodeHashes#hashes() hashes} elements
   *    .responseBytes(java.math.BigInteger) // required {@link GetByteCodesMessage.CodeHashes#responseBytes() responseBytes}
   *    .build();
   * </pre>
   * @return A new ImmutableCodeHashes builder
   */
  public static ImmutableCodeHashes.Builder builder() {
    return new ImmutableCodeHashes.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCodeHashes ImmutableCodeHashes}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GetByteCodesMessage.CodeHashes", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_RESPONSE_BYTES = 0x1L;
    private long initBits = 0x1L;

    private ImmutableList.Builder<Bytes32> hashes = ImmutableList.builder();
    private @Nullable BigInteger responseBytes;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CodeHashes} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GetByteCodesMessage.CodeHashes instance) {
      Objects.requireNonNull(instance, "instance");
      addAllHashes(instance.hashes());
      responseBytes(instance.responseBytes());
      return this;
    }

    /**
     * Adds one element to {@link GetByteCodesMessage.CodeHashes#hashes() hashes} list.
     * @param element A hashes element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addHashes(Bytes32 element) {
      this.hashes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link GetByteCodesMessage.CodeHashes#hashes() hashes} list.
     * @param elements An array of hashes elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addHashes(Bytes32... elements) {
      this.hashes.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link GetByteCodesMessage.CodeHashes#hashes() hashes} list.
     * @param elements An iterable of hashes elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder hashes(Iterable<? extends Bytes32> elements) {
      this.hashes = ImmutableList.builder();
      return addAllHashes(elements);
    }

    /**
     * Adds elements to {@link GetByteCodesMessage.CodeHashes#hashes() hashes} list.
     * @param elements An iterable of hashes elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllHashes(Iterable<? extends Bytes32> elements) {
      this.hashes.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link GetByteCodesMessage.CodeHashes#responseBytes() responseBytes} attribute.
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
     * Builds a new {@link ImmutableCodeHashes ImmutableCodeHashes}.
     * @return An immutable instance of CodeHashes
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCodeHashes build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCodeHashes(hashes.build(), responseBytes);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_RESPONSE_BYTES) != 0) attributes.add("responseBytes");
      return "Cannot build CodeHashes, some of required attributes are not set " + attributes;
    }
  }
}
