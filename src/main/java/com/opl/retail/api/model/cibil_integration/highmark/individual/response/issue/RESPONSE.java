//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 12:06:19 PM IST 
//


package com.opl.retail.api.model.cibil_integration.highmark.individual.response.issue;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}LOAN-DETAILS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loandetails"
})
@XmlRootElement(name = "RESPONSE")
public class RESPONSE {

    @XmlElement(name = "LOAN-DETAILS", required = true)
    protected LOANDETAILS loandetails;

    /**
     * Gets the value of the loandetails property.
     * 
     * @return
     *     possible object is
     *     {@link LOANDETAILS }
     *     
     */
    public LOANDETAILS getLOANDETAILS() {
        return loandetails;
    }

    /**
     * Sets the value of the loandetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANDETAILS }
     *     
     */
    public void setLOANDETAILS(LOANDETAILS value) {
        this.loandetails = value;
    }

}