package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActualCallKeyV1Dto {
    private String Timestamp;
    private String TraceID;
    private String OriginID;
    private String SenderID;
    private String Name;
    private String Partition;
    private String version;
    private EntityPartitioncallDto entityPartitioncallDto;

}
