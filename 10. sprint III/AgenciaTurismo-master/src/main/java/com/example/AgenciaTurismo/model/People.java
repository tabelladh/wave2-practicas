package com.example.AgenciaTurismo.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "people")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer dni;
    private String name;
    @Column(name ="last_name")
    private String lastName;
    @Column(name = "birth_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;
    private String email;

    @ManyToOne
    @JoinColumn(name = "reservar_hotels_id")
    private ReservarHotel reservationHotel;

    @ManyToOne
    @JoinColumn(name = "reservar_flights_id")
    private ReservarFlight reservationFlight;
}
