package com.example.joyeria.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "certificados")
public class Certificado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    @OneToOne(mappedBy = "certificado")
    private Joya joya;
}
