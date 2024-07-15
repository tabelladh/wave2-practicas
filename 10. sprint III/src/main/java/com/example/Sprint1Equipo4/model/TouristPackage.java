package com.example.Sprint1Equipo4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tourist_packages")
public class TouristPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageNumber;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date creationDate;

    private Long clientId;

    @ElementCollection
    private List<Long> bookingsOrReservations = new ArrayList<>();

}
