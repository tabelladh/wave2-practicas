package com.example.AgenciaTurismo.repository;

import com.example.AgenciaTurismo.model.ReservarFlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface IFlightReservaRepository extends JpaRepository<ReservarFlight, Long> {

    @Query("SELECT r FROM ReservarFlight r WHERE r.cliente.id = :clientId")
    List<ReservarFlight> findByClientId(Long clientId);

    @Query("SELECT r FROM ReservarFlight r WHERE DATE(r.creationDate) = :dia")
    List<ReservarFlight> findByDia(@Param("dia") LocalDate dia);

    @Query("SELECT r FROM ReservarFlight r WHERE MONTH(r.creationDate) = :mes ")
    List<ReservarFlight> findByMes(@Param("mes") Integer mes);

}
