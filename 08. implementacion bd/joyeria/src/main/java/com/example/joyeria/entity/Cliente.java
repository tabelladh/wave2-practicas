package com.example.joyeria.entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "cliente")
    private List<Joya> joyas;

    @ManyToMany
    @JoinTable(name = "facturas_has_cliente",
                        joinColumns = @JoinColumn(name = "cliente_id", referencedColumnName = "id"),
                        inverseJoinColumns = @JoinColumn(name = "factura_id", referencedColumnName = "id"))
    private List<Factura> facturasList;
}
