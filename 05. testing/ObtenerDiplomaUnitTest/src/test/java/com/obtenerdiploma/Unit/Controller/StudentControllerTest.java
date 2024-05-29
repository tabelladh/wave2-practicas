package com.obtenerdiploma.Unit.Controller;

import com.obtenerdiploma.controller.StudentController;
import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.dto.SubjectDTO;
import com.obtenerdiploma.service.StudentService;
import org.apache.coyote.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {

    @Mock
    private StudentService studentService;
    @InjectMocks
    private StudentController studentController;

    private static final StudentDTO studentDTO1 = new StudentDTO(1L, "Juan", Set.of(
            new SubjectDTO("Matemática", 9D),
            new SubjectDTO("Física", 7D),
            new SubjectDTO("Química", 6D))
    );

    private static final StudentDTO studentFail = new StudentDTO(3L, "Carlos",
            Set.of(
                    new SubjectDTO("Literatura", 4.0),
                    new SubjectDTO("Historia", 3.5),
                    new SubjectDTO("Geografía", 2.0)
            )
    );


    @Test
    @DisplayName("Get Student/id : OK")
    public void getStudentIdTestOK() {

        Long idEntrada = 1L;
        HttpStatusCode statusEsperado = HttpStatus.OK;
        StudentDTO rtaEsperada = studentDTO1;
        ResponseEntity<?> responseEsperado = new ResponseEntity<>(rtaEsperada, statusEsperado);

        Mockito.when(studentService.read(idEntrada)).thenReturn(rtaEsperada);
        ResponseEntity<?> rtaObtenida = studentController.getStudent(idEntrada);

        Assertions.assertEquals( responseEsperado, rtaObtenida);

    }


    @Test
    @DisplayName("Register Test OK")
    public void registerStudentTestOK() {
        HttpStatusCode statusEsperado = HttpStatus.NO_CONTENT;
        ResponseEntity<?> responseEsperado = ResponseEntity.noContent().build();

        Mockito.when(studentService.create(studentDTO1)).thenReturn(true);
        ResponseEntity<?> rtaObtenida = studentController.registerStudent(studentDTO1);

        Assertions.assertEquals(responseEsperado, rtaObtenida);

    }

    @Test
    @DisplayName("Register Test NO OK")
    public void registerStudentTestNOK() {
        HttpStatusCode statusEsperado = HttpStatus.BAD_REQUEST;
        ResponseEntity<?> responseEsperado = ResponseEntity.badRequest().build();

        Mockito.when(studentService.create(studentFail)).thenReturn(false);
        ResponseEntity<?> rtaObtenida = studentController.registerStudent(studentFail);

        Assertions.assertEquals(responseEsperado, rtaObtenida);
    }

    @Test
    @DisplayName("Modify Student OK")
    public void modifyStudentTestOK() {
        HttpStatusCode statusEsperado = HttpStatus.NO_CONTENT;
        ResponseEntity<?> responseEsperado = ResponseEntity.noContent().build();

        Mockito.when(studentService.update(studentDTO1)).thenReturn(true);
        ResponseEntity<?> rtaObtenida = studentController.modifyStudent(studentDTO1);

        Assertions.assertEquals(responseEsperado, rtaObtenida);

    }

    @Test
    @DisplayName("Modify Student NO OK")
    public void modifyStudentTestNOK() {
        HttpStatusCode statusEsperado = HttpStatus.BAD_REQUEST;
        ResponseEntity<?> responseEsperado = ResponseEntity.badRequest().build();

        Mockito.when(studentService.update(studentFail)).thenReturn(false);
        ResponseEntity<?> rtaObtenida = studentController.modifyStudent(studentFail);

        Assertions.assertEquals(responseEsperado, rtaObtenida);
    }

    @Test
    @DisplayName("List Student Test OK")
    public void listStudentTestOK() {
        Set<StudentDTO> esperado = Set.of(studentDTO1);
        
        Mockito.when(studentService.getAll()).thenReturn(esperado);
        Set<StudentDTO> obtenido = studentController.listStudents();

        Assertions.assertEquals(esperado, obtenido);
    }

}
