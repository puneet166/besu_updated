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
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.results.BlockResult;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link BlockReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBlockReport.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableBlockReport.of()}.
 */
@Generated(from = "BlockReport", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableBlockReport implements BlockReport {
  private final String id;
  private final BlockResult block;

  private ImmutableBlockReport(String id, BlockResult block) {
    this.id = Objects.requireNonNull(id, "id");
    this.block = Objects.requireNonNull(block, "block");
  }

  private ImmutableBlockReport(
      ImmutableBlockReport original,
      String id,
      BlockResult block) {
    this.id = id;
    this.block = block;
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
   * @return The value of the {@code block} attribute
   */
  @JsonProperty("block")
  @Override
  public BlockResult getBlock() {
    return block;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BlockReport#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBlockReport withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableBlockReport(this, newValue, this.block);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BlockReport#getBlock() block} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for block
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBlockReport withBlock(BlockResult value) {
    if (this.block == value) return this;
    BlockResult newValue = Objects.requireNonNull(value, "block");
    return new ImmutableBlockReport(this, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBlockReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBlockReport
        && equalTo(0, (ImmutableBlockReport) another);
  }

  private boolean equalTo(int synthetic, ImmutableBlockReport another) {
    return id.equals(another.id)
        && block.equals(another.block);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code block}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + block.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code BlockReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("BlockReport")
        .omitNullValues()
        .add("id", id)
        .add("block", block)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "BlockReport", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements BlockReport {
    @Nullable String id;
    @Nullable BlockResult block;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("block")
    public void setBlock(BlockResult block) {
      this.block = block;
    }
    @Override
    public String getId() { throw new UnsupportedOperationException(); }
    @Override
    public BlockResult getBlock() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBlockReport fromJson(Json json) {
    ImmutableBlockReport.Builder builder = ImmutableBlockReport.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.block != null) {
      builder.block(json.block);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code BlockReport} instance.
   * @param id The value for the {@code id} attribute
   * @param block The value for the {@code block} attribute
   * @return An immutable BlockReport instance
   */
  public static ImmutableBlockReport of(String id, BlockResult block) {
    return new ImmutableBlockReport(id, block);
  }

  /**
   * Creates an immutable copy of a {@link BlockReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BlockReport instance
   */
  public static ImmutableBlockReport copyOf(BlockReport instance) {
    if (instance instanceof ImmutableBlockReport) {
      return (ImmutableBlockReport) instance;
    }
    return ImmutableBlockReport.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBlockReport ImmutableBlockReport}.
   * <pre>
   * ImmutableBlockReport.builder()
   *    .id(String) // required {@link BlockReport#getId() id}
   *    .block(org.hyperledger.besu.ethereum.api.jsonrpc.internal.results.BlockResult) // required {@link BlockReport#getBlock() block}
   *    .build();
   * </pre>
   * @return A new ImmutableBlockReport builder
   */
  public static ImmutableBlockReport.Builder builder() {
    return new ImmutableBlockReport.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBlockReport ImmutableBlockReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "BlockReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_BLOCK = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String id;
    private @Nullable BlockResult block;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code BlockReport} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(BlockReport instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      block(instance.getBlock());
      return this;
    }

    /**
     * Initializes the value for the {@link BlockReport#getId() id} attribute.
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
     * Initializes the value for the {@link BlockReport#getBlock() block} attribute.
     * @param block The value for block 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("block")
    public final Builder block(BlockResult block) {
      this.block = Objects.requireNonNull(block, "block");
      initBits &= ~INIT_BIT_BLOCK;
      return this;
    }

    /**
     * Builds a new {@link ImmutableBlockReport ImmutableBlockReport}.
     * @return An immutable instance of BlockReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBlockReport build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBlockReport(null, id, block);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_BLOCK) != 0) attributes.add("block");
      return "Cannot build BlockReport, some of required attributes are not set " + attributes;
    }
  }
}
