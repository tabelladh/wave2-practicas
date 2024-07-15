package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.request.FinalFlightReservationDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.model.ReservarFlight;
import com.example.AgenciaTurismo.model.ReservarHotel;

import java.time.LocalDate;
import java.util.List;

public interface IFlightReservaService {

    List<FinalFlightReservationDTO> listarReservas();

    //CREATE
    ResponseDTO createReserva(FinalFlightReservationDTO finalFlightReservationDTO);

    //UPDATE
    ResponseDTO updateReserva(Long id, FinalFlightReservationDTO finalFlightReservationDTO);

    //DELETE
    ResponseDTO deleteReserva(Long id);

    //METODOS PARA VALIDAR
    Boolean reserveSaved(FinalFlightReservationDTO finalFlightReservationDTO);

    Double calcInterest(Double amount, Integer dues, String type);

    List<FinalFlightReservationDTO> mapearReservas(List<ReservarFlight> listReservas);

    List<ReservarFlight> listarReservasDia(LocalDate dias);

    List<ReservarFlight> listarReservasMes(Integer mes);



}
