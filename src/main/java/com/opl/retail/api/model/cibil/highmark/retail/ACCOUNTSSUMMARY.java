//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.01 at 12:33:58 PM IST 
//


package com.opl.retail.api.model.cibil.highmark.retail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}PRIMARY-ACCOUNTS-SUMMARY" minOccurs="0"/>
 *         &lt;element ref="{}SECONDARY-ACCOUNTS-SUMMARY" minOccurs="0"/>
 *         &lt;element ref="{}DERIVED-ATTRIBUTES" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ACCOUNTS-SUMMARY")
public class ACCOUNTSSUMMARY {

    @XmlElement(name = "PRIMARY-ACCOUNTS-SUMMARY")
    protected PRIMARYACCOUNTSSUMMARY primaryaccountssummary;
    @XmlElement(name = "SECONDARY-ACCOUNTS-SUMMARY")
    protected SECONDARYACCOUNTSSUMMARY secondaryaccountssummary;
    @XmlElement(name = "DERIVED-ATTRIBUTES")
    protected DERIVEDATTRIBUTES derivedattributes;

    /**
     * Gets the value of the primaryaccountssummary property.
     * 
     * @return
     *     possible object is
     *     {@link PRIMARYACCOUNTSSUMMARY }
     *     
     */
    public PRIMARYACCOUNTSSUMMARY getPRIMARYACCOUNTSSUMMARY() {
        return primaryaccountssummary;
    }

    /**
     * Sets the value of the primaryaccountssummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRIMARYACCOUNTSSUMMARY }
     *     
     */
    public void setPRIMARYACCOUNTSSUMMARY(PRIMARYACCOUNTSSUMMARY value) {
        this.primaryaccountssummary = value;
    }

    /**
     * Gets the value of the secondaryaccountssummary property.
     * 
     * @return
     *     possible object is
     *     {@link SECONDARYACCOUNTSSUMMARY }
     *     
     */
    public SECONDARYACCOUNTSSUMMARY getSECONDARYACCOUNTSSUMMARY() {
        return secondaryaccountssummary;
    }

    /**
     * Sets the value of the secondaryaccountssummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECONDARYACCOUNTSSUMMARY }
     *     
     */
    public void setSECONDARYACCOUNTSSUMMARY(SECONDARYACCOUNTSSUMMARY value) {
        this.secondaryaccountssummary = value;
    }

    /**
     * Gets the value of the derivedattributes property.
     * 
     * @return
     *     possible object is
     *     {@link DERIVEDATTRIBUTES }
     *     
     */
    public DERIVEDATTRIBUTES getDERIVEDATTRIBUTES() {
        return derivedattributes;
    }

    /**
     * Sets the value of the derivedattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERIVEDATTRIBUTES }
     *     
     */
    public void setDERIVEDATTRIBUTES(DERIVEDATTRIBUTES value) {
        this.derivedattributes = value;
    }

}
