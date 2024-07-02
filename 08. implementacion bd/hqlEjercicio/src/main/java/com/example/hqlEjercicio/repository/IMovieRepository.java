package com.example.hqlEjercicio.repository;

import com.example.hqlEjercicio.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> {
}
