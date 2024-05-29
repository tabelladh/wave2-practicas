package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.response.CursoDuracionDTO;
import com.example.AlumnoDTORP.model.Curso;
import com.example.AlumnoDTORP.repository.ICursoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<CursoDTO> traerTodos() {
        List<Curso> cursoList = cursoRepository.findAll();
        return cursoList.stream()
                .map(curso -> modelMapper
                        .map(curso, CursoDTO.class))
                .toList();
    }

    @Override
    public CursoDTO traerPorId(Integer codigo) {
        Curso curso = cursoRepository.findById(codigo);
        return modelMapper.map(curso, CursoDTO.class);
    }

    @Override
    public CursoDuracionDTO traerMasHoras() {
        CursoDuracionDTO cursoDto;

        cursoDto = cursoRepository.findAll().stream()
                .map(c -> new CursoDuracionDTO(
                        c.getNombre(),
                        c.getDuracion()))
                .max(Comparator.comparingDouble(CursoDuracionDTO::getDuracion))
                .orElseThrow(() -> new RuntimeException("No hay cursos"));

        return cursoDto;
    }


}

