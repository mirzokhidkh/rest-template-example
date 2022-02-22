package com.example.qqbclientservice.util;

import com.example.qqbclientservice.exception.CustomizedRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Util {


    public static String convertObjectToJsonString(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new CustomizedRequestException("Error while converting object to string: " + e.getMessage(), 2, 400);
        }
        return jsonString;
    }

    public static JSONObject getJsonFromInStream(InputStream inputStream ) throws IOException, JSONException {
        StringBuilder responseStrBuilder = getResponseStringBuilder(inputStream);

        return new JSONObject(responseStrBuilder.toString());
    }

    public static JSONArray getJsonArraysFromInStream(InputStream inputStream ) throws IOException, JSONException {
        StringBuilder responseStrBuilder = getResponseStringBuilder(inputStream);

        return new JSONArray (responseStrBuilder.toString());
    }

    private static StringBuilder getResponseStringBuilder(InputStream inputStream) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";

        StringBuilder responseStrBuilder = new StringBuilder();
        while ((line = bR.readLine()) != null) {
            responseStrBuilder.append(line);
        }
        inputStream.close();
        return responseStrBuilder;
    }

}
