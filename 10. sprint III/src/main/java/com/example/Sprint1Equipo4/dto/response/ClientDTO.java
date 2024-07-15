package com.example.Sprint1Equipo4.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClientDTO {
   @JsonProperty("top_number")
   private int topNumber;

   @JsonProperty("year")
   private int year;

   @JsonProperty("booking_quantity")
   private int bookingQuantity;

   @JsonProperty("total_amount")
   private Double totalAmount;

   @JsonProperty("client_id")
   private int clientId;

   @JsonProperty("client_name")
   private String clientName;

}
