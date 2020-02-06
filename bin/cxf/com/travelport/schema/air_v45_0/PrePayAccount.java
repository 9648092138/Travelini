
package com.travelport.schema.air_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}CreditSummary" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PrePayPriceInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ProgramTitle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditSummary",
    "prePayPriceInfo"
})
@XmlRootElement(name = "PrePayAccount")
public class PrePayAccount {

    @XmlElement(name = "CreditSummary")
    protected CreditSummary creditSummary;
    @XmlElement(name = "PrePayPriceInfo")
    protected PrePayPriceInfo prePayPriceInfo;
    @XmlAttribute(name = "ProgramTitle")
    protected String programTitle;
    @XmlAttribute(name = "CertificateNumber")
    protected String certificateNumber;
    @XmlAttribute(name = "ProgramName")
    protected String programName;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * Gets the value of the creditSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSummary }
     *     
     */
    public CreditSummary getCreditSummary() {
        return creditSummary;
    }

    /**
     * Sets the value of the creditSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSummary }
     *     
     */
    public void setCreditSummary(CreditSummary value) {
        this.creditSummary = value;
    }

    /**
     * Gets the value of the prePayPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrePayPriceInfo }
     *     
     */
    public PrePayPriceInfo getPrePayPriceInfo() {
        return prePayPriceInfo;
    }

    /**
     * Sets the value of the prePayPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayPriceInfo }
     *     
     */
    public void setPrePayPriceInfo(PrePayPriceInfo value) {
        this.prePayPriceInfo = value;
    }

    /**
     * Gets the value of the programTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramTitle() {
        return programTitle;
    }

    /**
     * Sets the value of the programTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramTitle(String value) {
        this.programTitle = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

}
