//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 03:32:34 PM IST 
//


package com.opl.retail.api.model.cibil_integration.highmark.individual.response.acknow;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="INQUIRY-STATUS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}INQUIRY" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "inquirystatus"
})
@XmlRootElement(name = "REPORT-FILE")
public class REPORTFILE {

    @XmlElement(name = "INQUIRY-STATUS", required = true)
    protected REPORTFILE.INQUIRYSTATUS inquirystatus;

    /**
     * Gets the value of the inquirystatus property.
     *
     * @return
     *     possible object is
     *     {@link REPORTFILE.INQUIRYSTATUS }
     *
     */
    public REPORTFILE.INQUIRYSTATUS getINQUIRYSTATUS() {
        return inquirystatus;
    }

    /**
     * Sets the value of the inquirystatus property.
     *
     * @param value
     *     allowed object is
     *     {@link REPORTFILE.INQUIRYSTATUS }
     *
     */
    public void setINQUIRYSTATUS(REPORTFILE.INQUIRYSTATUS value) {
        this.inquirystatus = value;
    }


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
     *         &lt;element ref="{}INQUIRY" maxOccurs="unbounded"/>
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
        "inquiry"
    })
    public static class INQUIRYSTATUS {

        @XmlElement(name = "INQUIRY", required = true)
        protected List<INQUIRY> inquiry;

        /**
         * Gets the value of the inquiry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inquiry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINQUIRY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INQUIRY }
         * 
         * 
         */
        public List<INQUIRY> getINQUIRY() {
            if (inquiry == null) {
                inquiry = new ArrayList<INQUIRY>();
            }
            return this.inquiry;
        }

    }

}