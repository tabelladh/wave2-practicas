package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.response.ClientDTO;
import com.example.Sprint1Equipo4.model.Client;
import com.example.Sprint1Equipo4.model.FlightReservation;
import com.example.Sprint1Equipo4.model.HotelBooking;
import com.example.Sprint1Equipo4.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

   @Autowired
   private ClientRepository clientRepository;

   @Autowired
   private ModelMapper modelMapper;

   public List<ClientDTO> getHotelsTop3ClientsByBookingQuantity(int year) {
      List<Client> clients = clientRepository.findBookingQuantityByYear(year);

      // Obtener solo los primeros 3 clientes (Top 3)
      List<Client> top3Clients = clients.stream()
            .limit(3)
            .collect(Collectors.toList());

      // Mapear los clientes a ClientDTO y configurar topNumber, year y totalAmount
      return top3Clients.stream()
            .map(client -> {
               ClientDTO clientDTO = modelMapper.map(client, ClientDTO.class);
               clientDTO.setTopNumber(getTopNumberForClient(client, clients));
               clientDTO.setYear(year);
               clientDTO.setTotalAmount(calculateTotalAmount(client));
               return clientDTO;
            })
            .collect(Collectors.toList());
   }

   private double calculateTotalAmount(Client client) {
      double totalAmountHotels = client.getHotelBooking().stream()
            .mapToDouble(HotelBooking::getTotalPrice)
            .sum();

      double totalAmountFlights = client.getFlightReservation().stream()
            .mapToDouble(FlightReservation::getTotalPrice)
            .sum();

      return totalAmountHotels + totalAmountFlights;
   }

   private int getTopNumberForClient(Client client, List<Client> sortedClients) {
      return sortedClients.indexOf(client) + 1;
   }
}
