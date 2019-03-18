package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import no.ruter.events.avro.tps.DatedVehicleJourneyStops;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlockJourneyCompltedDto {

    private String date;
    private String blockRef;
    private String hastusBlockId;
    private List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDtos;
}
