/*
package no.ruter.kafka.consumer.blockCompletedJourny.service;

import lombok.extern.slf4j.Slf4j;
import no.ruter.avro.entity.actual.block.key.ActualBlockKeyV1;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockJourneyCompletedElasticsearchService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ActualBlockKeyV1Consumer {
    private BlockJourneyCompletedElasticsearchService blockJourneyCompletedElasticsearchService;

    */
/*
    topicPartitions = { @TopicPartition(topic = "entity.actualblock.key",
                    partitionOffsets = @PartitionOffset(partition = "0",initialOffset = "37150"))
            }

     *//*

    @KafkaListener(topics = "entity.actualblock.key",groupId = "ps-dev-actualBlock",
            containerFactory = "blockKeyV1ConcurrentKafkaListenerContainerFactory")
    public void actualBlockKeyConsum(ActualBlockKeyV1 actualBlockKeyV1){
        //log.info("Consumed Data:  {}", actualBlockKeyV1);
        String respons = blockJourneyCompletedElasticsearchService.createActualBlockkeyIndexAndSave(actualBlockKeyV1);
        log.info("###### after saving in to the elasticsearch :{}", respons);
    }
}
*/
