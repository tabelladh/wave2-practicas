package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.request.FinalFlightReservationDTO;
import com.example.AgenciaTurismo.dto.request.FinalHotelReservationDTO;
import com.example.AgenciaTurismo.dto.response.ListReservasDTO;
import com.example.AgenciaTurismo.dto.response.ReservaDiaDTO;
import com.example.AgenciaTurismo.dto.response.ReservaMesDTO;
import com.example.AgenciaTurismo.model.ReservarFlight;
import com.example.AgenciaTurismo.model.ReservarHotel;
import com.example.AgenciaTurismo.repository.IFlightReservaRepository;
import com.example.AgenciaTurismo.repository.IHotelReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ListReservasService implements IListReservasService {

    @Autowired
    IFlightReservaRepository flightReservaRepository;
    @Autowired
    IHotelReservaRepository hotelReservaRepository;

    @Autowired
    IFlightReservaService flightReservaService;
    @Autowired
    IHotelReservaService hotelReservaService;


    @Override
    public ListReservasDTO listarReservas() {
        ListReservasDTO listaReservasDTO = new ListReservasDTO();
        listaReservasDTO.setMessage("Listado de Todas las Reservas");
        listaReservasDTO.setListaReservaHotels(hotelReservaService.listarReservas());
        listaReservasDTO.setListaReservaFlight(flightReservaService.listarReservas());
        return listaReservasDTO;
    }

    @Override
    public ReservaDiaDTO listarReservasPorDia(LocalDate dia) {
        List<ReservarHotel> listaReservasHotelDia = (hotelReservaService.listarReservasDia(dia));
         Double totalReservasHotel = 0.0;
        Double totalReservasVuelo = 0.0;
        for (ReservarHotel reserva : listaReservasHotelDia){
            totalReservasHotel += reserva.getTotalAmount();
        }
        List<ReservarFlight> listaReservasVueloDia = (flightReservaService.listarReservasDia(dia));
        for (ReservarFlight reserva : listaReservasVueloDia) {
            totalReservasVuelo += reserva.getTotalAmount();
        }
        ReservaDiaDTO totalReservasDia = new ReservaDiaDTO();
        totalReservasDia.setDate(dia);
        totalReservasDia.setTotal(totalReservasHotel + totalReservasVuelo);
        return totalReservasDia;
    }

    @Override
    public ReservaMesDTO listarReservasPorMes(Integer mes) {
        List<ReservarHotel> listaReservaHotelMes =hotelReservaService.listarReservasMes(mes);
        Double totalReservasHotel = 0.0;
        Double totalReservasVuelo = 0.0;
        for (ReservarHotel reserva : listaReservaHotelMes){
            totalReservasHotel += reserva.getTotalAmount();
        }
        List<ReservarFlight> listaReservaVueloMes = flightReservaService.listarReservasMes(mes);
        for (ReservarFlight reserva : listaReservaVueloMes) {
            totalReservasVuelo += reserva.getTotalAmount();
        }
        ReservaMesDTO totalReservasMes = new ReservaMesDTO();
        totalReservasMes.setMes(mes);
        totalReservasMes.setAnio(2024);
        totalReservasMes.setTotal(totalReservasHotel + totalReservasVuelo);
        return totalReservasMes;
    }
}
