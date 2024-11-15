package org.hyperledger.besu.ethereum.eth.messages.snap;

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
import kotlin.collections.ArrayDeque;
import org.apache.tuweni.bytes.Bytes;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ByteCodesMessage.ByteCodes}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableByteCodes.builder()}.
 */
@Generated(from = "ByteCodesMessage.ByteCodes", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableByteCodes
    implements ByteCodesMessage.ByteCodes {
  private final ArrayDeque<Bytes> codes;

  private ImmutableByteCodes(ArrayDeque<Bytes> codes) {
    this.codes = codes;
  }

  /**
   * @return The value of the {@code codes} attribute
   */
  @Override
  public ArrayDeque<Bytes> codes() {
    return codes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ByteCodesMessage.ByteCodes#codes() codes} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for codes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableByteCodes withCodes(ArrayDeque<Bytes> value) {
    if (this.codes == value) return this;
    ArrayDeque<Bytes> newValue = Objects.requireNonNull(value, "codes");
    return new ImmutableByteCodes(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableByteCodes} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableByteCodes
        && equalTo(0, (ImmutableByteCodes) another);
  }

  private boolean equalTo(int synthetic, ImmutableByteCodes another) {
    return codes.equals(another.codes);
  }

  /**
   * Computes a hash code from attributes: {@code codes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + codes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ByteCodes} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ByteCodes")
        .omitNullValues()
        .add("codes", codes)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ByteCodesMessage.ByteCodes} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ByteCodes instance
   */
  public static ImmutableByteCodes copyOf(ByteCodesMessage.ByteCodes instance) {
    if (instance instanceof ImmutableByteCodes) {
      return (ImmutableByteCodes) instance;
    }
    return ImmutableByteCodes.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableByteCodes ImmutableByteCodes}.
   * <pre>
   * ImmutableByteCodes.builder()
   *    .codes(kotlin.collections.ArrayDeque&amp;lt;org.apache.tuweni.bytes.Bytes&amp;gt;) // required {@link ByteCodesMessage.ByteCodes#codes() codes}
   *    .build();
   * </pre>
   * @return A new ImmutableByteCodes builder
   */
  public static ImmutableByteCodes.Builder builder() {
    return new ImmutableByteCodes.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableByteCodes ImmutableByteCodes}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ByteCodesMessage.ByteCodes", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CODES = 0x1L;
    private long initBits = 0x1L;

    private @Nullable ArrayDeque<Bytes> codes;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ByteCodes} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ByteCodesMessage.ByteCodes instance) {
      Objects.requireNonNull(instance, "instance");
      codes(instance.codes());
      return this;
    }

    /**
     * Initializes the value for the {@link ByteCodesMessage.ByteCodes#codes() codes} attribute.
     * @param codes The value for codes 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder codes(ArrayDeque<Bytes> codes) {
      this.codes = Objects.requireNonNull(codes, "codes");
      initBits &= ~INIT_BIT_CODES;
      return this;
    }

    /**
     * Builds a new {@link ImmutableByteCodes ImmutableByteCodes}.
     * @return An immutable instance of ByteCodes
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableByteCodes build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableByteCodes(codes);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_CODES) != 0) attributes.add("codes");
      return "Cannot build ByteCodes, some of required attributes are not set " + attributes;
    }
  }
}
