package com.example.Calorias.Util;

import com.example.Calorias.DTO.Ingrediente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class JsonReader {
    public List<Ingrediente> readIngredientesFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Ingrediente> ingredientes = objectMapper.readValue(new File(filePath), new TypeReference<List<Ingrediente>>(){});
        return ingredientes;
    }
}


