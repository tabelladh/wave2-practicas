package com.digitalhouse.obtenerdiploma.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ErrorDTO {
    private String description;
    private List<String> messagesList;

}
