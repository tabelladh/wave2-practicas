package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.ExcepcionDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.dto.response.CursoDuracionDTO;
import com.example.AlumnoDTORP.exceptions.registroInexistenteException;
import com.example.AlumnoDTORP.model.Curso;
import com.example.AlumnoDTORP.repository.ICursoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
        Optional<Curso> curso = cursoRepository.findById(codigo);
        return modelMapper.map(curso, CursoDTO.class);
    }

    @Override
    public RespuestaDTO traerCertificado(String nombre) {
        Optional<Curso> curso = cursoRepository.findByNombre(nombre);

        if (curso.isEmpty()) {
           throw new registroInexistenteException();
        }

        boolean resultado = curso.map(Curso::getCertificado).orElse(false);

        if (!resultado) {
            return new RespuestaDTO("No tiene certificado");
        }
        return new RespuestaDTO("Sí tiene certificado");
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

    @Override
    public CursoDuracionDTO traerMaxDuracion() {

        Curso cursoEncontrado = cursoRepository.findByMaxDuracion();

        CursoDuracionDTO cursoEncontradoDto = new CursoDuracionDTO();
        cursoEncontradoDto.setDuracion(cursoEncontrado.getDuracion());
        cursoEncontradoDto.setNombre(cursoEncontrado.getNombre());

        return cursoEncontradoDto;
    }


}

