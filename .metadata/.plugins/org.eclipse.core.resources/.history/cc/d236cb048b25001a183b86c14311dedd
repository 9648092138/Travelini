
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="SegmentRef" type="{http://www.travelport.com/schema/common_v45_0}typeGeneralReference" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SupplierCode" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *       &lt;attribute name="SupplierLocatorCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "segmentRef"
})
@XmlRootElement(name = "SupplierLocator")
public class SupplierLocator {

    @XmlElement(name = "SegmentRef")
    protected List<TypeGeneralReference> segmentRef;
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;
    @XmlAttribute(name = "SupplierLocatorCode", required = true)
    protected String supplierLocatorCode;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;

    /**
     * Gets the value of the segmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGeneralReference }
     * 
     * 
     */
    public List<TypeGeneralReference> getSegmentRef() {
        if (segmentRef == null) {
            segmentRef = new ArrayList<TypeGeneralReference>();
        }
        return this.segmentRef;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the supplierLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierLocatorCode() {
        return supplierLocatorCode;
    }

    /**
     * Sets the value of the supplierLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierLocatorCode(String value) {
        this.supplierLocatorCode = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

}
