package com.example.Sprint1Equipo4.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
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