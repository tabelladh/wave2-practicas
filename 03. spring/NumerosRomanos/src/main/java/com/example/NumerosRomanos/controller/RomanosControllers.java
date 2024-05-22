package com.example.NumerosRomanos.controller;
import com.example.NumerosRomanos.service.IRomanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/romanos")
public class RomanosControllers {



    @Autowired// solo para la interfaz y inyectas la dependecia

    private IRomanosService romanosService;

    @GetMapping("/logica")

    // en el <aca ponemos lo que queremos que responsa> entre parentesis es para por parametro y lo que espera
    //restorna la respuesta que busca en roamnos service en el metodo tranformarARomanos
    public ResponseEntity<?>  transformarARomanos(@RequestParam Integer numDecimal){
        return new ResponseEntity<>(romanosService.transformarARomanos(numDecimal), HttpStatus.OK);
    }






        }


