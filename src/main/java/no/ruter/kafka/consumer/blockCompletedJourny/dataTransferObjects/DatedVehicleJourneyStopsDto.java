package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatedVehicleJourneyStopsDto {
    private String id;
    private String date;
    private String routeName;
    private String routeId;
    private String journeyPattern;
    private String blockRef;
    private String hastusBlockId;
    private String originAimedDepartureTime;
    private String lineId;
    private String linePublicCode;
    public int order;
    public int totalJourneys;
    private List<QuayStopDto> quayStops;
    private String journeyRef;
}
