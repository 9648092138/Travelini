
package com.travelport.schema.common_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies times as either specific times, or a time range
 * 
 * <p>Java class for typeTimeSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeTimeSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TimeRange" type="{http://www.travelport.com/schema/common_v45_0}typeTimeRange" minOccurs="0"/&gt;
 *         &lt;element name="SpecificTime" type="{http://www.travelport.com/schema/common_v45_0}typeSpecificTime" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="PreferredTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTimeSpec", propOrder = {
    "timeRange",
    "specificTime"
})
@XmlSeeAlso({
    TypeFlexibleTimeSpec.class
})
public class TypeTimeSpec {

    @XmlElement(name = "TimeRange")
    protected TypeTimeRange timeRange;
    @XmlElement(name = "SpecificTime")
    protected TypeSpecificTime specificTime;
    @XmlAttribute(name = "PreferredTime")
    protected String preferredTime;

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTimeRange }
     *     
     */
    public TypeTimeRange getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTimeRange }
     *     
     */
    public void setTimeRange(TypeTimeRange value) {
        this.timeRange = value;
    }

    /**
     * Gets the value of the specificTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSpecificTime }
     *     
     */
    public TypeSpecificTime getSpecificTime() {
        return specificTime;
    }

    /**
     * Sets the value of the specificTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSpecificTime }
     *     
     */
    public void setSpecificTime(TypeSpecificTime value) {
        this.specificTime = value;
    }

    /**
     * Gets the value of the preferredTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredTime() {
        return preferredTime;
    }

    /**
     * Sets the value of the preferredTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredTime(String value) {
        this.preferredTime = value;
    }

}
