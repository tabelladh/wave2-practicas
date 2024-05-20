package com.example.DesafioSprint1.dto;

import com.example.DesafioSprint1.dto.PeopleDTO;
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
public class BookingDTO {

        private String destination;
        @JsonProperty("date_from")
        @JsonFormat(pattern = "dd-MM-yyyy")
        private LocalDate dateFrom;
        @JsonProperty("date_to")
        @JsonFormat(pattern = "dd-MM-yyyy")
        private LocalDate dateTo;
        @JsonProperty("hotel_code")
        private String hotelCode;
        private Integer people_amount;
        @JsonProperty("room_type")
        private String roomType;
        @JsonProperty("people")
        private List<PeopleDTO> peopleList;
        @JsonProperty("payment_method")
        private PaymentMethodDTO paymentMethodDTO;


}
