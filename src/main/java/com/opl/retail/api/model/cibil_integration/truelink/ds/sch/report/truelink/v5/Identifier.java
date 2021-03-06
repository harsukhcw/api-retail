
package com.opl.retail.api.model.cibil_integration.truelink.ds.sch.report.truelink.v5;


import com.opl.retail.api.model.cibil_integration.truelink.ds.sch.pii.v1.IdentifierType;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="ID" type="{com/truelink/ds/sch/pii/v1}IdentifierType"/>
 *         &lt;element ref="{com/truelink/ds/sch/report/truelink/v5}Source"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dateIssued" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="dateReported" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="dateExpired" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="partitionSet" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "source"
})
@XmlRootElement(name = "Identifier")
public class Identifier {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Source", required = true)
    protected Source source;
    @XmlAttribute(name = "dateIssued")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateIssued;
    @XmlAttribute(name = "dateReported")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateReported;
    @XmlAttribute(name = "dateExpired")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateExpired;
    @XmlAttribute(name = "partitionSet")
    protected Integer partitionSet;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setId(IdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the dateIssued property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateIssued() {
        return dateIssued;
    }

    /**
     * Sets the value of the dateIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateIssued(XMLGregorianCalendar value) {
        this.dateIssued = value;
    }

    /**
     * Gets the value of the dateReported property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReported() {
        return dateReported;
    }

    /**
     * Sets the value of the dateReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReported(XMLGregorianCalendar value) {
        this.dateReported = value;
    }

    /**
     * Gets the value of the dateExpired property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateExpired() {
        return dateExpired;
    }

    /**
     * Sets the value of the dateExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateExpired(XMLGregorianCalendar value) {
        this.dateExpired = value;
    }

    /**
     * Gets the value of the partitionSet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartitionSet() {
        return partitionSet;
    }

    /**
     * Sets the value of the partitionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartitionSet(Integer value) {
        this.partitionSet = value;
    }

}
