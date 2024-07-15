package com.example.AgenciaTurismo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "paquete_turistico")

public class TouristPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Column(name = "client_id")
    private Long clientId;

    @OneToMany(mappedBy = "paqueteTuristico", cascade = CascadeType.ALL)
    private List<ReservarHotel> reservaHotel;

    @OneToMany(mappedBy = "paqueteTuristico", cascade = CascadeType.ALL)
    private List<ReservarFlight> reservaFlight;


}
