package com.example.AgenciaTurismo.repository;

import com.example.AgenciaTurismo.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IPeopleRepository extends JpaRepository<People, Long> {

    Optional<People> findByName (String name);
}
