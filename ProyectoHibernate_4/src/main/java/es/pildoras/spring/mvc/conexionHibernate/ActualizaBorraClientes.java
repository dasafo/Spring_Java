package es.pildoras.spring.mvc.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ActualizaBorraClientes {

    @Autowired
    private SessionFactory sessionFactory; // Inyecta el SessionFactory para crear sesiones de Hibernate

    @Transactional
    public void actualizarOBorrarClientes() {
        // Obtener la sesión actual de Hibernate gestionada por Spring
        Session miSession = sessionFactory.getCurrentSession();

        try {
            // -------------- ACTUALIZAR REGISTROS --------------------

            // ------ 1a forma: Actualizar un cliente con ID 4
            // Comentado para ilustrar la primera forma de actualización.
            // Se obtiene un cliente específico por su ID, se modifica un campo y luego se guarda.
            /*
            int clienteId = 4; // ID del cliente a actualizar
            miSession.beginTransaction(); // Inicia una transacción (innecesario si ya se usa @Transactional)
            Clientes miCliente = miSession.get(Clientes.class, clienteId); // Obtiene el cliente con el ID especificado
            miCliente.setDireccion("Covandonga"); // Cambia la dirección del cliente
            */

            // ------- 2a forma: Actualizar apellidos de clientes cuyo apellido comience con 'S'
            // Se realiza una actualización en masa usando una consulta HQL.
            /*
            miSession.beginTransaction(); // Inicia una transacción (innecesario si ya se usa @Transactional)
            miSession.createQuery("update Clientes set apellidos='Forns' where apellidos LIKE 'S%'")
                      .executeUpdate(); // Actualiza los apellidos de todos los clientes que cumplen la condición
            */

            // -------------- BORRAR REGISTROS --------------------
            // Borrar clientes cuya dirección sea 'Leipzig'
            miSession.beginTransaction(); // Inicia una transacción para eliminar registros
            miSession.createQuery("delete Clientes where direccion='Leipzig'")
                      .executeUpdate(); // Borra todos los clientes cuya dirección sea 'Leipzig'

            // --------------------------------------

            // Confirma (commit) la transacción para que los cambios persistan en la base de datos
            miSession.getTransaction().commit();

            // Mensaje de éxito al finalizar la operación
            System.out.println("Registro actualizado o eliminado correctamente en la BBDD!!");
        } finally {
            // No se necesita cerrar la sesión manualmente, ya que Spring lo gestiona automáticamente
        }
    }
}
