package com.example.AgenciaTurismo.service;


import com.example.AgenciaTurismo.dto.HotelDTO;
import com.example.AgenciaTurismo.dto.HotelReservationDTO;
import com.example.AgenciaTurismo.dto.PaymentMethodDTO;
import com.example.AgenciaTurismo.dto.PeopleDTO;
import com.example.AgenciaTurismo.dto.request.FinalHotelReservationDTO;
import com.example.AgenciaTurismo.dto.request.HotelConsultDTO;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDTO;
import com.example.AgenciaTurismo.dto.response.StatusCodeDTO;
import com.example.AgenciaTurismo.dto.response.TotalHotelReservationDTO;
import com.example.AgenciaTurismo.model.Hotel;
import com.example.AgenciaTurismo.repository.IHotelRepository;
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
public class HotelServiceTest {

    @Mock
    private IHotelRepository hotelRepository;

    @InjectMocks
    private HotelService hotelService;

//    List<Hotel> hotelList = new ArrayList<>(
//            new Hotel(1L, "CH-0002", "Cataratas Hotel", "Puerto Iguazú", "Doble", 6300, "2025-02-10", "2025-03-20", 0)
//    );
    private static final HotelDTO hotelDTO1 = new HotelDTO("CH-0002", "Cataratas Hotel", "Puerto Iguazú",
            "Doble", 6300, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 20), false);

    private static final HotelDTO hotelDTO2 = new HotelDTO("CH-0003", "Cataratas Hotel 2", "Puerto Iguazú",
            "Triple", 8200, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 23), false);

    private static final HotelDTO hotelDTO3 = new HotelDTO("HB-0001", "Hotel Bristol", "Buenos Aires",
            "Single", 5435, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 19), false);

//    private static final Hotel hotel1 = new Hotel("CH-0002", "Cataratas Hotel", "Puerto Iguazú",
//            "Doble", 6300, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 20), false);
//
//    private static final Hotel hotel2 = new Hotel("CH-0003", "Cataratas Hotel 2", "Puerto Iguazú",
//            "Triple", 8200, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 23), false);
//
//    private static final Hotel hotel3 = new Hotel("HB-0001", "Hotel Bristol", "Buenos Aires",
//            "Single", 5435, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 19), false);

    //Personas para la lista enviada
    private static final PeopleDTO peopleDTO1 = new PeopleDTO("42533885","Joako","Cassina",LocalDate.of(2000,04,18), "joako@gmail.com");

    private static final PeopleDTO peopleDTO2 = new PeopleDTO("420000","Juan","Casi",LocalDate.of(1999,05,19), "juan@gmail.com");


    //Metodo de pago enviado
    private static final PaymentMethodDTO metodoDTO = new PaymentMethodDTO("Debit", "0001", 1);


    //Reserva de hotel enviada
    private static final HotelReservationDTO reservaHotelDTO = new HotelReservationDTO(LocalDate.of(2025, 2, 10),
            LocalDate.of(2025, 3, 20),"Puerto Iguazú","CH-0002",2.0,"Doble", List.of(peopleDTO1,peopleDTO2),metodoDTO);


    private static final HotelReservationDTO reservaHotelFail = new HotelReservationDTO(LocalDate.of(2025, 2, 10),
            LocalDate.of(2025, 3, 20),
            "Rafaela","CH-0002",2.0,"Doble", List.of(peopleDTO1,peopleDTO2),metodoDTO);



    // StatusCode de respuesta
    private static final StatusCodeDTO statusCodeDTO = new StatusCodeDTO(201, "El proceso terminó satisfactoriamente");


    // US-0001: Listar todos los hoteles registrados
    @Test
    @DisplayName("Test ListarHotelesDTO OK")   //public List<HotelDTO> listHotelsDTO()
    public void listHotelesDTOTestOK(){

//        List<HotelDTO> listaEsperadaDTO = new ArrayList<>();
//        listaEsperadaDTO.add(hotelDTO1);
//        listaEsperadaDTO.add(hotelDTO2);
//        listaEsperadaDTO.add(hotelDTO3);
        List<HotelDTO> resultado = hotelService.listarHotels();

        //ACT
//        Mockito.when(hotelRepository.findAll()).thenReturn(listaEsperadaDTO);
//        List<HotelDTO> listaDTO = hotelService.listarHotels();

        //ASSERT
        Assertions.assertEquals(12, resultado.size());
        Assertions.assertEquals("Cataratas Hotel", resultado.get(0).getHotelName());
    }


    // US-0002: Hoteles Disponible
    @Test
    @DisplayName("Test HotelDisponibleDTO OK") // public HotelAvailableDTO hotelesDisponibles(HotelConsultDTO hotelConsultDTO)
    public void hotelesDisponiblesDTOTestOK() {

        HotelConsultDTO hotelConsultadoDTO = new HotelConsultDTO(LocalDate.of(2025, 2, 10),
                LocalDate.of(2025, 3, 19), "Buenos Aires");


        HotelAvailableDTO hotelEsperado = new HotelAvailableDTO(List.of(hotelDTO3));

        List<Hotel> listaEsperada = new ArrayList<>();
        listaEsperada.add(hotel3);


        //ACT
        Mockito.when(hotelRepository.findAll()).thenReturn(listaEsperada);
        HotelAvailableDTO hotelDisponible = hotelService.hotelesDisponibles(hotelConsultadoDTO);

        //ASSERT
        Assertions.assertNotNull(hotelDisponible);
        Assertions.assertEquals(hotelEsperado, hotelDisponible);

    }
    //TEST NOOK
    @Test
    @DisplayName("Test HotelDisponibleDTO NO OK") // public HotelAvailableDTO hotelesDisponibles(HotelConsultDTO hotelConsultDTO)
    public void hotelesDisponiblesDTOTestNoOK() {

        HotelConsultDTO hotelConsultadoDTO = new HotelConsultDTO(LocalDate.of(2025, 3, 10),
                LocalDate.of(2025, 3, 29), "Tucuman");


        List<Hotel> listaEsperada = new ArrayList<>();
        listaEsperada.add(hotel3);


        //ACT
        Mockito.when(hotelRepository.findAll()).thenReturn(listaEsperada);


        //ASSERT
        Assertions.assertThrows(IllegalArgumentException.class, ()-> hotelService.
                hotelesDisponibles(hotelConsultadoDTO));

    }


    // US-0003: Crear Reserva
    @Test
    @DisplayName("Test reserved OK")
    public void reservedTestOK() {
        FinalHotelReservationDTO reservaPasadaDTO  = new FinalHotelReservationDTO("Joako",reservaHotelDTO);

        TotalHotelReservationDTO respuestaEsperada = new TotalHotelReservationDTO(12600.0, 0.0, 12600.0,
                reservaPasadaDTO,statusCodeDTO);

        List<Hotel> listaEsperada = new ArrayList<>();
        listaEsperada.add(hotel1);
        Mockito.when(hotelRepository.findAll()).thenReturn(listaEsperada);

        TotalHotelReservationDTO respuestaObtenida = hotelService.reserved(reservaPasadaDTO);

        Assertions.assertEquals(respuestaEsperada, respuestaObtenida);
        Assertions.assertEquals(201, respuestaObtenida.getStatusCode().getCode());

        System.out.println("Mensaje: " + respuestaObtenida);

    }

    //Test NOOK
    @Test
    @DisplayName("Test reserved NO OK")
    public void reservedTestNoOK() {
        FinalHotelReservationDTO reservaPasadaDTO  = new FinalHotelReservationDTO("Joako",reservaHotelFail);

        List<Hotel> listaEsperada = new ArrayList<>();
        Mockito.when(hotelRepository.findAll()).thenReturn(listaEsperada);

        //ACT & ASSERT
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            hotelService.reserved(reservaPasadaDTO);
        });

        String mensajeError = exception.getMessage();
        System.out.println("Mensaje de error: " + mensajeError);

    }



}
