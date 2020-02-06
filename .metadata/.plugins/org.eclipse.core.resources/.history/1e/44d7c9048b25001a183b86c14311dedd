
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MCOInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCOInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PassengerInfo" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MCONumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MCOType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCOInformation", propOrder = {
    "passengerInfo"
})
@XmlSeeAlso({
    MCO.class
})
public class MCOInformation {

    @XmlElement(name = "PassengerInfo")
    protected List<PassengerInfo> passengerInfo;
    @XmlAttribute(name = "MCONumber")
    protected String mcoNumber;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "MCOType")
    protected String mcoType;

    /**
     * Gets the value of the passengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInfo }
     * 
     * 
     */
    public List<PassengerInfo> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<PassengerInfo>();
        }
        return this.passengerInfo;
    }

    /**
     * Gets the value of the mcoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCONumber() {
        return mcoNumber;
    }

    /**
     * Sets the value of the mcoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCONumber(String value) {
        this.mcoNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the mcoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOType() {
        return mcoType;
    }

    /**
     * Sets the value of the mcoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCOType(String value) {
        this.mcoType = value;
    }

}
