
package com.travelport.schema.common_v45_0;

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
 *       &lt;attribute name="NoAdvancePurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RefundableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NonPenaltyFares" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UnRestrictedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AirSearchParameters")
public class AirSearchParameters {

    @XmlAttribute(name = "NoAdvancePurchase")
    protected Boolean noAdvancePurchase;
    @XmlAttribute(name = "RefundableFares")
    protected Boolean refundableFares;
    @XmlAttribute(name = "NonPenaltyFares")
    protected Boolean nonPenaltyFares;
    @XmlAttribute(name = "UnRestrictedFares")
    protected Boolean unRestrictedFares;

    /**
     * Gets the value of the noAdvancePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAdvancePurchase() {
        return noAdvancePurchase;
    }

    /**
     * Sets the value of the noAdvancePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoAdvancePurchase(Boolean value) {
        this.noAdvancePurchase = value;
    }

    /**
     * Gets the value of the refundableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundableFares() {
        return refundableFares;
    }

    /**
     * Sets the value of the refundableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundableFares(Boolean value) {
        this.refundableFares = value;
    }

    /**
     * Gets the value of the nonPenaltyFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonPenaltyFares() {
        return nonPenaltyFares;
    }

    /**
     * Sets the value of the nonPenaltyFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonPenaltyFares(Boolean value) {
        this.nonPenaltyFares = value;
    }

    /**
     * Gets the value of the unRestrictedFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnRestrictedFares() {
        return unRestrictedFares;
    }

    /**
     * Sets the value of the unRestrictedFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnRestrictedFares(Boolean value) {
        this.unRestrictedFares = value;
    }

}
