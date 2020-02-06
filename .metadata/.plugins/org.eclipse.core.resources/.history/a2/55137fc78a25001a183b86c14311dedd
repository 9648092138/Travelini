
package com.travelport.schema.air_v45_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.LoyaltyCard;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}LoyaltyCard" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="CreditsUsed" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="UsedCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyCard",
    "personName",
    "creditsUsed"
})
@XmlRootElement(name = "RelatedTraveler")
public class RelatedTraveler {

    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "CreditsUsed")
    protected RelatedTraveler.CreditsUsed creditsUsed;
    @XmlAttribute(name = "StatusCode")
    protected String statusCode;
    @XmlAttribute(name = "Relation")
    protected String relation;

    /**
     * Traveler loyalty card detail Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Traveler name detail
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the creditsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedTraveler.CreditsUsed }
     *     
     */
    public RelatedTraveler.CreditsUsed getCreditsUsed() {
        return creditsUsed;
    }

    /**
     * Sets the value of the creditsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedTraveler.CreditsUsed }
     *     
     */
    public void setCreditsUsed(RelatedTraveler.CreditsUsed value) {
        this.creditsUsed = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
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
     *       &lt;attribute name="UsedCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CreditsUsed {

        @XmlAttribute(name = "UsedCredit")
        protected BigDecimal usedCredit;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;

        /**
         * Gets the value of the usedCredit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUsedCredit() {
            return usedCredit;
        }

        /**
         * Sets the value of the usedCredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUsedCredit(BigDecimal value) {
            this.usedCredit = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

    }

}
