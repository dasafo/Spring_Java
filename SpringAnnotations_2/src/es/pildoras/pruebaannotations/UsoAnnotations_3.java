package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Leer el XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Pedir un Bean al contenedor(ahora con JAva Annotations
    // creado en ComercialExperimentado poniendo @Component)

		//llamamos al bean por su Id (ver ComercialExperimentado_2)
    //Empleados_1 David = contexto.getBean("ComercialExperimentado", Empleados_1.class); 

    //llamamos al bean SIN Id (ver ComercialExperimentado_2)
    Empleados_1 David = contexto.getBean("comercialExperimentado_2", Empleados_1.class); 

		// 3. Usar el Bean
		System.out.println(David.getInforme());
		System.out.println(David.getTareas());
				
		// 4. Cerrar el contexto
		contexto.close();

	}

}
