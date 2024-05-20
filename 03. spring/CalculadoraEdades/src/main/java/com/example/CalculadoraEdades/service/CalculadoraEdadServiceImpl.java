package com.example.CalculadoraEdades.service;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class CalculadoraEdadServiceImpl implements CalculadoraEdadService {

    @Override
    public Integer calcularEdad(int dia, int mes, int anio) {

        LocalDate birthDate = LocalDate.of(anio, mes, dia);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}
