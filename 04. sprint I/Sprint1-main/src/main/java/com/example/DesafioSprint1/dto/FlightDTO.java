package com.example.DesafioSprint1.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {

        @JsonProperty("flight_number")
        private String flightNumber;
        private String origin;
        private String destination;
        @JsonProperty("seat_type")
        private String seatType;
        private Double amount;
        @JsonProperty("date_from")
        @JsonFormat(pattern = "dd-MM-yyyy")
        private LocalDate dateFrom;
        @JsonProperty("date_to")
        @JsonFormat(pattern = "dd-MM-yyyy")
        private LocalDate dateTo;
}
