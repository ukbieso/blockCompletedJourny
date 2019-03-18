/*

package no.ruter.kafka.consumer.blockCompletedJourny.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.avro.entity.actual.journey.key.ActualJourneyKeyV1;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockJourneyCompletedElasticsearchService;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.ActualCommonDto;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.ActualJourneyKeyV1Dto;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.EntityPartitionJourneyKeyDto;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ActualJourneyKeyConsumer {
    private ModelMapper modelMapper;
    private BlockJourneyCompletedElasticsearchService blockJourneyCompletedElasticsearchService;

    @KafkaListener(topics = "entity.actualjourney.key",groupId = "ps-dev-actualJourney",
            containerFactory = "callKeyV1ConcurrentKafkaListenerContainerFactory")
    public void actualJourneyKeyConsume(ActualJourneyKeyV1 actualJourneyKeyV1){
        log.info("Recieved data from actual journey key : {} ", actualJourneyKeyV1);
        ActualCommonDto actualCommonDto = modelMapper.map(actualJourneyKeyV1, ActualCommonDto.class);
        EntityPartitionJourneyKeyDto entityPartitionJourneyKeyDto = modelMapper.map(actualJourneyKeyV1.getEntityPartition(),
                EntityPartitionJourneyKeyDto.class);
        String status =blockJourneyCompletedElasticsearchService.createJourneyCompletedAndSave(new ActualJourneyKeyV1Dto(
                     actualCommonDto,entityPartitionJourneyKeyDto));
        log.info("status: {}",status);
    }
}

*/
