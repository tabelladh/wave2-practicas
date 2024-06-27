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
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name= "num_factura")
    String numFactura;
    @Column(name= "descripcion")
    String descripcion;

    @ManyToMany (mappedBy = "facturas")
    private List<Cliente> clientes;
}
