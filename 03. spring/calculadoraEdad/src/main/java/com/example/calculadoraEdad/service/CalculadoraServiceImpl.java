package com.example.calculadoraEdad.service;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CalculadoraServiceImpl implements CalculadoraService{

    @Override
    public String calcularEdad(int year, int month, int day) {

        LocalDate fechaNacimiento = LocalDate.of(year, month, day);
        LocalDate fechaActual = LocalDate.now();
        int edad;

        if (fechaNacimiento.getMonthValue() >= fechaActual.getMonthValue()) { // Si el mes es mayor o igual al actual
            if (fechaNacimiento.getDayOfMonth() > fechaActual.getDayOfMonth()) { // Si el dia es mayor al actual
                edad = fechaActual.getYear() - fechaNacimiento.getYear() - 1; // Todavía no cumplio, le resto 1 año
            }else {
                edad = fechaActual.getYear() - fechaNacimiento.getYear(); // es este mes y día, entonces Ya cumplio años
            }
        } else {
            edad = fechaActual.getYear() - fechaNacimiento.getYear(); // el mes es menor al mes actual, entones ya cumpllio años
        }
        return "tenes " + edad;
    }
}

