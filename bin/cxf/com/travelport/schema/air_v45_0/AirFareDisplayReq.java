
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.AccountCode;
import com.travelport.schema.common_v45_0.BaseReq;
import com.travelport.schema.common_v45_0.Carrier;
import com.travelport.schema.common_v45_0.PointOfSale;
import com.travelport.schema.common_v45_0.TypePassengerType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="PassengerType" type="{http://www.travelport.com/schema/common_v45_0}typePassengerType" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BookingCode" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}IncludeAddlBookingCodeInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareBasis" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Carrier" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}AccountCode" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ContractCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirFareDisplayModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PointOfSale" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirFareDisplayRuleKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeProviderCode" /&gt;
 *       &lt;attribute name="IncludeMileRouteInformation" type="{http://www.travelport.com/schema/air_v45_0}typeMileOrRouteBasedFare" /&gt;
 *       &lt;attribute name="UnSaleableFaresOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ChannelId"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="2"/&gt;
 *             &lt;maxLength value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NSCC"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ReturnMM" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareType",
    "passengerType",
    "bookingCode",
    "includeAddlBookingCodeInfo",
    "fareBasis",
    "carrier",
    "accountCode",
    "contractCode",
    "airFareDisplayModifiers",
    "pointOfSale",
    "airFareDisplayRuleKey"
})
@XmlRootElement(name = "AirFareDisplayReq")
public class AirFareDisplayReq
    extends BaseReq
{

    @XmlElement(name = "FareType")
    protected List<FareType> fareType;
    @XmlElement(name = "PassengerType")
    protected List<TypePassengerType> passengerType;
    @XmlElement(name = "BookingCode")
    protected List<BookingCode> bookingCode;
    @XmlElement(name = "IncludeAddlBookingCodeInfo")
    protected IncludeAddlBookingCodeInfo includeAddlBookingCodeInfo;
    @XmlElement(name = "FareBasis")
    protected FareBasis fareBasis;
    @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<Carrier> carrier;
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<AccountCode> accountCode;
    @XmlElement(name = "ContractCode")
    protected ContractCode contractCode;
    @XmlElement(name = "AirFareDisplayModifiers")
    protected AirFareDisplayModifiers airFareDisplayModifiers;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<PointOfSale> pointOfSale;
    @XmlElement(name = "AirFareDisplayRuleKey")
    protected AirFareDisplayRuleKey airFareDisplayRuleKey;
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "IncludeMileRouteInformation")
    protected TypeMileOrRouteBasedFare includeMileRouteInformation;
    @XmlAttribute(name = "UnSaleableFaresOnly")
    protected Boolean unSaleableFaresOnly;
    @XmlAttribute(name = "ChannelId")
    protected String channelId;
    @XmlAttribute(name = "NSCC")
    protected String nscc;
    @XmlAttribute(name = "ReturnMM")
    protected Boolean returnMM;

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the fareType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareType }
     * 
     * 
     */
    public List<FareType> getFareType() {
        if (fareType == null) {
            fareType = new ArrayList<FareType>();
        }
        return this.fareType;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePassengerType }
     * 
     * 
     */
    public List<TypePassengerType> getPassengerType() {
        if (passengerType == null) {
            passengerType = new ArrayList<TypePassengerType>();
        }
        return this.passengerType;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the bookingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingCode }
     * 
     * 
     */
    public List<BookingCode> getBookingCode() {
        if (bookingCode == null) {
            bookingCode = new ArrayList<BookingCode>();
        }
        return this.bookingCode;
    }

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link IncludeAddlBookingCodeInfo }
     *     
     */
    public IncludeAddlBookingCodeInfo getIncludeAddlBookingCodeInfo() {
        return includeAddlBookingCodeInfo;
    }

    /**
     * Sets the value of the includeAddlBookingCodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeAddlBookingCodeInfo }
     *     
     */
    public void setIncludeAddlBookingCodeInfo(IncludeAddlBookingCodeInfo value) {
        this.includeAddlBookingCodeInfo = value;
    }

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link FareBasis }
     *     
     */
    public FareBasis getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareBasis }
     *     
     */
    public void setFareBasis(FareBasis value) {
        this.fareBasis = value;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the carrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Carrier }
     * 
     * 
     */
    public List<Carrier> getCarrier() {
        if (carrier == null) {
            carrier = new ArrayList<Carrier>();
        }
        return this.carrier;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the accountCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCode }
     * 
     * 
     */
    public List<AccountCode> getAccountCode() {
        if (accountCode == null) {
            accountCode = new ArrayList<AccountCode>();
        }
        return this.accountCode;
    }

    /**
     * Provider: 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link ContractCode }
     *     
     */
    public ContractCode getContractCode() {
        return contractCode;
    }

    /**
     * Sets the value of the contractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCode }
     *     
     */
    public void setContractCode(ContractCode value) {
        this.contractCode = value;
    }

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayModifiers }
     *     
     */
    public AirFareDisplayModifiers getAirFareDisplayModifiers() {
        return airFareDisplayModifiers;
    }

    /**
     * Sets the value of the airFareDisplayModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayModifiers }
     *     
     */
    public void setAirFareDisplayModifiers(AirFareDisplayModifiers value) {
        this.airFareDisplayModifiers = value;
    }

    /**
     * Provider: 1G,1V.Gets the value of the pointOfSale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfSale }
     * 
     * 
     */
    public List<PointOfSale> getPointOfSale() {
        if (pointOfSale == null) {
            pointOfSale = new ArrayList<PointOfSale>();
        }
        return this.pointOfSale;
    }

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public AirFareDisplayRuleKey getAirFareDisplayRuleKey() {
        return airFareDisplayRuleKey;
    }

    /**
     * Sets the value of the airFareDisplayRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public void setAirFareDisplayRuleKey(AirFareDisplayRuleKey value) {
        this.airFareDisplayRuleKey = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
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
     * Gets the value of the includeMileRouteInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     */
    public TypeMileOrRouteBasedFare getIncludeMileRouteInformation() {
        return includeMileRouteInformation;
    }

    /**
     * Sets the value of the includeMileRouteInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     */
    public void setIncludeMileRouteInformation(TypeMileOrRouteBasedFare value) {
        this.includeMileRouteInformation = value;
    }

    /**
     * Gets the value of the unSaleableFaresOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnSaleableFaresOnly() {
        return unSaleableFaresOnly;
    }

    /**
     * Sets the value of the unSaleableFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnSaleableFaresOnly(Boolean value) {
        this.unSaleableFaresOnly = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the nscc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSCC() {
        return nscc;
    }

    /**
     * Sets the value of the nscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSCC(String value) {
        this.nscc = value;
    }

    /**
     * Gets the value of the returnMM property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnMM() {
        if (returnMM == null) {
            return false;
        } else {
            return returnMM;
        }
    }

    /**
     * Sets the value of the returnMM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnMM(Boolean value) {
        this.returnMM = value;
    }

}
