package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*
		// Creacion de objetos de tipo Empleado

		Empleados_3 Empleado1 = new JefeEmpleado_1();
		Empleados_3 Empleado2 = new SecretarioEmpleado_4();
		Empleados_3 Empleado3 = new DirectorEmpleado_5();

		// Uso de los objetos creados

		System.out.println(Empleado1.getTareas());
		System.out.println(Empleado2.getTareas());
		System.out.println(Empleado3.getTareas());
		
*/		
		
		// 1. Cargamos el archivo xml applicationContext.xml - Crear el Contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Pedir el Bean al xml
    // Ejemplo para un Constructor que hemos llamado en el bean del xml miJefeEmpleado
		Empleados_3 Juan = contexto.getBean("miJefeEmpleado", Empleados_3.class);
    // Ejemplo para un setter que hemos llamado en el bean del xml miSecretarioEmpleado
		Empleados_3 Maria = contexto.getBean("miSecretarioEmpleado", Empleados_3.class);
		

    // Ejemplo para inyecciones desde campos
		SecretarioEmpleado_4 David = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado_4.class);
		DirectorEmpleado_5 Paula = contexto.getBean("miDirectorEmpleado", DirectorEmpleado_5.class);
		JefeEmpleado_1 Rosa = contexto.getBean("miJefeEmpleado", JefeEmpleado_1.class);


		// 3. Utilizar el Bean
		System.out.println("-Inyección de dependencias con constructor:");
		System.out.println(Juan.getTareas());	
		System.out.println(Juan.getInforme());
		
		System.out.println("");
		
		System.out.println("-Inyección de dependencias con Setters:");
		System.out.println(Maria.getTareas());	
		System.out.println(Maria.getInforme());
		
		System.out.println("");
		
		System.out.println("-Inyección de Campos o atributos con Setters y Getters:");
		System.out.println("Email: " + David.getEmail());
		System.out.println("Email: " + Rosa.getNombreEmpresa());
		
		System.out.println("");
		
		System.out.println("-Inyección de Campos o atributos desde archivo de propiedades(datosEmpresa.propiedades):");
		System.out.println("Email: " + Paula.getEmail());

		// 4. Cerrar el Contexto xml
		contexto.close();
	}

}
