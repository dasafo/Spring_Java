package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4_8 implements CreacionInformeFinanciero_4 {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación de informe del trimestre 4 - Cierre de Año";
	}

}
