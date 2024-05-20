package com.example.DesafioSprint1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethod {

    private String  type;
    @JsonProperty("number_card")
    private String  numberCard;
    private Integer dues;

}
