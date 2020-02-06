
package com.travelport.schema.common_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Information pertaining to the payment of type Guarantee.
 * 
 * <p>Java class for typeGuaranteeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeGuaranteeInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Guarantee"/&gt;
 *             &lt;enumeration value="Deposit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AgencyType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="AgencyIATA"/&gt;
 *             &lt;enumeration value="OtherAgencyIATA"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="IATANumber" use="required" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to128" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeGuaranteeInformation")
public class TypeGuaranteeInformation {

    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "AgencyType", required = true)
    protected String agencyType;
    @XmlAttribute(name = "IATANumber", required = true)
    protected String iataNumber;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the agencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyType() {
        return agencyType;
    }

    /**
     * Sets the value of the agencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyType(String value) {
        this.agencyType = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
    }

}
