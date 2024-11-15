package org.hyperledger.besu.ethereum.mainnet;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Booleans;
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
 * Immutable implementation of {@link TransactionValidationParams}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionValidationParams.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableTransactionValidationParams.of()}.
 */
@Generated(from = "TransactionValidationParams", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTransactionValidationParams
    implements TransactionValidationParams {
  private final boolean isAllowFutureNonce;
  private final boolean isAllowExceedingBalance;
  private final boolean isAllowMaxFeeGasBelowBaseFee;
  private final boolean checkOnchainPermissions;
  private final boolean checkLocalPermissions;
  private final boolean isAllowContractAddressAsSender;

  private ImmutableTransactionValidationParams(ImmutableTransactionValidationParams.Builder builder) {
    if (builder.isAllowFutureNonceIsSet()) {
      initShim.isAllowFutureNonce(builder.isAllowFutureNonce);
    }
    if (builder.isAllowExceedingBalanceIsSet()) {
      initShim.isAllowExceedingBalance(builder.isAllowExceedingBalance);
    }
    if (builder.isAllowMaxFeeGasBelowBaseFeeIsSet()) {
      initShim.isAllowMaxFeeGasBelowBaseFee(builder.isAllowMaxFeeGasBelowBaseFee);
    }
    if (builder.checkOnchainPermissionsIsSet()) {
      initShim.checkOnchainPermissions(builder.checkOnchainPermissions);
    }
    if (builder.checkLocalPermissionsIsSet()) {
      initShim.checkLocalPermissions(builder.checkLocalPermissions);
    }
    if (builder.isAllowContractAddressAsSenderIsSet()) {
      initShim.isAllowContractAddressAsSender(builder.isAllowContractAddressAsSender);
    }
    this.isAllowFutureNonce = initShim.isAllowFutureNonce();
    this.isAllowExceedingBalance = initShim.isAllowExceedingBalance();
    this.isAllowMaxFeeGasBelowBaseFee = initShim.isAllowMaxFeeGasBelowBaseFee();
    this.checkOnchainPermissions = initShim.checkOnchainPermissions();
    this.checkLocalPermissions = initShim.checkLocalPermissions();
    this.isAllowContractAddressAsSender = initShim.isAllowContractAddressAsSender();
    this.initShim = null;
  }

  private ImmutableTransactionValidationParams(
      boolean isAllowFutureNonce,
      boolean isAllowExceedingBalance,
      boolean isAllowMaxFeeGasBelowBaseFee,
      boolean checkOnchainPermissions,
      boolean checkLocalPermissions,
      boolean isAllowContractAddressAsSender) {
    this.isAllowFutureNonce = isAllowFutureNonce;
    this.isAllowExceedingBalance = isAllowExceedingBalance;
    this.isAllowMaxFeeGasBelowBaseFee = isAllowMaxFeeGasBelowBaseFee;
    this.checkOnchainPermissions = checkOnchainPermissions;
    this.checkLocalPermissions = checkLocalPermissions;
    this.isAllowContractAddressAsSender = isAllowContractAddressAsSender;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "TransactionValidationParams", generator = "Immutables")
  private final class InitShim {
    private byte isAllowFutureNonceBuildStage = STAGE_UNINITIALIZED;
    private boolean isAllowFutureNonce;

    boolean isAllowFutureNonce() {
      if (isAllowFutureNonceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isAllowFutureNonceBuildStage == STAGE_UNINITIALIZED) {
        isAllowFutureNonceBuildStage = STAGE_INITIALIZING;
        this.isAllowFutureNonce = isAllowFutureNonceInitialize();
        isAllowFutureNonceBuildStage = STAGE_INITIALIZED;
      }
      return this.isAllowFutureNonce;
    }

    void isAllowFutureNonce(boolean isAllowFutureNonce) {
      this.isAllowFutureNonce = isAllowFutureNonce;
      isAllowFutureNonceBuildStage = STAGE_INITIALIZED;
    }

    private byte isAllowExceedingBalanceBuildStage = STAGE_UNINITIALIZED;
    private boolean isAllowExceedingBalance;

    boolean isAllowExceedingBalance() {
      if (isAllowExceedingBalanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isAllowExceedingBalanceBuildStage == STAGE_UNINITIALIZED) {
        isAllowExceedingBalanceBuildStage = STAGE_INITIALIZING;
        this.isAllowExceedingBalance = isAllowExceedingBalanceInitialize();
        isAllowExceedingBalanceBuildStage = STAGE_INITIALIZED;
      }
      return this.isAllowExceedingBalance;
    }

    void isAllowExceedingBalance(boolean isAllowExceedingBalance) {
      this.isAllowExceedingBalance = isAllowExceedingBalance;
      isAllowExceedingBalanceBuildStage = STAGE_INITIALIZED;
    }

    private byte isAllowMaxFeeGasBelowBaseFeeBuildStage = STAGE_UNINITIALIZED;
    private boolean isAllowMaxFeeGasBelowBaseFee;

    boolean isAllowMaxFeeGasBelowBaseFee() {
      if (isAllowMaxFeeGasBelowBaseFeeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isAllowMaxFeeGasBelowBaseFeeBuildStage == STAGE_UNINITIALIZED) {
        isAllowMaxFeeGasBelowBaseFeeBuildStage = STAGE_INITIALIZING;
        this.isAllowMaxFeeGasBelowBaseFee = isAllowMaxFeeGasBelowBaseFeeInitialize();
        isAllowMaxFeeGasBelowBaseFeeBuildStage = STAGE_INITIALIZED;
      }
      return this.isAllowMaxFeeGasBelowBaseFee;
    }

    void isAllowMaxFeeGasBelowBaseFee(boolean isAllowMaxFeeGasBelowBaseFee) {
      this.isAllowMaxFeeGasBelowBaseFee = isAllowMaxFeeGasBelowBaseFee;
      isAllowMaxFeeGasBelowBaseFeeBuildStage = STAGE_INITIALIZED;
    }

    private byte checkOnchainPermissionsBuildStage = STAGE_UNINITIALIZED;
    private boolean checkOnchainPermissions;

    boolean checkOnchainPermissions() {
      if (checkOnchainPermissionsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (checkOnchainPermissionsBuildStage == STAGE_UNINITIALIZED) {
        checkOnchainPermissionsBuildStage = STAGE_INITIALIZING;
        this.checkOnchainPermissions = checkOnchainPermissionsInitialize();
        checkOnchainPermissionsBuildStage = STAGE_INITIALIZED;
      }
      return this.checkOnchainPermissions;
    }

    void checkOnchainPermissions(boolean checkOnchainPermissions) {
      this.checkOnchainPermissions = checkOnchainPermissions;
      checkOnchainPermissionsBuildStage = STAGE_INITIALIZED;
    }

    private byte checkLocalPermissionsBuildStage = STAGE_UNINITIALIZED;
    private boolean checkLocalPermissions;

    boolean checkLocalPermissions() {
      if (checkLocalPermissionsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (checkLocalPermissionsBuildStage == STAGE_UNINITIALIZED) {
        checkLocalPermissionsBuildStage = STAGE_INITIALIZING;
        this.checkLocalPermissions = checkLocalPermissionsInitialize();
        checkLocalPermissionsBuildStage = STAGE_INITIALIZED;
      }
      return this.checkLocalPermissions;
    }

    void checkLocalPermissions(boolean checkLocalPermissions) {
      this.checkLocalPermissions = checkLocalPermissions;
      checkLocalPermissionsBuildStage = STAGE_INITIALIZED;
    }

    private byte isAllowContractAddressAsSenderBuildStage = STAGE_UNINITIALIZED;
    private boolean isAllowContractAddressAsSender;

    boolean isAllowContractAddressAsSender() {
      if (isAllowContractAddressAsSenderBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isAllowContractAddressAsSenderBuildStage == STAGE_UNINITIALIZED) {
        isAllowContractAddressAsSenderBuildStage = STAGE_INITIALIZING;
        this.isAllowContractAddressAsSender = isAllowContractAddressAsSenderInitialize();
        isAllowContractAddressAsSenderBuildStage = STAGE_INITIALIZED;
      }
      return this.isAllowContractAddressAsSender;
    }

    void isAllowContractAddressAsSender(boolean isAllowContractAddressAsSender) {
      this.isAllowContractAddressAsSender = isAllowContractAddressAsSender;
      isAllowContractAddressAsSenderBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (isAllowFutureNonceBuildStage == STAGE_INITIALIZING) attributes.add("isAllowFutureNonce");
      if (isAllowExceedingBalanceBuildStage == STAGE_INITIALIZING) attributes.add("isAllowExceedingBalance");
      if (isAllowMaxFeeGasBelowBaseFeeBuildStage == STAGE_INITIALIZING) attributes.add("isAllowMaxFeeGasBelowBaseFee");
      if (checkOnchainPermissionsBuildStage == STAGE_INITIALIZING) attributes.add("checkOnchainPermissions");
      if (checkLocalPermissionsBuildStage == STAGE_INITIALIZING) attributes.add("checkLocalPermissions");
      if (isAllowContractAddressAsSenderBuildStage == STAGE_INITIALIZING) attributes.add("isAllowContractAddressAsSender");
      return "Cannot build TransactionValidationParams, attribute initializers form cycle " + attributes;
    }
  }

  private boolean isAllowFutureNonceInitialize() {
    return TransactionValidationParams.super.isAllowFutureNonce();
  }

  private boolean isAllowExceedingBalanceInitialize() {
    return TransactionValidationParams.super.isAllowExceedingBalance();
  }

  private boolean isAllowMaxFeeGasBelowBaseFeeInitialize() {
    return TransactionValidationParams.super.isAllowMaxFeeGasBelowBaseFee();
  }

  private boolean checkOnchainPermissionsInitialize() {
    return TransactionValidationParams.super.checkOnchainPermissions();
  }

  private boolean checkLocalPermissionsInitialize() {
    return TransactionValidationParams.super.checkLocalPermissions();
  }

  private boolean isAllowContractAddressAsSenderInitialize() {
    return TransactionValidationParams.super.isAllowContractAddressAsSender();
  }

  /**
   * @return The value of the {@code isAllowFutureNonce} attribute
   */
  @Override
  public boolean isAllowFutureNonce() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isAllowFutureNonce()
        : this.isAllowFutureNonce;
  }

  /**
   * @return The value of the {@code isAllowExceedingBalance} attribute
   */
  @Override
  public boolean isAllowExceedingBalance() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isAllowExceedingBalance()
        : this.isAllowExceedingBalance;
  }

  /**
   * @return The value of the {@code isAllowMaxFeeGasBelowBaseFee} attribute
   */
  @Override
  public boolean isAllowMaxFeeGasBelowBaseFee() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isAllowMaxFeeGasBelowBaseFee()
        : this.isAllowMaxFeeGasBelowBaseFee;
  }

  /**
   * @return The value of the {@code checkOnchainPermissions} attribute
   */
  @Override
  public boolean checkOnchainPermissions() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.checkOnchainPermissions()
        : this.checkOnchainPermissions;
  }

  /**
   * @return The value of the {@code checkLocalPermissions} attribute
   */
  @Override
  public boolean checkLocalPermissions() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.checkLocalPermissions()
        : this.checkLocalPermissions;
  }

  /**
   * @return The value of the {@code isAllowContractAddressAsSender} attribute
   */
  @Override
  public boolean isAllowContractAddressAsSender() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isAllowContractAddressAsSender()
        : this.isAllowContractAddressAsSender;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionValidationParams#isAllowFutureNonce() isAllowFutureNonce} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isAllowFutureNonce
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionValidationParams withIsAllowFutureNonce(boolean value) {
    if (this.isAllowFutureNonce == value) return this;
    return new ImmutableTransactionValidationParams(
        value,
        this.isAllowExceedingBalance,
        this.isAllowMaxFeeGasBelowBaseFee,
        this.checkOnchainPermissions,
        this.checkLocalPermissions,
        this.isAllowContractAddressAsSender);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionValidationParams#isAllowExceedingBalance() isAllowExceedingBalance} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isAllowExceedingBalance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionValidationParams withIsAllowExceedingBalance(boolean value) {
    if (this.isAllowExceedingBalance == value) return this;
    return new ImmutableTransactionValidationParams(
        this.isAllowFutureNonce,
        value,
        this.isAllowMaxFeeGasBelowBaseFee,
        this.checkOnchainPermissions,
        this.checkLocalPermissions,
        this.isAllowContractAddressAsSender);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionValidationParams#isAllowMaxFeeGasBelowBaseFee() isAllowMaxFeeGasBelowBaseFee} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isAllowMaxFeeGasBelowBaseFee
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionValidationParams withIsAllowMaxFeeGasBelowBaseFee(boolean value) {
    if (this.isAllowMaxFeeGasBelowBaseFee == value) return this;
    return new ImmutableTransactionValidationParams(
        this.isAllowFutureNonce,
        this.isAllowExceedingBalance,
        value,
        this.checkOnchainPermissions,
        this.checkLocalPermissions,
        this.isAllowContractAddressAsSender);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionValidationParams#checkOnchainPermissions() checkOnchainPermissions} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for checkOnchainPermissions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionValidationParams withCheckOnchainPermissions(boolean value) {
    if (this.checkOnchainPermissions == value) return this;
    return new ImmutableTransactionValidationParams(
        this.isAllowFutureNonce,
        this.isAllowExceedingBalance,
        this.isAllowMaxFeeGasBelowBaseFee,
        value,
        this.checkLocalPermissions,
        this.isAllowContractAddressAsSender);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionValidationParams#checkLocalPermissions() checkLocalPermissions} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for checkLocalPermissions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionValidationParams withCheckLocalPermissions(boolean value) {
    if (this.checkLocalPermissions == value) return this;
    return new ImmutableTransactionValidationParams(
        this.isAllowFutureNonce,
        this.isAllowExceedingBalance,
        this.isAllowMaxFeeGasBelowBaseFee,
        this.checkOnchainPermissions,
        value,
        this.isAllowContractAddressAsSender);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionValidationParams#isAllowContractAddressAsSender() isAllowContractAddressAsSender} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isAllowContractAddressAsSender
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionValidationParams withIsAllowContractAddressAsSender(boolean value) {
    if (this.isAllowContractAddressAsSender == value) return this;
    return new ImmutableTransactionValidationParams(
        this.isAllowFutureNonce,
        this.isAllowExceedingBalance,
        this.isAllowMaxFeeGasBelowBaseFee,
        this.checkOnchainPermissions,
        this.checkLocalPermissions,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionValidationParams} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionValidationParams
        && equalTo(0, (ImmutableTransactionValidationParams) another);
  }

  private boolean equalTo(int synthetic, ImmutableTransactionValidationParams another) {
    return isAllowFutureNonce == another.isAllowFutureNonce
        && isAllowExceedingBalance == another.isAllowExceedingBalance
        && isAllowMaxFeeGasBelowBaseFee == another.isAllowMaxFeeGasBelowBaseFee
        && checkOnchainPermissions == another.checkOnchainPermissions
        && checkLocalPermissions == another.checkLocalPermissions
        && isAllowContractAddressAsSender == another.isAllowContractAddressAsSender;
  }

  /**
   * Computes a hash code from attributes: {@code isAllowFutureNonce}, {@code isAllowExceedingBalance}, {@code isAllowMaxFeeGasBelowBaseFee}, {@code checkOnchainPermissions}, {@code checkLocalPermissions}, {@code isAllowContractAddressAsSender}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Booleans.hashCode(isAllowFutureNonce);
    h += (h << 5) + Booleans.hashCode(isAllowExceedingBalance);
    h += (h << 5) + Booleans.hashCode(isAllowMaxFeeGasBelowBaseFee);
    h += (h << 5) + Booleans.hashCode(checkOnchainPermissions);
    h += (h << 5) + Booleans.hashCode(checkLocalPermissions);
    h += (h << 5) + Booleans.hashCode(isAllowContractAddressAsSender);
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionValidationParams} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionValidationParams")
        .omitNullValues()
        .add("isAllowFutureNonce", isAllowFutureNonce)
        .add("isAllowExceedingBalance", isAllowExceedingBalance)
        .add("isAllowMaxFeeGasBelowBaseFee", isAllowMaxFeeGasBelowBaseFee)
        .add("checkOnchainPermissions", checkOnchainPermissions)
        .add("checkLocalPermissions", checkLocalPermissions)
        .add("isAllowContractAddressAsSender", isAllowContractAddressAsSender)
        .toString();
  }

  /**
   * Construct a new immutable {@code TransactionValidationParams} instance.
   * @param isAllowFutureNonce The value for the {@code isAllowFutureNonce} attribute
   * @param isAllowExceedingBalance The value for the {@code isAllowExceedingBalance} attribute
   * @param isAllowMaxFeeGasBelowBaseFee The value for the {@code isAllowMaxFeeGasBelowBaseFee} attribute
   * @param checkOnchainPermissions The value for the {@code checkOnchainPermissions} attribute
   * @param checkLocalPermissions The value for the {@code checkLocalPermissions} attribute
   * @param isAllowContractAddressAsSender The value for the {@code isAllowContractAddressAsSender} attribute
   * @return An immutable TransactionValidationParams instance
   */
  public static ImmutableTransactionValidationParams of(boolean isAllowFutureNonce, boolean isAllowExceedingBalance, boolean isAllowMaxFeeGasBelowBaseFee, boolean checkOnchainPermissions, boolean checkLocalPermissions, boolean isAllowContractAddressAsSender) {
    return new ImmutableTransactionValidationParams(isAllowFutureNonce, isAllowExceedingBalance, isAllowMaxFeeGasBelowBaseFee, checkOnchainPermissions, checkLocalPermissions, isAllowContractAddressAsSender);
  }

  /**
   * Creates an immutable copy of a {@link TransactionValidationParams} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionValidationParams instance
   */
  public static ImmutableTransactionValidationParams copyOf(TransactionValidationParams instance) {
    if (instance instanceof ImmutableTransactionValidationParams) {
      return (ImmutableTransactionValidationParams) instance;
    }
    return ImmutableTransactionValidationParams.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionValidationParams ImmutableTransactionValidationParams}.
   * <pre>
   * ImmutableTransactionValidationParams.builder()
   *    .isAllowFutureNonce(boolean) // optional {@link TransactionValidationParams#isAllowFutureNonce() isAllowFutureNonce}
   *    .isAllowExceedingBalance(boolean) // optional {@link TransactionValidationParams#isAllowExceedingBalance() isAllowExceedingBalance}
   *    .isAllowMaxFeeGasBelowBaseFee(boolean) // optional {@link TransactionValidationParams#isAllowMaxFeeGasBelowBaseFee() isAllowMaxFeeGasBelowBaseFee}
   *    .checkOnchainPermissions(boolean) // optional {@link TransactionValidationParams#checkOnchainPermissions() checkOnchainPermissions}
   *    .checkLocalPermissions(boolean) // optional {@link TransactionValidationParams#checkLocalPermissions() checkLocalPermissions}
   *    .isAllowContractAddressAsSender(boolean) // optional {@link TransactionValidationParams#isAllowContractAddressAsSender() isAllowContractAddressAsSender}
   *    .build();
   * </pre>
   * @return A new ImmutableTransactionValidationParams builder
   */
  public static ImmutableTransactionValidationParams.Builder builder() {
    return new ImmutableTransactionValidationParams.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionValidationParams ImmutableTransactionValidationParams}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TransactionValidationParams", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_IS_ALLOW_FUTURE_NONCE = 0x1L;
    private static final long OPT_BIT_IS_ALLOW_EXCEEDING_BALANCE = 0x2L;
    private static final long OPT_BIT_IS_ALLOW_MAX_FEE_GAS_BELOW_BASE_FEE = 0x4L;
    private static final long OPT_BIT_CHECK_ONCHAIN_PERMISSIONS = 0x8L;
    private static final long OPT_BIT_CHECK_LOCAL_PERMISSIONS = 0x10L;
    private static final long OPT_BIT_IS_ALLOW_CONTRACT_ADDRESS_AS_SENDER = 0x20L;
    private long optBits;

    private boolean isAllowFutureNonce;
    private boolean isAllowExceedingBalance;
    private boolean isAllowMaxFeeGasBelowBaseFee;
    private boolean checkOnchainPermissions;
    private boolean checkLocalPermissions;
    private boolean isAllowContractAddressAsSender;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TransactionValidationParams} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(TransactionValidationParams instance) {
      Objects.requireNonNull(instance, "instance");
      isAllowFutureNonce(instance.isAllowFutureNonce());
      isAllowExceedingBalance(instance.isAllowExceedingBalance());
      isAllowMaxFeeGasBelowBaseFee(instance.isAllowMaxFeeGasBelowBaseFee());
      checkOnchainPermissions(instance.checkOnchainPermissions());
      checkLocalPermissions(instance.checkLocalPermissions());
      isAllowContractAddressAsSender(instance.isAllowContractAddressAsSender());
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionValidationParams#isAllowFutureNonce() isAllowFutureNonce} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionValidationParams#isAllowFutureNonce() isAllowFutureNonce}.</em>
     * @param isAllowFutureNonce The value for isAllowFutureNonce 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder isAllowFutureNonce(boolean isAllowFutureNonce) {
      this.isAllowFutureNonce = isAllowFutureNonce;
      optBits |= OPT_BIT_IS_ALLOW_FUTURE_NONCE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionValidationParams#isAllowExceedingBalance() isAllowExceedingBalance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionValidationParams#isAllowExceedingBalance() isAllowExceedingBalance}.</em>
     * @param isAllowExceedingBalance The value for isAllowExceedingBalance 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder isAllowExceedingBalance(boolean isAllowExceedingBalance) {
      this.isAllowExceedingBalance = isAllowExceedingBalance;
      optBits |= OPT_BIT_IS_ALLOW_EXCEEDING_BALANCE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionValidationParams#isAllowMaxFeeGasBelowBaseFee() isAllowMaxFeeGasBelowBaseFee} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionValidationParams#isAllowMaxFeeGasBelowBaseFee() isAllowMaxFeeGasBelowBaseFee}.</em>
     * @param isAllowMaxFeeGasBelowBaseFee The value for isAllowMaxFeeGasBelowBaseFee 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder isAllowMaxFeeGasBelowBaseFee(boolean isAllowMaxFeeGasBelowBaseFee) {
      this.isAllowMaxFeeGasBelowBaseFee = isAllowMaxFeeGasBelowBaseFee;
      optBits |= OPT_BIT_IS_ALLOW_MAX_FEE_GAS_BELOW_BASE_FEE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionValidationParams#checkOnchainPermissions() checkOnchainPermissions} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionValidationParams#checkOnchainPermissions() checkOnchainPermissions}.</em>
     * @param checkOnchainPermissions The value for checkOnchainPermissions 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder checkOnchainPermissions(boolean checkOnchainPermissions) {
      this.checkOnchainPermissions = checkOnchainPermissions;
      optBits |= OPT_BIT_CHECK_ONCHAIN_PERMISSIONS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionValidationParams#checkLocalPermissions() checkLocalPermissions} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionValidationParams#checkLocalPermissions() checkLocalPermissions}.</em>
     * @param checkLocalPermissions The value for checkLocalPermissions 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder checkLocalPermissions(boolean checkLocalPermissions) {
      this.checkLocalPermissions = checkLocalPermissions;
      optBits |= OPT_BIT_CHECK_LOCAL_PERMISSIONS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionValidationParams#isAllowContractAddressAsSender() isAllowContractAddressAsSender} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionValidationParams#isAllowContractAddressAsSender() isAllowContractAddressAsSender}.</em>
     * @param isAllowContractAddressAsSender The value for isAllowContractAddressAsSender 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder isAllowContractAddressAsSender(boolean isAllowContractAddressAsSender) {
      this.isAllowContractAddressAsSender = isAllowContractAddressAsSender;
      optBits |= OPT_BIT_IS_ALLOW_CONTRACT_ADDRESS_AS_SENDER;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionValidationParams ImmutableTransactionValidationParams}.
     * @return An immutable instance of TransactionValidationParams
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionValidationParams build() {
      return new ImmutableTransactionValidationParams(this);
    }

    private boolean isAllowFutureNonceIsSet() {
      return (optBits & OPT_BIT_IS_ALLOW_FUTURE_NONCE) != 0;
    }

    private boolean isAllowExceedingBalanceIsSet() {
      return (optBits & OPT_BIT_IS_ALLOW_EXCEEDING_BALANCE) != 0;
    }

    private boolean isAllowMaxFeeGasBelowBaseFeeIsSet() {
      return (optBits & OPT_BIT_IS_ALLOW_MAX_FEE_GAS_BELOW_BASE_FEE) != 0;
    }

    private boolean checkOnchainPermissionsIsSet() {
      return (optBits & OPT_BIT_CHECK_ONCHAIN_PERMISSIONS) != 0;
    }

    private boolean checkLocalPermissionsIsSet() {
      return (optBits & OPT_BIT_CHECK_LOCAL_PERMISSIONS) != 0;
    }

    private boolean isAllowContractAddressAsSenderIsSet() {
      return (optBits & OPT_BIT_IS_ALLOW_CONTRACT_ADDRESS_AS_SENDER) != 0;
    }
  }
}
