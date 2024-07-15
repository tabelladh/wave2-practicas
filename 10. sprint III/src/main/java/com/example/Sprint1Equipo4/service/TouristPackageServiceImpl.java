package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.exception.ArgumentException;
import com.example.Sprint1Equipo4.exception.PackageNotFound;
import com.example.Sprint1Equipo4.exception.ReserveNotFound;
import com.example.Sprint1Equipo4.exception.ResourceNotFoundException;
import com.example.Sprint1Equipo4.model.FlightReservation;
import com.example.Sprint1Equipo4.model.HotelBooking;
import com.example.Sprint1Equipo4.model.TouristPackage;
import com.example.Sprint1Equipo4.repository.FlightReservationRepository;
import com.example.Sprint1Equipo4.repository.HotelBookingRepository;
import com.example.Sprint1Equipo4.repository.TouristPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TouristPackageServiceImpl implements TouristPackageService {

    @Autowired
    private TouristPackageRepository touristPackageRepository;

    @Autowired
    private FlightReservationRepository flightReservationRepository;

    @Autowired
    private HotelBookingRepository hotelBookingRepository;

    @Override
    public TouristPackage createPackage(TouristPackage paquete) {

        if (paquete.getBookingsOrReservations().size() != 2) {
            throw new ArgumentException();
        }

        for (Long reservationId : paquete.getBookingsOrReservations()) {
            if (!reservationExists(reservationId)) {
                throw new ReserveNotFound();
            }
        }

        return touristPackageRepository.save(paquete);
    }

    public TouristPackage updatePackage(Long packageNumber, TouristPackage packageDetails) {
        TouristPackage paquete = touristPackageRepository.findById(packageNumber)
                .orElseThrow(() -> new PackageNotFound());

        paquete.setName(packageDetails.getName());
        paquete.setCreationDate(packageDetails.getCreationDate());
        paquete.setClientId(packageDetails.getClientId());
        paquete.setBookingsOrReservations(packageDetails.getBookingsOrReservations());

        if (paquete.getBookingsOrReservations().size() != 2) {
            throw new ArgumentException();
        }

        return touristPackageRepository.save(paquete);
    }

    public List<TouristPackage> getAllPackages() {
        return touristPackageRepository.findAll();
    }

    public void deletePackage(Long packageNumber) {
        TouristPackage paquete = touristPackageRepository.findById(packageNumber)
                .orElseThrow(() -> new PackageNotFound());
        touristPackageRepository.delete(paquete);
    }

    public boolean reservationExists(Long reservationId) {
        return flightReservationRepository.existsById(reservationId) || hotelBookingRepository.existsById(reservationId);
    }

}


