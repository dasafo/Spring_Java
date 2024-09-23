package es.pildoras.spring.mvc.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String>{

	@Override
    public void initialize(CPostalMadrid elCodigo) {
		prefijoCodigoMadrid=elCodigo.value();   //almacenamos el 28 en nuestro caso (ver CPostalMadridValidacion.java)
	}
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) { //en arg0 guarda el CP que introduce el usuario
		// TODO Auto-generated method stub
		
		boolean valCodigo;
		
		if(arg0!=null) valCodigo=arg0.startsWith(prefijoCodigoMadrid);
		else return valCodigo=true;
		
		return valCodigo;
	}
	
	//creamos un campo donde que rescate el prefijo que hemos fijado en CPostalMadridValidacion.java
	private String prefijoCodigoMadrid;
	

}
