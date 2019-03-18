package no.ruter.kafka.consumer.blockCompletedJourny.config;

import lombok.extern.slf4j.Slf4j;
import no.ruter.events.avro.tps.*;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.*;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
@Slf4j
public class ModlemapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        Converter<Position, PositionDto> positionPositionDtoPropertyMap= mappingContext ->  {
            PositionDto positionDto = new PositionDto();
                positionDto.setLat(mappingContext.getSource().getLat().doubleValue());
                positionDto.setLon(mappingContext.getSource().getLon().doubleValue());
                return positionDto;
        };

        Converter<Line,LineDto> lineLineDtoConverter = mappingContext -> {
            LineDto lineDto = new LineDto();
            lineDto.setColour(mappingContext.getSource().getColour().toString());
            lineDto.setId(mappingContext.getSource().getId().toString());
            lineDto.setPublicCode(mappingContext.getSource().getPublicCode().toString());
            lineDto.setName(mappingContext.getSource().getName().toString());
            lineDto.setTransportMode(mappingContext.getSource().getTransportMode().toString());
            return lineDto;
        };
        Converter<Route, RouteDto> routeRouteDtoConverter = mappingContext -> {
            RouteDto routeDto = new RouteDto();
            routeDto.setId(mappingContext.getSource().getId().toString());
            routeDto.setLineDto(modelMapper.map(mappingContext.getSource().getLine(),LineDto.class));
            routeDto.setName(mappingContext.getSource().getName().toString());
            return  routeDto;
        };
        Converter<QuayStop, QuayStopDto> quayStopQuayStopDtoPropertyMap = mappingContext-> {
            QuayStopDto quayStopDto = new QuayStopDto();
            quayStopDto.setArrivalTime(mappingContext.getSource().getArrivalTime().longValue());
            quayStopDto.setDepartureTime(mappingContext.getSource().getDepartureTime().longValue());
            quayStopDto.setDestinationDisplay(mappingContext.getSource().getDestinationDisplay().toString());
            quayStopDto.setOrder(mappingContext.getSource().getOrder());
            quayStopDto.setDestinationDisplayVia(mappingContext.getSource().getDestinationDisplayVia().toString());
            quayStopDto.setQuayId(mappingContext.getSource().getQuayId().toString());
            quayStopDto.setStopId(mappingContext.getSource().getStopId().toString());
            quayStopDto.setStopName(mappingContext.getSource().getStopName().toString());
            quayStopDto.setQuayOldId(mappingContext.getSource().getQuayOldId().toString());
            quayStopDto.setPositionDto(modelMapper.map(mappingContext.getSource().getPosition(),PositionDto.class));
            return quayStopDto;
        };

        Converter<DatedVehicleJourneyStops, DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDatedVehicleJourneyStopsDtoPropertyMap
                = mappingContext ->  {
           DatedVehicleJourneyStopsDto datedVehicleJourneyStopsDto = new DatedVehicleJourneyStopsDto();
                datedVehicleJourneyStopsDto.setBlockRef(mappingContext.getSource().getBlockRef().toString());
                datedVehicleJourneyStopsDto.setDate(mappingContext.getSource().getDate().toString());
                datedVehicleJourneyStopsDto.setHastusBlockId(mappingContext.getSource().getHastusBlockId().toString());
                datedVehicleJourneyStopsDto.setId(mappingContext.getSource().getId().toString());
                datedVehicleJourneyStopsDto.setJourneyPattern(mappingContext.getSource().getJourneyPattern().toString());
                datedVehicleJourneyStopsDto.setJourneyRef(mappingContext.getSource().getJourneyRef().toString());
                datedVehicleJourneyStopsDto.setLineId(mappingContext.getSource().getLineId().toString());
                datedVehicleJourneyStopsDto.setLinePublicCode(mappingContext.getSource().getLinePublicCode().toString());
                datedVehicleJourneyStopsDto.setOrder(mappingContext.getSource().getOrder());
                datedVehicleJourneyStopsDto.setOriginAimedDepartureTime(mappingContext.getSource().getOriginAimedDepartureTime().toString());
                //destination.setQuayStops(modelMapper.map(source.getQuayStops(),QuayStopDto.class));
                datedVehicleJourneyStopsDto.setRouteId(mappingContext.getSource().getRouteId().toString());
                datedVehicleJourneyStopsDto.setTotalJourneys(mappingContext.getSource().getTotalJourneys());
                datedVehicleJourneyStopsDto.setLinePublicCode(mappingContext.getSource().getLinePublicCode().toString());
                mappingContext.getSource().getQuayStops().forEach(input ->{
                    datedVehicleJourneyStopsDto.getQuayStops().add(modelMapper.map(input,QuayStopDto.class));
                });
                return datedVehicleJourneyStopsDto;

        };

        Converter<BlockComplete,JourneysDto> journeysDtoConverter = mappingContext -> {
            JourneysDto journeysDto = new JourneysDto();
            mappingContext.getSource().getJourneys().forEach(input ->{
                journeysDto.getDatedVehicleJourneyStopsDtos().add(modelMapper.map(input,DatedVehicleJourneyStopsDto.class));
            });
            return journeysDto;
        };

        Converter<List<DatedVehicleJourneyStops>,List<DatedVehicleJourneyStopsDto>> listListPropertyMapdateVehicle =
                mappingContext ->  {
            List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDtos = new ArrayList<>();
                mappingContext.getSource().forEach(input -> {
                    datedVehicleJourneyStopsDtos.add(modelMapper.map(input,DatedVehicleJourneyStopsDto.class));
                });
                return datedVehicleJourneyStopsDtos;
        };

        Converter<List<QuayStop>,List<QuayStopDto>> listListPropertyMap = mappingContext -> {
           List<QuayStopDto> quayStopDtos = new ArrayList<>();
                mappingContext.getSource().forEach(input -> {
                    quayStopDtos.add(modelMapper.map(input,QuayStopDto.class));
                });
            return quayStopDtos;
        };

        Converter<BlockComplete, BlockJourneyCompltedDto> blockCompleteBlockJourneyCompltedDtoPropertyMap =
               mappingContext ->  {
            BlockJourneyCompltedDto blockJourneyCompltedDto = new BlockJourneyCompltedDto();
                   blockJourneyCompltedDto.setDate(mappingContext.getSource().getDate().toString());
                   blockJourneyCompltedDto.setBlockRef(mappingContext.getSource().getBlockRef().toString());
                   blockJourneyCompltedDto.setHastusBlockId(mappingContext.getSource().getHastusBlockId().toString());
                   return blockJourneyCompltedDto;
        };
        Converter<JourneyPatternServiceLinks,JourneyPatternServiceLinksDto> journeyPatternServiceLinksJourneyPatternServiceLinksDtoConverter=
                mappingContext -> {
            JourneyPatternServiceLinksDto journeyPatternServiceLinksDto = new JourneyPatternServiceLinksDto();
            journeyPatternServiceLinksDto.setRouteDto(modelMapper.map(mappingContext.getSource().getRoute(),RouteDto.class));
            journeyPatternServiceLinksDto.setJourneyPatternID(mappingContext.getSource().getJourneyPatternID().toString());

           return journeyPatternServiceLinksDto;
        };

        Converter<List<java.lang.CharSequence>,List<String>> listBlockJourneyListConverter = mappingContext -> {
            mappingContext.getSource().forEach(input -> mappingContext.getDestination().add(input.toString()));
            return mappingContext.getDestination();
        };

        Converter<Block, BlockDto> blockBlockDtoConverter = mappingContext -> {
            BlockDto blockDto = new BlockDto();
            List<String> journeys = new ArrayList<>();
            blockDto.setBlockRef(mappingContext.getSource().getBlockRef().toString());
            blockDto.setDate(mappingContext.getSource().getDate().toString());
            blockDto.setHastusBlockId(mappingContext.getSource().getHastusBlockId().toString());
            mappingContext.getSource().getJourneys().forEach(j -> blockDto.getJourneys().add(j.toString()));
            return blockDto;

        };


//        PropertyMap<BlockComplete, JourneysDto> blockCompleteBlockJourneyCompltedDtoPropertyMap =
//                new PropertyMap<BlockComplete, JourneysDto>() {
//            @Override
//            protected void configure() {
//                JourneysDto journeysDto = new JourneysDto();
//
//                destination.getDatedVehicleJourneyStopsDtos().addAll(source.getJourneys());
//
//            }
//        };
//        modelMapper.addMappings(blockCompleteBlockJourneyCompltedDtoPropertyMap);
        //modelMapper.createTypeMap(BlockComplete.class,JourneysDto.class).setConverter(converter);

        modelMapper.addConverter(listBlockJourneyListConverter);
        modelMapper.addConverter(blockBlockDtoConverter);
        modelMapper.addConverter(lineLineDtoConverter);
        modelMapper.addConverter(routeRouteDtoConverter);
        modelMapper.addConverter(journeyPatternServiceLinksJourneyPatternServiceLinksDtoConverter);
        modelMapper.addConverter(positionPositionDtoPropertyMap);
        modelMapper.addConverter(quayStopQuayStopDtoPropertyMap);
        modelMapper.addConverter(datedVehicleJourneyStopsDatedVehicleJourneyStopsDtoPropertyMap);
        //modelMapper.addMappings(blockCompleteJourneysDtoPropertyMap);
        modelMapper.addConverter(blockCompleteBlockJourneyCompltedDtoPropertyMap);
        //modelMapper.addConverter(converter);
        modelMapper.addConverter(listListPropertyMap);
        modelMapper.addConverter(listListPropertyMapdateVehicle);
        modelMapper.addConverter(journeysDtoConverter);
        return modelMapper;
    }




}
