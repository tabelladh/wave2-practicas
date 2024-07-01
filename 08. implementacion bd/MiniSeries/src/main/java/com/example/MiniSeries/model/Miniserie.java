package com.example.MiniSeries.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Data

@Entity
@Table(name = "mini_series")
public class Miniserie {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "amount_of_awards")
    private Integer amountOfAwards;

}
