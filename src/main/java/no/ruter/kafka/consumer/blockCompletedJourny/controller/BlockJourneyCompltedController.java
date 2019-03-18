package no.ruter.kafka.consumer.blockCompletedJourny.controller;

import lombok.AllArgsConstructor;
import no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService.BlockCompletedService;
import no.ruter.kafka.consumer.blockCompletedJourny.domainMode.BlockJourneyComplted;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blocks")
@AllArgsConstructor
public class BlockJourneyCompltedController {

    private BlockCompletedService blockCompletedService;

    @GetMapping()
    public List<BlockJourneyComplted> getAll(){
        return blockCompletedService.getAll();
    }



}
