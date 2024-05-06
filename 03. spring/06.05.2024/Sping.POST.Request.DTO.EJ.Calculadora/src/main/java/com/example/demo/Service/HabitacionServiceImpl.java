package com.example.demo.Service;

import com.example.demo.DTO.HabitacionDTO;
import com.example.demo.Model.Habitacion;
import com.example.demo.Model.Propiedad;
import org.springframework.stereotype.Service;

@Service
public class HabitacionServiceImpl implements IHabitacionService {


    @Override
    public Double calcularM2(Habitacion habitacion) {
        return (habitacion.getAncho()) * habitacion.getLargo();
    }


}
