<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <!-- Ver  https://www.javatpoint.com/spring-mvc-form-tag-library
  
 	ver imagen MVC_Tags.png
 	Alumno.java, AlumnoController.java, alumnoRegistroFormulario.jsp, confirmacionRegistroAlumno.jsp
    y como pagina de inicio paginaEjemplo.jsp
    -->
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Registro</title>
</head>
<body>

  <!--Creamos un formulario con las jsp tags -->
  <!-- ************************************* -->

	<form:form action="procesarFormulario" modelAttribute="elAlumno"> <!-- elAlumno es el identificador que le hemos dado en AlumnoController -->
	
	Nombre: <form:input path="nombre"/> <!-- viene de getNombre,aqui n en minuscula y sin get o set -->
	<form:errors path="nombre" style="color:red"/> <!-- Para que pille el error en la validacion -->
	
	<br/><br/><br/>
	Apellido: <form:input path="apellido"/> <!-- viene de getApellido,aqui n en minuscula y sin get o set -->
	
	<br/><br/><br/>
	
	Edad: <form:input path="edad"/> <!-- viene de getApellido,aqui n en minuscula y sin get o set -->
	<form:errors path="edad" style="color:red"/> <!-- Para que pille el error en la validacion -->
	
	<br/><br/><br/>
	
	E-Mail: <form:input path="email"/> <!-- viene de getApellido,aqui n en minuscula y sin get o set -->
	<form:errors path="email" style="color:red"/> <!-- Para que pille el error en la validacion -->
	
	<br/><br/><br/>
	
	Código Postal: <form:input path="codigoPostal"/> <!-- viene de getApellido,aqui n en minuscula y sin get o set -->
	<form:errors path="codigoPostal" style="color:red"/> <!-- Para que pille el error en la validacion -->
	
	<br/><br/><br/>
	
	Asignaturas Optativas: <br/>
	<form:select path="optativa" multiple="true"> <!-- llamara a getOptativa de Alumno.java-->
		<form:option value="Dieseño" label="Diseño"/>
		<form:option value="Karate" label="Karate"/>
		<form:option value="Basket" label="Basket"/>
		<form:option value="Piano" label="Piano"/>
	</form:select>
	
	<br/><br/><br/>
  <!-- Al nombrar a todos con el mismo path nos aseguramos que solo puedas seleccionar uno -->	
		Barcelona<form:radiobutton path="ciudadEstudios" value="Barcelona"/><!-- llamara a getCiudadEstudios de Alumno.java-->
		Zaragoza<form:radiobutton path="ciudadEstudios" value="Zaragoza"/>
		Tenerife<form:radiobutton path="ciudadEstudios" value="Tenerife"/>
		Bilbao<form:radiobutton path="ciudadEstudios" value="Bilbao"/>
	
	<br/><br/><br/>
	
		Inglés<form:checkbox path="idiomasAlumno" value="ingles"/><!-- llamara a getIdiomasAlumno de Alumno.java-->
		Alemán<form:checkbox path="idiomasAlumno" value="aleman"/>
		Chino<form:checkbox path="idiomasAlumno" value="chino"/>
		Ruso<form:checkbox path="idiomasAlumno" value="ruso"/>
		
	<br/><br/><br/>
	 
	<input type="submit" value="Enviar">
	
	</form:form>
	

</body>
</html>
