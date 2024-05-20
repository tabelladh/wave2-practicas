package com.example.DesafioSprint1.repository;

import com.example.DesafioSprint1.model.Flight;
import com.example.DesafioSprint1.model.Hotel;

import java.util.List;

public interface IFlightRepository {

    List<Flight> findAll();
}
