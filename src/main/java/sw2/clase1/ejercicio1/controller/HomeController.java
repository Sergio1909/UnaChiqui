package sw2.clase1.ejercicio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("")
    public String index(){
    return "index";
}

@GetMapping("/unachiqui")
    public String unachiquita(Model model){
    String x = "gaaaaaaa";
    model.addAttribute("msg",x);
    System.out.println("Hola, esta es una prueba jaja");
    return"/alumno/formCrear";

}
}
