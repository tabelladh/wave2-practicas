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
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    private static final Student student1 = new Student(1L, "Juan", Set.of(
            new Subject("Matemática", 9D),
            new Subject("Física", 7D),
            new Subject("Química", 6D))
    );

    private static final StudentDTO studentDTO1 = new StudentDTO(1L, "Juan", Set.of(
            new SubjectDTO("Matemática", 9D),
            new SubjectDTO("Física", 7D),
            new SubjectDTO("Química", 6D))
    );

    private static final Student student2 = new Student(2L, "Pedro", Set.of(
            new Subject("Matemática", 10D),
            new Subject("Física", 8D),
            new Subject("Química", 4D))
    );

    private static final StudentDTO studentDTO2 = new StudentDTO(4L, "Lucas", Set.of(
            new SubjectDTO("Matemática", 9D),
            new SubjectDTO("Física", 7D),
            new SubjectDTO("Química", 6D))
    );


    //    public boolean create(StudentDTO stu)
    @Test
    @DisplayName("test 01: create ok")
    public void createTestOk() {

        //ARR
        boolean esperado = true;

        //ACT
        when(studentRepository.save(student1)).thenReturn(esperado);
        boolean obtenido = studentService.create(studentDTO1);

        //ASS
        Assertions.assertEquals(esperado, obtenido, "no es el mismo estudiante");

    }

    @Test
    @DisplayName("test02: usuario ok")
    public void testReadOk() {

        //ARR
        Long idEntrada = 1L;
        StudentDTO esperado = studentDTO1;
        Optional<Student> estudianteObtenido = Optional.of(student1);

        //ACT
        when(studentRepository.findById(idEntrada)).thenReturn(estudianteObtenido);
        StudentDTO obtenido = studentService.read(idEntrada);

        //ASS
        Assertions.assertEquals(esperado, obtenido);

    }

    @Test
    @DisplayName("test03: usuario fail")
    public void testCaminoTriste() {

        //ARR
        Long idEntrada = 3L;
        Optional<Student> estudianteObtenido = Optional.empty();

        //ACT
        when(studentRepository.findById(idEntrada)).thenReturn(estudianteObtenido);

        Assertions.assertThrows(StudentNotFoundException.class,
                () -> studentService.read(idEntrada));
    }

    @Test
    @DisplayName("test04 update ok")
    public void testUpdateOk() {
        //ARR
        Student esperado = student1;
        StudentDTO obtenido = studentDTO1;

        when(studentRepository.save(esperado)).thenReturn(true);

        // ACT
        boolean actualizado = studentService.update(obtenido);

        //ASS
        assertTrue(actualizado);

    }

    @Test
    @DisplayName("test05 delite ok")
    public void testDeleteOk() {
        //ARR
        Long idEntrada = 1L;
        boolean esperado = true;

        //ACT
        when(studentRepository.delete(idEntrada)).thenReturn(esperado);
        boolean resultado = studentService.delete(idEntrada);

        //ASS
        assertTrue(resultado, "La eliminación debería ser exitosa.");
    }

    @Test
    @DisplayName("Test06 listar estudiantes ok")
    public void testGetAllOk() {
        //ARR
        Set<StudentDTO> listEsperada = Set.of(studentDTO1, studentDTO2);

        //ACT
        when(studentService.getAll()).thenReturn(listEsperada);
        Set<Student> obtenida = studentRepository.findAll();

        //ASS
        Assertions.assertEquals(listEsperada, obtenida);
    }

}
