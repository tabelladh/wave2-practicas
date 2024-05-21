package com.example.Sprint1Equipo4.dto.response;

import com.example.Sprint1Equipo4.model.Hotel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class HotelDTO {
   @JsonProperty("hotel_code")
   private String hotelCode;
   private String name;
   private String destination;
   @JsonProperty("room_type")
   private String roomType;
   @JsonProperty("price_per_night")
   private Integer pricePerNight;

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

   private Boolean reserved;

   public HotelDTO(Hotel hotel) {
   }
}
