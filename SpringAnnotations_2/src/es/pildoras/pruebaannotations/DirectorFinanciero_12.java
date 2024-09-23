package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero_12 implements Empleados_1 {
	
	private CreacionInformeFinanciero_4 informeFinanciero;

	public DirectorFinanciero_12(CreacionInformeFinanciero_4 informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}


	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestión y dirección de las operaciones fiancieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	// ------ Añadimos propiedades del achivo externo datosEmpresa.propiedades ------- 
  @Value("${email}") //indicamos el valor del campo del archivo externo 
  private String email; 
  @Value("${nombreEmpresa}") //indicamos el valor del campo del archivo externo 
  private String nombreEmpresa;
	
	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	//----------------------------------------------------------------------------------------
	

}
