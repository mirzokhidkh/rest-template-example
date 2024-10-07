package com.example.mockapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

import static com.example.mockapi.test.Test.*;

@RestController
public class EisvoController {

    @PostMapping(value = "/api/contract/get", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getPassportData(@RequestBody Object requestObj,
                                                  HttpServletRequest request) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
//        String bearerToken = request.getHeader("Authorization");
//        System.out.println(bearerToken);
        System.out.println(requestObj.toString());

        String eisvoResponse = getEisvoResponse();

        Object eisvoResponseObj = objectMapper.readValue(eisvoResponse, Object.class);

        return ResponseEntity
                .status(200)
                .body(eisvoResponseObj);
    }

}
