package com.example.AgenciaTurismo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "reservar_flights")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservarFlight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double seats;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @OneToMany(mappedBy = "reservationFlight", cascade = CascadeType.ALL)
    private List<People> people;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flights_id", unique =true)
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "paquete_turistico_id")
    private TouristPackage paqueteTuristico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clients_id")
    private Client cliente;
}
