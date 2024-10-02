package es.pildoras.conexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear SessionFactory
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class)
				.buildSessionFactory();

		// Crear Objeto Session
		Session miSession = miFactory.openSession();

		try {

			// Comenzamos la sesión
			miSession.beginTransaction();

			// Consulta de Clientes
			List<Clientes> losClientes = miSession.createQuery("from Clientes").getResultList();
			
			// Mostrar clientes
			recorreClientesConsultados(losClientes);
			
			System.out.println(" ");

			// Consulta 1: dame los Salas
			losClientes = miSession.createQuery("from Clientes cl where cl.apellidos='Salas'").getResultList();
			
			recorreClientesConsultados(losClientes);
			
			System.out.println(" ");
			
			// Consulta 2: Muestra los que viven en Universitas
			losClientes = miSession.createQuery("from Clientes cl where cl.apellidos='Moreno' or cl.direccion='Universitas'").getResultList();

			recorreClientesConsultados(losClientes);
			
			//commit
			miSession.getTransaction().commit();
			
			miSession.close(); //cerramos la session

		} finally {

			miFactory.close(); // cerramos la SessionFactory
		}

	}

	private static void recorreClientesConsultados(List<Clientes> losClientes) {
		for (Clientes unCliente:losClientes) {
			System.out.println(unCliente);
		}
	}

}
