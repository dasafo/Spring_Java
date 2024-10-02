package es.pildoras.spring.mvc.validacionespersonalizadas;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;


//ver https://www.baeldung.com/spring-mvc-custom-validator

@Constraint(validatedBy=CPostalMadridValidacion.class) //futura clase que contendra la logica de la validacion personalizada
@Target({ElementType.METHOD, ElementType.FIELD}) //destino de nuestra validacion a metodos o campos
@Retention(RetentionPolicy.RUNTIME) //chequea la anotacion en tiempo de ejecucion
public @interface CPostalMadrid {
	
	//Definimos el CP por defecto
	public String value() default "28";
	
	//Definimos el mensaje de error
	public String message() default "El CP debe comenzar por 28!!";
	
	//Definimos los grupos, para que valide el formulario paso a paso(o por grupos), no todo a la vez
  //cada casilla q se rellena se valida.
	Class<?>[] groups() default {};
	
	//Definimos los Payloads, que contiene los datos que pueden ser almacenados(metadatos)
	Class<? extends Payload>[] payload() default {};
}
