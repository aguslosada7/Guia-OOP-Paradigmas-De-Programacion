package objetos.ej06;

public class Cerradura {
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean seEncuentraAbierta;
	private int aperturasFallidas;
	private int aperturasExitosas;
	private int aperturasFallidasConsecutivas;
	
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		if(cantidadDeFallosConsecutivosQueLaBloquean > 0) {
			this.claveDeApertura = claveDeApertura;
			this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		}
	}

	public boolean abrir(int clave) {
		if(clave == claveDeApertura && aperturasFallidasConsecutivas < cantidadDeFallosConsecutivosQueLaBloquean) {
			seEncuentraAbierta = true;
			aperturasExitosas++;
			aperturasFallidasConsecutivas = 0;
			return true;
		}
		
		else {
			aperturasFallidasConsecutivas++;
			aperturasFallidas++;
			return false;
		}
	}

	public void cerrar() {
		seEncuentraAbierta = false;
	}

	public boolean estaAbierta() {
		if(seEncuentraAbierta == true)
			return true;
		
		return false;
	}

	public boolean estaCerrada() {
		if(seEncuentraAbierta == false)
			return true;
		
		return false;
	}

	public boolean fueBloqueada() {
		if(aperturasFallidasConsecutivas >= cantidadDeFallosConsecutivosQueLaBloquean)
			return true;
		
		return false;
	}

	public int contarAperturasExitosas() {
		return aperturasExitosas;
	}

	public int contarAperturasFallidas() {
		return aperturasFallidas;
	}

	public int getClaveDeApertura() {
		return claveDeApertura;
	}

	public int getCantidadDeFallosConsecutivosQueLaBloquean() {
		return cantidadDeFallosConsecutivosQueLaBloquean;
	}
}
