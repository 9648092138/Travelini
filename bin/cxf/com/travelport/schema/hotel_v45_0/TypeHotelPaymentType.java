
package com.travelport.schema.hotel_v45_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeHotelPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeHotelPaymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PrePay"/&gt;
 *     &lt;enumeration value="PostPay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeHotelPaymentType")
@XmlEnum
public enum TypeHotelPaymentType {

    @XmlEnumValue("PrePay")
    PRE_PAY("PrePay"),
    @XmlEnumValue("PostPay")
    POST_PAY("PostPay");
    private final String value;

    TypeHotelPaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHotelPaymentType fromValue(String v) {
        for (TypeHotelPaymentType c: TypeHotelPaymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
