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
 * Immutable implementation of {@link NodeInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNodeInfo.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableNodeInfo.of()}.
 */
@Generated(from = "NodeInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableNodeInfo implements NodeInfo {
  private final String name;
  private final String node;
  private final String port;
  private final String network;
  private final String protocol;
  private final String api;
  private final String os;
  private final String osVer;
  private final String client;
  private final Boolean canUpdateHistory;
  private final String contact;

  private ImmutableNodeInfo(
      String name,
      String node,
      String port,
      String network,
      String protocol,
      String api,
      String os,
      String osVer,
      String client,
      Boolean canUpdateHistory,
      String contact) {
    this.name = Objects.requireNonNull(name, "name");
    this.node = Objects.requireNonNull(node, "node");
    this.port = Objects.requireNonNull(port, "port");
    this.network = Objects.requireNonNull(network, "network");
    this.protocol = Objects.requireNonNull(protocol, "protocol");
    this.api = Objects.requireNonNull(api, "api");
    this.os = Objects.requireNonNull(os, "os");
    this.osVer = Objects.requireNonNull(osVer, "osVer");
    this.client = Objects.requireNonNull(client, "client");
    this.canUpdateHistory = Objects.requireNonNull(canUpdateHistory, "canUpdateHistory");
    this.contact = Objects.requireNonNull(contact, "contact");
  }

  private ImmutableNodeInfo(
      ImmutableNodeInfo original,
      String name,
      String node,
      String port,
      String network,
      String protocol,
      String api,
      String os,
      String osVer,
      String client,
      Boolean canUpdateHistory,
      String contact) {
    this.name = name;
    this.node = node;
    this.port = port;
    this.network = network;
    this.protocol = protocol;
    this.api = api;
    this.os = os;
    this.osVer = osVer;
    this.client = client;
    this.canUpdateHistory = canUpdateHistory;
    this.contact = contact;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String getName() {
    return name;
  }

  /**
   * @return The value of the {@code node} attribute
   */
  @JsonProperty("node")
  @Override
  public String getNode() {
    return node;
  }

  /**
   * @return The value of the {@code port} attribute
   */
  @JsonProperty("port")
  @Override
  public String getPort() {
    return port;
  }

  /**
   * @return The value of the {@code network} attribute
   */
  @JsonProperty("net")
  @Override
  public String getNetwork() {
    return network;
  }

  /**
   * @return The value of the {@code protocol} attribute
   */
  @JsonProperty("protocol")
  @Override
  public String getProtocol() {
    return protocol;
  }

  /**
   * @return The value of the {@code api} attribute
   */
  @JsonProperty("api")
  @Override
  public String getApi() {
    return api;
  }

  /**
   * @return The value of the {@code os} attribute
   */
  @JsonProperty("os")
  @Override
  public String getOs() {
    return os;
  }

  /**
   * @return The value of the {@code osVer} attribute
   */
  @JsonProperty("os_v")
  @Override
  public String getOsVer() {
    return osVer;
  }

  /**
   * @return The value of the {@code client} attribute
   */
  @JsonProperty("client")
  @Override
  public String getClient() {
    return client;
  }

  /**
   * @return The value of the {@code canUpdateHistory} attribute
   */
  @JsonProperty("canUpdateHistory")
  @Override
  public Boolean getCanUpdateHistory() {
    return canUpdateHistory;
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public String getContact() {
    return contact;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        newValue,
        this.node,
        this.port,
        this.network,
        this.protocol,
        this.api,
        this.os,
        this.osVer,
        this.client,
        this.canUpdateHistory,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getNode() node} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for node
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withNode(String value) {
    String newValue = Objects.requireNonNull(value, "node");
    if (this.node.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        newValue,
        this.port,
        this.network,
        this.protocol,
        this.api,
        this.os,
        this.osVer,
        this.client,
        this.canUpdateHistory,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getPort() port} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withPort(String value) {
    String newValue = Objects.requireNonNull(value, "port");
    if (this.port.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        this.node,
        newValue,
        this.network,
        this.protocol,
        this.api,
        this.os,
        this.osVer,
        this.client,
        this.canUpdateHistory,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getNetwork() network} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for network
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withNetwork(String value) {
    String newValue = Objects.requireNonNull(value, "network");
    if (this.network.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        this.node,
        this.port,
        newValue,
        this.protocol,
        this.api,
        this.os,
        this.osVer,
        this.client,
        this.canUpdateHistory,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getProtocol() protocol} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for protocol
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withProtocol(String value) {
    String newValue = Objects.requireNonNull(value, "protocol");
    if (this.protocol.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        this.node,
        this.port,
        this.network,
        newValue,
        this.api,
        this.os,
        this.osVer,
        this.client,
        this.canUpdateHistory,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getApi() api} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for api
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withApi(String value) {
    String newValue = Objects.requireNonNull(value, "api");
    if (this.api.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        this.node,
        this.port,
        this.network,
        this.protocol,
        newValue,
        this.os,
        this.osVer,
        this.client,
        this.canUpdateHistory,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getOs() os} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for os
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withOs(String value) {
    String newValue = Objects.requireNonNull(value, "os");
    if (this.os.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        this.node,
        this.port,
        this.network,
        this.protocol,
        this.api,
        newValue,
        this.osVer,
        this.client,
        this.canUpdateHistory,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getOsVer() osVer} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for osVer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withOsVer(String value) {
    String newValue = Objects.requireNonNull(value, "osVer");
    if (this.osVer.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        this.node,
        this.port,
        this.network,
        this.protocol,
        this.api,
        this.os,
        newValue,
        this.client,
        this.canUpdateHistory,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getClient() client} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for client
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withClient(String value) {
    String newValue = Objects.requireNonNull(value, "client");
    if (this.client.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        this.node,
        this.port,
        this.network,
        this.protocol,
        this.api,
        this.os,
        this.osVer,
        newValue,
        this.canUpdateHistory,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getCanUpdateHistory() canUpdateHistory} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for canUpdateHistory
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withCanUpdateHistory(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "canUpdateHistory");
    if (this.canUpdateHistory.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        this.node,
        this.port,
        this.network,
        this.protocol,
        this.api,
        this.os,
        this.osVer,
        this.client,
        newValue,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NodeInfo#getContact() contact} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for contact
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNodeInfo withContact(String value) {
    String newValue = Objects.requireNonNull(value, "contact");
    if (this.contact.equals(newValue)) return this;
    return new ImmutableNodeInfo(
        this,
        this.name,
        this.node,
        this.port,
        this.network,
        this.protocol,
        this.api,
        this.os,
        this.osVer,
        this.client,
        this.canUpdateHistory,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNodeInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNodeInfo
        && equalTo(0, (ImmutableNodeInfo) another);
  }

  private boolean equalTo(int synthetic, ImmutableNodeInfo another) {
    return name.equals(another.name)
        && node.equals(another.node)
        && port.equals(another.port)
        && network.equals(another.network)
        && protocol.equals(another.protocol)
        && api.equals(another.api)
        && os.equals(another.os)
        && osVer.equals(another.osVer)
        && client.equals(another.client)
        && canUpdateHistory.equals(another.canUpdateHistory)
        && contact.equals(another.contact);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code node}, {@code port}, {@code network}, {@code protocol}, {@code api}, {@code os}, {@code osVer}, {@code client}, {@code canUpdateHistory}, {@code contact}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + node.hashCode();
    h += (h << 5) + port.hashCode();
    h += (h << 5) + network.hashCode();
    h += (h << 5) + protocol.hashCode();
    h += (h << 5) + api.hashCode();
    h += (h << 5) + os.hashCode();
    h += (h << 5) + osVer.hashCode();
    h += (h << 5) + client.hashCode();
    h += (h << 5) + canUpdateHistory.hashCode();
    h += (h << 5) + contact.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code NodeInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("NodeInfo")
        .omitNullValues()
        .add("name", name)
        .add("node", node)
        .add("port", port)
        .add("network", network)
        .add("protocol", protocol)
        .add("api", api)
        .add("os", os)
        .add("osVer", osVer)
        .add("client", client)
        .add("canUpdateHistory", canUpdateHistory)
        .add("contact", contact)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "NodeInfo", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NodeInfo {
    @Nullable String name;
    @Nullable String node;
    @Nullable String port;
    @Nullable String network;
    @Nullable String protocol;
    @Nullable String api;
    @Nullable String os;
    @Nullable String osVer;
    @Nullable String client;
    @Nullable Boolean canUpdateHistory;
    @Nullable String contact;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("node")
    public void setNode(String node) {
      this.node = node;
    }
    @JsonProperty("port")
    public void setPort(String port) {
      this.port = port;
    }
    @JsonProperty("net")
    public void setNetwork(String network) {
      this.network = network;
    }
    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    @JsonProperty("api")
    public void setApi(String api) {
      this.api = api;
    }
    @JsonProperty("os")
    public void setOs(String os) {
      this.os = os;
    }
    @JsonProperty("os_v")
    public void setOsVer(String osVer) {
      this.osVer = osVer;
    }
    @JsonProperty("client")
    public void setClient(String client) {
      this.client = client;
    }
    @JsonProperty("canUpdateHistory")
    public void setCanUpdateHistory(Boolean canUpdateHistory) {
      this.canUpdateHistory = canUpdateHistory;
    }
    @JsonProperty("contact")
    public void setContact(String contact) {
      this.contact = contact;
    }
    @Override
    public String getName() { throw new UnsupportedOperationException(); }
    @Override
    public String getNode() { throw new UnsupportedOperationException(); }
    @Override
    public String getPort() { throw new UnsupportedOperationException(); }
    @Override
    public String getNetwork() { throw new UnsupportedOperationException(); }
    @Override
    public String getProtocol() { throw new UnsupportedOperationException(); }
    @Override
    public String getApi() { throw new UnsupportedOperationException(); }
    @Override
    public String getOs() { throw new UnsupportedOperationException(); }
    @Override
    public String getOsVer() { throw new UnsupportedOperationException(); }
    @Override
    public String getClient() { throw new UnsupportedOperationException(); }
    @Override
    public Boolean getCanUpdateHistory() { throw new UnsupportedOperationException(); }
    @Override
    public String getContact() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNodeInfo fromJson(Json json) {
    ImmutableNodeInfo.Builder builder = ImmutableNodeInfo.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.node != null) {
      builder.node(json.node);
    }
    if (json.port != null) {
      builder.port(json.port);
    }
    if (json.network != null) {
      builder.network(json.network);
    }
    if (json.protocol != null) {
      builder.protocol(json.protocol);
    }
    if (json.api != null) {
      builder.api(json.api);
    }
    if (json.os != null) {
      builder.os(json.os);
    }
    if (json.osVer != null) {
      builder.osVer(json.osVer);
    }
    if (json.client != null) {
      builder.client(json.client);
    }
    if (json.canUpdateHistory != null) {
      builder.canUpdateHistory(json.canUpdateHistory);
    }
    if (json.contact != null) {
      builder.contact(json.contact);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code NodeInfo} instance.
   * @param name The value for the {@code name} attribute
   * @param node The value for the {@code node} attribute
   * @param port The value for the {@code port} attribute
   * @param network The value for the {@code network} attribute
   * @param protocol The value for the {@code protocol} attribute
   * @param api The value for the {@code api} attribute
   * @param os The value for the {@code os} attribute
   * @param osVer The value for the {@code osVer} attribute
   * @param client The value for the {@code client} attribute
   * @param canUpdateHistory The value for the {@code canUpdateHistory} attribute
   * @param contact The value for the {@code contact} attribute
   * @return An immutable NodeInfo instance
   */
  public static ImmutableNodeInfo of(String name, String node, String port, String network, String protocol, String api, String os, String osVer, String client, Boolean canUpdateHistory, String contact) {
    return new ImmutableNodeInfo(name, node, port, network, protocol, api, os, osVer, client, canUpdateHistory, contact);
  }

  /**
   * Creates an immutable copy of a {@link NodeInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NodeInfo instance
   */
  public static ImmutableNodeInfo copyOf(NodeInfo instance) {
    if (instance instanceof ImmutableNodeInfo) {
      return (ImmutableNodeInfo) instance;
    }
    return ImmutableNodeInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableNodeInfo ImmutableNodeInfo}.
   * <pre>
   * ImmutableNodeInfo.builder()
   *    .name(String) // required {@link NodeInfo#getName() name}
   *    .node(String) // required {@link NodeInfo#getNode() node}
   *    .port(String) // required {@link NodeInfo#getPort() port}
   *    .network(String) // required {@link NodeInfo#getNetwork() network}
   *    .protocol(String) // required {@link NodeInfo#getProtocol() protocol}
   *    .api(String) // required {@link NodeInfo#getApi() api}
   *    .os(String) // required {@link NodeInfo#getOs() os}
   *    .osVer(String) // required {@link NodeInfo#getOsVer() osVer}
   *    .client(String) // required {@link NodeInfo#getClient() client}
   *    .canUpdateHistory(Boolean) // required {@link NodeInfo#getCanUpdateHistory() canUpdateHistory}
   *    .contact(String) // required {@link NodeInfo#getContact() contact}
   *    .build();
   * </pre>
   * @return A new ImmutableNodeInfo builder
   */
  public static ImmutableNodeInfo.Builder builder() {
    return new ImmutableNodeInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableNodeInfo ImmutableNodeInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NodeInfo", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_NODE = 0x2L;
    private static final long INIT_BIT_PORT = 0x4L;
    private static final long INIT_BIT_NETWORK = 0x8L;
    private static final long INIT_BIT_PROTOCOL = 0x10L;
    private static final long INIT_BIT_API = 0x20L;
    private static final long INIT_BIT_OS = 0x40L;
    private static final long INIT_BIT_OS_VER = 0x80L;
    private static final long INIT_BIT_CLIENT = 0x100L;
    private static final long INIT_BIT_CAN_UPDATE_HISTORY = 0x200L;
    private static final long INIT_BIT_CONTACT = 0x400L;
    private long initBits = 0x7ffL;

    private @Nullable String name;
    private @Nullable String node;
    private @Nullable String port;
    private @Nullable String network;
    private @Nullable String protocol;
    private @Nullable String api;
    private @Nullable String os;
    private @Nullable String osVer;
    private @Nullable String client;
    private @Nullable Boolean canUpdateHistory;
    private @Nullable String contact;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code NodeInfo} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(NodeInfo instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      node(instance.getNode());
      port(instance.getPort());
      network(instance.getNetwork());
      protocol(instance.getProtocol());
      api(instance.getApi());
      os(instance.getOs());
      osVer(instance.getOsVer());
      client(instance.getClient());
      canUpdateHistory(instance.getCanUpdateHistory());
      contact(instance.getContact());
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getNode() node} attribute.
     * @param node The value for node 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("node")
    public final Builder node(String node) {
      this.node = Objects.requireNonNull(node, "node");
      initBits &= ~INIT_BIT_NODE;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getPort() port} attribute.
     * @param port The value for port 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("port")
    public final Builder port(String port) {
      this.port = Objects.requireNonNull(port, "port");
      initBits &= ~INIT_BIT_PORT;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getNetwork() network} attribute.
     * @param network The value for network 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("net")
    public final Builder network(String network) {
      this.network = Objects.requireNonNull(network, "network");
      initBits &= ~INIT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getProtocol() protocol} attribute.
     * @param protocol The value for protocol 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("protocol")
    public final Builder protocol(String protocol) {
      this.protocol = Objects.requireNonNull(protocol, "protocol");
      initBits &= ~INIT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getApi() api} attribute.
     * @param api The value for api 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("api")
    public final Builder api(String api) {
      this.api = Objects.requireNonNull(api, "api");
      initBits &= ~INIT_BIT_API;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getOs() os} attribute.
     * @param os The value for os 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("os")
    public final Builder os(String os) {
      this.os = Objects.requireNonNull(os, "os");
      initBits &= ~INIT_BIT_OS;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getOsVer() osVer} attribute.
     * @param osVer The value for osVer 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("os_v")
    public final Builder osVer(String osVer) {
      this.osVer = Objects.requireNonNull(osVer, "osVer");
      initBits &= ~INIT_BIT_OS_VER;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getClient() client} attribute.
     * @param client The value for client 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("client")
    public final Builder client(String client) {
      this.client = Objects.requireNonNull(client, "client");
      initBits &= ~INIT_BIT_CLIENT;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getCanUpdateHistory() canUpdateHistory} attribute.
     * @param canUpdateHistory The value for canUpdateHistory 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("canUpdateHistory")
    public final Builder canUpdateHistory(Boolean canUpdateHistory) {
      this.canUpdateHistory = Objects.requireNonNull(canUpdateHistory, "canUpdateHistory");
      initBits &= ~INIT_BIT_CAN_UPDATE_HISTORY;
      return this;
    }

    /**
     * Initializes the value for the {@link NodeInfo#getContact() contact} attribute.
     * @param contact The value for contact 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("contact")
    public final Builder contact(String contact) {
      this.contact = Objects.requireNonNull(contact, "contact");
      initBits &= ~INIT_BIT_CONTACT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableNodeInfo ImmutableNodeInfo}.
     * @return An immutable instance of NodeInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNodeInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableNodeInfo(null, name, node, port, network, protocol, api, os, osVer, client, canUpdateHistory, contact);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_NODE) != 0) attributes.add("node");
      if ((initBits & INIT_BIT_PORT) != 0) attributes.add("port");
      if ((initBits & INIT_BIT_NETWORK) != 0) attributes.add("network");
      if ((initBits & INIT_BIT_PROTOCOL) != 0) attributes.add("protocol");
      if ((initBits & INIT_BIT_API) != 0) attributes.add("api");
      if ((initBits & INIT_BIT_OS) != 0) attributes.add("os");
      if ((initBits & INIT_BIT_OS_VER) != 0) attributes.add("osVer");
      if ((initBits & INIT_BIT_CLIENT) != 0) attributes.add("client");
      if ((initBits & INIT_BIT_CAN_UPDATE_HISTORY) != 0) attributes.add("canUpdateHistory");
      if ((initBits & INIT_BIT_CONTACT) != 0) attributes.add("contact");
      return "Cannot build NodeInfo, some of required attributes are not set " + attributes;
    }
  }
}
