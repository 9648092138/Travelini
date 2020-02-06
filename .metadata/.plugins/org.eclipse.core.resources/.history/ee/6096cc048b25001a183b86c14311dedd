
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProviderReservationSpecificInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeProviderReservationSpecificInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}OperatedBy" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ProviderReservationInfoRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ProviderReservationLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReservationLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeProviderReservationSpecificInfo", propOrder = {
    "operatedBy",
    "providerReservationInfoRef"
})
public class TypeProviderReservationSpecificInfo {

    @XmlElement(name = "OperatedBy")
    protected List<OperatedBy> operatedBy;
    @XmlElement(name = "ProviderReservationInfoRef")
    protected ProviderReservationInfoRef providerReservationInfoRef;
    @XmlAttribute(name = "ProviderReservationLevel")
    protected Boolean providerReservationLevel;
    @XmlAttribute(name = "ReservationLevel")
    protected Boolean reservationLevel;

    /**
     * Cross accrual carrier info Gets the value of the operatedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatedBy }
     * 
     * 
     */
    public List<OperatedBy> getOperatedBy() {
        if (operatedBy == null) {
            operatedBy = new ArrayList<OperatedBy>();
        }
        return this.operatedBy;
    }

    /**
     * Tagging provider reservation info with LoyaltyCard.
     * 
     * @return
     *     possible object is
     *     {@link ProviderReservationInfoRef }
     *     
     */
    public ProviderReservationInfoRef getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderReservationInfoRef }
     *     
     */
    public void setProviderReservationInfoRef(ProviderReservationInfoRef value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the providerReservationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProviderReservationLevel() {
        return providerReservationLevel;
    }

    /**
     * Sets the value of the providerReservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProviderReservationLevel(Boolean value) {
        this.providerReservationLevel = value;
    }

    /**
     * Gets the value of the reservationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservationLevel() {
        return reservationLevel;
    }

    /**
     * Sets the value of the reservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReservationLevel(Boolean value) {
        this.reservationLevel = value;
    }

}
