package com.example.DesafioSprint1.repository;

import com.example.DesafioSprint1.model.Hotel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class HotelRepository implements IHotelRepository{

    private List<Hotel> hotelList;

    public HotelRepository(){
        this.hotelList= loadData();
    }

    @Override
    public List<Hotel> findAll() {
        return hotelList;
    }


    @Override
    public Hotel findByHotelCode(String hotelCode) {
        Hotel hotel = hotelList.stream()
                .filter(h-> h.getHotelCode().equals(hotelCode))
                .findFirst()
                .orElse(null);
        return hotel;
    }

    @Override
    public Hotel save(Hotel hotel) {
        hotelList.add(hotel);
        return hotel;
    }

    @Override
    public Boolean delete(String hotelCode) {
        Hotel hotelsearch = findByHotelCode(hotelCode);
        hotelList.remove(hotelsearch);
        return true;
    }

    @Override
    public Hotel update(Hotel hotel) {
        Hotel hotelsearch = findByHotelCode(hotel.getHotelCode());
        hotel.setHotelCode(hotelsearch.getHotelCode()); // recuperamos el id

        hotelList.remove(hotelsearch);
        hotelList.add(hotel);

        return hotel;
    }

    private List<Hotel> loadData() {
        List<Hotel> loadedData = null;
        File file;

        ObjectMapper objectMapper = new ObjectMapper()
                .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .registerModule(new JavaTimeModule());

        TypeReference<List<Hotel>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:hoteles.json");
            loadedData = objectMapper.readValue(file, typeRef);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Failed while initializing DB, check your resources files");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed while initializing DB, check your JSON formatting.");
        }

        return loadedData;

    }



}
