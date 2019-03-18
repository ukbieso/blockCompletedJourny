package no.ruter.kafka.consumer.blockCompletedJourny.domainMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "date_block_journey_complted", type = "blockJourneyComplete", createIndex = true)
public class BlockJourneyCompltedDate {
    private String bjcDateId;
    private String date;
    private String blockRef;
    private String hastusBlockId;
    private List<DatedVehicleJourneyStopsM> datedVehicleJourneyStopsList;
}
