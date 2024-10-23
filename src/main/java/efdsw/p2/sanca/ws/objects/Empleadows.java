//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 01:44:21 AM PET 
//


package efdsw.p2.sanca.ws.objects;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para empleadows complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="empleadows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idempleado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreempleado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apellidoempleado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cargoempleado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="salarioempleado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empleadows", propOrder = {
    "idempleado",
    "nombreempleado",
    "apellidoempleado",
    "cargoempleado",
    "salarioempleado"
})
public class Empleadows {

    protected int idempleado;
    @XmlElement(required = true)
    protected String nombreempleado;
    @XmlElement(required = true)
    protected String apellidoempleado;
    @XmlElement(required = true)
    protected String cargoempleado;
    @XmlElement(required = true)
    protected BigDecimal salarioempleado;

    /**
     * Obtiene el valor de la propiedad idempleado.
     * 
     */
    public int getIdempleado() {
        return idempleado;
    }

    /**
     * Define el valor de la propiedad idempleado.
     * 
     */
    public void setIdempleado(int value) {
        this.idempleado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreempleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreempleado() {
        return nombreempleado;
    }

    /**
     * Define el valor de la propiedad nombreempleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreempleado(String value) {
        this.nombreempleado = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoempleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoempleado() {
        return apellidoempleado;
    }

    /**
     * Define el valor de la propiedad apellidoempleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoempleado(String value) {
        this.apellidoempleado = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoempleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoempleado() {
        return cargoempleado;
    }

    /**
     * Define el valor de la propiedad cargoempleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoempleado(String value) {
        this.cargoempleado = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioempleado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalarioempleado() {
        return salarioempleado;
    }

    /**
     * Define el valor de la propiedad salarioempleado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalarioempleado(BigDecimal value) {
        this.salarioempleado = value;
    }

}
