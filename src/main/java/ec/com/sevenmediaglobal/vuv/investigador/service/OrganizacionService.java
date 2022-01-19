package ec.com.sevenmediaglobal.vuv.investigador.service;

import ec.com.sevenmediaglobal.vuv.investigador.model.Organizacion;
import ec.com.sevenmediaglobal.vuv.investigador.repository.OrganizacionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrganizacionService implements IOrganizacionService {

    private final OrganizacionRepository repository;

    @Override
    public List<Organizacion> searchAll() {
        return repository.findAll();
    }

    @Override
    public List<Organizacion> searchByNombreContainingIgnoreCase(String token) {
        return repository.findByNombreContainingIgnoreCase(token);
    }

    @Override
    public Optional<Organizacion> searchById(Integer id) {
        return repository.findById(id);
    }

}
