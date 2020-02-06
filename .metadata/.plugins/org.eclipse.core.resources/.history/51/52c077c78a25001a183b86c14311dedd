
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseReq;
import com.travelport.schema.common_v45_0.Commission;
import com.travelport.schema.common_v45_0.FormOfPayment;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirRefundBundle" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TCRRefundBundle" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirRefundModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Commission" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}FormOfPayment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airRefundBundle",
    "tcrRefundBundle",
    "airRefundModifiers",
    "commission",
    "formOfPayment"
})
@XmlRootElement(name = "AirRefundReq")
public class AirRefundReq
    extends BaseReq
{

    @XmlElement(name = "AirRefundBundle")
    protected List<AirRefundBundle> airRefundBundle;
    @XmlElement(name = "TCRRefundBundle")
    protected List<TCRRefundBundle> tcrRefundBundle;
    @XmlElement(name = "AirRefundModifiers")
    protected AirRefundModifiers airRefundModifiers;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<Commission> commission;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected FormOfPayment formOfPayment;

    /**
     * Provider: ACH.Gets the value of the airRefundBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airRefundBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirRefundBundle }
     * 
     * 
     */
    public List<AirRefundBundle> getAirRefundBundle() {
        if (airRefundBundle == null) {
            airRefundBundle = new ArrayList<AirRefundBundle>();
        }
        return this.airRefundBundle;
    }

    /**
     * Provider: ACH.Gets the value of the tcrRefundBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrRefundBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCRRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRRefundBundle }
     * 
     * 
     */
    public List<TCRRefundBundle> getTCRRefundBundle() {
        if (tcrRefundBundle == null) {
            tcrRefundBundle = new ArrayList<TCRRefundBundle>();
        }
        return this.tcrRefundBundle;
    }

    /**
     * Gets the value of the airRefundModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AirRefundModifiers }
     *     
     */
    public AirRefundModifiers getAirRefundModifiers() {
        return airRefundModifiers;
    }

    /**
     * Sets the value of the airRefundModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRefundModifiers }
     *     
     */
    public void setAirRefundModifiers(AirRefundModifiers value) {
        this.airRefundModifiers = value;
    }

    /**
     * Provider: ACH.Gets the value of the commission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission }
     * 
     * 
     */
    public List<Commission> getCommission() {
        if (commission == null) {
            commission = new ArrayList<Commission>();
        }
        return this.commission;
    }

    /**
     * Provider: ACH-Form of Payment for any Additional Collection charges for the Refund.
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

}
