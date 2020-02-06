
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v45_0.TypeTaxInfoWithPaymentRef;


/**
 * <p>Java class for typeTaxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeTaxInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}TaxDetail" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}IncludedInBase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrTaxDetail"/&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CarrierDefinedCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="FlightDetailsRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="CouponRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="TaxExempted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v45_0}typeProviderCode" /&gt;
 *       &lt;attribute name="SupplierCode" type="{http://www.travelport.com/schema/common_v45_0}typeSupplierCode" /&gt;
 *       &lt;attribute name="Text" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to128" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTaxInfo", propOrder = {
    "taxDetail",
    "includedInBase"
})
@XmlSeeAlso({
    TypeTaxInfoWithPaymentRef.class
})
public class TypeTaxInfo {

    @XmlElement(name = "TaxDetail")
    protected List<TaxDetail> taxDetail;
    @XmlElement(name = "IncludedInBase")
    protected IncludedInBase includedInBase;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Category", required = true)
    protected String category;
    @XmlAttribute(name = "CarrierDefinedCategory")
    protected String carrierDefinedCategory;
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;
    @XmlAttribute(name = "FlightDetailsRef")
    protected String flightDetailsRef;
    @XmlAttribute(name = "CouponRef")
    protected String couponRef;
    @XmlAttribute(name = "TaxExempted")
    protected Boolean taxExempted;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "Text")
    protected String text;
    @XmlAttribute(name = "Amount", required = true)
    protected String amount;
    @XmlAttribute(name = "OriginAirport")
    protected String originAirport;
    @XmlAttribute(name = "DestinationAirport")
    protected String destinationAirport;
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "FareInfoRef")
    protected String fareInfoRef;

    /**
     * Gets the value of the taxDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetail }
     * 
     * 
     */
    public List<TaxDetail> getTaxDetail() {
        if (taxDetail == null) {
            taxDetail = new ArrayList<TaxDetail>();
        }
        return this.taxDetail;
    }

    /**
     * Gets the value of the includedInBase property.
     * 
     * @return
     *     possible object is
     *     {@link IncludedInBase }
     *     
     */
    public IncludedInBase getIncludedInBase() {
        return includedInBase;
    }

    /**
     * Sets the value of the includedInBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedInBase }
     *     
     */
    public void setIncludedInBase(IncludedInBase value) {
        this.includedInBase = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the carrierDefinedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierDefinedCategory() {
        return carrierDefinedCategory;
    }

    /**
     * Sets the value of the carrierDefinedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierDefinedCategory(String value) {
        this.carrierDefinedCategory = value;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * Gets the value of the flightDetailsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDetailsRef() {
        return flightDetailsRef;
    }

    /**
     * Sets the value of the flightDetailsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDetailsRef(String value) {
        this.flightDetailsRef = value;
    }

    /**
     * Gets the value of the couponRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponRef() {
        return couponRef;
    }

    /**
     * Sets the value of the couponRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponRef(String value) {
        this.couponRef = value;
    }

    /**
     * Gets the value of the taxExempted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempted() {
        return taxExempted;
    }

    /**
     * Sets the value of the taxExempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExempted(Boolean value) {
        this.taxExempted = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

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
     * Gets the value of the originAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAirport() {
        return originAirport;
    }

    /**
     * Sets the value of the originAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAirport(String value) {
        this.originAirport = value;
    }

    /**
     * Gets the value of the destinationAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirport() {
        return destinationAirport;
    }

    /**
     * Sets the value of the destinationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAirport(String value) {
        this.destinationAirport = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the fareInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoRef() {
        return fareInfoRef;
    }

    /**
     * Sets the value of the fareInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
    }

}
