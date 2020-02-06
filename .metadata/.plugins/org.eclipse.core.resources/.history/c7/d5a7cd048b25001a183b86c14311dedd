
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
 *       &lt;sequence&gt;
 *         &lt;element name="CancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v45_0}DeadlineGroup"/&gt;
 *       &lt;attribute name="NonRefundableStayIndicator" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
 *       &lt;attribute name="CancelDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CancelPenaltyAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="NumberOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="CancelPenaltyPercent" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="CancelPenaltyPercentAppliesTo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Method" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Supported" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cancellationPolicy",
    "text"
})
@XmlRootElement(name = "CancelInfo")
public class CancelInfo {

    @XmlElement(name = "CancellationPolicy")
    protected String cancellationPolicy;
    @XmlElement(name = "Text")
    protected List<String> text;
    @XmlAttribute(name = "NonRefundableStayIndicator")
    protected TypeTrinary nonRefundableStayIndicator;
    @XmlAttribute(name = "CancelDeadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDeadline;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "FeeInclusive")
    protected Boolean feeInclusive;
    @XmlAttribute(name = "CancelPenaltyAmount")
    protected String cancelPenaltyAmount;
    @XmlAttribute(name = "NumberOfNights")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfNights;
    @XmlAttribute(name = "CancelPenaltyPercent")
    protected Float cancelPenaltyPercent;
    @XmlAttribute(name = "CancelPenaltyPercentAppliesTo")
    protected String cancelPenaltyPercentAppliesTo;
    @XmlAttribute(name = "Method")
    protected String method;
    @XmlAttribute(name = "Supported")
    protected Boolean supported;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "OffsetTimeUnit")
    protected String offsetTimeUnit;
    @XmlAttribute(name = "OffsetUnitMultiplier")
    protected Integer offsetUnitMultiplier;
    @XmlAttribute(name = "OffsetDropTime")
    protected String offsetDropTime;

    /**
     * Gets the value of the cancellationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    /**
     * Sets the value of the cancellationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationPolicy(String value) {
        this.cancellationPolicy = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getText() {
        if (text == null) {
            text = new ArrayList<String>();
        }
        return this.text;
    }

    /**
     * Gets the value of the nonRefundableStayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    public TypeTrinary getNonRefundableStayIndicator() {
        return nonRefundableStayIndicator;
    }

    /**
     * Sets the value of the nonRefundableStayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    public void setNonRefundableStayIndicator(TypeTrinary value) {
        this.nonRefundableStayIndicator = value;
    }

    /**
     * Gets the value of the cancelDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDeadline() {
        return cancelDeadline;
    }

    /**
     * Sets the value of the cancelDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDeadline(XMLGregorianCalendar value) {
        this.cancelDeadline = value;
    }

    /**
     * Gets the value of the taxInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * Sets the value of the taxInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusive(Boolean value) {
        this.taxInclusive = value;
    }

    /**
     * Gets the value of the feeInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeeInclusive() {
        return feeInclusive;
    }

    /**
     * Sets the value of the feeInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeeInclusive(Boolean value) {
        this.feeInclusive = value;
    }

    /**
     * Gets the value of the cancelPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelPenaltyAmount() {
        return cancelPenaltyAmount;
    }

    /**
     * Sets the value of the cancelPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelPenaltyAmount(String value) {
        this.cancelPenaltyAmount = value;
    }

    /**
     * Gets the value of the numberOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfNights(BigInteger value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the cancelPenaltyPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCancelPenaltyPercent() {
        return cancelPenaltyPercent;
    }

    /**
     * Sets the value of the cancelPenaltyPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCancelPenaltyPercent(Float value) {
        this.cancelPenaltyPercent = value;
    }

    /**
     * Gets the value of the cancelPenaltyPercentAppliesTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelPenaltyPercentAppliesTo() {
        return cancelPenaltyPercentAppliesTo;
    }

    /**
     * Sets the value of the cancelPenaltyPercentAppliesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelPenaltyPercentAppliesTo(String value) {
        this.cancelPenaltyPercentAppliesTo = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the supported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupported() {
        return supported;
    }

    /**
     * Sets the value of the supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupported(Boolean value) {
        this.supported = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
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
