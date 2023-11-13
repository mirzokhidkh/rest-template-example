package com.example.resttemplatedemo.controller;

import com.example.resttemplatedemo.model.gcp.schemes.CEPRequest;
import com.example.resttemplatedemo.model.gcp.schemes.GetDataByPinppRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.example.resttemplatedemo.test.Test.*;

@RestController
public class GCPMockController {
    @PostMapping(value = "/oauth2/token", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE}
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login2(@RequestParam MultiValueMap<String, String> paramMap) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String str = "{\n" +
                "    \"access_token\": \"eyJ4NXQiOiJNell4TW1Ga09HWXdNV0kwWldObU5EY3hOR1l3WW1NNFpUQTNNV0kyTkRBelpHUXpOR00wWkdSbE5qSmtPREZrWkRSaU9URmtNV0ZoTXpVMlpHVmxOZyIsImtpZCI6Ik16WXhNbUZrT0dZd01XSTBaV05tTkRjeE5HWXdZbU00WlRBM01XSTJOREF6WkdRek5HTTBaR1JsTmpKa09ERmtaRFJpT1RGa01XRmhNelUyWkdWbE5nX1JTMjU2IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJ0cmFzdGJhbmstdXNlciIsImF1dCI6IkFQUExJQ0FUSU9OX1VTRVIiLCJhdWQiOiIzbUJnclI3aFZaMjRobzF4UUZ6TGxyN245X0lhIiwibmJmIjoxNjg5MTQxMjc4LCJhenAiOiIzbUJnclI3aFZaMjRobzF4UUZ6TGxyN245X0lhIiwic2NvcGUiOiJkZWZhdWx0IiwiaXNzIjoiaHR0cHM6XC9cL3JtcC1kZS5lZ292LnV6Ojk0NDNcL29hdXRoMlwvdG9rZW4iLCJleHAiOjE2ODkxNDQ4NzgsImlhdCI6MTY4OTE0MTI3OCwianRpIjoiZTg4NWY4MTctYWRiNS00NWIxLWI1YjgtOWI2Y2RkZjllOTdkIn0.BXtvxBJhtK8aBtbG6surAVln_6gMILJaP5P0fLr6kNhYcjFZtcUZmZoWLD1oByyuL3PFftb38udhXa0boOWvmZ7bGJLuQfYSZz0byqtXqmu49u8layY86IymVm3E3Jv7pwL8330DicAz_t_fan2Gcwd884pyxXv76BYnNvadNaXKTDddIeoXPelBV6JTS-x0QQWzcWD4igArwqWynBhkgDWLG1VwW_Sf4op6Wll_FrKvCsPYj230PZ-uF6ZM-bppJRtOa0YQwm5afqoOKZbXTsZ6YDmhXcjeDsIPpiiOW5PHS7sMaKxHtsaLmDRxQyvhrywh3lBEG5hLefIIuw8EPA\",\n" +
                "    \"refresh_token\": \"538a1f40-ef16-352d-86db-4e4fe01af40f\",\n" +
                "    \"scope\": \"default\",\n" +
                "    \"token_type\": \"Bearer\",\n" +
                "    \"expires_in\": 3600\n" +
                "}";

        Object myObject = mapper.readValue(str, Object.class);


        return ResponseEntity
                .status(200)
                .contentType(MediaType.APPLICATION_JSON)
                .body(myObject);

    }


    @PostMapping(value = "/gcp/pinser/v1", consumes = {MediaType.TEXT_XML_VALUE}
//            , produces = MediaType.TEXT_XML_VALUE
    )
    public ResponseEntity<?> soapXmlTest(@RequestBody GetDataByPinppRequest getDataByPinppRequest,
                                         HttpServletRequest request) {


        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
        String bearerToken = request.getHeader("Authorization");
        System.out.println(bearerToken);

//        CEPResponse cepResponse = getResponseXml();
        String cepResponse = getCEPResponseStringXMl();


//        GcpResponse gcpResponse = new GcpResponse();
//        gcpResponse.setComments("No Auth");

        return ResponseEntity
                .status(200)
                .body(cepResponse);
    }

    @PostMapping(value = "/gcp/datedoc/v1", consumes = {MediaType.TEXT_XML_VALUE}
            , produces = MediaType.TEXT_XML_VALUE)
//    public CEPResponse soapXmlTest(@RequestBody CEPRequest cepRequest,
    public String soapXmlTest2(@RequestBody CEPRequest cepRequest,
                               HttpServletRequest request) {


        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
        String bearerToken = request.getHeader("Authorization");
        System.out.println(bearerToken);

//        CEPResponse cepResponse = getResponseXml();
        String cepResponse = GetDataByDocResponseStringXMl();

//        return cepResponse;

//        Envelope soapEnvelope = new Envelope();
//        Body body = new Body();
//        body.setMgResponse(cepResponse);
//        soapEnvelope.setBody(body);
//        return soapEnvelope;

        return cepResponse;
    }


    @PostMapping(value = "/mvd/services/address/info/pin/v1", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getPersonAddresses(@RequestBody Object requestObj,
                                                     HttpServletRequest request) throws JsonProcessingException {

        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
        String bearerToken = request.getHeader("Authorization");
        System.out.println(bearerToken);

        String personAddressData = getPersonAddressData();

        System.out.println(requestObj.toString());

        ObjectMapper objectMapper = new ObjectMapper();
        Object pAddress = objectMapper.readValue(personAddressData, Object.class);


        return ResponseEntity
                .status(200)
                .body(pAddress);
    }


    @PostMapping(value = "/dxa/service/business-reg/v1/individuals", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getIndividual(@RequestBody Object requestObj,
                                                HttpServletRequest request) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
        String bearerToken = request.getHeader("Authorization");
        System.out.println(bearerToken);


        System.out.println(requestObj.toString());

        String individualJson = getIndividualJson();
        Object individualObj = objectMapper.readValue(individualJson, Object.class);


        return ResponseEntity
                .status(200)
                .body(individualObj);
    }


    @PostMapping(value = "/dxa/service/business-reg/v1/legal", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getLegal(@RequestBody Object requestObj,
                                           HttpServletRequest request) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
        String bearerToken = request.getHeader("Authorization");
        System.out.println(bearerToken);
        System.out.println(requestObj.toString());

        String legalJson = getLegalJson();

        Object legalObj = objectMapper.readValue(legalJson, Object.class);


        return ResponseEntity
                .status(200)
                .body(legalObj);
    }

    @PostMapping(value = "/gcp/docrest/v1", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getPassportData(@RequestBody Object requestObj,
                                                  HttpServletRequest request) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
        String bearerToken = request.getHeader("Authorization");
        System.out.println(bearerToken);
        System.out.println(requestObj.toString());

        String passportDataJson = getPassportDataJson();

//        FileInputStream fis = new FileInputStream("src/main/resources/mockPassportDataRes.json");
//        String passportDataJson = IOUtils.toString(fis, StandardCharsets.UTF_8);

        Object legalObj = objectMapper.readValue(passportDataJson, Object.class);


        return ResponseEntity
                .status(200)
                .body(legalObj);
    }





    @SneakyThrows
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        FileInputStream fis = new FileInputStream("src/main/resources/mockPassportDataRes.json");
        String passportDataJson = IOUtils.toString(fis, StandardCharsets.UTF_8);

        String example = "asassa\r\nasasa\r\n";
        System.out.println(example);
//        passportDataJson = passportDataJson.replace("\r\n", "");
//
//        System.out.println(passportDataJson);

        String input = "asassa\\r\\nasasa\\r\\n";
        String output = input.replace("\r\n", "");
        System.out.println(input);
        System.out.println(output);

        Object legalObj = objectMapper.readValue(passportDataJson, Object.class);


    }



}
