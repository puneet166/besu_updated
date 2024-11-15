package org.hyperledger.besu.ethereum.eth.messages.snap;

import com.google.common.base.MoreObjects;
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
import kotlin.collections.ArrayDeque;
import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AccountRangeMessage.AccountRangeData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccountRangeData.builder()}.
 */
@Generated(from = "AccountRangeMessage.AccountRangeData", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableAccountRangeData
    implements AccountRangeMessage.AccountRangeData {
  private final TreeMap<Bytes32, Bytes> accounts;
  private final ArrayDeque<Bytes> proofs;

  private ImmutableAccountRangeData(
      TreeMap<Bytes32, Bytes> accounts,
      ArrayDeque<Bytes> proofs) {
    this.accounts = accounts;
    this.proofs = proofs;
  }

  /**
   * @return The value of the {@code accounts} attribute
   */
  @Override
  public TreeMap<Bytes32, Bytes> accounts() {
    return accounts;
  }

  /**
   * @return The value of the {@code proofs} attribute
   */
  @Override
  public ArrayDeque<Bytes> proofs() {
    return proofs;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccountRangeMessage.AccountRangeData#accounts() accounts} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for accounts
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccountRangeData withAccounts(TreeMap<Bytes32, Bytes> value) {
    if (this.accounts == value) return this;
    TreeMap<Bytes32, Bytes> newValue = Objects.requireNonNull(value, "accounts");
    return new ImmutableAccountRangeData(newValue, this.proofs);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccountRangeMessage.AccountRangeData#proofs() proofs} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for proofs
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccountRangeData withProofs(ArrayDeque<Bytes> value) {
    if (this.proofs == value) return this;
    ArrayDeque<Bytes> newValue = Objects.requireNonNull(value, "proofs");
    return new ImmutableAccountRangeData(this.accounts, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccountRangeData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccountRangeData
        && equalTo(0, (ImmutableAccountRangeData) another);
  }

  private boolean equalTo(int synthetic, ImmutableAccountRangeData another) {
    return accounts.equals(another.accounts)
        && proofs.equals(another.proofs);
  }

  /**
   * Computes a hash code from attributes: {@code accounts}, {@code proofs}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + accounts.hashCode();
    h += (h << 5) + proofs.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AccountRangeData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AccountRangeData")
        .omitNullValues()
        .add("accounts", accounts)
        .add("proofs", proofs)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link AccountRangeMessage.AccountRangeData} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccountRangeData instance
   */
  public static ImmutableAccountRangeData copyOf(AccountRangeMessage.AccountRangeData instance) {
    if (instance instanceof ImmutableAccountRangeData) {
      return (ImmutableAccountRangeData) instance;
    }
    return ImmutableAccountRangeData.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAccountRangeData ImmutableAccountRangeData}.
   * <pre>
   * ImmutableAccountRangeData.builder()
   *    .accounts(TreeMap&amp;lt;org.apache.tuweni.bytes.Bytes32, org.apache.tuweni.bytes.Bytes&amp;gt;) // required {@link AccountRangeMessage.AccountRangeData#accounts() accounts}
   *    .proofs(kotlin.collections.ArrayDeque&amp;lt;org.apache.tuweni.bytes.Bytes&amp;gt;) // required {@link AccountRangeMessage.AccountRangeData#proofs() proofs}
   *    .build();
   * </pre>
   * @return A new ImmutableAccountRangeData builder
   */
  public static ImmutableAccountRangeData.Builder builder() {
    return new ImmutableAccountRangeData.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAccountRangeData ImmutableAccountRangeData}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AccountRangeMessage.AccountRangeData", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ACCOUNTS = 0x1L;
    private static final long INIT_BIT_PROOFS = 0x2L;
    private long initBits = 0x3L;

    private @Nullable TreeMap<Bytes32, Bytes> accounts;
    private @Nullable ArrayDeque<Bytes> proofs;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AccountRangeData} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(AccountRangeMessage.AccountRangeData instance) {
      Objects.requireNonNull(instance, "instance");
      accounts(instance.accounts());
      proofs(instance.proofs());
      return this;
    }

    /**
     * Initializes the value for the {@link AccountRangeMessage.AccountRangeData#accounts() accounts} attribute.
     * @param accounts The value for accounts 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder accounts(TreeMap<Bytes32, Bytes> accounts) {
      this.accounts = Objects.requireNonNull(accounts, "accounts");
      initBits &= ~INIT_BIT_ACCOUNTS;
      return this;
    }

    /**
     * Initializes the value for the {@link AccountRangeMessage.AccountRangeData#proofs() proofs} attribute.
     * @param proofs The value for proofs 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder proofs(ArrayDeque<Bytes> proofs) {
      this.proofs = Objects.requireNonNull(proofs, "proofs");
      initBits &= ~INIT_BIT_PROOFS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAccountRangeData ImmutableAccountRangeData}.
     * @return An immutable instance of AccountRangeData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAccountRangeData build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAccountRangeData(accounts, proofs);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ACCOUNTS) != 0) attributes.add("accounts");
      if ((initBits & INIT_BIT_PROOFS) != 0) attributes.add("proofs");
      return "Cannot build AccountRangeData, some of required attributes are not set " + attributes;
    }
  }
}
