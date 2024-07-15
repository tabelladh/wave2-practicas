package com.example.Sprint1Equipo4.repository;

import com.example.Sprint1Equipo4.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod,Long>{
    PaymentMethod findByTypeAndNumber(String type, String number);
}
