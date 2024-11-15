package org.hyperledger.besu.ethereum.api.jsonrpc.internal.results;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PeerResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePeerResult.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutablePeerResult.of()}.
 */
@Generated(from = "PeerResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePeerResult
    implements PeerResult {
  private final String version;
  private final String name;
  private final ImmutableList<JsonNode> caps;
  private final NetworkResult network;
  private final String port;
  private final String id;
  private final ImmutableMap<String, ProtocolsResult> protocols;
  private final String enode;

  private ImmutablePeerResult(
      String version,
      String name,
      Iterable<? extends JsonNode> caps,
      NetworkResult network,
      String port,
      String id,
      Map<String, ? extends ProtocolsResult> protocols,
      String enode) {
    this.version = Objects.requireNonNull(version, "version");
    this.name = Objects.requireNonNull(name, "name");
    this.caps = ImmutableList.copyOf(caps);
    this.network = Objects.requireNonNull(network, "network");
    this.port = Objects.requireNonNull(port, "port");
    this.id = Objects.requireNonNull(id, "id");
    this.protocols = ImmutableMap.copyOf(protocols);
    this.enode = Objects.requireNonNull(enode, "enode");
  }

  private ImmutablePeerResult(
      ImmutablePeerResult original,
      String version,
      String name,
      ImmutableList<JsonNode> caps,
      NetworkResult network,
      String port,
      String id,
      ImmutableMap<String, ProtocolsResult> protocols,
      String enode) {
    this.version = version;
    this.name = name;
    this.caps = caps;
    this.network = network;
    this.port = port;
    this.id = id;
    this.protocols = protocols;
    this.enode = enode;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @Override
  public String getVersion() {
    return version;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * @return The value of the {@code caps} attribute
   */
  @Override
  public ImmutableList<JsonNode> getCaps() {
    return caps;
  }

  /**
   * @return The value of the {@code network} attribute
   */
  @Override
  public NetworkResult getNetwork() {
    return network;
  }

  /**
   * @return The value of the {@code port} attribute
   */
  @Override
  public String getPort() {
    return port;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @Override
  public String getId() {
    return id;
  }

  /**
   * @return The value of the {@code protocols} attribute
   */
  @Override
  public ImmutableMap<String, ProtocolsResult> getProtocols() {
    return protocols;
  }

  /**
   * @return The value of the {@code enode} attribute
   */
  @Override
  public String getEnode() {
    return enode;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PeerResult#getVersion() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePeerResult withVersion(String value) {
    String newValue = Objects.requireNonNull(value, "version");
    if (this.version.equals(newValue)) return this;
    return new ImmutablePeerResult(
        this,
        newValue,
        this.name,
        this.caps,
        this.network,
        this.port,
        this.id,
        this.protocols,
        this.enode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PeerResult#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePeerResult withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePeerResult(
        this,
        this.version,
        newValue,
        this.caps,
        this.network,
        this.port,
        this.id,
        this.protocols,
        this.enode);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PeerResult#getCaps() caps}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePeerResult withCaps(JsonNode... elements) {
    ImmutableList<JsonNode> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePeerResult(
        this,
        this.version,
        this.name,
        newValue,
        this.network,
        this.port,
        this.id,
        this.protocols,
        this.enode);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PeerResult#getCaps() caps}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of caps elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePeerResult withCaps(Iterable<? extends JsonNode> elements) {
    if (this.caps == elements) return this;
    ImmutableList<JsonNode> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePeerResult(
        this,
        this.version,
        this.name,
        newValue,
        this.network,
        this.port,
        this.id,
        this.protocols,
        this.enode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PeerResult#getNetwork() network} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for network
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePeerResult withNetwork(NetworkResult value) {
    if (this.network == value) return this;
    NetworkResult newValue = Objects.requireNonNull(value, "network");
    return new ImmutablePeerResult(
        this,
        this.version,
        this.name,
        this.caps,
        newValue,
        this.port,
        this.id,
        this.protocols,
        this.enode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PeerResult#getPort() port} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePeerResult withPort(String value) {
    String newValue = Objects.requireNonNull(value, "port");
    if (this.port.equals(newValue)) return this;
    return new ImmutablePeerResult(
        this,
        this.version,
        this.name,
        this.caps,
        this.network,
        newValue,
        this.id,
        this.protocols,
        this.enode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PeerResult#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePeerResult withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutablePeerResult(
        this,
        this.version,
        this.name,
        this.caps,
        this.network,
        this.port,
        newValue,
        this.protocols,
        this.enode);
  }

  /**
   * Copy the current immutable object by replacing the {@link PeerResult#getProtocols() protocols} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the protocols map
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePeerResult withProtocols(Map<String, ? extends ProtocolsResult> entries) {
    if (this.protocols == entries) return this;
    ImmutableMap<String, ProtocolsResult> newValue = ImmutableMap.copyOf(entries);
    return new ImmutablePeerResult(
        this,
        this.version,
        this.name,
        this.caps,
        this.network,
        this.port,
        this.id,
        newValue,
        this.enode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PeerResult#getEnode() enode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for enode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePeerResult withEnode(String value) {
    String newValue = Objects.requireNonNull(value, "enode");
    if (this.enode.equals(newValue)) return this;
    return new ImmutablePeerResult(
        this,
        this.version,
        this.name,
        this.caps,
        this.network,
        this.port,
        this.id,
        this.protocols,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePeerResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePeerResult
        && equalTo(0, (ImmutablePeerResult) another);
  }

  private boolean equalTo(int synthetic, ImmutablePeerResult another) {
    return version.equals(another.version)
        && name.equals(another.name)
        && caps.equals(another.caps)
        && network.equals(another.network)
        && port.equals(another.port)
        && id.equals(another.id)
        && protocols.equals(another.protocols)
        && enode.equals(another.enode);
  }

  /**
   * Computes a hash code from attributes: {@code version}, {@code name}, {@code caps}, {@code network}, {@code port}, {@code id}, {@code protocols}, {@code enode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + version.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + caps.hashCode();
    h += (h << 5) + network.hashCode();
    h += (h << 5) + port.hashCode();
    h += (h << 5) + id.hashCode();
    h += (h << 5) + protocols.hashCode();
    h += (h << 5) + enode.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PeerResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PeerResult")
        .omitNullValues()
        .add("version", version)
        .add("name", name)
        .add("caps", caps)
        .add("network", network)
        .add("port", port)
        .add("id", id)
        .add("protocols", protocols)
        .add("enode", enode)
        .toString();
  }

  /**
   * Construct a new immutable {@code PeerResult} instance.
   * @param version The value for the {@code version} attribute
   * @param name The value for the {@code name} attribute
   * @param caps The value for the {@code caps} attribute
   * @param network The value for the {@code network} attribute
   * @param port The value for the {@code port} attribute
   * @param id The value for the {@code id} attribute
   * @param protocols The value for the {@code protocols} attribute
   * @param enode The value for the {@code enode} attribute
   * @return An immutable PeerResult instance
   */
  public static ImmutablePeerResult of(String version, String name, List<JsonNode> caps, NetworkResult network, String port, String id, Map<String, ProtocolsResult> protocols, String enode) {
    return of(version, name, (Iterable<? extends JsonNode>) caps, network, port, id, protocols, enode);
  }

  /**
   * Construct a new immutable {@code PeerResult} instance.
   * @param version The value for the {@code version} attribute
   * @param name The value for the {@code name} attribute
   * @param caps The value for the {@code caps} attribute
   * @param network The value for the {@code network} attribute
   * @param port The value for the {@code port} attribute
   * @param id The value for the {@code id} attribute
   * @param protocols The value for the {@code protocols} attribute
   * @param enode The value for the {@code enode} attribute
   * @return An immutable PeerResult instance
   */
  public static ImmutablePeerResult of(String version, String name, Iterable<? extends JsonNode> caps, NetworkResult network, String port, String id, Map<String, ? extends ProtocolsResult> protocols, String enode) {
    return new ImmutablePeerResult(version, name, caps, network, port, id, protocols, enode);
  }

  /**
   * Creates an immutable copy of a {@link PeerResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PeerResult instance
   */
  public static ImmutablePeerResult copyOf(PeerResult instance) {
    if (instance instanceof ImmutablePeerResult) {
      return (ImmutablePeerResult) instance;
    }
    return ImmutablePeerResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePeerResult ImmutablePeerResult}.
   * <pre>
   * ImmutablePeerResult.builder()
   *    .version(String) // required {@link PeerResult#getVersion() version}
   *    .name(String) // required {@link PeerResult#getName() name}
   *    .addCaps|addAllCaps(com.fasterxml.jackson.databind.JsonNode) // {@link PeerResult#getCaps() caps} elements
   *    .network(org.hyperledger.besu.ethereum.api.jsonrpc.internal.results.NetworkResult) // required {@link PeerResult#getNetwork() network}
   *    .port(String) // required {@link PeerResult#getPort() port}
   *    .id(String) // required {@link PeerResult#getId() id}
   *    .putProtocols|putAllProtocols(String =&gt; org.hyperledger.besu.ethereum.api.jsonrpc.internal.results.ProtocolsResult) // {@link PeerResult#getProtocols() protocols} mappings
   *    .enode(String) // required {@link PeerResult#getEnode() enode}
   *    .build();
   * </pre>
   * @return A new ImmutablePeerResult builder
   */
  public static ImmutablePeerResult.Builder builder() {
    return new ImmutablePeerResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePeerResult ImmutablePeerResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PeerResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_VERSION = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_NETWORK = 0x4L;
    private static final long INIT_BIT_PORT = 0x8L;
    private static final long INIT_BIT_ID = 0x10L;
    private static final long INIT_BIT_ENODE = 0x20L;
    private long initBits = 0x3fL;

    private @Nullable String version;
    private @Nullable String name;
    private ImmutableList.Builder<JsonNode> caps = ImmutableList.builder();
    private @Nullable NetworkResult network;
    private @Nullable String port;
    private @Nullable String id;
    private ImmutableMap.Builder<String, ProtocolsResult> protocols = ImmutableMap.builder();
    private @Nullable String enode;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PeerResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PeerResult instance) {
      Objects.requireNonNull(instance, "instance");
      version(instance.getVersion());
      name(instance.getName());
      addAllCaps(instance.getCaps());
      network(instance.getNetwork());
      port(instance.getPort());
      id(instance.getId());
      putAllProtocols(instance.getProtocols());
      enode(instance.getEnode());
      return this;
    }

    /**
     * Initializes the value for the {@link PeerResult#getVersion() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder version(String version) {
      this.version = Objects.requireNonNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link PeerResult#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link PeerResult#getCaps() caps} list.
     * @param element A caps element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addCaps(JsonNode element) {
      this.caps.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PeerResult#getCaps() caps} list.
     * @param elements An array of caps elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addCaps(JsonNode... elements) {
      this.caps.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link PeerResult#getCaps() caps} list.
     * @param elements An iterable of caps elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder caps(Iterable<? extends JsonNode> elements) {
      this.caps = ImmutableList.builder();
      return addAllCaps(elements);
    }

    /**
     * Adds elements to {@link PeerResult#getCaps() caps} list.
     * @param elements An iterable of caps elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllCaps(Iterable<? extends JsonNode> elements) {
      this.caps.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link PeerResult#getNetwork() network} attribute.
     * @param network The value for network 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder network(NetworkResult network) {
      this.network = Objects.requireNonNull(network, "network");
      initBits &= ~INIT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the value for the {@link PeerResult#getPort() port} attribute.
     * @param port The value for port 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder port(String port) {
      this.port = Objects.requireNonNull(port, "port");
      initBits &= ~INIT_BIT_PORT;
      return this;
    }

    /**
     * Initializes the value for the {@link PeerResult#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Put one entry to the {@link PeerResult#getProtocols() protocols} map.
     * @param key The key in the protocols map
     * @param value The associated value in the protocols map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putProtocols(String key, ProtocolsResult value) {
      this.protocols.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link PeerResult#getProtocols() protocols} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putProtocols(Map.Entry<String, ? extends ProtocolsResult> entry) {
      this.protocols.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link PeerResult#getProtocols() protocols} map. Nulls are not permitted
     * @param entries The entries that will be added to the protocols map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder protocols(Map<String, ? extends ProtocolsResult> entries) {
      this.protocols = ImmutableMap.builder();
      return putAllProtocols(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link PeerResult#getProtocols() protocols} map. Nulls are not permitted
     * @param entries The entries that will be added to the protocols map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putAllProtocols(Map<String, ? extends ProtocolsResult> entries) {
      this.protocols.putAll(entries);
      return this;
    }

    /**
     * Initializes the value for the {@link PeerResult#getEnode() enode} attribute.
     * @param enode The value for enode 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder enode(String enode) {
      this.enode = Objects.requireNonNull(enode, "enode");
      initBits &= ~INIT_BIT_ENODE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePeerResult ImmutablePeerResult}.
     * @return An immutable instance of PeerResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePeerResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePeerResult(null, version, name, caps.build(), network, port, id, protocols.build(), enode);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_NETWORK) != 0) attributes.add("network");
      if ((initBits & INIT_BIT_PORT) != 0) attributes.add("port");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_ENODE) != 0) attributes.add("enode");
      return "Cannot build PeerResult, some of required attributes are not set " + attributes;
    }
  }
}
