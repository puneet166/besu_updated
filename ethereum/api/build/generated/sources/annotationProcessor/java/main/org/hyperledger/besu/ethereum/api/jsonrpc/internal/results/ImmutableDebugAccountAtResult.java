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
 * Immutable implementation of {@link DebugAccountAtResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDebugAccountAtResult.builder()}.
 */
@Generated(from = "DebugAccountAtResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableDebugAccountAtResult
    extends DebugAccountAtResult {
  private final String code;
  private final String nonce;
  private final String balance;
  private final String codehash;

  private ImmutableDebugAccountAtResult(String code, String nonce, String balance, String codehash) {
    this.code = code;
    this.nonce = nonce;
    this.balance = balance;
    this.codehash = codehash;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @Override
  public String getCode() {
    return code;
  }

  /**
   * @return The value of the {@code nonce} attribute
   */
  @Override
  public String getNonce() {
    return nonce;
  }

  /**
   * @return The value of the {@code balance} attribute
   */
  @Override
  public String getBalance() {
    return balance;
  }

  /**
   * @return The value of the {@code codehash} attribute
   */
  @Override
  public String getCodehash() {
    return codehash;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DebugAccountAtResult#getCode() code} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDebugAccountAtResult withCode(String value) {
    String newValue = Objects.requireNonNull(value, "code");
    if (this.code.equals(newValue)) return this;
    return new ImmutableDebugAccountAtResult(newValue, this.nonce, this.balance, this.codehash);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DebugAccountAtResult#getNonce() nonce} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nonce
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDebugAccountAtResult withNonce(String value) {
    String newValue = Objects.requireNonNull(value, "nonce");
    if (this.nonce.equals(newValue)) return this;
    return new ImmutableDebugAccountAtResult(this.code, newValue, this.balance, this.codehash);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DebugAccountAtResult#getBalance() balance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for balance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDebugAccountAtResult withBalance(String value) {
    String newValue = Objects.requireNonNull(value, "balance");
    if (this.balance.equals(newValue)) return this;
    return new ImmutableDebugAccountAtResult(this.code, this.nonce, newValue, this.codehash);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DebugAccountAtResult#getCodehash() codehash} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for codehash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDebugAccountAtResult withCodehash(String value) {
    String newValue = Objects.requireNonNull(value, "codehash");
    if (this.codehash.equals(newValue)) return this;
    return new ImmutableDebugAccountAtResult(this.code, this.nonce, this.balance, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDebugAccountAtResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDebugAccountAtResult
        && equalTo(0, (ImmutableDebugAccountAtResult) another);
  }

  private boolean equalTo(int synthetic, ImmutableDebugAccountAtResult another) {
    return code.equals(another.code)
        && nonce.equals(another.nonce)
        && balance.equals(another.balance)
        && codehash.equals(another.codehash);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code nonce}, {@code balance}, {@code codehash}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + code.hashCode();
    h += (h << 5) + nonce.hashCode();
    h += (h << 5) + balance.hashCode();
    h += (h << 5) + codehash.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DebugAccountAtResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DebugAccountAtResult")
        .omitNullValues()
        .add("code", code)
        .add("nonce", nonce)
        .add("balance", balance)
        .add("codehash", codehash)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link DebugAccountAtResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DebugAccountAtResult instance
   */
  public static ImmutableDebugAccountAtResult copyOf(DebugAccountAtResult instance) {
    if (instance instanceof ImmutableDebugAccountAtResult) {
      return (ImmutableDebugAccountAtResult) instance;
    }
    return ImmutableDebugAccountAtResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDebugAccountAtResult ImmutableDebugAccountAtResult}.
   * <pre>
   * ImmutableDebugAccountAtResult.builder()
   *    .code(String) // required {@link DebugAccountAtResult#getCode() code}
   *    .nonce(String) // required {@link DebugAccountAtResult#getNonce() nonce}
   *    .balance(String) // required {@link DebugAccountAtResult#getBalance() balance}
   *    .codehash(String) // required {@link DebugAccountAtResult#getCodehash() codehash}
   *    .build();
   * </pre>
   * @return A new ImmutableDebugAccountAtResult builder
   */
  public static ImmutableDebugAccountAtResult.Builder builder() {
    return new ImmutableDebugAccountAtResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDebugAccountAtResult ImmutableDebugAccountAtResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DebugAccountAtResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_NONCE = 0x2L;
    private static final long INIT_BIT_BALANCE = 0x4L;
    private static final long INIT_BIT_CODEHASH = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String code;
    private @Nullable String nonce;
    private @Nullable String balance;
    private @Nullable String codehash;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DebugAccountAtResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(DebugAccountAtResult instance) {
      Objects.requireNonNull(instance, "instance");
      code(instance.getCode());
      nonce(instance.getNonce());
      balance(instance.getBalance());
      codehash(instance.getCodehash());
      return this;
    }

    /**
     * Initializes the value for the {@link DebugAccountAtResult#getCode() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder code(String code) {
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link DebugAccountAtResult#getNonce() nonce} attribute.
     * @param nonce The value for nonce 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder nonce(String nonce) {
      this.nonce = Objects.requireNonNull(nonce, "nonce");
      initBits &= ~INIT_BIT_NONCE;
      return this;
    }

    /**
     * Initializes the value for the {@link DebugAccountAtResult#getBalance() balance} attribute.
     * @param balance The value for balance 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder balance(String balance) {
      this.balance = Objects.requireNonNull(balance, "balance");
      initBits &= ~INIT_BIT_BALANCE;
      return this;
    }

    /**
     * Initializes the value for the {@link DebugAccountAtResult#getCodehash() codehash} attribute.
     * @param codehash The value for codehash 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder codehash(String codehash) {
      this.codehash = Objects.requireNonNull(codehash, "codehash");
      initBits &= ~INIT_BIT_CODEHASH;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDebugAccountAtResult ImmutableDebugAccountAtResult}.
     * @return An immutable instance of DebugAccountAtResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDebugAccountAtResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDebugAccountAtResult(code, nonce, balance, codehash);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_CODE) != 0) attributes.add("code");
      if ((initBits & INIT_BIT_NONCE) != 0) attributes.add("nonce");
      if ((initBits & INIT_BIT_BALANCE) != 0) attributes.add("balance");
      if ((initBits & INIT_BIT_CODEHASH) != 0) attributes.add("codehash");
      return "Cannot build DebugAccountAtResult, some of required attributes are not set " + attributes;
    }
  }
}
