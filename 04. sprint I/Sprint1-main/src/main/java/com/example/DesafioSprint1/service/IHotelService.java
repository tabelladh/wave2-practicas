package com.example.DesafioSprint1.service;

import com.example.DesafioSprint1.dto.HotelDTO;
import com.example.DesafioSprint1.dto.Request.HotelRequestDTO;
import com.example.DesafioSprint1.dto.RespuestaDTO;

import java.time.LocalDate;
import java.util.List;

public interface IHotelService {

    List<HotelDTO> listHotels();
    List<HotelDTO> availableHotels(LocalDate dateFrom, LocalDate dateTo, String destination);
    HotelDTO findByHotelCode(String hotelCode);
    RespuestaDTO save(HotelRequestDTO requestDTO);
    RespuestaDTO delete (String hotelCode);
    HotelRequestDTO actualizarHotel(HotelRequestDTO hotelRequestDTO);


}
