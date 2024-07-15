package com.example.Sprint1Equipo4.repository;
import com.example.Sprint1Equipo4.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight,Long> {
    Flight findByFlightCode(String flightCode);
}
