//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.05.22 at 11:43:26 AM MSK 
//


package by.it.sgolovach.jd02_09;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ad complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Adres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Floors" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Square" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Price" type="{http://jd02_09.sgolovach.it.by}Price"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ad", propOrder = {
    "description",
    "adres",
    "floor",
    "floors",
    "square",
    "price"
})
public class Ad {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Adres", required = true)
    protected String adres;
    @XmlElement(name = "Floor", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger floor;
    @XmlElement(name = "Floors", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger floors;
    @XmlElement(name = "Square")
    protected double square;
    @XmlElement(name = "Price", required = true)
    protected Price price;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdres(String value) {
        this.adres = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFloor(BigInteger value) {
        this.floor = value;
    }

    /**
     * Gets the value of the floors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFloors() {
        return floors;
    }

    /**
     * Sets the value of the floors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFloors(BigInteger value) {
        this.floors = value;
    }

    /**
     * Gets the value of the square property.
     * 
     */
    public double getSquare() {
        return square;
    }

    /**
     * Sets the value of the square property.
     * 
     */
    public void setSquare(double value) {
        this.square = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "description='" + description + '\'' +
                ", adres='" + adres + '\'' +
                ", floor=" + floor +
                ", floors=" + floors +
                ", square=" + square +
                ", price=" + price +
                '}';
    }
}
