package com.example.AlumnoDTORP.repository;

import com.example.AlumnoDTORP.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Integer> {
    Optional<Curso> findByNombre(String nombre);

    @Query("SELECT c FROM Curso c WHERE c.duracion = (SELECT MAX(c.duracion) FROM Curso c)")
    Curso findByMaxDuracion();


}
