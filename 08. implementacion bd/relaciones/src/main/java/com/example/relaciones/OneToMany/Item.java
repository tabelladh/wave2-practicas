package com.example.relaciones.OneToMany;

import jakarta.persistence.*;

@Entity
@Table(name ="items")
public class Item {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @ManyToOne
        @JoinColumn(name = "cart_id", nullable = false)
        private Cart cart;
}