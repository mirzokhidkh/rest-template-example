package com.example.qqbclientservice.service;

import com.example.qqbclientservice.model.ReceiverRequest;
import com.example.qqbclientservice.model.payload.RequestBodyDTO;
import com.example.qqbclientservice.util.Util;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
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

    @Value("${generic.proxyHost}")
    private String proxyHost;

    @Value("${generic.proxyPort}")
    private Integer proxyPort;


    @SneakyThrows
    @Override
    public ResponseEntity<?> receiver(ReceiverRequest receiverRequest) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<?> response = null;
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));
        headers.setContentType(MediaType.APPLICATION_JSON);

        String requestBodyAsString = Util.convertObjectToJsonString(receiverRequest.getRequestBody());
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestBodyAsString, headers);

        String strUrl;
        strUrl = receiverRequest.getServiceUrl() + "/" + receiverRequest.getMethodName();

//        System.out.println("receiverRequest.getRequestBody() = " + receiverRequest.getRequestBody());
        Object requestBody = receiverRequest.getRequestBody();
        if (requestBody != null) {
//            System.out.println("receiverRequest.getRequestBody() = " + requestBodyAsString);

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

//        URL url = new URL(strUrl);
//        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection(proxy);
//        urlConnection.setRequestProperty("Content-Type", "application/json");
//        urlConnection.setRequestProperty("Accept", "application/json");

        switch (receiverRequest.getHttpMethodType()) {
            case POST:
                try {
                    response = restTemplate.postForEntity(strUrl, requestEntity, String.class);
                } catch (HttpStatusCodeException e) {
                    return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
                            .body(e.getResponseBodyAsString());
                }
                break;
            case GET:
                clientHttpReq.setProxy(proxy);
                restTemplate = new RestTemplate(clientHttpReq);
                response = restTemplate.exchange(strUrl, HttpMethod.GET, requestEntity, String.class);


//                response = restTemplate.getForEntity(url, String.class);

//                urlConnection.setRequestMethod("GET");
//                InputStream inputStream = urlConnection.getInputStream();
//                if (requestBody != null) {
//                    JSONObject jsonObject = Util.getJsonFromInStream(inputStream);
//                    response = ResponseEntity.ok(jsonObject.toString());
//
//                } else {
//                    JSONArray jsonArray = Util.getJsonArraysFromInStream(inputStream);
//                    response = ResponseEntity.ok(jsonArray.toString());
//                }

                break;
            case PUT:
                response = restTemplate.exchange(strUrl, HttpMethod.PUT, requestEntity, String.class);
            default:

        }
        return response;
    }
}
