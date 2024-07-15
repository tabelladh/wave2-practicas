package com.example.Sprint1Equipo4.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String hotelCode;
   private String name;
   private String destination;
   private String roomType;
   private Integer pricePerNight;
   private LocalDate dateFrom;
   private LocalDate dateTo;
   private Boolean reserved;
    @OneToOne
    @JoinColumn(name="booking_id", referencedColumnName = "id")
    private HotelBooking hotelBooking;

    public Hotel(String s, String cataratasHotel, String puertoIguazu, String aDouble, int i, LocalDate of, LocalDate of1, boolean b) {
    }
}
