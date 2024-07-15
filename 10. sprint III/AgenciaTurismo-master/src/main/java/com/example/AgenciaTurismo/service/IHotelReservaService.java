package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.HotelReservationDTO;
import com.example.AgenciaTurismo.dto.HotelReservedDTO;
import com.example.AgenciaTurismo.dto.request.FinalHotelReservationDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.dto.response.TotalHotelReservationDTO;
import com.example.AgenciaTurismo.model.ReservarHotel;

import java.time.LocalDate;
import java.util.List;

public interface IHotelReservaService {

    List<FinalHotelReservationDTO> listarReservas();

    //CREATE
    ResponseDTO createReserva(FinalHotelReservationDTO finalHotelReservationDTO);

    //UPDATE
    ResponseDTO updateReserva(Long id, FinalHotelReservationDTO finalHoteltReservationDTO);

    //DELETE
    ResponseDTO deleteReserva(Long id);

    //METODOS PARA VALIDAR
    Boolean reserveSaved(FinalHotelReservationDTO finalHotelReservationDTO);

    Double calcInterest(Double amount, Integer dues, String type);

    Boolean roomCapacity(HotelReservationDTO reservation);

    List<FinalHotelReservationDTO> mapearReservas (List<ReservarHotel> reservas);

    List<ReservarHotel> listarReservasDia(LocalDate dia);

    List<ReservarHotel> listarReservasMes(Integer mes);

}
