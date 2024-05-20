package com.example.DesafioSprint1.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class ErrorDTO {

    private String description;

    private Integer status;

    public ErrorDTO() {
    }

    public ErrorDTO(String description, Integer status) {
        this.description = description;
        this.status = status;
    }
}