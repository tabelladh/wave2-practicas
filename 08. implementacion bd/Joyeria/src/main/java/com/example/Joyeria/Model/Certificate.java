package com.example.Joyeria.Model;


import javax.persistence.*;


@Entity
@Table (name = "certificate")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "jewel_id")
    private Jewel jewel;

}
