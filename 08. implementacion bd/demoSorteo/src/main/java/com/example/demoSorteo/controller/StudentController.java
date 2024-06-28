package com.example.demoSorteo.controller;

import com.example.demoSorteo.dto.StudentDto;
import com.example.demoSorteo.dto.request.StudentDtoRq;
import com.example.demoSorteo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    //Se crea un Student y un Topic en la misma request. No hace falta que Topic exista.
    @PostMapping("/new")
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto) {
        return new ResponseEntity<>(studentService.saveStudent(studentDto), HttpStatus.CREATED);
    }

    //Se crea un Student con un Topic existente en la bd (primero crear el Topic)
    @PostMapping("/newWithTopic")
    public ResponseEntity<StudentDtoRq> saveStudentWithTopic(@RequestBody StudentDtoRq studentDtorq) {
        return new ResponseEntity<>(studentService.saveStudentWithTopic(studentDtorq), HttpStatus.CREATED);
    }

    @GetMapping("/students/draw")
    public ResponseEntity<List<StudentDto>> drawStudents() {
        return new ResponseEntity<>(studentService.drawStudents(), HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentDtoRq>> studentsList() {
        return new ResponseEntity<>(studentService.studentsList(), HttpStatus.OK);
    }


}
