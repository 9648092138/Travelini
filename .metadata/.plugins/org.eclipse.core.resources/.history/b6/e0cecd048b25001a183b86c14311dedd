
package com.travelport.schema.hotel_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}DepositAmount" minOccurs="0"/&gt;
 *           &lt;element name="DepositNights" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="DepositPercent" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}GuaranteePaymentType" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v45_0}DeadlineGroup"/&gt;
 *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CredentialsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GuaranteeType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Deposit"/&gt;
 *             &lt;enumeration value="Guarantee"/&gt;
 *             &lt;enumeration value="Prepayment"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "depositAmount",
    "depositNights",
    "depositPercent",
    "guaranteePaymentType"
})
@XmlRootElement(name = "GuaranteeInfo")
public class GuaranteeInfo {

    @XmlElement(name = "DepositAmount")
    protected DepositAmount depositAmount;
    @XmlElement(name = "DepositNights")
    protected BigInteger depositNights;
    @XmlElement(name = "DepositPercent")
    protected BigInteger depositPercent;
    @XmlElement(name = "GuaranteePaymentType")
    protected List<GuaranteePaymentType> guaranteePaymentType;
    @XmlAttribute(name = "AbsoluteDeadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar absoluteDeadline;
    @XmlAttribute(name = "CredentialsRequired")
    protected Boolean credentialsRequired;
    @XmlAttribute(name = "HoldTime")
    protected String holdTime;
    @XmlAttribute(name = "GuaranteeType")
    protected String guaranteeType;
    @XmlAttribute(name = "OffsetTimeUnit")
    protected String offsetTimeUnit;
    @XmlAttribute(name = "OffsetUnitMultiplier")
    protected Integer offsetUnitMultiplier;
    @XmlAttribute(name = "OffsetDropTime")
    protected String offsetDropTime;

    /**
     * Amount required for deposit/prepayment
     * 
     * @return
     *     possible object is
     *     {@link DepositAmount }
     *     
     */
    public DepositAmount getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositAmount }
     *     
     */
    public void setDepositAmount(DepositAmount value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the depositNights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepositNights() {
        return depositNights;
    }

    /**
     * Sets the value of the depositNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepositNights(BigInteger value) {
        this.depositNights = value;
    }

    /**
     * Gets the value of the depositPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepositPercent() {
        return depositPercent;
    }

    /**
     * Sets the value of the depositPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepositPercent(BigInteger value) {
        this.depositPercent = value;
    }

    /**
     * Accepted payment types Gets the value of the guaranteePaymentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteePaymentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteePaymentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteePaymentType }
     * 
     * 
     */
    public List<GuaranteePaymentType> getGuaranteePaymentType() {
        if (guaranteePaymentType == null) {
            guaranteePaymentType = new ArrayList<GuaranteePaymentType>();
        }
        return this.guaranteePaymentType;
    }

    /**
     * Gets the value of the absoluteDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbsoluteDeadline() {
        return absoluteDeadline;
    }

    /**
     * Sets the value of the absoluteDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbsoluteDeadline(XMLGregorianCalendar value) {
        this.absoluteDeadline = value;
    }

    /**
     * Gets the value of the credentialsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCredentialsRequired() {
        return credentialsRequired;
    }

    /**
     * Sets the value of the credentialsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCredentialsRequired(Boolean value) {
        this.credentialsRequired = value;
    }

    /**
     * Gets the value of the holdTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldTime() {
        return holdTime;
    }

    /**
     * Sets the value of the holdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldTime(String value) {
        this.holdTime = value;
    }

    /**
     * Gets the value of the guaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * Sets the value of the guaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeType(String value) {
        this.guaranteeType = value;
    }

    /**
     * Gets the value of the offsetTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetTimeUnit() {
        return offsetTimeUnit;
    }

    /**
     * Sets the value of the offsetTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetTimeUnit(String value) {
        this.offsetTimeUnit = value;
    }

    /**
     * Gets the value of the offsetUnitMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffsetUnitMultiplier() {
        return offsetUnitMultiplier;
    }

    /**
     * Sets the value of the offsetUnitMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffsetUnitMultiplier(Integer value) {
        this.offsetUnitMultiplier = value;
    }

    /**
     * Gets the value of the offsetDropTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetDropTime() {
        return offsetDropTime;
    }

    /**
     * Sets the value of the offsetDropTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetDropTime(String value) {
        this.offsetDropTime = value;
    }

}
