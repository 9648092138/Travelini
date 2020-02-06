
package com.travelport.schema.common_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCreditCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeCreditCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}typePaymentCard"&gt;
 *       &lt;attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AcceptanceOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ThirdPartyPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BankCountryCode" type="{http://www.travelport.com/schema/common_v45_0}typeCountry" /&gt;
 *       &lt;attribute name="BankStateCode" type="{http://www.travelport.com/schema/common_v45_0}typeState" /&gt;
 *       &lt;attribute name="Enett" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeCreditCardType")
@XmlSeeAlso({
    CreditCard.class
})
public class TypeCreditCardType
    extends TypePaymentCard
{

    @XmlAttribute(name = "ExtendedPayment")
    protected String extendedPayment;
    @XmlAttribute(name = "CustomerReference")
    protected String customerReference;
    @XmlAttribute(name = "AcceptanceOverride")
    protected Boolean acceptanceOverride;
    @XmlAttribute(name = "ThirdPartyPayment")
    protected Boolean thirdPartyPayment;
    @XmlAttribute(name = "BankName")
    protected String bankName;
    @XmlAttribute(name = "BankCountryCode")
    protected String bankCountryCode;
    @XmlAttribute(name = "BankStateCode")
    protected String bankStateCode;
    @XmlAttribute(name = "Enett")
    protected Boolean enett;

    /**
     * Gets the value of the extendedPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedPayment() {
        return extendedPayment;
    }

    /**
     * Sets the value of the extendedPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedPayment(String value) {
        this.extendedPayment = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the acceptanceOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptanceOverride() {
        return acceptanceOverride;
    }

    /**
     * Sets the value of the acceptanceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptanceOverride(Boolean value) {
        this.acceptanceOverride = value;
    }

    /**
     * Gets the value of the thirdPartyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isThirdPartyPayment() {
        if (thirdPartyPayment == null) {
            return false;
        } else {
            return thirdPartyPayment;
        }
    }

    /**
     * Sets the value of the thirdPartyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThirdPartyPayment(Boolean value) {
        this.thirdPartyPayment = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountryCode() {
        return bankCountryCode;
    }

    /**
     * Sets the value of the bankCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountryCode(String value) {
        this.bankCountryCode = value;
    }

    /**
     * Gets the value of the bankStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankStateCode() {
        return bankStateCode;
    }

    /**
     * Sets the value of the bankStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankStateCode(String value) {
        this.bankStateCode = value;
    }

    /**
     * Gets the value of the enett property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnett() {
        if (enett == null) {
            return false;
        } else {
            return enett;
        }
    }

    /**
     * Sets the value of the enett property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnett(Boolean value) {
        this.enett = value;
    }

}
