package com.example.joyeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroFactura;
    private int importe;

    @ManyToMany
    @JoinTable(
            name = "factura_cliente",
            joinColumns = @JoinColumn(name = "facturas_id"),
            inverseJoinColumns =@JoinColumn(name = "clientes_id")
    )
    private List<Cliente> clientes;
}
