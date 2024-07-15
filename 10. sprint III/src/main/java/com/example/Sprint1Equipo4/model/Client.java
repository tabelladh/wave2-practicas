package com.example.Sprint1Equipo4.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "booking_quantity")
    private int bookingQuantity;

    @JsonProperty("user_name")
    private String userName;

    @OneToMany(mappedBy = "client")
    private List<HotelBooking> hotelBooking;

    @OneToMany(mappedBy = "client")
    private List<FlightReservation> flightReservation;


}
