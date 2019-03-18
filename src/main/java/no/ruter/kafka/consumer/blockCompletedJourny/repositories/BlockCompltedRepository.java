package no.ruter.kafka.consumer.blockCompletedJourny.repositories;

import no.ruter.kafka.consumer.blockCompletedJourny.domainMode.BlockJourneyComplted;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockCompltedRepository extends JpaRepository<BlockJourneyComplted,Integer> {
}
