package com.example.AlumnoDTORP.integrationTest;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.dto.response.CursoDuracionDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class CursoControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper = new ObjectMapper()
            .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
            .registerModule(new JavaTimeModule());

    private static CursoDTO cursoDTO1 = new CursoDTO(101, "Matemáticas", "Bachillerato", true, 180.0);
    private static CursoDTO cursoDTO2 = new CursoDTO(102, "Historia", "Bachillerato", true, 150.0);
    private static CursoDTO cursoDTO3 = new CursoDTO(103, "Inglés", "Bachillerato", true, 200.0);
    private static CursoDTO cursoDTO4 = new CursoDTO(104, "Programacion", "Bachillerato", false, 450.0);


    @Test
    public void traerCursosTestOK () throws Exception {

        //ARRANGE
        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content()
                .json(objectMapper.writeValueAsString(List.of(cursoDTO1,cursoDTO2,cursoDTO3,cursoDTO4)));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);


        //ACT
        mockMvc.perform(get("/cursos/listarCursos"))
                .andExpectAll(statusEsperado, bodyEsperado, contentTypeEsperado)
                .andDo(print());
    }

    @Test
    public void traerCursosPorIdTestOK () throws Exception {

        //ARRANGE
        Integer id = 104;
        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content()
                .json(objectMapper.writeValueAsString(cursoDTO4));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);


        //ACT
        mockMvc.perform(get("/cursos/listarCursos/{id}", id))
                .andExpectAll(statusEsperado, bodyEsperado, contentTypeEsperado)
                .andDo(print());
    }

    @Test
    public void traerCursosMasHorasTestOK () throws Exception {

        //ARRANGE
        CursoDuracionDTO cursoDuracionDTO = new CursoDuracionDTO("Programacion", 450.0);
        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content()
                .json(objectMapper.writeValueAsString(cursoDuracionDTO));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);


        //ACT
        mockMvc.perform(get("/cursos/masHoras"))
                .andExpectAll(statusEsperado, bodyEsperado, contentTypeEsperado)
                .andDo(print());
    }
}
