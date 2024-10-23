package efdsw.p2.sanca.p2_soap_sanca.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombreempleado;

    @Column(name = "apellido")
    private String apellidoempleado;

    @Column(name = "cargo")
    private String cargoempleado;

    @Column(name = "salario")
    private BigDecimal salarioempleado;
}

