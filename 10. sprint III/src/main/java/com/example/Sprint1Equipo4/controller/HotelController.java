package com.example.Sprint1Equipo4.controller;

import com.example.Sprint1Equipo4.dto.request.ReservationDtoRequest;
import com.example.Sprint1Equipo4.dto.response.HotelDTO;
import com.example.Sprint1Equipo4.dto.response.ReservationDto;
import com.example.Sprint1Equipo4.exception.MissingParameterException;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.service.HotelService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Validated
@RestController
@RequestMapping("/api/v1")
public class HotelController {

   @Autowired
   private HotelService hotelService;

   @GetMapping("/hotels")
   public ResponseEntity<List<HotelDTO>> listHotels(
           @RequestParam(value="date_from", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") @FutureOrPresent LocalDate dateFrom,
           @RequestParam(value="date_to", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") @FutureOrPresent LocalDate dateTo,
           @RequestParam(value="destination", required = false) String destination) {
      if (dateFrom == null && dateTo == null && destination == null) {
         List<HotelDTO> allHotels = hotelService.listHotels();
         return new ResponseEntity<>(allHotels, HttpStatus.OK);
      }
        if (dateFrom == null || dateTo == null || destination == null) {
           throw new MissingParameterException();
        }

      hotelService.validateDateRange(dateFrom, dateTo, destination);

      List<HotelDTO> availableHotels = hotelService.findAvailableHotels(dateFrom, dateTo, destination);
      return ResponseEntity.ok(availableHotels);
   }

   @PostMapping("/hotels/new")
   public ResponseEntity<HotelDTO> saveHotel(@RequestBody HotelDTO hotelDTO) {
      HotelDTO savedHotel = hotelService.saveHotel(hotelDTO);
      return ResponseEntity.status(HttpStatus.CREATED).body(savedHotel);
   }

   @DeleteMapping("/hotels/delete")
   public ResponseEntity<StatusDTO> deleteHotel(@RequestParam String hotelCode){
      return new ResponseEntity<>(hotelService.deleteHotel(hotelCode), HttpStatus.OK);
   }

   @GetMapping("/hotel/{hotelCode}")
   public ResponseEntity<HotelDTO> searchByCode(@PathVariable String hotelCode) {
      return new ResponseEntity<>(hotelService.searchByCode(hotelCode), HttpStatus.OK);
   }


   @PutMapping("/hotels/edit")
   public ResponseEntity<HotelDTO> updateHotel(@RequestBody HotelDTO hotelDTO, @RequestParam String hotelCode) {
      return new ResponseEntity<>(hotelService.updateHotel(hotelDTO), HttpStatus.OK);
   }
}

