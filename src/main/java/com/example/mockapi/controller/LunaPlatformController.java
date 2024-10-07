package com.example.mockapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import static com.example.mockapi.test.LunaPlatformJsonTest.getHandlerEvent;
import static com.example.mockapi.test.Test.getAllHeaders;


@RestController
public class LunaPlatformController {
    @PostMapping(value = "/handlers/83673d7a-fb30-4355-9df6-e8fe47ed8505/events",
            consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> handlerEvent(
            @RequestParam(value = "files", required = false) MultipartFile[] files,
            @RequestPart(value = "json", required = false) Object json,
            HttpServletRequest request) throws JsonProcessingException {

        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
        String bearerToken = request.getHeader("Authorization");
        System.out.println(bearerToken);

        ObjectMapper objectMapper = new ObjectMapper();

        String handlerEvent = getHandlerEvent();

//        Object newOrganization = objectMapper.readValue(getNewOrg, Object.class);

        return ResponseEntity.status(200).body(handlerEvent);
    }



}





