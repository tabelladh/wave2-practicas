package com.example.AgenciaTurismo.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class HotelReservationDTO {
    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonProperty("date_from")
    @Future(message = "La fecha de entrada debe ser mayor al dia de hoy")
    //@Pattern( regexp = "\\d{2}-\\d{2}-\\d{4}",message = "Formato de fecha debe ser dd-mm-aaaa")
    private LocalDate dateFrom;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonProperty("date_to")
    @Future(message = "La fecha de salida debe ser en el futuro")
    private LocalDate dateTo;
    private String destination;
    @JsonProperty("hotel_code")
    private String hotelCode;
    @JsonProperty ("people_amount")
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @Positive(message = "La cantidad de personas debe ser un valor numérico.")
    private Double peopleAmount;
    @JsonProperty("room_type")
    private String roomType;
    @JsonProperty("people")
    private List<@Valid PeopleDTO> peopleDTO;
    @JsonProperty("payment_method")
    private PaymentMethodDTO paymentMethodDTO;

}