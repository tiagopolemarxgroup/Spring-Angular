package com.api.backend.repuesto;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/repuestos")
public class RespuestoController {

    private final RespuestoService respuestoService;

    public RespuestoController(RespuestoService respuestoService) {
        this.respuestoService = respuestoService;
    }

    @GetMapping
    public List<Respuesto> getAllRepuestos() {
        return respuestoService.getAllRespuestos();
    }

    @GetMapping("/{id}")
    public Respuesto getRepuestoById(@PathVariable Long id) {
        return respuestoService.getRespuestoById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Respuesto not found" + id));
    }
}
