package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.HotelDTO;
import com.example.AgenciaTurismo.dto.request.HotelConsultDTO;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;

import java.time.LocalDate;
import java.util.List;

public interface IHotelService {

    List<HotelDTO> listarHotels();

    HotelAvailableDTO hotelesDisponibles (HotelConsultDTO hotelConsultDTO);


    // CREATE
    ResponseDTO createHotel(HotelDTO hotelDTO);
    // UPDATE
    ResponseDTO updateHotel(Long id, HotelDTO hotelDTO);
    //DELETE
    ResponseDTO deleteHotel (Long id);


    List<HotelDTO> validarHotelesDisponibles(HotelConsultDTO hotelConsultDTO);

    Boolean dateValid(LocalDate dateFrom, LocalDate dateTo);

    Boolean destinationValid(String destination);


}
