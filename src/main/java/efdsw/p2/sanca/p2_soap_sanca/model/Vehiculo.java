package efdsw.p2.sanca.p2_soap_sanca.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "Vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idvehiculo;
    @Column(name = "marca")
    private String marcavehiculo;

    @Column(name = "modelo")
    private String modelovehiculo;

    @Column(name = "anio")
    private int anioovehiculo;

    @Column(name = "precio")
    private BigDecimal preciovehiculo;
}
