package org.example.model;

import static org.example.model.utils.*;

public class obtenerPremio {

    double premio;
    double montoParcial1, montoParcial2, montoParcial3;
    double descuentos;
    double montoFinal;

    public double calcularPremio(double premio) {

        montoParcial1 = premio * imp1;
        montoParcial2 = premio * imp2;
        montoParcial3 = premio * imp3;

        descuentos = montoParcial1 + montoParcial2 + montoParcial3;


        montoFinal = premio - descuentos;

        return montoFinal;
    }

}
