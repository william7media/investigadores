package ec.com.sevenmediaglobal.vuv.investigador.controller;

import ec.com.sevenmediaglobal.vuv.investigador.model.InvestigadorVUV;
import ec.com.sevenmediaglobal.vuv.investigador.service.InvestigadorVUVService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/vuv")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class InvestigadorVUVController {

    private final InvestigadorVUVService service;

    @GetMapping(value = "/investigador/nombres/{token}")
    public ResponseEntity<List<InvestigadorVUV>> searchByNombresCompletosContainingIgnoreCase(
            @PathVariable("token") String token) {
        List<InvestigadorVUV> listFound = service.searchByNombresCompletosContainingIgnoreCase(token);
        if (listFound.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(listFound);
    }

    @GetMapping(value = "/investigador/estado/{estado}")
    public ResponseEntity<List<InvestigadorVUV>> searchByEstado(
            @PathVariable("estado") String estado) {
        List<InvestigadorVUV> listFound = service.searchByEstado(estado);
        if (listFound.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(listFound);
    }

    @GetMapping(value = "/investigador/status/{status}")
    public ResponseEntity<List<InvestigadorVUV>> searchByStatus(
            @PathVariable("status") String status) {
        List<InvestigadorVUV> listFound = service.searchByStatus(status);
        if (listFound.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(listFound);
    }

    @GetMapping(value = "/investigador/cedula/{cedula}")
    public ResponseEntity<InvestigadorVUV> searchByCedula(
            @PathVariable("cedula") String cedula) {
        Optional<InvestigadorVUV> investigadorFound = service.searchByCedula(cedula);
        return investigadorFound.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping(value = "/investigador/email/{email}")
    public ResponseEntity<InvestigadorVUV> searchByEmail(
            @PathVariable("email") String email) {
        Optional<InvestigadorVUV> investigadorFound = service.searchByEmail(email);
        return investigadorFound.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping(value = "/investigador/registro/{registro}")
    public ResponseEntity<InvestigadorVUV> searchByRegistro(
            @PathVariable("registro") String registro) {
        Optional<InvestigadorVUV> investigadorFound = service.searchByRegistro(registro);
        return investigadorFound.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

}
