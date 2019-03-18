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
/** Status of an actual Block. An actual journey connects a vehicle to a journey and captures how a planned journey was actually delivered. */
@org.apache.avro.specific.AvroGenerated
public class ActualBlockStatusV1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5596502685943003674L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ActualBlockStatusV1\",\"namespace\":\"no.ruter.avro.entity.actual.block.status\",\"doc\":\"Status of an actual Block. An actual journey connects a vehicle to a journey and captures how a planned journey was actually delivered.\",\"fields\":[{\"name\":\"Timestamp\",\"type\":\"string\",\"doc\":\"Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp\"},{\"name\":\"TraceID\",\"type\":\"string\",\"doc\":\"Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created.\"},{\"name\":\"OriginID\",\"type\":\"string\",\"doc\":\"Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used.\"},{\"name\":\"SenderID\",\"type\":\"string\",\"doc\":\"Identify the creator of this change to the entity partition\"},{\"name\":\"Name\",\"type\":\"string\",\"doc\":\"This identify the vehicle entity and should always be set to 'actualblock' in this schema\",\"default\":\"actualblock\"},{\"name\":\"Partition\",\"type\":\"string\",\"doc\":\"This identify the entity partition and should always be set to 'status' in this schema\",\"default\":\"status\"},{\"name\":\"Version\",\"type\":\"int\",\"doc\":\"This identifiy the version of the schema and sould always be set to 1 in this schema\",\"default\":1},{\"name\":\"EntityPartition\",\"type\":{\"type\":\"record\",\"name\":\"EntityPartition\",\"fields\":[{\"name\":\"Key\",\"type\":\"string\",\"doc\":\"The key of an entity. All entities must use the key attribute to store their primary key\"},{\"name\":\"Status\",\"type\":{\"type\":\"enum\",\"name\":\"Status\",\"doc\":\"Last known status of the actual block.\",\"symbols\":[\"RUNNING\",\"ENDED\"]},\"doc\":\"Last known status of the actual block.\"},{\"name\":\"EndStatus\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"EndStatus\",\"doc\":\"Reason for Ending\",\"symbols\":[\"FINISHED\",\"CANCELLED\",\"DETECTED\",\"TIMEOUT\",\"UNKNOWN\"]}],\"doc\":\"Reason for Ending\",\"default\":null},{\"name\":\"CurrentActualJourneyRef\",\"type\":[\"null\",\"string\"],\"doc\":\"Reference to current actual journey on block.\",\"default\":null}]},\"doc\":\"The data of the entity partition\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ActualBlockStatusV1> ENCODER =
      new BinaryMessageEncoder<ActualBlockStatusV1>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ActualBlockStatusV1> DECODER =
      new BinaryMessageDecoder<ActualBlockStatusV1>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ActualBlockStatusV1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ActualBlockStatusV1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ActualBlockStatusV1>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ActualBlockStatusV1 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ActualBlockStatusV1 from a ByteBuffer. */
  public static ActualBlockStatusV1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp */
  @Deprecated public java.lang.CharSequence Timestamp;
  /** Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created. */
  @Deprecated public java.lang.CharSequence TraceID;
  /** Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used. */
  @Deprecated public java.lang.CharSequence OriginID;
  /** Identify the creator of this change to the entity partition */
  @Deprecated public java.lang.CharSequence SenderID;
  /** This identify the vehicle entity and should always be set to 'actualblock' in this schema */
  @Deprecated public java.lang.CharSequence Name;
  /** This identify the entity partition and should always be set to 'status' in this schema */
  @Deprecated public java.lang.CharSequence Partition;
  /** This identifiy the version of the schema and sould always be set to 1 in this schema */
  @Deprecated public int Version;
  /** The data of the entity partition */
  @Deprecated public no.ruter.avro.entity.actual.block.status.EntityPartition EntityPartition;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ActualBlockStatusV1() {}

  /**
   * All-args constructor.
   * @param Timestamp Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp
   * @param TraceID Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created.
   * @param OriginID Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used.
   * @param SenderID Identify the creator of this change to the entity partition
   * @param Name This identify the vehicle entity and should always be set to 'actualblock' in this schema
   * @param Partition This identify the entity partition and should always be set to 'status' in this schema
   * @param Version This identifiy the version of the schema and sould always be set to 1 in this schema
   * @param EntityPartition The data of the entity partition
   */
  public ActualBlockStatusV1(java.lang.CharSequence Timestamp, java.lang.CharSequence TraceID, java.lang.CharSequence OriginID, java.lang.CharSequence SenderID, java.lang.CharSequence Name, java.lang.CharSequence Partition, java.lang.Integer Version, no.ruter.avro.entity.actual.block.status.EntityPartition EntityPartition) {
    this.Timestamp = Timestamp;
    this.TraceID = TraceID;
    this.OriginID = OriginID;
    this.SenderID = SenderID;
    this.Name = Name;
    this.Partition = Partition;
    this.Version = Version;
    this.EntityPartition = EntityPartition;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Timestamp;
    case 1: return TraceID;
    case 2: return OriginID;
    case 3: return SenderID;
    case 4: return Name;
    case 5: return Partition;
    case 6: return Version;
    case 7: return EntityPartition;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Timestamp = (java.lang.CharSequence)value$; break;
    case 1: TraceID = (java.lang.CharSequence)value$; break;
    case 2: OriginID = (java.lang.CharSequence)value$; break;
    case 3: SenderID = (java.lang.CharSequence)value$; break;
    case 4: Name = (java.lang.CharSequence)value$; break;
    case 5: Partition = (java.lang.CharSequence)value$; break;
    case 6: Version = (java.lang.Integer)value$; break;
    case 7: EntityPartition = (no.ruter.avro.entity.actual.block.status.EntityPartition)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Timestamp' field.
   * @return Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp
   */
  public java.lang.CharSequence getTimestamp() {
    return Timestamp;
  }

  /**
   * Sets the value of the 'Timestamp' field.
   * Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.CharSequence value) {
    this.Timestamp = value;
  }

  /**
   * Gets the value of the 'TraceID' field.
   * @return Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created.
   */
  public java.lang.CharSequence getTraceID() {
    return TraceID;
  }

  /**
   * Sets the value of the 'TraceID' field.
   * Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created.
   * @param value the value to set.
   */
  public void setTraceID(java.lang.CharSequence value) {
    this.TraceID = value;
  }

  /**
   * Gets the value of the 'OriginID' field.
   * @return Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used.
   */
  public java.lang.CharSequence getOriginID() {
    return OriginID;
  }

  /**
   * Sets the value of the 'OriginID' field.
   * Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used.
   * @param value the value to set.
   */
  public void setOriginID(java.lang.CharSequence value) {
    this.OriginID = value;
  }

  /**
   * Gets the value of the 'SenderID' field.
   * @return Identify the creator of this change to the entity partition
   */
  public java.lang.CharSequence getSenderID() {
    return SenderID;
  }

  /**
   * Sets the value of the 'SenderID' field.
   * Identify the creator of this change to the entity partition
   * @param value the value to set.
   */
  public void setSenderID(java.lang.CharSequence value) {
    this.SenderID = value;
  }

  /**
   * Gets the value of the 'Name' field.
   * @return This identify the vehicle entity and should always be set to 'actualblock' in this schema
   */
  public java.lang.CharSequence getName() {
    return Name;
  }

  /**
   * Sets the value of the 'Name' field.
   * This identify the vehicle entity and should always be set to 'actualblock' in this schema
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.Name = value;
  }

  /**
   * Gets the value of the 'Partition' field.
   * @return This identify the entity partition and should always be set to 'status' in this schema
   */
  public java.lang.CharSequence getPartition() {
    return Partition;
  }

  /**
   * Sets the value of the 'Partition' field.
   * This identify the entity partition and should always be set to 'status' in this schema
   * @param value the value to set.
   */
  public void setPartition(java.lang.CharSequence value) {
    this.Partition = value;
  }

  /**
   * Gets the value of the 'Version' field.
   * @return This identifiy the version of the schema and sould always be set to 1 in this schema
   */
  public java.lang.Integer getVersion() {
    return Version;
  }

  /**
   * Sets the value of the 'Version' field.
   * This identifiy the version of the schema and sould always be set to 1 in this schema
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.Version = value;
  }

  /**
   * Gets the value of the 'EntityPartition' field.
   * @return The data of the entity partition
   */
  public no.ruter.avro.entity.actual.block.status.EntityPartition getEntityPartition() {
    return EntityPartition;
  }

  /**
   * Sets the value of the 'EntityPartition' field.
   * The data of the entity partition
   * @param value the value to set.
   */
  public void setEntityPartition(no.ruter.avro.entity.actual.block.status.EntityPartition value) {
    this.EntityPartition = value;
  }

  /**
   * Creates a new ActualBlockStatusV1 RecordBuilder.
   * @return A new ActualBlockStatusV1 RecordBuilder
   */
  public static no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder newBuilder() {
    return new no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder();
  }

  /**
   * Creates a new ActualBlockStatusV1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ActualBlockStatusV1 RecordBuilder
   */
  public static no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder newBuilder(no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder other) {
    return new no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder(other);
  }

  /**
   * Creates a new ActualBlockStatusV1 RecordBuilder by copying an existing ActualBlockStatusV1 instance.
   * @param other The existing instance to copy.
   * @return A new ActualBlockStatusV1 RecordBuilder
   */
  public static no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder newBuilder(no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1 other) {
    return new no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder(other);
  }

  /**
   * RecordBuilder for ActualBlockStatusV1 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ActualBlockStatusV1>
    implements org.apache.avro.data.RecordBuilder<ActualBlockStatusV1> {

    /** Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp */
    private java.lang.CharSequence Timestamp;
    /** Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created. */
    private java.lang.CharSequence TraceID;
    /** Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used. */
    private java.lang.CharSequence OriginID;
    /** Identify the creator of this change to the entity partition */
    private java.lang.CharSequence SenderID;
    /** This identify the vehicle entity and should always be set to 'actualblock' in this schema */
    private java.lang.CharSequence Name;
    /** This identify the entity partition and should always be set to 'status' in this schema */
    private java.lang.CharSequence Partition;
    /** This identifiy the version of the schema and sould always be set to 1 in this schema */
    private int Version;
    /** The data of the entity partition */
    private no.ruter.avro.entity.actual.block.status.EntityPartition EntityPartition;
    private no.ruter.avro.entity.actual.block.status.EntityPartition.Builder EntityPartitionBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Timestamp)) {
        this.Timestamp = data().deepCopy(fields()[0].schema(), other.Timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.TraceID)) {
        this.TraceID = data().deepCopy(fields()[1].schema(), other.TraceID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.OriginID)) {
        this.OriginID = data().deepCopy(fields()[2].schema(), other.OriginID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.SenderID)) {
        this.SenderID = data().deepCopy(fields()[3].schema(), other.SenderID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Name)) {
        this.Name = data().deepCopy(fields()[4].schema(), other.Name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Partition)) {
        this.Partition = data().deepCopy(fields()[5].schema(), other.Partition);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.Version)) {
        this.Version = data().deepCopy(fields()[6].schema(), other.Version);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.EntityPartition)) {
        this.EntityPartition = data().deepCopy(fields()[7].schema(), other.EntityPartition);
        fieldSetFlags()[7] = true;
      }
      if (other.hasEntityPartitionBuilder()) {
        this.EntityPartitionBuilder = no.ruter.avro.entity.actual.block.status.EntityPartition.newBuilder(other.getEntityPartitionBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing ActualBlockStatusV1 instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.Timestamp)) {
        this.Timestamp = data().deepCopy(fields()[0].schema(), other.Timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.TraceID)) {
        this.TraceID = data().deepCopy(fields()[1].schema(), other.TraceID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.OriginID)) {
        this.OriginID = data().deepCopy(fields()[2].schema(), other.OriginID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.SenderID)) {
        this.SenderID = data().deepCopy(fields()[3].schema(), other.SenderID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Name)) {
        this.Name = data().deepCopy(fields()[4].schema(), other.Name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Partition)) {
        this.Partition = data().deepCopy(fields()[5].schema(), other.Partition);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.Version)) {
        this.Version = data().deepCopy(fields()[6].schema(), other.Version);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.EntityPartition)) {
        this.EntityPartition = data().deepCopy(fields()[7].schema(), other.EntityPartition);
        fieldSetFlags()[7] = true;
      }
      this.EntityPartitionBuilder = null;
    }

    /**
      * Gets the value of the 'Timestamp' field.
      * Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp
      * @return The value.
      */
    public java.lang.CharSequence getTimestamp() {
      return Timestamp;
    }

    /**
      * Sets the value of the 'Timestamp' field.
      * Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp
      * @param value The value of 'Timestamp'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Timestamp = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Timestamp' field has been set.
      * Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp
      * @return True if the 'Timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Timestamp' field.
      * Timestamp as close to the actual event that changed the entity in ISO format. Ex. GPS timestamp
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder clearTimestamp() {
      Timestamp = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'TraceID' field.
      * Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created.
      * @return The value.
      */
    public java.lang.CharSequence getTraceID() {
      return TraceID;
    }

    /**
      * Sets the value of the 'TraceID' field.
      * Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created.
      * @param value The value of 'TraceID'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder setTraceID(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.TraceID = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'TraceID' field has been set.
      * Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created.
      * @return True if the 'TraceID' field has been set, false otherwise.
      */
    public boolean hasTraceID() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'TraceID' field.
      * Identify the a transaction uniquely across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the traceID is copyed from that record. Otherwise a new unique UUID is created.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder clearTraceID() {
      TraceID = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'OriginID' field.
      * Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used.
      * @return The value.
      */
    public java.lang.CharSequence getOriginID() {
      return OriginID;
    }

    /**
      * Sets the value of the 'OriginID' field.
      * Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used.
      * @param value The value of 'OriginID'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder setOriginID(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.OriginID = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'OriginID' field has been set.
      * Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used.
      * @return True if the 'OriginID' field has been set, false otherwise.
      */
    public boolean hasOriginID() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'OriginID' field.
      * Identify the originating senderID of a transaction across multiple changes in entities and commands. If a change in an entity is done as a consequence of a change in another entity partition or a command the senderID is copyed from that record. Otherwise same value as in senderID is used.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder clearOriginID() {
      OriginID = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'SenderID' field.
      * Identify the creator of this change to the entity partition
      * @return The value.
      */
    public java.lang.CharSequence getSenderID() {
      return SenderID;
    }

    /**
      * Sets the value of the 'SenderID' field.
      * Identify the creator of this change to the entity partition
      * @param value The value of 'SenderID'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder setSenderID(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.SenderID = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'SenderID' field has been set.
      * Identify the creator of this change to the entity partition
      * @return True if the 'SenderID' field has been set, false otherwise.
      */
    public boolean hasSenderID() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'SenderID' field.
      * Identify the creator of this change to the entity partition
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder clearSenderID() {
      SenderID = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'Name' field.
      * This identify the vehicle entity and should always be set to 'actualblock' in this schema
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return Name;
    }

    /**
      * Sets the value of the 'Name' field.
      * This identify the vehicle entity and should always be set to 'actualblock' in this schema
      * @param value The value of 'Name'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder setName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.Name = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'Name' field has been set.
      * This identify the vehicle entity and should always be set to 'actualblock' in this schema
      * @return True if the 'Name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'Name' field.
      * This identify the vehicle entity and should always be set to 'actualblock' in this schema
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder clearName() {
      Name = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'Partition' field.
      * This identify the entity partition and should always be set to 'status' in this schema
      * @return The value.
      */
    public java.lang.CharSequence getPartition() {
      return Partition;
    }

    /**
      * Sets the value of the 'Partition' field.
      * This identify the entity partition and should always be set to 'status' in this schema
      * @param value The value of 'Partition'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder setPartition(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.Partition = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'Partition' field has been set.
      * This identify the entity partition and should always be set to 'status' in this schema
      * @return True if the 'Partition' field has been set, false otherwise.
      */
    public boolean hasPartition() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'Partition' field.
      * This identify the entity partition and should always be set to 'status' in this schema
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder clearPartition() {
      Partition = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'Version' field.
      * This identifiy the version of the schema and sould always be set to 1 in this schema
      * @return The value.
      */
    public java.lang.Integer getVersion() {
      return Version;
    }

    /**
      * Sets the value of the 'Version' field.
      * This identifiy the version of the schema and sould always be set to 1 in this schema
      * @param value The value of 'Version'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder setVersion(int value) {
      validate(fields()[6], value);
      this.Version = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'Version' field has been set.
      * This identifiy the version of the schema and sould always be set to 1 in this schema
      * @return True if the 'Version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'Version' field.
      * This identifiy the version of the schema and sould always be set to 1 in this schema
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder clearVersion() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'EntityPartition' field.
      * The data of the entity partition
      * @return The value.
      */
    public no.ruter.avro.entity.actual.block.status.EntityPartition getEntityPartition() {
      return EntityPartition;
    }

    /**
      * Sets the value of the 'EntityPartition' field.
      * The data of the entity partition
      * @param value The value of 'EntityPartition'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder setEntityPartition(no.ruter.avro.entity.actual.block.status.EntityPartition value) {
      validate(fields()[7], value);
      this.EntityPartitionBuilder = null;
      this.EntityPartition = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'EntityPartition' field has been set.
      * The data of the entity partition
      * @return True if the 'EntityPartition' field has been set, false otherwise.
      */
    public boolean hasEntityPartition() {
      return fieldSetFlags()[7];
    }

    /**
     * Gets the Builder instance for the 'EntityPartition' field and creates one if it doesn't exist yet.
     * The data of the entity partition
     * @return This builder.
     */
    public no.ruter.avro.entity.actual.block.status.EntityPartition.Builder getEntityPartitionBuilder() {
      if (EntityPartitionBuilder == null) {
        if (hasEntityPartition()) {
          setEntityPartitionBuilder(no.ruter.avro.entity.actual.block.status.EntityPartition.newBuilder(EntityPartition));
        } else {
          setEntityPartitionBuilder(no.ruter.avro.entity.actual.block.status.EntityPartition.newBuilder());
        }
      }
      return EntityPartitionBuilder;
    }

    /**
     * Sets the Builder instance for the 'EntityPartition' field
     * The data of the entity partition
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder setEntityPartitionBuilder(no.ruter.avro.entity.actual.block.status.EntityPartition.Builder value) {
      clearEntityPartition();
      EntityPartitionBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'EntityPartition' field has an active Builder instance
     * The data of the entity partition
     * @return True if the 'EntityPartition' field has an active Builder instance
     */
    public boolean hasEntityPartitionBuilder() {
      return EntityPartitionBuilder != null;
    }

    /**
      * Clears the value of the 'EntityPartition' field.
      * The data of the entity partition
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.block.status.ActualBlockStatusV1.Builder clearEntityPartition() {
      EntityPartition = null;
      EntityPartitionBuilder = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ActualBlockStatusV1 build() {
      try {
        ActualBlockStatusV1 record = new ActualBlockStatusV1();
        record.Timestamp = fieldSetFlags()[0] ? this.Timestamp : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.TraceID = fieldSetFlags()[1] ? this.TraceID : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.OriginID = fieldSetFlags()[2] ? this.OriginID : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.SenderID = fieldSetFlags()[3] ? this.SenderID : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.Name = fieldSetFlags()[4] ? this.Name : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.Partition = fieldSetFlags()[5] ? this.Partition : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.Version = fieldSetFlags()[6] ? this.Version : (java.lang.Integer) defaultValue(fields()[6]);
        if (EntityPartitionBuilder != null) {
          record.EntityPartition = this.EntityPartitionBuilder.build();
        } else {
          record.EntityPartition = fieldSetFlags()[7] ? this.EntityPartition : (no.ruter.avro.entity.actual.block.status.EntityPartition) defaultValue(fields()[7]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ActualBlockStatusV1>
    WRITER$ = (org.apache.avro.io.DatumWriter<ActualBlockStatusV1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ActualBlockStatusV1>
    READER$ = (org.apache.avro.io.DatumReader<ActualBlockStatusV1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
