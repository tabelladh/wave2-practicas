package controller;


import com.obtenerdiploma.controller.ObtenerDiplomaController;
import com.obtenerdiploma.dto.StudentWithMessageDTO;
import com.obtenerdiploma.dto.SubjectDTO;
import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;
import com.obtenerdiploma.service.ObtenerDiplomaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class ObtenerDiplomaControllerTest {
    @Mock
    ObtenerDiplomaService obtenerDiplomaService;

    @InjectMocks
    ObtenerDiplomaController obtenerDiplomaController;

    private static final StudentWithMessageDTO studentWithMessageDTO = new StudentWithMessageDTO(1L, "Joako", Set.of(
            new SubjectDTO("Matemática", 9D),
            new SubjectDTO("Física", 8D),
            new SubjectDTO("Química", 8D)), "Abanderado", 8.5D);


    private static final Student studentWithMessage = new Student(1L, "Joako", Set.of(
            new Subject("Matemática", 9D),
            new Subject("Física", 8D),
            new Subject("Química", 8D)));

    @Test
    @DisplayName("Test get student")
    public void testGetStudent() {

        Mockito.when(obtenerDiplomaService.analyzeScores(1L)).thenReturn(studentWithMessageDTO);
        ResponseEntity<?> response = obtenerDiplomaController.analyzeScores(1L);

        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()); //obtengo el statuscode de RESPONSE
        Assertions.assertEquals(studentWithMessageDTO, response.getBody()); //obtengo el body(en este caso es un studentDTO) del RESPONSE
    }


}
