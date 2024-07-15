package com.example.Sprint1Equipo4.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class FlightReqDto {
    @Email(message = "Por favor ingrese un e-mail válido")
    private String userName;
    @JsonProperty("flight_reservation")
    private @Valid FlightReservationDto flightReservationDto;


}
