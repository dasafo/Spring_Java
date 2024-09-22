package es.pildoras.IoC;

public class SecretarioEmpleado_4 implements Empleados_3 {
	
	// 2. Creacion de SETTER para la inyeccion de DEPENDENCIAS (ver 5 y 6)
  // Aqui usamos un setter en vez de un constructor como hemos hecho antes
	private CreacionInformes_6 informeNuevo;

	public void setInformeNuevo(CreacionInformes_6 informeNuevo) {
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
	
	//-------------------------------------------------------------

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Los secretarios gestionan las agendas de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Secretario: " + informeNuevo.getInforme();
	}

}
