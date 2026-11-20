package com.api.backend.repuesto;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RespuestoService {

    private final List<Respuesto> respuestos = List.of(
            new Respuesto(1L, "ABC123", "Motor", "Toyota", "Accesorios", 10, new BigDecimal("50.00")),
            new Respuesto(2L, "XYZ456", "Filtro de aire", "Honda", "Filtros", 20, new BigDecimal("25.00")),
            new Respuesto(3L, "DEF789", "Bujía", "Ford", "Accesorios", 15, new BigDecimal("15.00"))
    );

    public List<Respuesto> getAllRespuestos() {
        return respuestos;
    }

    public Optional<Respuesto> getRespuestoById(Long id) {
        return respuestos.stream()
                .filter(repuesto -> repuesto.id().equals(id))
                .findFirst();
    }
}
