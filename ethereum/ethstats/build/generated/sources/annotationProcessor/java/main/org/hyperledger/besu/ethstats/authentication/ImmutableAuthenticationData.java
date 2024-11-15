package org.hyperledger.besu.ethstats.authentication;

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
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AuthenticationData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuthenticationData.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableAuthenticationData.of()}.
 */
@Generated(from = "AuthenticationData", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableAuthenticationData
    implements AuthenticationData {
  private final String id;
  private final NodeInfo info;
  private final String secret;

  private ImmutableAuthenticationData(
      String id,
      NodeInfo info,
      String secret) {
    this.id = Objects.requireNonNull(id, "id");
    this.info = Objects.requireNonNull(info, "info");
    this.secret = Objects.requireNonNull(secret, "secret");
  }

  private ImmutableAuthenticationData(
      ImmutableAuthenticationData original,
      String id,
      NodeInfo info,
      String secret) {
    this.id = id;
    this.info = info;
    this.secret = secret;
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
   * @return The value of the {@code info} attribute
   */
  @JsonProperty("info")
  @Override
  public NodeInfo getInfo() {
    return info;
  }

  /**
   * @return The value of the {@code secret} attribute
   */
  @JsonProperty("secret")
  @Override
  public String getSecret() {
    return secret;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthenticationData#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthenticationData withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableAuthenticationData(this, newValue, this.info, this.secret);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthenticationData#getInfo() info} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for info
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthenticationData withInfo(NodeInfo value) {
    if (this.info == value) return this;
    NodeInfo newValue = Objects.requireNonNull(value, "info");
    return new ImmutableAuthenticationData(this, this.id, newValue, this.secret);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthenticationData#getSecret() secret} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for secret
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthenticationData withSecret(String value) {
    String newValue = Objects.requireNonNull(value, "secret");
    if (this.secret.equals(newValue)) return this;
    return new ImmutableAuthenticationData(this, this.id, this.info, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuthenticationData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthenticationData
        && equalTo(0, (ImmutableAuthenticationData) another);
  }

  private boolean equalTo(int synthetic, ImmutableAuthenticationData another) {
    return id.equals(another.id)
        && info.equals(another.info)
        && secret.equals(another.secret);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code info}, {@code secret}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + info.hashCode();
    h += (h << 5) + secret.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AuthenticationData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AuthenticationData")
        .omitNullValues()
        .add("id", id)
        .add("info", info)
        .add("secret", secret)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AuthenticationData", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AuthenticationData {
    @Nullable String id;
    @Nullable NodeInfo info;
    @Nullable String secret;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("info")
    public void setInfo(NodeInfo info) {
      this.info = info;
    }
    @JsonProperty("secret")
    public void setSecret(String secret) {
      this.secret = secret;
    }
    @Override
    public String getId() { throw new UnsupportedOperationException(); }
    @Override
    public NodeInfo getInfo() { throw new UnsupportedOperationException(); }
    @Override
    public String getSecret() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAuthenticationData fromJson(Json json) {
    ImmutableAuthenticationData.Builder builder = ImmutableAuthenticationData.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.info != null) {
      builder.info(json.info);
    }
    if (json.secret != null) {
      builder.secret(json.secret);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code AuthenticationData} instance.
   * @param id The value for the {@code id} attribute
   * @param info The value for the {@code info} attribute
   * @param secret The value for the {@code secret} attribute
   * @return An immutable AuthenticationData instance
   */
  public static ImmutableAuthenticationData of(String id, NodeInfo info, String secret) {
    return new ImmutableAuthenticationData(id, info, secret);
  }

  /**
   * Creates an immutable copy of a {@link AuthenticationData} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuthenticationData instance
   */
  public static ImmutableAuthenticationData copyOf(AuthenticationData instance) {
    if (instance instanceof ImmutableAuthenticationData) {
      return (ImmutableAuthenticationData) instance;
    }
    return ImmutableAuthenticationData.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAuthenticationData ImmutableAuthenticationData}.
   * <pre>
   * ImmutableAuthenticationData.builder()
   *    .id(String) // required {@link AuthenticationData#getId() id}
   *    .info(org.hyperledger.besu.ethstats.authentication.NodeInfo) // required {@link AuthenticationData#getInfo() info}
   *    .secret(String) // required {@link AuthenticationData#getSecret() secret}
   *    .build();
   * </pre>
   * @return A new ImmutableAuthenticationData builder
   */
  public static ImmutableAuthenticationData.Builder builder() {
    return new ImmutableAuthenticationData.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAuthenticationData ImmutableAuthenticationData}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AuthenticationData", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_INFO = 0x2L;
    private static final long INIT_BIT_SECRET = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String id;
    private @Nullable NodeInfo info;
    private @Nullable String secret;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AuthenticationData} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(AuthenticationData instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      info(instance.getInfo());
      secret(instance.getSecret());
      return this;
    }

    /**
     * Initializes the value for the {@link AuthenticationData#getId() id} attribute.
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
     * Initializes the value for the {@link AuthenticationData#getInfo() info} attribute.
     * @param info The value for info 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("info")
    public final Builder info(NodeInfo info) {
      this.info = Objects.requireNonNull(info, "info");
      initBits &= ~INIT_BIT_INFO;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthenticationData#getSecret() secret} attribute.
     * @param secret The value for secret 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("secret")
    public final Builder secret(String secret) {
      this.secret = Objects.requireNonNull(secret, "secret");
      initBits &= ~INIT_BIT_SECRET;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAuthenticationData ImmutableAuthenticationData}.
     * @return An immutable instance of AuthenticationData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAuthenticationData build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuthenticationData(null, id, info, secret);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_INFO) != 0) attributes.add("info");
      if ((initBits & INIT_BIT_SECRET) != 0) attributes.add("secret");
      return "Cannot build AuthenticationData, some of required attributes are not set " + attributes;
    }
  }
}
