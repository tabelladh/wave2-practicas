package com.example.sorteo.dto;

import com.example.sorteo.entity.Topic;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private String name;
    @JsonProperty("last_name")
    private String lastNane;
    private String dni;
    private Topic topic;

}
