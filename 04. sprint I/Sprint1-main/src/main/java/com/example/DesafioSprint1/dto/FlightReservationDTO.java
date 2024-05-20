package com.example.DesafioSprint1.dto;

import com.example.DesafioSprint1.dto.Request.PaymentMethodDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightReservationDTO {
    @JsonProperty("date_from")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateFrom;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonProperty("date_to")
    private LocalDate dateTo;
    private String origin;
    private String destination;
    @JsonProperty("flight_number")
    private String flightNumber;
    private int seats;
    @JsonProperty("seat_type")
    private String seatType;
    @JsonProperty("payment_method")
    public PaymentMethodDTO paymentMethod;
    private List<PeopleDTO> people;

}
