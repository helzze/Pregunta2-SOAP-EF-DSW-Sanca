package efdsw.p2.sanca.p2_soap_sanca.repository;

import efdsw.p2.sanca.p2_soap_sanca.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}

