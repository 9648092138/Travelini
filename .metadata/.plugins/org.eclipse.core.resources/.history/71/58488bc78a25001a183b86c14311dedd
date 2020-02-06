
package com.travelport.schema.rail_v45_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRailDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRailDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Inbound"/&gt;
 *     &lt;enumeration value="Outbound"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeRailDirection")
@XmlEnum
public enum TypeRailDirection {

    @XmlEnumValue("Inbound")
    INBOUND("Inbound"),
    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeRailDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRailDirection fromValue(String v) {
        for (TypeRailDirection c: TypeRailDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
