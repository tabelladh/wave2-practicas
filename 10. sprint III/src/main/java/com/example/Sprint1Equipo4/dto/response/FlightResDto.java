package com.example.Sprint1Equipo4.dto.response;

import com.example.Sprint1Equipo4.dto.request.FlightReservationDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class FlightResDto {

    @JsonProperty("user_name")
    private String userName;
    private Integer amount;
    private Double interest;
    private Double total;
    private FlightReservationDto flightReservationDto;
    private StatusDTO statusDTO;

}
