package com.example.Sprint1Equipo4.repository;

import com.example.Sprint1Equipo4.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
   Optional<Hotel> findByHotelCode(String hotelCode);
   boolean existsByHotelCode(String hotelCode);
}
