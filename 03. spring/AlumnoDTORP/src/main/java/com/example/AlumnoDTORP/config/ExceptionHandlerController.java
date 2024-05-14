package com.example.AlumnoDTORP.config;

import com.example.AlumnoDTORP.dto.ErrorDTO;
import com.example.AlumnoDTORP.exceptions.registroInexistenteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(registroInexistenteException.class)
    public ResponseEntity<?> registroDuplicado(Exception e){
        ErrorDTO error = new ErrorDTO("Registro inexistente", 404);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }


}
