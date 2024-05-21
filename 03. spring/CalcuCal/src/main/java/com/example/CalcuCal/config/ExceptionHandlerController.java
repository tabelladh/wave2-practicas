package com.example.CalcuCal.config;

import com.example.CalcuCal.dto.ErrorDTO;
import com.example.CalcuCal.exception.IngredienteNonExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {


    @ExceptionHandler(IngredienteNonExistException.class)
    public ResponseEntity<ErrorDTO> handleIngredienteNonExistException(IngredienteNonExistException ex) {
        ErrorDTO error = new ErrorDTO("Uno de los ingredientes de su plato no existe o no esta registrado, revise por favor",404);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }



}
