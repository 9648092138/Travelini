
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container to display the optional services which are coupled by business rules.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}GroupedOption" maxOccurs="999" minOccurs="2"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groupedOption"
})
@XmlRootElement(name = "GroupedOptionInfo")
public class GroupedOptionInfo {

    @XmlElement(name = "GroupedOption")
    protected List<GroupedOption> groupedOption;

    /**
     * Gets the value of the groupedOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupedOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupedOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupedOption }
     * 
     * 
     */
    public List<GroupedOption> getGroupedOption() {
        if (groupedOption == null) {
            groupedOption = new ArrayList<GroupedOption>();
        }
        return this.groupedOption;
    }

}
