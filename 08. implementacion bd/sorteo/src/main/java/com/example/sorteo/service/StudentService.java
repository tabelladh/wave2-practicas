package com.example.sorteo.service;

import com.example.sorteo.dto.StudentDto;
import com.example.sorteo.entity.Student;
import com.example.sorteo.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class StudentService implements IStudentService{

    @Autowired
    StudentRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = new Student();
        modelMapper.map(studentDto,student);
        repository.save(student);
        return studentDto;
    }

    @Override
    public List<StudentDto> findAllStudent() {
        StudentDto studentDto = new StudentDto();
        List<Student>students = repository.findAll();
        List<StudentDto>studentDtos = List.of();

        for (Student student: students){
            modelMapper.map(student,studentDto);
            studentDtos.add(studentDto);
        }
        return studentDtos;
    }

    @Override
    public List<StudentDto> sorteo() {

        return null;

    }
}
