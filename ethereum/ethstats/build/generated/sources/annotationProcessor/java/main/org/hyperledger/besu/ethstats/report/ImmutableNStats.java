package org.hyperledger.besu.ethstats.report;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Longs;
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
 * Immutable implementation of {@link NodeStatsReport.NStats}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNStats.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableNStats.of()}.
 */
@Generated(from = "NodeStatsReport.NStats", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableNStats implements NodeStatsReport.NStats {
  private final boolean isActive;
  private final boolean isMining;
  private final long hashrate;
  private final int peers;
  private final long gasPrice;
  private final boolean isSyncing;
  private final int upTime;

  private ImmutableNStats(
      boolean isActive,
      boolean isMining,
      long hashrate,
      int peers,
      long gasPrice,
      boolean isSyncing,
      int upTime) {
    this.isActive = isActive;
    this.isMining = isMining;
    this.hashrate = hashrate;
    this.peers = peers;
    this.gasPrice = gasPrice;
    this.isSyncing = isSyncing;
    this.upTime = upTime;
  }

  /**
   * @return The value of the {@code isActive} attribute
   */
  @JsonProperty("active")
  @Override
  public boolean isActive() {
    return isActive;
  }

  /**
   * @return The value of the {@code isMining} attribute
   */
  @JsonProperty("mining")
  @Override
  public boolean isMining() {
    return isMining;
  }

  /**
   * @return The value of the {@code hashrate} attribute
   */
  @JsonProperty("hashrate")
  @Override
  public long getHashrate() {
    return hashrate;
  }

  /**
   * @return The value of the {@code peers} attribute
   */
  @JsonProperty("peers")
  @Override
  public int getPeers() {
    return peers;
  }

  /**
   * @return The value of the {@code gasPrice} attribute
   */
  @JsonProperty("gasPrice")
  @Override
  public long getGasPrice() {
    return gasPrice;
  }

  /**
   * @return The value of the {@code isSyncing} attribute
   */
  @JsonProperty("syncing")
  @Override
  public boolean isSyncing() {
    return isSyncing;
  }

  /**
   * @return The value of the {@code upTime} attribute
   */
  @JsonProperty("uptime")
  @Override
  public int getUpTime() {
    return upTime;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeStatsReport.NStats#isActive() isActive} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isActive
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNStats withIsActive(boolean value) {
    if (this.isActive == value) return this;
    return new ImmutableNStats(value, this.isMining, this.hashrate, this.peers, this.gasPrice, this.isSyncing, this.upTime);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeStatsReport.NStats#isMining() isMining} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isMining
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNStats withIsMining(boolean value) {
    if (this.isMining == value) return this;
    return new ImmutableNStats(this.isActive, value, this.hashrate, this.peers, this.gasPrice, this.isSyncing, this.upTime);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeStatsReport.NStats#getHashrate() hashrate} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hashrate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNStats withHashrate(long value) {
    if (this.hashrate == value) return this;
    return new ImmutableNStats(this.isActive, this.isMining, value, this.peers, this.gasPrice, this.isSyncing, this.upTime);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeStatsReport.NStats#getPeers() peers} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for peers
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNStats withPeers(int value) {
    if (this.peers == value) return this;
    return new ImmutableNStats(this.isActive, this.isMining, this.hashrate, value, this.gasPrice, this.isSyncing, this.upTime);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeStatsReport.NStats#getGasPrice() gasPrice} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gasPrice
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNStats withGasPrice(long value) {
    if (this.gasPrice == value) return this;
    return new ImmutableNStats(this.isActive, this.isMining, this.hashrate, this.peers, value, this.isSyncing, this.upTime);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeStatsReport.NStats#isSyncing() isSyncing} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isSyncing
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNStats withIsSyncing(boolean value) {
    if (this.isSyncing == value) return this;
    return new ImmutableNStats(this.isActive, this.isMining, this.hashrate, this.peers, this.gasPrice, value, this.upTime);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeStatsReport.NStats#getUpTime() upTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for upTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNStats withUpTime(int value) {
    if (this.upTime == value) return this;
    return new ImmutableNStats(this.isActive, this.isMining, this.hashrate, this.peers, this.gasPrice, this.isSyncing, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNStats} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNStats
        && equalTo(0, (ImmutableNStats) another);
  }

  private boolean equalTo(int synthetic, ImmutableNStats another) {
    return isActive == another.isActive
        && isMining == another.isMining
        && hashrate == another.hashrate
        && peers == another.peers
        && gasPrice == another.gasPrice
        && isSyncing == another.isSyncing
        && upTime == another.upTime;
  }

  /**
   * Computes a hash code from attributes: {@code isActive}, {@code isMining}, {@code hashrate}, {@code peers}, {@code gasPrice}, {@code isSyncing}, {@code upTime}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Booleans.hashCode(isActive);
    h += (h << 5) + Booleans.hashCode(isMining);
    h += (h << 5) + Longs.hashCode(hashrate);
    h += (h << 5) + peers;
    h += (h << 5) + Longs.hashCode(gasPrice);
    h += (h << 5) + Booleans.hashCode(isSyncing);
    h += (h << 5) + upTime;
    return h;
  }

  /**
   * Prints the immutable value {@code NStats} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("NStats")
        .omitNullValues()
        .add("isActive", isActive)
        .add("isMining", isMining)
        .add("hashrate", hashrate)
        .add("peers", peers)
        .add("gasPrice", gasPrice)
        .add("isSyncing", isSyncing)
        .add("upTime", upTime)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "NodeStatsReport.NStats", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NodeStatsReport.NStats {
    boolean isActive;
    boolean isActiveIsSet;
    boolean isMining;
    boolean isMiningIsSet;
    long hashrate;
    boolean hashrateIsSet;
    int peers;
    boolean peersIsSet;
    long gasPrice;
    boolean gasPriceIsSet;
    boolean isSyncing;
    boolean isSyncingIsSet;
    int upTime;
    boolean upTimeIsSet;
    @JsonProperty("active")
    public void setIsActive(boolean isActive) {
      this.isActive = isActive;
      this.isActiveIsSet = true;
    }
    @JsonProperty("mining")
    public void setIsMining(boolean isMining) {
      this.isMining = isMining;
      this.isMiningIsSet = true;
    }
    @JsonProperty("hashrate")
    public void setHashrate(long hashrate) {
      this.hashrate = hashrate;
      this.hashrateIsSet = true;
    }
    @JsonProperty("peers")
    public void setPeers(int peers) {
      this.peers = peers;
      this.peersIsSet = true;
    }
    @JsonProperty("gasPrice")
    public void setGasPrice(long gasPrice) {
      this.gasPrice = gasPrice;
      this.gasPriceIsSet = true;
    }
    @JsonProperty("syncing")
    public void setIsSyncing(boolean isSyncing) {
      this.isSyncing = isSyncing;
      this.isSyncingIsSet = true;
    }
    @JsonProperty("uptime")
    public void setUpTime(int upTime) {
      this.upTime = upTime;
      this.upTimeIsSet = true;
    }
    @Override
    public boolean isActive() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isMining() { throw new UnsupportedOperationException(); }
    @Override
    public long getHashrate() { throw new UnsupportedOperationException(); }
    @Override
    public int getPeers() { throw new UnsupportedOperationException(); }
    @Override
    public long getGasPrice() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isSyncing() { throw new UnsupportedOperationException(); }
    @Override
    public int getUpTime() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNStats fromJson(Json json) {
    ImmutableNStats.Builder builder = ImmutableNStats.builder();
    if (json.isActiveIsSet) {
      builder.isActive(json.isActive);
    }
    if (json.isMiningIsSet) {
      builder.isMining(json.isMining);
    }
    if (json.hashrateIsSet) {
      builder.hashrate(json.hashrate);
    }
    if (json.peersIsSet) {
      builder.peers(json.peers);
    }
    if (json.gasPriceIsSet) {
      builder.gasPrice(json.gasPrice);
    }
    if (json.isSyncingIsSet) {
      builder.isSyncing(json.isSyncing);
    }
    if (json.upTimeIsSet) {
      builder.upTime(json.upTime);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code NStats} instance.
   * @param isActive The value for the {@code isActive} attribute
   * @param isMining The value for the {@code isMining} attribute
   * @param hashrate The value for the {@code hashrate} attribute
   * @param peers The value for the {@code peers} attribute
   * @param gasPrice The value for the {@code gasPrice} attribute
   * @param isSyncing The value for the {@code isSyncing} attribute
   * @param upTime The value for the {@code upTime} attribute
   * @return An immutable NStats instance
   */
  public static ImmutableNStats of(boolean isActive, boolean isMining, long hashrate, int peers, long gasPrice, boolean isSyncing, int upTime) {
    return new ImmutableNStats(isActive, isMining, hashrate, peers, gasPrice, isSyncing, upTime);
  }

  /**
   * Creates an immutable copy of a {@link NodeStatsReport.NStats} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NStats instance
   */
  public static ImmutableNStats copyOf(NodeStatsReport.NStats instance) {
    if (instance instanceof ImmutableNStats) {
      return (ImmutableNStats) instance;
    }
    return ImmutableNStats.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableNStats ImmutableNStats}.
   * <pre>
   * ImmutableNStats.builder()
   *    .isActive(boolean) // required {@link NodeStatsReport.NStats#isActive() isActive}
   *    .isMining(boolean) // required {@link NodeStatsReport.NStats#isMining() isMining}
   *    .hashrate(long) // required {@link NodeStatsReport.NStats#getHashrate() hashrate}
   *    .peers(int) // required {@link NodeStatsReport.NStats#getPeers() peers}
   *    .gasPrice(long) // required {@link NodeStatsReport.NStats#getGasPrice() gasPrice}
   *    .isSyncing(boolean) // required {@link NodeStatsReport.NStats#isSyncing() isSyncing}
   *    .upTime(int) // required {@link NodeStatsReport.NStats#getUpTime() upTime}
   *    .build();
   * </pre>
   * @return A new ImmutableNStats builder
   */
  public static ImmutableNStats.Builder builder() {
    return new ImmutableNStats.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableNStats ImmutableNStats}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NodeStatsReport.NStats", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_IS_ACTIVE = 0x1L;
    private static final long INIT_BIT_IS_MINING = 0x2L;
    private static final long INIT_BIT_HASHRATE = 0x4L;
    private static final long INIT_BIT_PEERS = 0x8L;
    private static final long INIT_BIT_GAS_PRICE = 0x10L;
    private static final long INIT_BIT_IS_SYNCING = 0x20L;
    private static final long INIT_BIT_UP_TIME = 0x40L;
    private long initBits = 0x7fL;

    private boolean isActive;
    private boolean isMining;
    private long hashrate;
    private int peers;
    private long gasPrice;
    private boolean isSyncing;
    private int upTime;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code NStats} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(NodeStatsReport.NStats instance) {
      Objects.requireNonNull(instance, "instance");
      isActive(instance.isActive());
      isMining(instance.isMining());
      hashrate(instance.getHashrate());
      peers(instance.getPeers());
      gasPrice(instance.getGasPrice());
      isSyncing(instance.isSyncing());
      upTime(instance.getUpTime());
      return this;
    }

    /**
     * Initializes the value for the {@link NodeStatsReport.NStats#isActive() isActive} attribute.
     * @param isActive The value for isActive 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("active")
    public final Builder isActive(boolean isActive) {
      this.isActive = isActive;
      initBits &= ~INIT_BIT_IS_ACTIVE;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeStatsReport.NStats#isMining() isMining} attribute.
     * @param isMining The value for isMining 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("mining")
    public final Builder isMining(boolean isMining) {
      this.isMining = isMining;
      initBits &= ~INIT_BIT_IS_MINING;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeStatsReport.NStats#getHashrate() hashrate} attribute.
     * @param hashrate The value for hashrate 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("hashrate")
    public final Builder hashrate(long hashrate) {
      this.hashrate = hashrate;
      initBits &= ~INIT_BIT_HASHRATE;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeStatsReport.NStats#getPeers() peers} attribute.
     * @param peers The value for peers 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("peers")
    public final Builder peers(int peers) {
      this.peers = peers;
      initBits &= ~INIT_BIT_PEERS;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeStatsReport.NStats#getGasPrice() gasPrice} attribute.
     * @param gasPrice The value for gasPrice 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("gasPrice")
    public final Builder gasPrice(long gasPrice) {
      this.gasPrice = gasPrice;
      initBits &= ~INIT_BIT_GAS_PRICE;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeStatsReport.NStats#isSyncing() isSyncing} attribute.
     * @param isSyncing The value for isSyncing 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("syncing")
    public final Builder isSyncing(boolean isSyncing) {
      this.isSyncing = isSyncing;
      initBits &= ~INIT_BIT_IS_SYNCING;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeStatsReport.NStats#getUpTime() upTime} attribute.
     * @param upTime The value for upTime 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("uptime")
    public final Builder upTime(int upTime) {
      this.upTime = upTime;
      initBits &= ~INIT_BIT_UP_TIME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableNStats ImmutableNStats}.
     * @return An immutable instance of NStats
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNStats build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableNStats(isActive, isMining, hashrate, peers, gasPrice, isSyncing, upTime);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_IS_ACTIVE) != 0) attributes.add("isActive");
      if ((initBits & INIT_BIT_IS_MINING) != 0) attributes.add("isMining");
      if ((initBits & INIT_BIT_HASHRATE) != 0) attributes.add("hashrate");
      if ((initBits & INIT_BIT_PEERS) != 0) attributes.add("peers");
      if ((initBits & INIT_BIT_GAS_PRICE) != 0) attributes.add("gasPrice");
      if ((initBits & INIT_BIT_IS_SYNCING) != 0) attributes.add("isSyncing");
      if ((initBits & INIT_BIT_UP_TIME) != 0) attributes.add("upTime");
      return "Cannot build NStats, some of required attributes are not set " + attributes;
    }
  }
}
