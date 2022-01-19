package ec.com.sevenmediaglobal.vuv.investigador.repository;

import ec.com.sevenmediaglobal.vuv.investigador.model.Organizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizacionRepository extends JpaRepository<Organizacion, Integer> {

    List<Organizacion> findByNombreContainingIgnoreCase(String token);

}