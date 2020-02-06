
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.PhoneNumber;
import com.travelport.schema.common_v45_0.Remark;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PhoneNumber"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TermConditions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Remark" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IncludeCoverSheet" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DeptBillingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "phoneNumber",
    "termConditions",
    "remark"
})
@XmlRootElement(name = "FaxDetails")
public class FaxDetails {

    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v45_0", required = true)
    protected PhoneNumber phoneNumber;
    @XmlElement(name = "TermConditions")
    protected TermConditions termConditions;
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<Remark> remark;
    @XmlAttribute(name = "IncludeCoverSheet")
    protected Boolean includeCoverSheet;
    @XmlAttribute(name = "To")
    protected String to;
    @XmlAttribute(name = "From")
    protected String from;
    @XmlAttribute(name = "DeptBillingCode")
    protected String deptBillingCode;
    @XmlAttribute(name = "InvoiceNumber")
    protected String invoiceNumber;

    /**
     * Send type as Fax for fax number.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumber }
     *     
     */
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumber }
     *     
     */
    public void setPhoneNumber(PhoneNumber value) {
        this.phoneNumber = value;
    }

    /**
     * Term and Conditions for the fax .
     * 
     * @return
     *     possible object is
     *     {@link TermConditions }
     *     
     */
    public TermConditions getTermConditions() {
        return termConditions;
    }

    /**
     * Sets the value of the termConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermConditions }
     *     
     */
    public void setTermConditions(TermConditions value) {
        this.termConditions = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remark }
     * 
     * 
     */
    public List<Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<Remark>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the includeCoverSheet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCoverSheet() {
        return includeCoverSheet;
    }

    /**
     * Sets the value of the includeCoverSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCoverSheet(Boolean value) {
        this.includeCoverSheet = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the deptBillingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptBillingCode() {
        return deptBillingCode;
    }

    /**
     * Sets the value of the deptBillingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptBillingCode(String value) {
        this.deptBillingCode = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

}
