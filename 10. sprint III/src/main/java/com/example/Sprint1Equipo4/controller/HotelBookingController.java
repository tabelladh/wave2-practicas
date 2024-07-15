package com.example.Sprint1Equipo4.controller;

import com.example.Sprint1Equipo4.dto.request.BoockingDto;
import com.example.Sprint1Equipo4.dto.request.ReservationDtoRequest;
import com.example.Sprint1Equipo4.dto.response.ReservationDayDTO;
import com.example.Sprint1Equipo4.dto.response.ReservationMonthDTO;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.service.HotelBookingService;
import com.example.Sprint1Equipo4.service.HotelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Validated
@RestController
@RequestMapping("/api/v1")
public class HotelBookingController {
    @Autowired
    HotelBookingService hotelBookingService;

    @Autowired
    HotelService hotelService;

    @PostMapping("/booking")
    public ResponseEntity<StatusDTO> bookHotel(@RequestBody @Valid ReservationDtoRequest reservationDtoRequest) {
        StatusDTO statusDTO = hotelService.bookHotel(reservationDtoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(statusDTO);
    }

    @GetMapping("/hotel-bookings") //Listado de todas las  reservas de hotel.
    public ResponseEntity<List<BoockingDto>> listHotelBookings(){
        return new ResponseEntity<>(hotelBookingService.listAllHotelBookings(), HttpStatus.OK);
    }

    @PutMapping("/hotel-booking/edit") // Actualizar una reserva buscando por id
    public ResponseEntity<StatusDTO> editBooking(@RequestBody @Valid ReservationDtoRequest booking, @RequestParam Long id){
        StatusDTO status = hotelBookingService.updateHotelBooking(booking, id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @DeleteMapping("/hotel-booking/delete")
    public ResponseEntity<StatusDTO> deleteBooking(@RequestParam Long id){
        StatusDTO status = hotelBookingService.deleteHotelBooking(id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @GetMapping("/income")
    public ResponseEntity<ReservationMonthDTO> getReservationMonth(@RequestParam int month, @RequestParam int year) {
        if (month < 1 || month > 12) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ReservationMonthDTO reservationMonth = hotelBookingService.getReservationMonth(month, year);
        return new ResponseEntity<>(reservationMonth, HttpStatus.OK);
    }
    @GetMapping("/income-day")
    public ResponseEntity<ReservationDayDTO> getReservationDay(@RequestParam  @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate date){
        ReservationDayDTO reservationDay = hotelBookingService.getReservationDay(date);
        return new ResponseEntity<>(reservationDay, HttpStatus.OK);
    }
}
