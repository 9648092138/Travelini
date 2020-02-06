
package com.travelport.schema.air_v45_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="SponsoredLNB" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="NeutralLNB" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="FltKey" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="5"/&gt;
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
@XmlRootElement(name = "SponsoredFltInfo")
public class SponsoredFltInfo {

    @XmlAttribute(name = "SponsoredLNB", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sponsoredLNB;
    @XmlAttribute(name = "NeutralLNB", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger neutralLNB;
    @XmlAttribute(name = "FltKey", required = true)
    protected String fltKey;

    /**
     * Gets the value of the sponsoredLNB property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSponsoredLNB() {
        return sponsoredLNB;
    }

    /**
     * Sets the value of the sponsoredLNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSponsoredLNB(BigInteger value) {
        this.sponsoredLNB = value;
    }

    /**
     * Gets the value of the neutralLNB property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNeutralLNB() {
        return neutralLNB;
    }

    /**
     * Sets the value of the neutralLNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNeutralLNB(BigInteger value) {
        this.neutralLNB = value;
    }

    /**
     * Gets the value of the fltKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltKey() {
        return fltKey;
    }

    /**
     * Sets the value of the fltKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltKey(String value) {
        this.fltKey = value;
    }

}
