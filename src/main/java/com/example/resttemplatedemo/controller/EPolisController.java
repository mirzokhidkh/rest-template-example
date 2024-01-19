package com.example.resttemplatedemo.controller;

import com.example.resttemplatedemo.model.ExampleDTO;
import com.example.resttemplatedemo.model.agroplatform.AgroResponse;
import com.example.resttemplatedemo.model.agroplatform.NewOrganization;
import com.example.resttemplatedemo.model.epolis.EPolisModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.Map;
import java.util.Random;

import static com.example.resttemplatedemo.test.Test.getAllHeaders;
import static com.example.resttemplatedemo.test.UzAgroTestJson.getGetNewOrg;


@RestController
public class EPolisController {

//    @GetMapping(value = "/test-for-get",
//            produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public ResponseEntity<?> testForGET(@RequestParam Integer id) {
//        ExampleDTO exampleDTO = new ExampleDTO(id, null);
//        return ResponseEntity.status(200).body(exampleDTO);
//
//    }

    @PostMapping(value = "/InitiateTransactionRequest", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> ePolicy(
//            @RequestParam EPolisModel ePolisModel,
            @RequestParam String USERNAME,
            @RequestParam String PASSWORD,
            @RequestParam String TRANSACTION_ID,
            @RequestParam String AGENT_ID,
            @RequestParam String PRODUCT_ID,
            @RequestParam String CLIENT_NAME,
            @RequestParam String CLIENT_ADDRESS,
            @RequestParam String CLIENT_PHONE,
            @RequestParam String CLIENT_PASSPORT,
//            @RequestParam String BENEFICIARY_NAME,
            @RequestParam String OBJECT,
            @RequestParam int INSURANCE_COST,
            @RequestParam String PERIOD_BEGIN,
            @RequestParam String PERIOD_END,
            @RequestParam int CREDIT_ID,
            @RequestParam int AGENT_PHONE,
            HttpServletRequest servletRequest) throws JsonProcessingException {

//        System.out.println(ePolisModel);
        System.out.println(USERNAME);
//int s = 10000000;

        String getNewOrg = getGetNewOrg();
        ObjectMapper objectMapper = new ObjectMapper();
        Object legalObj = objectMapper.readValue(getNewOrg, Object.class);

        return ResponseEntity.status(200).body(legalObj);
    }


}
