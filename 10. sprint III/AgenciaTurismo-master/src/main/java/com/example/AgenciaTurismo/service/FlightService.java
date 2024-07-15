package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.*;
import com.example.AgenciaTurismo.dto.request.FlightConsultDTO;
import com.example.AgenciaTurismo.dto.response.FlightAvailableDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.model.Flight;
import com.example.AgenciaTurismo.repository.IFlightRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlightService implements IFlightService {

    @Autowired
    IFlightRepository flightRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<FlightDTO> listarFlight() {
        return flightRepository.findAll().stream()
                .map(flight -> modelMapper.map(flight, FlightDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public FlightAvailableDTO vuelosDisponibles(FlightConsultDTO flightConsultDTO) {
        //LLAMAMOS AL METODO VALIDAR VUELOS DISPONIBLES
        List<FlightDTO> availableFlight = this.validarVuelosDisponibles(flightConsultDTO);
        //CREAMOS OBJ TIPO FLIGHTAVAILABLEDTO
        FlightAvailableDTO flightAvailable = new FlightAvailableDTO();
        flightAvailable.setAvailableFlightDTO(availableFlight);

        return flightAvailable;
    }

    //CRUD
    @Override
    public ResponseDTO createFlight(FlightDTO flightDTO) {
        Flight flight = new Flight();
        modelMapper.map(flightDTO, flight);
        flightRepository.save(flight);

        return new ResponseDTO("Vuelo creado con éxito");
    }

    @Override
    public ResponseDTO updateFlight(Long id, FlightDTO flightDTO) {
        Optional<Flight> optionFlight = flightRepository.findById(id);
        if(optionFlight.isEmpty()){
            return new ResponseDTO("Vuelo no encontrado");
        }
        Flight flightExistente = optionFlight.get();

        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.map(flightDTO, flightExistente);
        flightRepository.save(flightExistente);
        return new ResponseDTO("Vuelo actualizado con éxito");
    }

    @Override
    public ResponseDTO deleteFlight(Long id) {
        if(!flightRepository.existsById(id)){
            return new ResponseDTO("Vuelo no encontrado");
        }

        flightRepository.deleteById(id);
        return new ResponseDTO("Vuelo eliminado con éxito");
    }


                            //METODOS PARA VALIDAR

    //VALIDACION DE DESTINO Y ORIGEN DE VUELOS
    @Override
    public List<FlightDTO> validarVuelosDisponibles(FlightConsultDTO flightConsultDTO) {
        //LLAMAMOS AL METODO QUE VALIDA DESTINO Y ORIGEN
        this.flightValid(flightConsultDTO.getOrigin(), flightConsultDTO.getDestination());
        //LLAMAMOS AL METODO QUE VALIDA FECHAS
        this.dateValid(flightConsultDTO.getDateFrom(), flightConsultDTO.getDateTo());


        List<FlightDTO> listFlightDTO = this.listarFlight();
        //CREAMOS UNA LISTA DE VUELOS QUE COINCIDAN CON LA FECHA
        List<FlightDTO> availableFlight = new ArrayList<>();
        for (FlightDTO flight : listFlightDTO) {
            if (flight.getDateFrom().equals(flightConsultDTO.getDateFrom())
                    && flight.getDateTo().equals(flightConsultDTO.getDateTo())) {
                availableFlight.add(flight);
            }
        }

        if (availableFlight.isEmpty()) {
            throw new IllegalArgumentException("No hay vuelos disponibles para las fechas y la ruta especificadas.");
        }

        return availableFlight;
    }

    @Override
    public Boolean flightValid(String origin, String destination) {
        List<String> validOrigin = listarFlight().stream()
                .map(FlightDTO::getOrigin)
                .toList();
        List<String> validDestination = listarFlight().stream()
                .map(FlightDTO::getDestination)
                .toList();
        if (validOrigin.contains(origin) && !validDestination.contains(destination)){
            throw new IllegalArgumentException("El destino elegido no existe");
        }else if (!validOrigin.contains(origin) && validDestination.contains(destination)){
            throw new IllegalArgumentException("El origen elegido no existe");
        }else if (!validOrigin.contains(origin) && !validDestination.contains(destination)){
            throw new IllegalArgumentException("El origen y el destino elegido no existe");
        }else {
            return true; //LOS DOS ARGUMENTOS SON CORRECTOS, DESTINO Y ORIGEN EXISTEN
        }
    }

    @Override
    public Boolean dateValid(LocalDate dateFrom, LocalDate dateTo) {
        if (!dateFrom.isBefore(dateTo)) {
            throw new IllegalArgumentException("La fecha de entrada debe ser menor a la de salida");
        } else
            return true;
    }

}
