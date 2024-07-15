package com.example.AgenciaTurismo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReservationPackageDTO {
    @JsonProperty("book_res_id1")
    private Long id1;
    @JsonProperty("book_res_id2")
    private Long id2;
}
