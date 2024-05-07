package com.example.demoMetrosCuadrados.service;
import com.example.demoMetrosCuadrados.model.Habitacion;
import org.springframework.stereotype.Service;

@Service
public class HabitacionServiceImpl implements IHabilitacionService {


    @Override
    public Double calcularM2(Habitacion habitacion) {
        return habitacion.getLargo() * habitacion.getAncho();
    }
}
