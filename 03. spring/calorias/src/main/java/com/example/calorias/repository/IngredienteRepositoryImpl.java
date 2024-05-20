package com.example.calorias.repository;

import com.example.calorias.model.Ingrediente;
import com.example.calorias.model.Plato;
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
public class IngredienteRepositoryImpl implements IngredienteRepository {

    private List<Ingrediente> ingredientes;

    public IngredienteRepositoryImpl(){
        this.ingredientes = loadData();
    }


    private List<Ingrediente> loadData() {
        List<Ingrediente> loadedData = null;
        File file;

        ObjectMapper objectMapper = new ObjectMapper()
                .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .registerModule(new JavaTimeModule());

        TypeReference<List<Ingrediente>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:food.json");
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


    @Override
    public List<Ingrediente> findAll() {
        return ingredientes;
    }
}
