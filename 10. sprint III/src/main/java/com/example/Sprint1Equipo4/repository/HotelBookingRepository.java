package com.example.Sprint1Equipo4.repository;

import com.example.Sprint1Equipo4.model.HotelBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface HotelBookingRepository extends JpaRepository<HotelBooking, Long> {
    boolean existsByDateFromAndDateToAndDestinationAndHotelCode(
            LocalDate dateFrom, LocalDate dateTo, String destination, String hotelCode
    );

    @Query("SELECT b FROM HotelBooking b WHERE b.reservedDate =:date ")
    List<HotelBooking> findReservationsByDate(LocalDate date);

    @Query("SELECT b FROM HotelBooking b WHERE MONTH( b.reservedDate)=:month AND YEAR(b.reservedDate) = :year")
    List<HotelBooking> findReservationsByMonthAndYear(int month, int year);
}
