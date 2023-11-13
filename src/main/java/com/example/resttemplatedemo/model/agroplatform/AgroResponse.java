package com.example.resttemplatedemo.model.agroplatform;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AgroResponse {
	private int code;
	private String text;
}