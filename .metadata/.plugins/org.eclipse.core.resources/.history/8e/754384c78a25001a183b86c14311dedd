
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CreditCard" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/common_v45_0}DebitCard" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/common_v45_0}EnettVan" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.travelport.com/schema/common_v45_0}FormOfPaymentSequenceGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v45_0}typeFormOfPaymentPNRReference" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="SegmentRef" type="{http://www.travelport.com/schema/common_v45_0}typeGeneralReference" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="Type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="25"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="FulfillmentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FulfillmentLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FulfillmentIDType" type="{http://www.travelport.com/schema/common_v45_0}typeFulfillmentIDType" /&gt;
 *       &lt;attribute name="FulfillmentIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsAgentType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AgentText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReuseFOP" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="ExternalReference" type="{http://www.travelport.com/schema/common_v45_0}typeExternalReference" /&gt;
 *       &lt;attribute name="Reusable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProfileKey" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditCard",
    "debitCard",
    "enettVan",
    "certificate",
    "ticketNumber",
    "check",
    "requisition",
    "miscFormOfPayment",
    "agencyPayment",
    "unitedNations",
    "directPayment",
    "agentVoucher",
    "paymentAdvice",
    "providerReservationInfoRef",
    "segmentRef"
})
@XmlRootElement(name = "FormOfPayment")
public class FormOfPayment {

    @XmlElement(name = "CreditCard")
    protected CreditCard creditCard;
    @XmlElement(name = "DebitCard")
    protected DebitCard debitCard;
    @XmlElement(name = "EnettVan")
    protected EnettVan enettVan;
    @XmlElement(name = "Certificate")
    protected Certificate certificate;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;
    @XmlElement(name = "Check")
    protected Check check;
    @XmlElement(name = "Requisition")
    protected Requisition requisition;
    @XmlElement(name = "MiscFormOfPayment")
    protected MiscFormOfPayment miscFormOfPayment;
    @XmlElement(name = "AgencyPayment")
    protected TypeAgencyPayment agencyPayment;
    @XmlElement(name = "UnitedNations")
    protected UnitedNations unitedNations;
    @XmlElement(name = "DirectPayment")
    protected DirectPayment directPayment;
    @XmlElement(name = "AgentVoucher")
    protected AgentVoucher agentVoucher;
    @XmlElement(name = "PaymentAdvice")
    protected PaymentAdvice paymentAdvice;
    @XmlElement(name = "ProviderReservationInfoRef")
    protected List<TypeFormOfPaymentPNRReference> providerReservationInfoRef;
    @XmlElement(name = "SegmentRef")
    protected List<TypeGeneralReference> segmentRef;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "FulfillmentType")
    protected String fulfillmentType;
    @XmlAttribute(name = "FulfillmentLocation")
    protected String fulfillmentLocation;
    @XmlAttribute(name = "FulfillmentIDType")
    protected TypeFulfillmentIDType fulfillmentIDType;
    @XmlAttribute(name = "FulfillmentIDNumber")
    protected String fulfillmentIDNumber;
    @XmlAttribute(name = "IsAgentType")
    protected Boolean isAgentType;
    @XmlAttribute(name = "AgentText")
    protected String agentText;
    @XmlAttribute(name = "ReuseFOP")
    protected String reuseFOP;
    @XmlAttribute(name = "ExternalReference")
    protected String externalReference;
    @XmlAttribute(name = "Reusable")
    protected Boolean reusable;
    @XmlAttribute(name = "ProfileID")
    protected String profileID;
    @XmlAttribute(name = "ProfileKey")
    protected String profileKey;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the debitCard property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCard }
     *     
     */
    public DebitCard getDebitCard() {
        return debitCard;
    }

    /**
     * Sets the value of the debitCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCard }
     *     
     */
    public void setDebitCard(DebitCard value) {
        this.debitCard = value;
    }

    /**
     * Gets the value of the enettVan property.
     * 
     * @return
     *     possible object is
     *     {@link EnettVan }
     *     
     */
    public EnettVan getEnettVan() {
        return enettVan;
    }

    /**
     * Sets the value of the enettVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnettVan }
     *     
     */
    public void setEnettVan(EnettVan value) {
        this.enettVan = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     */
    public void setCertificate(Certificate value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link Check }
     *     
     */
    public Check getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check }
     *     
     */
    public void setCheck(Check value) {
        this.check = value;
    }

    /**
     * Gets the value of the requisition property.
     * 
     * @return
     *     possible object is
     *     {@link Requisition }
     *     
     */
    public Requisition getRequisition() {
        return requisition;
    }

    /**
     * Sets the value of the requisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requisition }
     *     
     */
    public void setRequisition(Requisition value) {
        this.requisition = value;
    }

    /**
     * Gets the value of the miscFormOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link MiscFormOfPayment }
     *     
     */
    public MiscFormOfPayment getMiscFormOfPayment() {
        return miscFormOfPayment;
    }

    /**
     * Sets the value of the miscFormOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscFormOfPayment }
     *     
     */
    public void setMiscFormOfPayment(MiscFormOfPayment value) {
        this.miscFormOfPayment = value;
    }

    /**
     * Gets the value of the agencyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAgencyPayment }
     *     
     */
    public TypeAgencyPayment getAgencyPayment() {
        return agencyPayment;
    }

    /**
     * Sets the value of the agencyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAgencyPayment }
     *     
     */
    public void setAgencyPayment(TypeAgencyPayment value) {
        this.agencyPayment = value;
    }

    /**
     * Gets the value of the unitedNations property.
     * 
     * @return
     *     possible object is
     *     {@link UnitedNations }
     *     
     */
    public UnitedNations getUnitedNations() {
        return unitedNations;
    }

    /**
     * Sets the value of the unitedNations property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitedNations }
     *     
     */
    public void setUnitedNations(UnitedNations value) {
        this.unitedNations = value;
    }

    /**
     * Gets the value of the directPayment property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPayment }
     *     
     */
    public DirectPayment getDirectPayment() {
        return directPayment;
    }

    /**
     * Sets the value of the directPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPayment }
     *     
     */
    public void setDirectPayment(DirectPayment value) {
        this.directPayment = value;
    }

    /**
     * Gets the value of the agentVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link AgentVoucher }
     *     
     */
    public AgentVoucher getAgentVoucher() {
        return agentVoucher;
    }

    /**
     * Sets the value of the agentVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentVoucher }
     *     
     */
    public void setAgentVoucher(AgentVoucher value) {
        this.agentVoucher = value;
    }

    /**
     * Gets the value of the paymentAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAdvice }
     *     
     */
    public PaymentAdvice getPaymentAdvice() {
        return paymentAdvice;
    }

    /**
     * Sets the value of the paymentAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAdvice }
     *     
     */
    public void setPaymentAdvice(PaymentAdvice value) {
        this.paymentAdvice = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderReservationInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFormOfPaymentPNRReference }
     * 
     * 
     */
    public List<TypeFormOfPaymentPNRReference> getProviderReservationInfoRef() {
        if (providerReservationInfoRef == null) {
            providerReservationInfoRef = new ArrayList<TypeFormOfPaymentPNRReference>();
        }
        return this.providerReservationInfoRef;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGeneralReference }
     * 
     * 
     */
    public List<TypeGeneralReference> getSegmentRef() {
        if (segmentRef == null) {
            segmentRef = new ArrayList<TypeGeneralReference>();
        }
        return this.segmentRef;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fulfillmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * Sets the value of the fulfillmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentType(String value) {
        this.fulfillmentType = value;
    }

    /**
     * Gets the value of the fulfillmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentLocation() {
        return fulfillmentLocation;
    }

    /**
     * Sets the value of the fulfillmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentLocation(String value) {
        this.fulfillmentLocation = value;
    }

    /**
     * Gets the value of the fulfillmentIDType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFulfillmentIDType }
     *     
     */
    public TypeFulfillmentIDType getFulfillmentIDType() {
        return fulfillmentIDType;
    }

    /**
     * Sets the value of the fulfillmentIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFulfillmentIDType }
     *     
     */
    public void setFulfillmentIDType(TypeFulfillmentIDType value) {
        this.fulfillmentIDType = value;
    }

    /**
     * Gets the value of the fulfillmentIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentIDNumber() {
        return fulfillmentIDNumber;
    }

    /**
     * Sets the value of the fulfillmentIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentIDNumber(String value) {
        this.fulfillmentIDNumber = value;
    }

    /**
     * Gets the value of the isAgentType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAgentType() {
        if (isAgentType == null) {
            return false;
        } else {
            return isAgentType;
        }
    }

    /**
     * Sets the value of the isAgentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAgentType(Boolean value) {
        this.isAgentType = value;
    }

    /**
     * Gets the value of the agentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentText() {
        return agentText;
    }

    /**
     * Sets the value of the agentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentText(String value) {
        this.agentText = value;
    }

    /**
     * Gets the value of the reuseFOP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuseFOP() {
        return reuseFOP;
    }

    /**
     * Sets the value of the reuseFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuseFOP(String value) {
        this.reuseFOP = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the reusable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReusable() {
        if (reusable == null) {
            return false;
        } else {
            return reusable;
        }
    }

    /**
     * Sets the value of the reusable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReusable(Boolean value) {
        this.reusable = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the profileKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileKey() {
        return profileKey;
    }

    /**
     * Sets the value of the profileKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileKey(String value) {
        this.profileKey = value;
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
