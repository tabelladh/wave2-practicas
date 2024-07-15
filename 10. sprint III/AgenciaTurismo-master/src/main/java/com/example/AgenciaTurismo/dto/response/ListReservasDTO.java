package com.example.AgenciaTurismo.dto.response;

import com.example.AgenciaTurismo.dto.request.FinalFlightReservationDTO;
import com.example.AgenciaTurismo.dto.request.FinalHotelReservationDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListReservasDTO {

    private String message;
    private List<FinalHotelReservationDTO> listaReservaHotels;

    private List<FinalFlightReservationDTO> listaReservaFlight;
}
