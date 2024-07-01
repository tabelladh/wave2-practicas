package com.example.MiniSeries.repository;

import com.example.MiniSeries.model.Miniserie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMiniserieRepository extends JpaRepository<Miniserie, Long> {
}
