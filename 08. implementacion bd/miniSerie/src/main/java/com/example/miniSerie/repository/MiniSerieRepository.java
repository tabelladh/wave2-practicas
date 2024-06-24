package com.example.miniSerie.repository;

import com.example.miniSerie.model.MiniSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiniSerieRepository extends JpaRepository<MiniSerie,Long> {
}
