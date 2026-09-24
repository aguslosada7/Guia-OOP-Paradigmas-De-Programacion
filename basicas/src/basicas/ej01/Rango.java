package basicas.ej01;

import java.util.Objects;

public class Rango {
	private final double limiteInferior;
	private final double limiteSuperior;
	private final boolean abiertoAIzquierda;
	private final boolean abiertoADerecha;
	
	private Rango(double li, double ls, boolean abiertoAIzq, boolean abiertoADer) {
		limiteInferior = li;
		limiteSuperior = ls;
		abiertoAIzquierda = abiertoAIzq;
		abiertoADerecha = abiertoADer;
		
	}
	
	public static Rango crearIntervaloAbierto(double limiteInferior, double limiteSuperior) {
		return new Rango(limiteInferior, limiteSuperior, true, true);
	}
	
	public static Rango crearIntervaloCerrado(double limiteInferior, double limiteSuperior) {
		return new Rango(limiteInferior, limiteSuperior, false, false);
	}
	
	public static Rango crearIntervaloAbiertoAIzquierda(double limiteInferior, double limiteSuperior) {
		return new Rango(limiteInferior, limiteSuperior, true, false);
	}
	
	public static Rango crearIntervaloAbiertoADerecha(double limiteInferior, double limiteSuperior) {
		return new Rango(limiteInferior, limiteSuperior, false, true);
	}

	public double getLimiteInferior() {
		return limiteInferior;
	}

	public double getLimiteSuperior() {
		return limiteSuperior;
	}
	
	public boolean isAbiertoAIzquierda() {
		return abiertoAIzquierda;
	}

	public boolean isAbiertoADerecha() {
		return abiertoADerecha;
	}

	public boolean numeroSeEncuentraEnRango(double numero) {
		if((numero > limiteInferior && numero < limiteSuperior) || (numero == limiteInferior && abiertoAIzquierda == false) || (numero == limiteSuperior && abiertoADerecha == false)) {
			return true;
		}
		
		return false;
	}
	
	public boolean estaDentroDeOtroRango(Rango otroRango) {
		if((limiteInferior > otroRango.limiteInferior || (limiteInferior == otroRango.limiteInferior && otroRango.abiertoAIzquierda == false)) &&
		((limiteSuperior < otroRango.limiteSuperior) || (limiteSuperior == otroRango.limiteSuperior && otroRango.abiertoADerecha == false)))
			return true;
		
		return false;
	}
	
	public boolean intersecaConOtroRango(Rango otroRango) {
		if((limiteInferior > otroRango.limiteInferior && limiteInferior < otroRango.limiteSuperior) || (limiteInferior == otroRango.limiteInferior && !otroRango.abiertoAIzquierda) || (limiteInferior == otroRango.limiteSuperior && !otroRango.abiertoADerecha && !abiertoAIzquierda) ||
		(limiteSuperior > otroRango.limiteInferior && limiteSuperior < otroRango.limiteSuperior) || (limiteSuperior == otroRango.limiteInferior && !otroRango.abiertoAIzquierda && !abiertoADerecha) || (limiteSuperior == otroRango.limiteSuperior && !otroRango.abiertoADerecha))
			return true;
		
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Boolean.valueOf(abiertoADerecha), Boolean.valueOf(abiertoAIzquierda),
				Double.valueOf(limiteInferior), Double.valueOf(limiteSuperior));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rango other = (Rango) obj;
		return abiertoADerecha == other.abiertoADerecha && abiertoAIzquierda == other.abiertoAIzquierda
				&& Double.doubleToLongBits(limiteInferior) == Double.doubleToLongBits(other.limiteInferior)
				&& Double.doubleToLongBits(limiteSuperior) == Double.doubleToLongBits(other.limiteSuperior);
	}

	@Override
	public String toString() {
		return "Rango [limiteInferior=" + limiteInferior + ", limiteSuperior=" + limiteSuperior + ", abiertoAIzquierda="
				+ abiertoAIzquierda + ", abiertoADerecha=" + abiertoADerecha + "]";
	}
	
	public static Rango rangoQueAbarcaOtrosRangos(Rango rangos[]) {
		double minimoLimiteInferior = rangos[0].limiteInferior;
		double maximoLimiteSuperior = rangos[0].limiteSuperior;
		
		for (Rango rango : rangos) {
			if(rango.limiteInferior < minimoLimiteInferior)
				minimoLimiteInferior = rango.limiteInferior;
			
			if(rango.limiteSuperior > maximoLimiteSuperior)
				maximoLimiteSuperior = rango.limiteSuperior;
		}
		
		return Rango.crearIntervaloCerrado(minimoLimiteInferior, maximoLimiteSuperior);
	}
	
	public Rango sumarRangos(Rango otroRango) {
		if(abiertoAIzquierda && otroRango.abiertoADerecha)
			return Rango.crearIntervaloAbierto(limiteInferior, otroRango.limiteSuperior);
		
		else if(!abiertoAIzquierda && otroRango.abiertoADerecha)
			return Rango.crearIntervaloAbiertoADerecha(limiteInferior, otroRango.limiteSuperior);
			
		else if(abiertoAIzquierda && !otroRango.abiertoADerecha)
			return Rango.crearIntervaloAbiertoAIzquierda(limiteInferior, otroRango.limiteSuperior);
		
		else if(!abiertoAIzquierda && !otroRango.abiertoADerecha)
			return Rango.crearIntervaloCerrado(limiteInferior, otroRango.limiteSuperior);
		
		else
			return Rango.crearIntervaloAbierto(0, 0);
	}
	
	public Rango rangoInterseccion(Rango otroRango) {
		// Los primeros dos if cubren los casos en los que un intervalo está dentro de otro
		
		if((limiteInferior > otroRango.limiteInferior || (limiteInferior == otroRango.limiteInferior && otroRango.abiertoAIzquierda == false)) &&
		((limiteSuperior < otroRango.limiteSuperior) || (limiteSuperior == otroRango.limiteSuperior && otroRango.abiertoADerecha == false))) {
			if(abiertoAIzquierda && abiertoADerecha)
				return Rango.crearIntervaloAbierto(limiteInferior, limiteSuperior);
			
			else if(!abiertoAIzquierda && abiertoADerecha)
				return Rango.crearIntervaloAbiertoADerecha(limiteInferior, limiteSuperior);
				
			else if(abiertoAIzquierda && !abiertoADerecha)
				return Rango.crearIntervaloAbiertoAIzquierda(limiteInferior, limiteSuperior);
			
			else
				return Rango.crearIntervaloCerrado(limiteInferior, limiteSuperior);
		}
		
		else if((otroRango.limiteInferior > limiteInferior || (limiteInferior == otroRango.limiteInferior && abiertoAIzquierda == false)) &&
		((otroRango.limiteSuperior < limiteSuperior) || (limiteSuperior == otroRango.limiteSuperior && abiertoADerecha == false))) {
			if(otroRango.abiertoAIzquierda && otroRango.abiertoADerecha)
				return Rango.crearIntervaloAbierto(otroRango.limiteInferior, otroRango.limiteSuperior);
			
			else if(!otroRango.abiertoAIzquierda && otroRango.abiertoADerecha)
				return Rango.crearIntervaloAbiertoADerecha(otroRango.limiteInferior, otroRango.limiteSuperior);
				
			else if(otroRango.abiertoAIzquierda && !otroRango.abiertoADerecha)
				return Rango.crearIntervaloAbiertoAIzquierda(otroRango.limiteInferior, otroRango.limiteSuperior);
			
			else
				return Rango.crearIntervaloCerrado(otroRango.limiteInferior, otroRango.limiteSuperior);
		}
		
		else if((limiteInferior > otroRango.limiteInferior && limiteInferior < otroRango.limiteSuperior) || (limiteInferior == otroRango.limiteInferior && !otroRango.abiertoAIzquierda) || (limiteInferior == otroRango.limiteSuperior && !otroRango.abiertoADerecha && !abiertoAIzquierda)) {
			if(abiertoAIzquierda && otroRango.abiertoADerecha)
				return Rango.crearIntervaloAbierto(limiteInferior, otroRango.limiteSuperior);
			
			else if(!abiertoAIzquierda && otroRango.abiertoADerecha)
				return Rango.crearIntervaloAbiertoADerecha(limiteInferior, otroRango.limiteSuperior);
				
			else if(abiertoAIzquierda && !otroRango.abiertoADerecha)
				return Rango.crearIntervaloAbiertoAIzquierda(limiteInferior, otroRango.limiteSuperior);
			
			else
				return Rango.crearIntervaloCerrado(limiteInferior, otroRango.limiteSuperior);
		}
		
		else if((limiteSuperior > otroRango.limiteInferior && limiteSuperior < otroRango.limiteSuperior) || (limiteSuperior == otroRango.limiteInferior && !otroRango.abiertoAIzquierda && !abiertoADerecha) || (limiteSuperior == otroRango.limiteSuperior && !otroRango.abiertoADerecha)) {
			if(otroRango.abiertoAIzquierda && abiertoADerecha)
				return Rango.crearIntervaloAbierto(otroRango.limiteInferior, limiteSuperior);
			
			else if(!otroRango.abiertoAIzquierda && abiertoADerecha)
				return Rango.crearIntervaloAbiertoADerecha(otroRango.limiteInferior, limiteSuperior);
				
			else if(otroRango.abiertoAIzquierda && !abiertoADerecha)
				return Rango.crearIntervaloAbiertoAIzquierda(otroRango.limiteInferior, limiteSuperior);
			
			else
				return Rango.crearIntervaloCerrado(otroRango.limiteInferior, limiteSuperior);
		}
		
		return Rango.crearIntervaloAbierto(0, 0);
	}
	
	public Rango desplazarConEscalar(double escalar) {
		if(abiertoAIzquierda && abiertoADerecha)
			return Rango.crearIntervaloAbierto(limiteInferior + escalar, limiteSuperior + escalar);
		
		else if(!abiertoAIzquierda && abiertoADerecha)
			return Rango.crearIntervaloAbiertoADerecha(limiteInferior + escalar, limiteSuperior + escalar);
			
		else if(abiertoAIzquierda && !abiertoADerecha)
			return Rango.crearIntervaloAbiertoAIzquierda(limiteInferior + escalar, limiteSuperior + escalar);
		
		else
			return Rango.crearIntervaloCerrado(limiteInferior + escalar, limiteSuperior + escalar);
	}
}
