package com.example.Sprint1Equipo4.unit.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import com.example.Sprint1Equipo4.dto.PeopleDto;
import com.example.Sprint1Equipo4.dto.request.BoockingDto;
import com.example.Sprint1Equipo4.dto.request.PaymentMethodsDto;
import com.example.Sprint1Equipo4.dto.response.HotelDTO;
import com.example.Sprint1Equipo4.dto.response.ReservationDto;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.exception.HotelNotFoundException;
import com.example.Sprint1Equipo4.model.Hotel;
import com.example.Sprint1Equipo4.repository.HotelRepository;
import com.example.Sprint1Equipo4.service.HotelServiceImpl;
import jakarta.validation.constraints.Max;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.example.Sprint1Equipo4.dto.request.ReservationDtoRequest;

@ExtendWith(MockitoExtension.class)
public class HotelServiceImplTest {

    @Mock
    private HotelRepository hotelRepository;

    @InjectMocks
    private HotelServiceImpl hotelService;

    @Mock
    private ModelMapper modelMapper;

    private static final Hotel hotel1 = new Hotel("CH-0002", "Cataratas Hotel", "Puerto Iguazu", "Double", 6300,
            LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 20), false);
    private static final Hotel hotel2 = new Hotel("CH-0003", "Cataratas Hotel 2", "Puerto Iguazu", "Triple", 8200,
            LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 23), false);

    private static final HotelDTO hotelDTO1 = new HotelDTO("CH-0002", "Cataratas Hotel", "Puerto Iguazu", "Double", 6300,
            LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 20), false);
    private static final HotelDTO hotelDTO2 = new HotelDTO("CH-0003", "Cataratas Hotel 2", "Puerto Iguazu", "Triple", 8200,
            LocalDate.of(2025, 2, 10), LocalDate.of(2025, 3, 23), false);

    private static final PeopleDto people1 = new PeopleDto("12345678","pepe","peras","1990-05-25","pepe@peras.com");
    private static final PeopleDto people2 = new PeopleDto("12345678","pepa","peras","1990-07-09","pepa@peras.com");
    private static final PaymentMethodsDto pay1 = new PaymentMethodsDto("CREDIT","1234-5678-9123-4567",3);
    private static final BoockingDto book = new BoockingDto(LocalDate.of(2025, 02, 10),LocalDate.of(2025, 03, 20),"Puerto Iguazu","CH-0002",2,"DOUBLE",List.of(people1,people2),pay1);
    private static final ReservationDtoRequest req = new ReservationDtoRequest("pepe@peras.com",book);

    @Test
    public void testListHotels() {
        // Arrange

        List<Hotel> mockHotelList = Arrays.asList(hotel1, hotel2);

        // Act
        Mockito.when(hotelRepository.findAll()).thenReturn(mockHotelList);
        Mockito.when(modelMapper.map(hotel1, HotelDTO.class)).thenReturn(hotelDTO1);
        Mockito.when(modelMapper.map(hotel2, HotelDTO.class)).thenReturn(hotelDTO2);
        List<HotelDTO> result = hotelService.listHotels();

        // Assert
        Assertions.assertEquals(2, result.size(), "El tamaño de la lista no es el esperado");

        Assertions.assertEquals("CH-0002", result.get(0).getHotelCode(), "El código del hotel no coincide");
        Assertions.assertEquals("Cataratas Hotel", result.get(0).getName(), "El nombre del hotel no coincide");
        Assertions.assertEquals("Puerto Iguazu", result.get(0).getDestination(), "El destino del hotel no coincide");
        Assertions.assertEquals("Double", result.get(0).getRoomType(), "El tipo de habitación no coincide");
        Assertions.assertEquals(6300, result.get(0).getPricePerNight(), "El precio por noche no coincide");
        Assertions.assertEquals(LocalDate.of(2025, 2, 10), result.get(0).getDateFrom(), "La fecha de inicio no coincide");
        Assertions.assertEquals(LocalDate.of(2025, 3, 20), result.get(0).getDateTo(), "La fecha de fin no coincide");
        Assertions.assertEquals(false, result.get(0).getReserved(), "El estado de reserva no coincide");

        Assertions.assertEquals("CH-0003", result.get(1).getHotelCode(), "El código del hotel no coincide");
        Assertions.assertEquals("Cataratas Hotel 2", result.get(1).getName(), "El nombre del hotel no coincide");
        Assertions.assertEquals("Puerto Iguazu", result.get(1).getDestination(), "El destino del hotel no coincide");
        Assertions.assertEquals("Triple", result.get(1).getRoomType(), "El tipo de habitación no coincide");
        Assertions.assertEquals(8200, result.get(1).getPricePerNight(), "El precio por noche no coincide");
        Assertions.assertEquals(LocalDate.of(2025, 2, 10), result.get(1).getDateFrom(), "La fecha de inicio no coincide");
        Assertions.assertEquals(LocalDate.of(2025, 3, 23), result.get(1).getDateTo(), "La fecha de fin no coincide");
        Assertions.assertEquals(false, result.get(1).getReserved(), "El estado de reserva no coincide");

        verify(hotelRepository, times(1)).findAll();
        verify(modelMapper, times(1)).map(hotel1, HotelDTO.class);
        verify(modelMapper, times(1)).map(hotel2, HotelDTO.class);
    }


    @Test
    void searchByCode() {

        String idDeEntrada = "CH-0002";

        Mockito.when(hotelRepository.findByCode(idDeEntrada)).thenReturn(hotel1);
        Mockito.when(hotelRepository.existsByCode(idDeEntrada)).thenReturn(true);
        Mockito.when(modelMapper.map(hotel1, HotelDTO.class)).thenReturn(hotelDTO1);

        HotelDTO result = hotelService.searchByCode(idDeEntrada);

        Assertions.assertEquals(hotelDTO1, result, "Los hoteles no coinciden");

    }

    @Test
    void searchByCode_HotelNotFound() {
        // Arrange
        String hotelCode = "CH-0002";

        // Act
        Mockito.when(hotelRepository.findByCode(hotelCode)).thenReturn(null);


        // Assert
        Assertions.assertThrows(HotelNotFoundException.class, () -> {
            hotelService.searchByCode(hotelCode);
        });
    }

    @Test
    public void testExistsByCode_HotelExists() {
        // Arrange
        String hotelCode = "CH-0002";

        // Act
        Mockito.when(hotelRepository.existsByCode(hotelCode)).thenReturn(true);
        boolean result = hotelService.existsHotel(hotelCode);

        // Assert
        Assertions.assertTrue(result, "El hotel debería existir");
    }

    @Test
    public void testExistsByCode_HotelDoesNotExist() {

        // Arrange
        String hotelCode = "CH-0005";

        // Act
        Mockito.when(hotelRepository.existsByCode(hotelCode)).thenReturn(false);
        boolean result = hotelService.existsHotel(hotelCode);

        // Assert
        Assertions.assertFalse(result, "El hotel no debería existir");
    }

    @Test
    void saveHotel() {

        // Act
        HotelDTO hotelDtoResult = hotelService.saveHotel(hotelDTO1);

        // Assert
        Assertions.assertNotNull(hotelDtoResult, "El hotel no deberia estar vacio");

    }

    @Test
    void updateHotel() {

        // Act
        HotelDTO hotelDtoResult = hotelService.updateHotel(hotelDTO1);

        // Assert
        Assertions.assertNotNull(hotelDtoResult, "El hotel no deberia estar vacio");

    }

    @Test
    void findAvailableHotels() {
        // Arrange
        LocalDate dateFrom = LocalDate.of(2025, 02, 10);
        LocalDate dateTo = LocalDate.of(2025, 03, 20);
        String destination = "Puerto Iguazu";
        List<Hotel> allHotels = List.of(hotel1);
        List <HotelDTO> esperado = List.of(hotelDTO1);


        Mockito.when(hotelRepository.findAll()).thenReturn(allHotels);


        Mockito.when(modelMapper.map(any(Hotel.class), eq(HotelDTO.class)))
                .thenAnswer(invocation -> {
                    Hotel hotel = invocation.getArgument(0);
                    return new HotelDTO(hotel.getHotelCode(), hotel.getName(), hotel.getDestination(), hotel.getRoomType(), hotel.getPricePerNight(), hotel.getDateFrom(), hotel.getDateTo(), hotel.getReserved());
                });

        List<HotelDTO> result = hotelService.findAvailableHotels(dateFrom, dateTo, destination);

        // Assert
        Assertions.assertEquals(esperado, result, "No coinciden las listas");
    }


    @Test
    void deleteHotel() {

        //Arrange
        String hotelCode = "CH-0002";

        // Act
        StatusDTO result = hotelService.deleteHotel(hotelCode);

        // Assert
        Assertions.assertEquals(200, result.getCode(), "El código de estado debería ser 200");
        Assertions.assertEquals("El hotel se eliminó exitosamente", result.getMessage(), "El mensaje debería ser 'El hotel se eliminó exitosamente'");

    }

    @Test
    void bookHotel() {

        List<Hotel> allHotel = List.of(hotel1,hotel2);
        // Act

        Mockito.when(hotelRepository.findAll()).thenReturn(allHotel);
        ReservationDto result = hotelService.bookHotel(req);

        // Assert
        Assertions.assertNotNull(result);
        assertEquals("La reserva se realizó satisfactoriamente", result.getStatus().getMessage(),
                "El mensaje de estado debería ser 'La reserva se realizó satisfactoriamente'");

    }
    @Test
    public void testBookHotelNotFound() {
        // Configurar el mock para que el repositorio devuelva una lista vacía
        when(hotelRepository.findAll()).thenReturn(Collections.emptyList());

        // Asegurarse de que se lanza la excepción HotelNotFoundException
        Assertions.assertThrows(HotelNotFoundException.class, () -> {
            hotelService.bookHotel(req);
        });
    }
}