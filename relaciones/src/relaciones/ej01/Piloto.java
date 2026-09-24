package relaciones.ej01;

public class Piloto {
	private String nombre;
	private int numeroDeLicencia;
	
	public Piloto(String nombre, int numeroDeLicencia) {
		this.nombre = nombre;
		this.numeroDeLicencia = numeroDeLicencia;
	}

	@Override
	public String toString() {
		return "Piloto [nombre: " + nombre + ", numeroDeLicencia: " + numeroDeLicencia + "]";
	}
}
