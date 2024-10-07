package com.example.mockapi.model.crif;

import com.example.mockapi.model.crif.schemes.MGResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Body")
public class SoapBody {

    @XmlElement(name = "MGResponse")
    private MGResponse mgResponse;

    public MGResponse getMgResponse() {
        return mgResponse;
    }

    public void setMgResponse(MGResponse mgResponse) {
        this.mgResponse = mgResponse;
    }
}