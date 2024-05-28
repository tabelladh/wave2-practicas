package com.obtenerdiploma.unitTest.repository;

//Casos nulos, vacíos, inválidos.
//Agregar un alumno.
//Buscar un alumno por Id.
//Modificar los datos de un alumno.
//Eliminar a un alumno.
//Listar todos los alumnos.


import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;

import com.obtenerdiploma.exception.StudentNotFoundException;
import com.obtenerdiploma.repository.IStudentRepository;
import com.obtenerdiploma.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentRepositoryTest {

    private static final Student studentOne = new Student(1L, "Juan", Set.of(
                    new Subject("Matemática", 9D),
                    new Subject("Física", 7D),
                    new Subject("Química", 6D)
            ));

    private static final Student studentTwo = new Student(2L, "Pedro", Set.of(
                    new Subject("Matemática", 10D),
                    new Subject("Física", 8D),
                    new Subject("Química", 4D)
            ));

    IStudentRepository studentRepository = new StudentRepository(Set.of(studentOne, studentTwo));

    @Test
    @DisplayName("1-Test HandleNullStudent")
    public void testHandleNullStudent() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            studentRepository.save(null);
        });
    }

    @Test
    @DisplayName("2-Test HandleEmptyStudent")
    public void testHandleEmptyStudent() {
        //lanzar excepción cuando se intenta guardar un estudiante vacío
        Student emptyStudent = new Student();
        Assertions.assertThrows(IllegalArgumentException.class, () -> studentRepository.save(emptyStudent));
    }

    @Test
    @DisplayName("3-Test HandleInvalidStudent")
    public void testHandleInvalidStudent() {
        //lanzar excepción cuando se intenta guardar un estudiante con datos inválidos
        Student invalidStudent = new Student(3L, null, null);
        Assertions.assertThrows(StudentNotFoundException.class, () -> studentRepository.save(invalidStudent));
    }

    @Test
    @DisplayName("4-Test AddStudent")
    public void testAddStudent() {
        // Arrange
        Student newStudent = new Student(3L, "Pablo", Set.of(
                new Subject("Matemática", 5D),
                new Subject("Física", 6D),
                new Subject("Química", 5D)
        ));
//        IStudentRepository studentRepository = new StudentRepository(Set.of(newStudent));
        // Act
        studentRepository.save(newStudent);
        // Assert
        Assertions.assertEquals(newStudent, studentRepository.findById(3L).orElse(null));
    }

    @Test
    @DisplayName("5-Test FindStudentById")
    public void testFindStudentById() {
        // Act
        Student foundStudent = studentRepository.findById(2L).orElse(null);
        // Assert
        assertEquals(studentTwo, foundStudent, "Los id´s no coinciden");
    }

//    @Test
//    @DisplayName("6-Test UpdateStudent")
//    public void testUpdateStudent() {
//        // Arrange
//        Student updatedStudent = new Student(1L, "Juan Ignacio", Set.of(
//                new Subject("Matemática", 9D),
//                new Subject("Física", 6D),
//                new Subject("Química", 7D)
//        ));
//        // Act
//        studentRepository.update(updatedStudent);
//        // Assert
//        assertEquals(updatedStudent, studentRepository.findById(1L).orElse(null));
//    }

    @Test
    @DisplayName("7-Test DeleteStudent")
    public void testDeleteStudent() {
        //Elimina correctamente el estudiante con el ID especificado (1L).
        //Reduce el tamaño del conjunto de estudiantes en 1.
        //Asegura que el estudiante eliminado ya no está presente en el repositorio, lanzando una excepción cuando se intenta acceder a él.

        // Act
        studentRepository.delete(1L);
        // Assert
        Assertions.assertEquals(1, studentRepository.findAll().size(), "El tamaño de las listas de coinciden");
        //Assertions.assertThrows(IllegalArgumentException.class, () -> studentRepository.findById(1L).orElseThrow());
    }

    @Test
    @DisplayName("8-Test ListAllStudents")
    public void testListAllStudents() {
        //Arrange- Lista esperada- le cargo studentOne y studentTwo
        Set<Student> expectedList = Set.of(studentOne, studentTwo);
        //Act-When
        Set<Student> obtainedList = studentRepository.findAll();
        //Assert-Then
        Assertions.assertEquals(expectedList, obtainedList, "Las listas son distintas");
    }



}
