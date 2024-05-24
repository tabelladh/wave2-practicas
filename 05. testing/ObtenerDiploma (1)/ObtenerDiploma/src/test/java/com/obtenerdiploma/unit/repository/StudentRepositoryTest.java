package com.obtenerdiploma.unit.repository;

import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;
import com.obtenerdiploma.exception.StudentNotFoundException;
import com.obtenerdiploma.repository.IStudentRepository;
import com.obtenerdiploma.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

public class StudentRepositoryTest {

    private static final Student student1 = new Student (1L, "Juan", Set.of(
            new Subject("Matemática", 9D),
            new Subject("Física", 7D),
            new Subject("Química", 6D))
    );

    private static final Student student2 = new Student (2L, "Pedro", Set.of(
            new Subject("Matemática", 10D),
            new Subject("Física", 8D),
            new Subject("Química", 4D))
    );

    IStudentRepository studentRepository = new StudentRepository(Set.of(student1, student2));

    // public Set<Student> findAll() {
    @Test
    @DisplayName("01- Test findAll ok ")
    public void testFindAllTestOK() {

        //ARRANGE
        Set<Student> listaEsperada = Set.of(student1, student2);

        //ACT
        Set<Student> listaobtenida = studentRepository.findAll();

        //ASSERT
        Assertions.assertEquals(listaEsperada, listaobtenida, "No coinciden las listas");
    }

    // public Optional<Student> findById(Long id) {
    @Test
    @DisplayName("02- Test findById ok ")
    public void testFindByIdTestOK() {
        //ARRANGE
        Long idDeEntrada = 1L;
        Optional<Student> studentEsperado = Optional.of(student1);

        //ACT
        Optional<Student> studentObtenido = studentRepository.findById(idDeEntrada);

        //ASSERT
        Assertions.assertEquals(studentEsperado, studentObtenido, "No coinciden las listas");

    }

    //public boolean exists(Student stu) {
    @Test
    @DisplayName("03- Test exists ok ")
    public void testExistsTestOK() {
        //ARRANGE
        boolean studentesperadoSiExiste = true;

        //ACT
        boolean studentObtenido = studentRepository.exists(student2);

        //ASSERT
        Assertions.assertEquals(studentesperadoSiExiste, studentObtenido, "No coinciden los students");
    }

    @Test
    @DisplayName("04- Test no exists")
    public void testExistsTestFAIL() {
        //ARRANGE
        Student studentDeEntrada = new Student(3L, "PEPE", Set.of(
                new Subject("Matemática", 9D),
                new Subject("Física", 7D),
                new Subject("Química", 6D))
        );

       //ACT & ASSERT
        Assertions.assertThrows(StudentNotFoundException.class, () -> studentRepository.exists(studentDeEntrada));
    }




}
