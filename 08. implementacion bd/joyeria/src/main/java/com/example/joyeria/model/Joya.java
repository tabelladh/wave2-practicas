package com.example.joyeria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
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
   private Long nroIdentificatorio;

   private String nombre;

   private String material;

   private Double peso;

   private String particularidad;

   @Column(name="posee_piedra")
   private Boolean poseePiedra;

   private Boolean ventaONo;

}

