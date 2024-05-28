package com.obtenerdiploma.unit.service;


import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.dto.SubjectDTO;
import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;
import com.obtenerdiploma.exception.StudentNotFoundException;
import com.obtenerdiploma.repository.StudentRepository;
import com.obtenerdiploma.service.StudentService;
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
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    private static final Student student1 = new Student (1L, "Juan", Set.of(
            new Subject("Matemática", 9D),
            new Subject("Física", 7D),
            new Subject("Química", 6D))
    );

    private static final StudentDTO studentDTO1 = new StudentDTO(1L, "Juan", Set.of(
            new SubjectDTO("Matemática", 9D),
            new SubjectDTO("Física", 7D),
            new SubjectDTO("Química", 6D))
    );
    private static final StudentDTO studentDTO2 = new StudentDTO(1L, "Juan", Set.of(
            new SubjectDTO("Matemática", 0D),
            new SubjectDTO("Física", 0D),
            new SubjectDTO("Química", 0D))
    );

    private static final Student student2 = new Student (2L, "Pedro", Set.of(
            new Subject("Matemática", 10D),
            new Subject("Física", 8D),
            new Subject("Química", 4D))
    );

    @Test
    @DisplayName("Crear Student OK")
    public void createTestOK() {
        //ARRANGE
        boolean studentCreadoEsperado = true;

        //ACT
        Mockito.when(studentRepository.save(student1)).thenReturn(studentCreadoEsperado);
        boolean studentCreadoObtenido = studentService.create(studentDTO1);

        //ASSERT
        Assertions.assertEquals(studentCreadoEsperado, studentCreadoObtenido, "El Student es distinto");
    }

@Test
@DisplayName("Read Student OK")
public void readTestOK() {

    //ACT
    StudentDTO studentDTOEsperado = studentDTO2;
    Optional<Student> studentEsperado = Optional.of(student1);
    Long idEntrada= 1L;

    //ACT
    Mockito.when(studentRepository.findById(idEntrada)).thenReturn(studentEsperado);
    StudentDTO studentDTOObtenido = studentService.read(idEntrada);

    //ASSERT
    Assertions.assertEquals(studentDTOEsperado, studentDTOObtenido, "El StudentDTO es distinto");
    
}

    @Test
    @DisplayName("Read Student NOK")
    public void readTestNOK() {

        //ACT
        Long idEntrada= 3L;
        Optional<Student> studentEsperado = Optional.empty();

        //ACT & ASSERT
        Mockito.when(studentRepository.findById(idEntrada)).thenReturn(studentEsperado);
        Assertions.assertThrows(StudentNotFoundException.class, () -> studentService.read(idEntrada));

}

    @Test
    @DisplayName("Update Student OK")
        public void updateTestOK() {
        StudentDTO entrada = studentDTO1;
        Student entrada2 = student1;
        boolean esperado = true;

        Mockito.when(studentRepository.save(entrada2)).thenReturn(true);
        boolean obtenido = studentService.update(entrada);

        Assertions.assertEquals(esperado, obtenido, "UPDATE: No coincide esperado y obtenido ");

    }

    @Test //Se genero duda sobre como implementar este test.
    @DisplayName("Update Student NOK")
    public void updateTestNOK() {
        StudentDTO entrada = studentDTO1;
        Student entrada2 = student1;
        boolean esperado = false;

        Mockito.when(studentRepository.save(entrada2)).thenReturn(esperado);
        boolean obtenido = studentService.update(studentDTO1);

        Assertions.assertEquals(esperado, obtenido, "UPDATE: No coincide esperado y obtenido ");

    }
}
