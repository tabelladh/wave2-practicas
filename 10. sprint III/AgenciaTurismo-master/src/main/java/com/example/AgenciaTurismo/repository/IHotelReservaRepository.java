package com.example.AgenciaTurismo.repository;

import com.example.AgenciaTurismo.model.ReservarHotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface IHotelReservaRepository extends JpaRepository<ReservarHotel, Long> {

    @Query("SELECT r FROM ReservarHotel r WHERE r.cliente.id = :clientId")
    List<ReservarHotel> findByClientId(Long clientId);


    @Query("SELECT r FROM ReservarHotel r WHERE DATE(r.creationDate) = :dia")
    List<ReservarHotel> findByDia(@Param("dia") LocalDate dia);

    @Query("SELECT r FROM ReservarHotel r WHERE MONTH(r.creationDate) = :mes ")
    List<ReservarHotel> findByMes(@Param("mes") Integer mes);

}
