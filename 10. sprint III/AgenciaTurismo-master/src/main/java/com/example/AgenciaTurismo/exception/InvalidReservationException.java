package com.example.AgenciaTurismo.exception;

import lombok.Getter;

@Getter
public class InvalidReservationException extends RuntimeException {

    private final String errorMessage;

    public InvalidReservationException(final String errorMessage){
        this.errorMessage = errorMessage;
    }
}
