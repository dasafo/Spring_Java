package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaMundoController {

    @RequestMapping("/saludo")
    public String muestraSaludo(Model model) {
        // Agregamos un atributo al modelo que será accesible en la vista
        model.addAttribute("mensaje", "¡Hola, Mundo desde Spring MVC!");

        // Devolvemos el nombre de la vista (el archivo holaMundo.JSP)
        return "holaMundo";
    }
}
