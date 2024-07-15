package com.example.AgenciaTurismo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payment_method")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    @Column(name = "number_card")
    private String numberCard;

    private Integer dues;

    @OneToOne(mappedBy = "paymentMethod")
    private ReservarHotel typeHotel;

    @OneToOne(mappedBy = "paymentMethod")
    private ReservarFlight typeFlight;
}

