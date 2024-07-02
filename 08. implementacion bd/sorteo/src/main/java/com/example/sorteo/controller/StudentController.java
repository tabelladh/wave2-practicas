package com.example.sorteo.controller;

import com.example.sorteo.dto.StudentDto;
import com.example.sorteo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    IStudentService service;

    @PostMapping("/student")
    public ResponseEntity<?>agregar(@RequestBody StudentDto studentDto){
        return new ResponseEntity<>(service.saveStudent(studentDto), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public ResponseEntity<?>listar(){
        return new ResponseEntity<>(service.findAllStudent(),HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<?>sorteo(){
        return new ResponseEntity<>(service.sorteo(),HttpStatus.OK);
    }
}
