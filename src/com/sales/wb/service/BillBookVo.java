
package com.sales.wb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billBookVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billBookVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billBookId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billBookNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billBookVo", propOrder = {
    "billBookId",
    "billBookNum",
    "endRange",
    "startRange"
})
public class BillBookVo {

    protected Long billBookId;
    protected String billBookNum;
    protected String endRange;
    protected String startRange;

    /**
     * Gets the value of the billBookId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillBookId() {
        return billBookId;
    }

    /**
     * Sets the value of the billBookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillBookId(Long value) {
        this.billBookId = value;
    }

    /**
     * Gets the value of the billBookNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillBookNum() {
        return billBookNum;
    }

    /**
     * Sets the value of the billBookNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillBookNum(String value) {
        this.billBookNum = value;
    }

    /**
     * Gets the value of the endRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndRange() {
        return endRange;
    }

    /**
     * Sets the value of the endRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndRange(String value) {
        this.endRange = value;
    }

    /**
     * Gets the value of the startRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartRange() {
        return startRange;
    }

    /**
     * Sets the value of the startRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartRange(String value) {
        this.startRange = value;
    }

}
