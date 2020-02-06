
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
 *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Position" type="{http://www.travelport.com/schema/air_v45_0}typePosition" /&gt;
 *       &lt;attribute name="RowLocation" type="{http://www.travelport.com/schema/air_v45_0}typeRowLocation" /&gt;
 *       &lt;attribute name="PADISCode" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to99" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Characteristic")
public class Characteristic {

    @XmlAttribute(name = "Value", required = true)
    protected String value;
    @XmlAttribute(name = "Position")
    protected TypePosition position;
    @XmlAttribute(name = "RowLocation")
    protected TypeRowLocation rowLocation;
    @XmlAttribute(name = "PADISCode")
    protected String padisCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link TypePosition }
     *     
     */
    public TypePosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePosition }
     *     
     */
    public void setPosition(TypePosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the rowLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRowLocation }
     *     
     */
    public TypeRowLocation getRowLocation() {
        return rowLocation;
    }

    /**
     * Sets the value of the rowLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRowLocation }
     *     
     */
    public void setRowLocation(TypeRowLocation value) {
        this.rowLocation = value;
    }

    /**
     * Gets the value of the padisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADISCode() {
        return padisCode;
    }

    /**
     * Sets the value of the padisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPADISCode(String value) {
        this.padisCode = value;
    }

}
