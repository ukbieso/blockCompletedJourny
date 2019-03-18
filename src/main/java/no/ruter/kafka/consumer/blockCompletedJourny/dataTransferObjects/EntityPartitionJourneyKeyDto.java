package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntityPartitionJourneyKeyDto {
    private String key;
    private String actualBlockRef;
    private String journeyRef;
    private String vehicleRef;
    private String previousActualJourneyRef;
    private String nextActualJourneyRef;
    private String positionInBlock;
}
