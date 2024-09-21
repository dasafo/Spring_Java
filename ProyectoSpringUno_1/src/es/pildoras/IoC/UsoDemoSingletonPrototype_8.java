package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Cargamos el archivo xml applicationContext2.xml - Crear el Contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// 2. Pedir el Bean al contenedor Spring (el xml) para el modelo SINGLETON
		/*
		SecretarioEmpleado_4 David = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado_4.class);
		SecretarioEmpleado_4 Rosa = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado_4.class);
		*/
		
		// 2. Pedir el Bean al contenedor Spring (el xml) para el modelo PROTOTYPE
		SecretarioEmpleado_4 David = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado_4.class);
		SecretarioEmpleado_4 Rosa = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado_4.class);
		
		System.out.println(David);
		System.out.println(Rosa);
		
		if(David==Rosa) System.out.println("Ambos beans apuntan al mismo objeto (Tienen la misma dirección en la memoria)");
		else System.out.println("Ambos beans NO apuntan al mismo objeto (tienen distinta dirección en la memoria)");
		
		
	}

}
