package es.pildoras.spring.mvc;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//----------------------- CONTROLADOR ---------------------

@Controller
@RequestMapping("/principal") //para que no tengamos ambiguedad de llamda si hay mas controladores 
public class HolaAlumnosControlador_2 {
	
	// 1. Creacion de metodo que cuando se hace
	// una peticion por URL de un formulario, pida al servidor dicho formulario
	@RequestMapping("/muestraFormulario") //entre () va la URL que por convenciones la misma que el metodo
	public String muestraFormulario() {
		
		return "HolaAlumnosFormulario"; //nombre pagina jsp que devolvera
	}
	
	// 2.1 Creacion de un metodo que procese la informacion que le llega de ese formulario
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		
		return "HolaAlumnosSpring"; //nombre pagina jsp que devolvera
	}
	
	// 2.2 Metodo que procesara la info que queremos agregar al modelo y despues llamara a la lista
	@RequestMapping("/procesarFormulario2")
	/*
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		String nombre = request.getParameter("nombreAlumno"); //nombreAlumno es el nombre del formulario
	*/
	//Vamos a sustituir las dos lineas de arriba por una sola gracias al binding request @RequestParam()
	//Para ello introducimos el nombre del modelo creado "nombreAlumno" y guardamos dicha info en un objeto
	// de tipo String llamado nombre
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {

		nombre +=" es el mejor alumno"; 
		
		String mensajeFinal = "¿Quién es el mejor alumno? " + nombre;
		
		//Agregar info al modelo
		modelo.addAttribute("mensajeClaro", mensajeFinal);
	  //	luego llamamos a mensajeFinal en HolaAlumnosSpring.jsp
    
		return "HolaAlumnosSpring"; //nombre pagina jsp que devolvera
	}

}
