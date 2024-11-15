package org.hyperledger.besu.ethereum.eth.transactions;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Floats;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.hyperledger.besu.datatypes.Wei;
import org.hyperledger.besu.util.number.Percentage;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TransactionPoolConfiguration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionPoolConfiguration.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableTransactionPoolConfiguration.of()}.
 */
@Generated(from = "TransactionPoolConfiguration", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTransactionPoolConfiguration
    implements TransactionPoolConfiguration {
  private final int txPoolMaxSize;
  private final float txPoolLimitByAccountPercentage;
  private transient final int txPoolMaxFutureTransactionByAccount;
  private final int pendingTxRetentionPeriod;
  private final int txMessageKeepAliveSeconds;
  private final Percentage priceBump;
  private final Duration eth65TrxAnnouncedBufferingPeriod;
  private final Wei txFeeCap;
  private final Boolean strictTransactionReplayProtectionEnabled;

  private ImmutableTransactionPoolConfiguration(
      int txPoolMaxSize,
      float txPoolLimitByAccountPercentage,
      int pendingTxRetentionPeriod,
      int txMessageKeepAliveSeconds,
      Percentage priceBump,
      Duration eth65TrxAnnouncedBufferingPeriod,
      Wei txFeeCap,
      Boolean strictTransactionReplayProtectionEnabled) {
    initShim.txPoolMaxSize(txPoolMaxSize);
    initShim.txPoolLimitByAccountPercentage(txPoolLimitByAccountPercentage);
    initShim.pendingTxRetentionPeriod(pendingTxRetentionPeriod);
    initShim.txMessageKeepAliveSeconds(txMessageKeepAliveSeconds);
    initShim.priceBump(Objects.requireNonNull(priceBump, "priceBump"));
    initShim.eth65TrxAnnouncedBufferingPeriod(Objects.requireNonNull(eth65TrxAnnouncedBufferingPeriod, "eth65TrxAnnouncedBufferingPeriod"));
    initShim.txFeeCap(Objects.requireNonNull(txFeeCap, "txFeeCap"));
    initShim.strictTransactionReplayProtectionEnabled(Objects.requireNonNull(strictTransactionReplayProtectionEnabled, "strictTransactionReplayProtectionEnabled"));
    this.txPoolMaxSize = initShim.getTxPoolMaxSize();
    this.txPoolLimitByAccountPercentage = initShim.getTxPoolLimitByAccountPercentage();
    this.txPoolMaxFutureTransactionByAccount = initShim.getTxPoolMaxFutureTransactionByAccount();
    this.pendingTxRetentionPeriod = initShim.getPendingTxRetentionPeriod();
    this.txMessageKeepAliveSeconds = initShim.getTxMessageKeepAliveSeconds();
    this.priceBump = initShim.getPriceBump();
    this.eth65TrxAnnouncedBufferingPeriod = initShim.getEth65TrxAnnouncedBufferingPeriod();
    this.txFeeCap = initShim.getTxFeeCap();
    this.strictTransactionReplayProtectionEnabled = initShim.getStrictTransactionReplayProtectionEnabled();
    this.initShim = null;
  }

  private ImmutableTransactionPoolConfiguration(ImmutableTransactionPoolConfiguration.Builder builder) {
    if (builder.txPoolMaxSizeIsSet()) {
      initShim.txPoolMaxSize(builder.txPoolMaxSize);
    }
    if (builder.txPoolLimitByAccountPercentageIsSet()) {
      initShim.txPoolLimitByAccountPercentage(builder.txPoolLimitByAccountPercentage);
    }
    if (builder.pendingTxRetentionPeriodIsSet()) {
      initShim.pendingTxRetentionPeriod(builder.pendingTxRetentionPeriod);
    }
    if (builder.txMessageKeepAliveSecondsIsSet()) {
      initShim.txMessageKeepAliveSeconds(builder.txMessageKeepAliveSeconds);
    }
    if (builder.priceBump != null) {
      initShim.priceBump(builder.priceBump);
    }
    if (builder.eth65TrxAnnouncedBufferingPeriod != null) {
      initShim.eth65TrxAnnouncedBufferingPeriod(builder.eth65TrxAnnouncedBufferingPeriod);
    }
    if (builder.txFeeCap != null) {
      initShim.txFeeCap(builder.txFeeCap);
    }
    if (builder.strictTransactionReplayProtectionEnabled != null) {
      initShim.strictTransactionReplayProtectionEnabled(builder.strictTransactionReplayProtectionEnabled);
    }
    this.txPoolMaxSize = initShim.getTxPoolMaxSize();
    this.txPoolLimitByAccountPercentage = initShim.getTxPoolLimitByAccountPercentage();
    this.txPoolMaxFutureTransactionByAccount = initShim.getTxPoolMaxFutureTransactionByAccount();
    this.pendingTxRetentionPeriod = initShim.getPendingTxRetentionPeriod();
    this.txMessageKeepAliveSeconds = initShim.getTxMessageKeepAliveSeconds();
    this.priceBump = initShim.getPriceBump();
    this.eth65TrxAnnouncedBufferingPeriod = initShim.getEth65TrxAnnouncedBufferingPeriod();
    this.txFeeCap = initShim.getTxFeeCap();
    this.strictTransactionReplayProtectionEnabled = initShim.getStrictTransactionReplayProtectionEnabled();
    this.initShim = null;
  }

  private ImmutableTransactionPoolConfiguration(
      ImmutableTransactionPoolConfiguration original,
      int txPoolMaxSize,
      float txPoolLimitByAccountPercentage,
      int pendingTxRetentionPeriod,
      int txMessageKeepAliveSeconds,
      Percentage priceBump,
      Duration eth65TrxAnnouncedBufferingPeriod,
      Wei txFeeCap,
      Boolean strictTransactionReplayProtectionEnabled) {
    initShim.txPoolMaxSize(txPoolMaxSize);
    initShim.txPoolLimitByAccountPercentage(txPoolLimitByAccountPercentage);
    initShim.pendingTxRetentionPeriod(pendingTxRetentionPeriod);
    initShim.txMessageKeepAliveSeconds(txMessageKeepAliveSeconds);
    initShim.priceBump(priceBump);
    initShim.eth65TrxAnnouncedBufferingPeriod(eth65TrxAnnouncedBufferingPeriod);
    initShim.txFeeCap(txFeeCap);
    initShim.strictTransactionReplayProtectionEnabled(strictTransactionReplayProtectionEnabled);
    this.txPoolMaxSize = initShim.getTxPoolMaxSize();
    this.txPoolLimitByAccountPercentage = initShim.getTxPoolLimitByAccountPercentage();
    this.txPoolMaxFutureTransactionByAccount = initShim.getTxPoolMaxFutureTransactionByAccount();
    this.pendingTxRetentionPeriod = initShim.getPendingTxRetentionPeriod();
    this.txMessageKeepAliveSeconds = initShim.getTxMessageKeepAliveSeconds();
    this.priceBump = initShim.getPriceBump();
    this.eth65TrxAnnouncedBufferingPeriod = initShim.getEth65TrxAnnouncedBufferingPeriod();
    this.txFeeCap = initShim.getTxFeeCap();
    this.strictTransactionReplayProtectionEnabled = initShim.getStrictTransactionReplayProtectionEnabled();
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "TransactionPoolConfiguration", generator = "Immutables")
  private final class InitShim {
    private byte txPoolMaxSizeBuildStage = STAGE_UNINITIALIZED;
    private int txPoolMaxSize;

    int getTxPoolMaxSize() {
      if (txPoolMaxSizeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (txPoolMaxSizeBuildStage == STAGE_UNINITIALIZED) {
        txPoolMaxSizeBuildStage = STAGE_INITIALIZING;
        this.txPoolMaxSize = getTxPoolMaxSizeInitialize();
        txPoolMaxSizeBuildStage = STAGE_INITIALIZED;
      }
      return this.txPoolMaxSize;
    }

    void txPoolMaxSize(int txPoolMaxSize) {
      this.txPoolMaxSize = txPoolMaxSize;
      txPoolMaxSizeBuildStage = STAGE_INITIALIZED;
    }

    private byte txPoolLimitByAccountPercentageBuildStage = STAGE_UNINITIALIZED;
    private float txPoolLimitByAccountPercentage;

    float getTxPoolLimitByAccountPercentage() {
      if (txPoolLimitByAccountPercentageBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (txPoolLimitByAccountPercentageBuildStage == STAGE_UNINITIALIZED) {
        txPoolLimitByAccountPercentageBuildStage = STAGE_INITIALIZING;
        this.txPoolLimitByAccountPercentage = getTxPoolLimitByAccountPercentageInitialize();
        txPoolLimitByAccountPercentageBuildStage = STAGE_INITIALIZED;
      }
      return this.txPoolLimitByAccountPercentage;
    }

    void txPoolLimitByAccountPercentage(float txPoolLimitByAccountPercentage) {
      this.txPoolLimitByAccountPercentage = txPoolLimitByAccountPercentage;
      txPoolLimitByAccountPercentageBuildStage = STAGE_INITIALIZED;
    }

    private byte txPoolMaxFutureTransactionByAccountBuildStage = STAGE_UNINITIALIZED;
    private int txPoolMaxFutureTransactionByAccount;

    int getTxPoolMaxFutureTransactionByAccount() {
      if (txPoolMaxFutureTransactionByAccountBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (txPoolMaxFutureTransactionByAccountBuildStage == STAGE_UNINITIALIZED) {
        txPoolMaxFutureTransactionByAccountBuildStage = STAGE_INITIALIZING;
        this.txPoolMaxFutureTransactionByAccount = getTxPoolMaxFutureTransactionByAccountInitialize();
        txPoolMaxFutureTransactionByAccountBuildStage = STAGE_INITIALIZED;
      }
      return this.txPoolMaxFutureTransactionByAccount;
    }

    private byte pendingTxRetentionPeriodBuildStage = STAGE_UNINITIALIZED;
    private int pendingTxRetentionPeriod;

    int getPendingTxRetentionPeriod() {
      if (pendingTxRetentionPeriodBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (pendingTxRetentionPeriodBuildStage == STAGE_UNINITIALIZED) {
        pendingTxRetentionPeriodBuildStage = STAGE_INITIALIZING;
        this.pendingTxRetentionPeriod = getPendingTxRetentionPeriodInitialize();
        pendingTxRetentionPeriodBuildStage = STAGE_INITIALIZED;
      }
      return this.pendingTxRetentionPeriod;
    }

    void pendingTxRetentionPeriod(int pendingTxRetentionPeriod) {
      this.pendingTxRetentionPeriod = pendingTxRetentionPeriod;
      pendingTxRetentionPeriodBuildStage = STAGE_INITIALIZED;
    }

    private byte txMessageKeepAliveSecondsBuildStage = STAGE_UNINITIALIZED;
    private int txMessageKeepAliveSeconds;

    int getTxMessageKeepAliveSeconds() {
      if (txMessageKeepAliveSecondsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (txMessageKeepAliveSecondsBuildStage == STAGE_UNINITIALIZED) {
        txMessageKeepAliveSecondsBuildStage = STAGE_INITIALIZING;
        this.txMessageKeepAliveSeconds = getTxMessageKeepAliveSecondsInitialize();
        txMessageKeepAliveSecondsBuildStage = STAGE_INITIALIZED;
      }
      return this.txMessageKeepAliveSeconds;
    }

    void txMessageKeepAliveSeconds(int txMessageKeepAliveSeconds) {
      this.txMessageKeepAliveSeconds = txMessageKeepAliveSeconds;
      txMessageKeepAliveSecondsBuildStage = STAGE_INITIALIZED;
    }

    private byte priceBumpBuildStage = STAGE_UNINITIALIZED;
    private Percentage priceBump;

    Percentage getPriceBump() {
      if (priceBumpBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (priceBumpBuildStage == STAGE_UNINITIALIZED) {
        priceBumpBuildStage = STAGE_INITIALIZING;
        this.priceBump = Objects.requireNonNull(getPriceBumpInitialize(), "priceBump");
        priceBumpBuildStage = STAGE_INITIALIZED;
      }
      return this.priceBump;
    }

    void priceBump(Percentage priceBump) {
      this.priceBump = priceBump;
      priceBumpBuildStage = STAGE_INITIALIZED;
    }

    private byte eth65TrxAnnouncedBufferingPeriodBuildStage = STAGE_UNINITIALIZED;
    private Duration eth65TrxAnnouncedBufferingPeriod;

    Duration getEth65TrxAnnouncedBufferingPeriod() {
      if (eth65TrxAnnouncedBufferingPeriodBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (eth65TrxAnnouncedBufferingPeriodBuildStage == STAGE_UNINITIALIZED) {
        eth65TrxAnnouncedBufferingPeriodBuildStage = STAGE_INITIALIZING;
        this.eth65TrxAnnouncedBufferingPeriod = Objects.requireNonNull(getEth65TrxAnnouncedBufferingPeriodInitialize(), "eth65TrxAnnouncedBufferingPeriod");
        eth65TrxAnnouncedBufferingPeriodBuildStage = STAGE_INITIALIZED;
      }
      return this.eth65TrxAnnouncedBufferingPeriod;
    }

    void eth65TrxAnnouncedBufferingPeriod(Duration eth65TrxAnnouncedBufferingPeriod) {
      this.eth65TrxAnnouncedBufferingPeriod = eth65TrxAnnouncedBufferingPeriod;
      eth65TrxAnnouncedBufferingPeriodBuildStage = STAGE_INITIALIZED;
    }

    private byte txFeeCapBuildStage = STAGE_UNINITIALIZED;
    private Wei txFeeCap;

    Wei getTxFeeCap() {
      if (txFeeCapBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (txFeeCapBuildStage == STAGE_UNINITIALIZED) {
        txFeeCapBuildStage = STAGE_INITIALIZING;
        this.txFeeCap = Objects.requireNonNull(getTxFeeCapInitialize(), "txFeeCap");
        txFeeCapBuildStage = STAGE_INITIALIZED;
      }
      return this.txFeeCap;
    }

    void txFeeCap(Wei txFeeCap) {
      this.txFeeCap = txFeeCap;
      txFeeCapBuildStage = STAGE_INITIALIZED;
    }

    private byte strictTransactionReplayProtectionEnabledBuildStage = STAGE_UNINITIALIZED;
    private Boolean strictTransactionReplayProtectionEnabled;

    Boolean getStrictTransactionReplayProtectionEnabled() {
      if (strictTransactionReplayProtectionEnabledBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (strictTransactionReplayProtectionEnabledBuildStage == STAGE_UNINITIALIZED) {
        strictTransactionReplayProtectionEnabledBuildStage = STAGE_INITIALIZING;
        this.strictTransactionReplayProtectionEnabled = Objects.requireNonNull(getStrictTransactionReplayProtectionEnabledInitialize(), "strictTransactionReplayProtectionEnabled");
        strictTransactionReplayProtectionEnabledBuildStage = STAGE_INITIALIZED;
      }
      return this.strictTransactionReplayProtectionEnabled;
    }

    void strictTransactionReplayProtectionEnabled(Boolean strictTransactionReplayProtectionEnabled) {
      this.strictTransactionReplayProtectionEnabled = strictTransactionReplayProtectionEnabled;
      strictTransactionReplayProtectionEnabledBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (txPoolMaxSizeBuildStage == STAGE_INITIALIZING) attributes.add("txPoolMaxSize");
      if (txPoolLimitByAccountPercentageBuildStage == STAGE_INITIALIZING) attributes.add("txPoolLimitByAccountPercentage");
      if (txPoolMaxFutureTransactionByAccountBuildStage == STAGE_INITIALIZING) attributes.add("txPoolMaxFutureTransactionByAccount");
      if (pendingTxRetentionPeriodBuildStage == STAGE_INITIALIZING) attributes.add("pendingTxRetentionPeriod");
      if (txMessageKeepAliveSecondsBuildStage == STAGE_INITIALIZING) attributes.add("txMessageKeepAliveSeconds");
      if (priceBumpBuildStage == STAGE_INITIALIZING) attributes.add("priceBump");
      if (eth65TrxAnnouncedBufferingPeriodBuildStage == STAGE_INITIALIZING) attributes.add("eth65TrxAnnouncedBufferingPeriod");
      if (txFeeCapBuildStage == STAGE_INITIALIZING) attributes.add("txFeeCap");
      if (strictTransactionReplayProtectionEnabledBuildStage == STAGE_INITIALIZING) attributes.add("strictTransactionReplayProtectionEnabled");
      return "Cannot build TransactionPoolConfiguration, attribute initializers form cycle " + attributes;
    }
  }

  private int getTxPoolMaxSizeInitialize() {
    return TransactionPoolConfiguration.super.getTxPoolMaxSize();
  }

  private float getTxPoolLimitByAccountPercentageInitialize() {
    return TransactionPoolConfiguration.super.getTxPoolLimitByAccountPercentage();
  }

  private int getTxPoolMaxFutureTransactionByAccountInitialize() {
    return TransactionPoolConfiguration.super.getTxPoolMaxFutureTransactionByAccount();
  }

  private int getPendingTxRetentionPeriodInitialize() {
    return TransactionPoolConfiguration.super.getPendingTxRetentionPeriod();
  }

  private int getTxMessageKeepAliveSecondsInitialize() {
    return TransactionPoolConfiguration.super.getTxMessageKeepAliveSeconds();
  }

  private Percentage getPriceBumpInitialize() {
    return TransactionPoolConfiguration.super.getPriceBump();
  }

  private Duration getEth65TrxAnnouncedBufferingPeriodInitialize() {
    return TransactionPoolConfiguration.super.getEth65TrxAnnouncedBufferingPeriod();
  }

  private Wei getTxFeeCapInitialize() {
    return TransactionPoolConfiguration.super.getTxFeeCap();
  }

  private Boolean getStrictTransactionReplayProtectionEnabledInitialize() {
    return TransactionPoolConfiguration.super.getStrictTransactionReplayProtectionEnabled();
  }

  /**
   * @return The value of the {@code txPoolMaxSize} attribute
   */
  @Override
  public int getTxPoolMaxSize() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getTxPoolMaxSize()
        : this.txPoolMaxSize;
  }

  /**
   * @return The value of the {@code txPoolLimitByAccountPercentage} attribute
   */
  @Override
  public float getTxPoolLimitByAccountPercentage() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getTxPoolLimitByAccountPercentage()
        : this.txPoolLimitByAccountPercentage;
  }

  /**
   * @return The computed-at-construction value of the {@code txPoolMaxFutureTransactionByAccount} attribute
   */
  @Override
  public int getTxPoolMaxFutureTransactionByAccount() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getTxPoolMaxFutureTransactionByAccount()
        : this.txPoolMaxFutureTransactionByAccount;
  }

  /**
   * @return The value of the {@code pendingTxRetentionPeriod} attribute
   */
  @Override
  public int getPendingTxRetentionPeriod() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getPendingTxRetentionPeriod()
        : this.pendingTxRetentionPeriod;
  }

  /**
   * @return The value of the {@code txMessageKeepAliveSeconds} attribute
   */
  @Override
  public int getTxMessageKeepAliveSeconds() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getTxMessageKeepAliveSeconds()
        : this.txMessageKeepAliveSeconds;
  }

  /**
   * @return The value of the {@code priceBump} attribute
   */
  @Override
  public Percentage getPriceBump() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getPriceBump()
        : this.priceBump;
  }

  /**
   * @return The value of the {@code eth65TrxAnnouncedBufferingPeriod} attribute
   */
  @Override
  public Duration getEth65TrxAnnouncedBufferingPeriod() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getEth65TrxAnnouncedBufferingPeriod()
        : this.eth65TrxAnnouncedBufferingPeriod;
  }

  /**
   * @return The value of the {@code txFeeCap} attribute
   */
  @Override
  public Wei getTxFeeCap() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getTxFeeCap()
        : this.txFeeCap;
  }

  /**
   * @return The value of the {@code strictTransactionReplayProtectionEnabled} attribute
   */
  @Override
  public Boolean getStrictTransactionReplayProtectionEnabled() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getStrictTransactionReplayProtectionEnabled()
        : this.strictTransactionReplayProtectionEnabled;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionPoolConfiguration#getTxPoolMaxSize() txPoolMaxSize} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for txPoolMaxSize
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPoolConfiguration withTxPoolMaxSize(int value) {
    if (this.txPoolMaxSize == value) return this;
    return new ImmutableTransactionPoolConfiguration(
        this,
        value,
        this.txPoolLimitByAccountPercentage,
        this.pendingTxRetentionPeriod,
        this.txMessageKeepAliveSeconds,
        this.priceBump,
        this.eth65TrxAnnouncedBufferingPeriod,
        this.txFeeCap,
        this.strictTransactionReplayProtectionEnabled);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionPoolConfiguration#getTxPoolLimitByAccountPercentage() txPoolLimitByAccountPercentage} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for txPoolLimitByAccountPercentage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPoolConfiguration withTxPoolLimitByAccountPercentage(float value) {
    if (Float.floatToIntBits(this.txPoolLimitByAccountPercentage) == Float.floatToIntBits(value)) return this;
    return new ImmutableTransactionPoolConfiguration(
        this,
        this.txPoolMaxSize,
        value,
        this.pendingTxRetentionPeriod,
        this.txMessageKeepAliveSeconds,
        this.priceBump,
        this.eth65TrxAnnouncedBufferingPeriod,
        this.txFeeCap,
        this.strictTransactionReplayProtectionEnabled);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionPoolConfiguration#getPendingTxRetentionPeriod() pendingTxRetentionPeriod} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pendingTxRetentionPeriod
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPoolConfiguration withPendingTxRetentionPeriod(int value) {
    if (this.pendingTxRetentionPeriod == value) return this;
    return new ImmutableTransactionPoolConfiguration(
        this,
        this.txPoolMaxSize,
        this.txPoolLimitByAccountPercentage,
        value,
        this.txMessageKeepAliveSeconds,
        this.priceBump,
        this.eth65TrxAnnouncedBufferingPeriod,
        this.txFeeCap,
        this.strictTransactionReplayProtectionEnabled);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionPoolConfiguration#getTxMessageKeepAliveSeconds() txMessageKeepAliveSeconds} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for txMessageKeepAliveSeconds
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPoolConfiguration withTxMessageKeepAliveSeconds(int value) {
    if (this.txMessageKeepAliveSeconds == value) return this;
    return new ImmutableTransactionPoolConfiguration(
        this,
        this.txPoolMaxSize,
        this.txPoolLimitByAccountPercentage,
        this.pendingTxRetentionPeriod,
        value,
        this.priceBump,
        this.eth65TrxAnnouncedBufferingPeriod,
        this.txFeeCap,
        this.strictTransactionReplayProtectionEnabled);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionPoolConfiguration#getPriceBump() priceBump} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for priceBump
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPoolConfiguration withPriceBump(Percentage value) {
    if (this.priceBump == value) return this;
    Percentage newValue = Objects.requireNonNull(value, "priceBump");
    return new ImmutableTransactionPoolConfiguration(
        this,
        this.txPoolMaxSize,
        this.txPoolLimitByAccountPercentage,
        this.pendingTxRetentionPeriod,
        this.txMessageKeepAliveSeconds,
        newValue,
        this.eth65TrxAnnouncedBufferingPeriod,
        this.txFeeCap,
        this.strictTransactionReplayProtectionEnabled);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionPoolConfiguration#getEth65TrxAnnouncedBufferingPeriod() eth65TrxAnnouncedBufferingPeriod} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for eth65TrxAnnouncedBufferingPeriod
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPoolConfiguration withEth65TrxAnnouncedBufferingPeriod(Duration value) {
    if (this.eth65TrxAnnouncedBufferingPeriod == value) return this;
    Duration newValue = Objects.requireNonNull(value, "eth65TrxAnnouncedBufferingPeriod");
    return new ImmutableTransactionPoolConfiguration(
        this,
        this.txPoolMaxSize,
        this.txPoolLimitByAccountPercentage,
        this.pendingTxRetentionPeriod,
        this.txMessageKeepAliveSeconds,
        this.priceBump,
        newValue,
        this.txFeeCap,
        this.strictTransactionReplayProtectionEnabled);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionPoolConfiguration#getTxFeeCap() txFeeCap} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for txFeeCap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPoolConfiguration withTxFeeCap(Wei value) {
    if (this.txFeeCap == value) return this;
    Wei newValue = Objects.requireNonNull(value, "txFeeCap");
    return new ImmutableTransactionPoolConfiguration(
        this,
        this.txPoolMaxSize,
        this.txPoolLimitByAccountPercentage,
        this.pendingTxRetentionPeriod,
        this.txMessageKeepAliveSeconds,
        this.priceBump,
        this.eth65TrxAnnouncedBufferingPeriod,
        newValue,
        this.strictTransactionReplayProtectionEnabled);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionPoolConfiguration#getStrictTransactionReplayProtectionEnabled() strictTransactionReplayProtectionEnabled} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for strictTransactionReplayProtectionEnabled
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPoolConfiguration withStrictTransactionReplayProtectionEnabled(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "strictTransactionReplayProtectionEnabled");
    if (this.strictTransactionReplayProtectionEnabled.equals(newValue)) return this;
    return new ImmutableTransactionPoolConfiguration(
        this,
        this.txPoolMaxSize,
        this.txPoolLimitByAccountPercentage,
        this.pendingTxRetentionPeriod,
        this.txMessageKeepAliveSeconds,
        this.priceBump,
        this.eth65TrxAnnouncedBufferingPeriod,
        this.txFeeCap,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionPoolConfiguration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionPoolConfiguration
        && equalTo(0, (ImmutableTransactionPoolConfiguration) another);
  }

  private boolean equalTo(int synthetic, ImmutableTransactionPoolConfiguration another) {
    return txPoolMaxSize == another.txPoolMaxSize
        && Float.floatToIntBits(txPoolLimitByAccountPercentage) == Float.floatToIntBits(another.txPoolLimitByAccountPercentage)
        && txPoolMaxFutureTransactionByAccount == another.txPoolMaxFutureTransactionByAccount
        && pendingTxRetentionPeriod == another.pendingTxRetentionPeriod
        && txMessageKeepAliveSeconds == another.txMessageKeepAliveSeconds
        && priceBump.equals(another.priceBump)
        && eth65TrxAnnouncedBufferingPeriod.equals(another.eth65TrxAnnouncedBufferingPeriod)
        && txFeeCap.equals(another.txFeeCap)
        && strictTransactionReplayProtectionEnabled.equals(another.strictTransactionReplayProtectionEnabled);
  }

  /**
   * Computes a hash code from attributes: {@code txPoolMaxSize}, {@code txPoolLimitByAccountPercentage}, {@code txPoolMaxFutureTransactionByAccount}, {@code pendingTxRetentionPeriod}, {@code txMessageKeepAliveSeconds}, {@code priceBump}, {@code eth65TrxAnnouncedBufferingPeriod}, {@code txFeeCap}, {@code strictTransactionReplayProtectionEnabled}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + txPoolMaxSize;
    h += (h << 5) + Floats.hashCode(txPoolLimitByAccountPercentage);
    h += (h << 5) + txPoolMaxFutureTransactionByAccount;
    h += (h << 5) + pendingTxRetentionPeriod;
    h += (h << 5) + txMessageKeepAliveSeconds;
    h += (h << 5) + priceBump.hashCode();
    h += (h << 5) + eth65TrxAnnouncedBufferingPeriod.hashCode();
    h += (h << 5) + txFeeCap.hashCode();
    h += (h << 5) + strictTransactionReplayProtectionEnabled.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionPoolConfiguration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionPoolConfiguration")
        .omitNullValues()
        .add("txPoolMaxSize", txPoolMaxSize)
        .add("txPoolLimitByAccountPercentage", txPoolLimitByAccountPercentage)
        .add("txPoolMaxFutureTransactionByAccount", txPoolMaxFutureTransactionByAccount)
        .add("pendingTxRetentionPeriod", pendingTxRetentionPeriod)
        .add("txMessageKeepAliveSeconds", txMessageKeepAliveSeconds)
        .add("priceBump", priceBump)
        .add("eth65TrxAnnouncedBufferingPeriod", eth65TrxAnnouncedBufferingPeriod)
        .add("txFeeCap", txFeeCap)
        .add("strictTransactionReplayProtectionEnabled", strictTransactionReplayProtectionEnabled)
        .toString();
  }

  /**
   * Construct a new immutable {@code TransactionPoolConfiguration} instance.
   * @param txPoolMaxSize The value for the {@code txPoolMaxSize} attribute
   * @param txPoolLimitByAccountPercentage The value for the {@code txPoolLimitByAccountPercentage} attribute
   * @param pendingTxRetentionPeriod The value for the {@code pendingTxRetentionPeriod} attribute
   * @param txMessageKeepAliveSeconds The value for the {@code txMessageKeepAliveSeconds} attribute
   * @param priceBump The value for the {@code priceBump} attribute
   * @param eth65TrxAnnouncedBufferingPeriod The value for the {@code eth65TrxAnnouncedBufferingPeriod} attribute
   * @param txFeeCap The value for the {@code txFeeCap} attribute
   * @param strictTransactionReplayProtectionEnabled The value for the {@code strictTransactionReplayProtectionEnabled} attribute
   * @return An immutable TransactionPoolConfiguration instance
   */
  public static ImmutableTransactionPoolConfiguration of(int txPoolMaxSize, float txPoolLimitByAccountPercentage, int pendingTxRetentionPeriod, int txMessageKeepAliveSeconds, Percentage priceBump, Duration eth65TrxAnnouncedBufferingPeriod, Wei txFeeCap, Boolean strictTransactionReplayProtectionEnabled) {
    return new ImmutableTransactionPoolConfiguration(txPoolMaxSize, txPoolLimitByAccountPercentage, pendingTxRetentionPeriod, txMessageKeepAliveSeconds, priceBump, eth65TrxAnnouncedBufferingPeriod, txFeeCap, strictTransactionReplayProtectionEnabled);
  }

  /**
   * Creates an immutable copy of a {@link TransactionPoolConfiguration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionPoolConfiguration instance
   */
  public static ImmutableTransactionPoolConfiguration copyOf(TransactionPoolConfiguration instance) {
    if (instance instanceof ImmutableTransactionPoolConfiguration) {
      return (ImmutableTransactionPoolConfiguration) instance;
    }
    return ImmutableTransactionPoolConfiguration.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionPoolConfiguration ImmutableTransactionPoolConfiguration}.
   * <pre>
   * ImmutableTransactionPoolConfiguration.builder()
   *    .txPoolMaxSize(int) // optional {@link TransactionPoolConfiguration#getTxPoolMaxSize() txPoolMaxSize}
   *    .txPoolLimitByAccountPercentage(float) // optional {@link TransactionPoolConfiguration#getTxPoolLimitByAccountPercentage() txPoolLimitByAccountPercentage}
   *    .pendingTxRetentionPeriod(int) // optional {@link TransactionPoolConfiguration#getPendingTxRetentionPeriod() pendingTxRetentionPeriod}
   *    .txMessageKeepAliveSeconds(int) // optional {@link TransactionPoolConfiguration#getTxMessageKeepAliveSeconds() txMessageKeepAliveSeconds}
   *    .priceBump(org.hyperledger.besu.util.number.Percentage) // optional {@link TransactionPoolConfiguration#getPriceBump() priceBump}
   *    .eth65TrxAnnouncedBufferingPeriod(java.time.Duration) // optional {@link TransactionPoolConfiguration#getEth65TrxAnnouncedBufferingPeriod() eth65TrxAnnouncedBufferingPeriod}
   *    .txFeeCap(org.hyperledger.besu.datatypes.Wei) // optional {@link TransactionPoolConfiguration#getTxFeeCap() txFeeCap}
   *    .strictTransactionReplayProtectionEnabled(Boolean) // optional {@link TransactionPoolConfiguration#getStrictTransactionReplayProtectionEnabled() strictTransactionReplayProtectionEnabled}
   *    .build();
   * </pre>
   * @return A new ImmutableTransactionPoolConfiguration builder
   */
  public static ImmutableTransactionPoolConfiguration.Builder builder() {
    return new ImmutableTransactionPoolConfiguration.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionPoolConfiguration ImmutableTransactionPoolConfiguration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TransactionPoolConfiguration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TX_POOL_MAX_SIZE = 0x1L;
    private static final long OPT_BIT_TX_POOL_LIMIT_BY_ACCOUNT_PERCENTAGE = 0x2L;
    private static final long OPT_BIT_PENDING_TX_RETENTION_PERIOD = 0x4L;
    private static final long OPT_BIT_TX_MESSAGE_KEEP_ALIVE_SECONDS = 0x8L;
    private long optBits;

    private int txPoolMaxSize;
    private float txPoolLimitByAccountPercentage;
    private int pendingTxRetentionPeriod;
    private int txMessageKeepAliveSeconds;
    private @Nullable Percentage priceBump;
    private @Nullable Duration eth65TrxAnnouncedBufferingPeriod;
    private @Nullable Wei txFeeCap;
    private @Nullable Boolean strictTransactionReplayProtectionEnabled;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TransactionPoolConfiguration} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(TransactionPoolConfiguration instance) {
      Objects.requireNonNull(instance, "instance");
      txPoolMaxSize(instance.getTxPoolMaxSize());
      txPoolLimitByAccountPercentage(instance.getTxPoolLimitByAccountPercentage());
      pendingTxRetentionPeriod(instance.getPendingTxRetentionPeriod());
      txMessageKeepAliveSeconds(instance.getTxMessageKeepAliveSeconds());
      priceBump(instance.getPriceBump());
      eth65TrxAnnouncedBufferingPeriod(instance.getEth65TrxAnnouncedBufferingPeriod());
      txFeeCap(instance.getTxFeeCap());
      strictTransactionReplayProtectionEnabled(instance.getStrictTransactionReplayProtectionEnabled());
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionPoolConfiguration#getTxPoolMaxSize() txPoolMaxSize} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionPoolConfiguration#getTxPoolMaxSize() txPoolMaxSize}.</em>
     * @param txPoolMaxSize The value for txPoolMaxSize 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder txPoolMaxSize(int txPoolMaxSize) {
      this.txPoolMaxSize = txPoolMaxSize;
      optBits |= OPT_BIT_TX_POOL_MAX_SIZE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionPoolConfiguration#getTxPoolLimitByAccountPercentage() txPoolLimitByAccountPercentage} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionPoolConfiguration#getTxPoolLimitByAccountPercentage() txPoolLimitByAccountPercentage}.</em>
     * @param txPoolLimitByAccountPercentage The value for txPoolLimitByAccountPercentage 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder txPoolLimitByAccountPercentage(float txPoolLimitByAccountPercentage) {
      this.txPoolLimitByAccountPercentage = txPoolLimitByAccountPercentage;
      optBits |= OPT_BIT_TX_POOL_LIMIT_BY_ACCOUNT_PERCENTAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionPoolConfiguration#getPendingTxRetentionPeriod() pendingTxRetentionPeriod} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionPoolConfiguration#getPendingTxRetentionPeriod() pendingTxRetentionPeriod}.</em>
     * @param pendingTxRetentionPeriod The value for pendingTxRetentionPeriod 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder pendingTxRetentionPeriod(int pendingTxRetentionPeriod) {
      this.pendingTxRetentionPeriod = pendingTxRetentionPeriod;
      optBits |= OPT_BIT_PENDING_TX_RETENTION_PERIOD;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionPoolConfiguration#getTxMessageKeepAliveSeconds() txMessageKeepAliveSeconds} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionPoolConfiguration#getTxMessageKeepAliveSeconds() txMessageKeepAliveSeconds}.</em>
     * @param txMessageKeepAliveSeconds The value for txMessageKeepAliveSeconds 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder txMessageKeepAliveSeconds(int txMessageKeepAliveSeconds) {
      this.txMessageKeepAliveSeconds = txMessageKeepAliveSeconds;
      optBits |= OPT_BIT_TX_MESSAGE_KEEP_ALIVE_SECONDS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionPoolConfiguration#getPriceBump() priceBump} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionPoolConfiguration#getPriceBump() priceBump}.</em>
     * @param priceBump The value for priceBump 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder priceBump(Percentage priceBump) {
      this.priceBump = Objects.requireNonNull(priceBump, "priceBump");
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionPoolConfiguration#getEth65TrxAnnouncedBufferingPeriod() eth65TrxAnnouncedBufferingPeriod} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionPoolConfiguration#getEth65TrxAnnouncedBufferingPeriod() eth65TrxAnnouncedBufferingPeriod}.</em>
     * @param eth65TrxAnnouncedBufferingPeriod The value for eth65TrxAnnouncedBufferingPeriod 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder eth65TrxAnnouncedBufferingPeriod(Duration eth65TrxAnnouncedBufferingPeriod) {
      this.eth65TrxAnnouncedBufferingPeriod = Objects.requireNonNull(eth65TrxAnnouncedBufferingPeriod, "eth65TrxAnnouncedBufferingPeriod");
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionPoolConfiguration#getTxFeeCap() txFeeCap} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionPoolConfiguration#getTxFeeCap() txFeeCap}.</em>
     * @param txFeeCap The value for txFeeCap 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder txFeeCap(Wei txFeeCap) {
      this.txFeeCap = Objects.requireNonNull(txFeeCap, "txFeeCap");
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionPoolConfiguration#getStrictTransactionReplayProtectionEnabled() strictTransactionReplayProtectionEnabled} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionPoolConfiguration#getStrictTransactionReplayProtectionEnabled() strictTransactionReplayProtectionEnabled}.</em>
     * @param strictTransactionReplayProtectionEnabled The value for strictTransactionReplayProtectionEnabled 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder strictTransactionReplayProtectionEnabled(Boolean strictTransactionReplayProtectionEnabled) {
      this.strictTransactionReplayProtectionEnabled = Objects.requireNonNull(strictTransactionReplayProtectionEnabled, "strictTransactionReplayProtectionEnabled");
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionPoolConfiguration ImmutableTransactionPoolConfiguration}.
     * @return An immutable instance of TransactionPoolConfiguration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionPoolConfiguration build() {
      return new ImmutableTransactionPoolConfiguration(this);
    }

    private boolean txPoolMaxSizeIsSet() {
      return (optBits & OPT_BIT_TX_POOL_MAX_SIZE) != 0;
    }

    private boolean txPoolLimitByAccountPercentageIsSet() {
      return (optBits & OPT_BIT_TX_POOL_LIMIT_BY_ACCOUNT_PERCENTAGE) != 0;
    }

    private boolean pendingTxRetentionPeriodIsSet() {
      return (optBits & OPT_BIT_PENDING_TX_RETENTION_PERIOD) != 0;
    }

    private boolean txMessageKeepAliveSecondsIsSet() {
      return (optBits & OPT_BIT_TX_MESSAGE_KEEP_ALIVE_SECONDS) != 0;
    }
  }
}
