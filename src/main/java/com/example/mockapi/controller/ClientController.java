package com.example.mockapi.controller;

import com.example.mockapi.model.*;
import com.example.mockapi.model.crif.schemes.MGRequest;
import com.example.mockapi.model.crif.schemes.MGResponse;
import com.example.mockapi.service.ClientService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//import static com.example.resttemplatedemo.test.LargeDataJson.getBigData;
import static com.example.mockapi.test.Test.*;

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


    @PostMapping(value = "/test"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> test(@RequestBody Object obj,
                                       HttpServletRequest request
    ) throws JsonProcessingException, InterruptedException {

        Thread.sleep(120000);

        ObjectMapper objectMapper = new ObjectMapper();
//        Map<String, String> headers = getAllHeaders(request);
//        System.out.println(headers);

        String legalJson = getLegalJson();

        Object legalObj = objectMapper.readValue(legalJson, Object.class);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(obj);
        System.out.println(json);

//        Thread.sleep(31*1000);
//
        System.out.println("RESPONSE");


        return ResponseEntity
                .status(200)
                .body(legalObj);
//                .status(503)
//                .body(null);
    }

    @PostMapping(value = "/getAgreement"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> getAgreement(@RequestBody Object obj,
                                       HttpServletRequest request
    ) throws JsonProcessingException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();

        String agreementResponseJsonStr = getAgreementResponseJsonStr();

        Object agreementResponse = objectMapper.readValue(agreementResponseJsonStr, Object.class);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(obj);
        System.out.println(json);

//        Thread.sleep(31*1000);
//
        System.out.println("RESPONSE");


        return ResponseEntity
                .status(200)
                .body(agreementResponse);

    }


    @PostMapping(value = "/test-4xx"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> testForBad4xx(@RequestBody Object obj,
                                                HttpServletRequest request
    ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
//        Map<String, String> headers = getAllHeaders(request);
//        System.out.println(headers);

        String legalJson = getLegalJson();

        Object legalObj = objectMapper.readValue(legalJson, Object.class);

        return ResponseEntity
                .status(400)
                .body(legalObj);
//                .body(obj);
//                .body(null);
    }

    @PostMapping(value = "/test-5xx"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> testForBad5xx(@RequestBody Object obj,
                                                HttpServletRequest request
    ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
//        Map<String, String> headers = getAllHeaders(request);
//        System.out.println(headers);

        String legalJson = getLegalJson();

        Object legalObj = objectMapper.readValue(legalJson, Object.class);

        return ResponseEntity
//                .internalServerError()
                .status(500)
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

        ExampleDTO exampleDTO = new ExampleDTO(id, null);
        return ResponseEntity.status(200).body(exampleDTO);

    }
    @GetMapping(value = "/test-for-get-str",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> testForGET(@RequestParam String id) {
        ExampleDTO exampleDTO = new ExampleDTO(1, null);
        return ResponseEntity.status(200).body(exampleDTO);

    }

    @GetMapping(value = "/test-for-get-v2",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> testForGET() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String legalJson = getLegalJson();
        Object legalObj = objectMapper.readValue(legalJson, Object.class);

        return ResponseEntity.status(200).body(legalObj);

    }


    @GetMapping(value = "/test-for-get-v3/{code}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> testForGETv3(@PathVariable String code) {
        ExampleDTO exampleDTO = new ExampleDTO(0, code);
        return ResponseEntity.status(200).body(exampleDTO);

    }


    @DeleteMapping(value = "/test-for-delete/{code}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteByID(@PathVariable String code) {
        ExampleDTO exampleDTO = new ExampleDTO(0, code + " deleted");
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


    @GetMapping("/v1/download-order")
    public ResponseEntity<?> downloadFile(@RequestParam String id) {
//    public void downloadFile(@RequestParam String id,
//                             HttpServletResponse response) throws IOException {

        if (id.equals("0")) {
            ExampleDTO exampleDTO = new ExampleDTO(0, id);
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(exampleDTO);
        }

//        Resource resource = new FileSystemResource("D:\\C DISK\\desktop\\mini desktop\\fb\\CLIENT services\\uz-avto-savdo-client\\UzAvtoSavdo Bank API.pdf");
//        Resource resource = new FileSystemResource("D:\\my-desktop\\mini-desktop\\fb\\CLIENT-services\\uz-avto-savdo-client\\UzAvtoSavdo Bank API.pdf");
//        Resource resource = new FileSystemResource("D:\\my-desktop\\mini-desktop\\work\\fb\\CLIENT-services\\uz-avto-savdo-client\\UzAvtoSavdo Bank API.pdf");
        Resource resource = new FileSystemResource("D:\\my-desktop\\mini-desktop\\work\\fb\\CLIENT-services\\luna-platform-client\\error\\image\\4dc1c958-556a-470c-8dfb-334cb39e486c.jpg");


//        String contentType = "application/octet-stream";
        String headerValue = "attachment; filename=\"" + resource.getFilename() + "\"";

        return ResponseEntity.ok()
//                .contentType(MediaType.parseMediaType(contentType))
//                .contentType(MediaType.APPLICATION_PDF)
                .contentType(MediaType.IMAGE_JPEG)
//                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, headerValue)
                .body(resource);

//        response.setContentType(contentType);
//        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, headerValue);
//        response.setContentLengthLong(resource.contentLength());
//
//        StreamUtils.copy(resource.getInputStream(), response.getOutputStream());

    }


//    @PostMapping(value = "/katm-api/v1/credit/report"
    @PostMapping(value = "/credit/registration"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> getKATM(@RequestBody Object obj,
                                          HttpServletRequest request
    ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

//        String creditReportKATM = getCreditReportKATM();
        String creditReportKATM = getCreditReportKATMError();

        Object legalObj = objectMapper.readValue(creditReportKATM, Object.class);

        System.out.println(obj);

        return ResponseEntity
                .status(500)
//                .status(200)
                .contentType(MediaType.APPLICATION_JSON)
                .body(legalObj);
//
    }

    @PostMapping(value = "/test1"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> test2(@RequestBody Object obj,
                                       HttpServletRequest request
    ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String legalJson = getLegalJson();
        Object legalObj = objectMapper.readValue(legalJson, Object.class);
        System.out.println(obj);
        return ResponseEntity
                .status(200)
                .body(legalObj);
    }


    @PostMapping(value = "/testString"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.TEXT_PLAIN_VALUE
    )
    public ResponseEntity<Object> testString(@RequestBody Object obj,
                                        HttpServletRequest request
    ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String legalJson = getLegalJson();
        Object legalObj = objectMapper.readValue(legalJson, Object.class);
        System.out.println(obj);
        return ResponseEntity
                .status(200)
                .body("Hello");
    }


    @PostMapping(value = "/test-big-respose-data"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> testBigResponseData(@RequestBody Object obj,
                                       HttpServletRequest request
    ) throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
//        Map<String, String> headers = getAllHeaders(request);
//        System.out.println(headers);

//        String bigData = getBigData();
//        String bigData = new String(Files.readAllBytes(Paths.get("src/main/java/com/example/resttemplatedemo/test/bigData.json")));
//        String bigData = new String(Files.readAllBytes(Paths.get("src/main/java/com/example/resttemplatedemo/test/get-client-card-list.txt")));
//        String bigData = new String(Files.readAllBytes(Paths.get("src/main/java/com/example/mockapi/test/big/checkRequest_Response.json")));
        String bigData = new String(Files.readAllBytes(Paths.get("src/main/java/com/example/mockapi/test/big/big-json-data.txt")));
        Object bigDataJson = objectMapper.readValue(bigData, Object.class);

//        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//        String json = ow.writeValueAsString(obj);
//        System.out.println(json);

//        Thread.sleep(31*1000);
//
        System.out.println("RESPONSE");


        return ResponseEntity
                .status(200)
                .body(bigDataJson);
//                .status(503)
//                .body(null);
    }






//    public static void main(String[] args) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        String bigData = new String(Files.readAllBytes(Paths.get("src/main/java/com/example/resttemplatedemo/test/bigData.json")));
//        Object bigDataJson = objectMapper.readValue(bigData, Object.class);
//
//                ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//        String json = ow.writeValueAsString(bigDataJson);
//        System.out.println(json);
//
//    }


}