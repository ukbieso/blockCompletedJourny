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
/** Position */
@org.apache.avro.specific.AvroGenerated
public class Position extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5280877770472443621L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Position\",\"namespace\":\"no.ruter.events.avro.tps\",\"doc\":\"Position\",\"fields\":[{\"name\":\"lat\",\"type\":\"double\"},{\"name\":\"lon\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Position> ENCODER =
      new BinaryMessageEncoder<Position>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Position> DECODER =
      new BinaryMessageDecoder<Position>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Position> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Position> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Position>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Position to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Position from a ByteBuffer. */
  public static Position fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public double lat;
  @Deprecated public double lon;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Position() {}

  /**
   * All-args constructor.
   * @param lat The new value for lat
   * @param lon The new value for lon
   */
  public Position(java.lang.Double lat, java.lang.Double lon) {
    this.lat = lat;
    this.lon = lon;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return lat;
    case 1: return lon;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: lat = (java.lang.Double)value$; break;
    case 1: lon = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'lat' field.
   * @return The value of the 'lat' field.
   */
  public java.lang.Double getLat() {
    return lat;
  }

  /**
   * Sets the value of the 'lat' field.
   * @param value the value to set.
   */
  public void setLat(java.lang.Double value) {
    this.lat = value;
  }

  /**
   * Gets the value of the 'lon' field.
   * @return The value of the 'lon' field.
   */
  public java.lang.Double getLon() {
    return lon;
  }

  /**
   * Sets the value of the 'lon' field.
   * @param value the value to set.
   */
  public void setLon(java.lang.Double value) {
    this.lon = value;
  }

  /**
   * Creates a new Position RecordBuilder.
   * @return A new Position RecordBuilder
   */
  public static no.ruter.events.avro.tps.Position.Builder newBuilder() {
    return new no.ruter.events.avro.tps.Position.Builder();
  }

  /**
   * Creates a new Position RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Position RecordBuilder
   */
  public static no.ruter.events.avro.tps.Position.Builder newBuilder(no.ruter.events.avro.tps.Position.Builder other) {
    return new no.ruter.events.avro.tps.Position.Builder(other);
  }

  /**
   * Creates a new Position RecordBuilder by copying an existing Position instance.
   * @param other The existing instance to copy.
   * @return A new Position RecordBuilder
   */
  public static no.ruter.events.avro.tps.Position.Builder newBuilder(no.ruter.events.avro.tps.Position other) {
    return new no.ruter.events.avro.tps.Position.Builder(other);
  }

  /**
   * RecordBuilder for Position instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Position>
    implements org.apache.avro.data.RecordBuilder<Position> {

    private double lat;
    private double lon;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.events.avro.tps.Position.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.lat)) {
        this.lat = data().deepCopy(fields()[0].schema(), other.lat);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lon)) {
        this.lon = data().deepCopy(fields()[1].schema(), other.lon);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Position instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.events.avro.tps.Position other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.lat)) {
        this.lat = data().deepCopy(fields()[0].schema(), other.lat);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lon)) {
        this.lon = data().deepCopy(fields()[1].schema(), other.lon);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'lat' field.
      * @return The value.
      */
    public java.lang.Double getLat() {
      return lat;
    }

    /**
      * Sets the value of the 'lat' field.
      * @param value The value of 'lat'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Position.Builder setLat(double value) {
      validate(fields()[0], value);
      this.lat = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'lat' field has been set.
      * @return True if the 'lat' field has been set, false otherwise.
      */
    public boolean hasLat() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'lat' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Position.Builder clearLat() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lon' field.
      * @return The value.
      */
    public java.lang.Double getLon() {
      return lon;
    }

    /**
      * Sets the value of the 'lon' field.
      * @param value The value of 'lon'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Position.Builder setLon(double value) {
      validate(fields()[1], value);
      this.lon = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lon' field has been set.
      * @return True if the 'lon' field has been set, false otherwise.
      */
    public boolean hasLon() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lon' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Position.Builder clearLon() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Position build() {
      try {
        Position record = new Position();
        record.lat = fieldSetFlags()[0] ? this.lat : (java.lang.Double) defaultValue(fields()[0]);
        record.lon = fieldSetFlags()[1] ? this.lon : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Position>
    WRITER$ = (org.apache.avro.io.DatumWriter<Position>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Position>
    READER$ = (org.apache.avro.io.DatumReader<Position>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
