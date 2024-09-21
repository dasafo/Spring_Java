package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Cargamos el archivo xml applicationContext3.xml - Crear el Contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		// 2. Pedir el Bean al xml
		Empleados_3 Juan = contexto.getBean("miDirectorEmpleado", Empleados_3.class);
		
		System.out.println(Juan.getInforme());
		
		// 3. Cerrar el contexto
		contexto.close();

	}

}
