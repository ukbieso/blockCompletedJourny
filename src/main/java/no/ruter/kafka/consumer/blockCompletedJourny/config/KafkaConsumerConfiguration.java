package no.ruter.kafka.consumer.blockCompletedJourny.config;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;
import no.ruter.avro.entity.actual.block.key.ActualBlockKeyV1;
import no.ruter.avro.entity.actual.call.key.ActualCallKeyV1;
import no.ruter.avro.entity.actual.journey.key.ActualJourneyKeyV1;
import no.ruter.events.avro.tps.Block;
import no.ruter.events.avro.tps.BlockComplete;
import no.ruter.events.avro.tps.JourneyPatternServiceLinks;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class KafkaConsumerConfiguration {

    @Value("${kafka.bootstrapServers}")
    private String bootStrapServer;

    @Value("${kafka.schemaRegistryUrl}")
    private String schemaUrl;

    @Bean
    public ConsumerFactory<String, BlockComplete> consumerFactory(){
        Map<String, Object> config = getConfig();
        //config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootStrapServer);
        //config.put(ConsumerConfig.CLIENT_ID_CONFIG,"un-client-block");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"dbjc");
        //config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        //config.put(ConsumerConfig.RECEIVE_BUFFER_CONFIG, "1MB");
        //config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        //config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        //config.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
        //config.put(KafkaAvroDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG,schemaUrl);
        //config.put("schema.registry.url",schemaUrl);

        return new DefaultKafkaConsumerFactory<String,BlockComplete>(config);
    }

    @Bean
    public ConsumerFactory<String, JourneyPatternServiceLinks> consumerFactoryServiceLink(){
        Map<String, Object> config = getConfig();
        //config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootStrapServer);
        //config.put(ConsumerConfig.CLIENT_ID_CONFIG,"un-client-servicelink");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"un-dev-JoureypatterServiceLinks");

        //config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        //config.put(ConsumerConfig.RECEIVE_BUFFER_CONFIG, "1MB");
        //config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        //config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        //config.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
        //config.put(KafkaAvroDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG,schemaUrl);
        //config.put("schema.registry.url",schemaUrl);
        //KafkaAvroDeserializer kafkaAvroDeserializer = new KafkaAvroDeserializer();

        return new DefaultKafkaConsumerFactory<String, JourneyPatternServiceLinks>(config);
    }



    @Bean
    public ConsumerFactory<String, ActualBlockKeyV1> actualBlockKeyV1ConsumerFactory(){
        Map<String,Object> config = getConfig();
        //config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServer);
        //config.put(ConsumerConfig.CLIENT_ID_CONFIG,"ps-client-actuallBlock");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"ps-dev-actualBlockkey");
        //config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        //config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        //config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,KafkaAvroDeserializer.class.getName());
        //config.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
        //config.put(KafkaAvroSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG,schemaUrl);

        return new DefaultKafkaConsumerFactory<String, ActualBlockKeyV1>(config);
    }


    @Bean
    public ConsumerFactory<String, ActualJourneyKeyV1> actualJourneyKeyV1ConsumerFactory(){
        Map<String,Object> config = getConfig();
        //config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServer);
        //config.put(ConsumerConfig.CLIENT_ID_CONFIG,"ps-client-actuallBlock");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"ps-dev-actualJourneykey");
        //config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        //config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        //config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,KafkaAvroDeserializer.class.getName());
        //config.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
        //config.put(KafkaAvroSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG,schemaUrl);

        return new DefaultKafkaConsumerFactory<String, ActualJourneyKeyV1>(config);
    }



    @Bean
    public ConsumerFactory<String, ActualCallKeyV1> actualCallKeyV1ConsumerFactory(){
        Map<String,Object> config = getConfig();
        //config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServer);
        //config.put(ConsumerConfig.CLIENT_ID_CONFIG,"ps-client-actuallBlock");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"ps-dev-actualCallkey");
        //config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        //config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        //config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,KafkaAvroDeserializer.class.getName());
        //config.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
        //config.put(KafkaAvroSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG,schemaUrl);

        return new DefaultKafkaConsumerFactory<String, ActualCallKeyV1>(config);
    }
    @Bean
    public ConsumerFactory<String, Block> blockConsumerFactory(){
        Map<String, Object> config = getConfig();
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"bbj");
        return new DefaultKafkaConsumerFactory<String, Block>(config);
    }
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,Block> blockConcurrentKafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String,Block> factory = new ConcurrentKafkaListenerContainerFactory<String, Block>();
        factory.setConsumerFactory(blockConsumerFactory());
        factory.setAutoStartup(true);
        return factory;
    }


    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,BlockComplete> kafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, BlockComplete> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        //factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
        return factory;
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, JourneyPatternServiceLinks> kafkaListenerContainerFactoryServicelink(){
        ConcurrentKafkaListenerContainerFactory<String, JourneyPatternServiceLinks> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactoryServiceLink());
        return factory;
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,ActualBlockKeyV1> blockKeyV1ConcurrentKafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String,ActualBlockKeyV1> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(actualBlockKeyV1ConsumerFactory());
        return factory;
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,ActualJourneyKeyV1> journeyKeyV1ConcurrentKafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String,ActualJourneyKeyV1> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(actualJourneyKeyV1ConsumerFactory());
        return factory;
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,ActualCallKeyV1> callKeyV1ConcurrentKafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, ActualCallKeyV1> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(actualCallKeyV1ConsumerFactory());
        return factory;
    }

    private Map<String,Object> getConfig(){

        Map<String, Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootStrapServer);
        //config.put(ConsumerConfig.CLIENT_ID_CONFIG,"un-client-block");
        //config.put(ConsumerConfig.GROUP_ID_CONFIG,"dbjc");
        config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        //config.put(ConsumerConfig.RECEIVE_BUFFER_CONFIG, "1MB");
        config.put(ConsumerConfig.FETCH_MAX_WAIT_MS_CONFIG,"3000");
        config.put(ConsumerConfig.FETCH_MIN_BYTES_CONFIG,1);
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        config.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
        config.put(KafkaAvroDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG,schemaUrl);
        config.put("schema.registry.url",schemaUrl);
        return config;
    }

}
