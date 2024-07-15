package com.example.Sprint1Equipo4.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationMonthDTO {
    private Integer month;
    private Integer year;
    @JsonProperty("total_income")
    private Double totalIncome;
}
