package com.example.Sprint1Equipo4.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class PaymentMethodsDto {

    private String type;
    @JsonProperty("number_card")
    private String numberCard;
    private Integer dues;

}
