package com.example.AgenciaTurismo.dto.request;


import com.example.AgenciaTurismo.dto.FlightReservationDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinalFlightReservationDTO {
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("flight_reservation")
    private @Valid FlightReservationDTO flightReservationDTO;

}
