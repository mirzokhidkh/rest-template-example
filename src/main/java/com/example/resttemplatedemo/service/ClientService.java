package com.example.resttemplatedemo.service;

import com.example.resttemplatedemo.model.ReceiverRequest;
import org.springframework.http.ResponseEntity;

public interface ClientService {
//    ApiResponse receiver(ReceiverRequest receiverRequest);
    ResponseEntity<?> receiver(ReceiverRequest receiverRequest);
}
