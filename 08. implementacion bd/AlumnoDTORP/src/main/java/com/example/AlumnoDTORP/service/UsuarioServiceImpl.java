package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.dto.response.UsuarioDTO;
import com.example.AlumnoDTORP.model.Usuario;
import com.example.AlumnoDTORP.repository.IUsuarioRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Autowired
    ModelMapper modelMapper = new ModelMapper();
    @Override
    public List<UsuarioDTO> listarUsuarios() {
        List<Usuario> usuariosList = usuarioRepository.findAll();

        TypeMap<Usuario, UsuarioDTO> typeMap = modelMapper.createTypeMap(Usuario.class, UsuarioDTO.class);
        typeMap.addMappings(mapper -> mapper.map(Usuario::getAlumno, UsuarioDTO::setAlumnoDto));


        return usuariosList.stream()
                .map(usuario -> modelMapper.map(usuario, UsuarioDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public RespuestaDTO borrarUsuario(Integer id) {
        usuarioRepository.deleteById(id);
        return new RespuestaDTO("Se ha borrado el usuario con id: " + id);
    }
}
