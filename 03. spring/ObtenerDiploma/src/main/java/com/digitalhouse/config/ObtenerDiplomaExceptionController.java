package com.digitalhouse.config;

import com.digitalhouse.model.ErrorDTO;
import com.digitalhouse.model.ExceptionDTO;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.stream.Collectors;
@ControllerAdvice
public class ObtenerDiplomaExceptionController {

   @ExceptionHandler(HttpMessageNotReadableException.class)
   public ResponseEntity<?> HttpMessageNotReadable(Exception e){
      ExceptionDTO excepcion = new ExceptionDTO("No se completó el body de la petición", 404);
      return new ResponseEntity<>(excepcion, HttpStatus.NOT_FOUND);
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
}
