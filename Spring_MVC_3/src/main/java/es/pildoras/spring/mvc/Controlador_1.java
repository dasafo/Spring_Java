package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//----------------------- CONTROLADOR ---------------------

@Controller //Indicamos que esta clase sera nuestro Controlador
public class Controlador_1 {
	
	// Creamos un metodo para que especifique qué vista(view) queremos
	// e indicamos que este metodo será el encargado de esto con la anotacion
	// @RequestsMapping
	@RequestMapping("/paginaEjemplo") 
	public String muestraPagina() {
		return "paginaEjemplo"; //nombre de la pagina JSP que queremnos mostrar inicialmente
	}

}
