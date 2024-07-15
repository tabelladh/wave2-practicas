package com.example.AgenciaTurismo.repository;

import com.example.AgenciaTurismo.model.TouristPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITouristicPackageRepository extends JpaRepository <TouristPackage, Long> {

}
