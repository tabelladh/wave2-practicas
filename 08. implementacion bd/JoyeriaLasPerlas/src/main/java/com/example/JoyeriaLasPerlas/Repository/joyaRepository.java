package com.example.JoyeriaLasPerlas.Repository;

import com.example.JoyeriaLasPerlas.Model.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface joyaRepository extends JpaRepository<Joya, Integer> {
}
