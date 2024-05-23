package com.digitalhouse.obtenerdiploma.config;

import com.digitalhouse.obtenerdiploma.exception.NotFoundAlumnoExeption;
import com.digitalhouse.obtenerdiploma.model.ErrorDTO;
import com.digitalhouse.obtenerdiploma.model.ExeptionDTO;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import jakarta.validation.ConstraintViolation;
import java.util.stream.Collectors;

@ControllerAdvice
public class ObtenerDiplomaExceptionController {

    @ExceptionHandler(NotFoundAlumnoExeption.class)
    public ResponseEntity<ExeptionDTO>alumnoNotFound(NotFoundAlumnoExeption ex){
        ExeptionDTO exeptionDTO = new ExeptionDTO("el alumno no se encuentra en la base de datos",404);

        return new ResponseEntity<>(exeptionDTO, HttpStatus.NOT_FOUND);
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
}
