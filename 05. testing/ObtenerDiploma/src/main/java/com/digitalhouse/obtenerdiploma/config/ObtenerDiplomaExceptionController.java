package com.digitalhouse.obtenerdiploma.config;

import com.digitalhouse.obtenerdiploma.exception.NotFoundAlumnoException;
import com.digitalhouse.obtenerdiploma.model.ErrorDTO;
import com.digitalhouse.obtenerdiploma.model.ExcepcionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.stream.Collectors;
import org.springframework.context.support.DefaultMessageSourceResolvable;
@ControllerAdvice
public class ObtenerDiplomaExceptionController {

    @ExceptionHandler(NotFoundAlumnoException.class)

    public ResponseEntity<?> alumnoNotFound(Exception e){
        ExcepcionDTO excepcion = new ExcepcionDTO("Registro inexistente", 404);
        return new ResponseEntity<>(excepcion, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDTO> validationException(MethodArgumentNotValidException e){
        return ResponseEntity.badRequest().body(
                new ErrorDTO("Se encontraron los siguientes errores en las validaciones:" , //@Valid del DTO",
                        e.getAllErrors().stream()
                                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                                .collect(Collectors.
                                        toList())
                )
        );
    }



}
