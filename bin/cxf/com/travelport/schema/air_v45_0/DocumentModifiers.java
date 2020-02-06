
package com.travelport.schema.air_v45_0;

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
 *       &lt;attribute name="GenerateItineraryInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="GenerateAccountingInterface" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DocumentModifiers")
public class DocumentModifiers {

    @XmlAttribute(name = "GenerateItineraryInvoice")
    protected Boolean generateItineraryInvoice;
    @XmlAttribute(name = "GenerateAccountingInterface")
    protected Boolean generateAccountingInterface;

    /**
     * Gets the value of the generateItineraryInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGenerateItineraryInvoice() {
        if (generateItineraryInvoice == null) {
            return false;
        } else {
            return generateItineraryInvoice;
        }
    }

    /**
     * Sets the value of the generateItineraryInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateItineraryInvoice(Boolean value) {
        this.generateItineraryInvoice = value;
    }

    /**
     * Gets the value of the generateAccountingInterface property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGenerateAccountingInterface() {
        if (generateAccountingInterface == null) {
            return false;
        } else {
            return generateAccountingInterface;
        }
    }

    /**
     * Sets the value of the generateAccountingInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateAccountingInterface(Boolean value) {
        this.generateAccountingInterface = value;
    }

}
