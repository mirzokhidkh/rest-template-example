package com.example.resttemplatedemo.controller;

import com.example.resttemplatedemo.kafka.producer.MyKafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final MyKafkaProducer myKafkaProducer;

    @PostMapping("/sendToKafka")
    private ResponseEntity<?> sendToKafka(@RequestBody String request){
        myKafkaProducer.sendReq2TopicIn(request);
        return ResponseEntity.ok("OK");
    }

}
