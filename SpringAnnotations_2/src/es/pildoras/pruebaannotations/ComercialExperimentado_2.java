package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//------------Creamos un JAva Annotations--------

//@Component("ComercialExperimentado")
//No tiene poque coincidir el id con el nombre de la clase, pero es mas facil
//Podemos prescindir de poner el id ComercialExperimentado a la anotacion, pero entonces 
//cuando hacemos la llamada al Bean (Paso 2 en UsoAnnotations_3) tendremos que poner el
//nombre de la clase con la primera palabra en minuscula "comercialExperimentado_2"

@Component
//@Scope("prototype") //o no se pone @Scope = "singleton" si queremos que apunte todo a una memoria solo
public class ComercialExperimentado_2 implements Empleados_1, InitializingBean, DisposableBean {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub

		// return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	
	// ------------------------------- @Autowide -----------------------------------

	// Uso de anotacion @Autowide (ver 4 y 5). Busca en todo el proyecto si hay una
	// clase que implemente en este caso la clase CreacionInformeFinanciero_4, y cuando la
	// encuentra es desde esa clase que realiza la inyeccion de dependencia
	
	// 1. Usando un constructor
	/*
	 private CreacionInformeFinanciero_4 nuevoInforme;
	 @Autowired 
	 @Qualifier("informeFinancieroTrim1_5") //cuando tenemos varias clases hay que indicar(primera palabra en minuscula)
	 public ComercialExperimentado_2(CreacionInformeFinanciero_4 nuevoInforme) { 
	 	 this.nuevoInforme = nuevoInforme; 
	 }
	 */
		
	// 2. Usando un SETTER (también vale para un metodo cualquiera)
	/*
	private CreacionInformeFinanciero_4 nuevoInforme;
	@Autowired
    @Qualifier("informeFinancieroTrim2_6") //cuando tenemos varias clases hay que indicar(primera palabra en minuscula)
	public void setNuevoInforme(CreacionInformeFinanciero_4 nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/
	
	// 3. Solo poniendolo en el campo encapuslado tambien vale
	@Autowired
	@Qualifier("informeFinancieroTrim3_7") //cuando tenemos varias clases hay que indicar(primera palabra en minuscula)
	private CreacionInformeFinanciero_4 nuevoInforme;
	
	
	// -------------------------- Ciclo vida Beans ------------------------------
	// Priemro hay que añadir las Interfaces InitializingBean y DisposableBean a nuestra clase prinicpal
	// Despues hay que implementar sus metodos destryo() y afterPropertiesSet()
	
	// Ejecucion de código despues de crear un Bean
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando antes de la destrucción");
		
	}
	
	// Ejecucion despues del apagado del contenedor Spring
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Ejecutando tras la creación del Bean");
		
	}
}
