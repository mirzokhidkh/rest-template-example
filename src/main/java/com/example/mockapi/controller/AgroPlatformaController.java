package com.example.mockapi.controller;

import com.example.mockapi.model.agroplatform.AgroResponse;
import com.example.mockapi.model.agroplatform.NewOrganization;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.Map;
import java.util.Random;

import static com.example.mockapi.test.Test.getAllHeaders;
import static com.example.mockapi.test.UzAgroTestJson.getGetNewOrg;



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
//        int code = 1;
        if (code == 1)  {
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
            int queryIdStr = 10000 + rn.nextInt(100000);
//            newOrganization.setQueryId(queryIdStr);
            newOrganization.setQueryId(12345);
            //305029060
            //
            newOrganization.setInn("305029060");
            newOrganization.setClientBranch("00440");
            newOrganization.setClient(accounts[rn.nextInt(accounts.length)]);
//            newOrganization.setClient("23112000600100001503");
//            newOrganization.setClient("22618000799000004001");
//            newOrganization.setClient("20208000900812465001");
//            newOrganization.setClient("23112000600100001503");
//            newOrganization.setClient("13301000304452225223");
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
                                       HttpServletRequest servletRequest) throws JsonProcessingException, InterruptedException {

        Map<String, String> allHeaders = getAllHeaders(servletRequest);
//        System.out.println(allHeaders);
        String bearerToken = servletRequest.getHeader("Authorization");
        System.out.println(bearerToken);

        Random rn = new Random();
//        int code = rn.nextInt(2);
        int code = 1;

//        Thread.sleep(5000);
        AgroResponse agroResponse = new AgroResponse(code, code == 1 ? "Success-2" : "Error-2");
        return ResponseEntity
                .status(200)
                .body(agroResponse);
    }


    @PostMapping(value = "/api/company/transaction/",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> transaction(@RequestBody Object requestObj,
                                         HttpServletRequest servletRequest) throws JsonProcessingException, InterruptedException {

        Map<String, String> allHeaders = getAllHeaders(servletRequest);
//        System.out.println(allHeaders);
        String bearerToken = servletRequest.getHeader("Authorization");
        System.out.println(bearerToken);


        Random rn = new Random();
//        int code = rn.nextInt(2);
        int code = 1;

        AgroResponse agroResponse = new AgroResponse(code, code == 1 ? "Success-3" : "Error-3");

//        Thread.sleep(5000);

        return ResponseEntity
                .status(200)
                .body(agroResponse);
    }


    public static void main(String[] args) {
//        String hello = FbEncoder.getEncrypt("hello");
//        System.out.println(hello);


    }

}
