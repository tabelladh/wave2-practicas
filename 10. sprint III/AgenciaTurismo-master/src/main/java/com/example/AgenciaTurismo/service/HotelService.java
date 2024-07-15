package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.HotelDTO;
import com.example.AgenciaTurismo.dto.request.HotelConsultDTO;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.exception.InvalidReservationException;
import com.example.AgenciaTurismo.model.Hotel;
import com.example.AgenciaTurismo.repository.IHotelRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HotelService implements IHotelService {

    @Autowired
    IHotelRepository hotelRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<HotelDTO> listarHotels() {
        return hotelRepository.findAll().stream()
                .map(hotel -> modelMapper.map(hotel, HotelDTO.class))
                .collect(Collectors.toList());
    }


    @Override
    public HotelAvailableDTO hotelesDisponibles(HotelConsultDTO hotelConsultDTO) {
        // Verificar si hay hoteles disponibles para las fechas y el destino
        List<HotelDTO> availableHotel = this.validarHotelesDisponibles(hotelConsultDTO);

        // Crear y configurar el objeto HotelAvailableDTO
        HotelAvailableDTO hotelAvailable = new HotelAvailableDTO();
        hotelAvailable.setAvailableHotelDTO(availableHotel);

        return hotelAvailable;
    }


    @Override
    public ResponseDTO createHotel(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel();
        modelMapper.map(hotelDTO, hotel);
        hotelRepository.save(hotel);

        return new ResponseDTO("Hotel creado con éxito");
    }

    @Override
    public ResponseDTO updateHotel(Long id, HotelDTO hotelDTO) {
        Optional<Hotel> optionalHotel = hotelRepository.findById(id);//Guardamos el HOTEL obtenido (con un OPTIONAL porque puede llegar a ser null)
        if(optionalHotel.isEmpty()){
            return new ResponseDTO("No se encontro el hotel a actualizar");
        }
        Hotel hotelExistente = optionalHotel.get();

        modelMapper.getConfiguration().setSkipNullEnabled(true); //Si algun campo de HOTEL llega null o vacio (MANTENER EL ACTUAL)
        modelMapper.map(hotelDTO, hotelExistente);
        hotelRepository.save(hotelExistente);
        return new ResponseDTO("Hotel actualizado con éxito");


    }
    @Override
    public ResponseDTO deleteHotel(Long id) {
        if(!hotelRepository.existsById(id)){
            return new ResponseDTO("No se encontro el hotel a eliminar");
        }
        hotelRepository.deleteById(id);
        return new ResponseDTO("Hotel eliminado con éxito");
    }

    //METODOS PARA REUTILIZAR
    // Validando Hoteles disponible
    @Override
    public List<HotelDTO> validarHotelesDisponibles(HotelConsultDTO hotelConsultDTO) {
        // llamamo al metodo que verifica la existencia del destino
        this.destinationValid(hotelConsultDTO.getDestination());

        // llamamos al metodo que verifica las fechas
        this.dateValid(hotelConsultDTO.getDateFrom(), hotelConsultDTO.getDateTo());

        List<HotelDTO> listHotelDTO = this.listarHotels();

        List<HotelDTO> availableHotel = new ArrayList<>();
        for (HotelDTO hotel : listHotelDTO) {
            if (hotel.getDateFrom().equals(hotelConsultDTO.getDateFrom())
                    && hotel.getDateTo().equals(hotelConsultDTO.getDateTo())
                    && hotel.getDestination().equalsIgnoreCase(hotelConsultDTO.getDestination())
                    && hotel.getHotelCode().equalsIgnoreCase(hotelConsultDTO.getHotelCode())) {
                availableHotel.add(hotel);
            }
        }

        if (availableHotel.isEmpty()) {
            throw new InvalidReservationException("No hay hoteles disponibles para las fechas y la ruta especificadas.");
        }

        return availableHotel;
    }

    //Validando fechas
    @Override
    public Boolean dateValid(LocalDate dateFrom, LocalDate dateTo) {
        if (!dateFrom.isBefore(dateTo)) {
            throw new IllegalArgumentException("La fecha de entrada debe ser menor a la de salida");
        } else
            return true;
    }

    //Validando existencia del destino solicitado.
    public Boolean destinationValid(String destination) {
        List<String> validDestination = listarHotels().stream()
                .map(HotelDTO::getDestination)
                .toList();
        if (validDestination.contains(destination)) {
            return true;
        }
        throw new IllegalArgumentException("El destino elegido no existe");
    }
}
