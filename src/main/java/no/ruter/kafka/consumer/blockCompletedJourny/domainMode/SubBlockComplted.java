package no.ruter.kafka.consumer.blockCompletedJourny.domainMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.DatedVehicleJourneyStopsDto;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubBlockComplted {
    private float totalDistanceInJourneyPattern;
    private List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDtos;
}
