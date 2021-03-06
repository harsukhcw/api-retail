
package com.opl.retail.api.model.cibil.truelink.schema.database.tcps.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alarm"/>
 *     &lt;enumeration value="Passed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultStatusType", namespace = "com/truelink/schema/database/tcps/enumerations")
@XmlEnum
public enum ResultStatusType {

    @XmlEnumValue("Alarm")
    ALARM("Alarm"),
    @XmlEnumValue("Passed")
    PASSED("Passed");
    private final String value;

    ResultStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultStatusType fromValue(String v) {
        for (ResultStatusType c: ResultStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
