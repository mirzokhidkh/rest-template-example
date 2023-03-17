package com.example.resttemplatedemo.service;

import com.example.resttemplatedemo.model.AuthModal;
import com.example.resttemplatedemo.model.ReceiverRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public interface ClientService {
//    ApiResponse receiver(ReceiverRequest receiverRequest);
    ResponseEntity<?> receiver(ReceiverRequest receiverRequest);
    ResponseEntity<?> login();
}
