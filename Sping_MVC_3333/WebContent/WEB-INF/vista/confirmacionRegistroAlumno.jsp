<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <!-- Ver  https://www.javatpoint.com/spring-mvc-form-tag-library
  
 	ver imagen MVC_Tags.png
 	Alumno.java, AlumnoController.java, alumnoRegistroFormulario.jsp, confirmacionRegistroAlumno.jsp
    y como pagina de inicio paginaEjemplo.jsp
    -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmación de Registro</title>
</head>
<body>

El alumno con nombre <strong>${elAlumno.nombre}</strong>, apellido <strong>${elAlumno.apellido}</strong>, edad <strong>${elAlumno.edad}</strong> años, E-Mail <strong>${elAlumno.email}</strong> y C.P <strong>${elAlumno.codigoPostal}</strong>, se ha registrado con éxito!!
<br/><br/>
La asignatura escogida es: <strong>${elAlumno.optativa}</strong>.
<br/><br/>
La ciudad donde iniciará los estudios <strong>${elAlumno.nombre} ${elAlumno.apellido}</strong> es <strong>${elAlumno.ciudadEstudios}</strong>.
<br/><br/>
Los idiomas escogidos por el alumno son: <strong>${elAlumno.idiomasAlumno}</strong>.

</body>
</html>