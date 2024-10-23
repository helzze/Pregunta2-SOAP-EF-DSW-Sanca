//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 01:44:21 AM PET 
//


package efdsw.p2.sanca.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clientews complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clientews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idcliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombrecliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apellidocliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emailcliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefonocliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="direccioncliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientews", propOrder = {
    "idcliente",
    "nombrecliente",
    "apellidocliente",
    "emailcliente",
    "telefonocliente",
    "direccioncliente"
})
public class Clientews {

    protected int idcliente;
    @XmlElement(required = true)
    protected String nombrecliente;
    @XmlElement(required = true)
    protected String apellidocliente;
    @XmlElement(required = true)
    protected String emailcliente;
    @XmlElement(required = true)
    protected String telefonocliente;
    @XmlElement(required = true)
    protected String direccioncliente;

    /**
     * Obtiene el valor de la propiedad idcliente.
     * 
     */
    public int getIdcliente() {
        return idcliente;
    }

    /**
     * Define el valor de la propiedad idcliente.
     * 
     */
    public void setIdcliente(int value) {
        this.idcliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrecliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrecliente() {
        return nombrecliente;
    }

    /**
     * Define el valor de la propiedad nombrecliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrecliente(String value) {
        this.nombrecliente = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidocliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidocliente() {
        return apellidocliente;
    }

    /**
     * Define el valor de la propiedad apellidocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidocliente(String value) {
        this.apellidocliente = value;
    }

    /**
     * Obtiene el valor de la propiedad emailcliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailcliente() {
        return emailcliente;
    }

    /**
     * Define el valor de la propiedad emailcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailcliente(String value) {
        this.emailcliente = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonocliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonocliente() {
        return telefonocliente;
    }

    /**
     * Define el valor de la propiedad telefonocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonocliente(String value) {
        this.telefonocliente = value;
    }

    /**
     * Obtiene el valor de la propiedad direccioncliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccioncliente() {
        return direccioncliente;
    }

    /**
     * Define el valor de la propiedad direccioncliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccioncliente(String value) {
        this.direccioncliente = value;
    }

}
