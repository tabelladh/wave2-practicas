package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.ClienteDTO;
import com.example.AgenciaTurismo.model.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {


    ClienteDTO findByUsername(String username);

    List<ClienteDTO> topClientes();

    List<Client> listarClientes();
}
