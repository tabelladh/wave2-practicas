package com.example.joyeria.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoFacturacion;

    @ManyToMany(mappedBy = "facturasList")
    private List<Cliente> clientes;
}
