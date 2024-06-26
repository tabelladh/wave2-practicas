package com.example.joyeria.service;

import com.example.joyeria.dto.ResDto;
import com.example.joyeria.dto.RespuestaDto;
import com.example.joyeria.model.Joya;
import com.example.joyeria.repository.JoyaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JoyaService implements IjoyaService{

    @Autowired
    JoyaRepository repository;


    @Override
    public List<Joya> listar() {
        List<Joya> listaVenta = repository.findAll().stream()
                .filter(j-> j.isVentaONo() == false)
                .toList();
        return listaVenta;
    }

    @Override
    public RespuestaDto crear(Joya joya) {
        repository.save(joya);
        return new RespuestaDto("se creo la joya exitosamente",201);
    }

    @Override
    public ResDto actualizar(Long id, Joya joya) {
        Joya joyaActualizada = new Joya(
                id,
                joya.getNombre(),
                joya.getMaterial(),
                joya.getPeso(),
                joya.getParticularidad(),
                joya.isPoseePiedra(),
                joya.isVentaONo()
        );
        repository.save(joyaActualizada);
        return new ResDto(200, joyaActualizada);
    }

    @Override
    public RespuestaDto borrar(Long id) {

        Joya joyaencontrada = repository.findById(id).orElse(null);

        if(!joyaencontrada.isVentaONo()){

            repository.deleteById(id);
            return new RespuestaDto("no se puede borrar",400);
        }

        joyaencontrada.setVentaONo(false);
        return new RespuestaDto("borrado con exito",204);
    }
}
