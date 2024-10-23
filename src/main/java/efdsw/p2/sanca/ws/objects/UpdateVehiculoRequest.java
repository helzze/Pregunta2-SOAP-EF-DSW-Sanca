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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idvehiculo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modelovehiculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="anioovehiculo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="marcavehiculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preciovehiculo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idvehiculo",
    "modelovehiculo",
    "anioovehiculo",
    "marcavehiculo",
    "preciovehiculo"
})
@XmlRootElement(name = "updateVehiculoRequest")
public class UpdateVehiculoRequest {

    protected int idvehiculo;
    @XmlElement(required = true)
    protected String modelovehiculo;
    protected int anioovehiculo;
    @XmlElement(required = true)
    protected String marcavehiculo;
    @XmlElement(required = true)
    protected BigDecimal preciovehiculo;

    /**
     * Obtiene el valor de la propiedad idvehiculo.
     * 
     */
    public int getIdvehiculo() {
        return idvehiculo;
    }

    /**
     * Define el valor de la propiedad idvehiculo.
     * 
     */
    public void setIdvehiculo(int value) {
        this.idvehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad modelovehiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelovehiculo() {
        return modelovehiculo;
    }

    /**
     * Define el valor de la propiedad modelovehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelovehiculo(String value) {
        this.modelovehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad anioovehiculo.
     * 
     */
    public int getAnioovehiculo() {
        return anioovehiculo;
    }

    /**
     * Define el valor de la propiedad anioovehiculo.
     * 
     */
    public void setAnioovehiculo(int value) {
        this.anioovehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad marcavehiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcavehiculo() {
        return marcavehiculo;
    }

    /**
     * Define el valor de la propiedad marcavehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcavehiculo(String value) {
        this.marcavehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad preciovehiculo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreciovehiculo() {
        return preciovehiculo;
    }

    /**
     * Define el valor de la propiedad preciovehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreciovehiculo(BigDecimal value) {
        this.preciovehiculo = value;
    }

}
