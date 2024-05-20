package com.example.DesafioSprint1.service;

import com.example.DesafioSprint1.dto.BookingDTO;
import com.example.DesafioSprint1.dto.Request.BookingRequestDTO;
import com.example.DesafioSprint1.dto.Response.BookingResponseDTO;

public interface IBookingService {

BookingResponseDTO makeBooking(BookingRequestDTO bookingRequestDTO);

}
