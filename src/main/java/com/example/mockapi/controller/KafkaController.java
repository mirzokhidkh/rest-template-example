package com.example.mockapi.controller;

import com.example.mockapi.kafka.producer.MyKafkaProducer;
import com.example.mockapi.model.kafka.KafkaEsbsRecord;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final MyKafkaProducer myKafkaProducer;

    private final ObjectMapper objectMapper;

    @PostMapping("/sendToKafka")
    private ResponseEntity<?> sendToKafka(@RequestBody KafkaEsbsRecord request) throws JsonProcessingException {

        String requestStr = objectMapper.writeValueAsString(request);
        myKafkaProducer.sendReq2TopicIn(requestStr);
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/testKafka")
    private ResponseEntity<?> sendToTest(@RequestBody String request)  {
        myKafkaProducer.sent2Test(request,"test");
        System.out.println(request);
        return ResponseEntity.ok("OK");
    }

}
