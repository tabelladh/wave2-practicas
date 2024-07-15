package com.example.AgenciaTurismo.integrationTest;

import com.example.AgenciaTurismo.dto.HotelDTO;
import com.example.AgenciaTurismo.dto.HotelReservationDTO;
import com.example.AgenciaTurismo.dto.PaymentMethodDTO;
import com.example.AgenciaTurismo.dto.PeopleDTO;
import com.example.AgenciaTurismo.dto.request.FinalHotelReservationDTO;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.dto.response.StatusCodeDTO;
import com.example.AgenciaTurismo.dto.response.TotalHotelReservationDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class HotelControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper = new ObjectMapper()
            .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
            .registerModule(new JavaTimeModule());

    private static final HotelDTO hotelDTO1 = new HotelDTO("CH-0002", "Cataratas Hotel", "Puerto Iguazú",
            "Doble", 6300, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 20), false);

    private static final HotelDTO hotelDTO2 = new HotelDTO("CH-0003", "Cataratas Hotel 2", "Puerto Iguazú",
            "Triple", 8200, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 23), false);

    private static final HotelDTO hotelDTO3 = new HotelDTO("HB-0001", "Hotel Bristol", "Buenos Aires",
            "Single", 5435, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 19), false);

    private static final HotelDTO hotelDTO1up = new HotelDTO("RH-0005", "Cata Hotel", "Puerto Iguazú",
            "Doble", 6300, LocalDate.of(2025, 2, 15), LocalDate.of(2025, 3, 29), false);


    //Personas para la lista enviada
    private static final PeopleDTO peopleDTO1 = new PeopleDTO(42533885,"Joako","Cassina",LocalDate.of(2000,04,18), "joako@gmail.com");

    private static final PeopleDTO peopleDTO2 = new PeopleDTO(420000,"Juan","Casi",LocalDate.of(1999,05,19), "juan@gmail.com");

    //Metodo de pago enviado
    private static final PaymentMethodDTO metodoDTO = new PaymentMethodDTO("Debit", "0001", 1);

    //Reserva de hotel enviada
    private static final HotelReservationDTO reservaHotelDTO = new HotelReservationDTO(LocalDate.of(2025, 2, 10),
            LocalDate.of(2025, 3, 20),"Puerto Iguazú","CH-0002",2.0,"Doble", List.of(peopleDTO1,peopleDTO2),metodoDTO);

    private static final StatusCodeDTO statusCodeDTO = new StatusCodeDTO(201, "El proceso terminó satisfactoriamente");


    //US 01: test de integracion de listar hoteles
    @Test
    public void listarHotelesTestOK() throws Exception {
        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(List.of(hotelDTO1,hotelDTO2,hotelDTO3)));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);
        mockMvc.perform(get("/api/v1/listHotels"))
                .andExpectAll(statusEsperado,bodyEsperado,contentTypeEsperado)
                .andDo(print());
    }

    //US 02: buscar hoteles disponibles

    @Test
    public void hotelesDisponiblesTestOK() throws Exception {
        String dateFromConsul = "10-02-2025";
        String dateToConsul = "20-03-2025";
        String destinationConsult = "Puerto Iguazú";

        HotelAvailableDTO respuestaEsperada = new HotelAvailableDTO(List.of(hotelDTO1));

        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado= MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(respuestaEsperada));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(get("/api/v1/hotels")
                        .param("dateFrom",dateFromConsul)
                        .param("dateTo",dateToConsul)
                        .param("destination",destinationConsult))
                .andExpectAll(statusEsperado,bodyEsperado,contentTypeEsperado)
                .andDo(print());
    }

    //US 0003: devolver reserva

    @Test
    public void reservedTestOK() throws Exception {
        FinalHotelReservationDTO reservaConstulta = new FinalHotelReservationDTO("Agustina",reservaHotelDTO);
        String payloadDto = objectMapper.writeValueAsString(reservaConstulta);

        TotalHotelReservationDTO respuestaEsperada = new TotalHotelReservationDTO(12600.0, 0.0, 12600.0,
                reservaConstulta,statusCodeDTO);

        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isCreated();
        ResultMatcher bodyEsperado= MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(respuestaEsperada));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(post("/api/v1/booking")
                .contentType(MediaType.APPLICATION_JSON)
                .content(payloadDto))
                .andExpectAll(statusEsperado,bodyEsperado,contentTypeEsperado)
                .andDo(print());


    }

                                    //CRUD Methods

    //CREATE
    @Test
    public void createHotelTestOK() throws Exception {
        //ARRANGE
        String payloadDto = objectMapper.writeValueAsString(hotelDTO1up);
        ResponseDTO respuestaEsperada = new ResponseDTO("Hotel creado con éxito");


        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isCreated();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(respuestaEsperada));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        //ASSERT
        mockMvc.perform(post("/api/v1/createHotel")
                        .contentType(MediaType.APPLICATION_JSON) //indicamos el tipo de contenido
                        .content(payloadDto))             //indicamos el contenido , ya tiene q estar pasado de obj a Json
                .andExpectAll(statusEsperado,bodyEsperado,contentTypeEsperado)
                .andDo(print());
    }

    //UPDATE
    @Test
    public void updateHotelTestOK() throws Exception {
        HotelDTO hotelDTO3Up = new HotelDTO("HB-0001", "Hotel Bristol", "Rafaela",
                "Single", 5435, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 19), false);


        String payloadDto = objectMapper.writeValueAsString(hotelDTO3Up);
        ResponseDTO respuestaEsperada = new ResponseDTO("Hotel actualizado con éxito");
        String hotelCodeEntrada =  "HB-0001";

        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(respuestaEsperada));
        ResultMatcher typeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(put("/api/v1/updateHotel/{hotelCode}",hotelCodeEntrada)
                        .contentType(MediaType.APPLICATION_JSON) //indicamos el tipo de contenido
                        .content(payloadDto))
                .andExpectAll(statusEsperado,bodyEsperado,typeEsperado)
                .andDo(print());
    }

    //DELETE
    @Test
    public void deleteHotelTestOK() throws Exception {
        String hotelCodeEntrada =  "HB-0001";
        ResponseDTO respuestaEsperada = new ResponseDTO("Hotel eliminado con éxito");

        ResultMatcher statusEsperado = MockMvcResultMatchers.status().isOk();
        ResultMatcher bodyEsperado = MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(respuestaEsperada));
        ResultMatcher contentTypeEsperado = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(delete("/api/v1/deleteHotel/{hotelCode}",hotelCodeEntrada))
                .andExpectAll(statusEsperado, bodyEsperado, contentTypeEsperado)
                .andDo(print());
    }

}
