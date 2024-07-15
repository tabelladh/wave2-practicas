package com.example.AgenciaTurismo.dto;


import com.example.AgenciaTurismo.dto.response.TotalHotelReservationDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelReservedDTO {
    private TotalHotelReservationDTO hotelReserved;
}
