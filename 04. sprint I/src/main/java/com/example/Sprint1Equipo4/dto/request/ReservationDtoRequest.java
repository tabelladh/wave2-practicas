package com.example.Sprint1Equipo4.dto.request;

import com.example.Sprint1Equipo4.dto.PeopleDto;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDtoRequest {
   @JsonProperty("user_name")
   private String userName;
   private BoockingDto booking;
}
