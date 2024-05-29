package com.obtenerdiploma.unitTest.controller;

import com.obtenerdiploma.controller.StudentController;
import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.dto.SubjectDTO;
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
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {

    @Mock
    StudentService studentservice;
    @InjectMocks
    StudentController studentcontroller;

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
    @DisplayName("Get student por id OK")

    /* @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getStudent(@PathVariable Long id) {
        return ResponseEntity.ok(this.studentService.read(id));
    } */
    public void getStudentOK() {

        //Arrange

//        ResponseEntity<?> respuestaEsperada = new ResponseEntity<>(studentDTO1, HttpStatus.OK);

        //ACT
        Mockito.when(studentservice.read(1L)).thenReturn(studentDTO1);
        ResponseEntity<?> respuestaObtenido = studentcontroller.getStudent(1L); //return ResponseEntity.ok(this.studentService.read(id));

        //ASSERT
        Assertions.assertEquals(HttpStatus.OK, respuestaObtenido.getStatusCode());
        Assertions.assertEquals(studentDTO1, respuestaObtenido.getBody());
    }

    @Test
    @DisplayName("Post Register Student")
    // public ResponseEntity<?> registerStudent(@RequestBody @Valid StudentDTO stu) {
    // return this.studentService.create(stu) ? ResponseEntity.noContent().build() : ResponseEntity.badRequest().build();

    public void postRegisterStudentOK() {

        ResponseEntity<?> responseEsperado = ResponseEntity.noContent().build();

        Mockito.when(studentservice.create(studentDTO1)).thenReturn(true);
        ResponseEntity<?> respuestaObtenido = studentcontroller.registerStudent(studentDTO1);

        Assertions.assertEquals(responseEsperado.getStatusCode(), respuestaObtenido.getStatusCode());
        Assertions.assertEquals(responseEsperado.getBody(), respuestaObtenido.getBody());

    }






}
