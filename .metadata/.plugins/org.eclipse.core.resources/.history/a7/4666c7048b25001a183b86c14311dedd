
package com.travelport.schema.air_v45_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVarianceIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVarianceIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Early"/&gt;
 *     &lt;enumeration value="Late"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeVarianceIndicator")
@XmlEnum
public enum TypeVarianceIndicator {

    @XmlEnumValue("Early")
    EARLY("Early"),
    @XmlEnumValue("Late")
    LATE("Late");
    private final String value;

    TypeVarianceIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVarianceIndicator fromValue(String v) {
        for (TypeVarianceIndicator c: TypeVarianceIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
