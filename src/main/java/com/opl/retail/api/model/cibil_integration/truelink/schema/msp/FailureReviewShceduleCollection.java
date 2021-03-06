
package com.opl.retail.api.model.cibil_integration.truelink.schema.msp;

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
 *         &lt;element name="FailureReviewSchedule" type="{com/truelink/schema/msp}FailureReviewScheduleType" maxOccurs="unbounded"/>
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
    "failureReviewSchedule"
})
@XmlRootElement(name = "FailureReviewShceduleCollection")
public class FailureReviewShceduleCollection {

    @XmlElement(name = "FailureReviewSchedule", required = true)
    protected List<FailureReviewScheduleType> failureReviewSchedule;

    /**
     * Gets the value of the failureReviewSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failureReviewSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailureReviewSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReviewScheduleType }
     * 
     * 
     */
    public List<FailureReviewScheduleType> getFailureReviewSchedule() {
        if (failureReviewSchedule == null) {
            failureReviewSchedule = new ArrayList<FailureReviewScheduleType>();
        }
        return this.failureReviewSchedule;
    }

}
