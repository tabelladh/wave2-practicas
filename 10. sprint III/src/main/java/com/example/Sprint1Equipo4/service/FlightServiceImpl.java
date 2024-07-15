package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.request.FlightReqDto;
import com.example.Sprint1Equipo4.dto.request.FlightReservationDto;
import com.example.Sprint1Equipo4.dto.request.PaymentMethodsDto;
import com.example.Sprint1Equipo4.dto.response.FlightDTO;
import com.example.Sprint1Equipo4.dto.response.FlightResDto;
import com.example.Sprint1Equipo4.dto.response.ResponseFlightDTO;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.exception.*;
import com.example.Sprint1Equipo4.model.Client;
import com.example.Sprint1Equipo4.model.Flight;
import com.example.Sprint1Equipo4.model.FlightReservation;
import com.example.Sprint1Equipo4.model.PaymentMethod;
import com.example.Sprint1Equipo4.repository.ClientRepository;
import com.example.Sprint1Equipo4.repository.FlightRepository;
import com.example.Sprint1Equipo4.repository.FlightReservationRepository;
import com.example.Sprint1Equipo4.repository.PaymentMethodRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightServiceImpl implements FlightService {

   @Autowired
   private final FlightRepository flightRepository;

   @Autowired
   private FlightReservationRepository flightReservationRepository;

   @Autowired
   private PaymentMethodRepository paymentMethodRepository;

   @Autowired
   private final ClientRepository clientRepository;

   @Autowired
   private final ModelMapper modelMapper;


   public FlightServiceImpl(ModelMapper modelMapper, FlightRepository flightRepository, ClientRepository clientRepository, PaymentMethodRepository paymentMethodRepository, FlightReservationRepository flightReservationRepository) {
      this.modelMapper = modelMapper;
      this.flightRepository = flightRepository;
      this.clientRepository = clientRepository;
      this.flightReservationRepository = flightReservationRepository;
      this.paymentMethodRepository = paymentMethodRepository;
   }

   @Override
   public List<FlightDTO> listFlights() {
      List<Flight> listFlight = flightRepository.findAll();
      return listFlight.stream()
            .map(flight -> modelMapper.map(flight, FlightDTO.class))
            .collect(Collectors.toList());
   }

   @Override
   public List<FlightDTO> flightsAvailable(LocalDate dateFrom, LocalDate dateTo, String origin, String destination) {
      List<Flight> listFlight = flightRepository.findAll();
      List<Flight> availableFlights = listFlight.stream()
            .filter(flight -> flight.getDestination().equals(destination))
            .filter(flight -> flight.getOrigin().equals(origin))
            .filter(flight -> !flight.getDateFrom().isAfter(dateTo))
            .filter(flight -> !flight.getDateTo().isBefore(dateFrom))
            .collect(Collectors.toList());

      return availableFlights.stream()
            .map(flight -> modelMapper.map(flight, FlightDTO.class))
            .collect(Collectors.toList());
   }

   public DateOutOfRangeException validateDateRangeFlight(LocalDate dateFrom, LocalDate dateTo, String destination) {
      if (dateFrom.isAfter(dateTo)) {
         throw new DateOutOfRangeException();
      }

      List<Flight> flights = flightRepository.findAll();
      boolean isInRange = flights.stream()
            .filter(flight -> flight.getDestination().equals(destination))
            .anyMatch(flight ->
                  (dateFrom.isAfter(flight.getDateFrom()) || dateFrom.equals(flight.getDateFrom())) &&
                        (dateTo.isBefore(flight.getDateTo()) || dateTo.equals(flight.getDateTo()))
            );

      if (!isInRange) {
         throw new DateOutOfRangeException();
      }

      return null;
   }

   public Flight getFlight(List<Flight> flights, FlightReservationDto fr) {
      return flights.stream()
            .filter(flight -> flight.getOrigin().equalsIgnoreCase(fr.getOrigin()) &&
                  flight.getDestination().equalsIgnoreCase(fr.getDestination()) &&
                  flight.getDateFrom().equals(fr.getDateFrom()) &&
                  flight.getDateTo().equals((fr.getDateTo())))
            .findFirst()
            .orElseThrow(FlightNotFoundException::new);
   }

   private Integer getTotalPrice(Flight flight, FlightReservationDto fr) {
      int price = flight.getPricePerPerson();
      return fr.getPeople().isEmpty() ? 0 : price * fr.getPeople().size();
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
   public StatusDTO reserve(FlightReqDto fDto) {
      List<Flight> flightList = flightRepository.findAll();

      Flight flight = getFlight(flightList, fDto.getFlightReservationDto());

      FlightReservationDto flightReservationDto = fDto.getFlightReservationDto();

      boolean exists = flightReservationRepository.existsByDateFromAndDateToAndOriginAndDestination(
              flightReservationDto.getDateFrom(),
              flightReservationDto.getDateTo(),
              flightReservationDto.getOrigin(),
              flightReservationDto.getDestination()
      );
      if (exists) {
         throw new DuplicateBookingException();
      }

      int amount = getTotalPrice(flight, fDto.getFlightReservationDto());
      double interest = calculateInterest(amount, fDto.getFlightReservationDto()
            .getPaymentMethodsDto().getDues(), fDto.getFlightReservationDto().getPaymentMethodsDto().getType());
      double total = amount + interest;

      System.out.println(total);

      FlightResDto resDto = new FlightResDto();
      resDto.setUserName(fDto.getFlightReservationDto().getPeople().getFirst().getEmail());
      resDto.setAmount(amount);
      resDto.setInterest(interest);
      resDto.setTotal(total);
      resDto.setFlightReservationDto(fDto.getFlightReservationDto());
      resDto.setStatusDTO(new StatusDTO(201, "El proceso termino satisfactoriamente"));

      // Actualizar el contador de reservas del cliente
      String userName = fDto.getUserName();
      Client client = updateClient(userName);

      // Crear y configurar la reserva de vuelo
      FlightReservation flightReservation = new FlightReservation();
      flightReservation.setUserName(fDto.getUserName());
      flightReservation.setDateFrom(flightReservationDto.getDateFrom());
      flightReservation.setDateTo(flightReservationDto.getDateTo());
      flightReservation.setOrigin(flightReservationDto.getOrigin());
      flightReservation.setDestination(flightReservationDto.getDestination());
      flightReservation.setFlightCode(flightReservationDto.getFlightCode());
      flightReservation.setSeatType(flightReservationDto.getSeatType());
      flightReservation.setSeats(flightReservationDto.getSeats());
      flightReservation.setReservedDate(LocalDate.now());
      flightReservation.setTotalPrice(resDto.getTotal());
      flightReservation.setClient(client);

      PaymentMethodsDto paymentDto = flightReservationDto.getPaymentMethodsDto();
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

      flightReservation.setPaymentMethod(paymentMethod);

      flightReservation.setUserName(fDto.getUserName());

      flightReservationRepository.save(flightReservation);

      return new StatusDTO(200, "Reserva de vuelo dada de alta correctamente");
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

   @Override
   public FlightDTO findByFlightName(String name) {
      Flight flight = flightRepository.findByFlightCode(name);
      return modelMapper.map(flight, FlightDTO.class);
   }

   @Override
   public ResponseFlightDTO deleteFlight(String flightCode) {
      Flight flight = flightRepository.findByFlightCode(flightCode);
      flightRepository.delete(flight);
      return new ResponseFlightDTO("El vuelo fue borrado correctamente");
   }

   @Override
   public FlightDTO create(FlightDTO flight) {
      Flight newFlight = new Flight();
      modelMapper.map(flight,newFlight);
      flightRepository.save(newFlight);
      return flight;
   }

   @Override
   public FlightDTO upDate(FlightDTO flightDTO) {
      Flight guardado = flightRepository.findByFlightCode(flightDTO.getFlightCode());

      Flight flightUpdate = modelMapper.map(flightDTO,Flight.class);
      flightUpdate.setId(guardado.getId());

      flightRepository.save(flightUpdate);
      return modelMapper.map(flightUpdate,FlightDTO.class);
   }
}
