package com.example.calorias.config;

import com.example.calorias.dto.ErrorDto;
import com.example.calorias.exception.IngredientNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(IngredientNotFoundException.class)
    public ResponseEntity<?>ingredienteNotFound(){
        ErrorDto error = new ErrorDto("el ingrediente no existe.",400);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
