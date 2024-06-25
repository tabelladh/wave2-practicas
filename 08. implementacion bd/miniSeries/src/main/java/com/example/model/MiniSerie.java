package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="miniserie")
public class MiniSerie {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(name = "name", nullable = false, length = 50)
   private String name;
   @Column(name="rating")
   private Double rating;
   @Column(name="amount_of_awards")
   private int amountOfAwards;
}
