package com.example.hqlEjercicio.repository;

import com.example.hqlEjercicio.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenreRepository extends JpaRepository<Genre, Integer> {
}
