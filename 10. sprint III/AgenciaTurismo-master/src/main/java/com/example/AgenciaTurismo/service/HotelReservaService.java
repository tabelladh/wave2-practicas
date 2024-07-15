package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.*;
import com.example.AgenciaTurismo.dto.request.FinalHotelReservationDTO;
import com.example.AgenciaTurismo.dto.request.HotelConsultDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.dto.response.StatusCodeDTO;
import com.example.AgenciaTurismo.dto.response.TotalHotelReservationDTO;
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
public class HotelReservaService implements IHotelReservaService {
    @Autowired
    IHotelReservaRepository hotelReservaRepository;
    @Autowired
    IPeopleRepository peopleRepository;
    @Autowired
    IPaymentMethodRepository paymentMethodRepository;
    @Autowired
    IHotelRepository hotelRepository;
    @Autowired
    IHotelService serviceHotel;
    @Autowired
    ITouristicPackageRepository touristicPackageRepository;
    @Autowired
    IClientRepository clientRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public List<FinalHotelReservationDTO> listarReservas() {
        List<ReservarHotel> reservasList = hotelReservaRepository.findAll();
        return mapearReservas(reservasList);

    }

    @Override
    public ResponseDTO createReserva(FinalHotelReservationDTO finalHotelReservationDTO) {

        Optional<Client> clienteExistente = clientRepository.findByUsername(finalHotelReservationDTO.getUserName());
        if(clienteExistente.isEmpty()) {
            return new ResponseDTO("Debes loguearte para poder crear una reserva!!");
        }
        Client clienteEncontrado = clienteExistente.get();

        if (this.reserveSaved(finalHotelReservationDTO)) {
            throw new IllegalArgumentException("La reserva ya está realizada.");
        }

        this.roomCapacity(finalHotelReservationDTO.getHotelReservationDTO());


        HotelConsultDTO hotelBuscado = new HotelConsultDTO(
                finalHotelReservationDTO.getHotelReservationDTO().getDateFrom(),
                finalHotelReservationDTO.getHotelReservationDTO().getDateTo(),
                finalHotelReservationDTO.getHotelReservationDTO().getDestination(),
                finalHotelReservationDTO.getHotelReservationDTO().getHotelCode());

        List<HotelDTO> availableHotel = serviceHotel.validarHotelesDisponibles(hotelBuscado);


        HotelDTO hotelToReserved = null;
        for (HotelDTO hotel : availableHotel) {
            if (hotel.getDestination().equalsIgnoreCase(finalHotelReservationDTO.getHotelReservationDTO().getDestination())
                    && hotel.getDateFrom().equals(finalHotelReservationDTO.getHotelReservationDTO().getDateFrom())
                    && hotel.getDateTo().equals(finalHotelReservationDTO.getHotelReservationDTO().getDateTo())) {
                hotelToReserved = hotel;
                break;
            }
        }
        if (hotelToReserved == null) {
            throw new IllegalArgumentException("No se encontró ningún hotel que coincida con los criterios de reserva.");
        }

        Double amount = (hotelToReserved.getPriceForNight() * finalHotelReservationDTO.getHotelReservationDTO().getPeopleAmount());

        Double interest = this.calcInterest(amount, finalHotelReservationDTO.getHotelReservationDTO().getPaymentMethodDTO().getDues(),
                finalHotelReservationDTO.getHotelReservationDTO().getPaymentMethodDTO().getType());

        Double total = amount + interest;


        TotalHotelReservationDTO totalHotelReservationDTO = new TotalHotelReservationDTO();
        totalHotelReservationDTO.setAmount(amount);
        totalHotelReservationDTO.setInterest(interest);
        totalHotelReservationDTO.setTotal(total);
        totalHotelReservationDTO.setFinalHotelReservation(finalHotelReservationDTO);
        totalHotelReservationDTO.setStatusCode(new StatusCodeDTO(201, "El proceso terminó satisfactoriamente"));



        List<PeopleDTO> persDeReserva = finalHotelReservationDTO.getHotelReservationDTO().getPeopleDTO();
        List<People> persAGuardar = new ArrayList<>();
        for (PeopleDTO peoples : persDeReserva) {
            People person = modelMapper.map(peoples, People.class);
            persAGuardar.add(person);
            peopleRepository.save(person);
        } //guardo la lista de personas


        PaymentMethodDTO metodoPago = finalHotelReservationDTO.getHotelReservationDTO().getPaymentMethodDTO();
        PaymentMethod metodoPagoAGuardar = modelMapper.map(metodoPago, PaymentMethod.class);
        paymentMethodRepository.save(metodoPagoAGuardar);//guardo el metodo de pago

        Random random = new Random();

        int[] diasPosibles = {10, 15, 20};
        int randomDay  = diasPosibles[random.nextInt(diasPosibles.length)];

        int randomMonth = random.nextInt(12 - 7 + 1) + 7;

        int year = 2024;

        LocalDate fechaCreacion = LocalDate.of(year, randomMonth, randomDay);


        Hotel hotelExistente = hotelRepository.findByHotelCode(hotelToReserved.getHotelCode());
        if (hotelExistente == null) {
            throw new IllegalArgumentException("No se encontró el hotel a reservar.");
        }
        hotelExistente.setReserved(true);

        ReservarHotel reservaHotelCreada = new ReservarHotel();
        reservaHotelCreada.setPeopleAmount(finalHotelReservationDTO.getHotelReservationDTO().getPeopleAmount());
        reservaHotelCreada.setPeople(persAGuardar);
        reservaHotelCreada.setPaymentMethod(metodoPagoAGuardar);
        reservaHotelCreada.setHotel(hotelExistente);
        reservaHotelCreada.setCliente(clienteEncontrado);
        reservaHotelCreada.setTotalAmount(total);
        reservaHotelCreada.setCreationDate(fechaCreacion);
        hotelReservaRepository.save(reservaHotelCreada);

        clienteEncontrado.setBookingQuantity(clienteEncontrado.getBookingQuantity()+1);

        for (People person : persAGuardar) {
            person.setReservationHotel(reservaHotelCreada);
            peopleRepository.save(person);
        }

        return new ResponseDTO("Reserva de hotel dada de alta correctamente");
    }

    @Override
    public ResponseDTO updateReserva(Long id, FinalHotelReservationDTO finalHotelReservationDTO) {
        Optional<ReservarHotel> optionalReservaHotel = hotelReservaRepository.findById(id);

        if (optionalReservaHotel.isEmpty()) {
            throw new IllegalArgumentException("No se encontró la reserva a actualizar");
        }

        ReservarHotel reservaExistente = optionalReservaHotel.get();

        // Actualizar campos simples directamente
        reservaExistente.setPeopleAmount(finalHotelReservationDTO.getHotelReservationDTO().getPeopleAmount());

        // Actualizar método de pago (paymentMethod)
        PaymentMethodDTO metodoPagoDTO = finalHotelReservationDTO.getHotelReservationDTO().getPaymentMethodDTO();
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
        hotelReservaRepository.save(reservaExistente);

        return new ResponseDTO("Reserva actualizada correctamente");
    }

    @Override
    public ResponseDTO deleteReserva(Long id) {
        Optional<ReservarHotel> reservaABuscar = hotelReservaRepository.findById(id);
        if(reservaABuscar.isEmpty()){
            return new ResponseDTO("No se encontro la reserva a eliminar");
        }
        ReservarHotel reservaAEliminar = reservaABuscar.get();
        Hotel hotelReservado = reservaAEliminar.getHotel();

        hotelReservaRepository.deleteById(id);

        hotelReservado.setReserved(false);
        hotelRepository.save(hotelReservado);

        return new ResponseDTO("Reserva eliminada con éxito");
    }

    //METODOS PARA REUTILIZAR
    @Override
    public Boolean reserveSaved(FinalHotelReservationDTO finalHotelReservationDTO) {
      String hotelCode = finalHotelReservationDTO.getHotelReservationDTO().getHotelCode();
      Hotel hotelEncontrado = hotelRepository.findByHotelCode(hotelCode);

      if (hotelEncontrado.getReserved() == true) {
          throw new IllegalArgumentException("Este hotel se encuentra reservado");
      }

        return false;
    }

       //Evalua el metodo de pago ingresado para poder hacer el carlculo de la reserva.
    @Override
    public Double calcInterest(Double amount, Integer dues, String type) {

        if (type.equalsIgnoreCase("Debit") || type.equalsIgnoreCase("Credit")) {
            if (type.equalsIgnoreCase("Debit") && dues > 1) {
                throw new IllegalArgumentException("No puede pagar en cuotas con tarjeta de debito.");
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

    //comparar tipo de habitacion con cantidad de personas ingresadas
    public Boolean roomCapacity(HotelReservationDTO reservation) {
        Double people;


        switch (reservation.getRoomType()) {
            case "Single":
                people = 1D;
                break;
            case "Doble":
                people = 2D;
                break;
            case "Triple":
                people = 3D;
                break;
            case "Múltiple":
                people = 4D;
                break;
            default:
                people = 0D;
                break;
        }
        if (!people.equals(reservation.getPeopleAmount())) {
            throw new IllegalArgumentException("La cantidad de personas no coincide con el tipo de habitación.");
        } else if (people != reservation.getPeopleDTO().size()) {
            throw new IllegalArgumentException("El tipo de habitación seleccionada no coincide con la cantidad de personas que se alojarán en ella.");
        }
        return true;


    }

    @Override
    public List<FinalHotelReservationDTO> mapearReservas(List<ReservarHotel> reservas) {
        List<FinalHotelReservationDTO> listAMotrar = new ArrayList<>();


        for (ReservarHotel reserva : reservas) { //Iteramos la lista de Reservas de la BBDD

            FinalHotelReservationDTO reservaFinal = new FinalHotelReservationDTO();

            Client clienteDTO = reserva.getCliente();
            if (clienteDTO != null) {
                reservaFinal.setUserName(clienteDTO.getUsername());
            } //Recuperamos el userName del cliente que realizo la reserva (obtenemos el primer campo del FinalHotelReservationDTO)

            HotelReservationDTO reservaGeneral = new HotelReservationDTO();
            //Inicializamos el segundo campo de FinalHotelReservationDTO (HotelReservatioDTO) y mapeamos todos los campos simples de HotelReservationDTO
            reservaGeneral.setHotelCode(reserva.getHotel().getHotelCode());
            reservaGeneral.setDateFrom(reserva.getHotel().getDateFrom());
            reservaGeneral.setDateTo(reserva.getHotel().getDateTo());
            reservaGeneral.setDestination(reserva.getHotel().getDestination());
            reservaGeneral.setRoomType(reserva.getHotel().getRoomType());
            reservaGeneral.setPeopleAmount(reserva.getPeopleAmount());


            PaymentMethod paymentMethodDeReserva = reserva.getPaymentMethod();
            PaymentMethodDTO pagoDTO = modelMapper.map(paymentMethodDeReserva, PaymentMethodDTO.class);
            //Mapeamos el Objeto PaymentMethod ==> PaymentMethodDTO
            reservaGeneral.setPaymentMethodDTO(pagoDTO); //le asignamos el campo a HotelReservationDTO

            List<People> peopleDeReserva = reserva.getPeople();
            List<PeopleDTO> peoplesDTO = new ArrayList<>();
            for (People peoples : peopleDeReserva) {
                PeopleDTO person = modelMapper.map(peoples, PeopleDTO.class);
                peoplesDTO.add(person);
            } //Mapeamos la lista de Peoples ==> peopleDTO
            reservaGeneral.setPeopleDTO(peoplesDTO); // Le asignamos la lista de peolesDTO al HotelReservationDTO

            reservaFinal.setHotelReservationDTO(reservaGeneral); //seteamos el HotelReservationDTO DEL FinalHotelReservationDTO con el HotelReservatioDTO creado
            listAMotrar.add(reservaFinal);
        } //guardo la lista de personas

        return listAMotrar;
    }

    @Override
    public List<ReservarHotel> listarReservasDia(LocalDate dia) {
        List<ReservarHotel> reservasListDia = hotelReservaRepository.findByDia(dia);
        return reservasListDia;
    }

    @Override
    public List<ReservarHotel> listarReservasMes(Integer mes) {
        List<ReservarHotel> reservasListMes = hotelReservaRepository.findByMes(mes);
        return reservasListMes;

    }


}
