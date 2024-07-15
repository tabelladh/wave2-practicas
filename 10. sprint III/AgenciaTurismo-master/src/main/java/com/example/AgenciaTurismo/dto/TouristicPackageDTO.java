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
public class TouristicPackageDTO {

    @JsonProperty("package_number")
    private String packageNumber;

    private String name;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonProperty("creation_date")
    private LocalDate creationDate;

    @JsonProperty("client_id")
    private Long clienteId;

    @JsonProperty("bookings_or_reservations")
    private ReservationPackageDTO listaReservation;


}
