
package webf.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lResp" type="{http://webservice.webf/}loginResponse2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRole", propOrder = {
    "lResp"
})
public class GetRole {

    protected LoginResponse2 lResp;

    /**
     * Gets the value of the lResp property.
     * 
     * @return
     *     possible object is
     *     {@link LoginResponse2 }
     *     
     */
    public LoginResponse2 getLResp() {
        return lResp;
    }

    /**
     * Sets the value of the lResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResponse2 }
     *     
     */
    public void setLResp(LoginResponse2 value) {
        this.lResp = value;
    }

}
