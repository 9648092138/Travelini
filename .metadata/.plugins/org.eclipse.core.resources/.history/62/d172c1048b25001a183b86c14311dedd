
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Title" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Text" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ImageLocation" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}OptionalServices" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Rules" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ServiceAssociations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}UpsellBrand" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableSegment" type="{http://www.travelport.com/schema/air_v45_0}typeApplicableSegment" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}DefaultBrandDetail" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="BrandID" type="{http://www.travelport.com/schema/air_v45_0}typeBrandId" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AirItineraryDetailsRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="UpSellBrandID" type="{http://www.travelport.com/schema/air_v45_0}typeBrandId" /&gt;
 *       &lt;attribute name="BrandFound" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UpSellBrandFound" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BrandedDetailsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Carrier" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *       &lt;attribute name="BrandTier" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to10" /&gt;
 *       &lt;attribute name="BrandMaintained" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to99" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "text",
    "imageLocation",
    "optionalServices",
    "rules",
    "serviceAssociations",
    "upsellBrand",
    "applicableSegment",
    "defaultBrandDetail"
})
@XmlRootElement(name = "Brand")
public class Brand {

    @XmlElement(name = "Title")
    protected List<TypeTextElement> title;
    @XmlElement(name = "Text")
    protected List<TypeTextElement> text;
    @XmlElement(name = "ImageLocation")
    protected List<ImageLocation> imageLocation;
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    @XmlElement(name = "Rules")
    protected List<Rules> rules;
    @XmlElement(name = "ServiceAssociations")
    protected ServiceAssociations serviceAssociations;
    @XmlElement(name = "UpsellBrand")
    protected UpsellBrand upsellBrand;
    @XmlElement(name = "ApplicableSegment")
    protected List<TypeApplicableSegment> applicableSegment;
    @XmlElement(name = "DefaultBrandDetail")
    protected List<TypeDefaultBrandDetail> defaultBrandDetail;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "BrandID")
    protected String brandID;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "AirItineraryDetailsRef")
    protected String airItineraryDetailsRef;
    @XmlAttribute(name = "UpSellBrandID")
    protected String upSellBrandID;
    @XmlAttribute(name = "BrandFound")
    protected Boolean brandFound;
    @XmlAttribute(name = "UpSellBrandFound")
    protected Boolean upSellBrandFound;
    @XmlAttribute(name = "BrandedDetailsAvailable")
    protected Boolean brandedDetailsAvailable;
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    @XmlAttribute(name = "BrandTier")
    protected String brandTier;
    @XmlAttribute(name = "BrandMaintained")
    protected String brandMaintained;

    /**
     * The additional titles associated to the brand Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * 
     * 
     */
    public List<TypeTextElement> getTitle() {
        if (title == null) {
            title = new ArrayList<TypeTextElement>();
        }
        return this.title;
    }

    /**
     * Text associated to the brand Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * 
     * 
     */
    public List<TypeTextElement> getText() {
        if (text == null) {
            text = new ArrayList<TypeTextElement>();
        }
        return this.text;
    }

    /**
     * Images associated to the brand Gets the value of the imageLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageLocation }
     * 
     * 
     */
    public List<ImageLocation> getImageLocation() {
        if (imageLocation == null) {
            imageLocation = new ArrayList<ImageLocation>();
        }
        return this.imageLocation;
    }

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
     * Brand rules Gets the value of the rules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rules }
     * 
     * 
     */
    public List<Rules> getRules() {
        if (rules == null) {
            rules = new ArrayList<Rules>();
        }
        return this.rules;
    }

    /**
     * Service associated with this brand
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssociations }
     *     
     */
    public ServiceAssociations getServiceAssociations() {
        return serviceAssociations;
    }

    /**
     * Sets the value of the serviceAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssociations }
     *     
     */
    public void setServiceAssociations(ServiceAssociations value) {
        this.serviceAssociations = value;
    }

    /**
     * The unique identifier of the Upsell brand
     * 
     * @return
     *     possible object is
     *     {@link UpsellBrand }
     *     
     */
    public UpsellBrand getUpsellBrand() {
        return upsellBrand;
    }

    /**
     * Sets the value of the upsellBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpsellBrand }
     *     
     */
    public void setUpsellBrand(UpsellBrand value) {
        this.upsellBrand = value;
    }

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

    /**
     * Default brand details.Gets the value of the defaultBrandDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultBrandDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultBrandDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDefaultBrandDetail }
     * 
     * 
     */
    public List<TypeDefaultBrandDetail> getDefaultBrandDetail() {
        if (defaultBrandDetail == null) {
            defaultBrandDetail = new ArrayList<TypeDefaultBrandDetail>();
        }
        return this.defaultBrandDetail;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandID(String value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the airItineraryDetailsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirItineraryDetailsRef() {
        return airItineraryDetailsRef;
    }

    /**
     * Sets the value of the airItineraryDetailsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirItineraryDetailsRef(String value) {
        this.airItineraryDetailsRef = value;
    }

    /**
     * Gets the value of the upSellBrandID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpSellBrandID() {
        return upSellBrandID;
    }

    /**
     * Sets the value of the upSellBrandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpSellBrandID(String value) {
        this.upSellBrandID = value;
    }

    /**
     * Gets the value of the brandFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrandFound() {
        return brandFound;
    }

    /**
     * Sets the value of the brandFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrandFound(Boolean value) {
        this.brandFound = value;
    }

    /**
     * Gets the value of the upSellBrandFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpSellBrandFound() {
        return upSellBrandFound;
    }

    /**
     * Sets the value of the upSellBrandFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpSellBrandFound(Boolean value) {
        this.upSellBrandFound = value;
    }

    /**
     * Gets the value of the brandedDetailsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrandedDetailsAvailable() {
        return brandedDetailsAvailable;
    }

    /**
     * Sets the value of the brandedDetailsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrandedDetailsAvailable(Boolean value) {
        this.brandedDetailsAvailable = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the brandTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandTier() {
        return brandTier;
    }

    /**
     * Sets the value of the brandTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandTier(String value) {
        this.brandTier = value;
    }

    /**
     * Gets the value of the brandMaintained property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandMaintained() {
        return brandMaintained;
    }

    /**
     * Sets the value of the brandMaintained property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandMaintained(String value) {
        this.brandMaintained = value;
    }

}
