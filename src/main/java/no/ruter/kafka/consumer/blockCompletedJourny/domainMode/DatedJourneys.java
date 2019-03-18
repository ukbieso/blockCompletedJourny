package no.ruter.kafka.consumer.blockCompletedJourny.domainMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import no.ruter.events.avro.tps.DatedVehicleJourneyStops;

import javax.persistence.Embeddable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Embeddable
public class DatedJourneys {
    List<DatedVehicleJourneyStops> datedVehicleJourneyStopsDtos;
}
