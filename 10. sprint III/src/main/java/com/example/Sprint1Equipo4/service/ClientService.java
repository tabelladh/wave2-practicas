package com.example.Sprint1Equipo4.service;

import com.example.Sprint1Equipo4.dto.response.ClientDTO;
import java.util.List;

public interface ClientService {
   List<ClientDTO> getHotelsTop3ClientsByBookingQuantity(int year);
}
