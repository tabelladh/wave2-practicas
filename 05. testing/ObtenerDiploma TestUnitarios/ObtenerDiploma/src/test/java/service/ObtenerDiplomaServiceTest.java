package service;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.dto.StudentWithMessageDTO;
import com.obtenerdiploma.dto.SubjectDTO;
import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;
import com.obtenerdiploma.repository.IStudentRepository;
import com.obtenerdiploma.repository.StudentRepository;
import com.obtenerdiploma.service.ObtenerDiplomaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.Set;


@ExtendWith(MockitoExtension.class)
public class ObtenerDiplomaServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private ObtenerDiplomaService obtenerDiplomaService;

    private static final StudentWithMessageDTO studentWithMessageDTO = new StudentWithMessageDTO(1L, "Joako", Set.of(
            new SubjectDTO("Matemática", 9D),
            new SubjectDTO("Física", 8D),
            new SubjectDTO("Química", 8D)), "Abanderado", 8.5D);


    private static final Student studentWithMessage = new Student(1L, "Joako", Set.of(
            new Subject("Matemática", 9D),
            new Subject("Física", 8D),
            new Subject("Química", 8D)));



    @Test
    @DisplayName("Prueba de obtenerDiplomaService por ID")
    public void analyzeScoresTestOK() {
        Double AverageEsperado = (9+8+8)/3.0;
        String messageEsperado = "El alumno Joako ha obtenido un promedio de 8,33. Puedes mejorar.";


        Mockito.when(studentRepository.findById(1L)).thenReturn(Optional.of(studentWithMessage));
        StudentWithMessageDTO studentWithMessageDTOBuscado = obtenerDiplomaService.analyzeScores(1L);

        Assertions.assertNotNull(studentWithMessageDTOBuscado); //prueba del analyzeScores
        Assertions.assertEquals(messageEsperado, studentWithMessageDTOBuscado.message());
        //prueba del getGretingMessage
        Assertions.assertEquals(AverageEsperado, studentWithMessageDTOBuscado.averageScore());
        //prueba del calculo del averageScore
    }

}
