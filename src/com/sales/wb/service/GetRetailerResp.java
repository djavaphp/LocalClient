
package com.sales.wb.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRetailerResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRetailerResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resp" type="{http://service.wb.sales.com/}resp" minOccurs="0"/>
 *         &lt;element name="retailerlist" type="{http://service.wb.sales.com/}retailerVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRetailerResp", propOrder = {
    "resp",
    "retailerlist"
})
public class GetRetailerResp {

    protected Resp resp;
    @XmlElement(nillable = true)
    protected List<RetailerVO> retailerlist;

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

    /**
     * Gets the value of the retailerlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailerlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailerlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailerVO }
     * 
     * 
     */
    public List<RetailerVO> getRetailerlist() {
        if (retailerlist == null) {
            retailerlist = new ArrayList<RetailerVO>();
        }
        return this.retailerlist;
    }

}
