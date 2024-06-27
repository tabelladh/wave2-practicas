package com.example.relaciones.OneToOne;

import jakarta.persistence.*;

@Entity
@Table(name ="adress")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy ="address")
    private User user;
}
