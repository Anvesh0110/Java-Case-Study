
package com.training.prodsvc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prodID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "prodID",
    "prodName"
})
public class Product {

    @XmlElement(required = true, nillable = true)
    protected String prodID;
    @XmlElement(required = true, nillable = true)
    protected String prodName;

    /**
     * Gets the value of the prodID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdID() {
        return prodID;
    }

    /**
     * Sets the value of the prodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdID(String value) {
        this.prodID = value;
    }

    /**
     * Gets the value of the prodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * Sets the value of the prodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdName(String value) {
        this.prodName = value;
    }

}
