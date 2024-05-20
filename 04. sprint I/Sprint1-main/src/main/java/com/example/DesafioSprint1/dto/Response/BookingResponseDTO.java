package com.example.DesafioSprint1.dto.Response;

import com.example.DesafioSprint1.dto.BookingDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"userName", "amount", "interest", "total", "bookingDTO", "statusDTO"})
public class BookingResponseDTO {

        @JsonProperty("user_name")
        private String userName;
        private Double amount;
        private Double interest;
        private Double total;
        @JsonProperty("booking")
        private BookingDTO bookingDTO;
        @JsonProperty("status")
        private StatusDTO statusDTO;

}
