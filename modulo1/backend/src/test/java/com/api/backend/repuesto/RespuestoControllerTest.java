package com.api.backend.repuesto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class RespuestoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void listaLosRepuestos() throws Exception {
        mockMvc.perform(get("/api/repuestos"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(3));
    }

    @Test
    void getRepuestoById() throws Exception {
        mockMvc.perform(get("/api/repuestos/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.codigo").value("ABC123"))
                        .andExpect(jsonPath("$.nombre").value("Motor"));

    }

    @Test
    void getSegundoRepuestoById() throws Exception {
        mockMvc.perform(get("/api/repuestos/2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(2))
                .andExpect(jsonPath("$.codigo").value("XYZ456"));
    }

    @Test
    void get404CuandoElRespuestoNoExiste() throws Exception {
        mockMvc.perform(get("/api/repuestos/999"))
                .andExpect(status().isNotFound());
    }

}