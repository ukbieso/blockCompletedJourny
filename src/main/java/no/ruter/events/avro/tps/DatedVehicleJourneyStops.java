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
/** TPS ServiceJourney with Stops and Quays */
@org.apache.avro.specific.AvroGenerated
public class DatedVehicleJourneyStops extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6563698529347324301L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DatedVehicleJourneyStops\",\"namespace\":\"no.ruter.events.avro.tps\",\"doc\":\"TPS ServiceJourney with Stops and Quays\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"date\",\"type\":\"string\"},{\"name\":\"routeName\",\"type\":\"string\"},{\"name\":\"routeId\",\"type\":\"string\"},{\"name\":\"journeyPattern\",\"type\":\"string\"},{\"name\":\"blockRef\",\"type\":\"string\"},{\"name\":\"hastusBlockId\",\"type\":\"string\"},{\"name\":\"originAimedDepartureTime\",\"type\":\"string\"},{\"name\":\"lineId\",\"type\":\"string\"},{\"name\":\"linePublicCode\",\"type\":\"string\"},{\"name\":\"order\",\"type\":\"int\"},{\"name\":\"totalJourneys\",\"type\":\"int\"},{\"name\":\"quayStops\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"QuayStop\",\"doc\":\"Quay with Stop Place\",\"fields\":[{\"name\":\"stopId\",\"type\":\"string\"},{\"name\":\"stopName\",\"type\":\"string\"},{\"name\":\"quayId\",\"type\":\"string\"},{\"name\":\"position\",\"type\":{\"type\":\"record\",\"name\":\"Position\",\"doc\":\"Position\",\"fields\":[{\"name\":\"lat\",\"type\":\"double\"},{\"name\":\"lon\",\"type\":\"double\"}]}},{\"name\":\"order\",\"type\":\"int\"},{\"name\":\"arrivalTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"departureTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"quayOldId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"destinationDisplay\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"destinationDisplayVia\",\"type\":[\"null\",\"string\"],\"default\":null}]}}},{\"name\":\"journeyRef\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DatedVehicleJourneyStops> ENCODER =
      new BinaryMessageEncoder<DatedVehicleJourneyStops>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DatedVehicleJourneyStops> DECODER =
      new BinaryMessageDecoder<DatedVehicleJourneyStops>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<DatedVehicleJourneyStops> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<DatedVehicleJourneyStops> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DatedVehicleJourneyStops>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this DatedVehicleJourneyStops to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a DatedVehicleJourneyStops from a ByteBuffer. */
  public static DatedVehicleJourneyStops fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence date;
  @Deprecated public java.lang.CharSequence routeName;
  @Deprecated public java.lang.CharSequence routeId;
  @Deprecated public java.lang.CharSequence journeyPattern;
  @Deprecated public java.lang.CharSequence blockRef;
  @Deprecated public java.lang.CharSequence hastusBlockId;
  @Deprecated public java.lang.CharSequence originAimedDepartureTime;
  @Deprecated public java.lang.CharSequence lineId;
  @Deprecated public java.lang.CharSequence linePublicCode;
  @Deprecated public int order;
  @Deprecated public int totalJourneys;
  @Deprecated public java.util.List<no.ruter.events.avro.tps.QuayStop> quayStops;
  @Deprecated public java.lang.CharSequence journeyRef;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DatedVehicleJourneyStops() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param date The new value for date
   * @param routeName The new value for routeName
   * @param routeId The new value for routeId
   * @param journeyPattern The new value for journeyPattern
   * @param blockRef The new value for blockRef
   * @param hastusBlockId The new value for hastusBlockId
   * @param originAimedDepartureTime The new value for originAimedDepartureTime
   * @param lineId The new value for lineId
   * @param linePublicCode The new value for linePublicCode
   * @param order The new value for order
   * @param totalJourneys The new value for totalJourneys
   * @param quayStops The new value for quayStops
   * @param journeyRef The new value for journeyRef
   */
  public DatedVehicleJourneyStops(java.lang.CharSequence id, java.lang.CharSequence date, java.lang.CharSequence routeName, java.lang.CharSequence routeId, java.lang.CharSequence journeyPattern, java.lang.CharSequence blockRef, java.lang.CharSequence hastusBlockId, java.lang.CharSequence originAimedDepartureTime, java.lang.CharSequence lineId, java.lang.CharSequence linePublicCode, java.lang.Integer order, java.lang.Integer totalJourneys, java.util.List<no.ruter.events.avro.tps.QuayStop> quayStops, java.lang.CharSequence journeyRef) {
    this.id = id;
    this.date = date;
    this.routeName = routeName;
    this.routeId = routeId;
    this.journeyPattern = journeyPattern;
    this.blockRef = blockRef;
    this.hastusBlockId = hastusBlockId;
    this.originAimedDepartureTime = originAimedDepartureTime;
    this.lineId = lineId;
    this.linePublicCode = linePublicCode;
    this.order = order;
    this.totalJourneys = totalJourneys;
    this.quayStops = quayStops;
    this.journeyRef = journeyRef;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return date;
    case 2: return routeName;
    case 3: return routeId;
    case 4: return journeyPattern;
    case 5: return blockRef;
    case 6: return hastusBlockId;
    case 7: return originAimedDepartureTime;
    case 8: return lineId;
    case 9: return linePublicCode;
    case 10: return order;
    case 11: return totalJourneys;
    case 12: return quayStops;
    case 13: return journeyRef;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: date = (java.lang.CharSequence)value$; break;
    case 2: routeName = (java.lang.CharSequence)value$; break;
    case 3: routeId = (java.lang.CharSequence)value$; break;
    case 4: journeyPattern = (java.lang.CharSequence)value$; break;
    case 5: blockRef = (java.lang.CharSequence)value$; break;
    case 6: hastusBlockId = (java.lang.CharSequence)value$; break;
    case 7: originAimedDepartureTime = (java.lang.CharSequence)value$; break;
    case 8: lineId = (java.lang.CharSequence)value$; break;
    case 9: linePublicCode = (java.lang.CharSequence)value$; break;
    case 10: order = (java.lang.Integer)value$; break;
    case 11: totalJourneys = (java.lang.Integer)value$; break;
    case 12: quayStops = (java.util.List<no.ruter.events.avro.tps.QuayStop>)value$; break;
    case 13: journeyRef = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'date' field.
   * @return The value of the 'date' field.
   */
  public java.lang.CharSequence getDate() {
    return date;
  }

  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'routeName' field.
   * @return The value of the 'routeName' field.
   */
  public java.lang.CharSequence getRouteName() {
    return routeName;
  }

  /**
   * Sets the value of the 'routeName' field.
   * @param value the value to set.
   */
  public void setRouteName(java.lang.CharSequence value) {
    this.routeName = value;
  }

  /**
   * Gets the value of the 'routeId' field.
   * @return The value of the 'routeId' field.
   */
  public java.lang.CharSequence getRouteId() {
    return routeId;
  }

  /**
   * Sets the value of the 'routeId' field.
   * @param value the value to set.
   */
  public void setRouteId(java.lang.CharSequence value) {
    this.routeId = value;
  }

  /**
   * Gets the value of the 'journeyPattern' field.
   * @return The value of the 'journeyPattern' field.
   */
  public java.lang.CharSequence getJourneyPattern() {
    return journeyPattern;
  }

  /**
   * Sets the value of the 'journeyPattern' field.
   * @param value the value to set.
   */
  public void setJourneyPattern(java.lang.CharSequence value) {
    this.journeyPattern = value;
  }

  /**
   * Gets the value of the 'blockRef' field.
   * @return The value of the 'blockRef' field.
   */
  public java.lang.CharSequence getBlockRef() {
    return blockRef;
  }

  /**
   * Sets the value of the 'blockRef' field.
   * @param value the value to set.
   */
  public void setBlockRef(java.lang.CharSequence value) {
    this.blockRef = value;
  }

  /**
   * Gets the value of the 'hastusBlockId' field.
   * @return The value of the 'hastusBlockId' field.
   */
  public java.lang.CharSequence getHastusBlockId() {
    return hastusBlockId;
  }

  /**
   * Sets the value of the 'hastusBlockId' field.
   * @param value the value to set.
   */
  public void setHastusBlockId(java.lang.CharSequence value) {
    this.hastusBlockId = value;
  }

  /**
   * Gets the value of the 'originAimedDepartureTime' field.
   * @return The value of the 'originAimedDepartureTime' field.
   */
  public java.lang.CharSequence getOriginAimedDepartureTime() {
    return originAimedDepartureTime;
  }

  /**
   * Sets the value of the 'originAimedDepartureTime' field.
   * @param value the value to set.
   */
  public void setOriginAimedDepartureTime(java.lang.CharSequence value) {
    this.originAimedDepartureTime = value;
  }

  /**
   * Gets the value of the 'lineId' field.
   * @return The value of the 'lineId' field.
   */
  public java.lang.CharSequence getLineId() {
    return lineId;
  }

  /**
   * Sets the value of the 'lineId' field.
   * @param value the value to set.
   */
  public void setLineId(java.lang.CharSequence value) {
    this.lineId = value;
  }

  /**
   * Gets the value of the 'linePublicCode' field.
   * @return The value of the 'linePublicCode' field.
   */
  public java.lang.CharSequence getLinePublicCode() {
    return linePublicCode;
  }

  /**
   * Sets the value of the 'linePublicCode' field.
   * @param value the value to set.
   */
  public void setLinePublicCode(java.lang.CharSequence value) {
    this.linePublicCode = value;
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
   * Gets the value of the 'totalJourneys' field.
   * @return The value of the 'totalJourneys' field.
   */
  public java.lang.Integer getTotalJourneys() {
    return totalJourneys;
  }

  /**
   * Sets the value of the 'totalJourneys' field.
   * @param value the value to set.
   */
  public void setTotalJourneys(java.lang.Integer value) {
    this.totalJourneys = value;
  }

  /**
   * Gets the value of the 'quayStops' field.
   * @return The value of the 'quayStops' field.
   */
  public java.util.List<no.ruter.events.avro.tps.QuayStop> getQuayStops() {
    return quayStops;
  }

  /**
   * Sets the value of the 'quayStops' field.
   * @param value the value to set.
   */
  public void setQuayStops(java.util.List<no.ruter.events.avro.tps.QuayStop> value) {
    this.quayStops = value;
  }

  /**
   * Gets the value of the 'journeyRef' field.
   * @return The value of the 'journeyRef' field.
   */
  public java.lang.CharSequence getJourneyRef() {
    return journeyRef;
  }

  /**
   * Sets the value of the 'journeyRef' field.
   * @param value the value to set.
   */
  public void setJourneyRef(java.lang.CharSequence value) {
    this.journeyRef = value;
  }

  /**
   * Creates a new DatedVehicleJourneyStops RecordBuilder.
   * @return A new DatedVehicleJourneyStops RecordBuilder
   */
  public static no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder newBuilder() {
    return new no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder();
  }

  /**
   * Creates a new DatedVehicleJourneyStops RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DatedVehicleJourneyStops RecordBuilder
   */
  public static no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder newBuilder(no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder other) {
    return new no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder(other);
  }

  /**
   * Creates a new DatedVehicleJourneyStops RecordBuilder by copying an existing DatedVehicleJourneyStops instance.
   * @param other The existing instance to copy.
   * @return A new DatedVehicleJourneyStops RecordBuilder
   */
  public static no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder newBuilder(no.ruter.events.avro.tps.DatedVehicleJourneyStops other) {
    return new no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder(other);
  }

  /**
   * RecordBuilder for DatedVehicleJourneyStops instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DatedVehicleJourneyStops>
    implements org.apache.avro.data.RecordBuilder<DatedVehicleJourneyStops> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence date;
    private java.lang.CharSequence routeName;
    private java.lang.CharSequence routeId;
    private java.lang.CharSequence journeyPattern;
    private java.lang.CharSequence blockRef;
    private java.lang.CharSequence hastusBlockId;
    private java.lang.CharSequence originAimedDepartureTime;
    private java.lang.CharSequence lineId;
    private java.lang.CharSequence linePublicCode;
    private int order;
    private int totalJourneys;
    private java.util.List<no.ruter.events.avro.tps.QuayStop> quayStops;
    private java.lang.CharSequence journeyRef;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.date)) {
        this.date = data().deepCopy(fields()[1].schema(), other.date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.routeName)) {
        this.routeName = data().deepCopy(fields()[2].schema(), other.routeName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.routeId)) {
        this.routeId = data().deepCopy(fields()[3].schema(), other.routeId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.journeyPattern)) {
        this.journeyPattern = data().deepCopy(fields()[4].schema(), other.journeyPattern);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.blockRef)) {
        this.blockRef = data().deepCopy(fields()[5].schema(), other.blockRef);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.hastusBlockId)) {
        this.hastusBlockId = data().deepCopy(fields()[6].schema(), other.hastusBlockId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.originAimedDepartureTime)) {
        this.originAimedDepartureTime = data().deepCopy(fields()[7].schema(), other.originAimedDepartureTime);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.lineId)) {
        this.lineId = data().deepCopy(fields()[8].schema(), other.lineId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.linePublicCode)) {
        this.linePublicCode = data().deepCopy(fields()[9].schema(), other.linePublicCode);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.order)) {
        this.order = data().deepCopy(fields()[10].schema(), other.order);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.totalJourneys)) {
        this.totalJourneys = data().deepCopy(fields()[11].schema(), other.totalJourneys);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.quayStops)) {
        this.quayStops = data().deepCopy(fields()[12].schema(), other.quayStops);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.journeyRef)) {
        this.journeyRef = data().deepCopy(fields()[13].schema(), other.journeyRef);
        fieldSetFlags()[13] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DatedVehicleJourneyStops instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.events.avro.tps.DatedVehicleJourneyStops other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.date)) {
        this.date = data().deepCopy(fields()[1].schema(), other.date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.routeName)) {
        this.routeName = data().deepCopy(fields()[2].schema(), other.routeName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.routeId)) {
        this.routeId = data().deepCopy(fields()[3].schema(), other.routeId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.journeyPattern)) {
        this.journeyPattern = data().deepCopy(fields()[4].schema(), other.journeyPattern);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.blockRef)) {
        this.blockRef = data().deepCopy(fields()[5].schema(), other.blockRef);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.hastusBlockId)) {
        this.hastusBlockId = data().deepCopy(fields()[6].schema(), other.hastusBlockId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.originAimedDepartureTime)) {
        this.originAimedDepartureTime = data().deepCopy(fields()[7].schema(), other.originAimedDepartureTime);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.lineId)) {
        this.lineId = data().deepCopy(fields()[8].schema(), other.lineId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.linePublicCode)) {
        this.linePublicCode = data().deepCopy(fields()[9].schema(), other.linePublicCode);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.order)) {
        this.order = data().deepCopy(fields()[10].schema(), other.order);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.totalJourneys)) {
        this.totalJourneys = data().deepCopy(fields()[11].schema(), other.totalJourneys);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.quayStops)) {
        this.quayStops = data().deepCopy(fields()[12].schema(), other.quayStops);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.journeyRef)) {
        this.journeyRef = data().deepCopy(fields()[13].schema(), other.journeyRef);
        fieldSetFlags()[13] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'date' field.
      * @return The value.
      */
    public java.lang.CharSequence getDate() {
      return date;
    }

    /**
      * Sets the value of the 'date' field.
      * @param value The value of 'date'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.date = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'date' field has been set.
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'date' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearDate() {
      date = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'routeName' field.
      * @return The value.
      */
    public java.lang.CharSequence getRouteName() {
      return routeName;
    }

    /**
      * Sets the value of the 'routeName' field.
      * @param value The value of 'routeName'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setRouteName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.routeName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'routeName' field has been set.
      * @return True if the 'routeName' field has been set, false otherwise.
      */
    public boolean hasRouteName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'routeName' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearRouteName() {
      routeName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'routeId' field.
      * @return The value.
      */
    public java.lang.CharSequence getRouteId() {
      return routeId;
    }

    /**
      * Sets the value of the 'routeId' field.
      * @param value The value of 'routeId'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setRouteId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.routeId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'routeId' field has been set.
      * @return True if the 'routeId' field has been set, false otherwise.
      */
    public boolean hasRouteId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'routeId' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearRouteId() {
      routeId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'journeyPattern' field.
      * @return The value.
      */
    public java.lang.CharSequence getJourneyPattern() {
      return journeyPattern;
    }

    /**
      * Sets the value of the 'journeyPattern' field.
      * @param value The value of 'journeyPattern'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setJourneyPattern(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.journeyPattern = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'journeyPattern' field has been set.
      * @return True if the 'journeyPattern' field has been set, false otherwise.
      */
    public boolean hasJourneyPattern() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'journeyPattern' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearJourneyPattern() {
      journeyPattern = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'blockRef' field.
      * @return The value.
      */
    public java.lang.CharSequence getBlockRef() {
      return blockRef;
    }

    /**
      * Sets the value of the 'blockRef' field.
      * @param value The value of 'blockRef'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setBlockRef(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.blockRef = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'blockRef' field has been set.
      * @return True if the 'blockRef' field has been set, false otherwise.
      */
    public boolean hasBlockRef() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'blockRef' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearBlockRef() {
      blockRef = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'hastusBlockId' field.
      * @return The value.
      */
    public java.lang.CharSequence getHastusBlockId() {
      return hastusBlockId;
    }

    /**
      * Sets the value of the 'hastusBlockId' field.
      * @param value The value of 'hastusBlockId'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setHastusBlockId(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.hastusBlockId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'hastusBlockId' field has been set.
      * @return True if the 'hastusBlockId' field has been set, false otherwise.
      */
    public boolean hasHastusBlockId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'hastusBlockId' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearHastusBlockId() {
      hastusBlockId = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'originAimedDepartureTime' field.
      * @return The value.
      */
    public java.lang.CharSequence getOriginAimedDepartureTime() {
      return originAimedDepartureTime;
    }

    /**
      * Sets the value of the 'originAimedDepartureTime' field.
      * @param value The value of 'originAimedDepartureTime'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setOriginAimedDepartureTime(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.originAimedDepartureTime = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'originAimedDepartureTime' field has been set.
      * @return True if the 'originAimedDepartureTime' field has been set, false otherwise.
      */
    public boolean hasOriginAimedDepartureTime() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'originAimedDepartureTime' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearOriginAimedDepartureTime() {
      originAimedDepartureTime = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'lineId' field.
      * @return The value.
      */
    public java.lang.CharSequence getLineId() {
      return lineId;
    }

    /**
      * Sets the value of the 'lineId' field.
      * @param value The value of 'lineId'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setLineId(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.lineId = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'lineId' field has been set.
      * @return True if the 'lineId' field has been set, false otherwise.
      */
    public boolean hasLineId() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'lineId' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearLineId() {
      lineId = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'linePublicCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getLinePublicCode() {
      return linePublicCode;
    }

    /**
      * Sets the value of the 'linePublicCode' field.
      * @param value The value of 'linePublicCode'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setLinePublicCode(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.linePublicCode = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'linePublicCode' field has been set.
      * @return True if the 'linePublicCode' field has been set, false otherwise.
      */
    public boolean hasLinePublicCode() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'linePublicCode' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearLinePublicCode() {
      linePublicCode = null;
      fieldSetFlags()[9] = false;
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
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setOrder(int value) {
      validate(fields()[10], value);
      this.order = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'order' field has been set.
      * @return True if the 'order' field has been set, false otherwise.
      */
    public boolean hasOrder() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'order' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearOrder() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalJourneys' field.
      * @return The value.
      */
    public java.lang.Integer getTotalJourneys() {
      return totalJourneys;
    }

    /**
      * Sets the value of the 'totalJourneys' field.
      * @param value The value of 'totalJourneys'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setTotalJourneys(int value) {
      validate(fields()[11], value);
      this.totalJourneys = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'totalJourneys' field has been set.
      * @return True if the 'totalJourneys' field has been set, false otherwise.
      */
    public boolean hasTotalJourneys() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'totalJourneys' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearTotalJourneys() {
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'quayStops' field.
      * @return The value.
      */
    public java.util.List<no.ruter.events.avro.tps.QuayStop> getQuayStops() {
      return quayStops;
    }

    /**
      * Sets the value of the 'quayStops' field.
      * @param value The value of 'quayStops'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setQuayStops(java.util.List<no.ruter.events.avro.tps.QuayStop> value) {
      validate(fields()[12], value);
      this.quayStops = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'quayStops' field has been set.
      * @return True if the 'quayStops' field has been set, false otherwise.
      */
    public boolean hasQuayStops() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'quayStops' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearQuayStops() {
      quayStops = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'journeyRef' field.
      * @return The value.
      */
    public java.lang.CharSequence getJourneyRef() {
      return journeyRef;
    }

    /**
      * Sets the value of the 'journeyRef' field.
      * @param value The value of 'journeyRef'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder setJourneyRef(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.journeyRef = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'journeyRef' field has been set.
      * @return True if the 'journeyRef' field has been set, false otherwise.
      */
    public boolean hasJourneyRef() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'journeyRef' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.DatedVehicleJourneyStops.Builder clearJourneyRef() {
      journeyRef = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DatedVehicleJourneyStops build() {
      try {
        DatedVehicleJourneyStops record = new DatedVehicleJourneyStops();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.date = fieldSetFlags()[1] ? this.date : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.routeName = fieldSetFlags()[2] ? this.routeName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.routeId = fieldSetFlags()[3] ? this.routeId : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.journeyPattern = fieldSetFlags()[4] ? this.journeyPattern : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.blockRef = fieldSetFlags()[5] ? this.blockRef : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.hastusBlockId = fieldSetFlags()[6] ? this.hastusBlockId : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.originAimedDepartureTime = fieldSetFlags()[7] ? this.originAimedDepartureTime : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.lineId = fieldSetFlags()[8] ? this.lineId : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.linePublicCode = fieldSetFlags()[9] ? this.linePublicCode : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.order = fieldSetFlags()[10] ? this.order : (java.lang.Integer) defaultValue(fields()[10]);
        record.totalJourneys = fieldSetFlags()[11] ? this.totalJourneys : (java.lang.Integer) defaultValue(fields()[11]);
        record.quayStops = fieldSetFlags()[12] ? this.quayStops : (java.util.List<no.ruter.events.avro.tps.QuayStop>) defaultValue(fields()[12]);
        record.journeyRef = fieldSetFlags()[13] ? this.journeyRef : (java.lang.CharSequence) defaultValue(fields()[13]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DatedVehicleJourneyStops>
    WRITER$ = (org.apache.avro.io.DatumWriter<DatedVehicleJourneyStops>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DatedVehicleJourneyStops>
    READER$ = (org.apache.avro.io.DatumReader<DatedVehicleJourneyStops>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
