
package com.travelport.schema.air_v45_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareRestrictionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareRestrictionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DayOfWeek"/&gt;
 *     &lt;enumeration value="FlightTimeOfDay"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFareRestrictionType")
@XmlEnum
public enum TypeFareRestrictionType {

    @XmlEnumValue("DayOfWeek")
    DAY_OF_WEEK("DayOfWeek"),
    @XmlEnumValue("FlightTimeOfDay")
    FLIGHT_TIME_OF_DAY("FlightTimeOfDay"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeFareRestrictionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareRestrictionType fromValue(String v) {
        for (TypeFareRestrictionType c: TypeFareRestrictionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
