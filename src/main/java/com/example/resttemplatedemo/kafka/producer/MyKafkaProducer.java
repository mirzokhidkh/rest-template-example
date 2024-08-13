package com.example.resttemplatedemo.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyKafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendReq2TopicIn(String message){
        kafkaTemplate.send("IN", message);
    }


}
