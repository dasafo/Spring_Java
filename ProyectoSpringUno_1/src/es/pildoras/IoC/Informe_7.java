package es.pildoras.IoC;

//Inyeccion de dependencias
//1. Creación de clase (Informa_7) e interfaz(CreacionInformes_6.java) para la dependencia

public class Informe_7 implements CreacionInformes_6 {

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Esta es la presentación del informe";
	}

}
