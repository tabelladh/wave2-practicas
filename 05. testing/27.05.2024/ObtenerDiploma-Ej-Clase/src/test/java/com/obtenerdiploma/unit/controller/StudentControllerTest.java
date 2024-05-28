package com.obtenerdiploma.unit.controller;

import com.obtenerdiploma.controller.StudentController;
import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.dto.SubjectDTO;
import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;
import com.obtenerdiploma.exception.StudentNotFoundException;
import com.obtenerdiploma.repository.IStudentRepository;
import com.obtenerdiploma.repository.StudentRepository;
import com.obtenerdiploma.service.IStudentService;
import com.obtenerdiploma.service.StudentService;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Optional;
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

private static final StudentDTO studentDTO2 = new StudentDTO(2L, "Pedro", Set.of(
            new SubjectDTO("Lengua", 8D),
            new SubjectDTO("Física", 6D),
            new SubjectDTO("Química", 7D))
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
    @DisplayName("Get regiserStudent : OK")
    public void registerStudentTestOK() {

        HttpStatusCode statusEsperado = HttpStatus.OK;
        boolean rtaService = true;
        StudentDTO studEntrada = studentDTO1;
        ResponseEntity<?> responseEsperado = ResponseEntity.noContent().build();

        Mockito.when(studentService.create(studEntrada)).thenReturn(rtaService);
        ResponseEntity<?> rtaObtenida = studentController.registerStudent(studEntrada);

        Assertions.assertEquals( responseEsperado, rtaObtenida);

    }

    @Test
    @DisplayName("Get regiserStudent : NOK")
    public void registerStudentTestNOK() {

        HttpStatusCode statusEsperado = HttpStatus.BAD_REQUEST;
        boolean rtaService = false;
        StudentDTO studEntrada = studentDTO1;
        ResponseEntity<?> responseEsperado = ResponseEntity.badRequest().build();

        Mockito.when(studentService.create(studEntrada)).thenReturn(rtaService);
        ResponseEntity<?> rtaObtenida = studentController.registerStudent(studEntrada);

        Assertions.assertEquals( responseEsperado, rtaObtenida);

    }




    @Test
    @DisplayName("Get modifyStudent : OK")
    public void modifyStudentTestOK() {

        HttpStatusCode statusEsperado = HttpStatus.NO_CONTENT;
        boolean rtaService = true;
        StudentDTO studEntrada = studentDTO1;
        ResponseEntity<?> responseEsperado = ResponseEntity.noContent().build();

        Mockito.when(studentService.update(studEntrada)).thenReturn(rtaService);
        ResponseEntity<?> rtaObtenida = studentController.modifyStudent(studEntrada);

        Assertions.assertEquals( responseEsperado, rtaObtenida);

    }

    @Test
    @DisplayName("Get modifyStudent : NOK")
    public void modifyStudentTestNOK() {

        HttpStatusCode statusEsperado = HttpStatus.BAD_REQUEST;
        boolean rtaService = false;
        StudentDTO studEntrada = studentDTO1;
        ResponseEntity<?> responseEsperado = ResponseEntity.badRequest().build();

        Mockito.when(studentService.update(studEntrada)).thenReturn(rtaService);
        ResponseEntity<?> rtaObtenida = studentController.modifyStudent(studEntrada);

        Assertions.assertEquals( responseEsperado, rtaObtenida);

    }


    @Test
    @DisplayName("Get removeStudent : OK")
    public void removeStudentTestOK() {

        Long idEntrada =1L;
        boolean rtaService = true;
        ResponseEntity<?> responseEsperado = ResponseEntity.noContent().build();

        Mockito.when(studentService.delete(idEntrada)).thenReturn(rtaService);
        ResponseEntity<?> rtaObtenida = studentController.removeStudent(idEntrada);

        Assertions.assertEquals( responseEsperado, rtaObtenida);

    }

    @Test
    @DisplayName("Get removeStudent : NOK")
    public void removeStudentTestNOK() {

        Long idEntrada = 9L;
        boolean rtaService = false;
        ResponseEntity<?> responseEsperado = ResponseEntity.badRequest().build();

        Mockito.when(studentService.delete(idEntrada)).thenReturn(rtaService);
        ResponseEntity<?> rtaObtenida = studentController.removeStudent(idEntrada);

        Assertions.assertEquals( responseEsperado, rtaObtenida);

    }
    /*
    @GetMapping("/listStudents")
    public Set<StudentDTO> listStudents() {
        return this.studentService.getAll();
    }
    */
    @Test
    @DisplayName("Get listStudents : OK")
    public void listStudentsTestOK() {

        Set<StudentDTO> responseEsperado = Set.of(studentDTO1, studentDTO2);

        Mockito.when(studentService.getAll()).thenReturn(responseEsperado);
        Set<StudentDTO> rtaObtenida = studentController.listStudents();

        Assertions.assertEquals(responseEsperado, rtaObtenida);

    }
}
