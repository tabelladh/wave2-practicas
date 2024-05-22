package com.example.AlumnoDTORP.repository;

import com.example.AlumnoDTORP.model.Curso;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
@Repository
public class CursoRepositoryImpl implements ICursoRepository {

    private List<Curso> cursosList;

    public CursoRepositoryImpl() {
        System.out.println("Se esta inicializando el repository de Cursos");
        cursosList = loadData();
    }

    public List<Curso> findAll() {
        return cursosList;
    }

    @Override
    public Curso findById(Integer codigo) {
        return cursosList.stream()
                .filter(c -> c.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);

    }

    @Override
    public Curso save(Curso curso) {
        curso.setCodigo(cursosList.size() + 1);
        cursosList.add(curso);
        return curso;
    }


    private List<Curso> loadData() {
        List<Curso> loadedData = null;
        File file;

        ObjectMapper objectMapper = new ObjectMapper();

        TypeReference<List<Curso>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:cursos.json");
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
