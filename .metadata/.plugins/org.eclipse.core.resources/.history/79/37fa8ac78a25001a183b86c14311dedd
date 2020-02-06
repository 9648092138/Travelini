
package com.travelport.schema.rail_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.DiscountCard;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}DiscountCard" maxOccurs="9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ProhibitNonRefundableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ProhibitNonExchangeableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="CurrencyType" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
 *       &lt;attribute name="RailSearchType" type="{http://www.travelport.com/schema/common_v45_0}typeRailSearchType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "discountCard"
})
@XmlRootElement(name = "RailPricingModifiers")
public class RailPricingModifiers {

    @XmlElement(name = "DiscountCard", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<DiscountCard> discountCard;
    @XmlAttribute(name = "ProhibitNonRefundableFares")
    protected Boolean prohibitNonRefundableFares;
    @XmlAttribute(name = "ProhibitNonExchangeableFares")
    protected Boolean prohibitNonExchangeableFares;
    @XmlAttribute(name = "CurrencyType")
    protected String currencyType;
    @XmlAttribute(name = "RailSearchType")
    protected String railSearchType;

    /**
     * Discount request for rail.Gets the value of the discountCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCard }
     * 
     * 
     */
    public List<DiscountCard> getDiscountCard() {
        if (discountCard == null) {
            discountCard = new ArrayList<DiscountCard>();
        }
        return this.discountCard;
    }

    /**
     * Gets the value of the prohibitNonRefundableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonRefundableFares() {
        if (prohibitNonRefundableFares == null) {
            return false;
        } else {
            return prohibitNonRefundableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonRefundableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitNonRefundableFares(Boolean value) {
        this.prohibitNonRefundableFares = value;
    }

    /**
     * Gets the value of the prohibitNonExchangeableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonExchangeableFares() {
        if (prohibitNonExchangeableFares == null) {
            return false;
        } else {
            return prohibitNonExchangeableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonExchangeableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitNonExchangeableFares(Boolean value) {
        this.prohibitNonExchangeableFares = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the railSearchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailSearchType() {
        return railSearchType;
    }

    /**
     * Sets the value of the railSearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailSearchType(String value) {
        this.railSearchType = value;
    }

}
