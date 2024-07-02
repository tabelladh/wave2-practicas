package com.example.AlumnoDTORP.repository;

import com.example.AlumnoDTORP.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAulaRepository extends JpaRepository<Aula, Integer> {

}
