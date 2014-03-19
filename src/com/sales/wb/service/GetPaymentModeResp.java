
package com.sales.wb.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPaymentModeResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPaymentModeResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentModeList" type="{http://service.wb.sales.com/}paymentModeVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resp" type="{http://service.wb.sales.com/}resp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentModeResp", propOrder = {
    "paymentModeList",
    "resp"
})
public class GetPaymentModeResp {

    @XmlElement(nillable = true)
    protected List<PaymentModeVo> paymentModeList;
    protected Resp resp;

    /**
     * Gets the value of the paymentModeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentModeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentModeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentModeVo }
     * 
     * 
     */
    public List<PaymentModeVo> getPaymentModeList() {
        if (paymentModeList == null) {
            paymentModeList = new ArrayList<PaymentModeVo>();
        }
        return this.paymentModeList;
    }

    /**
     * Gets the value of the resp property.
     * 
     * @return
     *     possible object is
     *     {@link Resp }
     *     
     */
    public Resp getResp() {
        return resp;
    }

    /**
     * Sets the value of the resp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resp }
     *     
     */
    public void setResp(Resp value) {
        this.resp = value;
    }

}
