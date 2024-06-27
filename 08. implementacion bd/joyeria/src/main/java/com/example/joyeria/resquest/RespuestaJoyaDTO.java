package com.example.joyeria.resquest;


import com.example.joyeria.entity.Joya;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaJoyaDTO {

    private Joya joyaActualizado;

    private Integer statusCode;
}
