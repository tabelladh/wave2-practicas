package com.example.Joyeria.service;

import com.example.Joyeria.DTO.RespuestaDTO;
import com.example.Joyeria.model.Joya;
import com.example.Joyeria.repository.IJoyaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoyaService implements IJoyaService {

    private final IJoyaRepository joyaRepository;

    public JoyaService(IJoyaRepository joyaRepository) {
        this.joyaRepository = joyaRepository;
    }


    @Override
    public List<Joya> listarJoyas() {
        return joyaRepository.findAll();
    }

    @Override
    public RespuestaDTO crearJoya(Joya joya) {
        joyaRepository.save(joya);
        return new RespuestaDTO("Se agrego correctamente la nueva joya");
    }

    @Override
    public RespuestaDTO save(Integer id, Joya joya) {
        joya.setId(id);
        Joya joyanueva = joyaRepository.save(joya);
        return new RespuestaDTO ("Se actualizo correctamente la joya con nombre " + joyanueva.getNombre());
    }

    @Override
    public RespuestaDTO eliminarJoyas(Integer id) {
        joyaRepository.deleteById(id);
        return new RespuestaDTO("Se borro correctamente la joya");
    }

    @Override
    public Joya traerJoyaPorid(Integer id) {
        Joya joyaEncontrada = joyaRepository.findById(id).orElse(null);
        return joyaEncontrada;
    }
}
