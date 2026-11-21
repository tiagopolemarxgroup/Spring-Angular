package com.api.backend.repuesto;

import java.math.BigDecimal;

public record Respuesto(Long id,
                       String codigo,
                       String nombre,
                       String marca,
                       String categoria,
                       Integer stock,
                       BigDecimal precio) {

}
