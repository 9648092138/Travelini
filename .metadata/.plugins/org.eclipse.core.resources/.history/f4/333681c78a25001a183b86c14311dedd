
package com.travelport.schema.air_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Penalty applicable on a Fare for change/
 *                 cancellation etc- expressed in both Money and Percentage.
 *             
 * 
 * <p>Java class for typeFarePenalty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeFarePenalty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" minOccurs="0"/&gt;
 *         &lt;element name="Percentage" type="{http://www.travelport.com/schema/common_v45_0}typePercentageWithDecimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PenaltyApplies"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Anytime"/&gt;
 *             &lt;enumeration value="Before Departure"/&gt;
 *             &lt;enumeration value="After Departure"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NoShow" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFarePenalty", propOrder = {
    "amount",
    "percentage"
})
public class TypeFarePenalty {

    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Percentage")
    protected String percentage;
    @XmlAttribute(name = "PenaltyApplies")
    protected String penaltyApplies;
    @XmlAttribute(name = "NoShow")
    protected Boolean noShow;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage(String value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the penaltyApplies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyApplies() {
        return penaltyApplies;
    }

    /**
     * Sets the value of the penaltyApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyApplies(String value) {
        this.penaltyApplies = value;
    }

    /**
     * Gets the value of the noShow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShow() {
        return noShow;
    }

    /**
     * Sets the value of the noShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoShow(Boolean value) {
        this.noShow = value;
    }

}
