package com.example.Joyeria.Config;

import com.example.Joyeria.DTO.ErrorDTO;
import com.example.Joyeria.Exception.JewelNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice(annotations = RestController.class)
public class ExceptionController {

    @ExceptionHandler(JewelNotFound.class)
    public ResponseEntity<ErrorDTO> handleJewelNotFoundException(JewelNotFound ex, WebRequest request) {
        ErrorDTO errorDTO = new ErrorDTO(ex.getMessage(), HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }
}