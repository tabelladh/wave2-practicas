package com.example.Joyeria.Model;


import javax.persistence.*;
import java.util.List;


@Entity
@Table (name = "jewel_bill")
public class JewelBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "jewel_bill_jewel",
            joinColumns = @JoinColumn(name = "jewel_bill_id"),
            inverseJoinColumns = @JoinColumn(name = "jewel_id"))
    private List<Jewel> jewel;
}
