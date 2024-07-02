package com.example.demoSorteo.service;

import com.example.demoSorteo.dto.StudentDto;
import com.example.demoSorteo.dto.TopicDto;
import com.example.demoSorteo.dto.request.StudentDtoRq;
import com.example.demoSorteo.model.Student;
import com.example.demoSorteo.model.Topic;
import com.example.demoSorteo.repository.IStudentRepository;
import com.example.demoSorteo.repository.ITopicRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Autowired
    private ITopicRepository topicRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public StudentDto saveStudent(StudentDto studentDto) {

        Student student = new Student();
        modelMapper.map(studentDto, student);

        studentRepository.save(student);

        modelMapper.map(student, studentDto);

        return studentDto;
    }

    @Override
    public StudentDtoRq saveStudentWithTopic(StudentDtoRq studentDtorq) {

        Topic topic = topicRepository.findById(studentDtorq.getTopicId().getId())
                .orElseThrow(() -> new RuntimeException("Topic not found"));

        Student student = new Student(
                studentDtorq.getId(),
                studentDtorq.getName(),
                studentDtorq.getSurName(),
                studentDtorq.getDni(),
                studentDtorq.getCourse(),
                topic
        );

        student = studentRepository.save(student);

        return new StudentDtoRq(
                student.getId(),
                student.getName(),
                student.getSurName(),
                student.getDni(),
                student.getCourse(),
                new TopicDto(student.getTopic().getId(),
                        student.getTopic().getTopicName(),
                        student.getTopic().getComplexity()
                )
        );
    }

    @Override
    public List<StudentDtoRq> studentsList() {
        List<Student> studentList = studentRepository.findAll();

        List<StudentDtoRq> studentDtoRq = studentList.stream()
                .map(student -> new StudentDtoRq(
                        student.getId(),
                        student.getName(),
                        student.getSurName(),
                        student.getDni(),
                        student.getCourse(),
                        new TopicDto(student.getTopic().getId(),
                                student.getTopic().getTopicName(),
                                student.getTopic().getComplexity()
                        )
                ))
                .toList();

        return studentDtoRq;
    }

    @Override
    public List<StudentDto> drawStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtoSorteados = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int numRandom = random.nextInt(students.size());
            Student randomStudent = students.get(numRandom); // obtiene un estudiante random de la lista students.
            studentDtoSorteados.add(modelMapper.map(randomStudent, StudentDto.class));
        }
        return studentDtoSorteados;


    }


}
