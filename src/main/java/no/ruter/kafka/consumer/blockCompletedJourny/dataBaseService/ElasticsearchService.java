package no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.DatedVehicleJourneyStopsDto;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ElasticsearchService {
    @Autowired
    private RestHighLevelClient restHighLevelClient;
    @Autowired
    private ObjectMapper objectMapper;

    public String createTesrt(List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDtos){
        LocalDate indexDate= LocalDate.now();
        Instant instant = Instant.now();
        datedVehicleJourneyStopsDtos.forEach(dvj ->{
            Map<String, org.elasticsearch.index.mapper.ObjectMapper.Nested> svhMapper = objectMapper.convertValue(dvj, Map.class);
            try {
                IndexRequest request = new IndexRequest("batch_block_complete_journey", "batch_block_complete_journey",
                        instant.toString()).source(svhMapper);
                //request.opType(DocWriteRequest.OpType.CREATE);

                IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
                log.info("right after the return form es high level clien .....{}", response.getResult().name());
            } catch (IOException e){
                log.error(" execpetion catch: {}", e.getCause());
            }
        });
        return "Succssefully index";
    }


}
