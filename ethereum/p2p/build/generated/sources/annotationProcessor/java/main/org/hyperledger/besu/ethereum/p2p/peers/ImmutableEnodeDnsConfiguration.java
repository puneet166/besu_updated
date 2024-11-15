package org.hyperledger.besu.ethereum.p2p.peers;

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
 * Immutable implementation of {@link EnodeDnsConfiguration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEnodeDnsConfiguration.builder()}.
 */
@Generated(from = "EnodeDnsConfiguration", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableEnodeDnsConfiguration
    implements EnodeDnsConfiguration {
  private final boolean dnsEnabled;
  private final boolean updateEnabled;

  private ImmutableEnodeDnsConfiguration(boolean dnsEnabled, boolean updateEnabled) {
    this.dnsEnabled = dnsEnabled;
    this.updateEnabled = updateEnabled;
  }

  /**
   * @return The value of the {@code dnsEnabled} attribute
   */
  @Override
  public boolean dnsEnabled() {
    return dnsEnabled;
  }

  /**
   * @return The value of the {@code updateEnabled} attribute
   */
  @Override
  public boolean updateEnabled() {
    return updateEnabled;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnodeDnsConfiguration#dnsEnabled() dnsEnabled} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dnsEnabled
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnodeDnsConfiguration withDnsEnabled(boolean value) {
    if (this.dnsEnabled == value) return this;
    return new ImmutableEnodeDnsConfiguration(value, this.updateEnabled);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnodeDnsConfiguration#updateEnabled() updateEnabled} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for updateEnabled
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnodeDnsConfiguration withUpdateEnabled(boolean value) {
    if (this.updateEnabled == value) return this;
    return new ImmutableEnodeDnsConfiguration(this.dnsEnabled, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEnodeDnsConfiguration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEnodeDnsConfiguration
        && equalTo(0, (ImmutableEnodeDnsConfiguration) another);
  }

  private boolean equalTo(int synthetic, ImmutableEnodeDnsConfiguration another) {
    return dnsEnabled == another.dnsEnabled
        && updateEnabled == another.updateEnabled;
  }

  /**
   * Computes a hash code from attributes: {@code dnsEnabled}, {@code updateEnabled}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Booleans.hashCode(dnsEnabled);
    h += (h << 5) + Booleans.hashCode(updateEnabled);
    return h;
  }

  /**
   * Prints the immutable value {@code EnodeDnsConfiguration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("EnodeDnsConfiguration")
        .omitNullValues()
        .add("dnsEnabled", dnsEnabled)
        .add("updateEnabled", updateEnabled)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link EnodeDnsConfiguration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EnodeDnsConfiguration instance
   */
  public static ImmutableEnodeDnsConfiguration copyOf(EnodeDnsConfiguration instance) {
    if (instance instanceof ImmutableEnodeDnsConfiguration) {
      return (ImmutableEnodeDnsConfiguration) instance;
    }
    return ImmutableEnodeDnsConfiguration.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEnodeDnsConfiguration ImmutableEnodeDnsConfiguration}.
   * <pre>
   * ImmutableEnodeDnsConfiguration.builder()
   *    .dnsEnabled(boolean) // required {@link EnodeDnsConfiguration#dnsEnabled() dnsEnabled}
   *    .updateEnabled(boolean) // required {@link EnodeDnsConfiguration#updateEnabled() updateEnabled}
   *    .build();
   * </pre>
   * @return A new ImmutableEnodeDnsConfiguration builder
   */
  public static ImmutableEnodeDnsConfiguration.Builder builder() {
    return new ImmutableEnodeDnsConfiguration.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEnodeDnsConfiguration ImmutableEnodeDnsConfiguration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EnodeDnsConfiguration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DNS_ENABLED = 0x1L;
    private static final long INIT_BIT_UPDATE_ENABLED = 0x2L;
    private long initBits = 0x3L;

    private boolean dnsEnabled;
    private boolean updateEnabled;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EnodeDnsConfiguration} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(EnodeDnsConfiguration instance) {
      Objects.requireNonNull(instance, "instance");
      dnsEnabled(instance.dnsEnabled());
      updateEnabled(instance.updateEnabled());
      return this;
    }

    /**
     * Initializes the value for the {@link EnodeDnsConfiguration#dnsEnabled() dnsEnabled} attribute.
     * @param dnsEnabled The value for dnsEnabled 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder dnsEnabled(boolean dnsEnabled) {
      this.dnsEnabled = dnsEnabled;
      initBits &= ~INIT_BIT_DNS_ENABLED;
      return this;
    }

    /**
     * Initializes the value for the {@link EnodeDnsConfiguration#updateEnabled() updateEnabled} attribute.
     * @param updateEnabled The value for updateEnabled 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder updateEnabled(boolean updateEnabled) {
      this.updateEnabled = updateEnabled;
      initBits &= ~INIT_BIT_UPDATE_ENABLED;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEnodeDnsConfiguration ImmutableEnodeDnsConfiguration}.
     * @return An immutable instance of EnodeDnsConfiguration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEnodeDnsConfiguration build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEnodeDnsConfiguration(dnsEnabled, updateEnabled);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_DNS_ENABLED) != 0) attributes.add("dnsEnabled");
      if ((initBits & INIT_BIT_UPDATE_ENABLED) != 0) attributes.add("updateEnabled");
      return "Cannot build EnodeDnsConfiguration, some of required attributes are not set " + attributes;
    }
  }
}
