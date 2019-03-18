package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuayStopDto {
    private String stopId;
    private String stopName;
    private String quayId;
    private PositionDto positionDto;
    private int order;
    private java.lang.Long arrivalTime;
    private java.lang.Long departureTime;
    private String quayOldId;
    private String destinationDisplay;
    private String destinationDisplayVia;
}
