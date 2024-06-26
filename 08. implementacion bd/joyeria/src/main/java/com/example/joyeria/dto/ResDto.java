package com.example.joyeria.dto;

import com.example.joyeria.model.Joya;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResDto {
    private int status;
    private Joya joya;
}
