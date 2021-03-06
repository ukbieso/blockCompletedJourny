/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package no.ruter.events.avro.tps;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Journey patterns with service links */
@org.apache.avro.specific.AvroGenerated
public class JourneyPatternServiceLinks extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3839046232786395458L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"JourneyPatternServiceLinks\",\"namespace\":\"no.ruter.events.avro.tps\",\"doc\":\"Journey patterns with service links\",\"fields\":[{\"name\":\"journeyPatternID\",\"type\":\"string\"},{\"name\":\"route\",\"type\":{\"type\":\"record\",\"name\":\"Route\",\"doc\":\"Route\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"line\",\"type\":{\"type\":\"record\",\"name\":\"Line\",\"doc\":\"Line\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"publicCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"colour\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"transportMode\",\"type\":[\"null\",\"string\"],\"default\":null}]}},{\"name\":\"name\",\"type\":\"string\"}]}},{\"name\":\"servicelinks\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ServiceLink\",\"doc\":\"ServiceLink\",\"fields\":[{\"name\":\"serviceLinkID\",\"type\":\"string\"},{\"name\":\"distance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"poslistID\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"linklocations\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Position\",\"doc\":\"Position\",\"fields\":[{\"name\":\"lat\",\"type\":\"double\"},{\"name\":\"lon\",\"type\":\"double\"}]}}],\"default\":null},{\"name\":\"fromPoint\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"QuayStop\",\"doc\":\"Quay with Stop Place\",\"fields\":[{\"name\":\"stopId\",\"type\":\"string\"},{\"name\":\"stopName\",\"type\":\"string\"},{\"name\":\"quayId\",\"type\":\"string\"},{\"name\":\"position\",\"type\":\"Position\"},{\"name\":\"order\",\"type\":\"int\"},{\"name\":\"arrivalTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"departureTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"quayOldId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"destinationDisplay\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"destinationDisplayVia\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"toPoint\",\"type\":[\"null\",\"QuayStop\"],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<JourneyPatternServiceLinks> ENCODER =
      new BinaryMessageEncoder<JourneyPatternServiceLinks>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<JourneyPatternServiceLinks> DECODER =
      new BinaryMessageDecoder<JourneyPatternServiceLinks>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<JourneyPatternServiceLinks> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<JourneyPatternServiceLinks> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<JourneyPatternServiceLinks>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this JourneyPatternServiceLinks to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a JourneyPatternServiceLinks from a ByteBuffer. */
  public static JourneyPatternServiceLinks fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence journeyPatternID;
  @Deprecated public no.ruter.events.avro.tps.Route route;
  @Deprecated public java.util.List<no.ruter.events.avro.tps.ServiceLink> servicelinks;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public JourneyPatternServiceLinks() {}

  /**
   * All-args constructor.
   * @param journeyPatternID The new value for journeyPatternID
   * @param route The new value for route
   * @param servicelinks The new value for servicelinks
   */
  public JourneyPatternServiceLinks(java.lang.CharSequence journeyPatternID, no.ruter.events.avro.tps.Route route, java.util.List<no.ruter.events.avro.tps.ServiceLink> servicelinks) {
    this.journeyPatternID = journeyPatternID;
    this.route = route;
    this.servicelinks = servicelinks;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return journeyPatternID;
    case 1: return route;
    case 2: return servicelinks;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: journeyPatternID = (java.lang.CharSequence)value$; break;
    case 1: route = (no.ruter.events.avro.tps.Route)value$; break;
    case 2: servicelinks = (java.util.List<no.ruter.events.avro.tps.ServiceLink>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'journeyPatternID' field.
   * @return The value of the 'journeyPatternID' field.
   */
  public java.lang.CharSequence getJourneyPatternID() {
    return journeyPatternID;
  }

  /**
   * Sets the value of the 'journeyPatternID' field.
   * @param value the value to set.
   */
  public void setJourneyPatternID(java.lang.CharSequence value) {
    this.journeyPatternID = value;
  }

  /**
   * Gets the value of the 'route' field.
   * @return The value of the 'route' field.
   */
  public no.ruter.events.avro.tps.Route getRoute() {
    return route;
  }

  /**
   * Sets the value of the 'route' field.
   * @param value the value to set.
   */
  public void setRoute(no.ruter.events.avro.tps.Route value) {
    this.route = value;
  }

  /**
   * Gets the value of the 'servicelinks' field.
   * @return The value of the 'servicelinks' field.
   */
  public java.util.List<no.ruter.events.avro.tps.ServiceLink> getServicelinks() {
    return servicelinks;
  }

  /**
   * Sets the value of the 'servicelinks' field.
   * @param value the value to set.
   */
  public void setServicelinks(java.util.List<no.ruter.events.avro.tps.ServiceLink> value) {
    this.servicelinks = value;
  }

  /**
   * Creates a new JourneyPatternServiceLinks RecordBuilder.
   * @return A new JourneyPatternServiceLinks RecordBuilder
   */
  public static no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder newBuilder() {
    return new no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder();
  }

  /**
   * Creates a new JourneyPatternServiceLinks RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new JourneyPatternServiceLinks RecordBuilder
   */
  public static no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder newBuilder(no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder other) {
    return new no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder(other);
  }

  /**
   * Creates a new JourneyPatternServiceLinks RecordBuilder by copying an existing JourneyPatternServiceLinks instance.
   * @param other The existing instance to copy.
   * @return A new JourneyPatternServiceLinks RecordBuilder
   */
  public static no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder newBuilder(no.ruter.events.avro.tps.JourneyPatternServiceLinks other) {
    return new no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder(other);
  }

  /**
   * RecordBuilder for JourneyPatternServiceLinks instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<JourneyPatternServiceLinks>
    implements org.apache.avro.data.RecordBuilder<JourneyPatternServiceLinks> {

    private java.lang.CharSequence journeyPatternID;
    private no.ruter.events.avro.tps.Route route;
    private no.ruter.events.avro.tps.Route.Builder routeBuilder;
    private java.util.List<no.ruter.events.avro.tps.ServiceLink> servicelinks;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.journeyPatternID)) {
        this.journeyPatternID = data().deepCopy(fields()[0].schema(), other.journeyPatternID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.route)) {
        this.route = data().deepCopy(fields()[1].schema(), other.route);
        fieldSetFlags()[1] = true;
      }
      if (other.hasRouteBuilder()) {
        this.routeBuilder = no.ruter.events.avro.tps.Route.newBuilder(other.getRouteBuilder());
      }
      if (isValidValue(fields()[2], other.servicelinks)) {
        this.servicelinks = data().deepCopy(fields()[2].schema(), other.servicelinks);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing JourneyPatternServiceLinks instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.events.avro.tps.JourneyPatternServiceLinks other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.journeyPatternID)) {
        this.journeyPatternID = data().deepCopy(fields()[0].schema(), other.journeyPatternID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.route)) {
        this.route = data().deepCopy(fields()[1].schema(), other.route);
        fieldSetFlags()[1] = true;
      }
      this.routeBuilder = null;
      if (isValidValue(fields()[2], other.servicelinks)) {
        this.servicelinks = data().deepCopy(fields()[2].schema(), other.servicelinks);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'journeyPatternID' field.
      * @return The value.
      */
    public java.lang.CharSequence getJourneyPatternID() {
      return journeyPatternID;
    }

    /**
      * Sets the value of the 'journeyPatternID' field.
      * @param value The value of 'journeyPatternID'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder setJourneyPatternID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.journeyPatternID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'journeyPatternID' field has been set.
      * @return True if the 'journeyPatternID' field has been set, false otherwise.
      */
    public boolean hasJourneyPatternID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'journeyPatternID' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder clearJourneyPatternID() {
      journeyPatternID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'route' field.
      * @return The value.
      */
    public no.ruter.events.avro.tps.Route getRoute() {
      return route;
    }

    /**
      * Sets the value of the 'route' field.
      * @param value The value of 'route'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder setRoute(no.ruter.events.avro.tps.Route value) {
      validate(fields()[1], value);
      this.routeBuilder = null;
      this.route = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'route' field has been set.
      * @return True if the 'route' field has been set, false otherwise.
      */
    public boolean hasRoute() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'route' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public no.ruter.events.avro.tps.Route.Builder getRouteBuilder() {
      if (routeBuilder == null) {
        if (hasRoute()) {
          setRouteBuilder(no.ruter.events.avro.tps.Route.newBuilder(route));
        } else {
          setRouteBuilder(no.ruter.events.avro.tps.Route.newBuilder());
        }
      }
      return routeBuilder;
    }

    /**
     * Sets the Builder instance for the 'route' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder setRouteBuilder(no.ruter.events.avro.tps.Route.Builder value) {
      clearRoute();
      routeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'route' field has an active Builder instance
     * @return True if the 'route' field has an active Builder instance
     */
    public boolean hasRouteBuilder() {
      return routeBuilder != null;
    }

    /**
      * Clears the value of the 'route' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder clearRoute() {
      route = null;
      routeBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'servicelinks' field.
      * @return The value.
      */
    public java.util.List<no.ruter.events.avro.tps.ServiceLink> getServicelinks() {
      return servicelinks;
    }

    /**
      * Sets the value of the 'servicelinks' field.
      * @param value The value of 'servicelinks'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder setServicelinks(java.util.List<no.ruter.events.avro.tps.ServiceLink> value) {
      validate(fields()[2], value);
      this.servicelinks = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'servicelinks' field has been set.
      * @return True if the 'servicelinks' field has been set, false otherwise.
      */
    public boolean hasServicelinks() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'servicelinks' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.JourneyPatternServiceLinks.Builder clearServicelinks() {
      servicelinks = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public JourneyPatternServiceLinks build() {
      try {
        JourneyPatternServiceLinks record = new JourneyPatternServiceLinks();
        record.journeyPatternID = fieldSetFlags()[0] ? this.journeyPatternID : (java.lang.CharSequence) defaultValue(fields()[0]);
        if (routeBuilder != null) {
          record.route = this.routeBuilder.build();
        } else {
          record.route = fieldSetFlags()[1] ? this.route : (no.ruter.events.avro.tps.Route) defaultValue(fields()[1]);
        }
        record.servicelinks = fieldSetFlags()[2] ? this.servicelinks : (java.util.List<no.ruter.events.avro.tps.ServiceLink>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<JourneyPatternServiceLinks>
    WRITER$ = (org.apache.avro.io.DatumWriter<JourneyPatternServiceLinks>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<JourneyPatternServiceLinks>
    READER$ = (org.apache.avro.io.DatumReader<JourneyPatternServiceLinks>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
