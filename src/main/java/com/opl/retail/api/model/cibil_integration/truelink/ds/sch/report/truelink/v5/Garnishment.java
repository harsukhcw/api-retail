
package com.opl.retail.api.model.cibil_integration.truelink.ds.sch.report.truelink.v5;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


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
 *       &lt;/sequence>
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="dateSatisfied" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="garnishee" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="plaintiff" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Garnishment")
public class Garnishment {

    @XmlAttribute(name = "amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "dateSatisfied")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSatisfied;
    @XmlAttribute(name = "garnishee")
    protected String garnishee;
    @XmlAttribute(name = "plaintiff")
    protected String plaintiff;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the dateSatisfied property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSatisfied() {
        return dateSatisfied;
    }

    /**
     * Sets the value of the dateSatisfied property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSatisfied(XMLGregorianCalendar value) {
        this.dateSatisfied = value;
    }

    /**
     * Gets the value of the garnishee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGarnishee() {
        return garnishee;
    }

    /**
     * Sets the value of the garnishee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGarnishee(String value) {
        this.garnishee = value;
    }

    /**
     * Gets the value of the plaintiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaintiff() {
        return plaintiff;
    }

    /**
     * Sets the value of the plaintiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaintiff(String value) {
        this.plaintiff = value;
    }

}
