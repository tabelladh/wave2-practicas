package com.example.movies.repository;

import com.example.movies.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenreRepository extends JpaRepository<Genre, Integer> {
}
