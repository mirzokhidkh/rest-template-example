package com.example.mockapi.model.crif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
    @XmlElement(name = "MGResponse", namespace = "urn:cbs-messagegatewaysoap:2015-01-01")
    private Object mgResponse;

    public Object getMgResponse() {
        return mgResponse;
    }

    public void setMgResponse(Object mgResponse) {
        this.mgResponse = mgResponse;
    }
}
