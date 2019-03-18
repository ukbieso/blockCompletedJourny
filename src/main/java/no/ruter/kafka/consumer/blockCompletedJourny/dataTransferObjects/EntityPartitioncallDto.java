package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityPartitioncallDto {
    private String key;
    private String vehicleRef;
    private String quayRef;
    private String actualJourneyRef;
    private String actualBlockRef;
    private String previousActualCallRef;
    private String nextActualCallRef;
    private String positionInJourney;


}
