package com.example.Sprint1Equipo4.dto.response;

import com.example.Sprint1Equipo4.dto.PeopleDto;
import com.example.Sprint1Equipo4.dto.request.BoockingDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {

   @JsonProperty("user_name")
   private String userName;
   private String amount;
   private String interest;
   private String total;
   private BoockingDto booking;
   private StatusDTO status;
}
