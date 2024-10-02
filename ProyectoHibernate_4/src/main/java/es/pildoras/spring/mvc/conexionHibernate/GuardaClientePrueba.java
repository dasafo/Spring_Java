package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Ver BBDD_InsertarRegirstro.png

public class GuardaClientePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Crear SessionFactory
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();

		// 2. Crear Objeto Session
		Session miSession = miFactory.openSession();
		
		try {
		
		// 3. Crear Objeto Clientes
			Clientes cliente1 = new Clientes("Alina", "Salas", "Leipzig");
		
		// 4. Ejecutamos la transaccion SQL
			miSession.beginTransaction();
			
		// 5. Comenzamos la transacción
			miSession.save(cliente1);
			
		// 6. Guardar Objeto en la BBDD
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en la BBDD!!");
			
		// Lectura de Registro ID
			miSession.beginTransaction(); //ejecutamos una nueva transaccion porque con el commit anterior ya habia terminado
			System.out.println("Lectura del registro con Id: " + cliente1.getId());
			
		// Lectura de todos los campos del cliente insertado
			Clientes clienteInsertado = miSession.get(Clientes.class, cliente1.getId());
			
			System.out.println("Registro: " + clienteInsertado);
			
			miSession.getTransaction().commit();

			System.out.println("Terminado!!");
			
			
			
			miSession.close(); //cerramos la session
			
			
		}finally{
			
			miFactory.close(); //cerramos la SessionFactory
		}
		
	}

}
