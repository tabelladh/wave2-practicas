package com.example.AgenciaTurismo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethodDTO {
    private String type;
    @JsonProperty("number_card")
    private String numberCard;
    private Integer dues;
}
