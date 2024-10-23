package efdsw.p2.sanca.p2_soap_sanca.repository;

import efdsw.p2.sanca.p2_soap_sanca.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository
        extends JpaRepository<Vehiculo, Integer> {
}

