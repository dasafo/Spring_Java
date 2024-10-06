package es.pildoras.spring.mvc.conexionHibernate;

import es.pildoras.spring.mvc.conexionHibernate.Clientes;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ConsultaClientes {

    @Autowired
    private SessionFactory sessionFactory; // Inyecta el SessionFactory para crear sesiones de Hibernate

    @Transactional
    public void consultarClientes() {
        // Obtener la sesión actual de Hibernate gestionada por Spring
        Session miSession = sessionFactory.getCurrentSession();

        try {
            // Comenzamos la transacción (esto es gestionado automáticamente por Spring debido a la anotación @Transactional)
            miSession.beginTransaction();

            // Consulta de todos los clientes en la base de datos
            List<Clientes> losClientes = miSession.createQuery("from Clientes", Clientes.class).getResultList();

            // Mostrar todos los clientes obtenidos de la consulta
            recorreClientesConsultados(losClientes);

            System.out.println(" ");

            // Consulta 1: obtener todos los clientes cuyo apellido sea 'Salas'
            losClientes = miSession.createQuery("from Clientes cl where cl.apellidos='Salas'", Clientes.class).getResultList();
            recorreClientesConsultados(losClientes);

            System.out.println(" ");

            // Consulta 2: obtener todos los clientes cuyo apellido sea 'Moreno' o cuya dirección sea 'Universitas'
            losClientes = miSession.createQuery("from Clientes cl where cl.apellidos='Moreno' or cl.direccion='Universitas'", Clientes.class).getResultList();
            recorreClientesConsultados(losClientes);

        } finally {
            // No se necesita cerrar la sesión manualmente, ya que Spring lo gestiona automáticamente
        }
    }

    // Método auxiliar para recorrer y mostrar los clientes consultados
    private static void recorreClientesConsultados(List<Clientes> losClientes) {
        for (Clientes unCliente : losClientes) {
            System.out.println(unCliente); // Imprime los detalles del cliente
        }
    }
}
