package com.api.backend.repuesto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RespuestoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void listaLosRepuestos() throws Exception {
        mockMvc.perform(get("/api/repuestos"))
                .andExpect(status().isOk());
    }

    @Test
    void getRepuestoById() {
    }
}