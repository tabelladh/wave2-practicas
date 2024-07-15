package com.example.Sprint1Equipo4.repository;

import com.example.Sprint1Equipo4.model.FlightReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface FlightReservationRepository extends JpaRepository<FlightReservation, Long> {
    boolean existsByDateFromAndDateToAndOriginAndDestination(
            LocalDate dateFrom, LocalDate dateTo, String origin, String destination);

    @Query("SELECT fr FROM FlightReservation fr " +
            "WHERE fr.reservedDate = :date ")
    List<FlightReservation> findReservationsByDate(LocalDate date);


    @Query("SELECT fr FROM FlightReservation fr " +
            "WHERE MONTH(fr.reservedDate) = :month AND YEAR(fr.reservedDate) = :year ")
    List<FlightReservation> findReservationsByMonthAndYear(int month, int year);

}
