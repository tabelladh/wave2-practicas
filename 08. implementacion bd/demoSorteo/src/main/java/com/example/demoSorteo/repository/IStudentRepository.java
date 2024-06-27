package com.example.demoSorteo.repository;

import com.example.demoSorteo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {

}
