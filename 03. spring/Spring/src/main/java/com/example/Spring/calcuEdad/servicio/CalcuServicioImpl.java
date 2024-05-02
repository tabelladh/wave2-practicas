package com.example.Spring.calcuEdad.servicio;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;

@Service
public class CalcuServicioImpl implements CalcuServicio {

    @Override
    public int calcularEdad(int dia, int mes, int anio) {
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }
}