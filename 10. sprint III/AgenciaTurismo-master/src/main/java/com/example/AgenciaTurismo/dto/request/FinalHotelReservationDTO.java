package com.example.AgenciaTurismo.dto.request;


import com.example.AgenciaTurismo.dto.HotelReservationDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinalHotelReservationDTO {
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("booking")
    private @Valid HotelReservationDTO hotelReservationDTO;
}
