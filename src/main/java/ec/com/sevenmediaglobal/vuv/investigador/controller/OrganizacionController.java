package ec.com.sevenmediaglobal.vuv.investigador.controller;

import ec.com.sevenmediaglobal.vuv.investigador.model.Organizacion;
import ec.com.sevenmediaglobal.vuv.investigador.service.OrganizacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/vuv")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class OrganizacionController {

    private final OrganizacionService service;

    @GetMapping(value = "/organizacion")
    public ResponseEntity<List<Organizacion>> searchAll() {
        List<Organizacion> listFound = service.searchAll();
        if (listFound.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(listFound);
    }

    @GetMapping(value = "/organizacion/nombre/{token}")
    public ResponseEntity<List<Organizacion>> searchByNombreContainingIgnoreCase(
            @PathVariable("token") String token) {
        List<Organizacion> listFound = service.searchByNombreContainingIgnoreCase(token);
        if (listFound.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(listFound);
    }

    @GetMapping(value = "/organizacion/{id}")
    public ResponseEntity<Organizacion> searchById(
            @PathVariable("id") Integer id) {
        Optional<Organizacion> organizacionFound = service.searchById(id);
        return organizacionFound.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

}
