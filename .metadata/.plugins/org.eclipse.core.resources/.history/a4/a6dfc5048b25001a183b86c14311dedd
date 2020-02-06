
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.AgencyInfo;
import com.travelport.schema.common_v45_0.BookingTraveler;
import com.travelport.schema.common_v45_0.FormOfPayment;
import com.travelport.schema.common_v45_0.Payment;
import com.travelport.schema.common_v45_0.RefundRemark;
import com.travelport.schema.common_v45_0.SupplierLocator;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}FormOfPayment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Payment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}BookingTraveler" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PassengerTicketNumber" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirPricingInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}AgencyInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirReservationLocatorCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}SupplierLocator" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}RefundRemark" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}ProviderReservation"/&gt;
 *       &lt;attribute name="TCRNumber" use="required" type="{http://www.travelport.com/schema/air_v45_0}typeTCRNumber" /&gt;
 *       &lt;attribute name="Status" use="required" type="{http://www.travelport.com/schema/air_v45_0}typeTCRStatus" /&gt;
 *       &lt;attribute name="ModifiedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConfirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BasePrice" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="Taxes" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="Fees" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="Refundable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Exchangeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Voidable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Modifiable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute ref="{http://www.travelport.com/schema/air_v45_0}RefundAccessCode"/&gt;
 *       &lt;attribute name="RefundAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="RefundFee" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="ForfeitAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formOfPayment",
    "payment",
    "bookingTraveler",
    "passengerTicketNumber",
    "airPricingInfo",
    "agencyInfo",
    "airReservationLocatorCode",
    "supplierLocator",
    "refundRemark"
})
@XmlRootElement(name = "TCR")
public class TCR {

    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<FormOfPayment> formOfPayment;
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<Payment> payment;
    @XmlElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v45_0", required = true)
    protected List<BookingTraveler> bookingTraveler;
    @XmlElement(name = "PassengerTicketNumber")
    protected List<PassengerTicketNumber> passengerTicketNumber;
    @XmlElement(name = "AirPricingInfo")
    protected List<AirPricingInfo> airPricingInfo;
    @XmlElement(name = "AgencyInfo", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected AgencyInfo agencyInfo;
    @XmlElement(name = "AirReservationLocatorCode")
    protected AirReservationLocatorCode airReservationLocatorCode;
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<SupplierLocator> supplierLocator;
    @XmlElement(name = "RefundRemark", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<RefundRemark> refundRemark;
    @XmlAttribute(name = "TCRNumber", required = true)
    protected String tcrNumber;
    @XmlAttribute(name = "Status", required = true)
    protected TypeTCRStatus status;
    @XmlAttribute(name = "ModifiedDate", required = true)
    protected String modifiedDate;
    @XmlAttribute(name = "ConfirmedDate")
    protected String confirmedDate;
    @XmlAttribute(name = "BasePrice", required = true)
    protected String basePrice;
    @XmlAttribute(name = "Taxes", required = true)
    protected String taxes;
    @XmlAttribute(name = "Fees", required = true)
    protected String fees;
    @XmlAttribute(name = "Refundable", required = true)
    protected boolean refundable;
    @XmlAttribute(name = "Exchangeable", required = true)
    protected boolean exchangeable;
    @XmlAttribute(name = "Voidable", required = true)
    protected boolean voidable;
    @XmlAttribute(name = "Modifiable", required = true)
    protected boolean modifiable;
    @XmlAttribute(name = "RefundAccessCode", namespace = "http://www.travelport.com/schema/air_v45_0")
    protected String refundAccessCode;
    @XmlAttribute(name = "RefundAmount")
    protected String refundAmount;
    @XmlAttribute(name = "RefundFee")
    protected String refundFee;
    @XmlAttribute(name = "ForfeitAmount")
    protected String forfeitAmount;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode", required = true)
    protected String providerLocatorCode;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * 
     * 
     */
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<FormOfPayment>();
        }
        return this.formOfPayment;
    }

    /**
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<Payment>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the bookingTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTraveler }
     * 
     * 
     */
    public List<BookingTraveler> getBookingTraveler() {
        if (bookingTraveler == null) {
            bookingTraveler = new ArrayList<BookingTraveler>();
        }
        return this.bookingTraveler;
    }

    /**
     * Gets the value of the passengerTicketNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTicketNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerTicketNumber }
     * 
     * 
     */
    public List<PassengerTicketNumber> getPassengerTicketNumber() {
        if (passengerTicketNumber == null) {
            passengerTicketNumber = new ArrayList<PassengerTicketNumber>();
        }
        return this.passengerTicketNumber;
    }

    /**
     * Gets the value of the airPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfo }
     * 
     * 
     */
    public List<AirPricingInfo> getAirPricingInfo() {
        if (airPricingInfo == null) {
            airPricingInfo = new ArrayList<AirPricingInfo>();
        }
        return this.airPricingInfo;
    }

    /**
     * Gets the value of the agencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyInfo }
     *     
     */
    public AgencyInfo getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInfo }
     *     
     */
    public void setAgencyInfo(AgencyInfo value) {
        this.agencyInfo = value;
    }

    /**
     * Gets the value of the airReservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    public AirReservationLocatorCode getAirReservationLocatorCode() {
        return airReservationLocatorCode;
    }

    /**
     * Sets the value of the airReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * Gets the value of the supplierLocator property.
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
     * Gets the value of the refundRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundRemark }
     * 
     * 
     */
    public List<RefundRemark> getRefundRemark() {
        if (refundRemark == null) {
            refundRemark = new ArrayList<RefundRemark>();
        }
        return this.refundRemark;
    }

    /**
     * Gets the value of the tcrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCRNumber() {
        return tcrNumber;
    }

    /**
     * Sets the value of the tcrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCRNumber(String value) {
        this.tcrNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTCRStatus }
     *     
     */
    public TypeTCRStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTCRStatus }
     *     
     */
    public void setStatus(TypeTCRStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the confirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedDate() {
        return confirmedDate;
    }

    /**
     * Sets the value of the confirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedDate(String value) {
        this.confirmedDate = value;
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
     * Gets the value of the refundable property.
     * 
     */
    public boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     */
    public void setRefundable(boolean value) {
        this.refundable = value;
    }

    /**
     * Gets the value of the exchangeable property.
     * 
     */
    public boolean isExchangeable() {
        return exchangeable;
    }

    /**
     * Sets the value of the exchangeable property.
     * 
     */
    public void setExchangeable(boolean value) {
        this.exchangeable = value;
    }

    /**
     * Gets the value of the voidable property.
     * 
     */
    public boolean isVoidable() {
        return voidable;
    }

    /**
     * Sets the value of the voidable property.
     * 
     */
    public void setVoidable(boolean value) {
        this.voidable = value;
    }

    /**
     * Gets the value of the modifiable property.
     * 
     */
    public boolean isModifiable() {
        return modifiable;
    }

    /**
     * Sets the value of the modifiable property.
     * 
     */
    public void setModifiable(boolean value) {
        this.modifiable = value;
    }

    /**
     * Gets the value of the refundAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundAccessCode() {
        return refundAccessCode;
    }

    /**
     * Sets the value of the refundAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundAccessCode(String value) {
        this.refundAccessCode = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundAmount(String value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the refundFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundFee() {
        return refundFee;
    }

    /**
     * Sets the value of the refundFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundFee(String value) {
        this.refundFee = value;
    }

    /**
     * Gets the value of the forfeitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForfeitAmount() {
        return forfeitAmount;
    }

    /**
     * Sets the value of the forfeitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForfeitAmount(String value) {
        this.forfeitAmount = value;
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

}
