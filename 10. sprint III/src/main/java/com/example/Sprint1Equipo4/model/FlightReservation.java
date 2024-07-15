package com.example.Sprint1Equipo4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservations")
public class FlightReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private LocalDate dateFrom;

    private LocalDate dateTo;

    private String origin;

    private String destination;

    private String flightCode;

    private Integer seats;

    private String seatType;

    private LocalDate reservedDate;

    private Double totalPrice;


    @ManyToOne
    @JoinColumn(name="payments_method_id")
    private PaymentMethod paymentMethod;

    @OneToOne(mappedBy = "flightReservation")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name="clients_id")
    private Client client;

    public void setUserName(String userName) {
    }


}
