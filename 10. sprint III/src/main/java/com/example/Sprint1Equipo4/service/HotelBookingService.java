package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.request.BoockingDto;
import com.example.Sprint1Equipo4.dto.request.ReservationDtoRequest;
import com.example.Sprint1Equipo4.dto.response.ReservationDayDTO;
import com.example.Sprint1Equipo4.dto.response.ReservationMonthDTO;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;

import java.time.LocalDate;
import java.util.List;

public interface HotelBookingService {

    List<BoockingDto> listAllHotelBookings();

    StatusDTO updateHotelBooking(ReservationDtoRequest booking, Long id);

    StatusDTO deleteHotelBooking(Long id);


    ReservationMonthDTO getReservationMonth(int month, int year);

    ReservationDayDTO getReservationDay(LocalDate date);
}
