
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PrePayId"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PrePayCustomer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PrePayAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Affiliations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AccountRelatedRules" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CreatorID" type="{http://www.travelport.com/schema/common_v45_0}typeCardNumber" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prePayId",
    "prePayCustomer",
    "prePayAccount",
    "affiliations",
    "accountRelatedRules"
})
@XmlRootElement(name = "PrePayProfileInfo")
public class PrePayProfileInfo {

    @XmlElement(name = "PrePayId", required = true)
    protected PrePayId prePayId;
    @XmlElement(name = "PrePayCustomer")
    protected PrePayCustomer prePayCustomer;
    @XmlElement(name = "PrePayAccount")
    protected PrePayAccount prePayAccount;
    @XmlElement(name = "Affiliations")
    protected Affiliations affiliations;
    @XmlElement(name = "AccountRelatedRules")
    protected AccountRelatedRules accountRelatedRules;
    @XmlAttribute(name = "StatusCode")
    protected String statusCode;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;

    /**
     * Pre pay unique identifier detail.This information block is returned both in list and  detail retrieve transactions.Example flight pass number
     * 
     * @return
     *     possible object is
     *     {@link PrePayId }
     *     
     */
    public PrePayId getPrePayId() {
        return prePayId;
    }

    /**
     * Sets the value of the prePayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayId }
     *     
     */
    public void setPrePayId(PrePayId value) {
        this.prePayId = value;
    }

    /**
     * Pre pay customer detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link PrePayCustomer }
     *     
     */
    public PrePayCustomer getPrePayCustomer() {
        return prePayCustomer;
    }

    /**
     * Sets the value of the prePayCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayCustomer }
     *     
     */
    public void setPrePayCustomer(PrePayCustomer value) {
        this.prePayCustomer = value;
    }

    /**
     * Pre pay account detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link PrePayAccount }
     *     
     */
    public PrePayAccount getPrePayAccount() {
        return prePayAccount;
    }

    /**
     * Sets the value of the prePayAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayAccount }
     *     
     */
    public void setPrePayAccount(PrePayAccount value) {
        this.prePayAccount = value;
    }

    /**
     * Pre pay affiliations detail.This information block is returned only in detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link Affiliations }
     *     
     */
    public Affiliations getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Affiliations }
     *     
     */
    public void setAffiliations(Affiliations value) {
        this.affiliations = value;
    }

    /**
     * Pre pay account related rules.This information block is returned only in detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link AccountRelatedRules }
     *     
     */
    public AccountRelatedRules getAccountRelatedRules() {
        return accountRelatedRules;
    }

    /**
     * Sets the value of the accountRelatedRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRelatedRules }
     *     
     */
    public void setAccountRelatedRules(AccountRelatedRules value) {
        this.accountRelatedRules = value;
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
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

}
