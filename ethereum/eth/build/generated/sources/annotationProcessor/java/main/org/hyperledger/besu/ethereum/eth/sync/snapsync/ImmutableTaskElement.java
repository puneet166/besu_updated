package org.hyperledger.besu.ethereum.eth.sync.snapsync;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
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
import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link StackTrie.TaskElement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTaskElement.builder()}.
 */
@Generated(from = "StackTrie.TaskElement", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTaskElement
    extends StackTrie.TaskElement {
  private final ImmutableList<Bytes> proofs;
  private final TreeMap<Bytes32, Bytes> keys;

  private ImmutableTaskElement(ImmutableTaskElement.Builder builder) {
    if (builder.proofsIsSet()) {
      initShim.proofs(builder.proofs.build());
    }
    if (builder.keys != null) {
      initShim.keys(builder.keys);
    }
    this.proofs = initShim.proofs();
    this.keys = initShim.keys();
    this.initShim = null;
  }

  private ImmutableTaskElement(
      ImmutableList<Bytes> proofs,
      TreeMap<Bytes32, Bytes> keys) {
    this.proofs = proofs;
    this.keys = keys;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "StackTrie.TaskElement", generator = "Immutables")
  private final class InitShim {
    private byte proofsBuildStage = STAGE_UNINITIALIZED;
    private ImmutableList<Bytes> proofs;

    ImmutableList<Bytes> proofs() {
      if (proofsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (proofsBuildStage == STAGE_UNINITIALIZED) {
        proofsBuildStage = STAGE_INITIALIZING;
        this.proofs = ImmutableList.copyOf(ImmutableTaskElement.super.proofs());
        proofsBuildStage = STAGE_INITIALIZED;
      }
      return this.proofs;
    }

    void proofs(ImmutableList<Bytes> proofs) {
      this.proofs = proofs;
      proofsBuildStage = STAGE_INITIALIZED;
    }

    private byte keysBuildStage = STAGE_UNINITIALIZED;
    private TreeMap<Bytes32, Bytes> keys;

    TreeMap<Bytes32, Bytes> keys() {
      if (keysBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (keysBuildStage == STAGE_UNINITIALIZED) {
        keysBuildStage = STAGE_INITIALIZING;
        this.keys = Objects.requireNonNull(ImmutableTaskElement.super.keys(), "keys");
        keysBuildStage = STAGE_INITIALIZED;
      }
      return this.keys;
    }

    void keys(TreeMap<Bytes32, Bytes> keys) {
      this.keys = keys;
      keysBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (proofsBuildStage == STAGE_INITIALIZING) attributes.add("proofs");
      if (keysBuildStage == STAGE_INITIALIZING) attributes.add("keys");
      return "Cannot build TaskElement, attribute initializers form cycle " + attributes;
    }
  }

  /**
   * @return The value of the {@code proofs} attribute
   */
  @Override
  public ImmutableList<Bytes> proofs() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.proofs()
        : this.proofs;
  }

  /**
   * @return The value of the {@code keys} attribute
   */
  @Override
  public TreeMap<Bytes32, Bytes> keys() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.keys()
        : this.keys;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StackTrie.TaskElement#proofs() proofs}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTaskElement withProofs(Bytes... elements) {
    ImmutableList<Bytes> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTaskElement(newValue, this.keys);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StackTrie.TaskElement#proofs() proofs}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of proofs elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTaskElement withProofs(Iterable<? extends Bytes> elements) {
    if (this.proofs == elements) return this;
    ImmutableList<Bytes> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTaskElement(newValue, this.keys);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StackTrie.TaskElement#keys() keys} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for keys
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaskElement withKeys(TreeMap<Bytes32, Bytes> value) {
    if (this.keys == value) return this;
    TreeMap<Bytes32, Bytes> newValue = Objects.requireNonNull(value, "keys");
    return new ImmutableTaskElement(this.proofs, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTaskElement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTaskElement
        && equalTo(0, (ImmutableTaskElement) another);
  }

  private boolean equalTo(int synthetic, ImmutableTaskElement another) {
    return proofs.equals(another.proofs)
        && keys.equals(another.keys);
  }

  /**
   * Computes a hash code from attributes: {@code proofs}, {@code keys}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + proofs.hashCode();
    h += (h << 5) + keys.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TaskElement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TaskElement")
        .omitNullValues()
        .add("proofs", proofs)
        .add("keys", keys)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link StackTrie.TaskElement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TaskElement instance
   */
  public static ImmutableTaskElement copyOf(StackTrie.TaskElement instance) {
    if (instance instanceof ImmutableTaskElement) {
      return (ImmutableTaskElement) instance;
    }
    return ImmutableTaskElement.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTaskElement ImmutableTaskElement}.
   * <pre>
   * ImmutableTaskElement.builder()
   *    .addProofs|addAllProofs(org.apache.tuweni.bytes.Bytes) // {@link StackTrie.TaskElement#proofs() proofs} elements
   *    .keys(TreeMap&amp;lt;org.apache.tuweni.bytes.Bytes32, org.apache.tuweni.bytes.Bytes&amp;gt;) // optional {@link StackTrie.TaskElement#keys() keys}
   *    .build();
   * </pre>
   * @return A new ImmutableTaskElement builder
   */
  public static ImmutableTaskElement.Builder builder() {
    return new ImmutableTaskElement.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTaskElement ImmutableTaskElement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StackTrie.TaskElement", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PROOFS = 0x1L;
    private long optBits;

    private ImmutableList.Builder<Bytes> proofs = ImmutableList.builder();
    private @Nullable TreeMap<Bytes32, Bytes> keys;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TaskElement} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(StackTrie.TaskElement instance) {
      Objects.requireNonNull(instance, "instance");
      addAllProofs(instance.proofs());
      keys(instance.keys());
      return this;
    }

    /**
     * Adds one element to {@link StackTrie.TaskElement#proofs() proofs} list.
     * @param element A proofs element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addProofs(Bytes element) {
      this.proofs.add(element);
      optBits |= OPT_BIT_PROOFS;
      return this;
    }

    /**
     * Adds elements to {@link StackTrie.TaskElement#proofs() proofs} list.
     * @param elements An array of proofs elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addProofs(Bytes... elements) {
      this.proofs.add(elements);
      optBits |= OPT_BIT_PROOFS;
      return this;
    }


    /**
     * Sets or replaces all elements for {@link StackTrie.TaskElement#proofs() proofs} list.
     * @param elements An iterable of proofs elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder proofs(Iterable<? extends Bytes> elements) {
      this.proofs = ImmutableList.builder();
      return addAllProofs(elements);
    }

    /**
     * Adds elements to {@link StackTrie.TaskElement#proofs() proofs} list.
     * @param elements An iterable of proofs elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllProofs(Iterable<? extends Bytes> elements) {
      this.proofs.addAll(elements);
      optBits |= OPT_BIT_PROOFS;
      return this;
    }

    /**
     * Initializes the value for the {@link StackTrie.TaskElement#keys() keys} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link StackTrie.TaskElement#keys() keys}.</em>
     * @param keys The value for keys 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder keys(TreeMap<Bytes32, Bytes> keys) {
      this.keys = Objects.requireNonNull(keys, "keys");
      return this;
    }

    /**
     * Builds a new {@link ImmutableTaskElement ImmutableTaskElement}.
     * @return An immutable instance of TaskElement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTaskElement build() {
      return new ImmutableTaskElement(this);
    }

    private boolean proofsIsSet() {
      return (optBits & OPT_BIT_PROOFS) != 0;
    }
  }
}
