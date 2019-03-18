/*
package no.ruter.kafka.consumer.blockCompletedJourny.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.events.avro.tps.Block;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockJourneyCompletedElasticsearchService;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.BlockDto;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class BatchBlockJourneysConsumer {
    private BlockJourneyCompletedElasticsearchService blockJourneyCompletedElasticsearchService;
    private ModelMapper modelMapper;
    private ObjectMapper mapper;
    @KafkaListener( groupId = "bbj",
            containerFactory = "blockConcurrentKafkaListenerContainerFactory",
            topicPartitions = {@TopicPartition(topic = "batch.block.journeys",
                    partitionOffsets = @PartitionOffset(partition = "0",initialOffset = "229510"))
    })
    public void batchBlockJourneysConsume(Block block){
        //log.info("Consumed data : {}", block);
        BlockDto blockDto = modelMapper.map(block,BlockDto.class);
        //BlockDto blockDto = mapper.convertValue(block, BlockDto.class);
        //log.info("after modelmapping: {}", blockDto);
        String status = blockJourneyCompletedElasticsearchService.createBlockJourneyIndexAndSave(blockDto);
        log.info("After es indexing: {}", status);
    }

}

*/
