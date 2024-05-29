package com.example.demoUnitTest.repository;

import com.example.demoUnitTest.model.Alumno;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class AlumnoRepositoryImpl implements IAlumnoRepository{

    List<Alumno> alumnosList;

    public AlumnoRepositoryImpl() {
        this.alumnosList = loadData();
    }

    public Alumno findById(Integer id) {
        Alumno alumno = alumnosList.stream().
                filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);

        return alumno;
    }

    public List<Alumno> findAll() {
        return this.alumnosList;
    }

    private List<Alumno> loadData() {
        List<Alumno> loadedData = null;
        File file;

        ObjectMapper objectMapper = new ObjectMapper()
                .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .registerModule(new JavaTimeModule());

        TypeReference<List<Alumno>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:users.json");
            loadedData = objectMapper.readValue(file, typeRef);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Failed while initializing DB, check your resources files");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed while initializing DB, check your JSON formatting.");
        }

        return loadedData;
    }



}
