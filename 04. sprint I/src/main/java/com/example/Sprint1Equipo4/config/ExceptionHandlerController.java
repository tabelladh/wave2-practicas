package com.example.Sprint1Equipo4.config;

import com.example.Sprint1Equipo4.dto.ErrorDto;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.exception.DateOutOfRangeException;
import com.example.Sprint1Equipo4.exception.FlightNotFoundException;
import com.example.Sprint1Equipo4.exception.FlightNotFoundException;
import com.example.Sprint1Equipo4.exception.HotelNotFoundException;
import com.example.Sprint1Equipo4.exception.MissingParameterException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
   @ExceptionHandler(HotelNotFoundException.class)
   public ResponseEntity<ErrorDto> handleHotelNonExistException(HotelNotFoundException ex) {
      ErrorDto error = new ErrorDto("El destino o fecha seleccionado no coincide con los de nuestra lista de hoteles", 404);
      return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(FlightNotFoundException.class)
   public ResponseEntity<StatusDTO> flightNotFound(FlightNotFoundException ex){
      StatusDTO status = new StatusDTO(404, "no se encontraron vuelos disponibles");
      return new ResponseEntity<>(status,HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(MissingParameterException.class)
   public ResponseEntity<ErrorDto> handleMissingParameterException(MissingParameterException ex) {
      ErrorDto error = new ErrorDto("Faltan uno o más parámetros: date_from, date_to, destination", 400);
      return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(DateOutOfRangeException.class)
   public ResponseEntity<ErrorDto> handleDateOutOfRangeException(DateOutOfRangeException ex) {
      ErrorDto error = new ErrorDto("Fecha fuera de rango", 400);
      return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }

}