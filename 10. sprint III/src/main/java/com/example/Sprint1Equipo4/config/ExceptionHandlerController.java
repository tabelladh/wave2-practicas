package com.example.Sprint1Equipo4.config;

import com.example.Sprint1Equipo4.dto.ErrorDto;
import com.example.Sprint1Equipo4.dto.response.ErrorDTO;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.exception.*;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.UnexpectedTypeException;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import jakarta.validation.ConstraintViolation;

import java.util.List;
import java.util.stream.Collectors;


@ControllerAdvice
public class ExceptionHandlerController {
   @ExceptionHandler(HotelNotFoundException.class)
   public ResponseEntity<ErrorDto> handleHotelNonExistException(HotelNotFoundException ex) {
      ErrorDto error = new ErrorDto("El destino o fecha seleccionado no coincide con los de nuestra lista de hoteles", 404);
      return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(FlightNotFoundException.class)
   public ResponseEntity<StatusDTO> flightNotFound(FlightNotFoundException ex){
      StatusDTO status = new StatusDTO(404, "El origen y/o destino seleccionado no coincide con los de nuestra lista de vuelos");
      return new ResponseEntity<>(status,HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(MissingParameterException.class)
   public ResponseEntity<ErrorDto> handleMissingParameterException(MissingParameterException ex) {
      ErrorDto error = new ErrorDto("Faltan uno o más parámetros: date_from, date_to, destination", 400);
      return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(DateOutOfRangeException.class)
   public ResponseEntity<ErrorDto> handleDateOutOfRangeException(DateOutOfRangeException ex) {
      ErrorDto error = new ErrorDto("La fecha de entrada debe ser menor a la de salida y viceversa", 400);
      return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(InvalidBoockingException.class)
   public ResponseEntity<ErrorDto> InvalidBoockingException(InvalidBoockingException ex) {
      ErrorDto error = new ErrorDto("El tipo de habitación seleccionada no coincide con la cantidad de personas que se alojarán en ella.", 400);
      return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(InvalidDuesForDebit.class)
   public ResponseEntity<ErrorDto> InvalidDuesForDebit(InvalidDuesForDebit ex) {
      ErrorDto error = new ErrorDto("Tarjeta de débito: Se ha ingresado una cantidad de cuotas diferente a 1", 400);
      return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(InvalidDuesForCredit.class)
   public ResponseEntity<ErrorDto> InvalidDuesForCredit(InvalidDuesForCredit ex) {
      ErrorDto error = new ErrorDto("Tarjeta de crédito: debe seleccionar dos o más cuotas", 400);
      return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(MethodArgumentNotValidException.class)
   public ResponseEntity<ErrorDTO> validationException(MethodArgumentNotValidException e){
      return ResponseEntity.badRequest().body(
            new ErrorDTO("Se encontraron los siguientes errores en las validaciones: @Valid del DTO",
                  e.getAllErrors().stream()
                        .map(DefaultMessageSourceResolvable::getDefaultMessage)
                        .collect(Collectors.toList())
            )
      );
   }
@ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<ErrorDTO> handleResourceNotFoundException(ResourceNotFoundException ex) {
      ErrorDTO errorResponse = new ErrorDTO("No se encontró reserva", List.of(ex.getMessage()));
      return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(InvalidRequestException.class)
   public ResponseEntity<ErrorDTO> handleInvalidRequestException(InvalidRequestException ex) {
      ErrorDTO errorResponse = new ErrorDTO("Invalid request", List.of(ex.getMessage()));
      return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(DuplicateBookingException.class)
   public ResponseEntity<ErrorDTO> handleDuplicateBookingException(DuplicateBookingException ex) {
      String errorMessage = ex.getMessage();
      if (errorMessage == null) {
         errorMessage = "Ya hay una reserva para esa fecha y destino";
      }
      ErrorDTO errorResponse = new ErrorDTO(errorMessage, List.of());
      return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
   }

   @ExceptionHandler(ConstraintViolationException.class)
   public ResponseEntity<ErrorDTO> validationException(ConstraintViolationException e){
      return ResponseEntity.badRequest().body(
            new ErrorDTO("Se encontraron los siguientes errores en las validaciones en el PathVariable y RequestParam ",
                  e.getConstraintViolations().stream()
                        .map(ConstraintViolation::getMessage)
                        .collect(Collectors.toList())
            )
      );
   }

   @ExceptionHandler(ArgumentException.class)
   public ResponseEntity<ErrorDto> handlerArgumentException(ArgumentException ex) {
      ErrorDto error = new ErrorDto("El paquete debe contener exactamente dos reservas.", 400);
      return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(PackageNotFound.class)
   public ResponseEntity<ErrorDto> handlerPackageNotFound(PackageNotFound ex) {
      ErrorDto error = new ErrorDto("Paquete no encontrado", 404);
      return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(ReserveNotFound.class)
   public ResponseEntity<ErrorDto> handlerReserveNotFound(ReserveNotFound ex) {
      ErrorDto error = new ErrorDto("Una o ambas reservas especificadas no existen", 404);
      return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(UnexpectedTypeException.class)
   public ResponseEntity<ErrorDto> handlerReserveNotFound(UnexpectedTypeException ex) {
      ErrorDto error = new ErrorDto("Ingresar una fecha válida de 4 dígitos", 404);
      return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
   }

}