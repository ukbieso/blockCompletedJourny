/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package no.ruter.avro.entity.actual.journey.key;
@SuppressWarnings("all")
/** The journey's position in the block */
@org.apache.avro.specific.AvroGenerated
public enum PositionInBlock {
  FIRST, INTERMEDIATE, LAST  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"PositionInBlock\",\"namespace\":\"no.ruter.avro.entity.actual.journey.key\",\"doc\":\"The journey's position in the block\",\"symbols\":[\"FIRST\",\"INTERMEDIATE\",\"LAST\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}