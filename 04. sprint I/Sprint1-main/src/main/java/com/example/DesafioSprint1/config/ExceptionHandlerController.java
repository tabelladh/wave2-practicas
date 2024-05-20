package com.example.DesafioSprint1.config;

import com.example.DesafioSprint1.dto.ErrorDTO;
import com.example.DesafioSprint1.exceptions.BookingRegistrationException;
import com.example.DesafioSprint1.exceptions.EmptyFlightReservationException;
import com.example.DesafioSprint1.exceptions.FlightNotFoundException;

import com.example.DesafioSprint1.exceptions.HotelNotFoundException;
import com.example.DesafioSprint1.exceptions.ReservationInexistentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(ReservationInexistentException.class)
    public ResponseEntity<?> registroInexistente(Exception e){
        ErrorDTO error = new ErrorDTO("No se encontraron hoteles para la fecha solicitada", 404);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BookingRegistrationException.class)
    public ResponseEntity<?> bookingRegistrationException(Exception e){
        ErrorDTO error = new ErrorDTO("Los datos de la reserva no coinciden", 404);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmptyFlightReservationException.class)
    public ResponseEntity<?> emptyFlightReservationException(Exception e){
        ErrorDTO error = new ErrorDTO("Los datos de reserva no pueden estar vacios", 400);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FlightNotFoundException.class)
    public ResponseEntity<?> FlightNotFoundException(Exception e){
        ErrorDTO error = new ErrorDTO("No hay vuelos para los datos especificados", 400);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<?> HotelNotFoundException(Exception e){
        ErrorDTO error = new ErrorDTO("No existen hoteles con el codigo administrado", 400);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<?> NullPointerException(Exception e){
        ErrorDTO error = new ErrorDTO("No se recibieron datos", 500);
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
   }


}