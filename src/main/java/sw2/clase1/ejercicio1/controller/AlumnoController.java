package sw2.clase1.ejercicio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sw2.clase1.ejercicio1.util.Alumno;

import java.util.ArrayList;

@Controller
public class AlumnoController {
    @GetMapping("/alumno")
    public String tablaAlumnos(Model model){
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("20143363","Sergio","Muro","sergiomu96@hotmail.com"));

        model.addAttribute("listaAlumnos",listaAlumnos);

        return "alumno/lista";

    }

    @GetMapping("/crearAlumno")
    public String crearAlumnoForm(){
        return"alumno/formCrear";
    }
    @PostMapping("/guardarAlumno")
    public String GuardarAlumno(@RequestParam("codigo") String codigo,
                                @RequestParam("nombre") String nombre,
                                @RequestParam("apellido") String apellido,
                                @RequestParam("correo") String correo,
                                Model model){
        model.addAttribute("codigo", codigo);
        model.addAttribute("nombre", nombre);
        model.addAttribute("apellido", apellido);
        model.addAttribute("correo", correo);



        return "alumno/resumen";
    }
}
