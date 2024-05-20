package com.example.DesafioSprint1.service;

import com.example.DesafioSprint1.dto.*;
import com.example.DesafioSprint1.dto.Request.FlightReservationRequestDTO;
import com.example.DesafioSprint1.dto.Response.FlightReservationResponseDTO;
import com.example.DesafioSprint1.dto.Response.StatusDTO;
import com.example.DesafioSprint1.exceptions.BookingRegistrationException;
import com.example.DesafioSprint1.exceptions.EmptyFlightReservationException;
import com.example.DesafioSprint1.model.Flight;
import com.example.DesafioSprint1.repository.IFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightReservationServiceImpl implements IFlightReservationService {

    @Autowired
    private IFlightRepository flightRepository;

    @Override
    public FlightReservationResponseDTO reserveFlight(FlightReservationRequestDTO request) {
        if (request.getUserName() == null) {
            throw new EmptyFlightReservationException();
        }
        // obtener informacion del vuelo desde el servicio
        Flight flight = flightRepository.findAll().stream()
                .filter(f -> f.getFlightNumber().equals(request.getFlightReservation().getFlightNumber()))
                .filter(f -> f.getDateFrom().equals(request.getFlightReservation().getDateFrom()))
                .filter(f -> f.getDateTo().equals(request.getFlightReservation().getDateTo()))
                .filter(f -> f.getOrigin().equals(request.getFlightReservation().getOrigin()))
                .filter(f -> f.getDestination().equals(request.getFlightReservation().getDestination()))
                .filter(f -> f.getSeatType().equals(request.getFlightReservation().getSeatType()))
                .findFirst()
                .orElse(null);

        if (flight == null) {
            throw new BookingRegistrationException();
        }

        // calcular el precio base
        double basePrice = flight.getAmount() * request.getFlightReservation().getSeats();
        // calcular los intereses
        double interest = calculateInterest(basePrice, request.getFlightReservation().getPaymentMethod().getDues());
        // calcular el monto total
        double total = basePrice + interest;

        FlightReservationResponseDTO response = new FlightReservationResponseDTO();
        response.setUserName(request.getUserName());
        response.setAmount(basePrice);
        response.setInterest(interest);
        response.setTotal(total);
        response.setFlightReservation(request.getFlightReservation());
        response.setStatusDTO(new StatusDTO("La reserva finalizó satisfactoriamente", 201));

        return response;
    }
    private double calculateInterest(double basePrice, int dues) {
        double interestRate = 0.045;
        return basePrice * interestRate * dues;
    }
}

