package com.obtenerdiploma.unitTest.repository;

import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;
import com.obtenerdiploma.exception.StudentNotFoundException;
import com.obtenerdiploma.repository.IStudentRepository;
import com.obtenerdiploma.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Set;

public class StudentRepositoryTest {

    private static final Student student1 = new Student (1L, "Juan", Set.of(
            new Subject("Matemática", 9D),
            new Subject("Física", 7D),
            new Subject("Química", 6D)
    ));

    private static final Student student2 = new Student (2L, "Pedro", Set.of(
            new Subject("Matemática", 10D),
            new Subject("Física", 8D),
            new Subject("Química", 4D)
    ));

    // llamamos al metodo del repository
    IStudentRepository studentRepository = new StudentRepository(Set.of(student1, student2));

    @Test
    @DisplayName("01 - Test FindAll OK ")
    //public Set<Student> findAll() ----> el metodo que debemos testear devuelve una lista de estudiantes.

    public void testFindAllOk() {

        //ARRANGE

        Set <Student> listEsperada = Set.of(student1, student2); // tenemos los estudiantes que salen y deben ser igual que los del json.

        //ACT

        Set <Student> listObtenida = new StudentRepository(Set.of(student1, student2)).findAll(); // la lista obtenida es la que trae el metodo.

        //ASSERT

        Assertions.assertEquals(listEsperada, listObtenida, "No coinciden las listas");


    }

    @Test
    @DisplayName("02 - Test FindById OK ")
    //public Optional<Student> findById(Long id)
    public void testSaveOk() {

        //ARRANGE

        Long idDeEntrada = 1L; // el id de entrada
        Optional<Student> studentEsperado = Optional.of(student1); // el estudiante que sale.

        //ACT

        Optional<Student> studentObtenido = studentRepository.findById(idDeEntrada);

        //ASSERT

        Assertions.assertEquals(studentEsperado, studentObtenido, "No coinciden los estudiantes");

    }

    @Test
    @DisplayName("03 - Test Exist OK ")
    //public boolean exists(Student stu)
    public void testExistOk() {

        //ARRANGE

        Student studentDeEntrada = student1; //el estudiante que entra, podemos usar el que esta arriba creado student1 o student2.
        boolean studentExist = true; // sale un true si existe.

        //ACT

        boolean studentObtenido = studentRepository.exists(studentDeEntrada);

        //ASSERT

        Assertions.assertEquals(studentExist, studentObtenido, "No coinciden los estudiantes");

    }

    @Test
    @DisplayName("03 - Test Exist OK ")
    //public boolean exists(Student stu)
    public void testExistTestFail() {

        //ARRANGE

        // creamos un nuevo estudiante o podemos usar los que tenemos arriba harkcodeados.
        Student studentDeEntrada = new Student(3L, "Alejandro", Set.of(
                new Subject("Matemática", 9D),
                new Subject("Física", 7D),
                new Subject("Química", 6D)
        ));

        //ACT y ASSERT;

        Assertions.assertThrows(StudentNotFoundException.class, () -> studentRepository.exists(studentDeEntrada) );

    }




}
