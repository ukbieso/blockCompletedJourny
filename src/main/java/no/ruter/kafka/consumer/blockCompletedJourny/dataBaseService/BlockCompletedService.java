package no.ruter.kafka.consumer.blockCompletedJourny.dataBaseService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.kafka.consumer.blockCompletedJourny.domainMode.BlockJourneyComplted;
import no.ruter.kafka.consumer.blockCompletedJourny.repositories.BlockCompltedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class BlockCompletedService {

    private BlockCompltedRepository blockCompltedRepository;


    public List<BlockJourneyComplted> getAll(){
        return blockCompltedRepository.findAll();
    }

    public void  save(List<BlockJourneyComplted> blockJourneyCompltedList){
        log.info("Start saveing to dataBase all the dated complted block journey!");
        blockCompltedRepository.saveAll(blockJourneyCompltedList);
    }
    public void SaveCompletedBlockJourney(BlockJourneyComplted blockJourneyComplted){
        log.info("Start saveing to dataBase all the dated complted block journey!");
        blockCompltedRepository.save(blockJourneyComplted);

    }
}
