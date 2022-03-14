package com.example.resttemplatedemo.model;

import com.example.resttemplatedemo.model.enums.HttpMethodType;
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
