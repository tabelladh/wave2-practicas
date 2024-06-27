package com.example.joyeria.service;

import com.example.joyeria.entity.Joya;
import com.example.joyeria.resquest.RespuestaDTO;
import com.example.joyeria.resquest.RespuestaJoyaDTO;
import com.example.joyeria.repository.IJoyaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class JoyaService implements IJoyaService {

    @Autowired
    IJoyaRepository repository;

    @Override
    public List<Joya> listarJoyas() {
        return repository.findByVentaONo(true);
    }

    @Override
    public RespuestaDTO crearJoya(Joya joya) {
        repository.save(joya);
        return new RespuestaDTO("Joya Creada con Éxito", 201);

    }

    @Override
    public RespuestaJoyaDTO actualizarJoya(Long id, Joya joya) {
        Joya joyaActualizada = new Joya(
                                    id,
                                    joya.getNombre(),
                                    joya.getMaterial(),
                                    joya.getPeso(),
                                    joya.getParticularidad(),
                                    joya.getPoseePiedra(),
                                    joya.getVentaONo(),
                                    joya.getCertificado(),
                                    joya.getCliente()
                                    );
        repository.save(joyaActualizada);
        return new RespuestaJoyaDTO(joyaActualizada, 200);
    }

    @Override
    public RespuestaDTO borrarJoya(Long id) {
        Optional<Joya> optionalJoya = repository.findById(id);
        if (optionalJoya.isPresent()) {
            Joya joya = optionalJoya.get();
            joya.setVentaONo(false); // Marcar la joya como inactiva
            repository.save(joya);
            return new RespuestaDTO("Joya Marcada como No Disponible", 200);
        } else {
            return new RespuestaDTO("Joya no encontrada", 404);
        }
    }
}
