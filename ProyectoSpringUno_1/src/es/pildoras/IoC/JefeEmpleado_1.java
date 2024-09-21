package es.pildoras.IoC;

public class JefeEmpleado_1 implements Empleados_3 {

	// 2. Creacion del contructor para la inyeccion de DEPENDENCIAS (ver 5 y 6)
	private CreacionInformes_6 informeNuevo;

	public JefeEmpleado_1(CreacionInformes_6 informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	// 2. Creacion de SETTERS y GETTERS para la inyeccion de CAMPOS/atributos
	private String email;
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	// -------------------------------------------------------------

	
	public String getTareas() {

		return "Gestiono las cuestiones relativas a mis empleado desde seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Jefe: " + informeNuevo.getInforme();
	}

}
