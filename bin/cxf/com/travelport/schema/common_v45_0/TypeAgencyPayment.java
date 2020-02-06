
package com.travelport.schema.common_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Agency Payment.
 * 
 * <p>Java class for typeAgencyPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAgencyPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AgencyBillingIdentifier" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="128"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AgencyBillingNumber"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="128"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AgencyBillingPassword"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="128"/&gt;
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
@XmlType(name = "typeAgencyPayment")
public class TypeAgencyPayment {

    @XmlAttribute(name = "AgencyBillingIdentifier", required = true)
    protected String agencyBillingIdentifier;
    @XmlAttribute(name = "AgencyBillingNumber")
    protected String agencyBillingNumber;
    @XmlAttribute(name = "AgencyBillingPassword")
    protected String agencyBillingPassword;

    /**
     * Gets the value of the agencyBillingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBillingIdentifier() {
        return agencyBillingIdentifier;
    }

    /**
     * Sets the value of the agencyBillingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyBillingIdentifier(String value) {
        this.agencyBillingIdentifier = value;
    }

    /**
     * Gets the value of the agencyBillingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBillingNumber() {
        return agencyBillingNumber;
    }

    /**
     * Sets the value of the agencyBillingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyBillingNumber(String value) {
        this.agencyBillingNumber = value;
    }

    /**
     * Gets the value of the agencyBillingPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBillingPassword() {
        return agencyBillingPassword;
    }

    /**
     * Sets the value of the agencyBillingPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyBillingPassword(String value) {
        this.agencyBillingPassword = value;
    }

}
