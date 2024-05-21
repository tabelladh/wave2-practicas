package com.example.Sprint1Equipo4.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor @NoArgsConstructor
public class FlightReqDto {

    private String userName;
    @JsonProperty("flight_reservation")
    private FlightReservationDto flightReservationDto;
}
