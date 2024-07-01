package com.example.Joyeria.Service;

import com.example.Joyeria.Exception.JewelNotFound;
import com.example.Joyeria.Model.Jewel;
import com.example.Joyeria.Repository.JewelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JewelService {

    @Autowired
    private JewelRepository jewelRepository;

    public Jewel createJewel(Jewel jewel) {
        Jewel savedJewel = jewelRepository.save(jewel);
        return savedJewel;
    }

    public List<Jewel> getAllJewels() {
        return jewelRepository.findAll();
    }

    public Jewel getJewelById(Long id) {
        return jewelRepository.findById(id).orElseThrow(() -> new JewelNotFound("Joya con id " + id + " no encontrada"));
    }

    public Jewel updateJewel(Long id, Jewel jewelDetails) {
        Jewel jewel = jewelRepository.findById(id)
                .orElseThrow(() -> new JewelNotFound("No se encontró la joya con id " + id + " para ser actualizada"));
        jewel.setId(id);
        return jewelRepository.save(jewel);
    }

    public void deleteJewel(Long id) {
        Jewel jewel = jewelRepository.findById(id).orElseThrow(() -> new JewelNotFound("No se encontro la joya con id " + id + " para ser eliminada"));
        jewel.setVenta(false);
        jewelRepository.save(jewel);
        jewelRepository.deleteById(id);
    }
}
