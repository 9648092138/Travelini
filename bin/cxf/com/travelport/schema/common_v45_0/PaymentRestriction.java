
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CardRestriction" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}AddressRestriction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardRestriction",
    "addressRestriction"
})
@XmlRootElement(name = "PaymentRestriction")
public class PaymentRestriction {

    @XmlElement(name = "CardRestriction", required = true)
    protected List<CardRestriction> cardRestriction;
    @XmlElement(name = "AddressRestriction", required = true)
    protected AddressRestriction addressRestriction;

    /**
     * Gets the value of the cardRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardRestriction }
     * 
     * 
     */
    public List<CardRestriction> getCardRestriction() {
        if (cardRestriction == null) {
            cardRestriction = new ArrayList<CardRestriction>();
        }
        return this.cardRestriction;
    }

    /**
     * Gets the value of the addressRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRestriction }
     *     
     */
    public AddressRestriction getAddressRestriction() {
        return addressRestriction;
    }

    /**
     * Sets the value of the addressRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRestriction }
     *     
     */
    public void setAddressRestriction(AddressRestriction value) {
        this.addressRestriction = value;
    }

}
