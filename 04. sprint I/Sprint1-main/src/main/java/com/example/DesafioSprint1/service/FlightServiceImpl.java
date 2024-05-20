package com.example.DesafioSprint1.service;

import com.example.DesafioSprint1.dto.FlightDTO;
import com.example.DesafioSprint1.exceptions.FlightNotFoundException;
import com.example.DesafioSprint1.model.Flight;
import com.example.DesafioSprint1.repository.IFlightRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class FlightServiceImpl implements IFlightService {

    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private IFlightRepository flightRepository;

    @Override
    public List<FlightDTO> listFlights() {
        List<Flight> flightList = flightRepository.findAll();
        return flightList.stream()
                .map(flight -> modelMapper
                        .map(flight, FlightDTO.class))
                .toList();
    }

    @Override
    public List<FlightDTO> findFlightsByDateAndRoute(LocalDate dateFrom, LocalDate dateTo, String origin, String destination) {
        if(dateFrom== null || dateTo == null || origin == null || destination == null){
            throw new FlightNotFoundException();
        }
        List<Flight> flightList = flightRepository.findAll();

        // filtro por origen y destino

        List <Flight> flightsRuta = flightList.stream()
                .filter(flight -> flight.getOrigin().equals(origin) && flight.getDestination().equals(destination))
                .toList();

        // filtro por fecha

        List <Flight> flightsFecha = flightsRuta.stream()
                .filter(flight -> flight.getDateFrom().equals(dateFrom) && flight.getDateTo().equals(dateTo))
                .toList();
        if(flightsFecha.isEmpty()){
            throw new FlightNotFoundException();
        }

        List<FlightDTO> flightDTOList = new ArrayList<>();
        for (Flight flight : flightsFecha) {
            flightDTOList.add(new FlightDTO(
                    flight.getFlightNumber(),
                    flight.getOrigin(),
                    flight.getDestination(),
                    flight.getSeatType(),
                    flight.getAmount(),
                    flight.getDateFrom(),
                    flight.getDateTo()
            ));
        }
        return flightDTOList;
    }
}
