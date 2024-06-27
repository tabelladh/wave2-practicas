package com.example.demoSorteo.controller;

import com.example.demoSorteo.dto.request.StudentDtoRequest;
import com.example.demoSorteo.dto.response.StudentDtoResponse;
import com.example.demoSorteo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/new")
    public ResponseEntity<StudentDtoResponse> saveStudent(@RequestBody StudentDtoRequest studentDtoRequest) {
        return new ResponseEntity<>(studentService.saveStudent(studentDtoRequest), HttpStatus.CREATED);
    }

}
