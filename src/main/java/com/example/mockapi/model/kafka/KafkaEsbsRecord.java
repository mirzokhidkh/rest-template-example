package com.example.mockapi.model.kafka;


public class KafkaEsbsRecord {

    private KafkaHeader header;

    private Object body;

    public KafkaEsbsRecord() {
    }

    public KafkaHeader getHeader() {
        return header;
    }

    public void setHeader(KafkaHeader header) {
        this.header = header;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
