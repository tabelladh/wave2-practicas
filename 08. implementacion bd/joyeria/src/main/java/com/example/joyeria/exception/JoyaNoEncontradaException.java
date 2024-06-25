package com.example.joyeria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class JoyaNoEncontradaException extends RuntimeException {
   public JoyaNoEncontradaException(Long id) {
      super("Joya con ID " + id + " no encontrada.");
   }
}