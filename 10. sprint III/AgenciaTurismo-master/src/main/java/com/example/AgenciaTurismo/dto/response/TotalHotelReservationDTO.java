package com.example.AgenciaTurismo.dto.response;

import com.example.AgenciaTurismo.dto.request.FinalHotelReservationDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TotalHotelReservationDTO {
    private Double amount;
    private Double interest;
    private Double total;
    @JsonProperty("booking")
    private FinalHotelReservationDTO finalHotelReservation;
    @JsonProperty("status_code")
    private StatusCodeDTO statusCode;

}
