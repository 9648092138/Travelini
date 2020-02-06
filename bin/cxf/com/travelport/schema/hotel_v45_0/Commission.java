
package com.travelport.schema.hotel_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.TypeTrinary;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Indicator" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CommissionAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproxCommissionAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="CommissionOnSurcharges" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproxCommissionOnSurcharges" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Commission")
public class Commission {

    @XmlAttribute(name = "Indicator")
    protected TypeTrinary indicator;
    @XmlAttribute(name = "Percent")
    protected String percent;
    @XmlAttribute(name = "CommissionAmount")
    protected String commissionAmount;
    @XmlAttribute(name = "ApproxCommissionAmount")
    protected String approxCommissionAmount;
    @XmlAttribute(name = "CommissionOnSurcharges")
    protected String commissionOnSurcharges;
    @XmlAttribute(name = "ApproxCommissionOnSurcharges")
    protected String approxCommissionOnSurcharges;

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    public TypeTrinary getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    public void setIndicator(TypeTrinary value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercent(String value) {
        this.percent = value;
    }

    /**
     * Gets the value of the commissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionAmount() {
        return commissionAmount;
    }

    /**
     * Sets the value of the commissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionAmount(String value) {
        this.commissionAmount = value;
    }

    /**
     * Gets the value of the approxCommissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproxCommissionAmount() {
        return approxCommissionAmount;
    }

    /**
     * Sets the value of the approxCommissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproxCommissionAmount(String value) {
        this.approxCommissionAmount = value;
    }

    /**
     * Gets the value of the commissionOnSurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionOnSurcharges() {
        return commissionOnSurcharges;
    }

    /**
     * Sets the value of the commissionOnSurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionOnSurcharges(String value) {
        this.commissionOnSurcharges = value;
    }

    /**
     * Gets the value of the approxCommissionOnSurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproxCommissionOnSurcharges() {
        return approxCommissionOnSurcharges;
    }

    /**
     * Sets the value of the approxCommissionOnSurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproxCommissionOnSurcharges(String value) {
        this.approxCommissionOnSurcharges = value;
    }

}
