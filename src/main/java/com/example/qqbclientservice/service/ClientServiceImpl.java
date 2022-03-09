package com.example.qqbclientservice.service;

import com.example.qqbclientservice.model.ReceiverRequest;
import com.example.qqbclientservice.model.payload.RequestBodyDTO;
import com.example.qqbclientservice.util.Util;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Arrays;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    RestTemplate restTemplate;

    @Value("${generic.proxyHost}")
    private String proxyHost;

    @Value("${generic.proxyPort}")
    private Integer proxyPort;


    @SneakyThrows
    @Override
    public ResponseEntity<?> receiver(ReceiverRequest receiverRequest) {
        ResponseEntity<?> response = null;
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));
        headers.setContentType(MediaType.APPLICATION_JSON);

        String requestBodyAsString = Util.convertObjectToJsonString(receiverRequest.getRequestBody());
        HttpEntity<String> requestEntity;
        String strUrl;
        strUrl = receiverRequest.getServiceUrl() + "/" + receiverRequest.getMethodName();

        Object requestBody = receiverRequest.getRequestBody();
        if (requestBody != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            RequestBodyDTO requestBodyDTO =
                    objectMapper.convertValue(requestBody, new TypeReference<RequestBodyDTO>() {
                    });

            if (requestBodyDTO.getId() != null) {
                strUrl += "/" + requestBodyDTO.getId();
            }
        }

        SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
        clientHttpReq.setProxy(proxy);
//        restTemplate.setRequestFactory(clientHttpReq);


        switch (receiverRequest.getHttpMethodType()) {
            case POST:
                requestEntity = new HttpEntity<String>(requestBodyAsString, headers);

                try {
                    response = restTemplate.postForEntity(strUrl, requestEntity, String.class);
                } catch (HttpStatusCodeException e) {
//                    return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
//                            .body(e.getResponseBodyAsString());
                    return ResponseEntity.status(e.getRawStatusCode())
                            .body(e.getResponseBodyAsString());

                }
                break;
            case GET:
                requestEntity = new HttpEntity<String>(headers);
                try {
                    response = restTemplate.exchange(strUrl, HttpMethod.GET, requestEntity, String.class);
                } catch (HttpStatusCodeException e) {
                    return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
                            .body(e.getResponseBodyAsString());
                }
                break;
            case PUT:
                requestEntity = new HttpEntity<String>(requestBodyAsString, headers);
                response = restTemplate.exchange(strUrl, HttpMethod.PUT, requestEntity, String.class);
            default:

        }
        return response;
    }
}
