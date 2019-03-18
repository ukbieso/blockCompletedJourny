package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JourneyPatternServiceLinksDto {
    private String journeyPatternID;
    private RouteDto routeDto;
    private List<ServiceLinkDto> servicelinks;

}
