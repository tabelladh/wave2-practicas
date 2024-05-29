package com.obtenerdiploma.util.service;

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

import static org.mockito.Mockito.when;

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

    private static final Student student2 = new Student (2L, "Pedro", Set.of(
            new Subject("Matemática", 10D),
            new Subject("Física", 8D),
            new Subject("Química", 4D))
    );


//    public boolean create(StudentDTO stu)
    @Test
    @DisplayName("test 01: create ok")
    public void createTestOk(){

        //ARR
        boolean esperado = true;

        //ACT
        when(studentRepository.save(student1)).thenReturn(esperado);
        boolean obtenido = studentService.create(studentDTO1);

        //ASS
        Assertions.assertEquals(esperado,obtenido,"no es el mismo estudiante");

    }

    @Test
    @DisplayName("test02: usuario ok")
    public void testReadOk(){

        //ARR
        Long idEntrada = 1L;
        StudentDTO esperado = studentDTO1;
        Optional<Student> estudianteObtenido = Optional.of( student1);

        //ACT
        when(studentRepository.findById(idEntrada)).thenReturn(estudianteObtenido);
        StudentDTO obtenido = studentService.read(idEntrada);

        //ASS
        Assertions.assertEquals(esperado,obtenido);

    }

    @Test
    @DisplayName("test03: usuario fail")
    public void testCaminoTriste(){

        //ARR
        Long idEntrada = 3L;
        Optional<Student> estudianteObtenido = Optional.empty();

        //ACT
        when(studentRepository.findById(idEntrada)).thenReturn(estudianteObtenido);

        Assertions.assertThrows(StudentNotFoundException.class,
                ()-> studentService.read(idEntrada));
    }
}
