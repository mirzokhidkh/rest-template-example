package com.example.mockapi.service;

import com.example.mockapi.model.ReceiverRequest;
import org.springframework.http.ResponseEntity;

public interface ClientService {
//    ApiResponse receiver(ReceiverRequest receiverRequest);
    ResponseEntity<?> receiver(ReceiverRequest receiverRequest);
    ResponseEntity<?> login();
}
