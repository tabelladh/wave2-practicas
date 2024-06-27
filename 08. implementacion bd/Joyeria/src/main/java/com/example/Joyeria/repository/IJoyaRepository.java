package com.example.Joyeria.repository;

import com.example.Joyeria.model.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoyaRepository extends JpaRepository <Joya, Integer> {
}
