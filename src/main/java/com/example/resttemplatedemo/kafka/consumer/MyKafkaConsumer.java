package com.example.resttemplatedemo.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class MyKafkaConsumer {

    @KafkaListener(topics = "OUT", groupId = "my_group")
    public void createCardOutputTopicConsume(String message) {
        System.out.printf("topicOUT 'OUT': %s \n", message);
//        acknowledgment.acknowledge();
    }

}
