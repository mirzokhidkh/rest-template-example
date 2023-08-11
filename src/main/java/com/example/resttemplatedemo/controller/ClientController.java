package com.example.resttemplatedemo.controller;

import com.example.resttemplatedemo.model.*;
import com.example.resttemplatedemo.model.crif.Body;
import com.example.resttemplatedemo.model.crif.Envelope;
import com.example.resttemplatedemo.model.crif.SoapBody;
import com.example.resttemplatedemo.model.crif.SoapEnvelope;
import com.example.resttemplatedemo.model.crif.schemes.MGRequest;
import com.example.resttemplatedemo.model.crif.schemes.MGResponse;
import com.example.resttemplatedemo.model.gcp.GcpResponse;
import com.example.resttemplatedemo.model.gcp.schemes.CEPRequest;
import com.example.resttemplatedemo.model.gcp.schemes.CEPResponse;
import com.example.resttemplatedemo.model.gcp.schemes.GetDataByPinppRequest;
import com.example.resttemplatedemo.service.ClientService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.example.resttemplatedemo.test.Test.*;

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


    @PostMapping(value = "/test-form-urlencoded", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE}
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestParam MultiValueMap<String, String> paramMap) {
        ObjectMapper mapper = new ObjectMapper();
        Object myObject = mapper.convertValue(paramMap, Object.class);

        return ResponseEntity
                .status(200)
                .contentType(MediaType.APPLICATION_JSON)
                .body(myObject);

    }

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
                                                HttpServletRequest request) {

        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
        String bearerToken = request.getHeader("Authorization");
        System.out.println(bearerToken);

        String personAddressData = getPersonAddressData();

        System.out.println(requestObj.toString());

        return ResponseEntity
                .status(200)
                .body(personAddressData);
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

    @PostMapping(value = "/test"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> test(@RequestBody Object obj,
                                       HttpServletRequest request
    ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
//        Map<String, String> headers = getAllHeaders(request);
//        System.out.println(headers);

        String legalJson = getLegalJson();

        Object legalObj = objectMapper.readValue(legalJson, Object.class);

        return ResponseEntity
                .status(200)
                .body(legalObj);
//                .body(obj);
//                .body(null);

    }

    @PostMapping(value = "/test-crif-xml",
            consumes = {MediaType.TEXT_XML_VALUE}
            , produces = MediaType.TEXT_XML_VALUE)
    public String soapXmlCrif(@RequestBody MGRequest mgRequest,
                              HttpServletRequest request) throws DatatypeConfigurationException {

//        System.out.println("ID = " + mgRequest.getMessage().getId());

        Map<String, String> allHeaders = getAllHeaders(request);
//        System.out.println(allHeaders);
        System.out.println(request.getHeader("Authorization"));

        MGResponse mgResponse = getMGResponse();


//        Envelope soapEnvelope = new Envelope();
//        Body body = new Body();
//        body.setMgResponse(mgResponse);
//        soapEnvelope.setBody(body);

        String soapEnvelope = getMGResponseStringXml();

        return soapEnvelope;

    }

//    @PostMapping(value = "/soap", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
//    public String processSoapRequest(@RequestBody SoapEnvelope soapEnvelope) throws JAXBException {
//        // Marshal SOAP envelope to XML string
//        JAXBContext jaxbContext = JAXBContext.newInstance(SoapEnvelope.class);
//        Marshaller marshaller = jaxbContext.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//        StringWriter sw = new StringWriter();
//        marshaller.marshal(soapEnvelope, new StreamResult(sw));
//        String soapXml = sw.toString();
//
//        // Process the SOAP request and generate the SOAP response
//
//
//        // Return the SOAP response as XML
//        return soapXml;
//    }


    //    @PostMapping(value = "/test"
//            , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
//    )

    @PostMapping(value = "/test-for-empty")
    public ResponseEntity<Object> testForEmpty(@RequestBody Object obj,
                                               HttpServletRequest request
    ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> headers = getAllHeaders(request);
        System.out.println(headers);
        return ResponseEntity.status(200)
                .contentType(MediaType.APPLICATION_XML)
                .body(null);
    }

    public Map<String, String> getAllHeaders(HttpServletRequest request) {
        Map<String, String> headersMap = new HashMap<>();
        Collections.list(request.getHeaderNames()).forEach(headerName -> headersMap.put(headerName, request.getHeader(headerName)));
        return headersMap;
    }


    @GetMapping(value = "/test-for-get",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> testForGET(@RequestParam Integer id) {
        ExampleDTO exampleDTO = new ExampleDTO(id);
        return ResponseEntity.status(200).body(exampleDTO);

    }

    @PostMapping(value = "/test-form-data"
            , consumes = MediaType.MULTIPART_FORM_DATA_VALUE
            , produces = MediaType.TEXT_HTML_VALUE
//            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> testForFormData(@RequestPart("inn") String inn,
                                                  @RequestPart("token") String token,
                                                  @RequestPart("id_client") String id_client) throws JsonProcessingException {
//        if (inn.equals("0")) {
//            return ResponseEntity.status(200).body(new ResultForStatUz("1", "error"));
//        }
        String str = inn + ", " + token + ", " + id_client;
        System.out.println(str);
        ResultAsync resultAsync = new ResultAsync(1, str);
        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_HTML)
                .body(new ObjectMapper().writeValueAsString(resultAsync));
//                .body(resultAsync);
//        return ResponseEntity.status(200).body(new ResultAsync(1,inn.getName()+", "+token.getName()+", "+id_client.getName()));
    }

//    @PostMapping(value = "/test-form-data",consumes = { MediaType.MULTIPART_FORM_DATA_VALUE },produces = MediaType.APPLICATION_JSON_VALUE)
//        public ResponseEntity<?> testForFormData(@RequestParam MultiValueMap<String,String> paramMap) {
//        return ResponseEntity.status(200).body(paramMap);
//        }

}