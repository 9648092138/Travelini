
package com.travelport.schema.hotel_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseAsyncProviderSpecificResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/hotel_v45_0}BaseHotelSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}AsyncProviderSpecificResponse" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SearchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asyncProviderSpecificResponse"
})
@XmlRootElement(name = "HotelSearchAvailabilityAsynchRsp")
public class HotelSearchAvailabilityAsynchRsp
    extends BaseHotelSearchRsp
{

    @XmlElement(name = "AsyncProviderSpecificResponse")
    protected List<BaseAsyncProviderSpecificResponse> asyncProviderSpecificResponse;
    @XmlAttribute(name = "SearchId", required = true)
    protected String searchId;

    /**
     * Identifies pending responses from a specific provider using MoreResults attribute Gets the value of the asyncProviderSpecificResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asyncProviderSpecificResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsyncProviderSpecificResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseAsyncProviderSpecificResponse }
     * 
     * 
     */
    public List<BaseAsyncProviderSpecificResponse> getAsyncProviderSpecificResponse() {
        if (asyncProviderSpecificResponse == null) {
            asyncProviderSpecificResponse = new ArrayList<BaseAsyncProviderSpecificResponse>();
        }
        return this.asyncProviderSpecificResponse;
    }

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }

}
