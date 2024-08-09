package com.example.resttemplatedemo.kafka.producer;

import java.util.Properties;
import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class KafkaSyncProducerExample {

    public static void main(String[] args) throws Exception {
        String topicName = "sync-test-topic";

        System.out.println("Executing synchronous Kafka producer");

        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.setProperty(ProducerConfig.LINGER_MS_CONFIG, "1");

        Producer<String, String> producer = new KafkaProducer<>(properties);
        

        for (int i = 0; i < 5; i++) {

            String key = "sync-key-" + i;
            String value = "sync-value-" + i;

            ProducerRecord<String, String> record = new ProducerRecord<>(topicName, key, value);

            Future<RecordMetadata> response = producer.send(record);
            response.get();

            System.out.println("Produced data: " + key + "=" + value);

            Thread.sleep(1000);
        }

        producer.flush();
        producer.close();

        System.out.println("End of program");
    }
}