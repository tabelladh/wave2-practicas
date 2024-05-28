package com.obtenerdiploma.service;

import com.obtenerdiploma.dto.StudentDTO;

import java.util.Set;

public interface IStudentService {
    boolean create(StudentDTO stu);
    StudentDTO read(Long id);
    boolean update(StudentDTO stu);
    boolean delete(Long id);
    Set<StudentDTO> getAll();
}
