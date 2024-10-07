package com.example.mockapi.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyKafkaConsumer {

    @KafkaListener(topics = "OUT", groupId = "ESBS")
    public void createCardOutputTopicConsume(String message) {
        System.out.printf("topicOUT 'OUT': %s \n", message);
//        acknowledgment.acknowledge();
    }

}
