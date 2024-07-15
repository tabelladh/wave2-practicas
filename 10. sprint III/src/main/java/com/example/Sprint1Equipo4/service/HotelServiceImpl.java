package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.request.BoockingDto;
import com.example.Sprint1Equipo4.dto.request.PaymentMethodsDto;
import com.example.Sprint1Equipo4.dto.request.ReservationDtoRequest;
import com.example.Sprint1Equipo4.dto.response.HotelDTO;
import com.example.Sprint1Equipo4.dto.response.ReservationDto;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.exception.*;
import com.example.Sprint1Equipo4.model.Client;
import com.example.Sprint1Equipo4.model.Hotel;
import com.example.Sprint1Equipo4.model.HotelBooking;
import com.example.Sprint1Equipo4.model.PaymentMethod;
import com.example.Sprint1Equipo4.repository.ClientRepository;
import com.example.Sprint1Equipo4.repository.HotelBookingRepository;
import com.example.Sprint1Equipo4.repository.HotelRepository;
import com.example.Sprint1Equipo4.repository.PaymentMethodRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl implements HotelService {

   @Autowired
   private final HotelRepository hotelRepository;

   @Autowired
   private final PaymentMethodRepository paymentMethodRepository;

   @Autowired
   private final HotelBookingRepository hotelBookingRepository;

   @Autowired
   private final ClientRepository clientRepository;

   @Autowired
   private final ModelMapper modelMapper;

   public HotelServiceImpl(HotelRepository hotelRepository, PaymentMethodRepository paymentMethodRepository, HotelBookingRepository hotelBookingRepository, ClientRepository clientRepository, ModelMapper modelMapper) {
      this.paymentMethodRepository = paymentMethodRepository;
      this.hotelBookingRepository = hotelBookingRepository;
      this.clientRepository = clientRepository;
      this.modelMapper = modelMapper;
      this.hotelRepository = hotelRepository;
   }

   @Override
   public List<HotelDTO> listHotels() {
      List<Hotel> listHotel = hotelRepository.findAll();
      return listHotel.stream()
            .map(hotel -> modelMapper.map(hotel, HotelDTO.class))
            .collect(Collectors.toList());
   }

   @Override
   public HotelDTO searchByCode(String hotelCode) {
      Optional<Hotel> hotel = hotelRepository.findByHotelCode(hotelCode);
      if (!hotelRepository.existsByHotelCode(hotelCode)) {
         throw new HotelNotFoundException();
      } else {
         return modelMapper.map(hotel, HotelDTO.class);
      }
   }

   @Override
   public Boolean existsHotel(String hotelCode) {
      return hotelRepository.existsByHotelCode(hotelCode);
   }

   @Override
   public HotelDTO saveHotel(HotelDTO hotelDTO) {
      Hotel hotel = new Hotel();
      modelMapper.map(hotelDTO,hotel);
      hotelRepository.save(hotel);
      return hotelDTO;
   }

   @Override
   public HotelDTO updateHotel(HotelDTO hotelDTO) {
      Hotel guardado = hotelRepository.findByHotelCode(hotelDTO.getHotelCode()).orElse(null);
      Hotel hotel = modelMapper.map(hotelDTO,Hotel.class);
       hotel.setId(guardado.getId());
      hotelRepository.save(hotel);
      return modelMapper.map(hotel,HotelDTO.class);
   }

   @Override
   public List<HotelDTO> findAvailableHotels(LocalDate dateFrom, LocalDate dateTo, String destination) {
      List<Hotel> allHotels = hotelRepository.findAll();
      List<Hotel> availableHotels = allHotels.stream()
            .filter(hotel -> !hotel.getReserved())
            .filter(hotel -> (hotel.getDateFrom().isAfter(dateFrom) || hotel.getDateTo().isBefore(dateTo))
                    || (hotel.getDateFrom().equals(dateFrom) && hotel.getDateTo().equals(dateTo)))
            .filter(hotel -> hotel.getDestination().equals(destination))
            .toList();

      List<HotelDTO> availableHotelsDTO = new ArrayList<>();
      for (Hotel hotel : availableHotels) {
         availableHotelsDTO.add(modelMapper.map(hotel, HotelDTO.class));
      }
      return availableHotelsDTO;
   }

   @Override
   public StatusDTO deleteHotel(String hotelCode) {
      Hotel hotel = hotelRepository.findByHotelCode(hotelCode).orElse(null);
      Long id = hotel.getId();
      hotelRepository.deleteById(id);
      return new StatusDTO(200, "El hotel se eliminó exitosamente");
   }

   public void validateDateRange(LocalDate dateFrom, LocalDate dateTo, String destination) {
      if (dateFrom.isAfter(dateTo)) {
         throw new DateOutOfRangeException();
      }

      List<Hotel> hotels = hotelRepository.findAll();
      boolean isInRange = hotels.stream()
            .filter(hotel -> hotel.getDestination().equals(destination))
            .anyMatch(hotel ->
                  (dateFrom.isAfter(hotel.getDateFrom()) || dateFrom.equals(hotel.getDateFrom())) &&
                        (dateTo.isBefore(hotel.getDateTo()) || dateTo.equals(hotel.getDateTo()))
            );

      if (!isInRange) {
         throw new DateOutOfRangeException();
      }
   }

   //PARA CREAR UNA RESERVA EN HOTEL
   private Hotel selectHotel(List<Hotel> availableHotels, BoockingDto bookingDto) {
      Hotel hotelEncontrado = null;
      for (Hotel hotel : availableHotels) {
         if (hotel.getDestination().equalsIgnoreCase(bookingDto.getDestination()) &&
               isDateRangeAvailable(hotel, bookingDto.getDateFrom(), bookingDto.getDateTo())) {
            hotelEncontrado = hotel;
         }
      }
      return hotelEncontrado;
   }

   private boolean isDateRangeAvailable(Hotel hotel, LocalDate dateFrom, LocalDate dateTo) {
      return !hotel.getReserved() && hotel.getDateFrom().equals(dateFrom) && hotel.getDateTo().equals(dateTo);
   }

   @Override
   public StatusDTO bookHotel(ReservationDtoRequest reservationDtoRequest) {
      BoockingDto bookingDto = reservationDtoRequest.getBooking();
      numOfPeople(bookingDto);

      // Verificar si ya existe una reserva para las fechas y destino especificados
      if (hotelBookingRepository.existsByDateFromAndDateToAndDestinationAndHotelCode(
            bookingDto.getDateFrom(),
            bookingDto.getDateTo(),
            bookingDto.getDestination(),
            bookingDto.getHotelCode())) {
         throw new DuplicateBookingException();
      }

      // Obtener todos los hoteles disponibles y seleccionar uno
      List<Hotel> allHotels = hotelRepository.findAll();
      List<Hotel> availableHotels = allHotels.stream()
            .filter(hotel -> !hotel.getReserved())
            .collect(Collectors.toList());

      Hotel selectedHotel = selectHotel(availableHotels, reservationDtoRequest.getBooking());

      if (selectedHotel == null) {
         throw new HotelNotFoundException();
      }

      // Calcular el precio total y el interés
      double totalPrice = calculateTotalPrice(selectedHotel, reservationDtoRequest.getBooking().getDateFrom(), reservationDtoRequest.getBooking().getDateTo());
      double interest = calculateInterest(totalPrice, reservationDtoRequest.getBooking().getPayment().getDues(), reservationDtoRequest.getBooking().getPayment().getType());
      double total = totalPrice + interest;

      // Crear y configurar el DTO de reserva
      ReservationDto reservationDto = new ReservationDto();
      String userName = reservationDtoRequest.getUserName();
      reservationDto.setUserName(userName);
      reservationDto.setAmount(String.valueOf(totalPrice));
      reservationDto.setInterest(String.valueOf(interest));
      reservationDto.setTotal(String.valueOf(total));
      reservationDto.setBooking(reservationDtoRequest.getBooking());
      reservationDto.setStatus(new StatusDTO(201, "La reserva se realizó satisfactoriamente"));

      // Actualizar el contador de reservas del cliente
      Client client = updateClient(userName);

      // Crear y configurar la reserva de hotel
      HotelBooking hotelBooking = new HotelBooking();
      hotelBooking.setUserName(reservationDtoRequest.getUserName());
      hotelBooking.setHotelCode(bookingDto.getHotelCode());
      hotelBooking.setDateTo(bookingDto.getDateTo());
      hotelBooking.setDateFrom(bookingDto.getDateFrom());
      hotelBooking.setDestination(bookingDto.getDestination());
      hotelBooking.setHotelCode(bookingDto.getHotelCode());
      hotelBooking.setPeopleAmount(bookingDto.getPeopleAmount());
      hotelBooking.setRoomType(bookingDto.getRoomType());
      hotelBooking.setReservedDate(LocalDate.now());
      hotelBooking.setPeopleAmount(bookingDto.getPeopleAmount());
      hotelBooking.setTotalPrice(Double.valueOf(reservationDto.getTotal()));
      hotelBooking.setClient(client);

      // Mapear el DTO a la entidad PaymentMethod
      PaymentMethodsDto paymentDto = bookingDto.getPayment();
      PaymentMethod paymentMethod = new PaymentMethod();
      paymentMethod.setType(paymentDto.getType());
      paymentMethod.setNumber(paymentDto.getNumberCard());
      paymentMethod.setDues(paymentDto.getDues());

      PaymentMethod existingPaymentMethod = paymentMethodRepository.findByTypeAndNumber(paymentMethod.getType(), paymentMethod.getNumber());
      if (existingPaymentMethod == null) {
         paymentMethodRepository.save(paymentMethod);
      } else {
         paymentMethod = existingPaymentMethod;
      }

      hotelBooking.setPaymentMethod(paymentMethod);

      // Marcar el hotel como reservado y guardar la reserva
      selectedHotel.setReserved(true);
      hotelRepository.save(selectedHotel);

      hotelBookingRepository.save(hotelBooking);

      return new StatusDTO(200, "Reserva de hotel dada de alta correctamente");
   }

   private Client updateClient(String userName) {
      // Buscar o crear y actualizar el cliente
      Client client = clientRepository.findByUserName(userName);
      if (client == null) {
         client = new Client();
         client.setUserName(userName);
         client.setBookingQuantity(1);
      } else {
         client.setBookingQuantity(client.getBookingQuantity() + 1);
      }
      clientRepository.save(client);

      return client;
   }

   private double calculateTotalPrice(Hotel hotel, LocalDate dateFrom, LocalDate dateTo) {
      long nights = dateFrom.until(dateTo).getDays();
      return hotel.getPricePerNight() * nights;
   }

   private double calculateInterest(double totalPrice, int dues, String type) {
      switch (type) {
         case "DEBIT":
            if (dues == 1) {
               return totalPrice;
            } else if(dues > 1){
               throw new InvalidDuesForDebit();
            }
         case "CREDIT":
            return calculateCreditInterest(totalPrice, dues);
         default:
            throw new IllegalArgumentException("Invalid payment type");
      }
   }

   private double calculateCreditInterest(double totalPrice, int dues) {
      if (dues >= 1 && dues <= 3) {
         return totalPrice * 1.05;
      } else if (dues > 3 && dues <= 6) {
         return totalPrice * 1.1;
      } else if (dues > 6 && dues <= 12) {
         return totalPrice * 1.15;
      } else {
         throw new InvalidDuesForCredit();
      }
   }

   @Override
   public Optional<?> numOfPeople(BoockingDto bookingDto) {
      // Validate people size and room type combination
      if (bookingDto.getPeopleAmount() == 1 && bookingDto.getRoomType().equals("SINGLE")) {
         return Optional.of(bookingDto.getPeople().size());
      } else if (bookingDto.getPeopleAmount() == 2 && bookingDto.getRoomType().equals("DOUBLE")) {
         return Optional.of(bookingDto.getPeople().size());
      } else if (bookingDto.getPeopleAmount() == 3 && bookingDto.getRoomType().equals("TRIPLE")) {
         return Optional.of(bookingDto.getPeopleAmount());
      } else {
         // Throw a more specific exception indicating the mismatch
         throw new InvalidBoockingException();
      }
   }
}

