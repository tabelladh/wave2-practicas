package service;

import java.time.LocalDate;

public class CalcServiceImpl implements CalcService{

    @Override
    public Integer calculadoraEdad(Integer diaNacimiento, Integer mesNacimiento, Integer anioNacimiento) {

        LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        LocalDate fechaActual = LocalDate.now();

        Integer edad;

        if (fechaNacimiento.getMonthValue() >= fechaActual.getMonthValue()) { // Si el mes es mayor o igual al actual
            if (fechaNacimiento.getDayOfMonth() > fechaActual.getDayOfMonth()) { // Si el dia es mayor al actual
                edad = fechaActual.getYear() - fechaNacimiento.getYear() - 1; // Todavía no cumplio, le resto 1 año
            }else {
                edad = fechaActual.getYear() - fechaNacimiento.getYear(); // es este mes y día, entonces Ya cumplio años
            }
        } else {
            edad = fechaActual.getYear() - fechaNacimiento.getYear(); // el mes es menor al mes actual, entones ya cumpllio años
        }
        return edad;
    }
}
