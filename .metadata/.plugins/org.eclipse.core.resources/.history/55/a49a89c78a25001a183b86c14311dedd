
package com.travelport.schema.hotel_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseSearchRsp;
import com.travelport.schema.common_v45_0.VendorLocation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}VendorLocation" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}CurrencyRateConversion" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelSuperShopperResults" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}QuickResponse" minOccurs="0"/&gt;
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
    "vendorLocation",
    "currencyRateConversion",
    "hotelSuperShopperResults",
    "quickResponse"
})
@XmlRootElement(name = "HotelSuperShopperRsp")
public class HotelSuperShopperRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "VendorLocation", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<VendorLocation> vendorLocation;
    @XmlElement(name = "CurrencyRateConversion")
    protected List<CurrencyRateConversion> currencyRateConversion;
    @XmlElement(name = "HotelSuperShopperResults")
    protected List<HotelSuperShopperResults> hotelSuperShopperResults;
    @XmlElement(name = "QuickResponse")
    protected QuickResponse quickResponse;

    /**
     * Gets the value of the vendorLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorLocation }
     * 
     * 
     */
    public List<VendorLocation> getVendorLocation() {
        if (vendorLocation == null) {
            vendorLocation = new ArrayList<VendorLocation>();
        }
        return this.vendorLocation;
    }

    /**
     * Gets the value of the currencyRateConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyRateConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyRateConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyRateConversion }
     * 
     * 
     */
    public List<CurrencyRateConversion> getCurrencyRateConversion() {
        if (currencyRateConversion == null) {
            currencyRateConversion = new ArrayList<CurrencyRateConversion>();
        }
        return this.currencyRateConversion;
    }

    /**
     * Gets the value of the hotelSuperShopperResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelSuperShopperResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelSuperShopperResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSuperShopperResults }
     * 
     * 
     */
    public List<HotelSuperShopperResults> getHotelSuperShopperResults() {
        if (hotelSuperShopperResults == null) {
            hotelSuperShopperResults = new ArrayList<HotelSuperShopperResults>();
        }
        return this.hotelSuperShopperResults;
    }

    /**
     * Gets the value of the quickResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QuickResponse }
     *     
     */
    public QuickResponse getQuickResponse() {
        return quickResponse;
    }

    /**
     * Sets the value of the quickResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickResponse }
     *     
     */
    public void setQuickResponse(QuickResponse value) {
        this.quickResponse = value;
    }

}
