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
/** Line */
@org.apache.avro.specific.AvroGenerated
public class Line extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7989389861903865899L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Line\",\"namespace\":\"no.ruter.events.avro.tps\",\"doc\":\"Line\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"publicCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"colour\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"transportMode\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Line> ENCODER =
      new BinaryMessageEncoder<Line>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Line> DECODER =
      new BinaryMessageDecoder<Line>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Line> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Line> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Line>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Line to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Line from a ByteBuffer. */
  public static Line fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence publicCode;
  @Deprecated public java.lang.CharSequence colour;
  @Deprecated public java.lang.CharSequence transportMode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Line() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param publicCode The new value for publicCode
   * @param colour The new value for colour
   * @param transportMode The new value for transportMode
   */
  public Line(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence publicCode, java.lang.CharSequence colour, java.lang.CharSequence transportMode) {
    this.id = id;
    this.name = name;
    this.publicCode = publicCode;
    this.colour = colour;
    this.transportMode = transportMode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return publicCode;
    case 3: return colour;
    case 4: return transportMode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: publicCode = (java.lang.CharSequence)value$; break;
    case 3: colour = (java.lang.CharSequence)value$; break;
    case 4: transportMode = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'publicCode' field.
   * @return The value of the 'publicCode' field.
   */
  public java.lang.CharSequence getPublicCode() {
    return publicCode;
  }

  /**
   * Sets the value of the 'publicCode' field.
   * @param value the value to set.
   */
  public void setPublicCode(java.lang.CharSequence value) {
    this.publicCode = value;
  }

  /**
   * Gets the value of the 'colour' field.
   * @return The value of the 'colour' field.
   */
  public java.lang.CharSequence getColour() {
    return colour;
  }

  /**
   * Sets the value of the 'colour' field.
   * @param value the value to set.
   */
  public void setColour(java.lang.CharSequence value) {
    this.colour = value;
  }

  /**
   * Gets the value of the 'transportMode' field.
   * @return The value of the 'transportMode' field.
   */
  public java.lang.CharSequence getTransportMode() {
    return transportMode;
  }

  /**
   * Sets the value of the 'transportMode' field.
   * @param value the value to set.
   */
  public void setTransportMode(java.lang.CharSequence value) {
    this.transportMode = value;
  }

  /**
   * Creates a new Line RecordBuilder.
   * @return A new Line RecordBuilder
   */
  public static no.ruter.events.avro.tps.Line.Builder newBuilder() {
    return new no.ruter.events.avro.tps.Line.Builder();
  }

  /**
   * Creates a new Line RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Line RecordBuilder
   */
  public static no.ruter.events.avro.tps.Line.Builder newBuilder(no.ruter.events.avro.tps.Line.Builder other) {
    return new no.ruter.events.avro.tps.Line.Builder(other);
  }

  /**
   * Creates a new Line RecordBuilder by copying an existing Line instance.
   * @param other The existing instance to copy.
   * @return A new Line RecordBuilder
   */
  public static no.ruter.events.avro.tps.Line.Builder newBuilder(no.ruter.events.avro.tps.Line other) {
    return new no.ruter.events.avro.tps.Line.Builder(other);
  }

  /**
   * RecordBuilder for Line instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Line>
    implements org.apache.avro.data.RecordBuilder<Line> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence publicCode;
    private java.lang.CharSequence colour;
    private java.lang.CharSequence transportMode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.events.avro.tps.Line.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.publicCode)) {
        this.publicCode = data().deepCopy(fields()[2].schema(), other.publicCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.colour)) {
        this.colour = data().deepCopy(fields()[3].schema(), other.colour);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.transportMode)) {
        this.transportMode = data().deepCopy(fields()[4].schema(), other.transportMode);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Line instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.events.avro.tps.Line other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.publicCode)) {
        this.publicCode = data().deepCopy(fields()[2].schema(), other.publicCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.colour)) {
        this.colour = data().deepCopy(fields()[3].schema(), other.colour);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.transportMode)) {
        this.transportMode = data().deepCopy(fields()[4].schema(), other.transportMode);
        fieldSetFlags()[4] = true;
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
    public no.ruter.events.avro.tps.Line.Builder setId(java.lang.CharSequence value) {
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
    public no.ruter.events.avro.tps.Line.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Line.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Line.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'publicCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getPublicCode() {
      return publicCode;
    }

    /**
      * Sets the value of the 'publicCode' field.
      * @param value The value of 'publicCode'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Line.Builder setPublicCode(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.publicCode = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'publicCode' field has been set.
      * @return True if the 'publicCode' field has been set, false otherwise.
      */
    public boolean hasPublicCode() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'publicCode' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Line.Builder clearPublicCode() {
      publicCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'colour' field.
      * @return The value.
      */
    public java.lang.CharSequence getColour() {
      return colour;
    }

    /**
      * Sets the value of the 'colour' field.
      * @param value The value of 'colour'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Line.Builder setColour(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.colour = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'colour' field has been set.
      * @return True if the 'colour' field has been set, false otherwise.
      */
    public boolean hasColour() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'colour' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Line.Builder clearColour() {
      colour = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'transportMode' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransportMode() {
      return transportMode;
    }

    /**
      * Sets the value of the 'transportMode' field.
      * @param value The value of 'transportMode'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Line.Builder setTransportMode(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.transportMode = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'transportMode' field has been set.
      * @return True if the 'transportMode' field has been set, false otherwise.
      */
    public boolean hasTransportMode() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'transportMode' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Line.Builder clearTransportMode() {
      transportMode = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Line build() {
      try {
        Line record = new Line();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.publicCode = fieldSetFlags()[2] ? this.publicCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.colour = fieldSetFlags()[3] ? this.colour : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.transportMode = fieldSetFlags()[4] ? this.transportMode : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Line>
    WRITER$ = (org.apache.avro.io.DatumWriter<Line>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Line>
    READER$ = (org.apache.avro.io.DatumReader<Line>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
