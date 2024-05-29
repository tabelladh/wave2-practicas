package com.example.AlumnoDTORP.integrationTest;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
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
public class AlumnoControllerITest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper = new ObjectMapper()
            .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
            .registerModule(new JavaTimeModule());


    private static CursoDTO cursoDTO1 = new CursoDTO(101, "Matemáticas", "Bachillerato", true, 180.0);
    private static CursoDTO cursoDTO2 = new CursoDTO(102, "Historia", "Bachillerato", true, 150.0);
    private static CursoDTO cursoDTO3 = new CursoDTO(103, "Inglés", "Bachillerato", true, 200.0);

    private static final AlumnoDTO alumnoDTO = new AlumnoDTO( 1, "Juan", "Martinez", LocalDate.of(2000, 2, 15), 12345678, "Calle Principal 123",
            List.of(cursoDTO1, cursoDTO2));

    private static final AlumnoDTO alumnoDTO2 = new AlumnoDTO( 2, "María", "González", LocalDate.of(2001, 5, 20), 87654321, "Avenida Central 456",
            List.of(cursoDTO2));

    private static final AlumnoDTO alumnoDTO3 = new AlumnoDTO( 3, "Carlos", "López", LocalDate.of(1999, 10, 10), 56789012, "Plaza Mayor 789", List.of(cursoDTO3));


    @Test
    public void listarAlumnoTestOK () throws Exception {

        //ARRANGE
        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(List.of(alumnoDTO,alumnoDTO2,alumnoDTO3)));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);


        //ASSERT
        mockMvc.perform(get("/alumno/listarAlumnos"))
                .andExpectAll(statusEsperado, bodyEsperado, contentTypeEsperado)
                .andDo(print());

    }


    // @PostMapping("/agregarAlumno")
    @Test
    public void agregarAlumnoTestOK() throws Exception {
        //ARRANGE
        String payloadDto = objectMapper.writeValueAsString(alumnoDTO);
        RespuestaDTO respuestaEsperada = new RespuestaDTO("Alumno agregado correctamente");


        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isCreated();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(respuestaEsperada));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        //ASSERT
        mockMvc.perform(post("/alumno/agregarAlumno")
                        .contentType(MediaType.APPLICATION_JSON) //indicamos el tipo de contenido
                        .content(payloadDto))             //indicamos el contenido , ya tiene q estar pasado de obj a Json
                .andExpect(statusEsperado)
                .andExpect(bodyEsperado)
                .andExpect(contentTypeEsperado)
                .andDo(print());
    }

//    @Test
//    public void agregarAlumnoTestFail () throws Exception {
//
//        //ARRANGE
//        String payloadDto = objectMapper.writeValueAsString("{}");
//        RespuestaDTO respuestaEsperada = new RespuestaDTO("Alumno agregado correctamente");
//
//        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isCreated();
//        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(respuestaEsperada));
//        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);
//
//        //ASSERT
//        mockMvc.perform(post("/alumno/agregarAlumno")
//                        .contentType(MediaType.APPLICATION_JSON) //indicamos el tipo de contenido
//                        .content(payloadDto))             //indicamos el contenido , ya tiene q estar pasado de obj a Json
//                .andExpect(statusEsperado)
//                .andExpect(bodyEsperado)
//                .andExpect(contentTypeEsperado)
//                .andDo(print());
//    }


    @Test
    public void buscarPorIdTestOK () throws Exception {

        //ARRANGE
        Integer idDeEntrada = 1;
        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(alumnoDTO));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);


        //ASSERT
        mockMvc.perform(get("/alumno/listarAlumno/{id}", idDeEntrada))
                .andExpectAll(statusEsperado, bodyEsperado, contentTypeEsperado)
                .andDo(print());


    }

    @Test
    public void borrarAlumnoTestOK () throws Exception {
        //ARRANGE
        Integer idDeEntrada = 1;
        RespuestaDTO respuestaEsperada = new RespuestaDTO("Alumno borrado correctamente");
        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(respuestaEsperada));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);


        //ASSERT
        mockMvc.perform(delete("/alumno/borrarAlumno/{id}", idDeEntrada))
                .andExpectAll(statusEsperado, bodyEsperado, contentTypeEsperado)
                .andDo(print());
    }

    @Test
    public void actualizarAlumnoTestOK () throws Exception {
        //ARRANGE
        String payloadDto = objectMapper.writeValueAsString(alumnoDTO);
        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(alumnoDTO));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);


        //ASSERT
        mockMvc.perform(put("/alumno/actualizarAlumno")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(payloadDto))
                .andExpect(statusEsperado)
                .andExpect(bodyEsperado)
                .andExpect(contentTypeEsperado)
                .andDo(print());
    }

    @Test
    public void existeAlumnoTestOK () throws Exception {
        //ARRANGE
        Integer idDeEntrada = 1;
        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        String respuestaEsperada = "true";
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().string(respuestaEsperada);
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);


        //ASSERT
        mockMvc.perform(get("/alumno/existeAlumno/{id}", idDeEntrada))
                .andExpectAll(statusEsperado, bodyEsperado, contentTypeEsperado)
                .andDo(print());
    }
}
