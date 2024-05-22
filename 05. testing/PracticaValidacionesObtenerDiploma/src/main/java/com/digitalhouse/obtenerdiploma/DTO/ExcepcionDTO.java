package com.digitalhouse.obtenerdiploma.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcepcionDTO {

    String description;
    Integer status;
}
