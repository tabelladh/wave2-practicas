package com.example.Sprint1Equipo4.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Hotel {
   private String hotelCode;
   private String name;
   private String destination;
   private String roomType;
   private Integer pricePerNight;
   private LocalDate dateFrom;
   private LocalDate dateTo;
   private Boolean reserved;

    public void setId(int i) {
    }

    public Object getId() {
        return null;
    }
}
