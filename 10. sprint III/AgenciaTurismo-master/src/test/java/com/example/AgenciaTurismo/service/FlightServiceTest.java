package com.example.AgenciaTurismo.service;


import com.example.AgenciaTurismo.dto.FlightDTO;
import com.example.AgenciaTurismo.dto.FlightReservationDTO;
import com.example.AgenciaTurismo.dto.PaymentMethodDTO;
import com.example.AgenciaTurismo.dto.PeopleDTO;
import com.example.AgenciaTurismo.dto.request.FinalFlightReservationDTO;
import com.example.AgenciaTurismo.dto.request.FlightConsultDTO;
import com.example.AgenciaTurismo.dto.response.FlightAvailableDTO;
import com.example.AgenciaTurismo.dto.response.StatusCodeDTO;
import com.example.AgenciaTurismo.dto.response.TotalFlightReservationDTO;
import com.example.AgenciaTurismo.model.Flight;
//import com.example.AgenciaTurismo.repository.IFlightRepository;
import com.example.AgenciaTurismo.repository.IFlightRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class FlightServiceTest {

    @Mock
    private IFlightRepository flightRepository;

    @InjectMocks
    private  FlightService flightService;

    private static final FlightDTO flightDTO1 = new FlightDTO("BAPI-1235", "Buenos Aires", "Puerto Iguazú", "Economy", 6500, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 15));
    private static final FlightDTO flightDTO2 = new FlightDTO("PIBA-1420", "Puerto Iguazú", "Bogotá", "Business", 43200, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 20));
    private static final FlightDTO flightDTO3 = new FlightDTO("PIBA-1420", "Puerto Iguazú", "Bogotá", "Economy", 25735, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 20));


    private static final Flight flight1 = new Flight("BAPI-1235", "Buenos Aires", "Puerto Iguazú", "Economy", 6500, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 15));
    private static final Flight flight2 = new Flight("PIBA-1420", "Puerto Iguazú", "Bogotá", "Business", 43200, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 20));
    private static final Flight flight3 = new Flight("PIBA-1420", "Puerto Iguazú", "Bogotá", "Economy", 25735, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 20));

    //Personas para la lista enviada
    private static final PeopleDTO peopleDTO1 = new PeopleDTO(42533885,"Joako","Cassina",LocalDate.of(2000,04,18), "joako@gmail.com");

    private static final PeopleDTO peopleDTO2 = new PeopleDTO(420000,"Juan","Casi",LocalDate.of(1999,05,19), "juan@gmail.com");


    //Metodo de pago enviado
    private static final PaymentMethodDTO metodoDTO = new PaymentMethodDTO("Credit", "0001", 3);

    private static final FlightReservationDTO reserva = new FlightReservationDTO(LocalDate.of(2025, 2, 10),
            LocalDate.of(2025, 2, 15), "Buenos Aires", "Puerto Iguazú", "Andre1235", 2.0, "Economy",
            List.of(peopleDTO1, peopleDTO2), metodoDTO);
    private static final FlightReservationDTO reservaFail = new FlightReservationDTO(LocalDate.of(2026, 2, 10),
            LocalDate.of(2026, 2, 15), "Buenos Aires", "Puerto Iguazú", "Andre1235", 2.0, "Economy",
            List.of(peopleDTO1, peopleDTO2), metodoDTO);

    // StatusCode de respuesta
    private static final StatusCodeDTO statusCodeDTO = new StatusCodeDTO(201, "El proceso terminó satisfactoriamente");


    //US-0004: Listar todos los vuelos registrados

    @Test
    @DisplayName("Test ListarVuelosDTO OK")
    public void listVuelosDTOTestOK() {

        List<FlightDTO> listaEsperadaDTO = new ArrayList<>();
        listaEsperadaDTO.add(flightDTO1);
        listaEsperadaDTO.add(flightDTO2);
        listaEsperadaDTO.add(flightDTO3);


        List<Flight> listaEsperada = new ArrayList<>();
        listaEsperada.add(flight1);
        listaEsperada.add(flight2);
        listaEsperada.add(flight3);

        // ACT
        Mockito.when(flightRepository.findAll()).thenReturn(listaEsperada);
        List<FlightDTO> listaDTO = flightService.listFlightsDTO();

        // ASSERT
        Assertions.assertEquals(listaEsperadaDTO, listaDTO);
    }


    //US-0005: Vuelos disponibles en determinado rango de fechas y destino

    @Test
    @DisplayName("Test VuelosDisponiblesDTO OK")
    public void vuelosDisponiblesDTOTestOK() {
        FlightConsultDTO flightConsultDTO = new FlightConsultDTO(LocalDate.of(2025, 2, 10),
                LocalDate.of(2025, 2, 15), "Buenos Aires", "Puerto Iguazú");

        FlightAvailableDTO vueloEsperado = new FlightAvailableDTO(List.of(flightDTO1));

        List<Flight> listaEsperada = new ArrayList<>();
        listaEsperada.add(flight1);

        // ACT
        Mockito.when(flightRepository.findAll()).thenReturn(listaEsperada);
        FlightAvailableDTO vuelosDisponibles = flightService.vuelosDisponibles(flightConsultDTO);

        // ASSERT
        Assertions.assertNotNull(vuelosDisponibles);
        Assertions.assertEquals(vueloEsperado, vuelosDisponibles);
    }

    @Test
    @DisplayName("Test VueloDisponibleDTO NO OK") // public HotelAvailableDTO hotelesDisponibles(HotelConsultDTO hotelConsultDTO)
    public void vuelosDisponiblesDTOTestNoOK() {

        FlightConsultDTO flightConsultDTO = new FlightConsultDTO(LocalDate.of(2025, 3, 10),
                LocalDate.of(2025, 3, 29), "Tucuman", "Rafaela");

        List<Flight> listaEsperada = new ArrayList<>();

        //ACT
        Mockito.when(flightRepository.findAll()).thenReturn(listaEsperada);

        //ASSERT
         Assertions.assertThrows(IllegalArgumentException.class, ()-> flightService.
                vuelosDisponibles(flightConsultDTO));

    }

    //US-0006: crear reserva
    @Test
    @DisplayName("Test reservas OK")
    public void reservedTestOK() {

        FinalFlightReservationDTO reservaCreada = new FinalFlightReservationDTO("Andrea", reserva);
        TotalFlightReservationDTO resultadoEsperado = new TotalFlightReservationDTO(13000.0, 650.0, 13650.0, reservaCreada, statusCodeDTO);

        List<Flight> listaEsperada = new ArrayList<>();
        listaEsperada.add(flight1);

        // ACT
        Mockito.when(flightRepository.findAll()).thenReturn(listaEsperada);
        TotalFlightReservationDTO resultadoObtenido = flightService.reserved(reservaCreada);


        // ASSERT
        Assertions.assertNotNull(resultadoObtenido);
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    @DisplayName("Test reserved NO OK")
    public void reservedTestNoOK() {
        FinalFlightReservationDTO reservaPasadaDTO  = new FinalFlightReservationDTO("Joako",reservaFail);

        List<Flight> listaEsperada = new ArrayList<>();
        Mockito.when(flightRepository.findAll()).thenReturn(listaEsperada);

        //ACT & ASSERT
        // Aquí se espera que el método reserved lance una InvalidReservationException
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            flightService.reserved(reservaPasadaDTO);
        });


    }



}

