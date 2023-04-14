package com.primerProyecto.Springproyecto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @GetMapping("/")
    public String decirHola(){
        return "hola Mundo";
    }
    @GetMapping("/Bye")
    public String decirBye(){
        return "Bye Bye";
    }

    @GetMapping("/saludar/{nombre}")
    public String saludarAlguien(@PathVariable String nombre){
        return  "hola " + nombre + " como estas ?";
    }

}
