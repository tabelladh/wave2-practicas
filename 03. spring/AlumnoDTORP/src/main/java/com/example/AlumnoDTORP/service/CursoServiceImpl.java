package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.CursoDuracionDTO;
import com.example.AlumnoDTORP.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepository;
    @Override
    public List<CursoDTO> traerTodos() {
        return cursoRepository.findAll().stream()
                .map(c -> new CursoDTO(
                        c.getCodigo(),
                        c.getNombre(),
                        c.getGrado(),
                        c.getCertificado(),
                        c.getDuracion()))
                .toList();
    }

    @Override
    public CursoDuracionDTO traerMasHoras() {
        CursoDuracionDTO cursoDto = new CursoDuracionDTO();
        cursoDto = cursoRepository.findAll().stream()
                .map(c -> new CursoDuracionDTO(
                        c.getNombre(),
                        c.getDuracion()))
                .max((c1, c2) -> Double.compare(c1.getDuracion(), c2.getDuracion()))
                .get();
        return cursoDto;
    }


}

