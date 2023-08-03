package com.example.resttemplatedemo.model.crif;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Envelope")
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapEnvelope {

    @XmlElement(name = "Body")
    private SoapBody body;

    public SoapBody getBody() {
        return body;
    }

    public void setBody(SoapBody body) {
        this.body = body;
    }
}



