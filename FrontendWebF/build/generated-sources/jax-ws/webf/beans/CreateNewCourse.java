
package webf.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createNewCourse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createNewCourse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="teacherId" type="{http://webservice.webf/}loginResponse2" minOccurs="0"/>
 *         &lt;element name="newCourse" type="{http://webservice.webf/}courseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createNewCourse", propOrder = {
    "teacherId",
    "newCourse"
})
public class CreateNewCourse {

    protected LoginResponse2 teacherId;
    protected CourseType newCourse;

    /**
     * Gets the value of the teacherId property.
     * 
     * @return
     *     possible object is
     *     {@link LoginResponse2 }
     *     
     */
    public LoginResponse2 getTeacherId() {
        return teacherId;
    }

    /**
     * Sets the value of the teacherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResponse2 }
     *     
     */
    public void setTeacherId(LoginResponse2 value) {
        this.teacherId = value;
    }

    /**
     * Gets the value of the newCourse property.
     * 
     * @return
     *     possible object is
     *     {@link CourseType }
     *     
     */
    public CourseType getNewCourse() {
        return newCourse;
    }

    /**
     * Sets the value of the newCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseType }
     *     
     */
    public void setNewCourse(CourseType value) {
        this.newCourse = value;
    }

}
