package com.example.demo.Service;

import com.example.demo.DTO.PropiedadDTO;
import com.example.demo.DTO.RespuestaDTO;
import com.example.demo.Model.Habitacion;
import com.example.demo.Model.Propiedad;
import org.springframework.stereotype.Service;

@Service
public class PropiedadServiceImpl implements IPropiedadService {


    @Override
    public RespuestaDTO calcularTotalM2Propiedad(PropiedadDTO propiedad) {
        Double m2Total=0.0;
        for (Habitacion h : propiedad.getHabitaciones()) {
            m2Total+= new HabitacionServiceImpl().calcularM2(h);
        }
    return new RespuestaDTO("El tamaño en m2 de la propiedad es: " + m2Total);
    }

    @Override
    public RespuestaDTO calcularCostoTotalPropiedad(PropiedadDTO propiedad, Double valorM2) {
        Double m2Total=0.0;
        for (Habitacion h : propiedad.getHabitaciones()) {
            m2Total+= new HabitacionServiceImpl().calcularM2(h);
        }

        return new RespuestaDTO("El valor de la propiedad es: " +
                m2Total * valorM2 );
    }

    @Override
    public RespuestaDTO retornarHabitacionMasGrande(PropiedadDTO propiedad) {
        Habitacion masGrande=propiedad.getHabitaciones().get(0);
        for (Habitacion h : propiedad.getHabitaciones()) {
if(new HabitacionServiceImpl().calcularM2(h) > new HabitacionServiceImpl().calcularM2(masGrande)  )
{
    masGrande=h;
}

        }
return new RespuestaDTO("La habitacion mas grande es la " + masGrande.toString());
    }

public RespuestaDTO retornarm2Habitacion(PropiedadDTO propiedad) {
     String rta = "";

     for(Habitacion h : propiedad.getHabitaciones())
     {
         rta += "habitacion "+ h.toString() + "m2 total: " + new HabitacionServiceImpl().calcularM2(h);
     }

     return new RespuestaDTO("Se listan las habitaciones y sus m2 : " + rta);
    }


}
