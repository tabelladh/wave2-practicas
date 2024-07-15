package com.example.AgenciaTurismo.controller;


import com.example.AgenciaTurismo.service.IHotelService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HotelControllerTest {

    @Mock
    private IHotelService hotelService;

    @InjectMocks
    private HotelController hotelController;



}
