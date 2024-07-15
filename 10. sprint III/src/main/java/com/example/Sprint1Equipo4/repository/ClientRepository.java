package com.example.Sprint1Equipo4.repository;

import com.example.Sprint1Equipo4.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
   @Query("SELECT c FROM Client c " +
         "LEFT JOIN c.hotelBooking hb " +
         "LEFT JOIN c.flightReservation fr " +
         "WHERE (hb IS NOT NULL AND YEAR(hb.reservedDate) = :year) " +
         "OR (fr IS NOT NULL AND YEAR(fr.reservedDate) = :year) " +
         "GROUP BY c.id " +
         "ORDER BY COUNT(hb) + COUNT(fr) DESC")
   List<Client> findBookingQuantityByYear(@Param("year") int year);

   Client findByUserName(String userName);

}
