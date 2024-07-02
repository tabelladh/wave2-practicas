package com.example.AlumnoDTORP.repository;

import com.example.AlumnoDTORP.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
}
