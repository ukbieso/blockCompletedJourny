package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuayStopsDto {
    List<QuayStopsDto> quayStopsDtos;
}
