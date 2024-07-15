package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.request.BoockingDto;
import com.example.Sprint1Equipo4.dto.request.PaymentMethodsDto;
import com.example.Sprint1Equipo4.dto.request.ReservationDtoRequest;
import com.example.Sprint1Equipo4.dto.response.ReservationDayDTO;
import com.example.Sprint1Equipo4.dto.response.ReservationMonthDTO;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.exception.InvalidRequestException;
import com.example.Sprint1Equipo4.exception.ResourceNotFoundException;
import com.example.Sprint1Equipo4.model.HotelBooking;
import com.example.Sprint1Equipo4.model.PaymentMethod;
import com.example.Sprint1Equipo4.repository.HotelBookingRepository;
import com.example.Sprint1Equipo4.repository.PaymentMethodRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelBookingServiceImpl implements HotelBookingService{

    @Autowired
    HotelBookingRepository bookingRepository;
    @Autowired
    PaymentMethodRepository paymentMethodRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<BoockingDto> listAllHotelBookings() {
        return bookingRepository.findAll().stream()
                .map(hotelBooking -> modelMapper.map(hotelBooking, BoockingDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public StatusDTO updateHotelBooking(ReservationDtoRequest booking, Long id) {
        //Busco reserva por Id
       HotelBooking existingHotelBooking = bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        //Valido booking
        if(booking.getBooking() ==null){
            throw new InvalidRequestException();
        }

        existingHotelBooking.setUserName(booking.getUserName());
        BoockingDto bookingDto = booking.getBooking();

        existingHotelBooking.setDateFrom(bookingDto.getDateFrom());
        existingHotelBooking.setDateTo(bookingDto.getDateTo());
        existingHotelBooking.setDestination(bookingDto.getDestination());
        existingHotelBooking.setHotelCode(bookingDto.getHotelCode());
        existingHotelBooking.setPeopleAmount(bookingDto.getPeopleAmount());
        existingHotelBooking.setRoomType(bookingDto.getRoomType());

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

        existingHotelBooking.setPaymentMethod(paymentMethod);

        existingHotelBooking.setId(id);

        // Guarda reserva actualizada
        bookingRepository.save(existingHotelBooking);

        return new StatusDTO(200, "Reserva de hotel modificada correctamente");

    }

    @Override
    public StatusDTO deleteHotelBooking(Long id) {
        //Busco reserva por id
        HotelBooking existingHotelBooking = bookingRepository.findById(id)
               .orElseThrow(() -> new ResourceNotFoundException());

        //Elimino reserva
        bookingRepository.delete(existingHotelBooking);

        return new StatusDTO(200, "Reserva eliminada correctamente");
    }

    @Override
    public ReservationMonthDTO getReservationMonth(int month, int year) {
        List<HotelBooking> listHotelBooking = bookingRepository.findReservationsByMonthAndYear(month, year);
        Double totalIncome = 0.0;
        for (HotelBooking hotelBooking : listHotelBooking){
            totalIncome += hotelBooking.getTotalPrice();
        }
        return new ReservationMonthDTO(month, year, totalIncome);
    }

    @Override
    public ReservationDayDTO getReservationDay(LocalDate date){
        List<HotelBooking> listHotelBookingDay = bookingRepository.findReservationsByDate(date);
        Double totalIncome = 0.0;
        for (HotelBooking hotelBooking : listHotelBookingDay){
            totalIncome += hotelBooking.getTotalPrice();
        }
        return new ReservationDayDTO(date, totalIncome);
    }
}
