package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizaBorraClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Crear SessionFactory
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class)
				.buildSessionFactory();

		// 2. Crear Objeto Session
		Session miSession = miFactory.openSession();

		try {
			// -------------- ACTUALIZAR REGISTROS --------------------

			// ------ 1a forma
			/*
			 int ClienteId = 4;
			 
			 miSession.beginTransaction();
			 
			 Clientes miCliente = miSession.get(Clientes.class, ClienteId);
			 
			 miCliente.setDireccion("Covandonga"); 
			 */

			// ------- 2a forma
			/*
			miSession.beginTransaction();

			miSession.createQuery("update Clientes set Apellidos='Forns' where Apellidos LIKE 'S%'").executeUpdate();
			*/
			
			// -------------- BORRAR REGISTROS --------------------
			miSession.beginTransaction();

			miSession.createQuery("delete Clientes where Direccion='Leipzig'").executeUpdate();

			// --------------------------------------

			miSession.getTransaction().commit();

			System.out.println("Registro actualizado o eliminado correctamente en la BBDD!!");

			miSession.close(); // cerramos la session

		} finally {

			miFactory.close(); // cerramos la SessionFactory
		}

	}

}
