package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.config.MiMapper;
import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.exceptions.registroInexistenteException;
import com.example.AlumnoDTORP.model.Alumno;
import com.example.AlumnoDTORP.model.Curso;
import com.example.AlumnoDTORP.repository.IAlumnoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.AlumnoDTORP.config.MiMapper.mapAlumnoToAlumnoDTO;

@Service
public class AlumnoServiceImpl implements IAlumnoService {
    

    //Inyectemos la dependencia
    @Autowired
    private IAlumnoRepository alumnoRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<AlumnoDTO> listarAlumnos() {
        List<Alumno> alumnosList = alumnoRepository.findAll();
        return alumnosList.stream()
                .map(MiMapper::mapAlumnoToAlumnoDTO)
                .toList();
    }

    @Override
    public AlumnoDTO buscarPorId(Integer id) {
        Alumno alumno = alumnoRepository.findById(id);

        if (!alumnoRepository.existsById(id)) {
            throw new registroInexistenteException();
        }

        return mapAlumnoToAlumnoDTO(alumno);
    }

    @Override
    public RespuestaDTO agregarAlumno(AlumnoDTO alumnoDTO) {
        Alumno alumno = new Alumno();

        modelMapper.map(alumnoDTO,alumno);

        alumnoRepository.save(alumno);

        return new RespuestaDTO("Alumno agregado correctamente");
    }

    @Override
    public RespuestaDTO borrarAlumno(Integer id) {
        alumnoRepository.delete(id);
        return new RespuestaDTO("Alumno borrado correctamente");
    }

    @Override
    public AlumnoDTO actualizarAlumno(AlumnoDTO alumnoDTO) {

        Alumno alumno = new Alumno();
        modelMapper.map(alumnoDTO,alumno);

        alumnoRepository.update(alumno);

        return alumnoDTO;
    }

    @Override
    public Boolean existeAlumno(Integer id) {
        return alumnoRepository.existsById(id);
    }


}
