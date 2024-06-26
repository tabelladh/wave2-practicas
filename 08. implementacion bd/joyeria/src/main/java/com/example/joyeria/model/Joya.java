package com.example.joyeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "joyas")
public class Joya {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idjoyas")
   private Long idJoyas;

   @ManyToOne
   @JoinColumn(name = "clientes_idclientes")
   private Cliente cliente;

   @OneToOne(mappedBy = "joya", cascade = CascadeType.ALL)
   private Certificado certificado;

   @Column(nullable = false)
   private String nombre;

   @Column(nullable = false)
   private String material;

   @Column(nullable = false)
   private Double peso;

   @Column(nullable = false)
   private String particularidad;

   @Column(name="posee_piedra", nullable = false)
   private Boolean poseePiedra;

   @Column(nullable = false)
   private Boolean ventaONo;
}

