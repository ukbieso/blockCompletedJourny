package no.ruter.kafka.consumer.blockCompletedJourny.domainMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import no.ruter.kafka.consumer.blockCompletedJourny.draft.QuayStopM;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DatedVehicleJourneyStopsM {

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
     private List<QuayStopM> quayStops;
     private String journeyRef;
}
