package service;


import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.dto.SubjectDTO;
import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;
import com.obtenerdiploma.exception.StudentNotFoundException;
import com.obtenerdiploma.repository.IStudentRepository;
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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @Mock //@Autowired
    private StudentRepository studentRepository;

    @InjectMocks // la capa con la que trabajo
    private StudentService studentService;


    private static final StudentDTO studentDTO1 = new StudentDTO(1L, "Juan", Set.of(
            new SubjectDTO("Matemática", 9D),
            new SubjectDTO("Física", 7D),
            new SubjectDTO("Química", 6D))
    );
    private static final Student student1 = new Student(1L, "Juan", Set.of(
            new Subject("Matemática", 9D),
            new Subject("Física", 7D),
            new Subject("Química", 6D))
    );

    private static final StudentDTO studentDTO2 = new StudentDTO (2L, "Pedro", Set.of(
            new SubjectDTO("Matemática", 10D),
            new SubjectDTO("Física", 8D),
            new SubjectDTO("Química", 4D))
    );

    private static final Student student3 = new Student(3L, "Joako", Set.of(
            new Subject("Matemática", 0D),
            new Subject("Física", 0D),
            new Subject("Química", 0D))
    );

    private static final StudentDTO studentDTO3 = new StudentDTO(3L, "Joako", Set.of(
            new SubjectDTO("Matemática", 0D),
            new SubjectDTO("Física", 0D),
            new SubjectDTO("Química", 0D))
    );

    @Test
    @DisplayName("Crear Student OK")
    public void createTestOK() {

        //ACT
        Mockito.when(studentRepository.save(student1)).thenReturn(true);
        boolean studentCreadoObtenido = studentService.create(studentDTO1);

        //ASSERT
        Assertions.assertEquals(true, studentCreadoObtenido, "El Student deberia haberse creado");
    }

    @Test
    @DisplayName("Buscar por ID")
    public void findByIdTestOK() {

        Mockito.when(studentRepository.findById(3L)).thenReturn(Optional.of(student3));
        StudentDTO studentBuscado = studentService.read(3L);

        Assertions.assertEquals(studentDTO3, studentBuscado, "El Student es el mismo");
    }

    @Test
    @DisplayName("Actualizar un Student")
    public void updateTestOK() {

        Mockito.when(studentRepository.save(student3)).thenReturn(true);
        boolean studentActualizado = studentService.update(studentDTO3);


        Assertions.assertEquals(true, studentActualizado, "Student actualizado");

    }

    @Test
    @DisplayName("Eliminar un Student")
    public void deletedTestOK() {
        Mockito.when(studentRepository.delete(1L)).thenReturn(true);
        boolean studentDeleted = studentService.delete(1L);


        Assertions.assertEquals(true, studentDeleted, "Se deberia eliminar 1 student");

    }
    //public Set<Student> findAll() {
    //public Set<StudentDTO> getAll()
    @Test
    @DisplayName("Crear un Set<DTO>")
    public void getAllTestOK() {

        Set<Student> studentsList = new HashSet<>(Arrays.asList(student1, student3));

        Mockito.when(studentRepository.findAll()).thenReturn(studentsList);
        Set<StudentDTO> studentsDTO = studentService.getAll();


        Assertions.assertEquals(2, studentsDTO.size(), "Cantidad de students 2");

    }




}
