package com.example.qqbclientservice.controller;

import com.example.qqbclientservice.model.ReceiverRequest;
import com.example.qqbclientservice.model.payload.ApiResponse;
import com.example.qqbclientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(value = "/receive",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> receiver(@RequestBody ReceiverRequest receiverRequest) {
        return clientService.receiver(receiverRequest);

    }
}