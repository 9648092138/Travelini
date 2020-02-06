
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.Payment;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDSummary" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDTravelerInfo"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Payment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
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
    "emdSummary",
    "emdTravelerInfo",
    "payment"
})
@XmlRootElement(name = "EMDSummaryInfo")
public class EMDSummaryInfo {

    @XmlElement(name = "EMDSummary", required = true)
    protected List<EMDSummary> emdSummary;
    @XmlElement(name = "EMDTravelerInfo", required = true)
    protected EMDTravelerInfo emdTravelerInfo;
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected Payment payment;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Summary information for EMDs conjuncted to each other.Gets the value of the emdSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMDSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDSummary }
     * 
     * 
     */
    public List<EMDSummary> getEMDSummary() {
        if (emdSummary == null) {
            emdSummary = new ArrayList<EMDSummary>();
        }
        return this.emdSummary;
    }

    /**
     * EMD traveler information.
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
     * Payment charged to issue EMD.
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
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
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
