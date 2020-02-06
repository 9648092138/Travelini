
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
 * Account Related Rules for pre pay profiles
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BookingRulesFareReference" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="RuleInfo" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ChargesRules" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Restriction" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}DocumentRequired" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GenderDobRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingRulesFareReference",
    "ruleInfo",
    "restriction",
    "documentRequired"
})
@XmlRootElement(name = "BookingRules")
public class BookingRules {

    @XmlElement(name = "BookingRulesFareReference")
    protected List<BookingRulesFareReference> bookingRulesFareReference;
    @XmlElement(name = "RuleInfo")
    protected List<BookingRules.RuleInfo> ruleInfo;
    @XmlElement(name = "Restriction")
    protected List<Restriction> restriction;
    @XmlElement(name = "DocumentRequired")
    protected List<DocumentRequired> documentRequired;
    @XmlAttribute(name = "GenderDobRequired")
    protected Boolean genderDobRequired;

    /**
     * Gets the value of the bookingRulesFareReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRulesFareReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingRulesFareReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRulesFareReference }
     * 
     * 
     */
    public List<BookingRulesFareReference> getBookingRulesFareReference() {
        if (bookingRulesFareReference == null) {
            bookingRulesFareReference = new ArrayList<BookingRulesFareReference>();
        }
        return this.bookingRulesFareReference;
    }

    /**
     * Gets the value of the ruleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRules.RuleInfo }
     * 
     * 
     */
    public List<BookingRules.RuleInfo> getRuleInfo() {
        if (ruleInfo == null) {
            ruleInfo = new ArrayList<BookingRules.RuleInfo>();
        }
        return this.ruleInfo;
    }

    /**
     * Booking restrictions for associated pre pay account Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction }
     * 
     * 
     */
    public List<Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<Restriction>();
        }
        return this.restriction;
    }

    /**
     * Detail about required documents for this pre pay id Gets the value of the documentRequired property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentRequired property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentRequired().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRequired }
     * 
     * 
     */
    public List<DocumentRequired> getDocumentRequired() {
        if (documentRequired == null) {
            documentRequired = new ArrayList<DocumentRequired>();
        }
        return this.documentRequired;
    }

    /**
     * Gets the value of the genderDobRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenderDobRequired() {
        return genderDobRequired;
    }

    /**
     * Sets the value of the genderDobRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenderDobRequired(Boolean value) {
        this.genderDobRequired = value;
    }


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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ChargesRules" minOccurs="0"/&gt;
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
        "chargesRules"
    })
    public static class RuleInfo {

        @XmlElement(name = "ChargesRules")
        protected ChargesRules chargesRules;

        /**
         * Gets the value of the chargesRules property.
         * 
         * @return
         *     possible object is
         *     {@link ChargesRules }
         *     
         */
        public ChargesRules getChargesRules() {
            return chargesRules;
        }

        /**
         * Sets the value of the chargesRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChargesRules }
         *     
         */
        public void setChargesRules(ChargesRules value) {
            this.chargesRules = value;
        }

    }

}
