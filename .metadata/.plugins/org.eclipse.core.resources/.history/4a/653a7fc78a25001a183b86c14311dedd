
package com.travelport.schema.air_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Facility" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Characteristic" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="SearchTravelerRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "facility",
    "characteristic"
})
@XmlRootElement(name = "Row")
public class Row {

    @XmlElement(name = "Facility")
    protected List<Facility> facility;
    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;
    @XmlAttribute(name = "Number", required = true)
    protected BigInteger number;
    @XmlAttribute(name = "SearchTravelerRef")
    protected String searchTravelerRef;

    /**
     * Gets the value of the facility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facility }
     * 
     * 
     */
    public List<Facility> getFacility() {
        if (facility == null) {
            facility = new ArrayList<Facility>();
        }
        return this.facility;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * 
     * 
     */
    public List<Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<Characteristic>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the searchTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTravelerRef() {
        return searchTravelerRef;
    }

    /**
     * Sets the value of the searchTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTravelerRef(String value) {
        this.searchTravelerRef = value;
    }

}
