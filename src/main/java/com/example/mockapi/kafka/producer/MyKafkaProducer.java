package com.example.mockapi.kafka.producer;

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


    public void sent2Test(String message,String topic){
        for (int i = 0; i < 3; i++) {

            kafkaTemplate.send(topic, message+"-"+i);
        }
    }
}
