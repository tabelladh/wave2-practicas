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
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
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

    private static final AlumnoDTO alumnoDTO = new AlumnoDTO( 1, "Juan", "Martinez", LocalDate.of(2000, 2, 15), 12345678, "Calle Principal 123",
            List.of(cursoDTO1, cursoDTO2));


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
    /* @DeleteMapping("/borrarAlumno/{id}")
    public ResponseEntity<RespuestaDTO> borrarAlumno(@PathVariable Integer id){
        return new ResponseEntity<>(alumnoService.borrarAlumno(id), HttpStatus.OK);
    } */

    public void borrarAlumnoPorId () throws Exception {

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
    /* @PutMapping("/actualizarAlumno")
    public ResponseEntity<AlumnoDTO> actualizarAlumno(@RequestBody AlumnoDTO alumnoDTO){
        return new ResponseEntity<>(alumnoService.actualizarAlumno(alumnoDTO), HttpStatus.OK);
    } */

    public void actualizarAlumnoPorId () throws Exception {

        String payloadDto = objectMapper.writeValueAsString(alumnoDTO);
        String AlumnoDtoEsperado = payloadDto;

        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().string(AlumnoDtoEsperado);
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(put("/alumno/actualizarAlumno")
                        .contentType(MediaType.APPLICATION_JSON) //indicamos el tipo de contenido
                        .content(payloadDto))             //indicamos el contenido , ya tiene q estar pasado de obj a Json
                .andExpectAll(statusEsperado, bodyEsperado, contentTypeEsperado)
                .andDo(print());
    }

}
