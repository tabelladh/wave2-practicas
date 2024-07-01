package com.example.Joyeria.Model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "client")
    private List<Jewel> jewel;
}
