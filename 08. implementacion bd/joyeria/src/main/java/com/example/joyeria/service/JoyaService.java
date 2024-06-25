package com.example.joyeria.service;

import com.example.joyeria.DTO.JoyaDTO;
import com.example.joyeria.DTO.ResponseDTO;
import com.example.joyeria.exception.ExceptionJoyas;
import com.example.joyeria.model.Joya;
import com.example.joyeria.repository.IJoyaRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
public class JoyaService implements IJoyaService {

    @Autowired
    private IJoyaRepository joyaRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseDTO agregarJoya(JoyaDTO joyaDTO){
        joyaDTO.setVentaOno(true);
        Joya joya = new Joya();
        modelMapper.map(joyaDTO,joya);
       Joya joyita = joyaRepository.save(joya);
        return  new ResponseDTO ("Joya agregada" + " " + joyita.getNroIdentificatorio());

    }
    public ResponseDTO borrarJoya(Integer id ) {
        if (!joyaRepository.existsById(id)) {
            throw new RuntimeException();
        }
        modelMapper

    }



}
