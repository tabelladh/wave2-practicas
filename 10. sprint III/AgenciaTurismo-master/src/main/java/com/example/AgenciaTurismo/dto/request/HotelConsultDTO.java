package com.example.AgenciaTurismo.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelConsultDTO {
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate DateFrom;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate DateTo;
    private String Destination;
    private String hotelCode;
}
