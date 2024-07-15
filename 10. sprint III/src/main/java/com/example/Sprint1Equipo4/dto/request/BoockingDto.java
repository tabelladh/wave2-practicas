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
@NoArgsConstructor
public class BoockingDto {
    @JsonProperty("booking_id")
    private Integer bookingId;

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

    private String destination;

    @JsonProperty("hotel_code")
    private String hotelCode;

    @Min(value = 1, message = "La cantidad de personas debe ser un valor numérico.")
    @JsonProperty("people_amount")

    private Integer peopleAmount;

    @JsonProperty("room_type")
    private String roomType;

    private List<PeopleDto>people;

    @JsonProperty("payment_method")
    private PaymentMethodsDto payment;

    public BoockingDto(LocalDate dateFrom, LocalDate dateTo, String destination, String hotelCode,
                       Integer peopleAmount, String roomType, List<PeopleDto> people, PaymentMethodsDto payment) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.destination = destination;
        this.hotelCode = hotelCode;
        this.peopleAmount = peopleAmount;
        this.roomType = roomType;
        this.people = people;
        this.payment = payment;
    }
}
