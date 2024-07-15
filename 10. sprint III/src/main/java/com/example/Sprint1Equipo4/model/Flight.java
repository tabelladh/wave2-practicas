package com.example.Sprint1Equipo4.model;


import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("flight_code")
    private String flightCode;
    private String origin;
    private String destination;

    @JsonProperty("seat_type")
    private String seatType;
    @JsonProperty("price_per_person")
    private Integer pricePerPerson;
    @JsonFormat(pattern ="dd/MM/yyyy")
    @JsonProperty("date_from")
    private LocalDate dateFrom;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("date_to")
    private LocalDate dateTo;

    @OneToOne
    @JoinColumn(name="reservation_id", referencedColumnName = "id")
    private FlightReservation flightReservation;
}
