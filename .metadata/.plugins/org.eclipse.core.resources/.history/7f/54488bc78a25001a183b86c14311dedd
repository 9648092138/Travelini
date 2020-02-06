
package com.travelport.schema.rail_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.TypeFlexibleTimeSpec;
import com.travelport.schema.common_v45_0.TypeSearchLocation;
import com.travelport.schema.common_v45_0.TypeTimeSpec;


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
 *         &lt;element name="SearchOrigin" type="{http://www.travelport.com/schema/common_v45_0}typeSearchLocation" maxOccurs="999"/&gt;
 *         &lt;element name="SearchDestination" type="{http://www.travelport.com/schema/common_v45_0}typeSearchLocation" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailSegmentList" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SearchDepTime" type="{http://www.travelport.com/schema/common_v45_0}typeFlexibleTimeSpec" maxOccurs="999"/&gt;
 *           &lt;element name="SearchArvTime" type="{http://www.travelport.com/schema/common_v45_0}typeTimeSpec" maxOccurs="999"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailLegModifiers" minOccurs="0"/&gt;
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
    "searchOrigin",
    "searchDestination",
    "railSegmentList",
    "searchDepTime",
    "searchArvTime",
    "railLegModifiers"
})
@XmlRootElement(name = "SearchRailLeg")
public class SearchRailLeg {

    @XmlElement(name = "SearchOrigin", required = true)
    protected List<TypeSearchLocation> searchOrigin;
    @XmlElement(name = "SearchDestination", required = true)
    protected List<TypeSearchLocation> searchDestination;
    @XmlElement(name = "RailSegmentList")
    protected RailSegmentList railSegmentList;
    @XmlElement(name = "SearchDepTime")
    protected List<TypeFlexibleTimeSpec> searchDepTime;
    @XmlElement(name = "SearchArvTime")
    protected List<TypeTimeSpec> searchArvTime;
    @XmlElement(name = "RailLegModifiers")
    protected RailLegModifiers railLegModifiers;

    /**
     * Gets the value of the searchOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSearchLocation }
     * 
     * 
     */
    public List<TypeSearchLocation> getSearchOrigin() {
        if (searchOrigin == null) {
            searchOrigin = new ArrayList<TypeSearchLocation>();
        }
        return this.searchOrigin;
    }

    /**
     * Gets the value of the searchDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSearchLocation }
     * 
     * 
     */
    public List<TypeSearchLocation> getSearchDestination() {
        if (searchDestination == null) {
            searchDestination = new ArrayList<TypeSearchLocation>();
        }
        return this.searchDestination;
    }

    /**
     * Gets the value of the railSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link RailSegmentList }
     *     
     */
    public RailSegmentList getRailSegmentList() {
        return railSegmentList;
    }

    /**
     * Sets the value of the railSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSegmentList }
     *     
     */
    public void setRailSegmentList(RailSegmentList value) {
        this.railSegmentList = value;
    }

    /**
     * Gets the value of the searchDepTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDepTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchDepTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFlexibleTimeSpec }
     * 
     * 
     */
    public List<TypeFlexibleTimeSpec> getSearchDepTime() {
        if (searchDepTime == null) {
            searchDepTime = new ArrayList<TypeFlexibleTimeSpec>();
        }
        return this.searchDepTime;
    }

    /**
     * Gets the value of the searchArvTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchArvTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchArvTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTimeSpec }
     * 
     * 
     */
    public List<TypeTimeSpec> getSearchArvTime() {
        if (searchArvTime == null) {
            searchArvTime = new ArrayList<TypeTimeSpec>();
        }
        return this.searchArvTime;
    }

    /**
     * Gets the value of the railLegModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link RailLegModifiers }
     *     
     */
    public RailLegModifiers getRailLegModifiers() {
        return railLegModifiers;
    }

    /**
     * Sets the value of the railLegModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailLegModifiers }
     *     
     */
    public void setRailLegModifiers(RailLegModifiers value) {
        this.railLegModifiers = value;
    }

}
