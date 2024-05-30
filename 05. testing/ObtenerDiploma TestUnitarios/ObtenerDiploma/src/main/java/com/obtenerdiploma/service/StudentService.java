package com.obtenerdiploma.service;

import com.obtenerdiploma.dto.StudentDTO;
import com.obtenerdiploma.dto.SubjectDTO;
import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.entity.Subject;
import com.obtenerdiploma.exception.StudentNotFoundException;
import com.obtenerdiploma.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentRepository studentRepository;

    @Override
    public boolean create(StudentDTO stu) {

        Student studentEntity = new Student(
                stu.id(),
                stu.studentName(),
                stu.email(),
                stu.url(),
                stu.subjects().stream().map(
                        s -> new Subject(s.name(), s.score())
                ).collect(Collectors.toSet())
        );

        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentDTO read(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() ->{throw new StudentNotFoundException(id);
        });
        return new StudentDTO(
                student.getId(),
                student.getStudentName(),
                student.getEmail(),
                student.getUrl(),
                student.getSubjects().stream().map(
                        subject -> new SubjectDTO(
                                subject.getName(),
                                0D
                        )).collect(Collectors.toSet())
        );
    }

    @Override
    public boolean update(StudentDTO stu) {
        Student studentEntity = new Student(
                stu.id(),
                stu.studentName(),
                stu.email(),
                stu.url(),
                stu.subjects().stream().map(
                        s -> new Subject(s.name(), s.score())
                ).collect(Collectors.toSet())
        );

        return studentRepository.save(studentEntity);
    }

    @Override
    public boolean delete(Long id) {
        return studentRepository.delete(id);
    }

    @Override
    public Set<StudentDTO> getAll() {
        return this.studentRepository.findAll().stream()
                .map(
                        s -> new StudentDTO(
                                s.getId(),
                                s.getStudentName(),
                                s.getEmail(),
                                s.getUrl(),
                                s.getSubjects().stream().map(
                                        subject -> new SubjectDTO(
                                                subject.getName(),
                                                subject.getScore()
                                        )).collect(Collectors.toSet())
                                )
                        ).collect(Collectors.toSet());
    }
}
//@ExtendWith(MockitoExtension.class)
//SERVICE_TEST
//@Mock (va lo que tenes en el @Autowired de la clase a testear (en este caso REPOSITORY))
//@InjectMock (va la clase a testear (SERVICE))

//Mockito.when(Repository.metodo(parametro).thenReturn(tipo de respuesta esperado por el metodo))


//@ExtendWith(MockitoExtension.class)
//CONTROLLER_TEST
//@Mock (va lo que tenes en el @Autowired de la clase a testear (en este caso SERVICE))
//@InjectMock (va la clase a testear (CONTROLLER))

//Mockito.when(Service.metodo(parametro).thenReturn(tipo de respuesta esperado por el metodo));