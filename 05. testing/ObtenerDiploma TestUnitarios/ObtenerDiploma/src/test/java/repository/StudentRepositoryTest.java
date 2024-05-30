package repository;


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

import static org.mockito.Mockito.mock;

public class StudentRepositoryTest {

    private static final Student student1 = new Student (1L, "Juan", Set.of(new Subject("Matemática", 9D),
            new Subject("Física", 7D),
            new Subject("Química", 6D))

    );

    private static final Student student2 = new Student (2L, "Pedro", Set.of(
            new Subject("Matemática", 10D),
            new Subject("Física", 8D),
            new Subject("Química", 4D))
    );

    private static final Student student3 = new Student (3L, "Jaime", Set.of(
            new Subject("Matemática", 6D),
            new Subject("Física", 7D),
            new Subject("Química", 7D))
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
    // public boolean save(Student stu)
    @Test
    @DisplayName("Test save ok")
    public void testSaveTestOK() {
        // Act
        boolean saved = studentRepository.save(student3);

        // Assert
        Assertions.assertTrue(saved, "Se esperaba que el estudiante se guardara correctamente");
    }

    //public boolean delete(Long id)
    @Test
    @DisplayName("03- Test delete ok ")
    public void testDeleteTestOK() {
        //ACT
        boolean studentAEliminar = studentRepository.delete(1L);

        //ASSERT
        Assertions.assertTrue(studentAEliminar, "Esperabamos que el student se eliminara correctamente");

        //Le pasamos el ID de un student y esperamos que lo elimine (si lo elimina devuelve TRUE)
    }

    @Test
    @DisplayName("03- Test delete Fail")
    public void testDeleteTestFAIL() {
        //ASSERT
        Assertions.assertThrows(StudentNotFoundException.class, () -> {
            studentRepository.delete(3L);}, "Se esperaba que se lanzara StudentNotFoundException al intentar eliminar un estudiante que no existe");
    }//llamamos a la excepcion (StudentNotFoundException del metodo DELETE) al pasarle un ID de un alumno que no existe



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
