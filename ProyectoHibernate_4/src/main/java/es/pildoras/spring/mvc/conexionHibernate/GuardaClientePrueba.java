package es.pildoras.spring.mvc.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class GuardaClientePrueba {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void guardarCliente() {
        // Obtener la sesión actual
        Session miSession = sessionFactory.getCurrentSession();

        try {
            // 1. Crear Objeto Clientes
            Clientes cliente1 = new Clientes("Alina", "Salas", "Leipzig");

            // 2. Guardar el objeto en la BBDD
            miSession.save(cliente1);

            System.out.println("Registro insertado correctamente en la BBDD!!");

            // 3. Lectura de Registro ID
            System.out.println("Lectura del registro con Id: " + cliente1.getId());

            // 4. Lectura de todos los campos del cliente insertado
            Clientes clienteInsertado = miSession.get(Clientes.class, cliente1.getId());

            System.out.println("Registro: " + clienteInsertado);

            System.out.println("Terminado!!");
        } finally {
            // No se necesita cerrar la sesión manualmente, ya que Spring lo gestiona.
        }
    }
}
