package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.1 Leer el XML de configuracion
    //ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 1.2 Leer el Class de configuracion (ver 10) Lo comentamos arriba ya que ahora usamos la alternativa al xml que es el uso de una clase JAva (EmpleadosConfig_10)
    AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig_10.class);
		
		// 2. Pedir un Bean al contenedor
		
		/*
		Empleados_1 David = contexto.getBean("comercialExperimentado_2", Empleados_1.class); //llamamos al bean SIN Id (ver ComercialExperimentado_2)
		Empleados_1 Marta = contexto.getBean("comercialExperimentado_2", Empleados_1.class); //llamamos al bean SIN Id (ver ComercialExperimentado_2)
		
		
		//Singleton: vemos si apuntan al mismo objeto de memoria
		if (David==Marta) {
			System.out.println("Apuntan al mismo lugar de la memoria");
			System.out.println(David + "\n" + Marta);
		}
		else {
			System.out.println("NO apuntan al mismo lugar de la memoria");
			System.out.println(David + "\n" + Marta);
		}
		*/
		
		/*
		Empleados_1 empleado = contexto.getBean("directorFinanciero", Empleados_1.class);// con id del bean creado en EmpleadosConfig_10

		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		*/
		
		DirectorFinanciero_12 empleado = contexto.getBean("directorFinanciero", DirectorFinanciero_12.class);// con id del bean creado en EmpleadosConfig_10
		
		System.out.println("Email del director: " + empleado.getEmail());
		System.out.println("Nombre de la empresa: " + empleado.getNombreEmpresa());
		
		// 3. Cerrar el contexto
		contexto.close();

	}

}
