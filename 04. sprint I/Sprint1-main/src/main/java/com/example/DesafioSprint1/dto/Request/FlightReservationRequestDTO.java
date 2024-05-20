package com.example.DesafioSprint1.dto.Request;

import com.example.DesafioSprint1.dto.FlightReservationDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightReservationRequestDTO {
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("flight_reservation")
    private FlightReservationDTO flightReservation;
}