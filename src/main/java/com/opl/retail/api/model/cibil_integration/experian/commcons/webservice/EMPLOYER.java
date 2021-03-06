
package com.opl.retail.api.model.cibil_integration.experian.commcons.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMPLOYER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMPLOYER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccupationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetMontlyIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccYearsEmployed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccMonthsEmployed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMPLOYER", propOrder = {
    "segmentCode",
    "occupationCode",
    "netMontlyIncome",
    "occYearsEmployed",
    "occMonthsEmployed"
})
public class EMPLOYER {

    @XmlElement(name = "SegmentCode")
    protected String segmentCode;
    @XmlElement(name = "OccupationCode")
    protected String occupationCode;
    @XmlElement(name = "NetMontlyIncome")
    protected String netMontlyIncome;
    @XmlElement(name = "OccYearsEmployed")
    protected String occYearsEmployed;
    @XmlElement(name = "OccMonthsEmployed")
    protected String occMonthsEmployed;

    /**
     * Gets the value of the segmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentCode() {
        return segmentCode;
    }

    /**
     * Sets the value of the segmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentCode(String value) {
        this.segmentCode = value;
    }

    /**
     * Gets the value of the occupationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationCode() {
        return occupationCode;
    }

    /**
     * Sets the value of the occupationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationCode(String value) {
        this.occupationCode = value;
    }

    /**
     * Gets the value of the netMontlyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetMontlyIncome() {
        return netMontlyIncome;
    }

    /**
     * Sets the value of the netMontlyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetMontlyIncome(String value) {
        this.netMontlyIncome = value;
    }

    /**
     * Gets the value of the occYearsEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccYearsEmployed() {
        return occYearsEmployed;
    }

    /**
     * Sets the value of the occYearsEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccYearsEmployed(String value) {
        this.occYearsEmployed = value;
    }

    /**
     * Gets the value of the occMonthsEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccMonthsEmployed() {
        return occMonthsEmployed;
    }

    /**
     * Sets the value of the occMonthsEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccMonthsEmployed(String value) {
        this.occMonthsEmployed = value;
    }

}
