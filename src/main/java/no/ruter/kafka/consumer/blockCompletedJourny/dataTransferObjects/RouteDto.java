package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteDto {
    private String id;
    private String Name;
    private LineDto lineDto;
}
