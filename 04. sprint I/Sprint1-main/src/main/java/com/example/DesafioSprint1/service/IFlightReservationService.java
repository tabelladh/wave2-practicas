package com.example.DesafioSprint1.service;

import com.example.DesafioSprint1.dto.Request.FlightReservationRequestDTO;
import com.example.DesafioSprint1.dto.Response.FlightReservationResponseDTO;

public interface IFlightReservationService {
    FlightReservationResponseDTO reserveFlight(FlightReservationRequestDTO request);
}
