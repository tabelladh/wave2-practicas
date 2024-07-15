package com.example.AgenciaTurismo.controller;


import com.example.AgenciaTurismo.service.IFlightService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FlightControllerTest {

    @Mock
    private IFlightService flightService;

    @InjectMocks
    private FlightController flightController;



}
