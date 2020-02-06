
package com.travelport.schema.hotel_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseReservation;
import com.travelport.schema.common_v45_0.BookingSource;
import com.travelport.schema.common_v45_0.BookingTravelerRef;
import com.travelport.schema.common_v45_0.Guarantee;
import com.travelport.schema.common_v45_0.ReservationName;
import com.travelport.schema.common_v45_0.ThirdPartyInformation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseReservation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}BookingTravelerRef" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.travelport.com/schema/hotel_v45_0}BaseHotelReservationGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AggregatorBookingStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BookingConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CancelConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ProviderSegmentOrder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;maxInclusive value="999"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PassiveProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerRef",
    "reservationName",
    "thirdPartyInformation",
    "hotelProperty",
    "hotelRateDetail",
    "hotelStay",
    "hotelSpecialRequest",
    "guarantee",
    "promotionCode",
    "bookingSource",
    "hotelBedding",
    "guestInformation",
    "associatedRemark",
    "sellMessage",
    "hotelCommission",
    "bookingGuestInformation",
    "roomConfirmationCodes",
    "cancelInfo",
    "totalReservationPrice",
    "hotelDetailItem",
    "adaptedRoomGuestAllocation"
})
@XmlRootElement(name = "HotelReservation")
public class HotelReservation
    extends BaseReservation
{

    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlElement(name = "ReservationName", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected ReservationName reservationName;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected ThirdPartyInformation thirdPartyInformation;
    @XmlElement(name = "HotelProperty", required = true)
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelRateDetail", required = true)
    protected List<HotelRateDetail> hotelRateDetail;
    @XmlElement(name = "HotelStay", required = true)
    protected HotelStay hotelStay;
    @XmlElement(name = "HotelSpecialRequest")
    protected String hotelSpecialRequest;
    @XmlElement(name = "Guarantee", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected Guarantee guarantee;
    @XmlElement(name = "PromotionCode")
    protected PromotionCode promotionCode;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected BookingSource bookingSource;
    @XmlElement(name = "HotelBedding")
    protected List<HotelBedding> hotelBedding;
    @XmlElement(name = "GuestInformation")
    protected GuestInformation guestInformation;
    @XmlElement(name = "AssociatedRemark")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "SellMessage", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<String> sellMessage;
    @XmlElement(name = "HotelCommission")
    protected String hotelCommission;
    @XmlElement(name = "BookingGuestInformation")
    protected BookingGuestInformation bookingGuestInformation;
    @XmlElement(name = "RoomConfirmationCodes")
    protected HotelReservation.RoomConfirmationCodes roomConfirmationCodes;
    @XmlElement(name = "CancelInfo")
    protected CancelInfo cancelInfo;
    @XmlElement(name = "TotalReservationPrice")
    protected HotelReservation.TotalReservationPrice totalReservationPrice;
    @XmlElement(name = "HotelDetailItem")
    protected List<HotelDetailItem> hotelDetailItem;
    @XmlElement(name = "AdaptedRoomGuestAllocation")
    protected HotelReservation.AdaptedRoomGuestAllocation adaptedRoomGuestAllocation;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "AggregatorBookingStatus")
    protected String aggregatorBookingStatus;
    @XmlAttribute(name = "BookingConfirmation")
    protected String bookingConfirmation;
    @XmlAttribute(name = "CancelConfirmation")
    protected String cancelConfirmation;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "TravelOrder")
    protected BigInteger travelOrder;
    @XmlAttribute(name = "ProviderSegmentOrder")
    protected BigInteger providerSegmentOrder;
    @XmlAttribute(name = "PassiveProviderReservationInfoRef")
    protected String passiveProviderReservationInfoRef;

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTravelerRef }
     * 
     * 
     */
    public List<BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<BookingTravelerRef>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the reservationName property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationName }
     *     
     */
    public ReservationName getReservationName() {
        return reservationName;
    }

    /**
     * Sets the value of the reservationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationName }
     *     
     */
    public void setReservationName(ReservationName value) {
        this.reservationName = value;
    }

    /**
     * Gets the value of the thirdPartyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyInformation }
     *     
     */
    public ThirdPartyInformation getThirdPartyInformation() {
        return thirdPartyInformation;
    }

    /**
     * Sets the value of the thirdPartyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyInformation }
     *     
     */
    public void setThirdPartyInformation(ThirdPartyInformation value) {
        this.thirdPartyInformation = value;
    }

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    public HotelProperty getHotelProperty() {
        return hotelProperty;
    }

    /**
     * Sets the value of the hotelProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProperty }
     *     
     */
    public void setHotelProperty(HotelProperty value) {
        this.hotelProperty = value;
    }

    /**
     * Gets the value of the hotelRateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRateDetail }
     * 
     * 
     */
    public List<HotelRateDetail> getHotelRateDetail() {
        if (hotelRateDetail == null) {
            hotelRateDetail = new ArrayList<HotelRateDetail>();
        }
        return this.hotelRateDetail;
    }

    /**
     * Gets the value of the hotelStay property.
     * 
     * @return
     *     possible object is
     *     {@link HotelStay }
     *     
     */
    public HotelStay getHotelStay() {
        return hotelStay;
    }

    /**
     * Sets the value of the hotelStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelStay }
     *     
     */
    public void setHotelStay(HotelStay value) {
        this.hotelStay = value;
    }

    /**
     * Gets the value of the hotelSpecialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelSpecialRequest() {
        return hotelSpecialRequest;
    }

    /**
     * Sets the value of the hotelSpecialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelSpecialRequest(String value) {
        this.hotelSpecialRequest = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link Guarantee }
     *     
     */
    public Guarantee getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guarantee }
     *     
     */
    public void setGuarantee(Guarantee value) {
        this.guarantee = value;
    }

    /**
     * Specifies promotional code used in hotel booking
     * 
     * @return
     *     possible object is
     *     {@link PromotionCode }
     *     
     */
    public PromotionCode getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCode }
     *     
     */
    public void setPromotionCode(PromotionCode value) {
        this.promotionCode = value;
    }

    /**
     * Specify alternate booking source
     * 
     * @return
     *     possible object is
     *     {@link BookingSource }
     *     
     */
    public BookingSource getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingSource }
     *     
     */
    public void setBookingSource(BookingSource value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the hotelBedding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelBedding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelBedding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelBedding }
     * 
     * 
     */
    public List<HotelBedding> getHotelBedding() {
        if (hotelBedding == null) {
            hotelBedding = new ArrayList<HotelBedding>();
        }
        return this.hotelBedding;
    }

    /**
     * Gets the value of the guestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GuestInformation }
     *     
     */
    public GuestInformation getGuestInformation() {
        return guestInformation;
    }

    /**
     * Sets the value of the guestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestInformation }
     *     
     */
    public void setGuestInformation(GuestInformation value) {
        this.guestInformation = value;
    }

    /**
     * Gets the value of the associatedRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedRemark }
     * 
     * 
     */
    public List<AssociatedRemark> getAssociatedRemark() {
        if (associatedRemark == null) {
            associatedRemark = new ArrayList<AssociatedRemark>();
        }
        return this.associatedRemark;
    }

    /**
     * Gets the value of the sellMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSellMessage() {
        if (sellMessage == null) {
            sellMessage = new ArrayList<String>();
        }
        return this.sellMessage;
    }

    /**
     * HotelCommission text indicates commision while hotel reservation. Provider supported 1P and 1J.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCommission() {
        return hotelCommission;
    }

    /**
     * Sets the value of the hotelCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCommission(String value) {
        this.hotelCommission = value;
    }

    /**
     * Gets the value of the bookingGuestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BookingGuestInformation }
     *     
     */
    public BookingGuestInformation getBookingGuestInformation() {
        return bookingGuestInformation;
    }

    /**
     * Sets the value of the bookingGuestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingGuestInformation }
     *     
     */
    public void setBookingGuestInformation(BookingGuestInformation value) {
        this.bookingGuestInformation = value;
    }

    /**
     * Gets the value of the roomConfirmationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservation.RoomConfirmationCodes }
     *     
     */
    public HotelReservation.RoomConfirmationCodes getRoomConfirmationCodes() {
        return roomConfirmationCodes;
    }

    /**
     * Sets the value of the roomConfirmationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservation.RoomConfirmationCodes }
     *     
     */
    public void setRoomConfirmationCodes(HotelReservation.RoomConfirmationCodes value) {
        this.roomConfirmationCodes = value;
    }

    /**
     * Gets the value of the cancelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CancelInfo }
     *     
     */
    public CancelInfo getCancelInfo() {
        return cancelInfo;
    }

    /**
     * Sets the value of the cancelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelInfo }
     *     
     */
    public void setCancelInfo(CancelInfo value) {
        this.cancelInfo = value;
    }

    /**
     * Gets the value of the totalReservationPrice property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservation.TotalReservationPrice }
     *     
     */
    public HotelReservation.TotalReservationPrice getTotalReservationPrice() {
        return totalReservationPrice;
    }

    /**
     * Sets the value of the totalReservationPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservation.TotalReservationPrice }
     *     
     */
    public void setTotalReservationPrice(HotelReservation.TotalReservationPrice value) {
        this.totalReservationPrice = value;
    }

    /**
     * Gets the value of the hotelDetailItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelDetailItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelDetailItem }
     * 
     * 
     */
    public List<HotelDetailItem> getHotelDetailItem() {
        if (hotelDetailItem == null) {
            hotelDetailItem = new ArrayList<HotelDetailItem>();
        }
        return this.hotelDetailItem;
    }

    /**
     * Gets the value of the adaptedRoomGuestAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservation.AdaptedRoomGuestAllocation }
     *     
     */
    public HotelReservation.AdaptedRoomGuestAllocation getAdaptedRoomGuestAllocation() {
        return adaptedRoomGuestAllocation;
    }

    /**
     * Sets the value of the adaptedRoomGuestAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservation.AdaptedRoomGuestAllocation }
     *     
     */
    public void setAdaptedRoomGuestAllocation(HotelReservation.AdaptedRoomGuestAllocation value) {
        this.adaptedRoomGuestAllocation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the aggregatorBookingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorBookingStatus() {
        return aggregatorBookingStatus;
    }

    /**
     * Sets the value of the aggregatorBookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorBookingStatus(String value) {
        this.aggregatorBookingStatus = value;
    }

    /**
     * Gets the value of the bookingConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingConfirmation() {
        return bookingConfirmation;
    }

    /**
     * Sets the value of the bookingConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingConfirmation(String value) {
        this.bookingConfirmation = value;
    }

    /**
     * Gets the value of the cancelConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelConfirmation() {
        return cancelConfirmation;
    }

    /**
     * Sets the value of the cancelConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelConfirmation(String value) {
        this.cancelConfirmation = value;
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
     * Gets the value of the travelOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelOrder() {
        return travelOrder;
    }

    /**
     * Sets the value of the travelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelOrder(BigInteger value) {
        this.travelOrder = value;
    }

    /**
     * Gets the value of the providerSegmentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProviderSegmentOrder() {
        return providerSegmentOrder;
    }

    /**
     * Sets the value of the providerSegmentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProviderSegmentOrder(BigInteger value) {
        this.providerSegmentOrder = value;
    }

    /**
     * Gets the value of the passiveProviderReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveProviderReservationInfoRef() {
        return passiveProviderReservationInfoRef;
    }

    /**
     * Sets the value of the passiveProviderReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveProviderReservationInfoRef(String value) {
        this.passiveProviderReservationInfoRef = value;
    }


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
     *         &lt;element name="Room" type="{http://www.travelport.com/schema/hotel_v45_0}typeAdaptedRoomGuestAllocation" maxOccurs="9"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "room"
    })
    public static class AdaptedRoomGuestAllocation {

        @XmlElement(name = "Room", required = true)
        protected List<TypeAdaptedRoomGuestAllocation> room;

        /**
         * Gets the value of the room property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the room property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoom().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeAdaptedRoomGuestAllocation }
         * 
         * 
         */
        public List<TypeAdaptedRoomGuestAllocation> getRoom() {
            if (room == null) {
                room = new ArrayList<TypeAdaptedRoomGuestAllocation>();
            }
            return this.room;
        }

    }


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
     *         &lt;element name="ConfirmationCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="9"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "confirmationCode"
    })
    public static class RoomConfirmationCodes {

        @XmlElement(name = "ConfirmationCode", required = true)
        protected List<String> confirmationCode;

        /**
         * Gets the value of the confirmationCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the confirmationCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfirmationCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getConfirmationCode() {
            if (confirmationCode == null) {
                confirmationCode = new ArrayList<String>();
            }
            return this.confirmationCode;
        }

    }


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
     *         &lt;element name="RoomRateDescription" type="{http://www.travelport.com/schema/hotel_v45_0}typeHotelRateDescription" maxOccurs="99" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TotalPrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *       &lt;attribute name="ApproxTotalPrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomRateDescription"
    })
    public static class TotalReservationPrice {

        @XmlElement(name = "RoomRateDescription")
        protected List<TypeHotelRateDescription> roomRateDescription;
        @XmlAttribute(name = "TotalPrice")
        protected String totalPrice;
        @XmlAttribute(name = "ApproxTotalPrice")
        protected String approxTotalPrice;

        /**
         * Gets the value of the roomRateDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomRateDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomRateDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeHotelRateDescription }
         * 
         * 
         */
        public List<TypeHotelRateDescription> getRoomRateDescription() {
            if (roomRateDescription == null) {
                roomRateDescription = new ArrayList<TypeHotelRateDescription>();
            }
            return this.roomRateDescription;
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
         * Gets the value of the approxTotalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproxTotalPrice() {
            return approxTotalPrice;
        }

        /**
         * Sets the value of the approxTotalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApproxTotalPrice(String value) {
            this.approxTotalPrice = value;
        }

    }

}
