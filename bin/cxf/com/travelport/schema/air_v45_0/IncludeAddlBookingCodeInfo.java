
package com.travelport.schema.air_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/air_v45_0}typeCarrierCode" /&gt;
 *       &lt;attribute name="SecondaryCarrier" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "IncludeAddlBookingCodeInfo")
public class IncludeAddlBookingCodeInfo {

    @XmlAttribute(name = "Type", required = true)
    protected TypeCarrierCode type;
    @XmlAttribute(name = "SecondaryCarrier")
    protected String secondaryCarrier;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCarrierCode }
     *     
     */
    public TypeCarrierCode getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCarrierCode }
     *     
     */
    public void setType(TypeCarrierCode value) {
        this.type = value;
    }

    /**
     * Gets the value of the secondaryCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCarrier() {
        return secondaryCarrier;
    }

    /**
     * Sets the value of the secondaryCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCarrier(String value) {
        this.secondaryCarrier = value;
    }

}
