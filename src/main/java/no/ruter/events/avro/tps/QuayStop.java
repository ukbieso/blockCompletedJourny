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
/** Quay with Stop Place */
@org.apache.avro.specific.AvroGenerated
public class QuayStop extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8860345219887548866L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"QuayStop\",\"namespace\":\"no.ruter.events.avro.tps\",\"doc\":\"Quay with Stop Place\",\"fields\":[{\"name\":\"stopId\",\"type\":\"string\"},{\"name\":\"stopName\",\"type\":\"string\"},{\"name\":\"quayId\",\"type\":\"string\"},{\"name\":\"position\",\"type\":{\"type\":\"record\",\"name\":\"Position\",\"doc\":\"Position\",\"fields\":[{\"name\":\"lat\",\"type\":\"double\"},{\"name\":\"lon\",\"type\":\"double\"}]}},{\"name\":\"order\",\"type\":\"int\"},{\"name\":\"arrivalTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"departureTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"quayOldId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"destinationDisplay\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"destinationDisplayVia\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<QuayStop> ENCODER =
      new BinaryMessageEncoder<QuayStop>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<QuayStop> DECODER =
      new BinaryMessageDecoder<QuayStop>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<QuayStop> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<QuayStop> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<QuayStop>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this QuayStop to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a QuayStop from a ByteBuffer. */
  public static QuayStop fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence stopId;
  @Deprecated public java.lang.CharSequence stopName;
  @Deprecated public java.lang.CharSequence quayId;
  @Deprecated public no.ruter.events.avro.tps.Position position;
  @Deprecated public int order;
  @Deprecated public java.lang.Long arrivalTime;
  @Deprecated public java.lang.Long departureTime;
  @Deprecated public java.lang.CharSequence quayOldId;
  @Deprecated public java.lang.CharSequence destinationDisplay;
  @Deprecated public java.lang.CharSequence destinationDisplayVia;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public QuayStop() {}

  /**
   * All-args constructor.
   * @param stopId The new value for stopId
   * @param stopName The new value for stopName
   * @param quayId The new value for quayId
   * @param position The new value for position
   * @param order The new value for order
   * @param arrivalTime The new value for arrivalTime
   * @param departureTime The new value for departureTime
   * @param quayOldId The new value for quayOldId
   * @param destinationDisplay The new value for destinationDisplay
   * @param destinationDisplayVia The new value for destinationDisplayVia
   */
  public QuayStop(java.lang.CharSequence stopId, java.lang.CharSequence stopName, java.lang.CharSequence quayId, no.ruter.events.avro.tps.Position position, java.lang.Integer order, java.lang.Long arrivalTime, java.lang.Long departureTime, java.lang.CharSequence quayOldId, java.lang.CharSequence destinationDisplay, java.lang.CharSequence destinationDisplayVia) {
    this.stopId = stopId;
    this.stopName = stopName;
    this.quayId = quayId;
    this.position = position;
    this.order = order;
    this.arrivalTime = arrivalTime;
    this.departureTime = departureTime;
    this.quayOldId = quayOldId;
    this.destinationDisplay = destinationDisplay;
    this.destinationDisplayVia = destinationDisplayVia;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return stopId;
    case 1: return stopName;
    case 2: return quayId;
    case 3: return position;
    case 4: return order;
    case 5: return arrivalTime;
    case 6: return departureTime;
    case 7: return quayOldId;
    case 8: return destinationDisplay;
    case 9: return destinationDisplayVia;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: stopId = (java.lang.CharSequence)value$; break;
    case 1: stopName = (java.lang.CharSequence)value$; break;
    case 2: quayId = (java.lang.CharSequence)value$; break;
    case 3: position = (no.ruter.events.avro.tps.Position)value$; break;
    case 4: order = (java.lang.Integer)value$; break;
    case 5: arrivalTime = (java.lang.Long)value$; break;
    case 6: departureTime = (java.lang.Long)value$; break;
    case 7: quayOldId = (java.lang.CharSequence)value$; break;
    case 8: destinationDisplay = (java.lang.CharSequence)value$; break;
    case 9: destinationDisplayVia = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'stopId' field.
   * @return The value of the 'stopId' field.
   */
  public java.lang.CharSequence getStopId() {
    return stopId;
  }

  /**
   * Sets the value of the 'stopId' field.
   * @param value the value to set.
   */
  public void setStopId(java.lang.CharSequence value) {
    this.stopId = value;
  }

  /**
   * Gets the value of the 'stopName' field.
   * @return The value of the 'stopName' field.
   */
  public java.lang.CharSequence getStopName() {
    return stopName;
  }

  /**
   * Sets the value of the 'stopName' field.
   * @param value the value to set.
   */
  public void setStopName(java.lang.CharSequence value) {
    this.stopName = value;
  }

  /**
   * Gets the value of the 'quayId' field.
   * @return The value of the 'quayId' field.
   */
  public java.lang.CharSequence getQuayId() {
    return quayId;
  }

  /**
   * Sets the value of the 'quayId' field.
   * @param value the value to set.
   */
  public void setQuayId(java.lang.CharSequence value) {
    this.quayId = value;
  }

  /**
   * Gets the value of the 'position' field.
   * @return The value of the 'position' field.
   */
  public no.ruter.events.avro.tps.Position getPosition() {
    return position;
  }

  /**
   * Sets the value of the 'position' field.
   * @param value the value to set.
   */
  public void setPosition(no.ruter.events.avro.tps.Position value) {
    this.position = value;
  }

  /**
   * Gets the value of the 'order' field.
   * @return The value of the 'order' field.
   */
  public java.lang.Integer getOrder() {
    return order;
  }

  /**
   * Sets the value of the 'order' field.
   * @param value the value to set.
   */
  public void setOrder(java.lang.Integer value) {
    this.order = value;
  }

  /**
   * Gets the value of the 'arrivalTime' field.
   * @return The value of the 'arrivalTime' field.
   */
  public java.lang.Long getArrivalTime() {
    return arrivalTime;
  }

  /**
   * Sets the value of the 'arrivalTime' field.
   * @param value the value to set.
   */
  public void setArrivalTime(java.lang.Long value) {
    this.arrivalTime = value;
  }

  /**
   * Gets the value of the 'departureTime' field.
   * @return The value of the 'departureTime' field.
   */
  public java.lang.Long getDepartureTime() {
    return departureTime;
  }

  /**
   * Sets the value of the 'departureTime' field.
   * @param value the value to set.
   */
  public void setDepartureTime(java.lang.Long value) {
    this.departureTime = value;
  }

  /**
   * Gets the value of the 'quayOldId' field.
   * @return The value of the 'quayOldId' field.
   */
  public java.lang.CharSequence getQuayOldId() {
    return quayOldId;
  }

  /**
   * Sets the value of the 'quayOldId' field.
   * @param value the value to set.
   */
  public void setQuayOldId(java.lang.CharSequence value) {
    this.quayOldId = value;
  }

  /**
   * Gets the value of the 'destinationDisplay' field.
   * @return The value of the 'destinationDisplay' field.
   */
  public java.lang.CharSequence getDestinationDisplay() {
    return destinationDisplay;
  }

  /**
   * Sets the value of the 'destinationDisplay' field.
   * @param value the value to set.
   */
  public void setDestinationDisplay(java.lang.CharSequence value) {
    this.destinationDisplay = value;
  }

  /**
   * Gets the value of the 'destinationDisplayVia' field.
   * @return The value of the 'destinationDisplayVia' field.
   */
  public java.lang.CharSequence getDestinationDisplayVia() {
    return destinationDisplayVia;
  }

  /**
   * Sets the value of the 'destinationDisplayVia' field.
   * @param value the value to set.
   */
  public void setDestinationDisplayVia(java.lang.CharSequence value) {
    this.destinationDisplayVia = value;
  }

  /**
   * Creates a new QuayStop RecordBuilder.
   * @return A new QuayStop RecordBuilder
   */
  public static no.ruter.events.avro.tps.QuayStop.Builder newBuilder() {
    return new no.ruter.events.avro.tps.QuayStop.Builder();
  }

  /**
   * Creates a new QuayStop RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new QuayStop RecordBuilder
   */
  public static no.ruter.events.avro.tps.QuayStop.Builder newBuilder(no.ruter.events.avro.tps.QuayStop.Builder other) {
    return new no.ruter.events.avro.tps.QuayStop.Builder(other);
  }

  /**
   * Creates a new QuayStop RecordBuilder by copying an existing QuayStop instance.
   * @param other The existing instance to copy.
   * @return A new QuayStop RecordBuilder
   */
  public static no.ruter.events.avro.tps.QuayStop.Builder newBuilder(no.ruter.events.avro.tps.QuayStop other) {
    return new no.ruter.events.avro.tps.QuayStop.Builder(other);
  }

  /**
   * RecordBuilder for QuayStop instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<QuayStop>
    implements org.apache.avro.data.RecordBuilder<QuayStop> {

    private java.lang.CharSequence stopId;
    private java.lang.CharSequence stopName;
    private java.lang.CharSequence quayId;
    private no.ruter.events.avro.tps.Position position;
    private no.ruter.events.avro.tps.Position.Builder positionBuilder;
    private int order;
    private java.lang.Long arrivalTime;
    private java.lang.Long departureTime;
    private java.lang.CharSequence quayOldId;
    private java.lang.CharSequence destinationDisplay;
    private java.lang.CharSequence destinationDisplayVia;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.events.avro.tps.QuayStop.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.stopId)) {
        this.stopId = data().deepCopy(fields()[0].schema(), other.stopId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.stopName)) {
        this.stopName = data().deepCopy(fields()[1].schema(), other.stopName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quayId)) {
        this.quayId = data().deepCopy(fields()[2].schema(), other.quayId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.position)) {
        this.position = data().deepCopy(fields()[3].schema(), other.position);
        fieldSetFlags()[3] = true;
      }
      if (other.hasPositionBuilder()) {
        this.positionBuilder = no.ruter.events.avro.tps.Position.newBuilder(other.getPositionBuilder());
      }
      if (isValidValue(fields()[4], other.order)) {
        this.order = data().deepCopy(fields()[4].schema(), other.order);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.arrivalTime)) {
        this.arrivalTime = data().deepCopy(fields()[5].schema(), other.arrivalTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.departureTime)) {
        this.departureTime = data().deepCopy(fields()[6].schema(), other.departureTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.quayOldId)) {
        this.quayOldId = data().deepCopy(fields()[7].schema(), other.quayOldId);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.destinationDisplay)) {
        this.destinationDisplay = data().deepCopy(fields()[8].schema(), other.destinationDisplay);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.destinationDisplayVia)) {
        this.destinationDisplayVia = data().deepCopy(fields()[9].schema(), other.destinationDisplayVia);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing QuayStop instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.events.avro.tps.QuayStop other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.stopId)) {
        this.stopId = data().deepCopy(fields()[0].schema(), other.stopId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.stopName)) {
        this.stopName = data().deepCopy(fields()[1].schema(), other.stopName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quayId)) {
        this.quayId = data().deepCopy(fields()[2].schema(), other.quayId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.position)) {
        this.position = data().deepCopy(fields()[3].schema(), other.position);
        fieldSetFlags()[3] = true;
      }
      this.positionBuilder = null;
      if (isValidValue(fields()[4], other.order)) {
        this.order = data().deepCopy(fields()[4].schema(), other.order);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.arrivalTime)) {
        this.arrivalTime = data().deepCopy(fields()[5].schema(), other.arrivalTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.departureTime)) {
        this.departureTime = data().deepCopy(fields()[6].schema(), other.departureTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.quayOldId)) {
        this.quayOldId = data().deepCopy(fields()[7].schema(), other.quayOldId);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.destinationDisplay)) {
        this.destinationDisplay = data().deepCopy(fields()[8].schema(), other.destinationDisplay);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.destinationDisplayVia)) {
        this.destinationDisplayVia = data().deepCopy(fields()[9].schema(), other.destinationDisplayVia);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'stopId' field.
      * @return The value.
      */
    public java.lang.CharSequence getStopId() {
      return stopId;
    }

    /**
      * Sets the value of the 'stopId' field.
      * @param value The value of 'stopId'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setStopId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.stopId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'stopId' field has been set.
      * @return True if the 'stopId' field has been set, false otherwise.
      */
    public boolean hasStopId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'stopId' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearStopId() {
      stopId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'stopName' field.
      * @return The value.
      */
    public java.lang.CharSequence getStopName() {
      return stopName;
    }

    /**
      * Sets the value of the 'stopName' field.
      * @param value The value of 'stopName'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setStopName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.stopName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'stopName' field has been set.
      * @return True if the 'stopName' field has been set, false otherwise.
      */
    public boolean hasStopName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'stopName' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearStopName() {
      stopName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'quayId' field.
      * @return The value.
      */
    public java.lang.CharSequence getQuayId() {
      return quayId;
    }

    /**
      * Sets the value of the 'quayId' field.
      * @param value The value of 'quayId'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setQuayId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.quayId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'quayId' field has been set.
      * @return True if the 'quayId' field has been set, false otherwise.
      */
    public boolean hasQuayId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'quayId' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearQuayId() {
      quayId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'position' field.
      * @return The value.
      */
    public no.ruter.events.avro.tps.Position getPosition() {
      return position;
    }

    /**
      * Sets the value of the 'position' field.
      * @param value The value of 'position'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setPosition(no.ruter.events.avro.tps.Position value) {
      validate(fields()[3], value);
      this.positionBuilder = null;
      this.position = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'position' field has been set.
      * @return True if the 'position' field has been set, false otherwise.
      */
    public boolean hasPosition() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'position' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public no.ruter.events.avro.tps.Position.Builder getPositionBuilder() {
      if (positionBuilder == null) {
        if (hasPosition()) {
          setPositionBuilder(no.ruter.events.avro.tps.Position.newBuilder(position));
        } else {
          setPositionBuilder(no.ruter.events.avro.tps.Position.newBuilder());
        }
      }
      return positionBuilder;
    }

    /**
     * Sets the Builder instance for the 'position' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public no.ruter.events.avro.tps.QuayStop.Builder setPositionBuilder(no.ruter.events.avro.tps.Position.Builder value) {
      clearPosition();
      positionBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'position' field has an active Builder instance
     * @return True if the 'position' field has an active Builder instance
     */
    public boolean hasPositionBuilder() {
      return positionBuilder != null;
    }

    /**
      * Clears the value of the 'position' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearPosition() {
      position = null;
      positionBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'order' field.
      * @return The value.
      */
    public java.lang.Integer getOrder() {
      return order;
    }

    /**
      * Sets the value of the 'order' field.
      * @param value The value of 'order'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setOrder(int value) {
      validate(fields()[4], value);
      this.order = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'order' field has been set.
      * @return True if the 'order' field has been set, false otherwise.
      */
    public boolean hasOrder() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'order' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearOrder() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'arrivalTime' field.
      * @return The value.
      */
    public java.lang.Long getArrivalTime() {
      return arrivalTime;
    }

    /**
      * Sets the value of the 'arrivalTime' field.
      * @param value The value of 'arrivalTime'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setArrivalTime(java.lang.Long value) {
      validate(fields()[5], value);
      this.arrivalTime = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'arrivalTime' field has been set.
      * @return True if the 'arrivalTime' field has been set, false otherwise.
      */
    public boolean hasArrivalTime() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'arrivalTime' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearArrivalTime() {
      arrivalTime = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'departureTime' field.
      * @return The value.
      */
    public java.lang.Long getDepartureTime() {
      return departureTime;
    }

    /**
      * Sets the value of the 'departureTime' field.
      * @param value The value of 'departureTime'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setDepartureTime(java.lang.Long value) {
      validate(fields()[6], value);
      this.departureTime = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'departureTime' field has been set.
      * @return True if the 'departureTime' field has been set, false otherwise.
      */
    public boolean hasDepartureTime() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'departureTime' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearDepartureTime() {
      departureTime = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'quayOldId' field.
      * @return The value.
      */
    public java.lang.CharSequence getQuayOldId() {
      return quayOldId;
    }

    /**
      * Sets the value of the 'quayOldId' field.
      * @param value The value of 'quayOldId'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setQuayOldId(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.quayOldId = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'quayOldId' field has been set.
      * @return True if the 'quayOldId' field has been set, false otherwise.
      */
    public boolean hasQuayOldId() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'quayOldId' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearQuayOldId() {
      quayOldId = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'destinationDisplay' field.
      * @return The value.
      */
    public java.lang.CharSequence getDestinationDisplay() {
      return destinationDisplay;
    }

    /**
      * Sets the value of the 'destinationDisplay' field.
      * @param value The value of 'destinationDisplay'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setDestinationDisplay(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.destinationDisplay = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'destinationDisplay' field has been set.
      * @return True if the 'destinationDisplay' field has been set, false otherwise.
      */
    public boolean hasDestinationDisplay() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'destinationDisplay' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearDestinationDisplay() {
      destinationDisplay = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'destinationDisplayVia' field.
      * @return The value.
      */
    public java.lang.CharSequence getDestinationDisplayVia() {
      return destinationDisplayVia;
    }

    /**
      * Sets the value of the 'destinationDisplayVia' field.
      * @param value The value of 'destinationDisplayVia'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder setDestinationDisplayVia(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.destinationDisplayVia = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'destinationDisplayVia' field has been set.
      * @return True if the 'destinationDisplayVia' field has been set, false otherwise.
      */
    public boolean hasDestinationDisplayVia() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'destinationDisplayVia' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.QuayStop.Builder clearDestinationDisplayVia() {
      destinationDisplayVia = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public QuayStop build() {
      try {
        QuayStop record = new QuayStop();
        record.stopId = fieldSetFlags()[0] ? this.stopId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.stopName = fieldSetFlags()[1] ? this.stopName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.quayId = fieldSetFlags()[2] ? this.quayId : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (positionBuilder != null) {
          record.position = this.positionBuilder.build();
        } else {
          record.position = fieldSetFlags()[3] ? this.position : (no.ruter.events.avro.tps.Position) defaultValue(fields()[3]);
        }
        record.order = fieldSetFlags()[4] ? this.order : (java.lang.Integer) defaultValue(fields()[4]);
        record.arrivalTime = fieldSetFlags()[5] ? this.arrivalTime : (java.lang.Long) defaultValue(fields()[5]);
        record.departureTime = fieldSetFlags()[6] ? this.departureTime : (java.lang.Long) defaultValue(fields()[6]);
        record.quayOldId = fieldSetFlags()[7] ? this.quayOldId : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.destinationDisplay = fieldSetFlags()[8] ? this.destinationDisplay : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.destinationDisplayVia = fieldSetFlags()[9] ? this.destinationDisplayVia : (java.lang.CharSequence) defaultValue(fields()[9]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<QuayStop>
    WRITER$ = (org.apache.avro.io.DatumWriter<QuayStop>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<QuayStop>
    READER$ = (org.apache.avro.io.DatumReader<QuayStop>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
