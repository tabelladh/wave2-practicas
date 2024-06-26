package com.example.joyeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idclientes")
   private Integer idClientes;

   @ManyToMany(mappedBy = "clientes")
   private Set<Factura> facturas;

   @OneToMany(mappedBy = "cliente")
   private List<Joya> joyas;
}