package com.example.miniSerie.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
@Entity
@Table(name = "series")
public class MiniSerie {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Double rating;
    @Column(name = "amount_of_awards")
    int amountOfAwards;

}
