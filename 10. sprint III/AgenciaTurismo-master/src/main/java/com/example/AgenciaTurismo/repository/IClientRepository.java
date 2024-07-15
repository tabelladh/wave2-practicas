package com.example.AgenciaTurismo.repository;

import com.example.AgenciaTurismo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IClientRepository extends JpaRepository<Client,Long> {

    Optional<Client> findByUsername(String username);

    @Query("SELECT c FROM Client c ORDER BY bookingQuantity DESC LIMIT 3")
    List<Client> findTop3Clients();
}
