package ec.com.sevenmediaglobal.vuv.investigador.service;

import ec.com.sevenmediaglobal.vuv.investigador.model.Organizacion;

import java.util.List;
import java.util.Optional;

public interface IOrganizacionService {

    List<Organizacion> searchAll();
    List<Organizacion> searchByNombreContainingIgnoreCase(String token);
    Optional<Organizacion> searchById(Integer id);

}
