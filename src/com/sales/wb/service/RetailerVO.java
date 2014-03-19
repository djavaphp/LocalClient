
package com.sales.wb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retailerVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retailerVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaVO" type="{http://service.wb.sales.com/}areaVO" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="retailerID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="retailerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retailerVO", propOrder = {
    "areaVO",
    "isActive",
    "retailerID",
    "retailerName",
    "shopAddress",
    "shopName",
    "shopPhoneNumber"
})
public class RetailerVO {

    protected AreaVO areaVO;
    protected Boolean isActive;
    protected Long retailerID;
    protected String retailerName;
    protected String shopAddress;
    protected String shopName;
    protected String shopPhoneNumber;

    /**
     * Gets the value of the areaVO property.
     * 
     * @return
     *     possible object is
     *     {@link AreaVO }
     *     
     */
    public AreaVO getAreaVO() {
        return areaVO;
    }

    /**
     * Sets the value of the areaVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaVO }
     *     
     */
    public void setAreaVO(AreaVO value) {
        this.areaVO = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the retailerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetailerID() {
        return retailerID;
    }

    /**
     * Sets the value of the retailerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetailerID(Long value) {
        this.retailerID = value;
    }

    /**
     * Gets the value of the retailerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailerName() {
        return retailerName;
    }

    /**
     * Sets the value of the retailerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailerName(String value) {
        this.retailerName = value;
    }

    /**
     * Gets the value of the shopAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopAddress() {
        return shopAddress;
    }

    /**
     * Sets the value of the shopAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopAddress(String value) {
        this.shopAddress = value;
    }

    /**
     * Gets the value of the shopName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * Sets the value of the shopName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopName(String value) {
        this.shopName = value;
    }

    /**
     * Gets the value of the shopPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopPhoneNumber() {
        return shopPhoneNumber;
    }

    /**
     * Sets the value of the shopPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopPhoneNumber(String value) {
        this.shopPhoneNumber = value;
    }

}
