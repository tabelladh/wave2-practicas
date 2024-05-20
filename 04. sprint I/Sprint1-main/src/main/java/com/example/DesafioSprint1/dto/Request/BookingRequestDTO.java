package com.example.DesafioSprint1.dto.Request;

import com.example.DesafioSprint1.dto.BookingDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequestDTO {

    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("booking")
    private BookingDTO bookingDTO;

}
