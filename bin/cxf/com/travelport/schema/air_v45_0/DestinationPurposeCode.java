
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
 *       &lt;attribute name="Destination" use="required" type="{http://www.travelport.com/schema/air_v45_0}typeDestinationCode" /&gt;
 *       &lt;attribute name="Purpose" use="required" type="{http://www.travelport.com/schema/air_v45_0}typePurposeCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DestinationPurposeCode")
public class DestinationPurposeCode {

    @XmlAttribute(name = "Destination", required = true)
    protected TypeDestinationCode destination;
    @XmlAttribute(name = "Purpose", required = true)
    protected TypePurposeCode purpose;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDestinationCode }
     *     
     */
    public TypeDestinationCode getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDestinationCode }
     *     
     */
    public void setDestination(TypeDestinationCode value) {
        this.destination = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link TypePurposeCode }
     *     
     */
    public TypePurposeCode getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePurposeCode }
     *     
     */
    public void setPurpose(TypePurposeCode value) {
        this.purpose = value;
    }

}
