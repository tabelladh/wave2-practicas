package com.example.AgenciaTurismo.dto.response;

import com.example.AgenciaTurismo.dto.FlightDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightAvailableDTO {
    private List<FlightDTO> availableFlightDTO;

}
