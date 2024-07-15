package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.request.FlightReqDto;
import com.example.Sprint1Equipo4.dto.request.FlightReservationDto;
import com.example.Sprint1Equipo4.dto.response.FlightDTO;
import com.example.Sprint1Equipo4.dto.response.FlightResDto;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.exception.DateOutOfRangeException;
import com.example.Sprint1Equipo4.model.Flight;
import com.example.Sprint1Equipo4.dto.response.ResponseFlightDTO;

import java.time.LocalDate;
import java.util.List;

public interface FlightService {
   List<FlightDTO> listFlights();

   List<FlightDTO> flightsAvailable(LocalDate dateFrom, LocalDate dateTo, String origin, String destination);

   StatusDTO reserve(FlightReqDto flight);

   FlightDTO findByFlightName(String name);

   ResponseFlightDTO deleteFlight(String flightCode);

   FlightDTO create(FlightDTO flight);

   FlightDTO upDate(FlightDTO flight);

   DateOutOfRangeException validateDateRangeFlight(LocalDate dateFrom, LocalDate dateTo, String destination);

   Flight getFlight(List<Flight> allFlight, FlightReservationDto reservation);
}

