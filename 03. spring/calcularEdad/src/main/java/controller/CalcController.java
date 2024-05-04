package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.CalcService;

@RestController
public class CalcController {

    @Autowired
    private CalcService calcService;


    @GetMapping("/{diaNacimiento}/{mesNacimiento}/{anioNacimiento}")

    Integer calcudoraEdad(@PathVariable Integer diaNacimiento,@PathVariable Integer mesNacimiento,@PathVariable Integer anioNacimiento){
        return calcService.calculadoraEdad(diaNacimiento,mesNacimiento,anioNacimiento);
    }
}
