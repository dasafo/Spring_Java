package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2_6 implements CreacionInformeFinanciero_4 {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación del informe catástrofico del informe del trimestre 2";
	}

}
