package com.example.Sprint1Equipo4.dto.request;

import com.example.Sprint1Equipo4.dto.PeopleDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class FlightReservationDto {

    @JsonProperty("date_from")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate dateFrom;
    @JsonProperty("date_to")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate dateTo;
    private String origin;
    private String destination;
    @JsonProperty("flight_code")
    private String flightCode;
    @Min(value = 1, message = "La cantidad de personas debe ser un valor numérico.")
    private Integer seats;
    @JsonProperty("seat_type")
    private String seatType;
    private List<PeopleDto>people;
    @JsonProperty("payment_method")
    private PaymentMethodsDto paymentMethodsDto;
}