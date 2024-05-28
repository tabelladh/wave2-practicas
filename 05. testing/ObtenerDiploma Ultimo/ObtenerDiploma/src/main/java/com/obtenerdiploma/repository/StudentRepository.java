package com.obtenerdiploma.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.obtenerdiploma.entity.Student;
import com.obtenerdiploma.exception.StudentNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class StudentRepository implements IStudentRepository {

    private Set<Student> students;

    public StudentRepository(Set<Student> students) {
        loadData();
    }

    @Override
    public Set<Student> findAll() {
        return this.students;
    }

    @Override
    public boolean save(Student stu) {

        if (!exists(stu)) stu.setId((this.students.size() + 1L));

        return students.add(stu);
    }

    @Override
    public boolean delete(Long id) {
        boolean ret = false;

            Student found = this.findById(id).orElseThrow(() -> new StudentNotFoundException(id));

            students.remove(found);
            ret  = true;

        return ret;
    }

    public boolean exists(Student stu) {
        boolean ret = false;

        ret  = this.findById(stu.getId())
                .orElseThrow(() -> new StudentNotFoundException(stu.getId())) != null;

        return ret;
    }

    @Override
    public Optional<Student> findById(Long id) {
        return students.stream()
                .filter(stu -> stu.getId().equals(id))
                .findFirst();
    }

    private void loadData() {
        Set<Student> loadedData = new HashSet<>();

        ObjectMapper objectMapper = new ObjectMapper();
        File file;
        try {
            file = ResourceUtils.getFile("classpath:users.json");
            loadedData = objectMapper.readValue(file, new TypeReference<Set<Student>>(){});
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Failed while initializing DB, check your resources files");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed while initializing DB, check your JSON formatting.");
        }

        this.students = loadedData;
    }

}
