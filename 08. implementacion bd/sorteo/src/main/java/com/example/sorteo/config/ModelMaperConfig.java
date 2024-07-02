package com.example.sorteo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class ModelMaperConfig {

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
