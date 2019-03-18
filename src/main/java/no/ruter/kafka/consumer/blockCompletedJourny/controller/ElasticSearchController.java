package no.ruter.kafka.consumer.blockCompletedJourny.controller;

import lombok.AllArgsConstructor;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockJourneyCompletedElasticsearchService;
import no.ruter.kafka.consumer.blockCompletedJourny.domainMode.BlockJourneyComplted;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es")
@AllArgsConstructor
public class ElasticSearchController {
    private BlockJourneyCompletedElasticsearchService blockJourneyCompletedElasticsearchService;


    @GetMapping("/{id}")
    public BlockJourneyComplted findeById(@PathVariable(value = "id") String id){
        return blockJourneyCompletedElasticsearchService.findCompltedblockById(id);
    }

    @DeleteMapping("/{indexName}")
    public String deleteIndex(@PathVariable(value = "indexName") String indexName){
        return blockJourneyCompletedElasticsearchService.deleteIndex(indexName);
    }

}
