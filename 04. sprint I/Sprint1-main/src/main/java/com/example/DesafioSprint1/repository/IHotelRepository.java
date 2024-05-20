package com.example.DesafioSprint1.repository;

import com.example.DesafioSprint1.model.Hotel;

import java.util.List;

public interface IHotelRepository {

    List<Hotel> findAll();

    Hotel findByHotelCode(String hotelCode);

    Hotel save(Hotel hotel);

    Boolean delete (String hotelCode);

    Hotel update (Hotel hotel);


}
