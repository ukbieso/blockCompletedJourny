package no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import no.ruter.avro.entity.actual.block.key.ActualBlockKeyV1;
import no.ruter.avro.entity.actual.journey.key.ActualJourneyKeyV1;
import no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects.*;
import no.ruter.kafka.consumer.blockCompletedJourny.domainMode.BlockJourneyComplted;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Slf4j
public class BlockJourneyCompletedElasticsearchService {
    @Autowired
    private RestHighLevelClient restHighLevelClient;
    @Autowired
    private ObjectMapper objectMapper;
    @Value("${elasticsearch.index.name}")
    private String indexName;
    @Value("${elasticsearch.index.type}")
    private String estype;

    public BlockJourneyCompletedElasticsearchService(RestHighLevelClient restHighLevelClient, ObjectMapper objectMapper) {
        this.restHighLevelClient = restHighLevelClient;
        this.objectMapper = objectMapper;
    }
    @SneakyThrows
    public String createCompltedBlockJourneyIndexAndSave(BlockJourneyComplted blockJourneyComplted){
        UUID uuid = UUID.randomUUID();
        //LocalDate indexDate = LocalDate.now();
        //log.info("after uuid: {}",indexDate.toString());
        Map<String, org.elasticsearch.index.mapper.ObjectMapper.Nested> cbjObjectMapper = objectMapper.convertValue(blockJourneyComplted,Map.class);
        log.info("after obejct mapper");
        IndexRequest indexRequest = new IndexRequest(indexName,estype,uuid.toString())
                .source(cbjObjectMapper);
        IndexResponse indexResponse= restHighLevelClient.index(indexRequest, RequestOptions.DEFAULT);
        log.info("right after the return form es high level clien .....{}", indexResponse.getResult().name());

        return indexResponse.getResult().name();

    }
    @SneakyThrows
    public String createJourneyCompletedAndSave(ActualJourneyKeyV1Dto actualJourneyKeyV1Dto){
        UUID uuid = UUID.randomUUID();

        Map<String, org.elasticsearch.index.mapper.ObjectMapper.Nested> journeyObjectMap = objectMapper.convertValue(
                actualJourneyKeyV1Dto,Map.class);
        log.info("after obejct conversion to map : {}", journeyObjectMap);
        IndexRequest request = new IndexRequest("actual_journey_key","actual_journey_key",uuid.toString())
                .source(journeyObjectMap);
        IndexResponse response = restHighLevelClient.index(request,RequestOptions.DEFAULT);
        log.info("right after the return from es indexing : {}",response.getResult().name());
        return response.getResult().name();
    }


    @SneakyThrows
    public String createCallCompletedAndSave(ActualCallKeyV1Dto actualCallKeyV1Dto){
        UUID uuid = UUID.randomUUID();

        Map<String, org.elasticsearch.index.mapper.ObjectMapper.Nested> cjOObjectMap = objectMapper.convertValue(
                actualCallKeyV1Dto,Map.class);
        log.info("after obejct conversion to map : {}", cjOObjectMap);
        IndexRequest request = new IndexRequest("actual_call_key","actual_call_key",uuid.toString())
                .source(cjOObjectMap);
        IndexResponse response = restHighLevelClient.index(request,RequestOptions.DEFAULT);
        log.info("right after the return from es indexing : {}",response.getResult().name());
        return response.getResult().name();

    }

    public String createTesrt(List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDtos){
        Instant indexDate = Instant.now();
        datedVehicleJourneyStopsDtos.forEach(dvj ->{
            Map<String, org.elasticsearch.index.mapper.ObjectMapper.Nested> svhMapper = objectMapper.convertValue(dvj, Map.class);
            try {
                IndexRequest request = new IndexRequest("batch_block_complete_journey", "batch_block_complete_journey",
                        indexDate.toString()).source(svhMapper);
                IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
                log.info("right after the return form es high level clien .....{}", response.getResult().name());
            } catch (IOException e){
                log.error(" execpetion catch: {}", e.getCause());
            }
        });
        return "Succssefully index";
    }

    public void createCompltedBlockJourneySubObjectIndexAndSave(List<DatedVehicleJourneyStopsDto> datedVehicleJourneyStopsDtos){
        //LocalDate indexDate= LocalDate.now();
        //Instant indexTimeStamp = Instant.now();
        UUID uuid = UUID.randomUUID();
        datedVehicleJourneyStopsDtos.forEach(dvj ->{
            Map<String, org.elasticsearch.index.mapper.ObjectMapper.Nested> svhMapper = objectMapper.convertValue(dvj, Map.class);
            try {
                IndexRequest request = new IndexRequest("sub_bjc", "sub_bjc", uuid.toString()).source(svhMapper);
                IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
                log.info("right after the return form es high level clien .....{}", response.getResult().name());
            } catch (IOException e){
                log.error(" execpetion catch: {}", e.getCause());
            }
        });
        //Map<String , org.elasticsearch.index.mapper.ObjectMapper.Nested> svhjMapper = objectMapper.convertValue(datedVehicleJourneyStopsDtos,Map.class);
        //IndexRequest request = new IndexRequest("sub_bjc","sub_bjc",indexDate.toString()).source(svhjMapper);
        //IndexResponse response = restHighLevelClient.index(request,RequestOptions.DEFAULT);
        //log.info("right after the return form es high level clien .....{}", response.getResult().name());
        //return response.getResult().name();
    }

    @SneakyThrows
    public String createJourneyServicelinkIndexAndSave(JourneyPatternServiceLinksDto journeyPatternServiceLinksDto){
        //UUID uuid =UUID.randomUUID();
        String id = journeyPatternServiceLinksDto.getJourneyPatternID();
        Map<String,Object> linkMapper = objectMapper.convertValue(journeyPatternServiceLinksDto,Map.class);
        //log.info("After mapping: {}", linkMapper);
        IndexRequest indexRequest = new IndexRequest("sl","sl",id)
                .source(linkMapper);
        IndexResponse indexResponse = restHighLevelClient.index(indexRequest,RequestOptions.DEFAULT);
        log.info("after indexing the object : {}",indexResponse.getResult().name());
        return indexResponse.getResult().name();
    }
     @SneakyThrows
    public String createActualBlockkeyIndexAndSave(ActualBlockKeyV1 actualBlockKeyV1){
        UUID uuid =UUID.randomUUID();
        //log.info("input data: {}", actualBlockKeyV1);
        Map<String, Object> actualObjcetmapper = objectMapper.convertValue(actualBlockKeyV1,Map.class);
        //log.info("after object convertor: {}", actualObjcetmapper);
        IndexRequest indexRequest = new IndexRequest("actual_block","actualblock", uuid.toString())
                .source(actualObjcetmapper);
        IndexResponse indexResponse = restHighLevelClient.index(indexRequest,RequestOptions.DEFAULT);
        log.info("right after indexing done. index respons: {}",indexResponse.getResult().name());
        return indexResponse.getResult().name();
    }

    @SneakyThrows
    public BlockJourneyComplted findCompltedblockById(String uuid){
        GetRequest getRequest = new GetRequest(indexName,estype,uuid);
        GetResponse getResponse = restHighLevelClient.get(getRequest,RequestOptions.DEFAULT);
        Map<String,Object> cbjObjectMapper = getResponse.getSourceAsMap();
        BlockJourneyComplted blockJourneyComplted = objectMapper.convertValue(cbjObjectMapper,BlockJourneyComplted.class);
        return blockJourneyComplted;
    }
    @SneakyThrows
    public String deleteIndex(String indexName){
        DeleteIndexRequest request = new DeleteIndexRequest(indexName);
        AcknowledgedResponse deleteIndexresponse = restHighLevelClient.indices().delete(request,RequestOptions.DEFAULT);
        return deleteIndexresponse.isAcknowledged()? "successfully deleted index with the name "+ indexName:
                "Not able to delete the indeix";
    }

    private ActionListener<AcknowledgedResponse> listener = new ActionListener<AcknowledgedResponse>() {
        @Override
        public void onResponse(AcknowledgedResponse acknowledgedResponse) {
            log.info("Index was successfully deleted");
        }

        @Override
        public void onFailure(Exception e) {
            log.info("Index can not be deleted, the reason was : {}", e.getCause());

        }
    };
    @SneakyThrows
    public String createBlockJourneyIndexAndSave(BlockDto blockDto) {
        LocalDate indexDate = LocalDate.now();
        //log.info("after id: {}",indexDate.toString());
        Map<String, Object> cbjObjectMapper = objectMapper.convertValue(blockDto,Map.class);
        //log.info("after obejct mapper");
        IndexRequest indexRequest = new IndexRequest("block_journey_date",estype,indexDate.toString())
                .source(cbjObjectMapper);
        IndexResponse indexResponse= restHighLevelClient.index(indexRequest, RequestOptions.DEFAULT);
        log.info("right after the return form es high level clien .....{}", indexResponse.getResult());
        log.info("right after the return form es high level clien .....{}", indexResponse.getResult().name());
        return indexResponse.getResult().name();
    }
}
