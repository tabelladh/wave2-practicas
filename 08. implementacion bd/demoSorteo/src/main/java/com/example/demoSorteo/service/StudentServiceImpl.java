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
        /*return studentRepository.findAll().stream()
                .map(student -> modelMapper.map(student, StudentDtoRq.class))
                .toList();*/
        List <Student> students = studentRepository.findAll();
        List <StudentDtoRq> studentsList = new ArrayList<>();

        for (Student student : students) {
            studentsList.add(new StudentDtoRq(
                    student.getId(),
                    student.getName(),
                    student.getSurName(),
                    student.getDni(),
                    student.getCourse(),
                    new TopicDto(student.getTopic().getId(),
                            student.getTopic().getTopicName(),
                            student.getTopic().getComplexity()
                    )
            ));
        }
        return studentsList;

    }

    @Override
    public List<StudentDtoRq> drawStudents() {
        List <StudentDtoRq> students = studentsList();
        List <StudentDtoRq> studentsSorted = new ArrayList<>();;
        List <Integer> sorted = new ArrayList<>();
        Random random = new Random();

        while(sorted.size() < 5) {
            int i = random.nextInt(students.size());
            if (!sorted.contains(i)) {
                sorted.add(i);
            }
        }
        for(int i : sorted) {
            studentsSorted.add(students.get(i));
        }
        return studentsSorted;
    }


}
