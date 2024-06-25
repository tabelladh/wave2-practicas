package com.example.joyeria.service;

import com.example.joyeria.exception.JoyaNoEncontradaException;
import com.example.joyeria.model.Joya;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.joyeria.repository.JoyaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JoyaServiceImpl implements IJoyaService {

   @Autowired
   private JoyaRepository joyaRepository;

   @Override
   public Joya crearJoya(Joya joya) {
      return joyaRepository.save(joya);
   }

   @Override
   public List<Joya> obtenerJoyas() {
      return joyaRepository.findAll()
            .stream()
            .filter(joya -> joya.getVentaONo())
            .collect(Collectors.toList());
   }

   @Override
   public void eliminarJoya(Long id) {
      Joya joya = joyaRepository
            .findById(id)
            .orElseThrow(() -> new JoyaNoEncontradaException(id));
      joya.setVentaONo(false);
      joyaRepository.save(joya);
   }

   @Override
   public Joya actualizarJoya(Long id, Joya joyaActualizada) {
      Joya joya = joyaRepository
            .findById(id)
            .orElseThrow(() -> new JoyaNoEncontradaException(id));
      joya.setNroIdentificatorio(id);
      joya.setNombre(joyaActualizada.getNombre());
      joya.setMaterial(joyaActualizada.getMaterial());
      joya.setPeso(joyaActualizada.getPeso());
      joya.setParticularidad(joyaActualizada.getParticularidad());
      joya.setPoseePiedra(joyaActualizada.getPoseePiedra());
      return joyaRepository.save(joya);
   }
}