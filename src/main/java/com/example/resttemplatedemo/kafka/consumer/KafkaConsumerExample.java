package com.example.resttemplatedemo.kafka.consumer;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class KafkaConsumerExample {
    public static void main(String[] args) {

        String defaultTopicName = "my-topic";
        String defaultGroupName = "test-group";

        String topicName = System.getenv("TOPIC_NAME") != null ? System.getenv("TOPIC_NAME") : defaultTopicName;
        String groupName = System.getenv("CONSUMER_GROUP_NAME") != null ? System.getenv("CONSUMER_GROUP_NAME") : defaultGroupName;

        Properties props = new Properties();
        props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
        props.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupName);
        props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Collections.singletonList(topicName));

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Stopping Kafka Consumer");
            consumer.close();
        }));

        System.out.println("Started Kafka Consumer for Topic: "+ topicName + ", Consumer Group: " + groupName);


        try {
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
                for (ConsumerRecord<String, String> record : records) {
                    System.out.printf("topic=%s, partition=%d, offset=%d, key=%s, value=%s\n",
                            record.topic(), record.partition(), record.offset(), record.key(), record.value());
                }
            }
        } finally {
            consumer.close();
        }
    }

}