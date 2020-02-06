
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.HostToken;
import com.travelport.schema.common_v45_0.TypeFeeInfo;
import com.travelport.schema.common_v45_0.TypeTaxInfo;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirRefundInfo"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}WaiverCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirSegment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FeeInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TaxInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}HostToken" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TCRNumber" use="required" type="{http://www.travelport.com/schema/air_v45_0}typeTCRNumber" /&gt;
 *       &lt;attribute name="RefundType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Auto"/&gt;
 *             &lt;enumeration value="Manual"/&gt;
 *             &lt;enumeration value="Ignored"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute ref="{http://www.travelport.com/schema/air_v45_0}RefundAccessCode"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airRefundInfo",
    "waiverCode",
    "airSegment",
    "feeInfo",
    "taxInfo",
    "hostToken"
})
@XmlRootElement(name = "TCRRefundBundle")
public class TCRRefundBundle {

    @XmlElement(name = "AirRefundInfo", required = true)
    protected AirRefundInfo airRefundInfo;
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    @XmlElement(name = "AirSegment")
    protected List<TypeBaseAirSegment> airSegment;
    @XmlElement(name = "FeeInfo")
    protected List<TypeFeeInfo> feeInfo;
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<HostToken> hostToken;
    @XmlAttribute(name = "TCRNumber", required = true)
    protected String tcrNumber;
    @XmlAttribute(name = "RefundType", required = true)
    protected String refundType;
    @XmlAttribute(name = "RefundAccessCode", namespace = "http://www.travelport.com/schema/air_v45_0")
    protected String refundAccessCode;

    /**
     * Gets the value of the airRefundInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirRefundInfo }
     *     
     */
    public AirRefundInfo getAirRefundInfo() {
        return airRefundInfo;
    }

    /**
     * Sets the value of the airRefundInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRefundInfo }
     *     
     */
    public void setAirRefundInfo(AirRefundInfo value) {
        this.airRefundInfo = value;
    }

    /**
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link WaiverCode }
     *     
     */
    public WaiverCode getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverCode }
     *     
     */
    public void setWaiverCode(WaiverCode value) {
        this.waiverCode = value;
    }

    /**
     * Gets the value of the airSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseAirSegment }
     * 
     * 
     */
    public List<TypeBaseAirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<TypeBaseAirSegment>();
        }
        return this.airSegment;
    }

    /**
     * Gets the value of the feeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFeeInfo }
     * 
     * 
     */
    public List<TypeFeeInfo> getFeeInfo() {
        if (feeInfo == null) {
            feeInfo = new ArrayList<TypeFeeInfo>();
        }
        return this.feeInfo;
    }

    /**
     * Itinerary level taxes Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * 
     * 
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfo>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the hostToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * 
     * 
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<HostToken>();
        }
        return this.hostToken;
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
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundType(String value) {
        this.refundType = value;
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

}
