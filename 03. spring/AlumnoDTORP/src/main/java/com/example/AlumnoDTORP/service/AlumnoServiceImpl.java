package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.model.Alumno;
import com.example.AlumnoDTORP.model.Curso;
import com.example.AlumnoDTORP.repository.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

    //Inyectemos la dependencia
    @Autowired
    private IAlumnoRepository alumnoRepository;


    @Override
    public List<AlumnoDTO> listarAlumnos() {
        return alumnoRepository.findAll().stream()
                .map(a -> new AlumnoDTO(
                        a.getId(),
                        a.getNombre(),
                        a.getApellidos(),
                        a.getFechaNacimiento(),
                        a.getDni(),
                        a.getDireccion(),
                        a.getCursosList().stream()
                                .map(c -> new CursoDTO(
                                        c.getCodigo(),
                                        c.getNombre(),
                                        c.getGrado(),
                                        c.getCertificado(),
                                        c.getDuracion()))
                                .toList()))
                .toList();

    }

    @Override
    public AlumnoDTO buscarPorId(Integer id) {
        Alumno alumno = alumnoRepository.findById(id);

        return new AlumnoDTO(
                alumno.getId(),
                alumno.getNombre(),
                alumno.getApellidos(),
                alumno.getFechaNacimiento(),
                alumno.getDni(),
                alumno.getDireccion(),
                alumno.getCursosList().stream(
                        ).map(c -> new CursoDTO(
                                c.getCodigo(),
                                c.getNombre(),
                                c.getGrado(),
                                c.getCertificado(),
                                c.getDuracion()
                        )).toList());
    }

    @Override
    public RespuestaDTO agregarAlumno(AlumnoDTO alumnoDTO) {
        Alumno alumno = new Alumno();
        alumno.setNombre(alumnoDTO.getNombre());
        alumno.setApellidos(alumnoDTO.getApellidos());
        alumno.setFechaNacimiento(alumnoDTO.getFechaNacimiento());
        alumno.setDni(alumnoDTO.getDni());
        alumno.setDireccion(alumnoDTO.getDireccion());

        List<Curso> cursosList = new ArrayList<>();
        for (CursoDTO cursoDTO : alumnoDTO.getCursosList()) {
            cursosList.add(new Curso(
                    cursoDTO.getCodigo(),
                    cursoDTO.getNombre(),
                    cursoDTO.getGrado(),
                    cursoDTO.getCertificado(),
                    cursoDTO.getDuracion()));
        }
        alumno.setCursosList(cursosList);

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
        alumno.setId(alumnoDTO.getId());
        alumno.setNombre(alumnoDTO.getNombre());
        alumno.setApellidos(alumnoDTO.getApellidos());
        alumno.setFechaNacimiento(alumnoDTO.getFechaNacimiento());
        alumno.setDni(alumnoDTO.getDni());
        alumno.setDireccion(alumnoDTO.getDireccion());

        List<Curso> cursosList = new ArrayList<>();
        for (CursoDTO cursoDTO : alumnoDTO.getCursosList()) {
            cursosList.add(new Curso(
                    cursoDTO.getCodigo(),
                    cursoDTO.getNombre(),
                    cursoDTO.getGrado(),
                    cursoDTO.getCertificado(),
                    cursoDTO.getDuracion()));
        }
        alumno.setCursosList(cursosList);

        alumnoRepository.update(alumno);

        return alumnoDTO;
    }

    @Override
    public Boolean existeAlumno(Integer id) {
        return alumnoRepository.existsById(id);
    }


}
