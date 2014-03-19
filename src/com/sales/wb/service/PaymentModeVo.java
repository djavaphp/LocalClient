
package com.sales.wb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentModeVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentModeVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentModeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paymentModeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentModeVo", propOrder = {
    "paymentModeId",
    "paymentModeName"
})
public class PaymentModeVo {

    protected int paymentModeId;
    protected String paymentModeName;

    /**
     * Gets the value of the paymentModeId property.
     * 
     */
    public int getPaymentModeId() {
        return paymentModeId;
    }

    /**
     * Sets the value of the paymentModeId property.
     * 
     */
    public void setPaymentModeId(int value) {
        this.paymentModeId = value;
    }

    /**
     * Gets the value of the paymentModeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentModeName() {
        return paymentModeName;
    }

    /**
     * Sets the value of the paymentModeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentModeName(String value) {
        this.paymentModeName = value;
    }

}
