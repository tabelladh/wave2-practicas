package com.example.demoSorteo.service;

import com.example.demoSorteo.dto.StudentDto;
import com.example.demoSorteo.dto.request.StudentDtoRq;

import java.util.List;

public interface IStudentService {
    StudentDto saveStudent(StudentDto studentDto);

    List<StudentDtoRq> studentsList();

    StudentDtoRq saveStudentWithTopic(StudentDtoRq studentDtorq);

    List<StudentDto> drawStudents();
}
