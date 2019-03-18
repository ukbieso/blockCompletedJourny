/*
package no.ruter.kafka.consumer.blockCompletedJourny.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.avro.entity.actual.call.key.ActualCallKeyV1;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockJourneyCompletedElasticsearchService;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.ActualCallKeyV1Dto;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.EntityPartitioncallDto;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ActualCallKeyConsumer {
    private BlockJourneyCompletedElasticsearchService blockJourneyCompletedElasticsearchService;
    private ModelMapper modelMapper;
    @KafkaListener(groupId = "ps-dev-actualCall",
            containerFactory = "journeyKeyV1ConcurrentKafkaListenerContainerFactory",
            topicPartitions = {@TopicPartition(topic = "entity.actualcall.key",
                    partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "90740"))
            })
    public void actualCallKeyConsume(ActualCallKeyV1 actualCallKeyV1){
        log.info("Recieved data from kafka : {} ", actualCallKeyV1);
        EntityPartitioncallDto entityPartitioncallDto = modelMapper.map(actualCallKeyV1.getEntityPartition(),EntityPartitioncallDto.class);
        ActualCallKeyV1Dto actualCallKeyV1Dto = modelMapper.map(actualCallKeyV1,ActualCallKeyV1Dto.class);
        actualCallKeyV1Dto.setEntityPartitioncallDto(entityPartitioncallDto);
        log.info("after Model mapper: {}", actualCallKeyV1Dto);
        String status = blockJourneyCompletedElasticsearchService.createCallCompletedAndSave(actualCallKeyV1Dto);
        log.info("Status: {}", status);
    }
}
*/
