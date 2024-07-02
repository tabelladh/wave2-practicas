package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
//import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.exceptions.registroInexistenteException;
import com.example.AlumnoDTORP.model.Alumno;
//import com.example.AlumnoDTORP.model.Curso;
import com.example.AlumnoDTORP.repository.IAlumnoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

    //Inyectemos la dependencia
    @Autowired
    private IAlumnoRepository alumnoRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<AlumnoDTO> listarAlumnos() {
        return alumnoRepository.findAll().stream()
                .map(alumno -> modelMapper.map(alumno, AlumnoDTO.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public AlumnoDTO buscarPorId(Integer id) {
        return alumnoRepository.findById(id)
                .map(alumno -> modelMapper.map(alumno, AlumnoDTO.class))
                .orElseThrow(registroInexistenteException::new);
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
        if (!alumnoRepository.existsById(id)){
            throw new registroInexistenteException();
        }
        alumnoRepository.deleteById(id);
        return new RespuestaDTO("Alumno borrado correctamente");
    }

    @Override
    public AlumnoDTO actualizarAlumno(Integer id, AlumnoDTO alumnoDTO) {
        if (!alumnoRepository.existsById(id)) {
            throw new registroInexistenteException();
        }
        Alumno alumno = modelMapper.map(alumnoDTO, Alumno.class);
        alumno.setId(id); // Asegúrate de establecer el ID
        Alumno updatedAlumno = alumnoRepository.save(alumno);
        return modelMapper.map(updatedAlumno, AlumnoDTO.class);
    }

    @Override
    public Boolean existeAlumno(Integer id) {
        return alumnoRepository.existsById(id);
    }

    @Override
    public AlumnoDTO buscarPorDni(Integer dni) {
        Alumno alumno = alumnoRepository.findByDni(dni);
        if (alumno == null) {
            throw new registroInexistenteException();
        }
        return modelMapper.map(alumno, AlumnoDTO.class);
    }

    @Override
    public List<AlumnoDTO> buscarPorNombreYApellidos(String nombre, String apellidos) {
        List<Alumno> alumnosEncontrados = alumnoRepository.findByNombreAndApellidos(nombre, apellidos);
        if (alumnosEncontrados.isEmpty()) {
            throw new registroInexistenteException();
        }

        return  alumnosEncontrados.stream()
                .map(alumno -> modelMapper.map(alumno, AlumnoDTO.class))
                .toList();
    }

    @Override
    public AlumnoDTO alumnoConCursos(Integer id) {
        Optional<Alumno> alumno = alumnoRepository.findById(id);

        if (alumno != null) {
            return modelMapper.map(alumno, AlumnoDTO.class);
        } else {
            throw new registroInexistenteException();
        }
    }


}
