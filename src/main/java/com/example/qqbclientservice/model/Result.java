package com.example.qqbclientservice.model;


public class Result extends uz.fidobiznes.qqbmibapi.model.ResultAsync {

    private Object responseBody;

    public Result() {
    }


    public Object getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(Object responseBody) {
        this.responseBody = responseBody;
    }
}
