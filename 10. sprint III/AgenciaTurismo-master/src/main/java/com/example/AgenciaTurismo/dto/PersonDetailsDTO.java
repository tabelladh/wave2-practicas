package com.example.AgenciaTurismo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDetailsDTO {
    private Integer dni;
    private String name;;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("birth_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;
    private String email;
}

