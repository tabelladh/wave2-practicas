package com.example.AgenciaTurismo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightReservationDTO {
    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonProperty("going_date")
    @Future(message = "La fecha de entrada debe ser mayor al día de hoy")
    private LocalDate dateFrom;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonProperty("return_date")
    @Future(message = "La fecha de salida debe ser mayor al día de hoy")
    private LocalDate dateTo;
    private String origin;
    private String destination;
    @JsonProperty("flight_code")
    private String flightCode;
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @Positive(message = "La cantidad de personas debe ser un valor numérico.")
    private Double seats;
    @JsonProperty("seat_type")
    private String seatType;
    @JsonProperty("people")
    private List<@Valid PeopleDTO> peopleDTO;
    @JsonProperty("payment_method")
    private PaymentMethodDTO paymentMethodDTO;

}
