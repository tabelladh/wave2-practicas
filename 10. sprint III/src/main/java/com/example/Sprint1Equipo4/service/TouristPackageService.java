package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.model.TouristPackage;

import java.util.List;

public interface TouristPackageService {

    List<TouristPackage> getAllPackages();

    TouristPackage createPackage(TouristPackage paquete);

    TouristPackage updatePackage(Long packageNumber, TouristPackage packageDetails);

    void deletePackage(Long packageNumber);

    boolean reservationExists(Long reservationId);

}
