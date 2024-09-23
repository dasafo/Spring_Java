package es.pildoras.spring.mvc;

import javax.validation.constraints.*;

import es.pildoras.spring.mvc.validacionespersonalizadas.CPostalMadrid;

/*
 * ver imagen MVC_Tags.png
 * Alumno.java, AlumnoController.java, alumnoRegistroFormulario.jsp, confirmacionRegistroAlumno.jsp
 y como pagina de inicio paginaEjemplo.jsp
 */

public class Alumno {
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getOptativa() {
		return optativa;
	}
	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}

	public String getCiudadEstudios() {
		return ciudadEstudios;
	}
	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}

	public String getIdiomasAlumno() {
		return idiomasAlumno;
	}
	public void setIdiomasAlumno(String idiomasAlumno) {
		this.idiomasAlumno = idiomasAlumno;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	@NotNull //con las librearias de hibernate validation añadidas manualmente podemos decir que el campo name no pueda estar vacio
	@Size(min=2, message="Campo requerido!") //tamaño minimo del nombre de 2 letras y su mensaje de alerta
	private String nombre;
	
	private String apellido;
	private String optativa;
	private String ciudadEstudios;
	private String idiomasAlumno;
	
	@Min(value=10, message="No se permiten edades menores de 10 años!!")
	@Max(value=100, message="No se permiten edades mayores de 100 años!!")
	private int edad;
	
	@Email
	private String email;
	
	//@Pattern(regexp="[0-9]{5}", message="Solo 5 valores numéricos!!") //le decimos con regex que solo queremos 5 valores numericos del 0 al 9
	@CPostalMadrid //para validaciones personalizadas (ver CPostalMadrid.java)
	private String codigoPostal;

}
