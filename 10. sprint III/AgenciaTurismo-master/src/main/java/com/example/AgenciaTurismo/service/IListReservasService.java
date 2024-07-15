package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.response.ListReservasDTO;
import com.example.AgenciaTurismo.dto.response.ReservaDiaDTO;
import com.example.AgenciaTurismo.dto.response.ReservaMesDTO;

import java.time.LocalDate;

public interface IListReservasService {

    ListReservasDTO listarReservas();

    ReservaDiaDTO listarReservasPorDia(LocalDate dia);

    ReservaMesDTO listarReservasPorMes(Integer mes);
}
