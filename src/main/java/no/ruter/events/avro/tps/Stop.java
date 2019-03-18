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
/** Stop Place */
@org.apache.avro.specific.AvroGenerated
public class Stop extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8716711191484118773L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Stop\",\"namespace\":\"no.ruter.events.avro.tps\",\"doc\":\"Stop Place\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"quays\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Quay\",\"doc\":\"Quay for a Stop Place\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"position\",\"type\":{\"type\":\"record\",\"name\":\"Position\",\"doc\":\"Position\",\"fields\":[{\"name\":\"lat\",\"type\":\"double\"},{\"name\":\"lon\",\"type\":\"double\"}]}}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Stop> ENCODER =
      new BinaryMessageEncoder<Stop>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Stop> DECODER =
      new BinaryMessageDecoder<Stop>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Stop> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Stop> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Stop>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Stop to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Stop from a ByteBuffer. */
  public static Stop fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.util.List<no.ruter.events.avro.tps.Quay> quays;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Stop() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param quays The new value for quays
   */
  public Stop(java.lang.CharSequence id, java.lang.CharSequence name, java.util.List<no.ruter.events.avro.tps.Quay> quays) {
    this.id = id;
    this.name = name;
    this.quays = quays;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return quays;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: quays = (java.util.List<no.ruter.events.avro.tps.Quay>)value$; break;
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
   * Gets the value of the 'quays' field.
   * @return The value of the 'quays' field.
   */
  public java.util.List<no.ruter.events.avro.tps.Quay> getQuays() {
    return quays;
  }

  /**
   * Sets the value of the 'quays' field.
   * @param value the value to set.
   */
  public void setQuays(java.util.List<no.ruter.events.avro.tps.Quay> value) {
    this.quays = value;
  }

  /**
   * Creates a new Stop RecordBuilder.
   * @return A new Stop RecordBuilder
   */
  public static no.ruter.events.avro.tps.Stop.Builder newBuilder() {
    return new no.ruter.events.avro.tps.Stop.Builder();
  }

  /**
   * Creates a new Stop RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Stop RecordBuilder
   */
  public static no.ruter.events.avro.tps.Stop.Builder newBuilder(no.ruter.events.avro.tps.Stop.Builder other) {
    return new no.ruter.events.avro.tps.Stop.Builder(other);
  }

  /**
   * Creates a new Stop RecordBuilder by copying an existing Stop instance.
   * @param other The existing instance to copy.
   * @return A new Stop RecordBuilder
   */
  public static no.ruter.events.avro.tps.Stop.Builder newBuilder(no.ruter.events.avro.tps.Stop other) {
    return new no.ruter.events.avro.tps.Stop.Builder(other);
  }

  /**
   * RecordBuilder for Stop instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Stop>
    implements org.apache.avro.data.RecordBuilder<Stop> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.util.List<no.ruter.events.avro.tps.Quay> quays;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.events.avro.tps.Stop.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quays)) {
        this.quays = data().deepCopy(fields()[2].schema(), other.quays);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Stop instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.events.avro.tps.Stop other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quays)) {
        this.quays = data().deepCopy(fields()[2].schema(), other.quays);
        fieldSetFlags()[2] = true;
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
    public no.ruter.events.avro.tps.Stop.Builder setId(java.lang.CharSequence value) {
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
    public no.ruter.events.avro.tps.Stop.Builder clearId() {
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
    public no.ruter.events.avro.tps.Stop.Builder setName(java.lang.CharSequence value) {
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
    public no.ruter.events.avro.tps.Stop.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'quays' field.
      * @return The value.
      */
    public java.util.List<no.ruter.events.avro.tps.Quay> getQuays() {
      return quays;
    }

    /**
      * Sets the value of the 'quays' field.
      * @param value The value of 'quays'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Stop.Builder setQuays(java.util.List<no.ruter.events.avro.tps.Quay> value) {
      validate(fields()[2], value);
      this.quays = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'quays' field has been set.
      * @return True if the 'quays' field has been set, false otherwise.
      */
    public boolean hasQuays() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'quays' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.Stop.Builder clearQuays() {
      quays = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Stop build() {
      try {
        Stop record = new Stop();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.quays = fieldSetFlags()[2] ? this.quays : (java.util.List<no.ruter.events.avro.tps.Quay>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Stop>
    WRITER$ = (org.apache.avro.io.DatumWriter<Stop>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Stop>
    READER$ = (org.apache.avro.io.DatumReader<Stop>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}