package com.example.resttemplatedemo.model.gcp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GcpResponse {

    private Integer resultCode;

    private Object data;

    private String comments;

}
