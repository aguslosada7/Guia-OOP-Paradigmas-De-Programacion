package basicas.ej01;

import java.util.Comparator;

public class CompararRangosPorInicio implements Comparator<Rango> {

	@Override
	public int compare(Rango o1, Rango o2) {
		// Primero se comparan los límites inferiores
		int res = Double.compare(o1.getLimiteInferior(), o2.getLimiteInferior());
		
		// Si coinciden
		if(res == 0) {
			// Se comparan los límites superiores
			res = Double.compare(o1.getLimiteSuperior(), o2.getLimiteSuperior());
			
			// Si son iguales, se desempata con el tipo de intervalos (true tiene mayor valor que false)
			if(res == 0) {
				res = Boolean.compare(o1.isAbiertoAIzquierda(), o2.isAbiertoAIzquierda());
				
				if(res == 0)
					res = Boolean.compare(o1.isAbiertoADerecha(), o2.isAbiertoADerecha());
			}
		}
		
		return res;
	}
}
