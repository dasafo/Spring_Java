package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Creacion de un archivo de configuración que haga el mismo papel que el applicationContext.xml

@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
@PropertySource("classpath:datosEmpresa.propiedades") //para indicar el archivo externo
public class EmpleadosConfig_10 {
	
	// Definiomos el Bean para el InformeFinancieroDtoCompras_11
	@Bean
	public CreacionInformeFinanciero_4 informeFinancieroDtoCompras() { //será el Id el bean
		
		return new InformeFinancieroDtoCompras_11();
	}
	
	// Definiomos el Bean para el DirectorFinanciero_12 e inyectar dependencias
	@Bean
	public Empleados_1 directorFinanciero() {//será el Id el bean
		
		return new DirectorFinanciero_12(informeFinancieroDtoCompras());
    //aqui hemos inyecatado informeFinancieroDtoCompras definido en el di del otro bean
	}

}
