package ec.com.sevenmediaglobal.vuv.investigador.repository;

import ec.com.sevenmediaglobal.vuv.investigador.model.InvestigadorVUV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvestigadorVUVRepository extends JpaRepository<InvestigadorVUV, Integer> {

    List<InvestigadorVUV> findByNombresCompletosContainingIgnoreCase(String token);
    List<InvestigadorVUV> findByEstado(String estado);
    List<InvestigadorVUV> findByStatus(String status);
    Optional<InvestigadorVUV> findByCedula(String cedula);
    Optional<InvestigadorVUV> findByEmail(String email);
    Optional<InvestigadorVUV> findByRegistro(String registro);

}