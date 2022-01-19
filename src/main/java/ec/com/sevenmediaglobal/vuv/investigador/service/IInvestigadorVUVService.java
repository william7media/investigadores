package ec.com.sevenmediaglobal.vuv.investigador.service;

import ec.com.sevenmediaglobal.vuv.investigador.model.InvestigadorVUV;

import java.util.List;
import java.util.Optional;

public interface IInvestigadorVUVService {

    List<InvestigadorVUV> findAll();
    List<InvestigadorVUV> searchByNombresCompletosContainingIgnoreCase(String token);
    List<InvestigadorVUV> searchByEstado(String estado);
    List<InvestigadorVUV> searchByStatus(String status);
    Optional<InvestigadorVUV> searchByCedula(String cedula);
    Optional<InvestigadorVUV> searchByEmail(String email);
    Optional<InvestigadorVUV> searchByRegistro(String registro);
}
