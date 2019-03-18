package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActualJourneyKeyV1Dto {

   private ActualCommonDto actualCommonDto;
   private EntityPartitionJourneyKeyDto entityPartitionJourneyKeyDto;


}
