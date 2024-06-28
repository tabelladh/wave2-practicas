package com.example.JoyeriaLasPerlas.Service;

import com.example.JoyeriaLasPerlas.DTO.RespuestaDTO;
import com.example.JoyeriaLasPerlas.Model.Joya;
import com.example.JoyeriaLasPerlas.Repository.joyaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class joyaService implements IJoyaService {

    private final joyaRepository joyaRepo;

    public joyaService(joyaRepository joyaRepo) {
        this.joyaRepo = joyaRepo;
    }

    @Override
    @Transactional
    public List<Joya> getJoyas() {
        List<Joya> joyaList = joyaRepo.findAll();
        return joyaList;
    }

    @Override
    @Transactional
    public RespuestaDTO saveJoya(Joya joya) {
        joyaRepo.save(joya);
        return new RespuestaDTO("Joya guardada correctamente");
    }

    @Override
    @Transactional
    public RespuestaDTO deleteJoya(Integer id) {
        joyaRepo.deleteById(id);
        return new RespuestaDTO("Joya eliminada correctamente");
    }

    @Override
    @Transactional
    public RespuestaDTO updateJoya(Joya joya, Integer id) {
        Optional<Joya> joyaId = joyaRepo.findById(id);
        joya.setId(id);
        Joya joyaActualizada = joyaRepo.save(joya);
        return new RespuestaDTO("Joya actualizada correctamente");
    }

    @Override
    @Transactional
    public Joya getJoya(Integer id) {
        Joya joya = joyaRepo.findById(id).orElse(null);
        return joya;
    }
}
