package org.hyperledger.besu.ethereum.api.jsonrpc.internal.results;

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
 * Immutable implementation of {@link ProtocolsResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProtocolsResult.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableProtocolsResult.of()}.
 */
@Generated(from = "ProtocolsResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableProtocolsResult
    implements ProtocolsResult {
  private final String difficulty;
  private final String head;
  private final int version;

  private ImmutableProtocolsResult(String difficulty, String head, int version) {
    this.difficulty = Objects.requireNonNull(difficulty, "difficulty");
    this.head = Objects.requireNonNull(head, "head");
    this.version = version;
  }

  private ImmutableProtocolsResult(ImmutableProtocolsResult original, String difficulty, String head, int version) {
    this.difficulty = difficulty;
    this.head = head;
    this.version = version;
  }

  /**
   * @return The value of the {@code difficulty} attribute
   */
  @Override
  public String getDifficulty() {
    return difficulty;
  }

  /**
   * @return The value of the {@code head} attribute
   */
  @Override
  public String getHead() {
    return head;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @Override
  public int getVersion() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProtocolsResult#getDifficulty() difficulty} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for difficulty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProtocolsResult withDifficulty(String value) {
    String newValue = Objects.requireNonNull(value, "difficulty");
    if (this.difficulty.equals(newValue)) return this;
    return new ImmutableProtocolsResult(this, newValue, this.head, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProtocolsResult#getHead() head} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for head
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProtocolsResult withHead(String value) {
    String newValue = Objects.requireNonNull(value, "head");
    if (this.head.equals(newValue)) return this;
    return new ImmutableProtocolsResult(this, this.difficulty, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProtocolsResult#getVersion() version} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProtocolsResult withVersion(int value) {
    if (this.version == value) return this;
    return new ImmutableProtocolsResult(this, this.difficulty, this.head, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProtocolsResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProtocolsResult
        && equalTo(0, (ImmutableProtocolsResult) another);
  }

  private boolean equalTo(int synthetic, ImmutableProtocolsResult another) {
    return difficulty.equals(another.difficulty)
        && head.equals(another.head)
        && version == another.version;
  }

  /**
   * Computes a hash code from attributes: {@code difficulty}, {@code head}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + difficulty.hashCode();
    h += (h << 5) + head.hashCode();
    h += (h << 5) + version;
    return h;
  }

  /**
   * Prints the immutable value {@code ProtocolsResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ProtocolsResult")
        .omitNullValues()
        .add("difficulty", difficulty)
        .add("head", head)
        .add("version", version)
        .toString();
  }

  /**
   * Construct a new immutable {@code ProtocolsResult} instance.
   * @param difficulty The value for the {@code difficulty} attribute
   * @param head The value for the {@code head} attribute
   * @param version The value for the {@code version} attribute
   * @return An immutable ProtocolsResult instance
   */
  public static ImmutableProtocolsResult of(String difficulty, String head, int version) {
    return new ImmutableProtocolsResult(difficulty, head, version);
  }

  /**
   * Creates an immutable copy of a {@link ProtocolsResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ProtocolsResult instance
   */
  public static ImmutableProtocolsResult copyOf(ProtocolsResult instance) {
    if (instance instanceof ImmutableProtocolsResult) {
      return (ImmutableProtocolsResult) instance;
    }
    return ImmutableProtocolsResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableProtocolsResult ImmutableProtocolsResult}.
   * <pre>
   * ImmutableProtocolsResult.builder()
   *    .difficulty(String) // required {@link ProtocolsResult#getDifficulty() difficulty}
   *    .head(String) // required {@link ProtocolsResult#getHead() head}
   *    .version(int) // required {@link ProtocolsResult#getVersion() version}
   *    .build();
   * </pre>
   * @return A new ImmutableProtocolsResult builder
   */
  public static ImmutableProtocolsResult.Builder builder() {
    return new ImmutableProtocolsResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableProtocolsResult ImmutableProtocolsResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ProtocolsResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DIFFICULTY = 0x1L;
    private static final long INIT_BIT_HEAD = 0x2L;
    private static final long INIT_BIT_VERSION = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String difficulty;
    private @Nullable String head;
    private int version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ProtocolsResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ProtocolsResult instance) {
      Objects.requireNonNull(instance, "instance");
      difficulty(instance.getDifficulty());
      head(instance.getHead());
      version(instance.getVersion());
      return this;
    }

    /**
     * Initializes the value for the {@link ProtocolsResult#getDifficulty() difficulty} attribute.
     * @param difficulty The value for difficulty 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder difficulty(String difficulty) {
      this.difficulty = Objects.requireNonNull(difficulty, "difficulty");
      initBits &= ~INIT_BIT_DIFFICULTY;
      return this;
    }

    /**
     * Initializes the value for the {@link ProtocolsResult#getHead() head} attribute.
     * @param head The value for head 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder head(String head) {
      this.head = Objects.requireNonNull(head, "head");
      initBits &= ~INIT_BIT_HEAD;
      return this;
    }

    /**
     * Initializes the value for the {@link ProtocolsResult#getVersion() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder version(int version) {
      this.version = version;
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableProtocolsResult ImmutableProtocolsResult}.
     * @return An immutable instance of ProtocolsResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableProtocolsResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableProtocolsResult(null, difficulty, head, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_DIFFICULTY) != 0) attributes.add("difficulty");
      if ((initBits & INIT_BIT_HEAD) != 0) attributes.add("head");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build ProtocolsResult, some of required attributes are not set " + attributes;
    }
  }
}
