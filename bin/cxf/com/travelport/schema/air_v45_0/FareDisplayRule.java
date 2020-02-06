
package com.travelport.schema.air_v45_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}RuleAdvancedPurchase" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}RuleLengthOfStay" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}RuleCharges" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RuleNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TariffNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ruleAdvancedPurchase",
    "ruleLengthOfStay",
    "ruleCharges"
})
@XmlRootElement(name = "FareDisplayRule")
public class FareDisplayRule {

    @XmlElement(name = "RuleAdvancedPurchase")
    protected RuleAdvancedPurchase ruleAdvancedPurchase;
    @XmlElement(name = "RuleLengthOfStay")
    protected RuleLengthOfStay ruleLengthOfStay;
    @XmlElement(name = "RuleCharges")
    protected RuleCharges ruleCharges;
    @XmlAttribute(name = "RuleNumber")
    protected String ruleNumber;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "TariffNumber")
    protected String tariffNumber;

    /**
     * Gets the value of the ruleAdvancedPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link RuleAdvancedPurchase }
     *     
     */
    public RuleAdvancedPurchase getRuleAdvancedPurchase() {
        return ruleAdvancedPurchase;
    }

    /**
     * Sets the value of the ruleAdvancedPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleAdvancedPurchase }
     *     
     */
    public void setRuleAdvancedPurchase(RuleAdvancedPurchase value) {
        this.ruleAdvancedPurchase = value;
    }

    /**
     * Gets the value of the ruleLengthOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link RuleLengthOfStay }
     *     
     */
    public RuleLengthOfStay getRuleLengthOfStay() {
        return ruleLengthOfStay;
    }

    /**
     * Sets the value of the ruleLengthOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleLengthOfStay }
     *     
     */
    public void setRuleLengthOfStay(RuleLengthOfStay value) {
        this.ruleLengthOfStay = value;
    }

    /**
     * Gets the value of the ruleCharges property.
     * 
     * @return
     *     possible object is
     *     {@link RuleCharges }
     *     
     */
    public RuleCharges getRuleCharges() {
        return ruleCharges;
    }

    /**
     * Sets the value of the ruleCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleCharges }
     *     
     */
    public void setRuleCharges(RuleCharges value) {
        this.ruleCharges = value;
    }

    /**
     * Gets the value of the ruleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleNumber() {
        return ruleNumber;
    }

    /**
     * Sets the value of the ruleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleNumber(String value) {
        this.ruleNumber = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the tariffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffNumber() {
        return tariffNumber;
    }

    /**
     * Sets the value of the tariffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffNumber(String value) {
        this.tariffNumber = value;
    }

}
