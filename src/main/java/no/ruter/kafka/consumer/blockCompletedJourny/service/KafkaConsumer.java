/**package no.ruter.kafka.consumer.blockCompletedJourny.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.events.avro.tps.BlockComplete;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockCompletedService;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockJourneyCompletedElasticsearchService;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.*;
import no.ruter.kafka.consumer.blockCompletedJourny.domainMode.BlockJourneyComplted;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class KafkaConsumer {

     private BlockCompletedService blockCompletedService;
     private BlockJourneyCompletedElasticsearchService blockJourneyCompletedElasticsearchService;
     private ModelMapper modelMapper;


/*
     ,topicPartitions = {
            @TopicPartition(topic = "batch.block.complete.journeys",
            partitionOffsets = @PartitionOffset(partition = "0",initialOffset = "41000")),
            @TopicPartition(topic = "batch.block.complete.journeys",
                    partitionOffsets = @PartitionOffset(partition = "1",initialOffset = "40000")),
            @TopicPartition(topic = "batch.block.complete.journeys",
                    partitionOffsets = @PartitionOffset(partition = "2",initialOffset = "40000")),
    }
      */

/**
    @KafkaListener( groupId = "dbjc",
    containerFactory = "kafkaListenerContainerFactory" ,topicPartitions = {
            @TopicPartition(topic = "batch.block.complete.journeys",
                    partitionOffsets = @PartitionOffset(partition = "0",initialOffset = "41000")),
            @TopicPartition(topic = "batch.block.complete.journeys",
                    partitionOffsets = @PartitionOffset(partition = "1",initialOffset = "40000")),
            @TopicPartition(topic = "batch.block.complete.journeys",
                    partitionOffsets = @PartitionOffset(partition = "2",initialOffset = "40000"))})
    public void  consumerBlockCompleted(BlockComplete blockComplete) {

        //log.info("\n\n**********************************************************\n\n");
        //log.info("CONSUMED DATA FRA KAFKA: {}", blockComplete);

        List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDtoList = new ArrayList<>();
        blockComplete.getJourneys().forEach(input -> {
            datedVehicleJourneyStopsDtoList.add(modelMapper.map(input,DatedVehicleJourneyStopsDto.class));
        });

        //modelMapper.map(blockComplete.getJourneys(), datedVehicleJourneyStopsDtoList);

        //log.info("\n\n**********************************************************\n\n");
                //JourneysDto journeysDto = modelMapper.map(blockComplete,JourneysDto.class);
        //log.info("\n\n**********************************************************\n\n");
        //log.info(" QQQQQTTT   CONSUMED DATA FRA KAFKA: {}", datedVehicleJourneyStopsDtoList);
        //log.info("\n\n**********************************************************\n\n");


//        log.info("*********************: {}",bjc.getDatedVehicleJourneyStopsDtos());
        BlockJourneyCompltedDto test = modelMapper.map(blockComplete,BlockJourneyCompltedDto.class);
        test.setDatedVehicleJourneyStopsDtos(datedVehicleJourneyStopsDtoList);

        //log.info("\n\n**********************************************************\n\n");
        //log.info(" TESTTT   CONSUMED DATA FRA KAFKA: {}", test);
        //log.info("\n\n**********************************************************\n\n");

        //blockJourneyCompletedElasticsearchService.createCompltedBlockJourneyIndexAndSave(blockComplete);
        // BlockJourneyComplted blockJourneyComplted = new BlockJourneyComplted(blockComplete.getDate().toString(),
        //       blockComplete.getBlockRef().toString(),blockComplete.getHastusBlockId().toString(),
        //     blockComplete.getJourneys());

        BlockJourneyComplted blockJourneyComplted = modelMapper.map(test,BlockJourneyComplted.class);


        String status = blockJourneyCompletedElasticsearchService.createCompltedBlockJourneyIndexAndSave(blockJourneyComplted);
        blockJourneyCompletedElasticsearchService.
                createCompltedBlockJourneySubObjectIndexAndSave(blockJourneyComplted.getDatedVehicleJourneyStopsDtos());
        log.info("\n\n**********************************************************\n\n");
        log.info("ES status : {}", status);
        //log.info("Saving to ddatabase: {}", blockJourneyComplted);
        //log.info("right befor the start of saving to PG database");
        //blockCompletedService.SaveCompletedBlockJourney(blockJourneyComplted);

    }


}

**/
