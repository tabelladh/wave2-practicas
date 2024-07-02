package com.example.Movies_HQL.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private Double rating;
    private Integer awards;
    private LocalDate releaseDate;
    private Integer length;

    @ManyToMany(mappedBy = "movies")
    private Set<Actor> actors;


}
