package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.ClienteDTO;
import com.example.AgenciaTurismo.dto.HotelDTO;
import com.example.AgenciaTurismo.model.Client;
import com.example.AgenciaTurismo.model.ReservarFlight;
import com.example.AgenciaTurismo.model.ReservarHotel;
import com.example.AgenciaTurismo.repository.IClientRepository;
import com.example.AgenciaTurismo.repository.IHotelRepository;
import com.example.AgenciaTurismo.repository.IHotelReservaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService{

    @Autowired
    IClientRepository clientRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<Client> listarClientes(){
        return clientRepository.findAll();
    }

    @Override
    public ClienteDTO findByUsername(String username) {
        Optional<Client> clienteEncontrado = clientRepository.findByUsername(username);
        ClienteDTO clienteDTO = modelMapper.map(clienteEncontrado, ClienteDTO.class);
        return clienteDTO;
    }

    @Override
    public List<ClienteDTO> topClientes() {

    List<Client> listaCliente = clientRepository.findTop3Clients();
    List<ClienteDTO> listaRespuesta = new ArrayList<>();
    int top = 1;
    for(Client cliente : listaCliente){

        List<ReservarHotel> reservaDelCliente = cliente.getReservationHotel();
        List<ReservarFlight> reservaDelClienteVuelo = cliente.getReservationFlight();


        Double totalAmountHotel = 0.0;
        for(ReservarHotel reserva : reservaDelCliente) {
            totalAmountHotel += reserva.getTotalAmount();
        }

        Double totalAmountVuelos = 0.0;
        for(ReservarFlight reservaVuelo : reservaDelClienteVuelo) {
            totalAmountVuelos += reservaVuelo.getTotalAmount();
        }


        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setTopNumber(top);
        clienteDTO.setYear(2024);
        clienteDTO.setBookingQuantity(cliente.getBookingQuantity());
        clienteDTO.setClienteId(cliente.getId());
        clienteDTO.setFirstName(cliente.getFirstName());
        clienteDTO.setLastName(cliente.getLastName());
        clienteDTO.setTotalAmount(totalAmountHotel + totalAmountVuelos);
        listaRespuesta.add(clienteDTO);
        top++;
    }

        return listaRespuesta;
    }


}
