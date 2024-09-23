package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1_5 implements CreacionInformeFinanciero_4 {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación del informe financiero del Trimestre 1";
	}

}
