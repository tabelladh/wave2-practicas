package com.example.Sprint1Equipo4.repository;

import com.example.Sprint1Equipo4.model.Hotel;
import java.util.List;
import java.util.Optional;

public interface HotelRepository {
   List<Hotel> findAll();


   Hotel save(Hotel hotel);

   boolean delete(String hotelCode);

   Optional<Hotel> findByHotelCode(String hotelCode);

   Hotel findByCode(String hotelCode);

   boolean existsByCode(String hotelCode);

   Hotel update(Hotel hotel);

}
