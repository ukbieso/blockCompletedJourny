/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package no.ruter.avro.entity.actual.journey.key;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** The data of the entity partition */
@org.apache.avro.specific.AvroGenerated
public class EntityPartition extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6497202011664155618L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EntityPartition\",\"namespace\":\"no.ruter.avro.entity.actual.journey.key\",\"doc\":\"The data of the entity partition\",\"fields\":[{\"name\":\"Key\",\"type\":\"string\",\"doc\":\"The key of an entity. All entities must use the key attribute to store their primary key\"},{\"name\":\"ActualBlockRef\",\"type\":\"string\",\"doc\":\"Reference to actual block this actual journey is on.\"},{\"name\":\"JourneyRef\",\"type\":\"string\",\"doc\":\"Reference to the journey this actual journey is an instance of.\"},{\"name\":\"VehicleRef\",\"type\":\"string\",\"doc\":\"Reference to the vehicle delivering this actual journey.\"},{\"name\":\"PreviousActualJourneyRef\",\"type\":[\"null\",\"string\"],\"doc\":\"Reference to the previous actual journey\",\"default\":null},{\"name\":\"NextActualJourneyRef\",\"type\":[\"null\",\"string\"],\"doc\":\"Reference to the next actual journey\",\"default\":null},{\"name\":\"PositionInBlock\",\"type\":{\"type\":\"enum\",\"name\":\"PositionInBlock\",\"doc\":\"The journey's position in the block\",\"symbols\":[\"FIRST\",\"INTERMEDIATE\",\"LAST\"]},\"doc\":\"The journey's position in the block\"}]}");
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
  /** Reference to actual block this actual journey is on. */
  @Deprecated public java.lang.CharSequence ActualBlockRef;
  /** Reference to the journey this actual journey is an instance of. */
  @Deprecated public java.lang.CharSequence JourneyRef;
  /** Reference to the vehicle delivering this actual journey. */
  @Deprecated public java.lang.CharSequence VehicleRef;
  /** Reference to the previous actual journey */
  @Deprecated public java.lang.CharSequence PreviousActualJourneyRef;
  /** Reference to the next actual journey */
  @Deprecated public java.lang.CharSequence NextActualJourneyRef;
  /** The journey's position in the block */
  @Deprecated public no.ruter.avro.entity.actual.journey.key.PositionInBlock PositionInBlock;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EntityPartition() {}

  /**
   * All-args constructor.
   * @param Key The key of an entity. All entities must use the key attribute to store their primary key
   * @param ActualBlockRef Reference to actual block this actual journey is on.
   * @param JourneyRef Reference to the journey this actual journey is an instance of.
   * @param VehicleRef Reference to the vehicle delivering this actual journey.
   * @param PreviousActualJourneyRef Reference to the previous actual journey
   * @param NextActualJourneyRef Reference to the next actual journey
   * @param PositionInBlock The journey's position in the block
   */
  public EntityPartition(java.lang.CharSequence Key, java.lang.CharSequence ActualBlockRef, java.lang.CharSequence JourneyRef, java.lang.CharSequence VehicleRef, java.lang.CharSequence PreviousActualJourneyRef, java.lang.CharSequence NextActualJourneyRef, no.ruter.avro.entity.actual.journey.key.PositionInBlock PositionInBlock) {
    this.Key = Key;
    this.ActualBlockRef = ActualBlockRef;
    this.JourneyRef = JourneyRef;
    this.VehicleRef = VehicleRef;
    this.PreviousActualJourneyRef = PreviousActualJourneyRef;
    this.NextActualJourneyRef = NextActualJourneyRef;
    this.PositionInBlock = PositionInBlock;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Key;
    case 1: return ActualBlockRef;
    case 2: return JourneyRef;
    case 3: return VehicleRef;
    case 4: return PreviousActualJourneyRef;
    case 5: return NextActualJourneyRef;
    case 6: return PositionInBlock;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Key = (java.lang.CharSequence)value$; break;
    case 1: ActualBlockRef = (java.lang.CharSequence)value$; break;
    case 2: JourneyRef = (java.lang.CharSequence)value$; break;
    case 3: VehicleRef = (java.lang.CharSequence)value$; break;
    case 4: PreviousActualJourneyRef = (java.lang.CharSequence)value$; break;
    case 5: NextActualJourneyRef = (java.lang.CharSequence)value$; break;
    case 6: PositionInBlock = (no.ruter.avro.entity.actual.journey.key.PositionInBlock)value$; break;
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
   * Gets the value of the 'ActualBlockRef' field.
   * @return Reference to actual block this actual journey is on.
   */
  public java.lang.CharSequence getActualBlockRef() {
    return ActualBlockRef;
  }

  /**
   * Sets the value of the 'ActualBlockRef' field.
   * Reference to actual block this actual journey is on.
   * @param value the value to set.
   */
  public void setActualBlockRef(java.lang.CharSequence value) {
    this.ActualBlockRef = value;
  }

  /**
   * Gets the value of the 'JourneyRef' field.
   * @return Reference to the journey this actual journey is an instance of.
   */
  public java.lang.CharSequence getJourneyRef() {
    return JourneyRef;
  }

  /**
   * Sets the value of the 'JourneyRef' field.
   * Reference to the journey this actual journey is an instance of.
   * @param value the value to set.
   */
  public void setJourneyRef(java.lang.CharSequence value) {
    this.JourneyRef = value;
  }

  /**
   * Gets the value of the 'VehicleRef' field.
   * @return Reference to the vehicle delivering this actual journey.
   */
  public java.lang.CharSequence getVehicleRef() {
    return VehicleRef;
  }

  /**
   * Sets the value of the 'VehicleRef' field.
   * Reference to the vehicle delivering this actual journey.
   * @param value the value to set.
   */
  public void setVehicleRef(java.lang.CharSequence value) {
    this.VehicleRef = value;
  }

  /**
   * Gets the value of the 'PreviousActualJourneyRef' field.
   * @return Reference to the previous actual journey
   */
  public java.lang.CharSequence getPreviousActualJourneyRef() {
    return PreviousActualJourneyRef;
  }

  /**
   * Sets the value of the 'PreviousActualJourneyRef' field.
   * Reference to the previous actual journey
   * @param value the value to set.
   */
  public void setPreviousActualJourneyRef(java.lang.CharSequence value) {
    this.PreviousActualJourneyRef = value;
  }

  /**
   * Gets the value of the 'NextActualJourneyRef' field.
   * @return Reference to the next actual journey
   */
  public java.lang.CharSequence getNextActualJourneyRef() {
    return NextActualJourneyRef;
  }

  /**
   * Sets the value of the 'NextActualJourneyRef' field.
   * Reference to the next actual journey
   * @param value the value to set.
   */
  public void setNextActualJourneyRef(java.lang.CharSequence value) {
    this.NextActualJourneyRef = value;
  }

  /**
   * Gets the value of the 'PositionInBlock' field.
   * @return The journey's position in the block
   */
  public no.ruter.avro.entity.actual.journey.key.PositionInBlock getPositionInBlock() {
    return PositionInBlock;
  }

  /**
   * Sets the value of the 'PositionInBlock' field.
   * The journey's position in the block
   * @param value the value to set.
   */
  public void setPositionInBlock(no.ruter.avro.entity.actual.journey.key.PositionInBlock value) {
    this.PositionInBlock = value;
  }

  /**
   * Creates a new EntityPartition RecordBuilder.
   * @return A new EntityPartition RecordBuilder
   */
  public static no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder newBuilder() {
    return new no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder();
  }

  /**
   * Creates a new EntityPartition RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EntityPartition RecordBuilder
   */
  public static no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder newBuilder(no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder other) {
    return new no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder(other);
  }

  /**
   * Creates a new EntityPartition RecordBuilder by copying an existing EntityPartition instance.
   * @param other The existing instance to copy.
   * @return A new EntityPartition RecordBuilder
   */
  public static no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder newBuilder(no.ruter.avro.entity.actual.journey.key.EntityPartition other) {
    return new no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder(other);
  }

  /**
   * RecordBuilder for EntityPartition instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EntityPartition>
    implements org.apache.avro.data.RecordBuilder<EntityPartition> {

    /** The key of an entity. All entities must use the key attribute to store their primary key */
    private java.lang.CharSequence Key;
    /** Reference to actual block this actual journey is on. */
    private java.lang.CharSequence ActualBlockRef;
    /** Reference to the journey this actual journey is an instance of. */
    private java.lang.CharSequence JourneyRef;
    /** Reference to the vehicle delivering this actual journey. */
    private java.lang.CharSequence VehicleRef;
    /** Reference to the previous actual journey */
    private java.lang.CharSequence PreviousActualJourneyRef;
    /** Reference to the next actual journey */
    private java.lang.CharSequence NextActualJourneyRef;
    /** The journey's position in the block */
    private no.ruter.avro.entity.actual.journey.key.PositionInBlock PositionInBlock;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Key)) {
        this.Key = data().deepCopy(fields()[0].schema(), other.Key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ActualBlockRef)) {
        this.ActualBlockRef = data().deepCopy(fields()[1].schema(), other.ActualBlockRef);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.JourneyRef)) {
        this.JourneyRef = data().deepCopy(fields()[2].schema(), other.JourneyRef);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.VehicleRef)) {
        this.VehicleRef = data().deepCopy(fields()[3].schema(), other.VehicleRef);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.PreviousActualJourneyRef)) {
        this.PreviousActualJourneyRef = data().deepCopy(fields()[4].schema(), other.PreviousActualJourneyRef);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.NextActualJourneyRef)) {
        this.NextActualJourneyRef = data().deepCopy(fields()[5].schema(), other.NextActualJourneyRef);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.PositionInBlock)) {
        this.PositionInBlock = data().deepCopy(fields()[6].schema(), other.PositionInBlock);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing EntityPartition instance
     * @param other The existing instance to copy.
     */
    private Builder(no.ruter.avro.entity.actual.journey.key.EntityPartition other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.Key)) {
        this.Key = data().deepCopy(fields()[0].schema(), other.Key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ActualBlockRef)) {
        this.ActualBlockRef = data().deepCopy(fields()[1].schema(), other.ActualBlockRef);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.JourneyRef)) {
        this.JourneyRef = data().deepCopy(fields()[2].schema(), other.JourneyRef);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.VehicleRef)) {
        this.VehicleRef = data().deepCopy(fields()[3].schema(), other.VehicleRef);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.PreviousActualJourneyRef)) {
        this.PreviousActualJourneyRef = data().deepCopy(fields()[4].schema(), other.PreviousActualJourneyRef);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.NextActualJourneyRef)) {
        this.NextActualJourneyRef = data().deepCopy(fields()[5].schema(), other.NextActualJourneyRef);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.PositionInBlock)) {
        this.PositionInBlock = data().deepCopy(fields()[6].schema(), other.PositionInBlock);
        fieldSetFlags()[6] = true;
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
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder setKey(java.lang.CharSequence value) {
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
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder clearKey() {
      Key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ActualBlockRef' field.
      * Reference to actual block this actual journey is on.
      * @return The value.
      */
    public java.lang.CharSequence getActualBlockRef() {
      return ActualBlockRef;
    }

    /**
      * Sets the value of the 'ActualBlockRef' field.
      * Reference to actual block this actual journey is on.
      * @param value The value of 'ActualBlockRef'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder setActualBlockRef(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ActualBlockRef = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ActualBlockRef' field has been set.
      * Reference to actual block this actual journey is on.
      * @return True if the 'ActualBlockRef' field has been set, false otherwise.
      */
    public boolean hasActualBlockRef() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ActualBlockRef' field.
      * Reference to actual block this actual journey is on.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder clearActualBlockRef() {
      ActualBlockRef = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'JourneyRef' field.
      * Reference to the journey this actual journey is an instance of.
      * @return The value.
      */
    public java.lang.CharSequence getJourneyRef() {
      return JourneyRef;
    }

    /**
      * Sets the value of the 'JourneyRef' field.
      * Reference to the journey this actual journey is an instance of.
      * @param value The value of 'JourneyRef'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder setJourneyRef(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.JourneyRef = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'JourneyRef' field has been set.
      * Reference to the journey this actual journey is an instance of.
      * @return True if the 'JourneyRef' field has been set, false otherwise.
      */
    public boolean hasJourneyRef() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'JourneyRef' field.
      * Reference to the journey this actual journey is an instance of.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder clearJourneyRef() {
      JourneyRef = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'VehicleRef' field.
      * Reference to the vehicle delivering this actual journey.
      * @return The value.
      */
    public java.lang.CharSequence getVehicleRef() {
      return VehicleRef;
    }

    /**
      * Sets the value of the 'VehicleRef' field.
      * Reference to the vehicle delivering this actual journey.
      * @param value The value of 'VehicleRef'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder setVehicleRef(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.VehicleRef = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'VehicleRef' field has been set.
      * Reference to the vehicle delivering this actual journey.
      * @return True if the 'VehicleRef' field has been set, false otherwise.
      */
    public boolean hasVehicleRef() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'VehicleRef' field.
      * Reference to the vehicle delivering this actual journey.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder clearVehicleRef() {
      VehicleRef = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'PreviousActualJourneyRef' field.
      * Reference to the previous actual journey
      * @return The value.
      */
    public java.lang.CharSequence getPreviousActualJourneyRef() {
      return PreviousActualJourneyRef;
    }

    /**
      * Sets the value of the 'PreviousActualJourneyRef' field.
      * Reference to the previous actual journey
      * @param value The value of 'PreviousActualJourneyRef'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder setPreviousActualJourneyRef(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.PreviousActualJourneyRef = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'PreviousActualJourneyRef' field has been set.
      * Reference to the previous actual journey
      * @return True if the 'PreviousActualJourneyRef' field has been set, false otherwise.
      */
    public boolean hasPreviousActualJourneyRef() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'PreviousActualJourneyRef' field.
      * Reference to the previous actual journey
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder clearPreviousActualJourneyRef() {
      PreviousActualJourneyRef = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'NextActualJourneyRef' field.
      * Reference to the next actual journey
      * @return The value.
      */
    public java.lang.CharSequence getNextActualJourneyRef() {
      return NextActualJourneyRef;
    }

    /**
      * Sets the value of the 'NextActualJourneyRef' field.
      * Reference to the next actual journey
      * @param value The value of 'NextActualJourneyRef'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder setNextActualJourneyRef(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.NextActualJourneyRef = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'NextActualJourneyRef' field has been set.
      * Reference to the next actual journey
      * @return True if the 'NextActualJourneyRef' field has been set, false otherwise.
      */
    public boolean hasNextActualJourneyRef() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'NextActualJourneyRef' field.
      * Reference to the next actual journey
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder clearNextActualJourneyRef() {
      NextActualJourneyRef = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'PositionInBlock' field.
      * The journey's position in the block
      * @return The value.
      */
    public no.ruter.avro.entity.actual.journey.key.PositionInBlock getPositionInBlock() {
      return PositionInBlock;
    }

    /**
      * Sets the value of the 'PositionInBlock' field.
      * The journey's position in the block
      * @param value The value of 'PositionInBlock'.
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder setPositionInBlock(no.ruter.avro.entity.actual.journey.key.PositionInBlock value) {
      validate(fields()[6], value);
      this.PositionInBlock = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'PositionInBlock' field has been set.
      * The journey's position in the block
      * @return True if the 'PositionInBlock' field has been set, false otherwise.
      */
    public boolean hasPositionInBlock() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'PositionInBlock' field.
      * The journey's position in the block
      * @return This builder.
      */
    public no.ruter.avro.entity.actual.journey.key.EntityPartition.Builder clearPositionInBlock() {
      PositionInBlock = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EntityPartition build() {
      try {
        EntityPartition record = new EntityPartition();
        record.Key = fieldSetFlags()[0] ? this.Key : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ActualBlockRef = fieldSetFlags()[1] ? this.ActualBlockRef : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.JourneyRef = fieldSetFlags()[2] ? this.JourneyRef : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.VehicleRef = fieldSetFlags()[3] ? this.VehicleRef : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.PreviousActualJourneyRef = fieldSetFlags()[4] ? this.PreviousActualJourneyRef : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.NextActualJourneyRef = fieldSetFlags()[5] ? this.NextActualJourneyRef : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.PositionInBlock = fieldSetFlags()[6] ? this.PositionInBlock : (no.ruter.avro.entity.actual.journey.key.PositionInBlock) defaultValue(fields()[6]);
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
