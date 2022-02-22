package com.example.qqbclientservice.model;

import com.example.qqbclientservice.model.enums.HttpMethodType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReceiverRequest {
    private String serviceUrl;
    private String methodName;
    private HttpMethodType httpMethodType;
    private Object requestBody;
}
