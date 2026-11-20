package com.api.backend.repuesto;

import java.math.BigDecimal;

public record Repuesto(Long id,
                       String codigo,
                       String nome,
                       String marca,
                       String categoria,
                       Integer stock,
                       BigDecimal precio) {

}
