
package webf.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for courseDetailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="courseDetailRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coursePk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "courseDetailRequest", propOrder = {
    "coursePk"
})
public class CourseDetailRequest {

    protected String coursePk;

    /**
     * Gets the value of the coursePk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoursePk() {
        return coursePk;
    }

    /**
     * Sets the value of the coursePk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoursePk(String value) {
        this.coursePk = value;
    }

}
