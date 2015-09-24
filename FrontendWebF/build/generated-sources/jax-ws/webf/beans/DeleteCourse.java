
package webf.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCourse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCourse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteParameter" type="{http://webservice.webf/}courseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCourse", propOrder = {
    "deleteParameter"
})
public class DeleteCourse {

    protected CourseType deleteParameter;

    /**
     * Gets the value of the deleteParameter property.
     * 
     * @return
     *     possible object is
     *     {@link CourseType }
     *     
     */
    public CourseType getDeleteParameter() {
        return deleteParameter;
    }

    /**
     * Sets the value of the deleteParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseType }
     *     
     */
    public void setDeleteParameter(CourseType value) {
        this.deleteParameter = value;
    }

}
