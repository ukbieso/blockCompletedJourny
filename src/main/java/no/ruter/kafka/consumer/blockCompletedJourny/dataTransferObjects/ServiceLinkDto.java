package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceLinkDto {
    private String serviceLinkID;
    private String poslistID;
    private double distance;
    private List<PositionDto> linklocations;
    private QuayStopDto fromPoint;
    private QuayStopDto toPoint;
}
