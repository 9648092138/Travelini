
package com.travelport.schema.hotel_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseRsp;
import com.travelport.schema.common_v45_0.Keyword;
import com.travelport.schema.common_v45_0.MarketingInformation;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}MarketingInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Keyword" maxOccurs="999" minOccurs="0"/&gt;
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
    "marketingInformation",
    "keyword"
})
@XmlRootElement(name = "HotelKeywordRsp")
public class HotelKeywordRsp
    extends BaseRsp
{

    @XmlElement(name = "MarketingInformation", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected MarketingInformation marketingInformation;
    @XmlElement(name = "Keyword", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<Keyword> keyword;

    /**
     * Gets the value of the marketingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingInformation }
     *     
     */
    public MarketingInformation getMarketingInformation() {
        return marketingInformation;
    }

    /**
     * Sets the value of the marketingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingInformation }
     *     
     */
    public void setMarketingInformation(MarketingInformation value) {
        this.marketingInformation = value;
    }

    /**
     * A word that a vendor uses to describe corporate policy/information.Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keyword }
     * 
     * 
     */
    public List<Keyword> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<Keyword>();
        }
        return this.keyword;
    }

}
