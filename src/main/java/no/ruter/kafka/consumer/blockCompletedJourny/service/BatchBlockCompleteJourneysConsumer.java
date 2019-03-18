/*
package no.ruter.kafka.consumer.blockCompletedJourny.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.events.avro.tps.BlockComplete;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockCompletedService;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockJourneyCompletedElasticsearchService;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.ElasticsearchService;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.BlockJourneyCompltedDto;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.DatedVehicleJourneyStopsDto;
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
public class BatchBlockCompleteJourneysConsumer {
    private BlockCompletedService blockCompletedService;
    //private ElasticsearchService elasticsearchService;
    private BlockJourneyCompletedElasticsearchService blockJourneyCompletedElasticsearchService;
    private ModelMapper modelMapper;

    @KafkaListener(topics = "batch.block.complete.journeys",groupId = "psps",
            containerFactory = "kafkaListenerContainerFactory" )
    public void batchBlockCompleteJourneysConsume(BlockComplete blockComplete){
        List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDtoList = new ArrayList<>();
        blockComplete.getJourneys().forEach(input -> {
            datedVehicleJourneyStopsDtoList.add(modelMapper.map(input,DatedVehicleJourneyStopsDto.class));
        });
        BlockJourneyCompltedDto blockJourneyCompltedDto = modelMapper.map(blockComplete,BlockJourneyCompltedDto.class);
        blockJourneyCompltedDto.setDatedVehicleJourneyStopsDtos(datedVehicleJourneyStopsDtoList);
        BlockJourneyComplted blockJourneyComplted = modelMapper.map(blockJourneyCompltedDto,BlockJourneyComplted.class);
        blockJourneyCompletedElasticsearchService.createCompltedBlockJourneySubObjectIndexAndSave(blockJourneyComplted.getDatedVehicleJourneyStopsDtos());
        log.info("\n\n**********************************************************\n\n");
        //log.info("ES status : {}", status);
    }
}
*/
