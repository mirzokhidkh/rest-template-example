package com.example.qqbclientservice.service;

import com.example.qqbclientservice.model.ReceiverRequest;
import com.example.qqbclientservice.model.payload.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface ClientService {
//    ApiResponse receiver(ReceiverRequest receiverRequest);
    ResponseEntity<?> receiver(ReceiverRequest receiverRequest);
}
