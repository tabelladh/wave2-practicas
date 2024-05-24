package com.obtenerdiploma.dto;


import javax.validation.constraints.NotNull;

public record ErrorDTO(
        String name,
        String description){
}
