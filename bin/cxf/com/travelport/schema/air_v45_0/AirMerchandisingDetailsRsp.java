
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseRsp;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}OptionalServices" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Brand" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="UnassociatedBookingCodeList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ApplicableSegment" type="{http://www.travelport.com/schema/air_v45_0}typeApplicableSegment" maxOccurs="99" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "optionalServices",
    "brand",
    "unassociatedBookingCodeList"
})
@XmlRootElement(name = "AirMerchandisingDetailsRsp")
public class AirMerchandisingDetailsRsp
    extends BaseRsp
{

    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    @XmlElement(name = "Brand")
    protected List<Brand> brand;
    @XmlElement(name = "UnassociatedBookingCodeList")
    protected AirMerchandisingDetailsRsp.UnassociatedBookingCodeList unassociatedBookingCodeList;

    /**
     * Gets the value of the optionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Brand }
     * 
     * 
     */
    public List<Brand> getBrand() {
        if (brand == null) {
            brand = new ArrayList<Brand>();
        }
        return this.brand;
    }

    /**
     * Gets the value of the unassociatedBookingCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link AirMerchandisingDetailsRsp.UnassociatedBookingCodeList }
     *     
     */
    public AirMerchandisingDetailsRsp.UnassociatedBookingCodeList getUnassociatedBookingCodeList() {
        return unassociatedBookingCodeList;
    }

    /**
     * Sets the value of the unassociatedBookingCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirMerchandisingDetailsRsp.UnassociatedBookingCodeList }
     *     
     */
    public void setUnassociatedBookingCodeList(AirMerchandisingDetailsRsp.UnassociatedBookingCodeList value) {
        this.unassociatedBookingCodeList = value;
    }


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
     *         &lt;element name="ApplicableSegment" type="{http://www.travelport.com/schema/air_v45_0}typeApplicableSegment" maxOccurs="99" minOccurs="0"/&gt;
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
        "applicableSegment"
    })
    public static class UnassociatedBookingCodeList {

        @XmlElement(name = "ApplicableSegment")
        protected List<TypeApplicableSegment> applicableSegment;

        /**
         * Gets the value of the applicableSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicableSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplicableSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeApplicableSegment }
         * 
         * 
         */
        public List<TypeApplicableSegment> getApplicableSegment() {
            if (applicableSegment == null) {
                applicableSegment = new ArrayList<TypeApplicableSegment>();
            }
            return this.applicableSegment;
        }

    }

}
