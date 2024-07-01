package com.example.Joyeria.Repository;

import com.example.Joyeria.Model.Jewel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JewelRepository extends JpaRepository<Jewel, Long> {
    List<Jewel> findAll();
}
