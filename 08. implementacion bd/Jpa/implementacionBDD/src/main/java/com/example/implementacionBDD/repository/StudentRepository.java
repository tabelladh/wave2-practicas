package com.example.implementacionBDD.repository;

import com.example.implementacionBDD.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long>{
}
