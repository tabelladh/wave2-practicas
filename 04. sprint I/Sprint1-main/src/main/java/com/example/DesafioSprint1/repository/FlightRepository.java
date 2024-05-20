package com.example.DesafioSprint1.repository;

import com.example.DesafioSprint1.model.Flight;
import com.example.DesafioSprint1.model.Hotel;
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
public class FlightRepository implements IFlightRepository {

    private List<Flight> flightList;

    public FlightRepository(){

        this.flightList= loadData();
    }

    @Override
    public List<Flight> findAll() {
        return flightList;
    }

    private List<Flight> loadData() {
        List<Flight> loadedData = null;
        File file;

        ObjectMapper objectMapper = new ObjectMapper()
                .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .registerModule(new JavaTimeModule());

        TypeReference<List<Flight>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:vuelos.json");
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
