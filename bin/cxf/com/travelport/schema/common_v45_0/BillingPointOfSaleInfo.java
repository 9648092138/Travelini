
package com.travelport.schema.common_v45_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="OriginApplication" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CIDBNumber"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;pattern value="\d{10}"/&gt;
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
@XmlType(name = "")
@XmlRootElement(name = "BillingPointOfSaleInfo")
public class BillingPointOfSaleInfo {

    @XmlAttribute(name = "OriginApplication", required = true)
    protected String originApplication;
    @XmlAttribute(name = "CIDBNumber")
    protected BigInteger cidbNumber;

    /**
     * Gets the value of the originApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginApplication() {
        return originApplication;
    }

    /**
     * Sets the value of the originApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginApplication(String value) {
        this.originApplication = value;
    }

    /**
     * Gets the value of the cidbNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCIDBNumber() {
        return cidbNumber;
    }

    /**
     * Sets the value of the cidbNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCIDBNumber(BigInteger value) {
        this.cidbNumber = value;
    }

}
