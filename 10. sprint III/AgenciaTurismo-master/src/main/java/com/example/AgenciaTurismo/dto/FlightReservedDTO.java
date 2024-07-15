package com.example.AgenciaTurismo.dto;

import com.example.AgenciaTurismo.dto.response.TotalFlightReservationDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightReservedDTO {
    private TotalFlightReservationDTO flightReserved;
}
