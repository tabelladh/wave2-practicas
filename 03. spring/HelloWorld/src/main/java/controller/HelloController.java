package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController


public class HelloController {
    @GetMapping("/Hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/Hello/{name}")

    public String hello1(@PathVariable String name){
        return "Hello World " + name;

    }

    @GetMapping ("/Hellos/{name}/{apellido}/{edad}")

    public String Hello2 (@PathVariable String nombre,
                          @PathVariable String apellido,
                          @PathVariable String edad){
        return ("Hello World!Tu nombre es:" +nombre+ ", Tu apellido es:"+apellido+", Y tenes"+edad+ "años.");
    }


}
