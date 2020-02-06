
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.Name;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Name" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TaxInfo" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}WaiverCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PTC" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="RefundType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Auto"/&gt;
 *             &lt;enumeration value="Manual"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
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
    "name",
    "taxInfo",
    "waiverCode"
})
@XmlRootElement(name = "AirRefundBundle")
public class AirRefundBundle {

    @XmlElement(name = "AirRefundInfo", required = true)
    protected AirRefundInfo airRefundInfo;
    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<Name> name;
    @XmlElement(name = "TaxInfo", required = true)
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    @XmlAttribute(name = "TicketNumber")
    protected String ticketNumber;
    @XmlAttribute(name = "PTC")
    @XmlSchemaType(name = "anySimpleType")
    protected String ptc;
    @XmlAttribute(name = "RefundType")
    protected String refundType;

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
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getName() {
        if (name == null) {
            name = new ArrayList<Name>();
        }
        return this.name;
    }

    /**
     * Gets the value of the taxInfo property.
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
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTC(String value) {
        this.ptc = value;
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

}
