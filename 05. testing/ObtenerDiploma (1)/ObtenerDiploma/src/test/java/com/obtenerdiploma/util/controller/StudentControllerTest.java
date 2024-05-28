package com.obtenerdiploma.util.controller;

import com.obtenerdiploma.controller.StudentController;
import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.dto.SubjectDTO;
import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;
import com.obtenerdiploma.exception.StudentNotFoundException;
import com.obtenerdiploma.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.Set;

import static org.mockito.Mockito.when;

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

    private static final StudentDTO student2 = new StudentDTO (2L, "Pedro", Set.of(
            new SubjectDTO("Matemática", 10D),
            new SubjectDTO("Física", 8D),
            new SubjectDTO("Química", 4D))
    );

    @Test
    @DisplayName("test 01: register ok")
    public void registerStudentTest(){

        //ARR
        boolean rtaEsperada = true;
        Enum status = HttpStatus.CREATED;

        //ACT
        when(studentService.create(studentDTO1)).thenReturn(rtaEsperada);
        ResponseEntity<?> response = studentController.registerStudent(studentDTO1);
        HttpStatusCode statusObtenido = studentController.registerStudent(studentDTO1).getStatusCode();

        //ASS
        Assertions.assertEquals(response.getStatusCode(), statusObtenido);

    }

    @Test
    @DisplayName("test 02: register fail")
    public void registerStudentTestFail(){

        StudentDTO student3 = new StudentDTO (2L, "Pedro", Set.of(
                new SubjectDTO("Matemática", 10D),
                new SubjectDTO("Física", 8D),
                new SubjectDTO("Química", 4D))
        );


        //ACT
        when(studentService.create(student3)).thenReturn(false);
//        ResponseEntity<?> response = studentController.registerStudent(student3);
        HttpStatusCode statusObtenido = studentController.registerStudent(student3).getStatusCode();

        //ASS
        Assertions.assertEquals(HttpStatus.BAD_REQUEST, statusObtenido);

    }

    @Test
    @DisplayName("test03: findStudent ok")
    public void getStudentOk(){

        //ARR
        Long idDeEntrada = 1L;

        HttpStatusCode statusEsperado = HttpStatus.OK;

        //ACT
        when(studentService.read(idDeEntrada)).thenReturn(studentDTO1);
        ResponseEntity<?> dtoObtenido = studentController.getStudent(idDeEntrada);

        //ASSERT
        Assertions.assertEquals(statusEsperado, dtoObtenido.getStatusCode(), "Los StatusCode son diferentes");
    }

    @Test
    @DisplayName("test04: upDate ok")
    public void modifyStudentOk(){

        //ARR
        boolean rtaEsperada = true;
        Enum status = HttpStatus.OK;

        //ACT
        when(studentService.update(studentDTO1)).thenReturn(rtaEsperada);
        ResponseEntity<?> response = studentController.modifyStudent(studentDTO1);
        HttpStatusCode statusObtenido = studentController.modifyStudent(studentDTO1).getStatusCode();

        //ASS
        Assertions.assertEquals(response.getStatusCode(), statusObtenido);
    }

    @Test
    @DisplayName("test05: upDateFail")
    public void modifyStudentFail(){

        StudentDTO student3 = new StudentDTO (2L, "Pedro", Set.of(
                new SubjectDTO("Matemática", 10D),
                new SubjectDTO("Física", 8D),
                new SubjectDTO("Química", 4D))
        );


        //ACT
        when(studentService.update(student3)).thenReturn(false);
        HttpStatusCode statusObtenido = studentController.modifyStudent(student3).getStatusCode();

        //ASS
        Assertions.assertEquals(HttpStatus.BAD_REQUEST, statusObtenido);

    }

    @Test
    @DisplayName("test06: deleteOk")
    public void removeStudentOk(){
        //ARR
        Long idDeEntrada = 1L;

        HttpStatusCode statusEsperado = HttpStatus.NO_CONTENT;

        //ACT
        when(studentService.delete(idDeEntrada)).thenReturn(true);
        ResponseEntity<?> dtoObtenido = studentController.removeStudent(idDeEntrada);

        //ASSERT
        Assertions.assertEquals(statusEsperado, dtoObtenido.getStatusCode(), "Los StatusCode son diferentes");
    }

    @Test
    @DisplayName("test07: deleteFail")
    public void removeStudentFail(){
        //ARR
        Long idDeEntrada = 1L;

        HttpStatusCode statusEsperado = HttpStatus.BAD_REQUEST;

        //ACT
        when(studentService.delete(idDeEntrada)).thenReturn(false);
        ResponseEntity<?> dtoObtenido = studentController.removeStudent(idDeEntrada);

        //ASSERT
        Assertions.assertEquals(statusEsperado, dtoObtenido.getStatusCode());
    }

    @Test
    @DisplayName("test 08: listado ok")
    public void ListStudentTestOk(){

        //ARR
        Set<StudentDTO> list = Set.of(studentDTO1,student2);
        //ACT
        when(studentService.getAll()).thenReturn(list);
        Set<StudentDTO> listObtenida = studentService.getAll();
        //ASS
        Assertions.assertEquals(list,listObtenida);

    }

}
