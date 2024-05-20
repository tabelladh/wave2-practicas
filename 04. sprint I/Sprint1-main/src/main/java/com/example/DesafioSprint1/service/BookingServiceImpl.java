package com.example.DesafioSprint1.service;

import com.example.DesafioSprint1.dto.Request.BookingRequestDTO;
import com.example.DesafioSprint1.dto.Response.BookingResponseDTO;
import com.example.DesafioSprint1.dto.Response.StatusDTO;
import com.example.DesafioSprint1.exceptions.BookingRegistrationException;
import com.example.DesafioSprint1.model.Hotel;
import com.example.DesafioSprint1.repository.IHotelRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class BookingServiceImpl implements IBookingService{

    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private IHotelRepository hotelRepository;


    @Override
    public BookingResponseDTO makeBooking(BookingRequestDTO bookingRequestDTO) {
        // El criterio para filtrar el hotel es coincidencia de HotelCode y RoomType.
        BookingResponseDTO answer = new BookingResponseDTO();
        Double interest = 5.5;
        Long days = bookingRequestDTO.getBookingDTO().getDateTo().toEpochDay() - bookingRequestDTO.getBookingDTO().getDateFrom().toEpochDay();
        List<Hotel> hotels = hotelRepository.findAll().stream()
                .filter(hotel -> bookingRequestDTO.getBookingDTO().getHotelCode().equals(hotel.getHotelCode()))
                .filter(hotel -> bookingRequestDTO.getBookingDTO().getRoomType().toUpperCase().equals(hotel.getRoomType().toUpperCase()))
                .toList();
        if(hotels.isEmpty() ) { throw new BookingRegistrationException(); }
        Double amount =  hotels.get(0).getAmount() * days * bookingRequestDTO.getBookingDTO().getPeople_amount() ;
        Double total = ( ( amount * interest / 100 ) + amount ) ;
        answer.setUserName(bookingRequestDTO.getUserName());
        answer.setAmount(amount);
        answer.setInterest(interest);
        answer.setTotal(total);
        answer.setBookingDTO( bookingRequestDTO.getBookingDTO() );
        answer.setStatusDTO(new StatusDTO("El proceso termino satisfactoriamente", 201));

    return answer;
    }
}
