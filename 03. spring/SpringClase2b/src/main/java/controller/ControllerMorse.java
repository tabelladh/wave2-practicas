package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.IServiceMorse;


@RestController
@RequestMapping("/api/morse")
public class ControllerMorse {

    private final IServiceMorse serviceMorse;

    @Autowired
    public ControllerMorse(IServiceMorse serviceMorse) {
        this.serviceMorse = serviceMorse;
    }

    @GetMapping("/traducir")
    public String traducirMorse(@RequestParam("codigo") String morseCode) {
        return serviceMorse.morseATexto(morseCode);
    }
}