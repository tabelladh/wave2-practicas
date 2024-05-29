package com.obtenerdiploma.unitTest.service;

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

@ExtendWith(MockitoExtension.class)

public class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    private static final Student student1 = new Student (1L, "Juan", Set.of(
            new Subject("Matemática", 9D),
            new Subject("Física", 7D),
            new Subject("Química", 6D)
    ));

    private static final StudentDTO studentDTO1 = new StudentDTO (1L, "Juan", Set.of(
            new SubjectDTO("Matemática", 9D),
            new SubjectDTO("Física", 7D),
            new SubjectDTO("Química", 6D)
    ));

    private static final StudentDTO studentDTO2 = new StudentDTO(1L, "Juan", Set.of(
            new SubjectDTO("Matemática", 0D),
            new SubjectDTO("Física", 0D),
            new SubjectDTO("Química", 0D))
    );

    @Test
    @DisplayName("Test create OK")
    //public boolean create(StudentDTO stu)
    public void testCreateOK() {

        //ARRANGE
        boolean studentCreado = true; // sale un true cuando lo crea.

        //ACT
        Mockito.when(studentRepository.save(student1)).thenReturn(studentCreado); //return studentRepository.save(studentEntity);
        boolean studentObtenido = studentService.create(studentDTO1); //public boolean create(StudentDTO stu)

        //ASSERT
        Assertions.assertEquals(studentCreado, studentObtenido, "los alumnos no son iguales");
    }

    @Test
    @DisplayName("Test read OK")
    //public Optional<Student> findById(Long id)
    // public StudentDTO read(Long id)
    public void testReadOK() {

        //ARRANGE
        Long idDeEntrada = 1L; // entra un id.
        Optional<Student> studentEsperado = Optional.of(student1); // se espera un student.
        StudentDTO studentDTOEsperado = studentDTO2; // se espera un studentDTO.

        //ACT
        Mockito.when(studentRepository.findById(idDeEntrada)).thenReturn(studentEsperado); //public Optional<Student> findById(Long id)
        StudentDTO studentDTOObtenido = studentService.read(idDeEntrada); // public StudentDTO read(Long id)

        //ASSERT
        Assertions.assertEquals(studentDTOEsperado, studentDTOObtenido, "Los alumnos no son iguales");

    }

    @Test
    @DisplayName("Read Student NOK")
    //public Optional<Student> findById(Long id)
    // public StudentDTO read(Long id)
    public void readTestNOK() {

        //ACT
        Long idEntrada= 3L; // entra un id que no existe.
        Optional<Student> studentEsperado = Optional.empty(); // sale vacio.

        //ACT & ASSERT
        Mockito.when(studentRepository.findById(idEntrada)).thenReturn(studentEsperado);
        Assertions.assertThrows(StudentNotFoundException.class, () -> studentService.read(idEntrada));

    }
    @Test
    @DisplayName("Update student OK")
    //public boolean save(Student stu)
    // boolean update(StudentDTO stu)
    public void updateTestOK() {

        Mockito.when(studentRepository.save(student1)).thenReturn(true); //public boolean save(Student stu)
        boolean studentObtenido = studentService.update(studentDTO1); // boolean update(StudentDTO stu)

        Assertions.assertEquals(true, studentObtenido);
    }

    @Test
    @DisplayName("Update student NOK")
    // public boolean exists(Student stu)
    // public boolean save(Student stu)
    // public boolean update(StudentDTO stu)
    public void updateTestNOK() {

        Mockito.when(studentRepository.save(student1)).thenReturn(false);
        Assertions.assertThrows(StudentNotFoundException.class, () -> studentService.update(studentDTO1));
    }





}
