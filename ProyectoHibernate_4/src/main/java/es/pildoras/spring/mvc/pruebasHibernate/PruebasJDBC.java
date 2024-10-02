package es.pildoras.spring.mvc.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl = "jdbc:postgresql://localhost:5432/pruebashibernate?ssl=false";
		String usuario = "pildoras";
		String contra = "freedom85";
		
		try {
			System.out.println("Cargando el driver de PostgreSQL...");
      Class.forName("org.postgresql.Driver");
			System.out.println("Intentando conectar con la BBDD: " + jdbcUrl);
			
			Connection miConexion = DriverManager.getConnection(jdbcUrl, usuario, contra);
			
			System.out.println("Conexión exitosa!!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

}
