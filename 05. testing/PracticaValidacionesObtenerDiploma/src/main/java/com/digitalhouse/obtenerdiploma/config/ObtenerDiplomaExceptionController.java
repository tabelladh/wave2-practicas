package com.digitalhouse.obtenerdiploma.config;

import com.digitalhouse.obtenerdiploma.DTO.ErrorDTO;
import com.digitalhouse.obtenerdiploma.DTO.ExcepcionDTO;
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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDTO> MethodArgumentNotValid(MethodArgumentNotValidException e){
        return ResponseEntity.badRequest().body(
                new ErrorDTO("Se encontraron los siguientes errores en las validaciones: @Valid del DTO",
                        e.getAllErrors().stream()
                                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                                .collect(Collectors.toList())
                )
        );
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> HttpMessageNotReadable(Exception e){
        ExcepcionDTO excepcion = new ExcepcionDTO("Formulario vacio", 404);
        return new ResponseEntity<>(excepcion, HttpStatus.NOT_FOUND);
    }
}
