
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.AccountCode;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirItineraryDetails" maxOccurs="99"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}AccountCode" maxOccurs="10" minOccurs="0"/&gt;
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
    "airItineraryDetails",
    "accountCode"
})
@XmlRootElement(name = "MerchandisingDetails")
public class MerchandisingDetails {

    @XmlElement(name = "AirItineraryDetails", required = true)
    protected List<AirItineraryDetails> airItineraryDetails;
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<AccountCode> accountCode;

    /**
     * Gets the value of the airItineraryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItineraryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirItineraryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItineraryDetails }
     * 
     * 
     */
    public List<AirItineraryDetails> getAirItineraryDetails() {
        if (airItineraryDetails == null) {
            airItineraryDetails = new ArrayList<AirItineraryDetails>();
        }
        return this.airItineraryDetails;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCode }
     * 
     * 
     */
    public List<AccountCode> getAccountCode() {
        if (accountCode == null) {
            accountCode = new ArrayList<AccountCode>();
        }
        return this.accountCode;
    }

}
