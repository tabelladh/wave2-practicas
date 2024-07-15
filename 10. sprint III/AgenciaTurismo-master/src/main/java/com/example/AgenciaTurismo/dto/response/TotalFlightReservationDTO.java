package com.example.AgenciaTurismo.dto.response;

import com.example.AgenciaTurismo.dto.request.FinalFlightReservationDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TotalFlightReservationDTO {
    private Double amount;
    private Double interest;
    private Double total;
    @JsonProperty ("flight_reservation")
    private FinalFlightReservationDTO finalFlightReservationDTO;
    @JsonProperty ("status_code")
    private StatusCodeDTO statusCode;


}
