
package com.travelport.schema.air_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.Commission;
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
 *         &lt;element name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="NetRemit" type="{http://www.travelport.com/schema/air_v45_0}typeTicketModifierAmountType" minOccurs="0"/&gt;
 *         &lt;element name="NetFare" type="{http://www.travelport.com/schema/air_v45_0}typeTicketModifierAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ActualSellingFare" type="{http://www.travelport.com/schema/air_v45_0}typeTicketModifierAmountType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceFare" type="{http://www.travelport.com/schema/air_v45_0}typeTicketModifierAccountingType" minOccurs="0"/&gt;
 *         &lt;element name="CorporateDiscount" type="{http://www.travelport.com/schema/air_v45_0}typeTicketModifierAccountingType" minOccurs="0"/&gt;
 *         &lt;element name="AccountingInfo" type="{http://www.travelport.com/schema/air_v45_0}typeTicketModifierAccountingType" minOccurs="0"/&gt;
 *         &lt;element name="BulkTicket" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.travelport.com/schema/air_v45_0}typeBulkTicketModifierType"&gt;
 *                 &lt;attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GroupTour" type="{http://www.travelport.com/schema/air_v45_0}typeBulkTicketModifierType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Commission" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TourCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TicketEndorsement" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="ValueModifier" type="{http://www.travelport.com/schema/air_v45_0}typeTicketModifierValueType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}DocumentSelect" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}DocumentOptions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}SegmentSelect" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}SegmentModifiers" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}SupplierLocator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}DestinationPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}LanguageOption" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}LandCharges" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PrintBlankFormItinerary" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ExcludeTicketing" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ExemptOBFee" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="IsPrimaryDI" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="DocumentInstructionNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="Reference" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to30" /&gt;
 *       &lt;attribute name="Status"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="30"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="FreeText"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="756"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *       &lt;attribute name="ExemptVAT" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NetRemitApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FreeTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CurrencyOverrideCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
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
    "bookingTravelerRef",
    "netRemit",
    "netFare",
    "actualSellingFare",
    "invoiceFare",
    "corporateDiscount",
    "accountingInfo",
    "bulkTicket",
    "groupTour",
    "commission",
    "tourCode",
    "ticketEndorsement",
    "valueModifier",
    "documentSelect",
    "documentOptions",
    "segmentSelect",
    "segmentModifiers",
    "supplierLocator",
    "destinationPurposeCode",
    "languageOption",
    "landCharges",
    "printBlankFormItinerary",
    "excludeTicketing",
    "exemptOBFee"
})
@XmlRootElement(name = "TicketingModifiers")
public class TicketingModifiers {

    @XmlElement(name = "BookingTravelerRef")
    protected List<String> bookingTravelerRef;
    @XmlElement(name = "NetRemit")
    protected TypeTicketModifierAmountType netRemit;
    @XmlElement(name = "NetFare")
    protected TypeTicketModifierAmountType netFare;
    @XmlElement(name = "ActualSellingFare")
    protected TypeTicketModifierAmountType actualSellingFare;
    @XmlElement(name = "InvoiceFare")
    protected TypeTicketModifierAccountingType invoiceFare;
    @XmlElement(name = "CorporateDiscount")
    protected TypeTicketModifierAccountingType corporateDiscount;
    @XmlElement(name = "AccountingInfo")
    protected TypeTicketModifierAccountingType accountingInfo;
    @XmlElement(name = "BulkTicket")
    protected TicketingModifiers.BulkTicket bulkTicket;
    @XmlElement(name = "GroupTour")
    protected TypeBulkTicketModifierType groupTour;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected Commission commission;
    @XmlElement(name = "TourCode")
    protected TourCode tourCode;
    @XmlElement(name = "TicketEndorsement")
    protected List<TicketEndorsement> ticketEndorsement;
    @XmlElement(name = "ValueModifier")
    protected TypeTicketModifierValueType valueModifier;
    @XmlElement(name = "DocumentSelect")
    protected DocumentSelect documentSelect;
    @XmlElement(name = "DocumentOptions")
    protected DocumentOptions documentOptions;
    @XmlElement(name = "SegmentSelect")
    protected SegmentSelect segmentSelect;
    @XmlElement(name = "SegmentModifiers")
    protected List<SegmentModifiers> segmentModifiers;
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected SupplierLocator supplierLocator;
    @XmlElement(name = "DestinationPurposeCode")
    protected DestinationPurposeCode destinationPurposeCode;
    @XmlElement(name = "LanguageOption")
    protected List<LanguageOption> languageOption;
    @XmlElement(name = "LandCharges")
    protected LandCharges landCharges;
    @XmlElement(name = "PrintBlankFormItinerary")
    protected PrintBlankFormItinerary printBlankFormItinerary;
    @XmlElement(name = "ExcludeTicketing")
    protected ExcludeTicketing excludeTicketing;
    @XmlElement(name = "ExemptOBFee")
    protected ExemptOBFee exemptOBFee;
    @XmlAttribute(name = "IsPrimaryDI")
    protected Boolean isPrimaryDI;
    @XmlAttribute(name = "DocumentInstructionNumber")
    protected BigInteger documentInstructionNumber;
    @XmlAttribute(name = "Reference")
    protected String reference;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "FreeText")
    protected String freeText;
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    @XmlAttribute(name = "ExemptVAT")
    protected Boolean exemptVAT;
    @XmlAttribute(name = "NetRemitApplied")
    protected Boolean netRemitApplied;
    @XmlAttribute(name = "FreeTicket")
    protected Boolean freeTicket;
    @XmlAttribute(name = "CurrencyOverrideCode")
    protected String currencyOverrideCode;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

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
     * {@link String }
     * 
     * 
     */
    public List<String> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<String>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the netRemit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    public TypeTicketModifierAmountType getNetRemit() {
        return netRemit;
    }

    /**
     * Sets the value of the netRemit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    public void setNetRemit(TypeTicketModifierAmountType value) {
        this.netRemit = value;
    }

    /**
     * Gets the value of the netFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    public TypeTicketModifierAmountType getNetFare() {
        return netFare;
    }

    /**
     * Sets the value of the netFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    public void setNetFare(TypeTicketModifierAmountType value) {
        this.netFare = value;
    }

    /**
     * Gets the value of the actualSellingFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    public TypeTicketModifierAmountType getActualSellingFare() {
        return actualSellingFare;
    }

    /**
     * Sets the value of the actualSellingFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    public void setActualSellingFare(TypeTicketModifierAmountType value) {
        this.actualSellingFare = value;
    }

    /**
     * Gets the value of the invoiceFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    public TypeTicketModifierAccountingType getInvoiceFare() {
        return invoiceFare;
    }

    /**
     * Sets the value of the invoiceFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    public void setInvoiceFare(TypeTicketModifierAccountingType value) {
        this.invoiceFare = value;
    }

    /**
     * Gets the value of the corporateDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    public TypeTicketModifierAccountingType getCorporateDiscount() {
        return corporateDiscount;
    }

    /**
     * Sets the value of the corporateDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    public void setCorporateDiscount(TypeTicketModifierAccountingType value) {
        this.corporateDiscount = value;
    }

    /**
     * Gets the value of the accountingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    public TypeTicketModifierAccountingType getAccountingInfo() {
        return accountingInfo;
    }

    /**
     * Sets the value of the accountingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    public void setAccountingInfo(TypeTicketModifierAccountingType value) {
        this.accountingInfo = value;
    }

    /**
     * Gets the value of the bulkTicket property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingModifiers.BulkTicket }
     *     
     */
    public TicketingModifiers.BulkTicket getBulkTicket() {
        return bulkTicket;
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingModifiers.BulkTicket }
     *     
     */
    public void setBulkTicket(TicketingModifiers.BulkTicket value) {
        this.bulkTicket = value;
    }

    /**
     * Gets the value of the groupTour property.
     * 
     * @return
     *     possible object is
     *     {@link TypeBulkTicketModifierType }
     *     
     */
    public TypeBulkTicketModifierType getGroupTour() {
        return groupTour;
    }

    /**
     * Sets the value of the groupTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBulkTicketModifierType }
     *     
     */
    public void setGroupTour(TypeBulkTicketModifierType value) {
        this.groupTour = value;
    }

    /**
     * Allows an agency to update the commission
     *                      to a new or different commission rate which will be applied at
     *                      time of ticketing. The commission Modifier allows the user
     *                      specify how the commission change is to applied
     *                   
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Allows an agency to modify the tour code
     *                      information on the ticket
     * 
     * @return
     *     possible object is
     *     {@link TourCode }
     *     
     */
    public TourCode getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCode }
     *     
     */
    public void setTourCode(TourCode value) {
        this.tourCode = value;
    }

    /**
     * Allows an agency to add user defined
     *                      ticketing endorsements the ticket Gets the value of the ticketEndorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketEndorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketEndorsement }
     * 
     * 
     */
    public List<TicketEndorsement> getTicketEndorsement() {
        if (ticketEndorsement == null) {
            ticketEndorsement = new ArrayList<TicketEndorsement>();
        }
        return this.ticketEndorsement;
    }

    /**
     * Gets the value of the valueModifier property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierValueType }
     *     
     */
    public TypeTicketModifierValueType getValueModifier() {
        return valueModifier;
    }

    /**
     * Sets the value of the valueModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierValueType }
     *     
     */
    public void setValueModifier(TypeTicketModifierValueType value) {
        this.valueModifier = value;
    }

    /**
     * Gets the value of the documentSelect property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSelect }
     *     
     */
    public DocumentSelect getDocumentSelect() {
        return documentSelect;
    }

    /**
     * Sets the value of the documentSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSelect }
     *     
     */
    public void setDocumentSelect(DocumentSelect value) {
        this.documentSelect = value;
    }

    /**
     * Gets the value of the documentOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOptions }
     *     
     */
    public DocumentOptions getDocumentOptions() {
        return documentOptions;
    }

    /**
     * Sets the value of the documentOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOptions }
     *     
     */
    public void setDocumentOptions(DocumentOptions value) {
        this.documentOptions = value;
    }

    /**
     * Gets the value of the segmentSelect property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentSelect }
     *     
     */
    public SegmentSelect getSegmentSelect() {
        return segmentSelect;
    }

    /**
     * Sets the value of the segmentSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentSelect }
     *     
     */
    public void setSegmentSelect(SegmentSelect value) {
        this.segmentSelect = value;
    }

    /**
     * Gets the value of the segmentModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentModifiers }
     * 
     * 
     */
    public List<SegmentModifiers> getSegmentModifiers() {
        if (segmentModifiers == null) {
            segmentModifiers = new ArrayList<SegmentModifiers>();
        }
        return this.segmentModifiers;
    }

    /**
     * Gets the value of the supplierLocator property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierLocator }
     *     
     */
    public SupplierLocator getSupplierLocator() {
        return supplierLocator;
    }

    /**
     * Sets the value of the supplierLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierLocator }
     *     
     */
    public void setSupplierLocator(SupplierLocator value) {
        this.supplierLocator = value;
    }

    /**
     * Gets the value of the destinationPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationPurposeCode }
     *     
     */
    public DestinationPurposeCode getDestinationPurposeCode() {
        return destinationPurposeCode;
    }

    /**
     * Sets the value of the destinationPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationPurposeCode }
     *     
     */
    public void setDestinationPurposeCode(DestinationPurposeCode value) {
        this.destinationPurposeCode = value;
    }

    /**
     * Gets the value of the languageOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageOption }
     * 
     * 
     */
    public List<LanguageOption> getLanguageOption() {
        if (languageOption == null) {
            languageOption = new ArrayList<LanguageOption>();
        }
        return this.languageOption;
    }

    /**
     * Gets the value of the landCharges property.
     * 
     * @return
     *     possible object is
     *     {@link LandCharges }
     *     
     */
    public LandCharges getLandCharges() {
        return landCharges;
    }

    /**
     * Sets the value of the landCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandCharges }
     *     
     */
    public void setLandCharges(LandCharges value) {
        this.landCharges = value;
    }

    /**
     * Gets the value of the printBlankFormItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link PrintBlankFormItinerary }
     *     
     */
    public PrintBlankFormItinerary getPrintBlankFormItinerary() {
        return printBlankFormItinerary;
    }

    /**
     * Sets the value of the printBlankFormItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintBlankFormItinerary }
     *     
     */
    public void setPrintBlankFormItinerary(PrintBlankFormItinerary value) {
        this.printBlankFormItinerary = value;
    }

    /**
     * Gets the value of the excludeTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link ExcludeTicketing }
     *     
     */
    public ExcludeTicketing getExcludeTicketing() {
        return excludeTicketing;
    }

    /**
     * Sets the value of the excludeTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcludeTicketing }
     *     
     */
    public void setExcludeTicketing(ExcludeTicketing value) {
        this.excludeTicketing = value;
    }

    /**
     * Gets the value of the exemptOBFee property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptOBFee }
     *     
     */
    public ExemptOBFee getExemptOBFee() {
        return exemptOBFee;
    }

    /**
     * Sets the value of the exemptOBFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptOBFee }
     *     
     */
    public void setExemptOBFee(ExemptOBFee value) {
        this.exemptOBFee = value;
    }

    /**
     * Gets the value of the isPrimaryDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsPrimaryDI() {
        if (isPrimaryDI == null) {
            return false;
        } else {
            return isPrimaryDI;
        }
    }

    /**
     * Sets the value of the isPrimaryDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryDI(Boolean value) {
        this.isPrimaryDI = value;
    }

    /**
     * Gets the value of the documentInstructionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentInstructionNumber() {
        return documentInstructionNumber;
    }

    /**
     * Sets the value of the documentInstructionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentInstructionNumber(BigInteger value) {
        this.documentInstructionNumber = value;
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
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the platingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Gets the value of the exemptVAT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExemptVAT() {
        return exemptVAT;
    }

    /**
     * Sets the value of the exemptVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExemptVAT(Boolean value) {
        this.exemptVAT = value;
    }

    /**
     * Gets the value of the netRemitApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetRemitApplied() {
        return netRemitApplied;
    }

    /**
     * Sets the value of the netRemitApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetRemitApplied(Boolean value) {
        this.netRemitApplied = value;
    }

    /**
     * Gets the value of the freeTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeTicket() {
        return freeTicket;
    }

    /**
     * Sets the value of the freeTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeTicket(Boolean value) {
        this.freeTicket = value;
    }

    /**
     * Gets the value of the currencyOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyOverrideCode() {
        return currencyOverrideCode;
    }

    /**
     * Sets the value of the currencyOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyOverrideCode(String value) {
        this.currencyOverrideCode = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.travelport.com/schema/air_v45_0}typeBulkTicketModifierType"&gt;
     *       &lt;attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BulkTicket
        extends TypeBulkTicketModifierType
    {

        @XmlAttribute(name = "NonRefundable")
        protected Boolean nonRefundable;

        /**
         * Gets the value of the nonRefundable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundable() {
            return nonRefundable;
        }

        /**
         * Sets the value of the nonRefundable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundable(Boolean value) {
            this.nonRefundable = value;
        }

    }

}
