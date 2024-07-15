package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.FlightDTO;
import com.example.AgenciaTurismo.dto.FlightReservationDTO;
import com.example.AgenciaTurismo.dto.PaymentMethodDTO;
import com.example.AgenciaTurismo.dto.PeopleDTO;
import com.example.AgenciaTurismo.dto.request.FinalFlightReservationDTO;
import com.example.AgenciaTurismo.dto.request.FlightConsultDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.dto.response.StatusCodeDTO;
import com.example.AgenciaTurismo.dto.response.TotalFlightReservationDTO;
import com.example.AgenciaTurismo.model.*;
import com.example.AgenciaTurismo.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class FlightReservaService implements IFlightReservaService {
    @Autowired
    IFlightReservaRepository flightReservaRepository;

    @Autowired
    IPeopleRepository peopleRepository;
    @Autowired
    IPaymentMethodRepository paymentMethodRepository;
    @Autowired
    IFlightRepository flightRepository;
    @Autowired
    IFlightService serviceFlight;

    @Autowired
    IClientRepository clientRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public List<FinalFlightReservationDTO> listarReservas() {
        List<ReservarFlight> reservasList = flightReservaRepository.findAll();
        return this.mapearReservas(reservasList);
    }


    @Override
    public ResponseDTO createReserva(FinalFlightReservationDTO finalFlightReservationDTO) {

        Optional<Client> clienteExistente = clientRepository.findByUsername(finalFlightReservationDTO.getUserName());
        if(clienteExistente.isEmpty()) {
            return new ResponseDTO("Debes loguearte para poder crear una reserva!!");
        }

        Client clienteEncontrado = clienteExistente.get();

        if (this.reserveSaved(finalFlightReservationDTO)) {
            throw new IllegalArgumentException("La reserva ya está realizada.");
        }
        if(finalFlightReservationDTO.getFlightReservationDTO().getSeats() !=
                finalFlightReservationDTO.getFlightReservationDTO().getPeopleDTO().size()) {
            throw new IllegalArgumentException("La cantidad de asientos debe coincidir con la cantidad de personas");
        }

        FlightConsultDTO vueloBuscado = new FlightConsultDTO(
                finalFlightReservationDTO.getFlightReservationDTO().getDateFrom(),
                finalFlightReservationDTO.getFlightReservationDTO().getDateTo(),
                finalFlightReservationDTO.getFlightReservationDTO().getOrigin(),
                finalFlightReservationDTO.getFlightReservationDTO().getDestination());

        List<FlightDTO> availableFlights = serviceFlight.validarVuelosDisponibles(vueloBuscado);

        FlightDTO flightToReserved = null;
        for (FlightDTO flight : availableFlights) {
            if (flight.getOrigin().equalsIgnoreCase(finalFlightReservationDTO.getFlightReservationDTO().getOrigin())
                    && flight.getDestination().equalsIgnoreCase(finalFlightReservationDTO.getFlightReservationDTO().getDestination())
                    && flight.getDateFrom().equals(finalFlightReservationDTO.getFlightReservationDTO().getDateFrom())
                    && flight.getDateTo().equals(finalFlightReservationDTO.getFlightReservationDTO().getDateTo())) {
                flightToReserved = flight;
                break;
                }
            }
            if (flightToReserved == null) {
                throw new IllegalArgumentException("No se encontró ningún vuelo que coincida con los criterios de reserva.");
            }

        Double amount = (flightToReserved.getPrice() * finalFlightReservationDTO.getFlightReservationDTO().getSeats());

        Double interest = this.calcInterest(amount, finalFlightReservationDTO.getFlightReservationDTO().getPaymentMethodDTO().getDues(),
                finalFlightReservationDTO.getFlightReservationDTO().getPaymentMethodDTO().getType());

        Double total = amount + interest;

        TotalFlightReservationDTO totalFlightReservationDTO = new TotalFlightReservationDTO();
        totalFlightReservationDTO.setAmount(amount);
        totalFlightReservationDTO.setInterest(interest);
        totalFlightReservationDTO.setTotal(total);
        totalFlightReservationDTO.setFinalFlightReservationDTO(finalFlightReservationDTO);
        totalFlightReservationDTO.setStatusCode(new StatusCodeDTO(201, "El proceso terminó satisfactoriamente"));

        List<PeopleDTO> persDeReserva = finalFlightReservationDTO.getFlightReservationDTO().getPeopleDTO();
        List<People> persAGuardar = new ArrayList<>();
        for (PeopleDTO peoples : persDeReserva) {
            People person = modelMapper.map(peoples, People.class);
            persAGuardar.add(person);
            peopleRepository.save(person);
        }//guardo la lista de personas

        PaymentMethodDTO metodoPago = finalFlightReservationDTO.getFlightReservationDTO().getPaymentMethodDTO();
        PaymentMethod metodoPagoAGuardar = modelMapper.map(metodoPago, PaymentMethod.class);
        paymentMethodRepository.save(metodoPagoAGuardar); //guardo el metodo de pago

        Random random = new Random();

        int[] diasPosibles = {10, 15, 20};
        int randomDay  = diasPosibles[random.nextInt(diasPosibles.length)];

        int randomMonth = random.nextInt(12 - 7 + 1) + 7;

        int year = 2024;

        LocalDate fechaCreacion = LocalDate.of(year, randomMonth, randomDay);


        Flight flightExistente = flightRepository.findByFlightCode(flightToReserved.getFlightCode());
        if (flightExistente == null){
            throw new IllegalArgumentException("No se encontró el vuelo a reservar.");

        }
        flightExistente.setReserved(true);

        ReservarFlight reservaFlightCreada = new ReservarFlight();
        reservaFlightCreada.setSeats(finalFlightReservationDTO.getFlightReservationDTO().getSeats());
        reservaFlightCreada.setPeople(persAGuardar);
        reservaFlightCreada.setPaymentMethod(metodoPagoAGuardar);
        reservaFlightCreada.setCliente(clienteEncontrado);
        reservaFlightCreada.setFlight(flightExistente);
        reservaFlightCreada.setTotalAmount(total);
        reservaFlightCreada.setCreationDate(fechaCreacion);
        flightReservaRepository.save(reservaFlightCreada);

        clienteEncontrado.setBookingQuantity(clienteEncontrado.getBookingQuantity()+1);

        for (People peoples : persAGuardar) {
            peoples.setReservationFlight(reservaFlightCreada);
             peopleRepository.save(peoples);
        }
        return new ResponseDTO("Reserva de vuelo dada de alta correctamente");
    }

    @Override
    public ResponseDTO updateReserva(Long id, FinalFlightReservationDTO finalFlightReservationDTO){
        Optional<ReservarFlight> optionalReservaFlight = flightReservaRepository.findById(id);

        if (optionalReservaFlight.isEmpty()) {
            throw new IllegalArgumentException("No se encontró la reserva a actualizar");
        }

        ReservarFlight reservaExistente = optionalReservaFlight.get();

        // Actualizar campos simples directamente
        reservaExistente.setSeats(finalFlightReservationDTO.getFlightReservationDTO().getSeats());

        // Actualizar método de pago (paymentMethod)
        PaymentMethodDTO metodoPagoDTO = finalFlightReservationDTO.getFlightReservationDTO().getPaymentMethodDTO();
        if (metodoPagoDTO != null) {
            // Obtener el método de pago existente de la reserva
            PaymentMethod metodoPagoExistente = reservaExistente.getPaymentMethod();

            // Verificar si hay un método de pago existente
            if (metodoPagoExistente != null) {
                // Actualizar los campos del método de pago existente con los del DTO
                modelMapper.map(metodoPagoDTO, metodoPagoExistente);
            } else {
                // Si no hay método de pago existente, mapear uno nuevo
                PaymentMethod metodoPago = modelMapper.map(metodoPagoDTO, PaymentMethod.class);
                reservaExistente.setPaymentMethod(metodoPago);
            }
        }
        // Guardar la reserva actualizada
        flightReservaRepository.save(reservaExistente);

        return new ResponseDTO("Reserva actualizada correctamente");
    }

    @Override
    public ResponseDTO deleteReserva(Long id) {
        Optional<ReservarFlight> reservaABuscar = flightReservaRepository.findById(id);
        if (reservaABuscar.isEmpty()) {
            return new ResponseDTO("No se encontró la reserva a eliminar");
        }
        ReservarFlight reservaAEliminar = reservaABuscar.get();
        Flight flightReservado = reservaAEliminar.getFlight();
        flightReservaRepository.deleteById(id);

        flightReservado.setReserved(false);
        flightRepository.save(flightReservado);
        return new ResponseDTO("Reserva eliminada con éxito");
    }

    @Override
    public Boolean reserveSaved(FinalFlightReservationDTO finalFlightReservationDTO) {
        String flightCode = finalFlightReservationDTO.getFlightReservationDTO().getFlightCode();
        Flight flightEncontrado = flightRepository.findByFlightCode(flightCode);

        if (flightEncontrado.getReserved() == true) {
            throw new IllegalArgumentException("Este vuelo se encuentra reservado");
        }

        return false;
    }

    //METODOS PARA REUTILIZAR
    @Override
    public Double calcInterest(Double amount, Integer dues, String type) {
        if (type.equalsIgnoreCase("Debit") || type.equalsIgnoreCase("Credit")) {
            if (type.equalsIgnoreCase("Debit") && dues > 1) {
                throw new IllegalArgumentException("No puede pagar en cuotas con tarjeta de débito.");
            } else
                switch (dues) {
                    case 1:
                        return 0.0;
                    case 2, 3:
                        return amount * 0.05;
                    case 4, 5, 6:
                        return amount * 0.10;
                    case 7, 8, 9, 10, 11, 12:
                        return amount * 0.20;
                    default:
                        throw new IllegalArgumentException("Número de cuotas no válido.");
                }
        } else {
            throw new IllegalArgumentException("Tipo de pago no válido.");
        }
    }

    @Override
    public List<ReservarFlight> listarReservasDia(LocalDate dia) {
        List<ReservarFlight> reservasListDia = flightReservaRepository.findByDia(dia);
        return reservasListDia;
    }

    @Override
    public List<ReservarFlight> listarReservasMes(Integer mes) {
        List<ReservarFlight> reservasListMes = flightReservaRepository.findByMes(mes);

        return reservasListMes;

    }

    public List<FinalFlightReservationDTO> mapearReservas(List<ReservarFlight> listReservas) {
        List<FinalFlightReservationDTO> listAMotrar = new ArrayList<>();

        for (ReservarFlight reserva : listReservas) { //Iteramos la lista de Reservas de la BBDD

            FinalFlightReservationDTO reservaFinal = new FinalFlightReservationDTO();

            Client clienteDTO = reserva.getCliente();
            if (clienteDTO != null) {
                reservaFinal.setUserName(clienteDTO.getUsername());
            } //Recuperamos el userName del cliente que realizo la reserva (obtenemos el primer campo del FinalFlightReservationDTO)

            FlightReservationDTO reservaGeneral = new FlightReservationDTO();
            //Inicializamos el segundo campo de FinalFlightReservationDTO (FlighReservatioDTO) y mapeamos todos los campos simples de FlighReservationDTO
            reservaGeneral.setFlightCode(reserva.getFlight().getFlightCode());
            reservaGeneral.setDateFrom(reserva.getFlight().getDateFrom());
            reservaGeneral.setDateTo(reserva.getFlight().getDateTo());
            reservaGeneral.setOrigin(reserva.getFlight().getOrigin());
            reservaGeneral.setDestination(reserva.getFlight().getDestination());
            reservaGeneral.setSeatType(reserva.getFlight().getSeatType());

            PaymentMethod paymentMethodDeReserva = reserva.getPaymentMethod();
            PaymentMethodDTO pagoDTO = modelMapper.map(paymentMethodDeReserva, PaymentMethodDTO.class);
            //Mapeamos el Objeto PaymentMethod ==> PaymentMethodDTO
            reservaGeneral.setPaymentMethodDTO(pagoDTO); //le asignamos el campo a FlightReservationDTO

            List<People> peopleDeReserva = reserva.getPeople();
            List<PeopleDTO> peoplesDTO = new ArrayList<>();
            for (People peoples : peopleDeReserva) {
                PeopleDTO person = modelMapper.map(peoples, PeopleDTO.class);
                peoplesDTO.add(person);
            } //Mapeamos la lista de Peoples ==> peopleDTO
            reservaGeneral.setPeopleDTO(peoplesDTO); // Le asignamos la lista de peolesDTO al FlightReservationDTO

            reservaFinal.setFlightReservationDTO(reservaGeneral); //seteamos el Flight ReservationDTO DEL FinalFlightReservationDTO con el FlightReservatioDTO creado
            listAMotrar.add(reservaFinal);
        } //guardo la lista de personas

        return listAMotrar;
    }

}
