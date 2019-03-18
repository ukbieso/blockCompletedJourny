package no.ruter.kafka.consumer.blockCompletedJourny.domainMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import no.ruter.events.avro.tps.DatedVehicleJourneyStops;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.DatedVehicleJourneyStopsDto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "block_journey_completed")
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class BlockJourneyComplted {
    @Id@GeneratedValue(generator = "blockJourneyCompletedId_generator")
    @SequenceGenerator(name = "blockJourneyCompletedId_generator",sequenceName = "blockJourneyCompleted_id", initialValue = 1)
    private Integer id;
    private String date;
    private String blockRef;
    private String hastusBlockId;
    @Transient
    private List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDtos;

    public BlockJourneyComplted(String date, String blockRef, String hastusBlockId, List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStops) {
        this.date = date;
        this.blockRef = blockRef;
        this.hastusBlockId = hastusBlockId;
        this.datedVehicleJourneyStopsDtos = datedVehicleJourneyStops;
    }
}
