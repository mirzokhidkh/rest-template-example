package com.example.resttemplatedemo.controller;

import com.example.resttemplatedemo.model.ExampleDTO;
import com.example.resttemplatedemo.model.agroplatform.AgroResponse;
import com.example.resttemplatedemo.model.agroplatform.NewOrganization;
import com.example.resttemplatedemo.model.gcp.schemes.CEPRequest;
import com.example.resttemplatedemo.model.gcp.schemes.GetDataByPinppRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.*;

import static com.example.resttemplatedemo.test.Test.*;
import static com.example.resttemplatedemo.test.UzAgroTestJson.getGetNewOrg;

@RestController
public class AgroPlatformaController {
    @GetMapping(value = "/api/company/get-new-organization/",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> getNewOrg(HttpServletRequest servletRequest) throws JsonProcessingException {

        Map<String, String> allHeaders = getAllHeaders(servletRequest);
//        System.out.println(allHeaders);
        String bearerToken = servletRequest.getHeader("Authorization");
        System.out.println(bearerToken);

        ObjectMapper objectMapper = new ObjectMapper();

        String getNewOrg = getGetNewOrg();

//        Object newOrganization = objectMapper.readValue(getNewOrg, Object.class);

        String[] accounts = new String[]{"22618000799000004001", "22618000799000004009","16549000500000440104", "56602000200000440143",
                "22618000799000004011","16101840900000398001","23504000300000399510","14901000799001856001","22618000719000004002",
                "22618000799000004002","22618000799000001002"
        };

        Random rn = new Random();

        int code = rn.nextInt(2);
        if (code == 1) {
            //{
            //    "query_id": 41493,
            //    "inn": "305029060",
            //    "client_branch": "00450",
            //    "client": "20208000900812465001",
            //    "dial_d": "2023-09-12",
            //    "dial_num": 41493,
            //    "offer_agreement_file_url": null,
            //    "query_date": "2023-11-20"
            //}
            NewOrganization newOrganization = new NewOrganization();
//            long queryId = rn.nextLong();
//            String queryIdStr = String.valueOf(queryId);
            String queryIdStr = String.valueOf(UUID.randomUUID()).substring(0, 14);
            newOrganization.setQueryId(queryIdStr);
            //305029060
            //
            newOrganization.setInn("305029060");
            newOrganization.setClientBranch("00440");
            newOrganization.setClient(accounts[rn.nextInt(accounts.length)]);
//            newOrganization.setClient("20208000900812465001");
            newOrganization.setDialD("2023-09-12");
            newOrganization.setDialNum(41493);
            newOrganization.setOfferAgreementFileUrl(null);
            LocalDate now = LocalDate.now();
            newOrganization.setQueryDate(now.toString());

//            int i = 12345678901234;

            return ResponseEntity
                    .status(200)
                    .body(newOrganization);
        } else {
            AgroResponse agroResponse = new AgroResponse(code, "Error-1");

            return ResponseEntity
                    .status(400)
                    .body(agroResponse);
        }
    }


    @PostMapping(value = "/api/company/got-new-organization/",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> gotNewOrg(@RequestBody Object requestObj,
                                       HttpServletRequest servletRequest) throws JsonProcessingException {

        Map<String, String> allHeaders = getAllHeaders(servletRequest);
//        System.out.println(allHeaders);
        String bearerToken = servletRequest.getHeader("Authorization");
        System.out.println(bearerToken);

        Random rn = new Random();
        int code = rn.nextInt(2);
        AgroResponse agroResponse = new AgroResponse(code, code == 1 ? "Success-2" : "Error-2");
        return ResponseEntity
                .status(200)
                .body(agroResponse);
    }


    @PostMapping(value = "/api/company/transaction/",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> transaction(@RequestBody Object requestObj,
                                         HttpServletRequest servletRequest) throws JsonProcessingException {

        Map<String, String> allHeaders = getAllHeaders(servletRequest);
//        System.out.println(allHeaders);
        String bearerToken = servletRequest.getHeader("Authorization");
        System.out.println(bearerToken);


        Random rn = new Random();
        int code = rn.nextInt(2);
        AgroResponse agroResponse = new AgroResponse(code, code == 1 ? "Success-3" : "Error-3");
        return ResponseEntity
                .status(200)
                .body(agroResponse);
    }


}
