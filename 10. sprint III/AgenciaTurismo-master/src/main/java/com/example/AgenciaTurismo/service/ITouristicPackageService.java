package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.TouristicPackageDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.model.TouristPackage;

import java.util.List;

public interface ITouristicPackageService {


    ResponseDTO createPackageHotel(TouristicPackageDTO paquete);
    ResponseDTO createPackageVuelo(TouristicPackageDTO paquete);
}