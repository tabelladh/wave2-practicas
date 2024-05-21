package com.example.AlumnoDTORP.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcepcionDTO {


    private String description;

    private Integer status;
}
