package ec.com.sevenmediaglobal.vuv.investigador.service;

import ec.com.sevenmediaglobal.vuv.investigador.model.InvestigadorVUV;
import ec.com.sevenmediaglobal.vuv.investigador.repository.InvestigadorVUVRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InvestigadorVUVService implements IInvestigadorVUVService {

    private final InvestigadorVUVRepository repository;

    @Override
    public List<InvestigadorVUV> findAll() {
        return repository.findAll();
    }

    @Override
    public List<InvestigadorVUV> searchByNombresCompletosContainingIgnoreCase(String token) {
        return repository.findByNombresCompletosContainingIgnoreCase(token);
    }

    @Override
    public List<InvestigadorVUV> searchByEstado(String estado) {
        return repository.findByEstado(estado);
    }

    @Override
    public List<InvestigadorVUV> searchByStatus(String status) {
        return repository.findByStatus(status);
    }

    @Override
    public Optional<InvestigadorVUV> searchByCedula(String cedula) {
        return repository.findByCedula(cedula);
    }

    @Override
    public Optional<InvestigadorVUV> searchByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Optional<InvestigadorVUV> searchByRegistro(String registro) {
        return repository.findByRegistro(registro);
    }
}
