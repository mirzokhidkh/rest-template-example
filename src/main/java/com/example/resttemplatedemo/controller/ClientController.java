package com.example.resttemplatedemo.controller;

import com.example.resttemplatedemo.model.AuthModal;
import com.example.resttemplatedemo.model.ReceiverRequest;
import com.example.resttemplatedemo.model.ResultAsync;
import com.example.resttemplatedemo.model.ResultForStatUz;
import com.example.resttemplatedemo.service.ClientService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(value = "/receive", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> receiver(@RequestBody ReceiverRequest receiverRequest) {
        return clientService.receiver(receiverRequest);

    }

    @PostMapping(value = "/yoshlar/service/reestr/v1", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity<?> login(@RequestParam MultiValueMap<String, String> paramMap) {
        return ResponseEntity.status(200).body(paramMap);

    }


//    @PostMapping(value = "/test"
//            , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
//    )
    @PostMapping(value = "/test", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<Object> test(@RequestBody Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_HTML)
//                .contentType(MediaType.TEXT_PLAIN)
                .body(objectMapper.writeValueAsString(obj));

    }


    @GetMapping(value = "/test-for-get")
    public ResponseEntity<?> testForGET(@RequestParam Integer work_number) {
        return ResponseEntity.status(200).body(work_number);

    }

    @PostMapping(value = "/test-form-data"
            , consumes = MediaType.MULTIPART_FORM_DATA_VALUE
            , produces = MediaType.TEXT_HTML_VALUE
    )
    public ResponseEntity<Object> testForFormData(@RequestPart("inn") String inn,
                                                  @RequestPart("token") String token,
                                                  @RequestPart("id_client") String id_client) {
        if (inn.equals("0")) {
            return ResponseEntity.status(200).body(new ResultForStatUz("1", "error"));
        }

        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_HTML)
                .body(new ResultAsync(1, inn + ", " + token + ", " + id_client));
//        return ResponseEntity.status(200).body(new ResultAsync(1,inn.getName()+", "+token.getName()+", "+id_client.getName()));
    }

//    @PostMapping(value = "/test-form-data",consumes = { MediaType.MULTIPART_FORM_DATA_VALUE },produces = MediaType.APPLICATION_JSON_VALUE)
//        public ResponseEntity<?> testForFormData(@RequestParam MultiValueMap<String,String> paramMap) {
//        return ResponseEntity.status(200).body(paramMap);
//        }

}