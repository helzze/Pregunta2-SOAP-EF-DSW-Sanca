package efdsw.p2.sanca.p2_soap_sanca.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String nombrecliente;

    @Column(name = "apellido")
    private String apellidocliente;

    @Column(name = "email")
    private String emailcliente;

    @Column(name = "telefono")
    private String telefonocliente;

    @Column(name = "direccion")
    private String direccioncliente;
}
