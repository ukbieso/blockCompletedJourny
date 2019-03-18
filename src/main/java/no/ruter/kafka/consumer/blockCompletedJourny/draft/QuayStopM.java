package no.ruter.kafka.consumer.blockCompletedJourny.draft;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuayStopM {
     private String stopId;
     private String stopName;
     private String quayId;
     private PositionM position;
     private int order;
     private java.lang.Long arrivalTime;
     private java.lang.Long departureTime;
     private String quayOldId;
     private String destinationDisplay;
     private String destinationDisplayVia;
}
