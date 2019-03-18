package no.ruter.kafka.consumer.blockCompletedJourny.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActualCommonDto {
    private String timestamp;
    private String traceID;
    private String originId;
    private String senderId;
    private String name;
    private String partition;
    private int version;

}
