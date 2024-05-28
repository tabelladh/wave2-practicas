package controller;


import com.obtenerdiploma.controller.StudentController;
import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.dto.SubjectDTO;
import com.obtenerdiploma.entity.Student;
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
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.HashSet;
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
    private static final StudentDTO studentDTO2 = new StudentDTO (2L, "Pedro", Set.of(
            new SubjectDTO("Matemática", 10D),
            new SubjectDTO("Física", 8D),
            new SubjectDTO("Química", 4D))
    );
    private static final StudentDTO studentDTO3 = new StudentDTO(3L, "Joako", Set.of(
            new SubjectDTO("Matemática", 0D),
            new SubjectDTO("Física", 0D),
            new SubjectDTO("Química", 0D))
    );

    @Test
    @DisplayName("Test register student")
    public void testRegisterStudent() {

        Mockito.when(studentService.create(studentDTO3)).thenReturn(true);
        ResponseEntity<?> response = studentController.registerStudent(studentDTO3);

        Assertions.assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }


    @Test
    @DisplayName("Test get student")
    public void testGetStudent() {

        Mockito.when(studentService.read(2L)).thenReturn(studentDTO2);
        ResponseEntity<?> response = studentController.getStudent(2L);

        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()); //obtengo el statuscode de RESPONSE
        Assertions.assertEquals(studentDTO2, response.getBody()); //obtengo el body(en este caso es un studentDTO) del RESPONSE
    }

    @Test
    @DisplayName("Test modify student")
    public void testModifyStudent() {

        Mockito.when(studentService.update(studentDTO1)).thenReturn(true);
        ResponseEntity<?> response = studentController.modifyStudent(studentDTO1);

        Assertions.assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());


    }

    @Test
    @DisplayName("Test remove student")
    public void testRemoveStudent() {

        Mockito.when(studentService.delete(2L)).thenReturn(true);
        ResponseEntity<?> response = studentController.removeStudent(2L);

        Assertions.assertTrue(studentService.delete(2L));
        Assertions.assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }
    //Set<StudentDTO> getAll()
    //Set<StudentDTO> listStudents()
    @Test
    @DisplayName("Test list student")
    public void testListStudent() {
        Set<StudentDTO> listStudentsDTO = new HashSet<>(Arrays.asList(studentDTO1, studentDTO2, studentDTO3));

        Mockito.when(studentService.getAll()).thenReturn(listStudentsDTO); //van las inyeccions de tu controlador
        Set<StudentDTO> actualStudents = studentController.listStudents(); //creas la variable llamando al metodo de la capa trabajada


        Assertions.assertEquals(actualStudents, listStudentsDTO);
    }
}
