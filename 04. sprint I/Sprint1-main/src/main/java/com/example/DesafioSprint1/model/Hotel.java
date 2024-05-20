package com.example.DesafioSprint1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {


    @JsonProperty("hotel_code")
    private String hotelCode;
    @JsonProperty("hotel_name")
    private String hotelName;
    private String destination;
    @JsonProperty("room_type")
    private String roomType;
    private Double amount;
    @JsonProperty("date_from")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateFrom;
    @JsonProperty("date_to")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateTo;
    private String reserved;

}
