
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDefaultBrandDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeDefaultBrandDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Text" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ImageLocation" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ApplicableSegment" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BrandID" type="{http://www.travelport.com/schema/air_v45_0}typeBrandId" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeDefaultBrandDetail", propOrder = {
    "text",
    "imageLocation",
    "applicableSegment"
})
public class TypeDefaultBrandDetail {

    @XmlElement(name = "Text")
    protected List<TypeTextElement> text;
    @XmlElement(name = "ImageLocation")
    protected List<ImageLocation> imageLocation;
    @XmlElement(name = "ApplicableSegment")
    protected List<TypeApplicableSegment> applicableSegment;
    @XmlAttribute(name = "BrandID")
    protected String brandID;

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
     * Defines for which air segment the brand is applicable.Gets the value of the applicableSegment property.
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

}
