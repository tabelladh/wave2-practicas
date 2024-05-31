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

    /*@PostMapping("/registerStudent")
    public ResponseEntity<?> registerStudent(@RequestBody @Valid StudentDTO stu) {

        return this.studentService.create(stu) ? ResponseEntity.noContent().build() : ResponseEntity.badRequest().build();
    }

     */
    @Test
    @DisplayName("Get regiserStudent : OK")
    public void registerStudentTestOK() {

        

    }
}
