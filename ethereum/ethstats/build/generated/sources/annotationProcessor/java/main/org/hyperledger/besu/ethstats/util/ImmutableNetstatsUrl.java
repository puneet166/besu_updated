package org.hyperledger.besu.ethstats.util;

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
 * Immutable implementation of {@link NetstatsUrl}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNetstatsUrl.builder()}.
 */
@Generated(from = "NetstatsUrl", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableNetstatsUrl implements NetstatsUrl {
  private final String nodeName;
  private final String secret;
  private final String host;
  private final Integer port;
  private final String contact;

  private ImmutableNetstatsUrl(
      String nodeName,
      String secret,
      String host,
      Integer port,
      String contact) {
    this.nodeName = nodeName;
    this.secret = secret;
    this.host = host;
    this.port = port;
    this.contact = contact;
  }

  /**
   * @return The value of the {@code nodeName} attribute
   */
  @Override
  public String getNodeName() {
    return nodeName;
  }

  /**
   * @return The value of the {@code secret} attribute
   */
  @Override
  public String getSecret() {
    return secret;
  }

  /**
   * @return The value of the {@code host} attribute
   */
  @Override
  public String getHost() {
    return host;
  }

  /**
   * @return The value of the {@code port} attribute
   */
  @Override
  public Integer getPort() {
    return port;
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @Override
  public String getContact() {
    return contact;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NetstatsUrl#getNodeName() nodeName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nodeName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNetstatsUrl withNodeName(String value) {
    String newValue = Objects.requireNonNull(value, "nodeName");
    if (this.nodeName.equals(newValue)) return this;
    return new ImmutableNetstatsUrl(newValue, this.secret, this.host, this.port, this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NetstatsUrl#getSecret() secret} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for secret
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNetstatsUrl withSecret(String value) {
    String newValue = Objects.requireNonNull(value, "secret");
    if (this.secret.equals(newValue)) return this;
    return new ImmutableNetstatsUrl(this.nodeName, newValue, this.host, this.port, this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NetstatsUrl#getHost() host} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for host
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNetstatsUrl withHost(String value) {
    String newValue = Objects.requireNonNull(value, "host");
    if (this.host.equals(newValue)) return this;
    return new ImmutableNetstatsUrl(this.nodeName, this.secret, newValue, this.port, this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NetstatsUrl#getPort() port} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNetstatsUrl withPort(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "port");
    if (this.port.equals(newValue)) return this;
    return new ImmutableNetstatsUrl(this.nodeName, this.secret, this.host, newValue, this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NetstatsUrl#getContact() contact} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for contact
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNetstatsUrl withContact(String value) {
    String newValue = Objects.requireNonNull(value, "contact");
    if (this.contact.equals(newValue)) return this;
    return new ImmutableNetstatsUrl(this.nodeName, this.secret, this.host, this.port, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNetstatsUrl} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNetstatsUrl
        && equalTo(0, (ImmutableNetstatsUrl) another);
  }

  private boolean equalTo(int synthetic, ImmutableNetstatsUrl another) {
    return nodeName.equals(another.nodeName)
        && secret.equals(another.secret)
        && host.equals(another.host)
        && port.equals(another.port)
        && contact.equals(another.contact);
  }

  /**
   * Computes a hash code from attributes: {@code nodeName}, {@code secret}, {@code host}, {@code port}, {@code contact}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + nodeName.hashCode();
    h += (h << 5) + secret.hashCode();
    h += (h << 5) + host.hashCode();
    h += (h << 5) + port.hashCode();
    h += (h << 5) + contact.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code NetstatsUrl} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("NetstatsUrl")
        .omitNullValues()
        .add("nodeName", nodeName)
        .add("secret", secret)
        .add("host", host)
        .add("port", port)
        .add("contact", contact)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link NetstatsUrl} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NetstatsUrl instance
   */
  public static ImmutableNetstatsUrl copyOf(NetstatsUrl instance) {
    if (instance instanceof ImmutableNetstatsUrl) {
      return (ImmutableNetstatsUrl) instance;
    }
    return ImmutableNetstatsUrl.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableNetstatsUrl ImmutableNetstatsUrl}.
   * <pre>
   * ImmutableNetstatsUrl.builder()
   *    .nodeName(String) // required {@link NetstatsUrl#getNodeName() nodeName}
   *    .secret(String) // required {@link NetstatsUrl#getSecret() secret}
   *    .host(String) // required {@link NetstatsUrl#getHost() host}
   *    .port(Integer) // required {@link NetstatsUrl#getPort() port}
   *    .contact(String) // required {@link NetstatsUrl#getContact() contact}
   *    .build();
   * </pre>
   * @return A new ImmutableNetstatsUrl builder
   */
  public static ImmutableNetstatsUrl.Builder builder() {
    return new ImmutableNetstatsUrl.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableNetstatsUrl ImmutableNetstatsUrl}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NetstatsUrl", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NODE_NAME = 0x1L;
    private static final long INIT_BIT_SECRET = 0x2L;
    private static final long INIT_BIT_HOST = 0x4L;
    private static final long INIT_BIT_PORT = 0x8L;
    private static final long INIT_BIT_CONTACT = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String nodeName;
    private @Nullable String secret;
    private @Nullable String host;
    private @Nullable Integer port;
    private @Nullable String contact;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code NetstatsUrl} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(NetstatsUrl instance) {
      Objects.requireNonNull(instance, "instance");
      nodeName(instance.getNodeName());
      secret(instance.getSecret());
      host(instance.getHost());
      port(instance.getPort());
      contact(instance.getContact());
      return this;
    }

    /**
     * Initializes the value for the {@link NetstatsUrl#getNodeName() nodeName} attribute.
     * @param nodeName The value for nodeName 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder nodeName(String nodeName) {
      this.nodeName = Objects.requireNonNull(nodeName, "nodeName");
      initBits &= ~INIT_BIT_NODE_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link NetstatsUrl#getSecret() secret} attribute.
     * @param secret The value for secret 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder secret(String secret) {
      this.secret = Objects.requireNonNull(secret, "secret");
      initBits &= ~INIT_BIT_SECRET;
      return this;
    }

    /**
     * Initializes the value for the {@link NetstatsUrl#getHost() host} attribute.
     * @param host The value for host 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder host(String host) {
      this.host = Objects.requireNonNull(host, "host");
      initBits &= ~INIT_BIT_HOST;
      return this;
    }

    /**
     * Initializes the value for the {@link NetstatsUrl#getPort() port} attribute.
     * @param port The value for port 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder port(Integer port) {
      this.port = Objects.requireNonNull(port, "port");
      initBits &= ~INIT_BIT_PORT;
      return this;
    }

    /**
     * Initializes the value for the {@link NetstatsUrl#getContact() contact} attribute.
     * @param contact The value for contact 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder contact(String contact) {
      this.contact = Objects.requireNonNull(contact, "contact");
      initBits &= ~INIT_BIT_CONTACT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableNetstatsUrl ImmutableNetstatsUrl}.
     * @return An immutable instance of NetstatsUrl
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNetstatsUrl build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableNetstatsUrl(nodeName, secret, host, port, contact);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NODE_NAME) != 0) attributes.add("nodeName");
      if ((initBits & INIT_BIT_SECRET) != 0) attributes.add("secret");
      if ((initBits & INIT_BIT_HOST) != 0) attributes.add("host");
      if ((initBits & INIT_BIT_PORT) != 0) attributes.add("port");
      if ((initBits & INIT_BIT_CONTACT) != 0) attributes.add("contact");
      return "Cannot build NetstatsUrl, some of required attributes are not set " + attributes;
    }
  }
}
