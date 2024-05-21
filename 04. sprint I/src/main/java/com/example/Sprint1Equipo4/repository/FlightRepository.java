package com.example.Sprint1Equipo4.repository;
import com.example.Sprint1Equipo4.model.Flight;
import java.util.List;

public interface FlightRepository {
    List<Flight> findAll();
    Flight save(Flight flight);
    Flight upDate(Flight flight);
    Flight findByName(String name);
    boolean delete(String name);
}
