package com.example.sorteo.service;

import com.example.sorteo.dto.StudentDto;

import java.util.List;

public interface IStudentService {
    StudentDto saveStudent(StudentDto studentDto);

    List<StudentDto> findAllStudent();

    List<StudentDto> sorteo();
}
