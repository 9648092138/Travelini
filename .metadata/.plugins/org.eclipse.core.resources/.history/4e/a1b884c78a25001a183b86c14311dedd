
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}FormOfPayment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ExchangedCoupon" maxOccurs="4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OriginalTicketNumber" type="{http://www.travelport.com/schema/common_v45_0}typeTicketNumber" /&gt;
 *       &lt;attribute name="OriginalCityCode" type="{http://www.travelport.com/schema/common_v45_0}typeCity" /&gt;
 *       &lt;attribute name="OriginalTicketDate" type="{http://www.travelport.com/schema/common_v45_0}typeDate" /&gt;
 *       &lt;attribute name="IATACode" type="{http://www.travelport.com/schema/common_v45_0}typeIATA" /&gt;
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
    "exchangedCoupon"
})
@XmlRootElement(name = "MCOExchangeInfo")
public class MCOExchangeInfo {

    @XmlElement(name = "FormOfPayment")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "ExchangedCoupon")
    protected List<ExchangedCoupon> exchangedCoupon;
    @XmlAttribute(name = "OriginalTicketNumber")
    protected String originalTicketNumber;
    @XmlAttribute(name = "OriginalCityCode")
    protected String originalCityCode;
    @XmlAttribute(name = "OriginalTicketDate")
    protected XMLGregorianCalendar originalTicketDate;
    @XmlAttribute(name = "IATACode")
    protected String iataCode;

    /**
     * Gets the value of the formOfPayment property.
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
     * Gets the value of the exchangedCoupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangedCoupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangedCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangedCoupon }
     * 
     * 
     */
    public List<ExchangedCoupon> getExchangedCoupon() {
        if (exchangedCoupon == null) {
            exchangedCoupon = new ArrayList<ExchangedCoupon>();
        }
        return this.exchangedCoupon;
    }

    /**
     * Gets the value of the originalTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTicketNumber() {
        return originalTicketNumber;
    }

    /**
     * Sets the value of the originalTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTicketNumber(String value) {
        this.originalTicketNumber = value;
    }

    /**
     * Gets the value of the originalCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCityCode() {
        return originalCityCode;
    }

    /**
     * Sets the value of the originalCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCityCode(String value) {
        this.originalCityCode = value;
    }

    /**
     * Gets the value of the originalTicketDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTicketDate() {
        return originalTicketDate;
    }

    /**
     * Sets the value of the originalTicketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalTicketDate(XMLGregorianCalendar value) {
        this.originalTicketDate = value;
    }

    /**
     * Gets the value of the iataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATACode() {
        return iataCode;
    }

    /**
     * Sets the value of the iataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATACode(String value) {
        this.iataCode = value;
    }

}
