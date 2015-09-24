
package webf.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCourseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCourseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="courseDetailReq" type="{http://webservice.webf/}courseDetailRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCourseDetail", propOrder = {
    "courseDetailReq"
})
public class GetCourseDetail {

    protected CourseDetailRequest courseDetailReq;

    /**
     * Gets the value of the courseDetailReq property.
     * 
     * @return
     *     possible object is
     *     {@link CourseDetailRequest }
     *     
     */
    public CourseDetailRequest getCourseDetailReq() {
        return courseDetailReq;
    }

    /**
     * Sets the value of the courseDetailReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseDetailRequest }
     *     
     */
    public void setCourseDetailReq(CourseDetailRequest value) {
        this.courseDetailReq = value;
    }

}
