package com.example.DesafioSprint1.dto.Response;

import com.example.DesafioSprint1.dto.FlightReservationDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"userName", "amount", "interest", "total", "bookingDTO", "statusDTO"})
public class FlightReservationResponseDTO {
    @JsonProperty("user_name")
    private String userName;
    private Double amount;
    private Double interest;
    private Double total;
    @JsonProperty("flight_reservation")
    private FlightReservationDTO flightReservation;
    @JsonProperty("status_code")
    private StatusDTO statusDTO;
}