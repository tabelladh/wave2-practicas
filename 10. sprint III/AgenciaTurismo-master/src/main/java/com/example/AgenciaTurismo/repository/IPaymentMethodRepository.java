package com.example.AgenciaTurismo.repository;

import com.example.AgenciaTurismo.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}
