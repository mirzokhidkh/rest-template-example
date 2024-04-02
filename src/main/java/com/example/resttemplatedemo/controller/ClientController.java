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
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import java.io.IOException;
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


    @PostMapping(value = "/test"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> test(@RequestBody Object obj,
                                       HttpServletRequest request
    ) throws JsonProcessingException, InterruptedException {
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
        Resource resource = new FileSystemResource("D:\\my-desktop\\mini-desktop\\fb\\CLIENT-services\\uz-avto-savdo-client\\UzAvtoSavdo Bank API.pdf");


        String contentType = "application/octet-stream";
        String headerValue = "attachment; filename=\"" + resource.getFilename() + "\"";

        return ResponseEntity.ok()
//                .contentType(MediaType.parseMediaType(contentType))
                .contentType(MediaType.APPLICATION_PDF)
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

}