
package com.travelport.schema.air_v45_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDisplayCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDisplayCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="With Itinerary Pricing"/&gt;
 *     &lt;enumeration value="Store"/&gt;
 *     &lt;enumeration value="SpecialService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDisplayCategory")
@XmlEnum
public enum TypeDisplayCategory {

    @XmlEnumValue("With Itinerary Pricing")
    WITH_ITINERARY_PRICING("With Itinerary Pricing"),
    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("SpecialService")
    SPECIAL_SERVICE("SpecialService");
    private final String value;

    TypeDisplayCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDisplayCategory fromValue(String v) {
        for (TypeDisplayCategory c: TypeDisplayCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
