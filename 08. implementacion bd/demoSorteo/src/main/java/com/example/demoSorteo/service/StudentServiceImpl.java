package com.example.demoSorteo.service;

import com.example.demoSorteo.dto.request.StudentDtoRequest;
import com.example.demoSorteo.dto.response.StudentDtoResponse;
import com.example.demoSorteo.model.Student;
import com.example.demoSorteo.repository.IStudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public StudentDtoResponse saveStudent(StudentDtoRequest studentDtoRequest) {
        Student student = new Student();
        modelMapper.map(studentDtoRequest, student);

        studentRepository.save(student);

        StudentDtoResponse studentDtoResponse = new StudentDtoResponse();
        modelMapper.map(student, studentDtoResponse);

        return studentDtoResponse;
    }

    @Override
    public List<StudentDtoResponse> studentsList() {
        return null;
    }
}
