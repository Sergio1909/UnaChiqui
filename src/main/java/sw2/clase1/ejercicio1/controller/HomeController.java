package sw2.clase1.ejercicio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("")
    public String index(){
    return "index";
}

@GetMapping ("ListaNueva"){
    public String listarNuevosAlumnos(){

        return "resumen";

    }
}

}
