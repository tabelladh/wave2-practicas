package com.example.AlumnoDTORP.repository;

import com.example.AlumnoDTORP.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAlumnoRepository extends JpaRepository<Alumno, Integer> {

    // TODO: findBy + atributo + operador + ...
    // Operadores logicos : AND - OR - EQUALS - CONTAINS - NOT EQUALS - LESS THAN EQUALS
    List<Alumno> findByNombreAndApellidos(String nombre, String apellidos);

    Alumno findByDni(Integer dni);
}
