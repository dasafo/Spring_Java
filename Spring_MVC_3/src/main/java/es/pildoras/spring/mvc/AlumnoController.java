package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



/*
 * ver imagen MVC_Tags.png
 * Alumno.java, AlumnoController.java, alumnoRegistroFormulario.jsp, confirmacionRegistroAlumno.jsp
y como pagina de inicio paginaEjemplo.jsp 
 */


@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	//Metodo que recorta los espacios en blanco que dejamos en el formulario(ver initBinder.png)
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		
		StringTrimmerEditor recortaEspaciosBlanco = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, recortaEspaciosBlanco);
		
	}
	
	//metodo para que nos muestre el formulario de registro(nombre,apellido,boton-enviar)
	//dichos datos seran almacenados en un objeto de topo alumno(Alumno.java)
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) { //recordar q el modelo es el puente entre el controlador y las vistas
		
		Alumno elAlumno = new Alumno(); //creamos el objeto
		
		//guardamos dentro del modelo model, el objeto que queremos que viaje 
		// entre el formulario de registro y la vista de confirmacion
		modelo.addAttribute("elAlumno", elAlumno); //nombre que asociamos al objeto(el que queramos) y el nombre del Objeto
		
		return "alumnoRegistroFormulario";
	}
	
	//Metodo que nos muestre la pagina de confimacion de la vista de Alumno Confirmado
	//Para ello llamamos al objeto creado llamado "elAlumno" con @ModelAttribute y lo guardamos
	// en un objeto de tipo Alumno llamado elAlumno
	//También metemos como argumento un BindingResult para la validacion de los formularios y el @Valid
  //para indicar q estamos usando validacion
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("elAlumno") Alumno elAlumno,
			BindingResult resultadoValidacion) {
		
		if(resultadoValidacion.hasErrors()) {
			return "alumnoRegistroFormulario";
		}
		else {
			return "confirmacionRegistroAlumno";
		}
		
	}
	

}
