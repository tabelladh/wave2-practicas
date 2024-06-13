package com.example.Sprint1Equipo4.repository;


import com.example.Sprint1Equipo4.model.Flight;
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
public class FlightRepositoryImpl implements FlightRepository {
   private List<Flight> flights;

   public FlightRepositoryImpl() {
      this.flights = loadData();
   }

   @Override
   public List<Flight> findAll() {
      return flights;
   }

   @Override
   public Flight findByName(String name) {
      Flight flight = flights.stream().filter(a -> a.getFlightNumber().equals(name)).findFirst().orElse(null);
      return flight;
   }

   @Override
   public Flight save(Flight flight) {
      for (Flight f : flights) {
         if (f.getFlightNumber().equals(flight.getFlightNumber())) {
            Flight getFlight = findByName(flight.getFlightNumber());
            flight.setFlightNumber(getFlight.getFlightNumber());
            flights.remove(getFlight);
            flights.add(flight);
            return flight;
         }
      }
      flights.add(flight);
      return flight;
   }

   @Override
   public boolean delete(String name) {
      Flight flightFound = findByName(name);
      flights.remove(flightFound);
      return true;
   }

   private List<Flight> loadData() {
      List<Flight> loadedData = null;
      File file;

      ObjectMapper objectMapper = new ObjectMapper()
            .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
            .registerModule(new JavaTimeModule());

      TypeReference<List<Flight>> typeRef = new TypeReference<>() {
      };

      try {
         file = ResourceUtils.getFile("classpath:vuelo.json");
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

