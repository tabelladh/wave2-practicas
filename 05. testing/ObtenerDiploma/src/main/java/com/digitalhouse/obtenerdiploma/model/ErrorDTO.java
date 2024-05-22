package com.digitalhouse.obtenerdiploma.model;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDTO {

    private String description;
    @JsonProperty("messages_list")
    private List<String> messagesList;


}
