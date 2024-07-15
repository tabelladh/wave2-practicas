package com.example.Sprint1Equipo4.controller;

import com.example.Sprint1Equipo4.dto.response.ClientDTO;
import com.example.Sprint1Equipo4.exception.InvalidYearException;
import com.example.Sprint1Equipo4.service.ClientService;
import jakarta.validation.UnexpectedTypeException;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@Validated
public class ClientController {

   @Autowired
   private ClientService clientService;

   @GetMapping("/top-3")
   public ResponseEntity<List<ClientDTO>> getHotelsTop3ClientsByBookingQuantity(@RequestParam int year) {
      if (!isValidYear(year)) {
         throw new UnexpectedTypeException();
      }
      return new ResponseEntity<>(clientService.getHotelsTop3ClientsByBookingQuantity(year), HttpStatus.OK);
   }

   private boolean isValidYear(int year) {
      return year >= 1000 && year <= 9999;
   }
}

