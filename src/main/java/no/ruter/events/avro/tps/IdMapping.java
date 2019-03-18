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
/** Mapping Old Ruter Quay Ids To New NSR Ids */
@org.apache.avro.specific.AvroGenerated
public class IdMapping extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4604848187865819624L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IdMapping\",\"namespace\":\"no.ruter.events.avro.tps\",\"doc\":\"Mapping Old Ruter Quay Ids To New NSR Ids\",\"fields\":[{\"name\":\"nsrId\",\"type\":\"string\"},{\"name\":\"oldId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<IdMapping> ENCODER =
      new BinaryMessageEncoder<IdMapping>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<IdMapping> DECODER =
      new BinaryMessageDecoder<IdMapping>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<IdMapping> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<IdMapping> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<IdMapping>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this IdMapping to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a IdMapping from a ByteBuffer. */
  public static IdMapping fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence nsrId;
  @Deprecated public java.lang.CharSequence oldId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IdMapping() {}

  /**
   * All-args constructor.
   * @param nsrId The new value for nsrId
   * @param oldId The new value for oldId
   */
  public IdMapping(java.lang.CharSequence nsrId, java.lang.CharSequence oldId) {
    this.nsrId = nsrId;
    this.oldId = oldId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nsrId;
    case 1: return oldId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nsrId = (java.lang.CharSequence)value$; break;
    case 1: oldId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nsrId' field.
   * @return The value of the 'nsrId' field.
   */
  public java.lang.CharSequence getNsrId() {
    return nsrId;
  }

  /**
   * Sets the value of the 'nsrId' field.
   * @param value the value to set.
   */
  public void setNsrId(java.lang.CharSequence value) {
    this.nsrId = value;
  }

  /**
   * Gets the value of the 'oldId' field.
   * @return The value of the 'oldId' field.
   */
  public java.lang.CharSequence getOldId() {
    return oldId;
  }

  /**
   * Sets the value of the 'oldId' field.
   * @param value the value to set.
   */
  public void setOldId(java.lang.CharSequence value) {
    this.oldId = value;
  }

  /**
   * Creates a new IdMapping RecordBuilder.
   * @return A new IdMapping RecordBuilder
   */
  public static no.ruter.events.avro.tps.IdMapping.Builder newBuilder() {
    return new no.ruter.events.avro.tps.IdMapping.Builder();
  }

  /**
   * Creates a new IdMapping RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IdMapping RecordBuilder
   */
  public static no.ruter.events.avro.tps.IdMapping.Builder newBuilder(no.ruter.events.avro.tps.IdMapping.Builder other) {
    return new no.ruter.events.avro.tps.IdMapping.Builder(other);
  }

  /**
   * Creates a new IdMapping RecordBuilder by copying an existing IdMapping instance.
   * @param other The existing instance to copy.
   * @return A new IdMapping RecordBuilder
   */
  public static no.ruter.events.avro.tps.IdMapping.Builder newBuilder(no.ruter.events.avro.tps.IdMapping other) {
    return new no.ruter.events.avro.tps.IdMapping.Builder(other);
  }

  /**
   * RecordBuilder for IdMapping instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IdMapping>
    implements org.apache.avro.data.RecordBuilder<IdMapping> {

    private java.lang.CharSequence nsrId;
    private java.lang.CharSequence oldId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.events.avro.tps.IdMapping.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nsrId)) {
        this.nsrId = data().deepCopy(fields()[0].schema(), other.nsrId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.oldId)) {
        this.oldId = data().deepCopy(fields()[1].schema(), other.oldId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing IdMapping instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.events.avro.tps.IdMapping other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.nsrId)) {
        this.nsrId = data().deepCopy(fields()[0].schema(), other.nsrId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.oldId)) {
        this.oldId = data().deepCopy(fields()[1].schema(), other.oldId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'nsrId' field.
      * @return The value.
      */
    public java.lang.CharSequence getNsrId() {
      return nsrId;
    }

    /**
      * Sets the value of the 'nsrId' field.
      * @param value The value of 'nsrId'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.IdMapping.Builder setNsrId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.nsrId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nsrId' field has been set.
      * @return True if the 'nsrId' field has been set, false otherwise.
      */
    public boolean hasNsrId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nsrId' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.IdMapping.Builder clearNsrId() {
      nsrId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'oldId' field.
      * @return The value.
      */
    public java.lang.CharSequence getOldId() {
      return oldId;
    }

    /**
      * Sets the value of the 'oldId' field.
      * @param value The value of 'oldId'.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.IdMapping.Builder setOldId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.oldId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'oldId' field has been set.
      * @return True if the 'oldId' field has been set, false otherwise.
      */
    public boolean hasOldId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'oldId' field.
      * @return This builder.
      */
    public no.ruter.events.avro.tps.IdMapping.Builder clearOldId() {
      oldId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public IdMapping build() {
      try {
        IdMapping record = new IdMapping();
        record.nsrId = fieldSetFlags()[0] ? this.nsrId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.oldId = fieldSetFlags()[1] ? this.oldId : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<IdMapping>
    WRITER$ = (org.apache.avro.io.DatumWriter<IdMapping>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<IdMapping>
    READER$ = (org.apache.avro.io.DatumReader<IdMapping>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
