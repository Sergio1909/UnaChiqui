package sw2.clase1.ejercicio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/unachiqui1")
    public String unachiquit222a(Model model){
        String x = "gaaaaaaa";
        model.addAttribute("msg",x);
        System.out.println("Hola, esta es una prueba jaja");
        return"/alumno/formCrear";

    }
}
