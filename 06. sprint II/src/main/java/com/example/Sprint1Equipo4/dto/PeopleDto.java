package com.example.Sprint1Equipo4.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeopleDto {

    private String dni;
    private String name;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("birth_date")
    private String birthDate;
    private String email;

}
