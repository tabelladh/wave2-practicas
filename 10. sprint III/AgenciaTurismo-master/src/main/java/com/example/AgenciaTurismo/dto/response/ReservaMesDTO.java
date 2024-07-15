package com.example.AgenciaTurismo.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaMesDTO {
    private Integer mes;
    private Integer anio;
    @JsonProperty("total_income")
    private Double total;
}
