package com.example.joyeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "facturas")
public class Factura {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idfacturas")
   private Integer idFacturas;

   @ManyToMany
   @JoinTable(
         name = "facturas_has_clientes",
         joinColumns = @JoinColumn(name = "facturas_idfacturas"),
         inverseJoinColumns = @JoinColumn(name = "clientes_idclientes")
   )
   private Set<Cliente> clientes;
}