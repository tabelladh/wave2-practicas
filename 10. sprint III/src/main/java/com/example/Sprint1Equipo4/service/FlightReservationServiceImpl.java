package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.request.FlightReqDto;
import com.example.Sprint1Equipo4.dto.request.FlightReservationDto;
import com.example.Sprint1Equipo4.dto.request.PaymentMethodsDto;
import com.example.Sprint1Equipo4.dto.response.ReservationDayDTO;
import com.example.Sprint1Equipo4.dto.response.ReservationMonthDTO;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.exception.InvalidRequestException;
import com.example.Sprint1Equipo4.exception.ResourceNotFoundException;
import com.example.Sprint1Equipo4.model.FlightReservation;
import com.example.Sprint1Equipo4.model.PaymentMethod;
import com.example.Sprint1Equipo4.repository.FlightReservationRepository;
import com.example.Sprint1Equipo4.repository.PaymentMethodRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightReservationServiceImpl implements FlightReservationService{

    @Autowired
    FlightReservationRepository flightReservationRepository;

    @Autowired
    PaymentMethodRepository paymentMethodRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<FlightReservationDto> listAllFlightReservations() {
        return flightReservationRepository.findAll().stream()
                .map(flightReservation -> modelMapper.map(flightReservation, FlightReservationDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public StatusDTO updateFlightReservation(FlightReqDto reservation, Long id) {
       FlightReservation existingFlightReservation = flightReservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        //Valido booking
        if(reservation.getClass() ==null){
            throw new InvalidRequestException();
        }

        //SETEO DATOS

        existingFlightReservation.setUserName(reservation.getUserName());
        FlightReservationDto flightReservationDto = reservation.getFlightReservationDto();

        existingFlightReservation.setDateFrom(flightReservationDto.getDateFrom());
        existingFlightReservation.setDateTo(flightReservationDto.getDateTo());
        existingFlightReservation.setDestination(flightReservationDto.getDestination());
        existingFlightReservation.setOrigin(flightReservationDto.getOrigin());
        existingFlightReservation.setFlightCode(flightReservationDto.getFlightCode());
        existingFlightReservation.setSeatType(flightReservationDto.getSeatType());

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

        existingFlightReservation.setPaymentMethod(paymentMethod);

        // setteo id para que use el mismo a la reserva ya realizada
        existingFlightReservation.setId(id);

        // Guarda reserva actualizada
        flightReservationRepository.save(existingFlightReservation);

        return new StatusDTO(200, "Reserva de vuelo modificada correctamente");

    }

    @Override
    public StatusDTO deleteFlightReservation(Long id) {
        //Busco reserva por id
        FlightReservation existingFlightReservation = flightReservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        //Elimino reserva
        flightReservationRepository.delete(existingFlightReservation);

        return new StatusDTO(200, "Reserva de vuelo eliminada correctamente");
    }

    @Override
    public ReservationMonthDTO getReservationMonth(int month, int year) {
        List<FlightReservation> listFlightReservation= flightReservationRepository.findReservationsByMonthAndYear(month, year);
        Double totalIncome = 0.0;
        for (FlightReservation flightReservation : listFlightReservation) {
            totalIncome += flightReservation.getTotalPrice();
        }
        return new ReservationMonthDTO(month, year, totalIncome);
    }

    @Override
    public ReservationDayDTO getReservationDay(LocalDate date){
        List<FlightReservation> listFlightReservationsDay = flightReservationRepository.findReservationsByDate(date);
        Double totalIncome = 0.0;
        for (FlightReservation flightReservation : listFlightReservationsDay){
            totalIncome += flightReservation.getTotalPrice();
        }
        return new ReservationDayDTO(date, totalIncome);
    }
}
