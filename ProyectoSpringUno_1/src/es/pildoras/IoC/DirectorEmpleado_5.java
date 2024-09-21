package es.pildoras.IoC;

public class DirectorEmpleado_5 implements Empleados_3 {

	// 2. Creacion del contructor para la inyeccion de DEPENDENCIAS (ver 5 y 6)
	private CreacionInformes_6 informeNuevo;

	public DirectorEmpleado_5(CreacionInformes_6 informeNuevo) {

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

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Dirige a la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

	// -------------------------Ciclo de Vida (ver UsoCicloVidaBean_9)-----------------------------------

	// Metodo init. Ejecutar tareas antes de que el Bean este disponible
	public void metodoInicial() {
		System.out.println("Dentro del método Init. Aquí irían las tareas a ejecutar antes de usar el Bean");

	}

	// Metodo destroy. Ejecutar tareas despues de que el Bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del método Destroy. Aquí irían las tareas a ejecutar después de usar el Bean");

	}
	// --------------------------------------------------------------------------------------------

}
