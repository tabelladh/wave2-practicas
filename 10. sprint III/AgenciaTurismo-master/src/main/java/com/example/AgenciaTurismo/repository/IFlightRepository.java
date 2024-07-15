package com.example.AgenciaTurismo.repository;

import com.example.AgenciaTurismo.model.Flight;
import com.example.AgenciaTurismo.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlightRepository extends JpaRepository<Flight, Long> {

     Flight findByFlightCode(String flightCode);

}
