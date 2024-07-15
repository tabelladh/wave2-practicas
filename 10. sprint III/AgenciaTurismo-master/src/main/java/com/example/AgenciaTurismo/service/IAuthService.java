package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.AuthResponseDTO;
import com.example.AgenciaTurismo.dto.request.LoginDTO;

public interface IAuthService {
    AuthResponseDTO login(LoginDTO userDto);
}
