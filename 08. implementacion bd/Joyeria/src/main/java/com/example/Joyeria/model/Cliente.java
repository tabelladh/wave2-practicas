package com.example.Joyeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name= "nombre")
    String name;
    @Column(name= "apellido")
    String apellido;
    @Column(name= "direccion")
    String direccion;

    @OneToMany(mappedBy = "cliente")
    private List<Joya> joyas;

    @ManyToMany
    @JoinTable (
            name = "cliente_facturas",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "factura_id")
    )
    private List<Factura> facturas;
}
