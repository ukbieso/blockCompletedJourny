/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package no.ruter.avro.entity.actual.block.status;
@SuppressWarnings("all")
/** Reason for Ending */
@org.apache.avro.specific.AvroGenerated
public enum EndStatus {
  FINISHED, CANCELLED, DETECTED, TIMEOUT, UNKNOWN  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"EndStatus\",\"namespace\":\"no.ruter.avro.entity.actual.block.status\",\"doc\":\"Reason for Ending\",\"symbols\":[\"FINISHED\",\"CANCELLED\",\"DETECTED\",\"TIMEOUT\",\"UNKNOWN\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
