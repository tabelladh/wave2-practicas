package com.example.movies.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Integer rating;
    private Integer awards;
    @Column(name= "release_date")
    private Date releaseDate;
    private Integer length;

    @ManyToMany(mappedBy = "movies")
    private Set<Actor> actors;
}
