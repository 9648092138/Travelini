
package com.travelport.schema.rail_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Common RailPricingSolution container
 * 
 * <p>Java class for typeRailPricingSolution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeRailPricingSolution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailJourney" maxOccurs="999"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailJourneyRef" maxOccurs="999"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailPricingInfo" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrPrices"/&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="OfferId" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeProviderCode" /&gt;
 *       &lt;attribute name="SupplierCode" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeSupplierCode" /&gt;
 *       &lt;attribute name="HostTokenRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRailPricingSolution", propOrder = {
    "railJourney",
    "railJourneyRef",
    "railPricingInfo"
})
@XmlSeeAlso({
    RailExchangeSolution.class,
    RailPricingSolution.class
})
public abstract class TypeRailPricingSolution {

    @XmlElement(name = "RailJourney")
    protected List<RailJourney> railJourney;
    @XmlElement(name = "RailJourneyRef")
    protected List<RailJourneyRef> railJourneyRef;
    @XmlElement(name = "RailPricingInfo")
    protected List<RailPricingInfo> railPricingInfo;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "OfferId")
    protected BigInteger offerId;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;
    @XmlAttribute(name = "HostTokenRef")
    protected String hostTokenRef;
    @XmlAttribute(name = "Reference")
    protected String reference;
    @XmlAttribute(name = "TotalPrice")
    protected String totalPrice;
    @XmlAttribute(name = "BasePrice")
    protected String basePrice;
    @XmlAttribute(name = "ApproximateTotalPrice")
    protected String approximateTotalPrice;
    @XmlAttribute(name = "ApproximateBasePrice")
    protected String approximateBasePrice;
    @XmlAttribute(name = "EquivalentBasePrice")
    protected String equivalentBasePrice;
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    @XmlAttribute(name = "Fees")
    protected String fees;
    @XmlAttribute(name = "Services")
    protected String services;
    @XmlAttribute(name = "ApproximateTaxes")
    protected String approximateTaxes;
    @XmlAttribute(name = "ApproximateFees")
    protected String approximateFees;

    /**
     * Gets the value of the railJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailJourney }
     * 
     * 
     */
    public List<RailJourney> getRailJourney() {
        if (railJourney == null) {
            railJourney = new ArrayList<RailJourney>();
        }
        return this.railJourney;
    }

    /**
     * Gets the value of the railJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailJourneyRef }
     * 
     * 
     */
    public List<RailJourneyRef> getRailJourneyRef() {
        if (railJourneyRef == null) {
            railJourneyRef = new ArrayList<RailJourneyRef>();
        }
        return this.railJourneyRef;
    }

    /**
     * Gets the value of the railPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPricingInfo }
     * 
     * 
     */
    public List<RailPricingInfo> getRailPricingInfo() {
        if (railPricingInfo == null) {
            railPricingInfo = new ArrayList<RailPricingInfo>();
        }
        return this.railPricingInfo;
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
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfferId(BigInteger value) {
        this.offerId = value;
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
     * Gets the value of the hostTokenRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTokenRef() {
        return hostTokenRef;
    }

    /**
     * Sets the value of the hostTokenRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTokenRef(String value) {
        this.hostTokenRef = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the approximateTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

    /**
     * Gets the value of the approximateBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateBasePrice() {
        return approximateBasePrice;
    }

    /**
     * Sets the value of the approximateBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateBasePrice(String value) {
        this.approximateBasePrice = value;
    }

    /**
     * Gets the value of the equivalentBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentBasePrice() {
        return equivalentBasePrice;
    }

    /**
     * Sets the value of the equivalentBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentBasePrice(String value) {
        this.equivalentBasePrice = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * Gets the value of the approximateTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTaxes() {
        return approximateTaxes;
    }

    /**
     * Sets the value of the approximateTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTaxes(String value) {
        this.approximateTaxes = value;
    }

    /**
     * Gets the value of the approximateFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateFees() {
        return approximateFees;
    }

    /**
     * Sets the value of the approximateFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateFees(String value) {
        this.approximateFees = value;
    }

}
