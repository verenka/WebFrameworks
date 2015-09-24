
package webf.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loginRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginRequest" type="{http://webservice.webf/}loginRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginRequestType", propOrder = {
    "loginRequest"
})
public class LoginRequestType {

    protected LoginRequest loginRequest;

    /**
     * Gets the value of the loginRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRequest }
     *     
     */
    public LoginRequest getLoginRequest() {
        return loginRequest;
    }

    /**
     * Sets the value of the loginRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRequest }
     *     
     */
    public void setLoginRequest(LoginRequest value) {
        this.loginRequest = value;
    }

}
