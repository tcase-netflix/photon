
package org.smpte_ra.schemas.st2067_2_2016.PKL;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.smpte-ra.org/schemas/2067-2/2016/PKL}UUID"/>
 *         &lt;element name="AnnotationText" type="{http://www.smpte-ra.org/schemas/2067-2/2016/PKL}UserText" minOccurs="0"/>
 *         &lt;element name="Hash" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalFileName" type="{http://www.smpte-ra.org/schemas/2067-2/2016/PKL}UserText" minOccurs="0"/>
 *         &lt;element name="HashAlgorithm" type="{http://www.w3.org/2000/09/xmldsig#}DigestMethodType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetType", namespace = "http://www.smpte-ra.org/schemas/2067-2/2016/PKL", propOrder = {
    "id",
    "annotationText",
    "hash",
    "size",
    "type",
    "originalFileName",
    "hashAlgorithm"
})
public class AssetType {

    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlElement(name = "AnnotationText")
    protected UserText annotationText;
    @XmlElement(name = "Hash", required = true)
    protected byte[] hash;
    @XmlElement(name = "Size", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger size;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "OriginalFileName")
    protected UserText originalFileName;
    @XmlElement(name = "HashAlgorithm", required = true)
    protected DigestMethodType hashAlgorithm;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the annotationText property.
     * 
     * @return
     *     possible object is
     *     {@link UserText }
     *     
     */
    public UserText getAnnotationText() {
        return annotationText;
    }

    /**
     * Sets the value of the annotationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserText }
     *     
     */
    public void setAnnotationText(UserText value) {
        this.annotationText = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHash(byte[] value) {
        this.hash = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the originalFileName property.
     * 
     * @return
     *     possible object is
     *     {@link UserText }
     *     
     */
    public UserText getOriginalFileName() {
        return originalFileName;
    }

    /**
     * Sets the value of the originalFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserText }
     *     
     */
    public void setOriginalFileName(UserText value) {
        this.originalFileName = value;
    }

    /**
     * Gets the value of the hashAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link DigestMethodType }
     *     
     */
    public DigestMethodType getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Sets the value of the hashAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestMethodType }
     *     
     */
    public void setHashAlgorithm(DigestMethodType value) {
        this.hashAlgorithm = value;
    }

}
