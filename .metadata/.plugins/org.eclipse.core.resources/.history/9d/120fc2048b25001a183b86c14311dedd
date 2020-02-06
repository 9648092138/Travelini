
package com.travelport.schema.air_v45_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PassengerReceiptOverride" minOccurs="0"/&gt;
 *         &lt;element name="OverrideOption" type="{http://www.travelport.com/schema/air_v45_0}typeOverrideOption" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SuppressItineraryRemarks" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GenerateItinNumbers" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "passengerReceiptOverride",
    "overrideOption"
})
@XmlRootElement(name = "DocumentOptions")
public class DocumentOptions {

    @XmlElement(name = "PassengerReceiptOverride")
    protected PassengerReceiptOverride passengerReceiptOverride;
    @XmlElement(name = "OverrideOption")
    protected List<String> overrideOption;
    @XmlAttribute(name = "SuppressItineraryRemarks")
    protected Boolean suppressItineraryRemarks;
    @XmlAttribute(name = "GenerateItinNumbers")
    protected Boolean generateItinNumbers;

    /**
     * Gets the value of the passengerReceiptOverride property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerReceiptOverride }
     *     
     */
    public PassengerReceiptOverride getPassengerReceiptOverride() {
        return passengerReceiptOverride;
    }

    /**
     * Sets the value of the passengerReceiptOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerReceiptOverride }
     *     
     */
    public void setPassengerReceiptOverride(PassengerReceiptOverride value) {
        this.passengerReceiptOverride = value;
    }

    /**
     * Gets the value of the overrideOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overrideOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverrideOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOverrideOption() {
        if (overrideOption == null) {
            overrideOption = new ArrayList<String>();
        }
        return this.overrideOption;
    }

    /**
     * Gets the value of the suppressItineraryRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressItineraryRemarks() {
        return suppressItineraryRemarks;
    }

    /**
     * Sets the value of the suppressItineraryRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressItineraryRemarks(Boolean value) {
        this.suppressItineraryRemarks = value;
    }

    /**
     * Gets the value of the generateItinNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateItinNumbers() {
        return generateItinNumbers;
    }

    /**
     * Sets the value of the generateItinNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateItinNumbers(Boolean value) {
        this.generateItinNumbers = value;
    }

}
