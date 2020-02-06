
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.FormOfPayment;
import com.travelport.schema.common_v45_0.Payment;
import com.travelport.schema.common_v45_0.SupplierLocator;
import com.travelport.schema.common_v45_0.TypeElementStatus;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDTravelerInfo"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}SupplierLocator" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ElectronicMiscDocument" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Payment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}FormOfPayment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDPricingInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDEndorsement" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareCalc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDCommission" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}ProviderReservation"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emdTravelerInfo",
    "supplierLocator",
    "electronicMiscDocument",
    "payment",
    "formOfPayment",
    "emdPricingInfo",
    "emdEndorsement",
    "fareCalc",
    "emdCommission"
})
@XmlRootElement(name = "EMDInfo")
public class EMDInfo {

    @XmlElement(name = "EMDTravelerInfo", required = true)
    protected EMDTravelerInfo emdTravelerInfo;
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<SupplierLocator> supplierLocator;
    @XmlElement(name = "ElectronicMiscDocument", required = true)
    protected List<ElectronicMiscDocument> electronicMiscDocument;
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected Payment payment;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "EMDPricingInfo")
    protected EMDPricingInfo emdPricingInfo;
    @XmlElement(name = "EMDEndorsement")
    protected List<String> emdEndorsement;
    @XmlElement(name = "FareCalc")
    protected String fareCalc;
    @XmlElement(name = "EMDCommission")
    protected EMDCommission emdCommission;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode", required = true)
    protected String providerLocatorCode;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Basic information of the traveler associated with this EMDInfo.
     * 
     * @return
     *     possible object is
     *     {@link EMDTravelerInfo }
     *     
     */
    public EMDTravelerInfo getEMDTravelerInfo() {
        return emdTravelerInfo;
    }

    /**
     * Sets the value of the emdTravelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDTravelerInfo }
     *     
     */
    public void setEMDTravelerInfo(EMDTravelerInfo value) {
        this.emdTravelerInfo = value;
    }

    /**
     * List of Supplier Locator information that is associated with this document Gets the value of the supplierLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierLocator }
     * 
     * 
     */
    public List<SupplierLocator> getSupplierLocator() {
        if (supplierLocator == null) {
            supplierLocator = new ArrayList<SupplierLocator>();
        }
        return this.supplierLocator;
    }

    /**
     * Electronic miscellaneous documents.As an EMDInfo container displays all the EMDs which are in conjunction, there can be maximum 4 ElectronicMiscDocuments present in an EMDInfo Gets the value of the electronicMiscDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicMiscDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicMiscDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicMiscDocument }
     * 
     * 
     */
    public List<ElectronicMiscDocument> getElectronicMiscDocument() {
        if (electronicMiscDocument == null) {
            electronicMiscDocument = new ArrayList<ElectronicMiscDocument>();
        }
        return this.electronicMiscDocument;
    }

    /**
     * Payment charged for EMD isuance
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * FormOfPayment used for issuing these electronic miscellaneous documents
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     */
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * Fare related information for these electronic miscellaneous documents
     * 
     * @return
     *     possible object is
     *     {@link EMDPricingInfo }
     *     
     */
    public EMDPricingInfo getEMDPricingInfo() {
        return emdPricingInfo;
    }

    /**
     * Sets the value of the emdPricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDPricingInfo }
     *     
     */
    public void setEMDPricingInfo(EMDPricingInfo value) {
        this.emdPricingInfo = value;
    }

    /**
     * Gets the value of the emdEndorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdEndorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMDEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEMDEndorsement() {
        if (emdEndorsement == null) {
            emdEndorsement = new ArrayList<String>();
        }
        return this.emdEndorsement;
    }

    /**
     * Infomration about the fare calculation
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalc() {
        return fareCalc;
    }

    /**
     * Sets the value of the fareCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCalc(String value) {
        this.fareCalc = value;
    }

    /**
     * Commission information applied during EMD issuance
     * 
     * @return
     *     possible object is
     *     {@link EMDCommission }
     *     
     */
    public EMDCommission getEMDCommission() {
        return emdCommission;
    }

    /**
     * Sets the value of the emdCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDCommission }
     *     
     */
    public void setEMDCommission(EMDCommission value) {
        this.emdCommission = value;
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
     * Gets the value of the providerLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

}
