package com.example.DesafioSprint1.service;

import com.example.DesafioSprint1.dto.FlightDTO;
import com.example.DesafioSprint1.dto.HotelDTO;

import java.time.LocalDate;
import java.util.List;

public interface IFlightService {

    List<FlightDTO> listFlights();

    List<FlightDTO> findFlightsByDateAndRoute(LocalDate dateFrom, LocalDate dateTo, String origin, String destination);
}
