/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package no.ruter.avro.entity.actual.block.status;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EntityPartition extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3088389240742311838L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EntityPartition\",\"namespace\":\"no.ruter.avro.entity.actual.block.status\",\"fields\":[{\"name\":\"Key\",\"type\":\"string\",\"doc\":\"The key of an entity. All entities must use the key attribute to store their primary key\"},{\"name\":\"Status\",\"type\":{\"type\":\"enum\",\"name\":\"Status\",\"doc\":\"Last known status of the actual block.\",\"symbols\":[\"RUNNING\",\"ENDED\"]},\"doc\":\"Last known status of the actual block.\"},{\"name\":\"EndStatus\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"EndStatus\",\"doc\":\"Reason for Ending\",\"symbols\":[\"FINISHED\",\"CANCELLED\",\"DETECTED\",\"TIMEOUT\",\"UNKNOWN\"]}],\"doc\":\"Reason for Ending\",\"default\":null},{\"name\":\"CurrentActualJourneyRef\",\"type\":[\"null\",\"string\"],\"doc\":\"Reference to current actual journey on block.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EntityPartition> ENCODER =
      new BinaryMessageEncoder<EntityPartition>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EntityPartition> DECODER =
      new BinaryMessageDecoder<EntityPartition>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<EntityPartition> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<EntityPartition> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EntityPartition>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this EntityPartition to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a EntityPartition from a ByteBuffer. */
  public static EntityPartition fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The key of an entity. All entities must use the key attribute to store their primary key */
  @Deprecated public java.lang.CharSequence Key;
  /** Last known status of the actual block. */
  @Deprecated public no.ruter.avro.entity.actual.block.status.Status Status;
  /** Reason for Ending */
  @Deprecated public no.ruter.avro.entity.actual.block.status.EndStatus EndStatus;
  /** Reference to current actual journey on block. */
  @Deprecated public java.lang.CharSequence CurrentActualJourneyRef;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EntityPartition() {}

  /**
   * All-args constructor.
   * @param Key The key of an entity. All entities must use the key attribute to store their primary key
   * @param Status Last known status of the actual block.
   * @param EndStatus Reason for Ending
   * @param CurrentActualJourneyRef Reference to current actual journey on block.
   */
  public EntityPartition(java.lang.CharSequence Key, no.ruter.avro.entity.actual.block.status.Status Status, no.ruter.avro.entity.actual.block.status.EndStatus EndStatus, java.lang.CharSequence CurrentActualJourneyRef) {
    this.Key = Key;
    this.Status = Status;
    this.EndStatus = EndStatus;
    this.CurrentActualJourneyRef = CurrentActualJourneyRef;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Key;
    case 1: return Status;
    case 2: return EndStatus;
    case 3: return CurrentActualJourneyRef;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Key = (java.lang.CharSequence)value$; break;
    case 1: Status = (no.ruter.avro.entity.actual.block.status.Status)value$; break;
    case 2: EndStatus = (no.ruter.avro.entity.actual.block.status.EndStatus)value$; break;
    case 3: CurrentActualJourneyRef = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Key' field.
   * @return The key of an entity. All entities must use the key attribute to store their primary key
   */
  public java.lang.CharSequence getKey() {
    return Key;
  }

  /**
   * Sets the value of the 'Key' field.
   * The key of an entity. All entities must use the key attribute to store their primary key
   * @param value the value to set.
   */
  public void setKey(java.lang.CharSequence value) {
    this.Key = value;
  }

  /**
   * Gets the value of the 'Status' field.
   * @return Last known status of the actual block.
   */
  public no.ruter.avro.entity.actual.block.status.Status getStatus() {
    return Status;
  }

  /**
   * Sets the value of the 'Status' field.
   * Last known status of the actual block.
   * @param value the value to set.
   */
  public void setStatus(no.ruter.avro.entity.actual.block.status.Status value) {
    this.Status = value;
  }

  /**
   * Gets the value of the 'EndStatus' field.
   * @return Reason for Ending
   */
  public no.ruter.avro.entity.actual.block.status.EndStatus getEndStatus() {
    return EndStatus;
  }

  /**
   * Sets the value of the 'EndStatus' field.
   * Reason for Ending
   * @param value the value to set.
   */
  public void setEndStatus(no.ruter.avro.entity.actual.block.status.EndStatus value) {
    this.EndStatus = value;
  }

  /**
   * Gets the value of the 'CurrentActualJourneyRef' field.
   * @return Reference to current actual journey on block.
   */
  public java.lang.CharSequence getCurrentActualJourneyRef() {
    return CurrentActualJourneyRef;
  }

  /**
   * Sets the value of the 'CurrentActualJourneyRef' field.
   * Reference to current actual journey on block.
   * @param value the value to set.
   */
  public void setCurrentActualJourneyRef(java.lang.CharSequence value) {
    this.CurrentActualJourneyRef = value;
  }

  /**
   * Creates a new EntityPartition RecordBuilder.
   * @return A new EntityPartition RecordBuilder
   */
  public static no.ruter.avro.entity.actual.block.status.EntityPartition.Builder newBuilder() {
    return new no.ruter.avro.entity.actual.block.status.EntityPartition.Builder();
  }

  /**
   * Creates a new EntityPartition RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EntityPartition RecordBuilder
   */
  public static no.ruter.avro.entity.actual.block.status.EntityPartition.Builder newBuilder(no.ruter.avro.entity.actual.block.status.EntityPartition.Builder other) {
    return new no.ruter.avro.entity.actual.block.status.EntityPartition.Builder(other);
  }

  /**
   * Creates a new EntityPartition RecordBuilder by copying an existing EntityPartition instance.
   * @param other The existing instance to copy.
   * @return A new EntityPartition RecordBuilder
   */
  public static no.ruter.avro.entity.actual.block.status.EntityPartition.Builder newBuilder(no.ruter.avro.entity.actual.block.status.EntityPartition other) {
    return new no.ruter.avro.entity.actual.block.status.EntityPartition.Builder(other);
  }

  /**
   * RecordBuilder for EntityPartition instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EntityPartition>
    implements org.apache.avro.data.RecordBuilder<EntityPartition> {

    /** The key of an entity. All entities must use the key attribute to store their primary key */
    private java.lang.CharSequence Key;
    /** Last known status of the actual block. */
    private no.ruter.avro.entity.actual.block.status.Status Status;
    /** Reason for Ending */
    private no.ruter.avro.entity.actual.block.status.EndStatus EndStatus;
    /** Reference to current actual journey on block. */
    private java.lang.CharSequence CurrentActualJourneyRef;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.avro.entity.actual.block.status.EntityPartition.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Key)) {
        this.Key = data().deepCopy(fields()[0].schema(), other.Key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Status)) {
        this.Status = data().deepCopy(fields()[1].schema(), other.Status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.EndStatus)) {
        this.EndStatus = data().deepCopy(fields()[2].schema(), other.EndStatus);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.CurrentActualJourneyRef)) {
        this.CurrentActualJourneyRef = data().deepCopy(fields()[3].schema(), other.CurrentActualJourneyRef);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing EntityPartition instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.avro.entity.actual.block.status.EntityPartition other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.Key)) {
        this.Key = data().deepCopy(fields()[0].schema(), other.Key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Status)) {
        this.Status = data().deepCopy(fields()[1].schema(), other.Status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.EndStatus)) {
        this.EndStatus = data().deepCopy(fields()[2].schema(), other.EndStatus);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.CurrentActualJourneyRef)) {
        this.CurrentActualJourneyRef = data().deepCopy(fields()[3].schema(), other.CurrentActualJourneyRef);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'Key' field.
      * The key of an entity. All entities must use the key attribute to store their primary key
      * @return The value.
      */
    public java.lang.CharSequence getKey() {
      return Key;
    }

    /**
      * Sets the value of the 'Key' field.
      * The key of an entity. All entities must use the key attribute to store their primary key
      * @param value The value of 'Key'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.EntityPartition.Builder setKey(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Key = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Key' field has been set.
      * The key of an entity. All entities must use the key attribute to store their primary key
      * @return True if the 'Key' field has been set, false otherwise.
      */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Key' field.
      * The key of an entity. All entities must use the key attribute to store their primary key
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.EntityPartition.Builder clearKey() {
      Key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Status' field.
      * Last known status of the actual block.
      * @return The value.
      */
    public no.ruter.avro.entity.actual.block.status.Status getStatus() {
      return Status;
    }

    /**
      * Sets the value of the 'Status' field.
      * Last known status of the actual block.
      * @param value The value of 'Status'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.EntityPartition.Builder setStatus(no.ruter.avro.entity.actual.block.status.Status value) {
      validate(fields()[1], value);
      this.Status = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Status' field has been set.
      * Last known status of the actual block.
      * @return True if the 'Status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Status' field.
      * Last known status of the actual block.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.EntityPartition.Builder clearStatus() {
      Status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'EndStatus' field.
      * Reason for Ending
      * @return The value.
      */
    public no.ruter.avro.entity.actual.block.status.EndStatus getEndStatus() {
      return EndStatus;
    }

    /**
      * Sets the value of the 'EndStatus' field.
      * Reason for Ending
      * @param value The value of 'EndStatus'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.EntityPartition.Builder setEndStatus(no.ruter.avro.entity.actual.block.status.EndStatus value) {
      validate(fields()[2], value);
      this.EndStatus = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'EndStatus' field has been set.
      * Reason for Ending
      * @return True if the 'EndStatus' field has been set, false otherwise.
      */
    public boolean hasEndStatus() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'EndStatus' field.
      * Reason for Ending
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.EntityPartition.Builder clearEndStatus() {
      EndStatus = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'CurrentActualJourneyRef' field.
      * Reference to current actual journey on block.
      * @return The value.
      */
    public java.lang.CharSequence getCurrentActualJourneyRef() {
      return CurrentActualJourneyRef;
    }

    /**
      * Sets the value of the 'CurrentActualJourneyRef' field.
      * Reference to current actual journey on block.
      * @param value The value of 'CurrentActualJourneyRef'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.EntityPartition.Builder setCurrentActualJourneyRef(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.CurrentActualJourneyRef = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'CurrentActualJourneyRef' field has been set.
      * Reference to current actual journey on block.
      * @return True if the 'CurrentActualJourneyRef' field has been set, false otherwise.
      */
    public boolean hasCurrentActualJourneyRef() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'CurrentActualJourneyRef' field.
      * Reference to current actual journey on block.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.EntityPartition.Builder clearCurrentActualJourneyRef() {
      CurrentActualJourneyRef = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EntityPartition build() {
      try {
        EntityPartition record = new EntityPartition();
        record.Key = fieldSetFlags()[0] ? this.Key : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Status = fieldSetFlags()[1] ? this.Status : (no.ruter.avro.entity.actual.block.status.Status) defaultValue(fields()[1]);
        record.EndStatus = fieldSetFlags()[2] ? this.EndStatus : (no.ruter.avro.entity.actual.block.status.EndStatus) defaultValue(fields()[2]);
        record.CurrentActualJourneyRef = fieldSetFlags()[3] ? this.CurrentActualJourneyRef : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EntityPartition>
    WRITER$ = (org.apache.avro.io.DatumWriter<EntityPartition>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EntityPartition>
    READER$ = (org.apache.avro.io.DatumReader<EntityPartition>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
