//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 12:06:19 PM IST 
//


package com.opl.retail.api.model.cibil_integration.highmark.individual.response.issue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VARIATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VARIATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPORTED-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VARIATION", propOrder = {

})
public class VARIATION {

    @XmlElement(name = "VALUE", required = true)
    protected String value;
    @XmlElement(name = "REPORTED-DATE")
    protected String reporteddate;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUE(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the reporteddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTEDDATE() {
        return reporteddate;
    }

    /**
     * Sets the value of the reporteddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTEDDATE(String value) {
        this.reporteddate = value;
    }

}
