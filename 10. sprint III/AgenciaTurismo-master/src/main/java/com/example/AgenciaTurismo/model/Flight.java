package com.example.AgenciaTurismo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @Column(name = "flight_code")
    private String flightCode;

    private String origin;

    private String destination;

    @Column(name = "seat_type")
    private String seatType;

    private Integer price;

    @Column(name = "date_from")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateFrom;

    @Column(name = "date_to")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateTo;

    private Boolean reserved;

    @OneToOne(mappedBy = "flight",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ReservarFlight reservation;

}
