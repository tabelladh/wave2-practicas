package com.example.AgenciaTurismo.dto;

import com.example.AgenciaTurismo.model.ReservarHotel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelDTO {
    @JsonProperty("hotel_code")
    private String hotelCode;
    @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El nombre no puede ser nulo")
    @JsonProperty("hotel_name")
    private String hotelName;
    @NotBlank(message = "El destino no puede ser nulo")
    private String destination;
    @JsonProperty("room_type")
    private String roomType;
    @JsonProperty("price_for_night")
    private Integer priceForNight;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonProperty("disponibility_date_from")
    @Future(message= "La Fecha de entrada debe ser en el futuro")
    private LocalDate dateFrom;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonProperty("disponibility_date_to")
    @Future(message= "La Fecha de salida debe ser en el futuro")
    private LocalDate dateTo;
    @JsonProperty("is_booking")
    private Boolean reserved;

}
