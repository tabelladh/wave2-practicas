package com.example.implementacionBDD;

import com.example.implementacionBDD.repository.StudentRepository;

public class StudentService {
   private final StudentRepository studentRepository;
   public StudentService(StudentRepository studentRepository) {
      this.studentRepository = studentRepository;
   }
}
