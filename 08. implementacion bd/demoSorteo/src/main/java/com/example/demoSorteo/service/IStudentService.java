package com.example.demoSorteo.service;

import com.example.demoSorteo.dto.request.StudentDtoRequest;
import com.example.demoSorteo.dto.response.StudentDtoResponse;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface IStudentService {
    StudentDtoResponse saveStudent(StudentDtoRequest studentDtoRequest);

    List<StudentDtoResponse> studentsList();
}
