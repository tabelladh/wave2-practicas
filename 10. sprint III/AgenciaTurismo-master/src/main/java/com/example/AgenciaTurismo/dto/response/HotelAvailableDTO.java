package com.example.AgenciaTurismo.dto.response;

import com.example.AgenciaTurismo.dto.HotelDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelAvailableDTO {
    private List<HotelDTO> availableHotelDTO;
}
