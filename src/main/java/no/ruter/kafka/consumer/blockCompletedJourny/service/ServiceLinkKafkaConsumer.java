package no.ruter.kafka.consumer.blockCompletedJourny.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.events.avro.tps.JourneyPatternServiceLinks;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockJourneyCompletedElasticsearchService;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.*;
import org.apache.kafka.common.TopicPartition;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerSeekAware;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceLinkKafkaConsumer implements ConsumerSeekAware {
    private BlockJourneyCompletedElasticsearchService elasticsearchService;
    private ModelMapper modelMapper;

    //topics = "batch.journeypattern.servicelinks",

    @KafkaListener(topics = "batch.journeypattern.servicelinks",groupId = "un-dev-JoureypatterServiceLinks",
            containerFactory = "kafkaListenerContainerFactoryServicelink")
    public void consumeServiceLine(JourneyPatternServiceLinks journeyPatternServiceLinks){


        log.info("consumed data: \n \n {} \n\n", journeyPatternServiceLinks);
        journeyPatternServiceLinks.getServicelinks().forEach(sl -> modelMapper.map(sl,PositionDto.class));
        LineDto lineDto = modelMapper.map(journeyPatternServiceLinks.getRoute().getLine(), LineDto.class);
        RouteDto routeDto = modelMapper.map(journeyPatternServiceLinks.getRoute(),RouteDto.class);
        routeDto.setLineDto(lineDto);
        log.info("\n#######################################################\n");
        //log.info("Line and routDto: {} {}",lineDto, routeDto);
        JourneyPatternServiceLinksDto journeyPatternServiceLinksDto = modelMapper.map(journeyPatternServiceLinks,
                JourneyPatternServiceLinksDto.class);
        journeyPatternServiceLinksDto.setRouteDto(routeDto);
        //log.info("After mapping consumed data: \n \n {} \n\n", journeyPatternServiceLinksDto);
        String indexResponse = elasticsearchService.createJourneyServicelinkIndexAndSave(journeyPatternServiceLinksDto);
    }

    @Override
    public void registerSeekCallback(ConsumerSeekCallback consumerSeekCallback) {

    }

    @Override
    public void onPartitionsAssigned(Map<TopicPartition, Long> map, ConsumerSeekCallback consumerSeekCallback) {

    }

    @Override
    public void onIdleContainer(Map<TopicPartition, Long> map, ConsumerSeekCallback consumerSeekCallback) {

    }
}


