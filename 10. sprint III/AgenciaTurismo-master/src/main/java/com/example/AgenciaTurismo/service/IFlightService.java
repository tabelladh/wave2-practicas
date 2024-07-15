package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.FlightDTO;
import com.example.AgenciaTurismo.dto.FlightReservedDTO;
import com.example.AgenciaTurismo.dto.request.FinalFlightReservationDTO;
import com.example.AgenciaTurismo.dto.request.FlightConsultDTO;
import com.example.AgenciaTurismo.dto.response.FlightAvailableDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.dto.response.TotalFlightReservationDTO;
import com.example.AgenciaTurismo.model.Flight;

import java.time.LocalDate;
import java.util.List;

public interface IFlightService {

    List<FlightDTO> listarFlight();

    FlightAvailableDTO vuelosDisponibles(FlightConsultDTO flightConsultDTO);


    // CREATE
    ResponseDTO createFlight(FlightDTO flightDTO);
    // UPDATE
    ResponseDTO updateFlight(Long id, FlightDTO flightDTO);
    //DELETE
    ResponseDTO deleteFlight (Long id);


    //METODOS PARA VALIDAR

    List<FlightDTO> validarVuelosDisponibles(FlightConsultDTO flightConsultDTO);

    Boolean flightValid(String origin, String destination);

    Boolean dateValid(LocalDate dateFrom, LocalDate dateTo);

}
