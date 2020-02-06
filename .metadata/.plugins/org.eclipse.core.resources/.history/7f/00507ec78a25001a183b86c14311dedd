
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.FormOfPayment;
import com.travelport.schema.common_v45_0.FormOfPaymentRef;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirPricingSolution"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}FormOfPayment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}FormOfPaymentRef" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airPricingSolution",
    "formOfPayment",
    "formOfPaymentRef"
})
@XmlRootElement(name = "OptionalServicesInfo")
public class OptionalServicesInfo {

    @XmlElement(name = "AirPricingSolution", required = true)
    protected AirPricingSolution airPricingSolution;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<FormOfPayment> formOfPayment;
    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<FormOfPaymentRef> formOfPaymentRef;

    /**
     * Gets the value of the airPricingSolution property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingSolution }
     *     
     */
    public AirPricingSolution getAirPricingSolution() {
        return airPricingSolution;
    }

    /**
     * Sets the value of the airPricingSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingSolution }
     *     
     */
    public void setAirPricingSolution(AirPricingSolution value) {
        this.airPricingSolution = value;
    }

    /**
     * Gets the value of the formOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * 
     * 
     */
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<FormOfPayment>();
        }
        return this.formOfPayment;
    }

    /**
     * Gets the value of the formOfPaymentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPaymentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPaymentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPaymentRef }
     * 
     * 
     */
    public List<FormOfPaymentRef> getFormOfPaymentRef() {
        if (formOfPaymentRef == null) {
            formOfPaymentRef = new ArrayList<FormOfPaymentRef>();
        }
        return this.formOfPaymentRef;
    }

}
