//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.24 at 03:23:01 PM UZT 
//


package com.example.mockapi.model.crif.schemes;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MessageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CredentialsResponse" type="{urn:cbs-messagegatewaysoap:2015-01-01}CredentialsResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GroupId" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Idempotence" use="required" type="{urn:cbs-messagegatewaysoap:2015-01-01}MessageIdempotence" /&gt;
 *       &lt;attribute name="ExpirationTimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ResultLanguage" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *       &lt;attribute name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="ResultDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageResponse", propOrder = {
    "credentialsResponse"
})
public class MessageResponse {

    @XmlElement(name = "CredentialsResponse")
    protected CredentialsResponse credentialsResponse;
    @XmlAttribute(name = "GroupId")
    @XmlSchemaType(name = "anyURI")
    protected String groupId;
    @XmlAttribute(name = "Id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Idempotence", required = true)
    protected MessageIdempotence idempotence;
    @XmlAttribute(name = "ExpirationTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationTimeStamp;
    @XmlAttribute(name = "ResultLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String resultLanguage;
    @XmlAttribute(name = "ResultCode")
    @XmlSchemaType(name = "anyURI")
    protected String resultCode;
    @XmlAttribute(name = "ResultDescription")
    protected String resultDescription;

    /**
     * Gets the value of the credentialsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialsResponse }
     *     
     */
    public CredentialsResponse getCredentialsResponse() {
        return credentialsResponse;
    }

    /**
     * Sets the value of the credentialsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialsResponse }
     *     
     */
    public void setCredentialsResponse(CredentialsResponse value) {
        this.credentialsResponse = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the idempotence property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdempotence }
     *     
     */
    public MessageIdempotence getIdempotence() {
        return idempotence;
    }

    /**
     * Sets the value of the idempotence property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdempotence }
     *     
     */
    public void setIdempotence(MessageIdempotence value) {
        this.idempotence = value;
    }

    /**
     * Gets the value of the expirationTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationTimeStamp() {
        return expirationTimeStamp;
    }

    /**
     * Sets the value of the expirationTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationTimeStamp(XMLGregorianCalendar value) {
        this.expirationTimeStamp = value;
    }

    /**
     * Gets the value of the resultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultLanguage() {
        return resultLanguage;
    }

    /**
     * Sets the value of the resultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultLanguage(String value) {
        this.resultLanguage = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDescription(String value) {
        this.resultDescription = value;
    }

}